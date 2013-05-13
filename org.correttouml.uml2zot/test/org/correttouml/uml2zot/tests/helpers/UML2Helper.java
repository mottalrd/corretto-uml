package org.correttouml.uml2zot.tests.helpers;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.AggregationKind;

public class UML2Helper {

	private static final Logger LOGGER = Logger.getLogger(UML2Helper.class); 
	
	//Double check that this is updated when running
	public static String UML_LIBRARY_PATH="jar:file:/opt/eclipse/2012-11-eclipse-modeling-juno/plugins/org.eclipse.uml2.uml.resources_4.0.1.v20120913-1441.jar!/";
	
	public static org.eclipse.uml2.uml.Class createNot(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Alw>>
		org.eclipse.uml2.uml.Class not=createClass(package_, "Not", false);
		org.eclipse.uml2.uml.Stereotype notStereotype=getMADESPropertiesStereotype(madesProfile, "Not");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		not.applyStereotype(booleanFormulaeStereotype);
		not.applyStereotype(notStereotype);
		not.setValue(notStereotype, "formulae", formulae);
		
		return not;
	}		
	
	public static org.eclipse.uml2.uml.Class createImplies(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject left, EObject right){
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createClass(package_, "Implies", false);
		org.eclipse.uml2.uml.Stereotype impliesStereotype=getMADESPropertiesStereotype(madesProfile, "Implies");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		implies.applyStereotype(booleanFormulaeStereotype);
		implies.applyStereotype(impliesStereotype);
		implies.setValue(impliesStereotype,"left", left);	
		implies.setValue(impliesStereotype,"right", right);		
		
		return implies;
	}
	
	public static org.eclipse.uml2.uml.Class createTerm(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Element element){
		//<<Alw>>
		org.eclipse.uml2.uml.Class term=createClass(package_, "Term", false);
		org.eclipse.uml2.uml.Stereotype termStereotype=getMADESPropertiesStereotype(madesProfile, "Term");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		term.applyStereotype(booleanFormulaeStereotype);
		term.applyStereotype(termStereotype);
		term.setValue(termStereotype, "element", element);
		
		return term;
	}	
	
	public static org.eclipse.uml2.uml.Class createNext(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Alw>>
		org.eclipse.uml2.uml.Class next=createClass(package_, "Next", false);
		org.eclipse.uml2.uml.Stereotype nextStereotype=getMADESPropertiesStereotype(madesProfile, "Next");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		next.applyStereotype(booleanFormulaeStereotype);
		next.applyStereotype(nextStereotype);
		next.setValue(nextStereotype, "formulae", formulae);
		
		return next;
	}		
	
	public static org.eclipse.uml2.uml.Class createSomF(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<SomF>>
		org.eclipse.uml2.uml.Class somf=createClass(package_, "SomF", false);
		org.eclipse.uml2.uml.Stereotype somfStereotype=getMADESPropertiesStereotype(madesProfile, "SomF");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		somf.applyStereotype(booleanFormulaeStereotype);
		somf.applyStereotype(somfStereotype);
		somf.setValue(somfStereotype, "formulae", formulae);
		
		return somf;
	}		
	
	public static org.eclipse.uml2.uml.Class createWithinF(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae, EObject constant){
		//<<WithinF>>
		org.eclipse.uml2.uml.Class withinf=createClass(package_, "WithinF", false);
		org.eclipse.uml2.uml.Stereotype withinfStereotype=getMADESPropertiesStereotype(madesProfile, "WithinF");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		withinf.applyStereotype(booleanFormulaeStereotype);
		withinf.applyStereotype(withinfStereotype);
		withinf.setValue(withinfStereotype, "formulae", formulae);
		withinf.setValue(withinfStereotype, "t", constant);
		
		return withinf;
	}		
	
	public static org.eclipse.uml2.uml.Class createConstant(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, int value){
		//<<constant>>
		org.eclipse.uml2.uml.Class constant=createClass(package_, "constant", false);
		org.eclipse.uml2.uml.Stereotype constantStereotype=getMADESPropertiesStereotype(madesProfile, "constant");
		constant.applyStereotype(constantStereotype);
		constant.setValue(constantStereotype, "value", value);
		
		return constant;
	}		
	
	public static org.eclipse.uml2.uml.Class createAlw(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createClass(package_, "Alw", false);
		org.eclipse.uml2.uml.Stereotype alwStereotype=getMADESPropertiesStereotype(madesProfile, "Alw");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		alw.applyStereotype(booleanFormulaeStereotype);
		alw.applyStereotype(alwStereotype);
		alw.setValue(alwStereotype, "formulae", formulae);
		
		return alw;
	}	
	
