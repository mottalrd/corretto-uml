package org.correttouml.uml2zot.semantics.sequencediagram;

import org.correttouml.uml.diagrams.sequencediagram.ExecutionOccurrence;
import org.correttouml.uml.diagrams.sequencediagram.InteractionFragmentFactory;
import org.correttouml.uml.diagrams.sequencediagram.Message;
import org.correttouml.uml.diagrams.sequencediagram.MessageEnd;
import org.correttouml.uml.diagrams.sequencediagram.MessageStart;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.Iff;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.Since_ei;


public class SExecutionOccurrence implements SInteractionFragment{
	
	private ExecutionOccurrence mades_exocc;

	public SExecutionOccurrence(ExecutionOccurrence mades_exocc){
		this.mades_exocc=mades_exocc;
	}
	
	public Predicate getPredicate(){
		return new Predicate("EXOCC"+this.mades_exocc.getUMLId().replace("-", "_"));
	}
	public Predicate getPredicateStart(){
		return new Predicate("EXOCC" + this.mades_exocc.getUMLId().replace("-", "_") + "_START");
	}
	public Predicate getPredicateEnd(){
		return new Predicate("EXOCC" + this.mades_exocc.getUMLId().replace("-", "_") + "_End");
	}

	public String getSemantics() {
        String sem = "";
        Predicate sdstop=new SSequenceDiagram(this.mades_exocc.getSequenceDiagram()).getPredicateStop();
//        Predicate exoccstart=new SExecutionOccurrenceStart(this.mades_exocc.getExecutionOccurrenceStart()).getPredicate();
        Predicate exoccstart = this.getPredicateStart();
//        Predicate exoccend=new SExecutionOccurrenceEnd(this.mades_exocc.getExecutionOccurrenceEnd()).getPredicate();
        Predicate exoccend = this.getPredicateEnd();
        Predicate exocc=this.getPredicate();

        /*@AXIOM
         * Given the sequence diagram \emph{SD} into which\\
         * this execution occurrence is drawn
         * \begin{align} 
         *  exOcc \Leftrightarrow (exOccStart 
         *                          \vee
         *                         Since_{ei}( \neg SDStop \wedge \neg exOccEnd , exOccStart)
         *                        ) 
         * \nonumber
         * \end{align}
         */        
        sem = sem + new Iff(exocc, new Or(exoccstart, new Since_ei(
                    new And(new Not(sdstop), new Not(exoccend)), exoccstart))) + "\n";

        
        return sem;
	}

	public String getSyncSemantics() {
		String sem = "";
		if (!(this.mades_exocc.getExecutionOccurrenceSyncStart() == null))
			sem += new Iff(this.getPredicateStart(), new SInteractionFragmentFactory().getInstance(this.mades_exocc.getExecutionOccurrenceSyncStart()).getPredicate()) + "\n";
		if (!(this.mades_exocc.getExecutionOccurrenceSyncFinish() == null))
			sem += new Iff(this.getPredicateEnd(), new SInteractionFragmentFactory().getInstance(this.mades_exocc.getExecutionOccurrenceSyncFinish()).getPredicate()) + "\n";		
		return sem;
	}

}
