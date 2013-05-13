package org.correttouml.uml.diagrams.expressions;

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
		return this.context.getUMLId();
	}

}
