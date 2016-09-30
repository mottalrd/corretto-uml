package org.correttouml.uml.diagrams.activity;


import java.util.HashSet;
import java.util.Set;

import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.expressions.ExpressionContext;
import org.correttouml.uml2zot.UML2Zot;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadVariableAction;
import org.eclipse.uml2.uml.internal.impl.OutputPinImpl;
import org.eclipse.uml2.uml.internal.impl.ReadVariableActionImpl;

/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */
public class Activity implements ExpressionContext{
	public static final class Utility {
		
		public static boolean isConcreteNode(org.eclipse.uml2.uml.ActivityNode uml_activitynode){
	    	if (uml_activitynode instanceof org.eclipse.uml2.uml.ActivityFinalNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.InitialNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.FlowFinalNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.ForkNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.JoinNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.DecisionNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.MergeNode || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.CallBehaviorAction || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.AcceptEventAction || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.OpaqueAction || 
	    			uml_activitynode instanceof org.eclipse.uml2.uml.CallOperationAction ||
	    			uml_activitynode instanceof org.eclipse.uml2.uml.SendSignalAction
	    			)
	    		return true;
	    	return false;
	    }
		
	}

	protected org.eclipse.uml2.uml.Activity uml_activity;
	protected Object object;
	
	public Activity(org.eclipse.uml2.uml.Activity uml_activity, Object object){
		this.uml_activity=uml_activity;
		this.object = object;
	}
	
	public String getName(){
		return uml_activity.getName();
	}
	
	public Set<Node> getNodes(){
		Set<Node> nodes=new HashSet<Node>();
		for(org.eclipse.uml2.uml.ActivityNode n: uml_activity.getNodes()){
			if (Utility.isConcreteNode(n))
				nodes.add(NodeFactory.getInstance(n));
		}
		return nodes;
	}
	
	public Set<ControlFlow> getControlFlows(){
		Set<ControlFlow> cfs=new HashSet<ControlFlow>();
		for(org.eclipse.uml2.uml.ActivityEdge uml_cf: uml_activity.getEdges()){
			cfs.add(new ControlFlow(uml_cf, this));
		}
		return cfs;
	}
	
    public ControlFlow findControlFlow(Node source, Node destination) {
        for (ControlFlow c : this.getControlFlows()) {
        	if (c.getSource() == null || c.getDestination() == null)
        		continue;
            if (c.getSource().equals(source) && c.getDestination().equals(destination)) {
                return c;
            }
        }
        return null;
    }
    
    public Set<InterruptibleRegion> getInterruptibleRegions(){
    	Set<InterruptibleRegion> regions=new HashSet<InterruptibleRegion>();
    	for(ActivityGroup ag:this.uml_activity.getGroups()){
    		if(ag instanceof InterruptibleActivityRegion) regions.add(new InterruptibleRegion((InterruptibleActivityRegion)ag));
    	}
    	return regions;
    }

	public String getUMLId() {
		String id=((XMLResource) this.uml_activity.eResource()).getID(uml_activity);
		return UML2Zot.Utility.umlIDtoPrdID(id);
	}

//	public boolean isAD(){
//		if (this.uml_activity.getOwner() instanceof org.eclipse.uml2.uml.Package)
//			return false;
//		return true;
//	}
	
	public org.eclipse.uml2.uml.Activity getUmlActivity(){
		return this.uml_activity;
	}
	
	public Object getObject(){
		return object;
	}
	
	@Override
	public MadesModel getMadesModel() {
		return new MadesModel(uml_activity.getModel());
	}
	
}
