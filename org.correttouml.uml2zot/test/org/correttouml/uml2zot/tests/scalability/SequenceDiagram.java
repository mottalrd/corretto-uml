package org.correttouml.uml2zot.tests.scalability;

import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.correttouml.uml2zot.UML2Zot;
import org.correttouml.uml2zot.tests.TestHelper;
import org.correttouml.uml2zot.tests.helpers.UML2Helper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;

public class SequenceDiagram {

	public static String MADES_PROFILE_PATH="C:/Users/motta/Desktop/Dottorato/CorrettoUML/org.correttouml.profiles/resources/model.profile.uml";
	public static String MODEL_SAVE_PATH="C:/Users/motta/Desktop/Dottorato/CorrettoUML/org.correttouml.uml2zot/tmp";
	public static String MODEL_SAVE_NAME="model";

	
	/** SCALABILITY **/
	private static String MODEL_FILE="tmp/model.uml";
	
	/** The UML2ZOT entry point for making the transformation */
	private static UML2Zot t;
	
	/** A test helper, works on tmp folder before moving to output folder */
	private static TestHelper testHelper=new TestHelper("output","tmp");	
	
	private static final Logger LOGGER = Logger.getLogger(SequenceDiagram.class); 
	
	public static void main(String[] args){
		LOGGER.info("Creating the UML model");
		//create_scalability_model_1();
		//create_scalability_model_2();
		//create_scalability_model_2b();
		//create_scalability_model_2c();
		//create_scalability_model_2d();
		
		for(int i=10; i<=50; i=i+5){
			//create_scalability_model_4a(i);
			//create_scalability_model_4b(i);
			create_scalability_model_5(i);
			
			LOGGER.info("Building the MADES UML representation");
			t=new UML2Zot(new File(MODEL_FILE).getAbsolutePath());
			
			LOGGER.info("Generate the ZOT File");
			t.generateZOTFile(100, "meezot", "minisat", new File("output/zot_model_"+i+"_msg.lisp").getAbsolutePath());
			//t.generateZOTFile(100, "ae2zot", "z3", new File("output/zot_model_"+i+"_msg.lisp").getAbsolutePath());
		}

	}

	/* SEQUENCE DIAGRAM CON x MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * PROPRIETA': m2 => SomF(m8)
	 * */
	public static void create_scalability_model_5(int x) {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m2=null;
		org.eclipse.uml2.uml.Message m8=null;
		for(int i=0; i<x; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==1) m2=tmp;
			if(i==7) m8=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m8Term=UML2Helper.createTerm(madesProfile, propertyPackage, m8);
		
		//<<SomF>>
		org.eclipse.uml2.uml.Class somf=UML2Helper.createSomF(madesProfile, propertyPackage, m8Term.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m2Term=UML2Helper.createTerm(madesProfile, propertyPackage, m2);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m2Term.getStereotypeApplications().get(0), somf.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}			
	
	/* SEQUENCE DIAGRAM CON x MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * */
	public static void create_scalability_model_4b(int x) {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<x; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}		
	
	/* SEQUENCE DIAGRAM CON x MESSAGGI 
	 * TIPO VERIFICA: SAT
	 * */
	public static void create_scalability_model_4(int x) {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<x; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	
	
	/* 1 SEQUENCE DIAGRAM CON 10 MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: 714 secondi  
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_1() {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<10; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}
	
	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2() {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<50; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	

	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI DENTRO UN IOD 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2b() {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<10; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//IOD
		org.eclipse.uml2.uml.Activity activity=UML2Helper.createActivity(systemPackage, "MyIOD");
		org.eclipse.uml2.uml.InitialNode n1=UML2Helper.createInitialNode(activity, "n1");
		org.eclipse.uml2.uml.ActivityNode n2=UML2Helper.createIODNode(activity, sd1);
		org.eclipse.uml2.uml.FinalNode n3=UML2Helper.createFinalNode(activity, "n2");
		UML2Helper.createControlFlow(activity, n1, n2);
		UML2Helper.createControlFlow(activity, n2, n3);
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	
	
	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI CON UN TIME CONSTRAINT 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2c() {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<10; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		UML2Helper.createSDTimeConstraint(madesProfile, sd1, "@SD1.end-@SD1.start <= 50");
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}		
	
	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI E ALTRETTANTI OGGETTI
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2d() {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		ArrayList<org.eclipse.uml2.uml.Class> classes=new ArrayList<org.eclipse.uml2.uml.Class>();
		ArrayList<org.eclipse.uml2.uml.InstanceSpecification> instances=new ArrayList<org.eclipse.uml2.uml.InstanceSpecification>();
		for(int i=0; i<50; i++){
			org.eclipse.uml2.uml.Class tmp=UML2Helper.createClass(systemPackage, "Class1", false);
			classes.add(tmp);
			UML2Helper.createOperation(tmp, "Operation"+i);
			instances.add(UML2Helper.createInstanceSpecification(systemPackage, tmp, "object"+i));
		}
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		ArrayList<org.eclipse.uml2.uml.Lifeline> lifelines=new ArrayList<org.eclipse.uml2.uml.Lifeline>();
		for(int i=0; i<50; i++){
			org.eclipse.uml2.uml.Lifeline tmp=sd1.createLifeline("l"+i);
			lifelines.add(tmp);
			tmp.setSelector(instances.get(i).getSpecification());
		}
		
		ArrayList<org.eclipse.uml2.uml.Message> messages=new ArrayList<org.eclipse.uml2.uml.Message>();
		for(int i=0; i<50-1; i++){
			messages.add(UML2Helper.createMessage(sd1, lifelines.get(i), lifelines.get(i+1), classes.get(i+1).getAllOperations().get(0), "op"+i+"_message"));
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, messages.get(4));
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, messages.get(5));
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	
	
	/* 1 SEQUENCE DIAGRAM CON 25 MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: ???
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_3() {

		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=UML2Helper.createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=UML2Helper.createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=UML2Helper.createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=UML2Helper.createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=UML2Helper.createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=UML2Helper.createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<25; i++){
			org.eclipse.uml2.uml.Message tmp=UML2Helper.createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=UML2Helper.createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=UML2Helper.createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=UML2Helper.createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=UML2Helper.createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=UML2Helper.createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=UML2Helper.createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}		
	
	

	
}
