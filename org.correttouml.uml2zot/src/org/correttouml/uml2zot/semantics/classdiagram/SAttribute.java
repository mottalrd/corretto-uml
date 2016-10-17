package org.correttouml.uml2zot.semantics.classdiagram;

import java.util.List;

import org.correttouml.uml.diagrams.activity.OpaqueActionNode;
import org.correttouml.uml.diagrams.classdiagram.Attribute;
import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.expressions.PrimitiveType;
import org.correttouml.uml.diagrams.expressions.ValueSpecification;
import org.correttouml.uml.diagrams.statediagram.StateDiagram;
import org.correttouml.uml.diagrams.statediagram.Transition;
import org.correttouml.uml.diagrams.statediagram.actions.Action;
import org.correttouml.uml.diagrams.statediagram.actions.AssignmentAction;
import org.correttouml.uml2zot.semantics.expressions.SVariable;
import org.correttouml.uml2zot.semantics.statediagram.actions.SAssignmentAction;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.semantics.util.trio.Constant;
import org.correttouml.uml2zot.semantics.util.trio.EQ;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.TrioVar;
import org.correttouml.uml2zot.semantics.util.trio.Yesterday;
import org.correttouml.uml2zot.tests.helpers.UML2Helper;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.internal.resource.UMLHandler;


public class SAttribute implements SVariable {

	private Attribute mades_attribute;

	public SAttribute(Attribute attribute) {
		this.mades_attribute = attribute;
	}

	@Override
	public BooleanFormulae getPredicate(Object... obj) {
		if(mades_attribute.isStatic()){
			if (mades_attribute.getType() == PrimitiveType.INTEGER
					|| mades_attribute.getType() == PrimitiveType.REAL)
				return new TrioVar("ATTR"
						+ mades_attribute.getName(), mades_attribute.getType());
			else if (mades_attribute.getType() == PrimitiveType.BOOLEAN) {
				return new Predicate("ATTR"
						+ mades_attribute.getName());
			}			
		}else{
			if (mades_attribute.getType() == PrimitiveType.INTEGER
					|| mades_attribute.getType() == PrimitiveType.REAL)
				return new TrioVar("OBJ" + obj[0].getName() + "ATTR"
						+ mades_attribute.getName(), mades_attribute.getType());
			else if (mades_attribute.getType() == PrimitiveType.BOOLEAN) {
				return new Predicate("OBJ" + obj[0].getName() + "ATTR"
						+ mades_attribute.getName());
			}			
		}
		
		// TODO: dovrei avere una eccezione
		return null;
	}

	public String getSemantics(Object mades_obj) {
		String sem = "";
		if(!(this.mades_attribute.getType()==PrimitiveType.INTEGER 
				|| this.mades_attribute.getType()==PrimitiveType.BOOLEAN 
				|| this.mades_attribute.getType()==PrimitiveType.REAL)
			) return sem;
		
		Or orCond=new Or();
		
		if(this.mades_attribute.isStatic()){
			getActionsChangingThisStaticAttribute(mades_obj, orCond);
		}else{
			getActionsChangingThisAttribute(mades_obj, orCond);
		}

		if (orCond.size() != 0){
			sem = sem
					+ new Implies(new Not(orCond), new EQ(
							this.getPredicate(mades_obj), new Yesterday(
									this.getPredicate(mades_obj)))) + "\n";
		}else if (!(mades_obj.getSlot(mades_attribute) != null && 
				mades_obj.getSlot(mades_attribute).isTimeVariant())){ //If it is not a time variant variable.
			sem = sem+ new EQ(this.getPredicate(mades_obj), new Yesterday(this.getPredicate(mades_obj))) + "\n";
		}
		return sem;
	}

	private void getActionsChangingThisStaticAttribute(Object curr_obj, Or orCond) {
		
		// ACTIONS CHANGING THIS ATTRIBUTE
		for(Object obj: curr_obj.getOwningClass().getObjects()){
			for (StateDiagram std : obj.getOwningClass().getStateDiagrams()) {
				for (Transition t : std.getTransitions()) {
					if (t.hasActions()) {
						List<Action> actions = t.getActions(obj);
						for(Action act: actions){
							if(isActionAssigningAttribute(act)) orCond.addFormulae(new SAssignmentAction((AssignmentAction)act).getPredicate(obj));
						}
					}
				}
			}
			if (obj.getAD() != null)
				for (OpaqueActionNode opAc: obj.getAD().getOpaqueActions()){
					if(isActionAssigningAttribute(opAc.getAction(obj)))
						orCond.addFormulae(new SAssignmentAction((AssignmentAction) opAc.getAction(obj)).getPredicate(obj));
				}
		}
	}
	
	private void getActionsChangingThisAttribute(Object curr_obj, Or orCond) {
		
		// ACTIONS CHANGING THIS ATTRIBUTE
		for (StateDiagram std : curr_obj.getOwningClass().getStateDiagrams()) {
			for (Transition t : std.getTransitions()) {
				if (t.hasActions()) {
					List<Action> actions = t.getActions(curr_obj);
					for(Action act: actions){
						if(isActionAssigningAttribute(act)) orCond.addFormulae(new SAssignmentAction((AssignmentAction)act).getPredicate(curr_obj));
					}
				}
			}
		}
		
		if (curr_obj.getAD() != null)
			for (OpaqueActionNode opAc: curr_obj.getAD().getOpaqueActions()){
				if(isActionAssigningAttribute(opAc.getAction(curr_obj)))
					orCond.addFormulae(new SAssignmentAction((AssignmentAction) opAc.getAction(curr_obj)).getPredicate(curr_obj));
			}
	}	

	private boolean isActionAssigningAttribute(Action act) {
		if (act instanceof AssignmentAction) {
			AssignmentAction ass_act = (AssignmentAction) act;
			if (ass_act.getAssignment().getAssignment()
					.getLeftvar()
					.equals(mades_attribute.getName())) {
				return true;
			}
		}
		return false;
	}

	public String getInitializationSemantics(Object mades_obj, ValueSpecification value) {
		String sem="";
		
		//TODO: Value specification has only integers right now, veeery bad
		sem=sem+new EQ(new SAttribute(this.mades_attribute).getPredicate(mades_obj),new Constant(value.getValue()));
		
		return sem;
	}

}
