package org.correttouml.uml.diagrams.activitydiagram;


import java.util.HashSet;
import java.util.Set;

import org.correttouml.uml.diagrams.activity.CallActionNode;
import org.correttouml.uml.diagrams.activity.Node;
import org.correttouml.uml.diagrams.activity.OpaqueActionNode;
import org.correttouml.uml.diagrams.activity.SendSignalNode;
import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.expressions.ExpressionContext;
import org.eclipse.uml2.uml.Activity;

/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */
public class AD extends org.correttouml.uml.diagrams.activity.Activity implements ExpressionContext{
	
	public AD(Activity uml_activity, Object object) {
		super(uml_activity, object);
	}

	@Override
	public String getName() {
		return "OBJ" + this.object.getName() + super.getName();
	}
	
	@Override
	public Object getObject(){
		return this.object;
	}
	
	public void setObject(Object object){
		this.object = object;
	}
	
	public Set<OpaqueActionNode> getOpaqueActions(){
		Set<OpaqueActionNode> opAcs = new HashSet<OpaqueActionNode>();
		for (Node n: getNodes()){
			if (n instanceof OpaqueActionNode)
				opAcs.add((OpaqueActionNode) n);
		}
		return opAcs;
	}
	
	public Set<CallActionNode> getCallActionNodes(){
		Set<CallActionNode> cans = new HashSet<CallActionNode>();
		for (Node n: getNodes()){
			if (n instanceof CallActionNode)
				cans.add((CallActionNode) n);
		}
		return cans;
	}

	public Set<SendSignalNode> getSendSignalNodes(){
		Set<SendSignalNode> ssn = new HashSet<SendSignalNode>();
		for (Node n: getNodes()){
			if (n instanceof SendSignalNode)
				ssn.add((SendSignalNode) n);
		}
		return ssn;
	}

	public int getNodeN(){
		return uml_activity.getNodes().size();
	}
}
