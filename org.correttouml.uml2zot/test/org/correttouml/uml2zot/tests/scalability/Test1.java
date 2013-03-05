package org.correttouml.uml2zot.tests.scalability;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.correttouml.uml2zot.UML2Zot;
import org.correttouml.uml2zot.tests.TestHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

	public static String MADES_PROFILE_PATH="C:/Users/motta/Desktop/Dottorato/UML2ZOT/eu.mades.profile/model.profile.uml";
	public static String MODEL_SAVE_PATH="C:/Users/motta/Desktop/Dottorato/UML2ZOT/eu.mades.uml2zot/tmp/";
	public static String MODEL_SAVE_NAME="model";
	public static String UML_LIBRARY_PATH="jar:file:/C:/Users/motta/Desktop/Dottorato/UML2ZOT/eu.mades.uml2zot/lib/org.eclipse.uml2.uml.resources_4.0.0.v20120604-0919.jar!/";
	
	/** SCALABILITY **/
	private String MODEL_FILE="tmp/model.uml";
	
	/** The UML2ZOT entry point for making the transformation */
	private UML2Zot t;
	
	/** A test helper, works on tmp folder before moving to output folder */
	TestHelper testHelper=new TestHelper("output","tmp");	
	
	private static final Logger LOGGER = Logger.getLogger(Test1.class); 
	
	@Before
	public void initialize(){
		LOGGER.info("Creating the UML model");
		//create_scalability_model_1();
		//create_scalability_model_2();
		//create_scalability_model_2b();
		//create_scalability_model_2c();
		//create_scalability_model_2d();
		create_scalability_model_3();
		
		LOGGER.info("Building the MADES UML representation");
		t=new UML2Zot(new File(this.MODEL_FILE).getAbsolutePath());
	}
	
	@Test
	public void TestModel() throws Exception {
		LOGGER.info("Testing "+this.MODEL_FILE);
		
		LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(new File("tmp/zot_model.lisp").getAbsolutePath());
		LOGGER.info("Generate the Mappings File");
		t.generateMappingsFile(new File("tmp/model.mappings"));
		
		assertTrue("Il file di ZOT contiene degli errori",testHelper.isZOTFileValid());
		
		testHelper.cleanUp();
	}
	
	/* 1 SEQUENCE DIAGRAM CON 10 MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: 714 secondi  
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_1() {

		//Preparazione modello e package
		Model myModel = createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<10; i++){
			org.eclipse.uml2.uml.Message tmp=createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}
	
	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2() {

		//Preparazione modello e package
		Model myModel = createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<50; i++){
			org.eclipse.uml2.uml.Message tmp=createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	

	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI DENTRO UN IOD 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2b() {

		//Preparazione modello e package
		Model myModel = createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<10; i++){
			org.eclipse.uml2.uml.Message tmp=createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//IOD
		org.eclipse.uml2.uml.Activity activity=createActivity(systemPackage, "MyIOD");
		org.eclipse.uml2.uml.InitialNode n1=createInitialNode(activity, "n1");
		org.eclipse.uml2.uml.ActivityNode n2=createIODNode(activity, sd1);
		org.eclipse.uml2.uml.FinalNode n3=createFinalNode(activity, "n2");
		createControlFlow(activity, n1, n2);
		createControlFlow(activity, n2, n3);
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	
	
	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI CON UN TIME CONSTRAINT 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2c() {

		//Preparazione modello e package
		Model myModel = createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<10; i++){
			org.eclipse.uml2.uml.Message tmp=createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		createSDTimeConstraint(madesProfile, sd1, "@SD1.end-@SD1.start <= 50");
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}		
	
	/* 1 SEQUENCE DIAGRAM CON 50 MESSAGGI E ALTRETTANTI OGGETTI
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: > 12 ore
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_2d() {

		//Preparazione modello e package
		Model myModel = createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		ArrayList<org.eclipse.uml2.uml.Class> classes=new ArrayList<org.eclipse.uml2.uml.Class>();
		ArrayList<org.eclipse.uml2.uml.InstanceSpecification> instances=new ArrayList<org.eclipse.uml2.uml.InstanceSpecification>();
		for(int i=0; i<50; i++){
			org.eclipse.uml2.uml.Class tmp=createClass(systemPackage, "Class1", false);
			classes.add(tmp);
			createOperation(tmp, "Operation"+i);
			instances.add(createInstanceSpecification(systemPackage, tmp, "object"+i));
		}
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=createInteraction(systemPackage, "SD1");
		ArrayList<org.eclipse.uml2.uml.Lifeline> lifelines=new ArrayList<org.eclipse.uml2.uml.Lifeline>();
		for(int i=0; i<50; i++){
			org.eclipse.uml2.uml.Lifeline tmp=sd1.createLifeline("l"+i);
			lifelines.add(tmp);
			tmp.setSelector(instances.get(i).getSpecification());
		}
		
		ArrayList<org.eclipse.uml2.uml.Message> messages=new ArrayList<org.eclipse.uml2.uml.Message>();
		for(int i=0; i<50-1; i++){
			messages.add(createMessage(sd1, lifelines.get(i), lifelines.get(i+1), classes.get(i+1).getAllOperations().get(0), "op"+i+"_message"));
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=createTerm(madesProfile, propertyPackage, messages.get(4));
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=createTerm(madesProfile, propertyPackage, messages.get(5));
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}	
	
	/* 1 SEQUENCE DIAGRAM CON 25 MESSAGGI 
	 * TIPO VERIFICA: UNSAT
	 * TEMPO: ???
	 * MACCHINA: RAM 4GB, Intel(R) Xeon(R) CPU E5530  @ 2.40GHz
	 * */
	public static void create_scalability_model_3() {

		//Preparazione modello e package
		Model myModel = createModel("ScalabilityModel");
		org.eclipse.uml2.uml.Profile madesProfile = loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class class1=createClass(systemPackage, "Class1", false);
		org.eclipse.uml2.uml.InstanceSpecification object1=createInstanceSpecification(systemPackage, class1, "object1");
		org.eclipse.uml2.uml.Class class2=createClass(systemPackage, "Class2", false);
		org.eclipse.uml2.uml.InstanceSpecification object2=createInstanceSpecification(systemPackage, class2, "object2");
		org.eclipse.uml2.uml.Operation op1=createOperation(class1, "Operation1");
		
		
		//Sequence diagram
		org.eclipse.uml2.uml.Interaction sd1=createInteraction(systemPackage, "SD1");
		org.eclipse.uml2.uml.Lifeline l1=sd1.createLifeline("l1");
		l1.setSelector(object1.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sd1.createLifeline("l2");
		l2.setSelector(object2.getSpecification());
		
		org.eclipse.uml2.uml.Message m5=null;
		org.eclipse.uml2.uml.Message m6=null;
		for(int i=0; i<25; i++){
			org.eclipse.uml2.uml.Message tmp=createMessage(sd1,l1,l2,op1, "op1_message"+i);
			if(i==4) m5=tmp;
			if(i==5) m6=tmp;
		}
		
		//Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype=getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);
		
		//Time Property diagram
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m5Term=createTerm(madesProfile, propertyPackage, m5);
		
		//<<Next>>
		org.eclipse.uml2.uml.Class next=createNext(madesProfile, propertyPackage, m5Term.getStereotypeApplications().get(0));
		
		//<<Not>>
		org.eclipse.uml2.uml.Class not=createNot(madesProfile, propertyPackage, next.getStereotypeApplications().get(0));
		
		//<<Term>>
		org.eclipse.uml2.uml.Class m6Term=createTerm(madesProfile, propertyPackage, m6);
		
		//<<Implies>>
		org.eclipse.uml2.uml.Class implies=createImplies(madesProfile, propertyPackage, m6Term.getStereotypeApplications().get(0), not.getStereotypeApplications().get(0));
		
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createAlw(madesProfile, propertyPackage, implies.getStereotypeApplications().get(0));
		
		//<<Property>>
		createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));
		
		
		//Salvataggio del modell
		save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}		
	
	protected static org.eclipse.uml2.uml.Class createNot(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Alw>>
		org.eclipse.uml2.uml.Class not=createClass(package_, "Not", false);
		org.eclipse.uml2.uml.Stereotype notStereotype=getMADESPropertiesStereotype(madesProfile, "Not");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		not.applyStereotype(booleanFormulaeStereotype);
		not.applyStereotype(notStereotype);
		not.setValue(notStereotype, "formulae", formulae);
		
		return not;
	}		
	
	protected static org.eclipse.uml2.uml.Class createImplies(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject left, EObject right){
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
	
	protected static org.eclipse.uml2.uml.Class createTerm(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Element element){
		//<<Alw>>
		org.eclipse.uml2.uml.Class term=createClass(package_, "Term", false);
		org.eclipse.uml2.uml.Stereotype termStereotype=getMADESPropertiesStereotype(madesProfile, "Term");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		term.applyStereotype(booleanFormulaeStereotype);
		term.applyStereotype(termStereotype);
		term.setValue(termStereotype, "element", element);
		
		return term;
	}	
	
	protected static org.eclipse.uml2.uml.Class createNext(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Alw>>
		org.eclipse.uml2.uml.Class next=createClass(package_, "Next", false);
		org.eclipse.uml2.uml.Stereotype nextStereotype=getMADESPropertiesStereotype(madesProfile, "Next");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		next.applyStereotype(booleanFormulaeStereotype);
		next.applyStereotype(nextStereotype);
		next.setValue(nextStereotype, "formulae", formulae);
		
		return next;
	}		
	
	protected static org.eclipse.uml2.uml.Class createAlw(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Alw>>
		org.eclipse.uml2.uml.Class alw=createClass(package_, "Alw", false);
		org.eclipse.uml2.uml.Stereotype alwStereotype=getMADESPropertiesStereotype(madesProfile, "Alw");
		org.eclipse.uml2.uml.Stereotype booleanFormulaeStereotype=getMADESPropertiesStereotype(madesProfile, "BooleanFormulae");
		alw.applyStereotype(booleanFormulaeStereotype);
		alw.applyStereotype(alwStereotype);
		alw.setValue(alwStereotype, "formulae", formulae);
		
		return alw;
	}	
	
	protected static org.eclipse.uml2.uml.Class createProperty(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Package package_, EObject formulae){
		//<<Property>>
		org.eclipse.uml2.uml.Class property=createClass(package_, "Property", false);
		org.eclipse.uml2.uml.Stereotype propertyClassStereotype=getMADESPropertiesStereotype(madesProfile, "Property");
		property.applyStereotype(propertyClassStereotype);
		property.setValue(propertyClassStereotype, "formulae", formulae);
		
		return property;
	}	
	
    protected static org.eclipse.uml2.uml.InstanceSpecification createInstanceSpecification(org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Class class_, String name) {
        
    	org.eclipse.uml2.uml.InstanceSpecification instanceSpecification = UMLFactory.eINSTANCE.createInstanceSpecification();
    	
    	instanceSpecification.getClassifiers().add(class_);
    	package_.getPackagedElements().add(instanceSpecification);
    	instanceSpecification.setName(name);

        LOGGER.info("InstanceSpecification '" + instanceSpecification.getQualifiedName() + "' created.");

        return instanceSpecification;
    }	
	
    protected static org.eclipse.uml2.uml.Interaction createInteraction(org.eclipse.uml2.uml.Package package_, String name) {
        
    	org.eclipse.uml2.uml.Interaction interaction = UMLFactory.eINSTANCE.createInteraction();
    	
    	package_.getPackagedElements().add(interaction);
    	interaction.setName(name);

        LOGGER.info("Interaction '" + interaction.getQualifiedName() + "' created.");

        return interaction;
    }	
    
    protected static org.eclipse.uml2.uml.Activity createActivity(org.eclipse.uml2.uml.Package package_, String name) {
        
    	org.eclipse.uml2.uml.Activity activity = UMLFactory.eINSTANCE.createActivity();
    	
    	package_.getPackagedElements().add(activity);
    	activity.setName(name);

        LOGGER.info("Activity '" + activity.getQualifiedName() + "' created.");

        return activity;
    } 
    
    protected static org.eclipse.uml2.uml.FinalNode createFinalNode(org.eclipse.uml2.uml.Activity activity, String name){
    	
    	org.eclipse.uml2.uml.FinalNode node=UMLFactory.eINSTANCE.createActivityFinalNode();
    	node.setName(name);
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	LOGGER.info("Activity Final Node '" + node.getQualifiedName() + "' created.");
    	return node;    	
    }
    
    protected static org.eclipse.uml2.uml.InitialNode createInitialNode(org.eclipse.uml2.uml.Activity activity, String name){
    	
    	org.eclipse.uml2.uml.InitialNode node=UMLFactory.eINSTANCE.createInitialNode();
    	node.setName(name);
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	LOGGER.info("Activity Initial Node '" + node.getQualifiedName() + "' created.");
    	return node;    	
    }    
    
    protected static org.eclipse.uml2.uml.CallBehaviorAction createIODNode(org.eclipse.uml2.uml.Activity activity, org.eclipse.uml2.uml.Interaction sd){
    	 
    	org.eclipse.uml2.uml.CallBehaviorAction node=UMLFactory.eINSTANCE.createCallBehaviorAction();
    	node.setName("SD: " + sd.getName());
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	node.setBehavior(sd);
    	LOGGER.info("Activity Node '" + sd.getQualifiedName() + "' created.");
    	return node;
    }
    
    protected static org.eclipse.uml2.uml.ControlFlow createControlFlow(org.eclipse.uml2.uml.Activity activity, org.eclipse.uml2.uml.ActivityNode n1, org.eclipse.uml2.uml.ActivityNode n2){
    	
    	org.eclipse.uml2.uml.ControlFlow c=UMLFactory.eINSTANCE.createControlFlow();
    	c.setActivity(activity);
    	activity.getEdges().add(c);
    	c.setSource(n1);
    	c.setTarget(n2);
    	LOGGER.info("Control Flow '" + n1.getQualifiedName()+"->"+n2.getQualifiedName() + "' created.");
    	return c;
    	
    }
    
    protected static org.eclipse.uml2.uml.Message createMessage(org.eclipse.uml2.uml.Interaction interaction, org.eclipse.uml2.uml.Lifeline l1, org.eclipse.uml2.uml.Lifeline l2, org.eclipse.uml2.uml.Operation operation, String name){
    	
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
    
    protected static org.eclipse.uml2.uml.MessageOccurrenceSpecification createMessageOccurrenceSpecification(org.eclipse.uml2.uml.Lifeline lifeline, org.eclipse.uml2.uml.Message message) {
        
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification moc = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
    	
    	moc.setMessage(message);
    	moc.getCovereds().add(lifeline);
    	moc.setEnclosingInteraction(lifeline.getInteraction());

        LOGGER.info("MessageOccurrenceSpecification of '" + message.getQualifiedName() + "' created.");

        return moc;
    }	
	
    protected static org.eclipse.uml2.uml.Operation createOperation(org.eclipse.uml2.uml.Class class_, String name) {
        org.eclipse.uml2.uml.Operation operation = class_.createOwnedOperation(name, null, null); 
        
        LOGGER.info("Operation '" + operation.getQualifiedName() + "' created.");

        return operation;
    }	
	
    protected static org.eclipse.uml2.uml.Class createClass(org.eclipse.uml2.uml.Package package_, String name, boolean isAbstract) {
        org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass(name, isAbstract);

        LOGGER.info("Class '" + class_.getQualifiedName() + "' created.");

        return class_;
    }
	
	protected static org.eclipse.uml2.uml.Comment createSDTimeConstraint(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Interaction sd, String expression){
		
		org.eclipse.uml2.uml.Comment comment = sd.createOwnedComment();
		//UMLFactory.eINSTANCE.createComment();
		comment.setBody(expression);
		
		org.eclipse.uml2.uml.Stereotype timeConstraintStereotype=getMADESTimeStereotype(madesProfile, "TimeConstraint");
		comment.applyStereotype(timeConstraintStereotype);
		
		return comment;
	}		

	protected static Model createModel(String name) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(name);

		LOGGER.info("Model '" + model.getQualifiedName() + "' created.");

		return model;
	}

	protected static org.eclipse.uml2.uml.Package createPackage(
			org.eclipse.uml2.uml.Package nestingPackage, String name) {
		org.eclipse.uml2.uml.Package package_ = nestingPackage
				.createNestedPackage(name);

		LOGGER.info("Package '" + package_.getQualifiedName()
				+ "' created.");

		return package_;
	}

	@SuppressWarnings("rawtypes")
	protected static void save(org.eclipse.uml2.uml.Package package_, URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
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

	protected static Stereotype getMADESTimeStereotype(Profile madesProfile, String stereotypeName) {
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
	
	protected static Stereotype getMADESVerificationTagsStereotype(Profile madesProfile, String stereotypeName){
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
	
	protected static Stereotype getMADESPropertiesStereotype(Profile madesProfile, String stereotypeName){
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
	
	protected static Profile loadProfile(String pathToModel){
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
