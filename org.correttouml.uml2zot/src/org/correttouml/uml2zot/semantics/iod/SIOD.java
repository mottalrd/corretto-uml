package org.correttouml.uml2zot.semantics.iod;


import java.util.Collection;
import org.correttouml.uml.diagrams.activity.*;
import org.correttouml.uml.diagrams.iod.IOD;
import org.correttouml.uml2zot.semantics.activity.*;
import org.correttouml.uml2zot.semantics.SMadesModel;
import org.correttouml.uml2zot.semantics.events.SEventFactory;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.Iff;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.semantics.util.trio.Past;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.Since;
import org.correttouml.uml2zot.semantics.util.trio.Since_ei;

/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */
public class SIOD extends SActivity {

	private IOD mades_iod;

	public SIOD(IOD iod) {
		super(iod);
		this.mades_iod=iod;
	}

	public Predicate getStartPredicate(){
		return new Predicate(mades_iod.getName() + mades_iod.getUMLId()+"_START");
	}
	
	public Predicate getEndPredicate(){
		return new Predicate(mades_iod.getName() + mades_iod.getUMLId() + "_END");
	}
	
    public String getSemantics() {

        String sem = "";
        int foundActivityFinalNode = 0;
        Or endCondition=new Or();
        FinalNode fn=null;
        
        Collection<Node> nodi = this.mades_iod.getNodes();
        for (Node n : nodi) {
        	if (n instanceof InitialNode)
				sem += new SInitialNode((InitialNode) n, mades_iod).getSemantics();
            if (n instanceof SequenceDiagramNode) {
                SequenceDiagramNode curr = (SequenceDiagramNode) n;
				//ASSUMPION: The sequence diagram is preceded by only one node
				Node prev = n.getIncomingNodes().iterator().next();
				SSequenceDiagramNode ssdNode = new SSequenceDiagramNode(curr, this.mades_iod); 
				Predicate sd_start = ssdNode.getStartPredicate();
				sem = sem + new Iff(sd_start, new Past(RC(curr, prev),1)) + "\n";
            }
            if (n instanceof FinalNode) {
                foundActivityFinalNode = 1;
                FinalNode curr = (FinalNode) n;
                Node prev = n.getIncomingNodes().iterator().next();

                fn=(FinalNode)n;
                endCondition.addFormulae(RC(curr, prev));
            }
            if (n instanceof DecisionNode) {
				sem += new SDecisionNode((DecisionNode) n, (Activity) this.mades_iod).getSemantics();
			}
            if (n instanceof JoinNode) {
                JoinNode join = (JoinNode) n;

                Collection<Node> precs = n.getIncomingNodes();
                Or orCond = new Or();

                for (Node prec : precs) {
                    And endCond = new And();
                    endCond.addFormulae(RC(n, prec));
                    for (Node prec2 : precs) {
                        if (!prec.equals(prec2)) {
                            endCond.addFormulae(new Since_ei(new Not(new SJoinNode(join).getPredicate()), RC(n, prec2)));
                        }
                    }
                    orCond.addFormulae(endCond);
                }
                sem = sem + new Iff(new SJoinNode(join).getPredicate(), orCond) + "\n";
            }
        }

        if (foundActivityFinalNode == 0) {
            sem = sem + new Not(this.getEndPredicate()) + "\n";
        }
        else{
        	sem = sem + new Iff(new SFinalNode(fn, mades_iod).getPredicate(), endCondition)+"\n";
        }
        
        SMadesModel.printSeparatorSmall("Interruptible regions");
        for(InterruptibleRegion ir: this.mades_iod.getInterruptibleRegions()){
        	Or insideCond=new Or();
        	Predicate inside_int_region=new SInterruptibleRegion(ir).getPredicate();
        	for(SequenceDiagramNode sdn: ir.getSequenceDiagramNodes()){
        		Predicate sdn_stop=new SSequenceDiagramNode(sdn, this.mades_iod).getStopPredicate();
        		Predicate sdn_end=new SSequenceDiagramNode(sdn, this.mades_iod).getEndPredicate();
        		Predicate sdn_start=new SSequenceDiagramNode(sdn, this.mades_iod).getStartPredicate();
        		Predicate interrupt=SEventFactory.getInstance(ir.getInterrupt().getEvent(this.mades_iod)).getPredicate();
        		sem = sem + new Iff(new And(interrupt, inside_int_region), sdn_stop)+"\n";
        		insideCond.addFormulae(new Or(sdn_start, new Since(new And(new Not(sdn_end), new Not(sdn_stop)),sdn_start)));
        	}
        	sem=sem+new Iff(inside_int_region, insideCond)+"\n";
        }
        return sem;
    }

}
