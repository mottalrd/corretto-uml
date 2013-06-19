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
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;

public class FisherProtocol {

	/** The UML2ZOT entry point for making the transformation */
	private UML2Zot t;

	/** Shared model elements **/
	private Model myModel;
	private Profile madesProfile;

	private State STATE_NO_WINNER;
	private State STATE_WINNER;
	private State STATE_ERROR;

	private static final Logger LOGGER = Logger
			.getLogger(SequenceDiagram.class);

	public static void main(String[] args) {
		FisherProtocol experiment = new FisherProtocol();
		experiment.start();
	}

	public void start() {
		LOGGER.info("Creating the UML model");

		for (int i = 5; i <= 10; i = i++) {
			create_fisher_model(i);
			// create_alw_somf_monitor_state_winner();
			// create_alw_not_monitor_state_error();

			// Save it to disk
			UML2Helper.save(myModel,
					URI.createFileURI(TestConfiguration.MODEL_SAVE_PATH)
							.appendSegment(TestConfiguration.MODEL_SAVE_NAME)
							.appendFileExtension(UMLResource.FILE_EXTENSION));

			LOGGER.info("Building the MADES UML representation");
			t = new UML2Zot(
					new File(TestConfiguration.MODEL_FILE).getAbsolutePath());

			LOGGER.info("Generate the ZOT File");
			t.generateZOTFile(75, "ae2zot", "z3", new File("output/zot_model_"
					+ i + "_proc.lisp").getAbsolutePath());
		}

	}

	// Alw(SomF(MONITOR_STATE_WINNER))
	private void create_alw_somf_monitor_state_winner() {

		// Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper
				.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype = UML2Helper
				.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);

		// Time Property diagram

		// <<Term>>
		org.eclipse.uml2.uml.Class MONITOR_STATE_WINNER = UML2Helper
				.createTerm(madesProfile, propertyPackage, STATE_WINNER);

		// <<SomF>>
		org.eclipse.uml2.uml.Class somf = UML2Helper.createSomF(madesProfile,
				propertyPackage, MONITOR_STATE_WINNER
						.getStereotypeApplications().get(0));

		// <<Alw>>
		org.eclipse.uml2.uml.Class alw = UML2Helper.createAlw(madesProfile,
				propertyPackage, somf.getStereotypeApplications().get(0));

		// <<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw
				.getStereotypeApplications().get(0));

	}

	// Alw(Not(MONITOR_STATE_ERROR))
	private void create_alw_not_monitor_state_error() {

		// Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper
				.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype = UML2Helper
				.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);

		// Time Property diagram

		// <<Term>>
		org.eclipse.uml2.uml.Class MONITOR_STATE_ERROR = UML2Helper.createTerm(
				madesProfile, propertyPackage, STATE_ERROR);

		// <<Not>>
		org.eclipse.uml2.uml.Class not = UML2Helper.createNot(madesProfile,
				propertyPackage, MONITOR_STATE_ERROR
						.getStereotypeApplications().get(0));

		// <<Alw>>
		org.eclipse.uml2.uml.Class alw = UML2Helper.createAlw(madesProfile,
				propertyPackage, not.getStereotypeApplications().get(0));

		// <<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw
				.getStereotypeApplications().get(0));

	}

	private void create_fisher_model(int num_process) {
		// Preparazione modello e package
		myModel = UML2Helper.createModel("Fisher Protocol Model");
		madesProfile = UML2Helper
				.loadProfile(TestConfiguration.MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);

		// Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(
				myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype = UML2Helper
				.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);

		// Class diagram
		PrimitiveType integer = UML2Helper.createPrimitiveType(myModel,
				"Integer");

		org.eclipse.uml2.uml.Class processClass = UML2Helper.createClass(
				systemPackage, "Process", false);

		Property pid_attr = UML2Helper.createAttribute(processClass, "pid",
				integer);
		// TODO: this is a global variable, trick made by hand on lisp
		UML2Helper.createIntegerAttribute(processClass, "id", integer, 0);
		UML2Helper.createIntegerAttribute(processClass, "counter", integer, 0);

		ArrayList<InstanceSpecification> processes = new ArrayList<InstanceSpecification>();
		for (int i = 0; i < num_process; i++) {
			IdGenerator gen = new IdGenerator(0, num_process * 3);
			int id = gen.getNextId();

			InstanceSpecification tmp = UML2Helper.createInstanceSpecification(
					systemPackage, processClass, "proc_" + id);
			UML2Helper.createIntegerSlot(tmp, pid_attr, id);
			processes.add(tmp);
		}

		// STD PROCESS
		org.eclipse.uml2.uml.StateMachine process_SM = UML2Helper
				.createStateMachine(processClass, "Process_SM");
		UML2Helper.createRegion(process_SM);
		org.eclipse.uml2.uml.Pseudostate STATE_0 = UML2Helper
				.createInitialState(process_SM, "start");
		org.eclipse.uml2.uml.State STATE_FISHERP = UML2Helper.createState(
				process_SM, "FISHERP");
		org.eclipse.uml2.uml.State STATE_REQ = UML2Helper.createState(
				process_SM, "REQ");
		org.eclipse.uml2.uml.State STATE_UPDATED = UML2Helper.createState(
				process_SM, "UPDATED");
		org.eclipse.uml2.uml.State STATE_WAIT = UML2Helper.createState(
				process_SM, "WAIT");
		org.eclipse.uml2.uml.State STATE_CS = UML2Helper.createState(
				process_SM, "CS");
		org.eclipse.uml2.uml.State STATE_EXIT = UML2Helper.createState(
				process_SM, "EXIT");

		// initial transition
		UML2Helper.createTransition(process_SM, STATE_0, STATE_FISHERP, "");
		UML2Helper.createTransition(process_SM, STATE_FISHERP, STATE_REQ,
				"[id==-1]");
		UML2Helper.createTransition(process_SM, STATE_REQ, STATE_UPDATED,
				"@now - @REQ.enter == 3/id=pid");
		UML2Helper.createTransition(process_SM, STATE_UPDATED, STATE_WAIT,
				"@now - @REQ.enter == 4");
		UML2Helper.createTransition(process_SM, STATE_WAIT, STATE_CS,
				"[id==pid]");
		UML2Helper.createTransition(process_SM, STATE_WAIT, STATE_FISHERP,
				"[id!=pid]");
		UML2Helper.createTransition(process_SM, STATE_CS, STATE_EXIT, "/counter=counter+1");
		UML2Helper.createTransition(process_SM, STATE_EXIT, STATE_FISHERP, "/id=-1, counter=counter-1");

	}

	private class IdGenerator {
		/**
		 * Given a set of adiacent ids returns each of them in random order
		 * 
		 * @author motta
		 * 
		 */

		ArrayList<Integer> ids = new ArrayList<Integer>();

		public IdGenerator(int min, int max) {
			for (int i = min; i <= max; i++)
				ids.add(i);
		}

		public int getNextId() {

			int r = ids.get(this.getRandom(0, ids.size()));
			ids.remove(ids.indexOf(r));

			return r;
		}

		private int getRandom(int min, int max) {
			return min + (int) (Math.random() * ((max - min) + 1));
		}

	}

}
