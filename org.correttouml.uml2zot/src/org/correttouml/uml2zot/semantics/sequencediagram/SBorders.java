
package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.Since_ei;
import org.correttouml.uml2zot.semantics.util.trio.Until_ei;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SBorders implements BooleanFormulae, MetaBooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[borders].docx
	Predicate module; //ev1 (which can be more complex than atomic event(m1_Start), like (m1_Start && SDX_CF_X_Op1_Start))
	private String comment = "";
    BooleanFormulae exception; //if ev1 happens it has to be followed by ev2 and if ev2 happens it has to be preceded by ev1 except we have exception between them.  

    public SBorders(Predicate module, BooleanFormulae exception){
        this.module = module;
        this.exception = exception;
    }

    public SBorders(Predicate module, BooleanFormulae exception, String comment){
        this.module = module;
        this.exception = exception;
        this.comment = comment;
    }
    
	/*
	 * module <=> (module_Start || since_ei(!!(module_End || exception), module_Start))  //Assures that we have (module = True) when it is active, i.e. some events are happening inside its borders.
	 * module_Start => until_ei(!!module_Start, (module_End || exception)) //Assures that we cannot have more than one module_Start, when module is true.
	 */

    @Override
    public String toString() {
    	String s = "";
    	for (BooleanFormulae f: getFormulae())
    		s += f.toString() + "\n";
    	return s;
	}
    
	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getComment() {
		return this.comment;
	}
    
	public BooleanFormulae getFormula() {
		return new And(getFormulae());
	}
	
	public ArrayList<BooleanFormulae> getFormulae() {
		ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
		f.add(new Iff(module, new Or(module.getPredicateStart(), new Since_ei(new Not(new Or(module.getPredicateEnd(), exception)), module.getPredicateStart()))));
		f.add(new Implies(module.getPredicateStart(), new Until_ei(new Not(module.getPredicateStart()), new Or(module.getPredicateEnd(), exception))));
		return f;
	}
	
//	public ArrayList<MetaBooleanFormulae> getMetaFormulae() {
//		ArrayList<MetaBooleanFormulae> f = new ArrayList<MetaBooleanFormulae>();
//		for (BooleanFormulae bf:getFormulae())
//			f.add((MetaBooleanFormulae)bf);
//			
//		return f;
//	}
}
