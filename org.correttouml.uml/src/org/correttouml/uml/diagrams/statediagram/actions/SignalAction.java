package org.correttouml.uml.diagrams.statediagram.actions;

import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.classdiagram.Signal;
import org.correttouml.uml.diagrams.expressions.ExpressionContext;
import org.correttouml.uml.diagrams.statediagram.Transition;

public class SignalAction implements Action{

	private Signal mades_signal;
//	private Transition mades_transition;
	private ExpressionContext context;
	private Object mades_object;
	
	public SignalAction(Signal s, ExpressionContext context, Object object) {
		this.mades_signal=s;
//		this.mades_transition=transition;
		this.context = context;
		this.mades_object=object;
	}

	public Signal getSignal() {
		return mades_signal;
	}
	
	public Object getObject(){
		return mades_object;
	}
	
	public ExpressionContext getContext(){
		return context;
	}
//	public Transition getTransition(){
//		return mades_transition;
//	}
	
//	@Override
//	public boolean equals(java.lang.Object o){
//		SignalAction other_object=(SignalAction) o;
//		return this.mades_object.equals(other_object.getObject()) && this.mades_signal.equals(other_object.mades_signal) && this.mades_transition.equals(other_object.getTransition());
//	}
//	
//	@Override
//	public int hashCode(){
//		return this.mades_object.hashCode()+this.mades_signal.hashCode()+this.mades_transition.hashCode();
//	}

}
