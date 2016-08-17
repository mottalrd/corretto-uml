package org.correttouml.uml.diagrams.expressions;

import org.correttouml.uml2zot.UML2Zot;

public class Assignment {
	
	private org.correttouml.grammars.stateMachineActions.Assignment assignment;
	private AssignmentContext context;
	
	public Assignment(org.correttouml.grammars.stateMachineActions.Assignment assignment, AssignmentContext context){
		this.assignment=assignment;
		this.context=context;
	}
	
	public org.correttouml.grammars.stateMachineActions.Assignment getAssignment(){
		return assignment;
	}

	public String getUMLId() {
		//TODO: we do not have a good id for multiple assignments
		return this.context.getUMLId()+assignment.getLeftvar();
	}

}
