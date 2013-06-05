package org.correttouml.uml2zot.semantics.statediagram.actions;

import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.expressions.ExpressionContext;
import org.correttouml.uml.diagrams.statediagram.actions.CallAction;
import org.correttouml.uml.diagrams.statediagram.actions.CallActionParameter;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;


public class SCallAction implements SAction{

	CallAction mades_callAction;
	
	public SCallAction(CallAction mades_callAction){
		this.mades_callAction=mades_callAction;
	}
	
	public Predicate getPredicate(Object... optObject){
		
		return new Predicate("OBJ"+mades_callAction.getObject()+"OP"+mades_callAction.getOperation().getName()+"_CALL");
	}

	@Override
	public String getSemantics(ExpressionContext context,
			Object... optObject) {
		String sem="";
		
        //Call Action parameter semantics
        for (CallActionParameter cap : this.mades_callAction.getCallActionParameters()) {
        	sem=sem+new SCallActionParameter(cap).getSemantics(optObject[0])+"\n";
        }
        
        return sem;
	}
	
}
