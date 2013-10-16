package org.correttouml.uml2zot.semantics;

import java.util.ArrayList;

import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.iod.IOD;
import org.correttouml.uml.diagrams.sequencediagram.InteractionOperand;
import org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram;
import org.correttouml.uml2zot.semantics.classdiagram.SClassDiagram;
import org.correttouml.uml2zot.semantics.iod.SIOD;
import org.correttouml.uml2zot.semantics.property.SProperty;
import org.correttouml.uml2zot.semantics.sequencediagram.SCombine;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.Config;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.combine;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.loop;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.what;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.trio.AlwF_e;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.Yesterday;


public class SMadesModel {

	public static final Predicate SYSTEMSTART = new Predicate("MADESYSTEMSTART");
	
	/** The semantic decorators */
	private MadesModel mm;
	
	/** Takes the MADES model to which we are giving semantics */
	public SMadesModel(MadesModel mm){
		this.mm=mm;
	}
	
    public String getSemantics() {
        String s = "";
        
        //Class diagram semantics
        s=s+printSeparator("CLASS DIAGRAM");
        s = s + new SClassDiagram(this.mm.getClassdiagram()).getSemantics();
        
        //Sequence Diagram semantics
        s=s+printSeparator("SEQUENCE DIAGRAMS");
        Config config = new Config(combine.WS, loop.WS, what.NONDETERMINISTICALLY);
        for(SequenceDiagram sd: this.mm.getSequenceDiagrams()){
        	s=s+printSeparator("SD " + sd.getName());
        	SCombine scf = new SCombine(new InteractionOperand(sd.getCombinedFragments().get(0).getOperands().get(0)));////////////////////////////////////////////////////////////////####del me
        	ArrayList<BooleanFormulae> bf = scf.getFormula();
        	s=s+new SSequenceDiagram(sd, config).getSemantics();
        }
        
        //IODs semantics
        s=s+printSeparator("IODs");
        for(IOD iod: this.mm.getIODs()){
        	s=s+printSeparatorSmall("IOD " + iod.getName());
        	s=s+new SIOD(iod).getSemantics();
        }
        
        s = s + "\n";
        return s;
    }

    public static String printSeparator(String name) {
        return ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n"
                + ";; " + name + " \n"
                + ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n";
    }
    
    public static String printSeparatorSmall(String name) {
        return printSeparatorSmall(name, true);
    }
    
    /** Print a small separator. If we use false, we do not add a space before */
    public static String printSeparatorSmall(String name, boolean space) {
        String r="";
        if(space) r=r+"\n";
        r=r+";;"+name+"\n";
    	return r;
    }

    public String getVariableDeclarationsForae2zot() {
        String s="";
        for(org.correttouml.uml2zot.semantics.util.trio.TrioVar t: org.correttouml.uml2zot.semantics.util.trio.TrioVar.instances){
            if(t.getType()==org.correttouml.uml.diagrams.expressions.PrimitiveType.INTEGER)
                s = s + "(define-tvar '" + t.getVariableName() + " *int*)" + "\n";
            else if(t.getType()==org.correttouml.uml.diagrams.expressions.PrimitiveType.REAL)
                s = s + "(define-tvar '" + t.getVariableName() + " *real*)" + "\n";
        }
        return s;
    }

	public String getInitAxiom() {
		String sem="";
		
		//The MADESSYSTEMSTART predicate holds only on the first time instant
		sem=sem+new Yesterday(new And(SMadesModel.SYSTEMSTART, new AlwF_e(new Not(SMadesModel.SYSTEMSTART))))+"\n";
		
		//Class Diagram Initialization
        sem=sem+printSeparator("CLASS DIAGRAM INITIALIZATION");
        sem = sem + new SClassDiagram(this.mm.getClassdiagram()).getInitializationSemantics();
		
		return sem;
	}

	public boolean hasProperty() {
		return this.mm.hasProperty();
	}

	public BooleanFormulae getProperty() {
		return new SProperty(this.mm.getProperty()).getSemantics();
	}    
	
	
}