	public static org.eclipse.uml2.uml.Class createProperty(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Property>>
		org.eclipse.uml2.uml.Class property=createClass(package_, "Property", false);
		org.eclipse.uml2.uml.Stereotype propertyClassStereotype=getMADESPropertiesStereotype(madesProfile, "Property");
		property.applyStereotype(propertyClassStereotype);
		property.setValue(propertyClassStereotype, "formulae", formulae);
		
		return property;
	}	
	
    public static org.eclipse.uml2.uml.InstanceSpecification createInstanceSpecification(org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Class class_, String name) {
        
    	org.eclipse.uml2.uml.InstanceSpecification instanceSpecification = UMLFactory.eINSTANCE.createInstanceSpecification();
    	
    	instanceSpecification.getClassifiers().add(class_);
    	package_.getPackagedElements().add(instanceSpecification);
    	instanceSpecification.setName(name);

        LOGGER.info("InstanceSpecification '" + instanceSpecification.getQualifiedName() + "' created.");

        return instanceSpecification;
    }	
    
    public static org.eclipse.uml2.uml.InstanceSpecification createInstanceSpecificationLink(org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Association association, org.eclipse.uml2.uml.InstanceSpecification obj1, org.eclipse.uml2.uml.InstanceSpecification obj2,  String name) {
        
    	org.eclipse.uml2.uml.InstanceSpecification link = UMLFactory.eINSTANCE.createInstanceSpecification();
    	
    	link.getClassifiers().add(association);
    	package_.getPackagedElements().add(link);
    	link.setName(name);
    	
    	//TODO[mottalrd] is it correct?
    	//To understand look at a papyrus generated uml file or debug a model 
    	//with association links and see the model variables
    	EAnnotation end1=link.createEAnnotation("InstanceEnd");
    	end1.getReferences().add(obj1);
    	end1.getReferences().add(obj2);

        LOGGER.info("InstanceSpecification '" + link.getQualifiedName() + "' created.");

        return link;
    }
	
    public static org.eclipse.uml2.uml.Interaction createInteraction(org.eclipse.uml2.uml.Package package_, String name) {
        
    	org.eclipse.uml2.uml.Interaction interaction = UMLFactory.eINSTANCE.createInteraction();
    	
    	package_.getPackagedElements().add(interaction);
    	interaction.setName(name);

        LOGGER.info("Interaction '" + interaction.getQualifiedName() + "' created.");

        return interaction;
    }	
    
    public static org.eclipse.uml2.uml.Activity createActivity(org.eclipse.uml2.uml.Package package_, String name) {
        
    	org.eclipse.uml2.uml.Activity activity = UMLFactory.eINSTANCE.createActivity();
    	
    	package_.getPackagedElements().add(activity);
    	activity.setName(name);

        LOGGER.info("Activity '" + activity.getQualifiedName() + "' created.");

        return activity;
    } 
    
    public static org.eclipse.uml2.uml.FinalNode createFinalNode(org.eclipse.uml2.uml.Activity activity, String name){
    	
    	org.eclipse.uml2.uml.FinalNode node=UMLFactory.eINSTANCE.createActivityFinalNode();
    	node.setName(name);
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	LOGGER.info("Activity Final Node '" + node.getQualifiedName() + "' created.");
    	return node;    	
    }
    
    public static org.eclipse.uml2.uml.InitialNode createInitialNode(org.eclipse.uml2.uml.Activity activity, String name){
    	
    	org.eclipse.uml2.uml.InitialNode node=UMLFactory.eINSTANCE.createInitialNode();
    	node.setName(name);
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	LOGGER.info("Activity Initial Node '" + node.getQualifiedName() + "' created.");
    	return node;    	
    }    
    
    public static org.eclipse.uml2.uml.CallBehaviorAction createIODNode(org.eclipse.uml2.uml.Activity activity, org.eclipse.uml2.uml.Interaction sd){
    	 
    	org.eclipse.uml2.uml.CallBehaviorAction node=UMLFactory.eINSTANCE.createCallBehaviorAction();
    	node.setName("SD: " + sd.getName());
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	node.setBehavior(sd);
    	LOGGER.info("Activity Node '" + sd.getQualifiedName() + "' created.");
    	return node;
    }
    
