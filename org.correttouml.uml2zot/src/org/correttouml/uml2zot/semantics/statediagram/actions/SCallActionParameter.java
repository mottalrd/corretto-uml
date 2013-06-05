package org.correttouml.uml2zot.semantics.statediagram.actions;

import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.classdiagram.Operation;
import org.correttouml.uml.diagrams.statediagram.actions.CallActionParameter;
import org.correttouml.uml2zot.semantics.classdiagram.SOperationParameter;
import org.correttouml.uml2zot.semantics.expressions.SVariableFactory;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.trio.EQ;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;


public class SCallActionParameter {

	private CallActionParameter mades_cap;
	
	public SCallActionParameter(CallActionParameter cap){
		this.mades_cap=cap;
	}
	
	public String getSemantics(Object object) {
        String sem = "";
        
        Predicate call_action_predicate=new SCallAction(mades_cap.getCallAction()).getPredicate(object);
        BooleanFormulae var=SVariableFactory.getInstance(this.mades_cap.getVariable(object)).getPredicate(object);
        
        BooleanFormulae operationpar=new SOperationParameter(this.mades_cap.getOperationParameter()).getPredicate(this.mades_cap.getCallAction().getObject());
        
        /*@AXIOM
         * \begin{align}
         * The parameter of a message holds at the time of the message end
         * messageEnd \Rightarrow messageParameter = operationParameter
         * \nonumber
         * \end{align}
         */
        sem = sem + new Implies(call_action_predicate ,new EQ(operationpar, var));
        return sem;
	}
	
}
