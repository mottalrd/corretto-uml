package org.correttouml.uml2zot.tests.scalability;

import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.correttouml.uml2zot.UML2Zot;
import org.correttouml.uml2zot.tests.TestConfiguration;
import org.correttouml.uml2zot.tests.helpers.UML2Helper;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;

public class LeaderElection {

	/** The UML2ZOT entry point for making the transformation */
	private static UML2Zot t;

	private static final Logger LOGGER = Logger
			.getLogger(SequenceDiagram.class);

	public static void main(String[] args) {
		LOGGER.info("Creating the UML model");

		Model myModel = create_leader_election_model();

		// Save it to disk
		UML2Helper.save(myModel,
				URI.createFileURI(TestConfiguration.MODEL_SAVE_PATH)
						.appendSegment(TestConfiguration.MODEL_SAVE_NAME)
						.appendFileExtension(UMLResource.FILE_EXTENSION));

		LOGGER.info("Building the MADES UML representation");
		t = new UML2Zot(
				new File(TestConfiguration.MODEL_FILE).getAbsolutePath());

		LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(100, "meezot", "minisat", new File(
				"output/zot_model.lisp").getAbsolutePath());

	}

	private static Model create_leader_election_model() {
		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(TestConfiguration.MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		PrimitiveType integer=UML2Helper.createPrimitiveType(myModel, "Integer");
		
		org.eclipse.uml2.uml.Class processClass=UML2Helper.createClass(systemPackage, "Process", false);
		UML2Helper.createAttribute(processClass, "active", integer);
		UML2Helper.createAttribute(processClass, "mynumber", integer);
		UML2Helper.createAttribute(processClass, "max", integer);
		UML2Helper.createAttribute(processClass, "neighbourR", integer);
		EList<String> parametersName=new BasicEList<String>();
		EList<Type> parametersType=new BasicEList<Type>();
		parametersName.add("nr");
		parametersType.add(integer);
		UML2Helper.createOperation(processClass, "one", parametersName, parametersType);
		UML2Helper.createOperation(processClass, "two", parametersName, parametersType);
		UML2Helper.createOperation(processClass, "winner", parametersName, parametersType);
		
		//TODO[mottalrd] the XMI generated is different from the one of papyrus. But I don't need it for the zot generation, so who cares
		org.eclipse.uml2.uml.Association processClass_processClass=UML2Helper.createAssociation((org.eclipse.uml2.uml.Type)processClass, true, AggregationKind.NONE_LITERAL, processClass.getName(), 1, 1, (org.eclipse.uml2.uml.Type)processClass, true, AggregationKind.NONE_LITERAL, processClass.getName(), 1, 1);
		
		//Object diagram
		org.eclipse.uml2.uml.InstanceSpecification proc_1=UML2Helper.createInstanceSpecification(systemPackage, processClass, "proc_1");
		org.eclipse.uml2.uml.InstanceSpecification proc_2=UML2Helper.createInstanceSpecification(systemPackage, processClass, "proc_2");
		org.eclipse.uml2.uml.InstanceSpecification proc_3=UML2Helper.createInstanceSpecification(systemPackage, processClass, "proc_3");
		org.eclipse.uml2.uml.InstanceSpecification proc_4=UML2Helper.createInstanceSpecification(systemPackage, processClass, "proc_4");
		org.eclipse.uml2.uml.InstanceSpecification proc_5=UML2Helper.createInstanceSpecification(systemPackage, processClass, "proc_5");
		
		org.eclipse.uml2.uml.InstanceSpecification proc_1_proc_2=UML2Helper.createInstanceSpecificationLink(systemPackage, processClass_processClass,proc_1, proc_2, "proc_1_proc_2");
		org.eclipse.uml2.uml.InstanceSpecification proc_2_proc_3=UML2Helper.createInstanceSpecificationLink(systemPackage, processClass_processClass,proc_2, proc_3, "proc_2_proc_3");
		org.eclipse.uml2.uml.InstanceSpecification proc_4_proc_4=UML2Helper.createInstanceSpecificationLink(systemPackage, processClass_processClass,proc_3, proc_4, "proc_3_proc_4");
		org.eclipse.uml2.uml.InstanceSpecification proc_4_proc_5=UML2Helper.createInstanceSpecificationLink(systemPackage, processClass_processClass,proc_4, proc_5, "proc_4_proc_5");
		
		//STD 
		org.eclipse.uml2.uml.StateMachine process_SM=UML2Helper.createStateMachine(processClass, "Process_SM");
		UML2Helper.createRegion(process_SM);
		org.eclipse.uml2.uml.Pseudostate STATE_0=UML2Helper.createInitialState(process_SM, "start");
		org.eclipse.uml2.uml.State STATE_INIT=UML2Helper.createState(process_SM, "INIT");
		org.eclipse.uml2.uml.State STATE_MAIN=UML2Helper.createState(process_SM, "MAIN");
		org.eclipse.uml2.uml.State STATE_WIN=UML2Helper.createState(process_SM, "WIN");
		org.eclipse.uml2.uml.State STATE_LOST=UML2Helper.createState(process_SM, "LOST");
		
		UML2Helper.createTransition(process_SM, STATE_0, STATE_INIT, "");
		UML2Helper.createTransition(process_SM, STATE_INIT, STATE_MAIN, "/@one(mynumber).call, max=mynumber");
		//no active, just pass the message
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "@one.call[{active==0}]/@one(nr).call"); 
		//no active, just pass the message
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "@two.call[{active==0}]/@two(nr).call"); 
		//active, receive one and pass the info
		
		//TODO[mottalrd] add variable initialization
		//TODO[mottalrd] fix boolean expressions
		//TODO[mottalrd] fix variable inequalities (we can't have right now a==b but only a==const)
		
//		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "one(nr)[active==1 && nr!=max]/two(nr), neighbourR=nr"); 
//		//active, receive two and keep playing
//		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "two(nr)[active==1 && neighbourR>nr && neighbourR>max]/max=neighbourR, one(neighbourR)");  
//		//active, receive two and go out of the game
//		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "two(nr)[active==1 && (neighbourR<=nr || neighbourR<=max)]/active=0, one(neighbourR)"); 
//		//winner found, communicate the winner
//		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "one(nr)[active==1 && nr==max]/winner(nr)"); 
		
		//TODO[mottalrd] clear me (start fake test)
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "@one.call[{active==1} && {nr!=5}]/@two(nr).call, neighbourR=nr"); 
		//active, receive two and keep playing
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "@two.call[{active==1} && {neighbourR>5}]/max=neighbourR, @one(neighbourR).call");  
		//active, receive two and go out of the game
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "@two.call[{active==1} && {neighbourR<=5}]/active=0, @one(neighbourR).call"); 
		//winner found, communicate the winner
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN, "@one.call[{active==1} && {nr==5}]/@winner(nr).call"); 
		//TODO[mottalrd] clear me (end fake test)
		
		//received winner communication, it is me
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_WIN, "@winner.call[{nr==5}]");
		//received winner communication, it is NOT me
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_LOST, "@winner.call[{nr!=5}]");
		
		return myModel;
	}

}