    public static org.eclipse.uml2.uml.ControlFlow createControlFlow(org.eclipse.uml2.uml.Activity activity, org.eclipse.uml2.uml.ActivityNode n1, org.eclipse.uml2.uml.ActivityNode n2){
    	
    	org.eclipse.uml2.uml.ControlFlow c=UMLFactory.eINSTANCE.createControlFlow();
    	c.setActivity(activity);
    	activity.getEdges().add(c);
    	c.setSource(n1);
    	c.setTarget(n2);
    	LOGGER.info("Control Flow '" + n1.getQualifiedName()+"->"+n2.getQualifiedName() + "' created.");
    	return c;
    	
    }
    
    public static org.eclipse.uml2.uml.Message createMessage(org.eclipse.uml2.uml.Interaction interaction, org.eclipse.uml2.uml.Lifeline l1, org.eclipse.uml2.uml.Lifeline l2, org.eclipse.uml2.uml.Operation operation, String name){
    	
    	org.eclipse.uml2.uml.Message message=UMLFactory.eINSTANCE.createMessage();
    	
    	message.setSignature(operation);
    	message.setInteraction(interaction);
    	message.setName(name);
    	
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification sendEvent=createMessageOccurrenceSpecification(l1,message);
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification receiveEvent=createMessageOccurrenceSpecification(l2,message);
    	message.setSendEvent(sendEvent);
    	message.setReceiveEvent(receiveEvent);
    	
    	return message;
    }
    
    public static org.eclipse.uml2.uml.MessageOccurrenceSpecification createMessageOccurrenceSpecification(org.eclipse.uml2.uml.Lifeline lifeline, org.eclipse.uml2.uml.Message message) {
        
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification moc = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
    	
    	moc.setMessage(message);
    	moc.getCovereds().add(lifeline);
    	moc.setEnclosingInteraction(lifeline.getInteraction());

        LOGGER.info("MessageOccurrenceSpecification of '" + message.getQualifiedName() + "' created.");

        return moc;
    }	
	
    public static org.eclipse.uml2.uml.Operation createOperation(org.eclipse.uml2.uml.Class class_, String name) {
        org.eclipse.uml2.uml.Operation operation = class_.createOwnedOperation(name, null, null); 
        
        LOGGER.info("Operation '" + operation.getQualifiedName() + "' created.");

        return operation;
    }	
    
    public static org.eclipse.uml2.uml.Operation createOperation(org.eclipse.uml2.uml.Class class_, String name, EList<String> parametersName, EList<Type> parametersType) {
        org.eclipse.uml2.uml.Operation operation = class_.createOwnedOperation(name, parametersName, parametersType); 
        
        LOGGER.info("Operation '" + operation.getQualifiedName() + "' created.");

        return operation;
    }	
    
    public static org.eclipse.uml2.uml.PrimitiveType createPrimitiveType(Model m, String name){
		PrimitiveType mytype=UMLFactory.eINSTANCE.createPrimitiveType();
		mytype.setName(name);
		m.getPackagedElements().add(mytype);
		
		return mytype;
    }
    
	public static org.eclipse.uml2.uml.Property createAttribute(Class klass, String name, PrimitiveType type) {
		org.eclipse.uml2.uml.Property attribute = klass.createOwnedAttribute(name, type);
        
        LOGGER.info("Operation '" + attribute.getQualifiedName() + "' created.");

        return attribute;
	}	
	
    public static org.eclipse.uml2.uml.Class createClass(org.eclipse.uml2.uml.Package package_, String name, boolean isAbstract) {
        org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass(name, isAbstract);

        LOGGER.info("Class '" + class_.getQualifiedName() + "' created.");

        return class_;
    }
    
    //clear me
//    public static org.eclipse.uml2.uml.Association createAssociation(org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Class class_1, org.eclipse.uml2.uml.Class class_2, String name) {
//        //org.eclipse.uml2.uml.Association association = UMLFactory.eINSTANCE.createAssociation();
//    	org.eclipse.uml2.uml.Association association=org.eclipse.uml2.uml.Association.createAssociation(true, AggregationKind.NONE, 
//    			class_1.getName(), 
//    			1, 
//    			1, 
//    			class_1, 
//    			true, 
//    			AggregationKind.NONE, 
//    			class_2.getName(), 
//    			1, 
//    			1);
//        
//        //First end
//        org.eclipse.uml2.uml.Property end_class_1=UMLFactory.eINSTANCE.createProperty();
//        end_class_1.setAssociation(association);
//        //TODO[mottalrd][bug?] not sure about this. I was for setDataType but wasn't ok
//        end_class_1.setType(class_1);
//        
//        //Second end
//        org.eclipse.uml2.uml.Property end_class_2=UMLFactory.eINSTANCE.createProperty();
//        end_class_2.setAssociation(association);
//        //TODO[mottalrd][bug?] not sure about this. I was for setDataType but wasn't ok
//        end_class_2.setType(class_2);
//        
//        //Add to the parent package
//        package_.getPackagedElements().add(association);
//        
//        LOGGER.info("Associaction '" + association.getQualifiedName() + "' created.");
//
//        return association;
//    }
    
    public static org.eclipse.uml2.uml.Association createAssociation(org.eclipse.uml2.uml.Type type1, boolean end1IsNavigable, AggregationKind end1Aggregation,
            String end1Name, int end1LowerBound, int end1UpperBound,
            org.eclipse.uml2.uml.Type type2, boolean end2IsNavigable, AggregationKind end2Aggregation,
            String end2Name, int end2LowerBound, int end2UpperBound) {

    	org.eclipse.uml2.uml.Association association = type1.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1LowerBound, end1UpperBound,
            type2, end2IsNavigable, end2Aggregation, end2Name, end2LowerBound, end2UpperBound);

        StringBuffer sb = new StringBuffer();

        sb.append("Association ");

        if (null == end1Name || 0 == end1Name.length()) {
            sb.append('{');
            sb.append(type1.getQualifiedName());
            sb.append('}');
        } else {
            sb.append("'");
            sb.append(type1.getQualifiedName());
            sb.append(NamedElement.SEPARATOR);
            sb.append(end1Name);
            sb.append("'");
        }

        sb.append(" [");
        sb.append(end1LowerBound);
        sb.append("..");
        sb.append(LiteralUnlimitedNatural.UNLIMITED == end1UpperBound ? "*" : String.valueOf(end1UpperBound));
        sb.append("] ");

        sb.append(end2IsNavigable ? '<' : '-');
        sb.append('-');
        sb.append(end1IsNavigable ? '>' : '-');
        sb.append(' ');

        if (null == end2Name || 0 == end2Name.length()) {
            sb.append('{');
            sb.append(type2.getQualifiedName());
            sb.append('}');
        } else {
            sb.append("'");
            sb.append(type2.getQualifiedName());
            sb.append(NamedElement.SEPARATOR);
            sb.append(end2Name);
            sb.append("'");
        }

        sb.append(" [");
        sb.append(end2LowerBound);
        sb.append("..");
        sb.append(LiteralUnlimitedNatural.UNLIMITED == end2UpperBound ? "*" : String.valueOf(end2UpperBound));
        sb.append("]");

        sb.append(" created.");

        LOGGER.info(sb.toString());

        return association;
    }
    
    public static org.eclipse.uml2.uml.StateMachine createStateMachine(org.eclipse.uml2.uml.Class klass, String name) {
        org.eclipse.uml2.uml.StateMachine sm = UMLFactory.eINSTANCE.createStateMachine();
        sm.setName(name);
        klass.getOwnedBehaviors().add(sm);

        LOGGER.info("State Machine '" + sm.getQualifiedName() + "' created.");

        return sm;
    }    
    
    public static org.eclipse.uml2.uml.State createState(org.eclipse.uml2.uml.StateMachine sm, String name) {
        org.eclipse.uml2.uml.State state = UMLFactory.eINSTANCE.createState();
        state.setName(name);
        sm.getRegions().get(0).getSubvertices().add(state);

        LOGGER.info("State '" + state.getName() + "' created.");

        return state;
    }  
    
    public static org.eclipse.uml2.uml.Pseudostate createInitialState(org.eclipse.uml2.uml.StateMachine sm, String name) {
        org.eclipse.uml2.uml.Pseudostate state = UMLFactory.eINSTANCE.createPseudostate();
        state.setName(name);
        sm.getRegions().get(0).getSubvertices().add(state);

        LOGGER.info("State '" + state.getName() + "' created.");

        return state;
    }   
    
    public static org.eclipse.uml2.uml.Region createRegion(org.eclipse.uml2.uml.StateMachine sm) {
        org.eclipse.uml2.uml.Region region = UMLFactory.eINSTANCE.createRegion();
        sm.getRegions().add(region);
        region.setName(sm.getQualifiedName() + "main region");

        LOGGER.info("Region '" + region.getQualifiedName() + "' created.");

        return region;
    }    
    
    public static org.eclipse.uml2.uml.Transition createTransition(org.eclipse.uml2.uml.StateMachine sm, org.eclipse.uml2.uml.Vertex source, org.eclipse.uml2.uml.Vertex target, String name) {
        org.eclipse.uml2.uml.Transition transition = UMLFactory.eINSTANCE.createTransition();
        transition.setName(name);
        transition.setSource(source);
        transition.setTarget(target);
        sm.getRegions().get(0).getTransitions().add(transition);

        LOGGER.info("Transition '" + transition.getName() + "' created.");

        return transition;
    }    
	
	public static org.eclipse.uml2.uml.Comment createSDTimeConstraint(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Interaction sd, String expression){
		
		org.eclipse.uml2.uml.Comment comment = sd.createOwnedComment();
		//UMLFactory.eINSTANCE.createComment();
		comment.setBody(expression);
		
		org.eclipse.uml2.uml.Stereotype timeConstraintStereotype=getMADESTimeStereotype(madesProfile, "TimeConstraint");
		comment.applyStereotype(timeConstraintStereotype);
		
		return comment;
	}		

	public static Model createModel(String name) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(name);

		LOGGER.info("Model '" + model.getQualifiedName() + "' created.");

		return model;
	}

	public static org.eclipse.uml2.uml.Package createPackage(
			org.eclipse.uml2.uml.Package nestingPackage, String name) {
		org.eclipse.uml2.uml.Package package_ = nestingPackage
				.createNestedPackage(name);

		LOGGER.info("Package '" + package_.getQualifiedName()
				+ "' created.");

		return package_;
	}

	@SuppressWarnings("rawtypes")
	public static void save(org.eclipse.uml2.uml.Package package_, URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		//Register the UML Package
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		
		UMLResourcesUtil.init(resourceSet); // MDT/UML2 4.0.0 (Juno)
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(package_);
		
		for (Iterator allContents = UMLUtil.getAllContents(package_, true,
				false); allContents.hasNext();) {

				EObject eObject = (EObject) allContents.next();

				if (eObject instanceof Element) {
					resource.getContents()
						.addAll(((Element) eObject).getStereotypeApplications());
				}
			}		
		
		try {
			resource.save(null);
			LOGGER.info("Done.");
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}

	public static Stereotype getMADESTimeStereotype(Profile madesProfile, String stereotypeName) {
		org.eclipse.uml2.uml.Stereotype timeStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: madesProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && ((org.eclipse.uml2.uml.Package)e).getName().equals("Time")){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						timeStereotype= (org.eclipse.uml2.uml.Stereotype)s;
					}
				}
			}
		}
		return timeStereotype;
	}
	
	public static Stereotype getMADESVerificationTagsStereotype(Profile madesProfile, String stereotypeName){
		org.eclipse.uml2.uml.Stereotype systemStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: madesProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && ((org.eclipse.uml2.uml.Package)e).getName().equals("VerificationTags")){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						systemStereotype= (org.eclipse.uml2.uml.Stereotype)s;
					}
				}
			}
		}
		return systemStereotype;
	}
	
	public static Stereotype getMADESPropertiesStereotype(Profile madesProfile, String stereotypeName){
		org.eclipse.uml2.uml.Stereotype systemStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: madesProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && ((org.eclipse.uml2.uml.Package)e).getName().equals("Properties")){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						systemStereotype= (org.eclipse.uml2.uml.Stereotype)s;
					}
				}
			}
		}
		return systemStereotype;
	}
	
	public static Profile loadProfile(String pathToModel){
		//A collection of related persistent documents.
		ResourceSet set = new ResourceSetImpl();
		
		//Register the UML Package
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		
		//libraries
		Map<URI,URI> uriMap = set.getURIConverter().getURIMap();
		URI uml_resource_uri = URI.createURI(UML_LIBRARY_PATH); // for example
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uml_resource_uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uml_resource_uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uml_resource_uri.appendSegment("profiles").appendSegment(""));
		
		//Add the model file to the resource set
		URI uri = URI.createFileURI(pathToModel);
		set.createResource(uri);
		Resource r = set.getResource(uri, true);
		
		Profile m=(Profile)EcoreUtil.getObjectByType(r.getContents(), UMLPackage.eINSTANCE.getProfile());
		return m;
	}

	
	
}
