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
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;

public class LeaderElection {

	/** The UML2ZOT entry point for making the transformation */
	private UML2Zot t;

	/** Shared model elements **/
	private Model myModel;
	private Profile madesProfile;

	private State STATE_NO_WINNER;
	private State STATE_WINNER;
	private State STATE_ERROR;
	private State GENERATOR_END;

	private static final Logger LOGGER = Logger
			.getLogger(SequenceDiagram.class);

	public static void main(String[] args) {
		LeaderElection experiment = new LeaderElection();
		experiment.start();
	}

	public void start() {
		LOGGER.info("Creating the UML model");
		String modeltype = "";
		int numOfProcesses = 3;
		
//		(alwf (!! (somf (-P- $OBJidGenerator_STDIdGenerator_SM_STATEEND))))
		modeltype = "sat"; create_leader_election_model(numOfProcesses, "stateEnd = idGenerator.getState(IdGenerator_SM, end)\n"
				+ "inStateEnd = idGenerator.in(stateEnd)\n"
				+ "Corretto.verify(Time.alwaysTrue(!(Time.eventually(inStateEnd))))");

//		(alwf (-> (somf (-P- $OBJidGenerator_STDIdGenerator_SM_STATEEND)) (somf (-P- $OBJmonitor_STDMonitor_SM_STATESTATE_WINNER))))
//		modeltype = "p1"; create_leader_election_model(numOfProcesses, "stateEnd = idGenerator.getState(IdGenerator_SM, end)\n"
//				+ "inStateEnd = idGenerator.in(stateEnd)\n"
//				+ "stateWinner = monitor.getState(Monitor_SM, state_Winner)\n"
//				+ "inStateWinner = monitor.in(stateWinner)\n"
//				+ "Corretto.verify(Time.alwaysTrue(Time.eventually(inStateEnd) => Time.eventually(inStateWinner)))");
		
////		(alwf (!! (-P- $OBJmonitor_STDMonitor_SM_STATESTATE_ERROR)))
//		modeltype = "p2"; create_leader_election_model(numOfProcesses, "stateError= monitor.getState(monitor_SM, State_Error)\n"
//				+ "inStateError = monitor.in(stateError)\n"
//				+ "Corretto.verify(Time.neverTrue(inStateError))");
		
		// Save it to disk
		UML2Helper.save(myModel,
				URI.createFileURI(TestConfiguration.MODEL_SAVE_PATH)
						.appendSegment(TestConfiguration.MODEL_SAVE_NAME)
						.appendFileExtension(UMLResource.FILE_EXTENSION));

		LOGGER.info("Building the MADES UML representation");
		t = new UML2Zot(
				new File(TestConfiguration.MODEL_FILE).getAbsolutePath());

		LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(25, "ae2bvzot", "z3",
				new File("output/leader-"+modeltype+"-"+numOfProcesses+".lisp").getAbsolutePath());
			
	}
	
	//Alw(SomF(IDGENERATOR_STATE_END) => SomF(MONITOR_STATE_WINNER))
	private void create_alw_somf_idgenerator_stateend_implies_somf_monitor_state_winner() {

		// Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype = UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);

		// Time Property diagram
		
		// <<Term>>
		org.eclipse.uml2.uml.Class MONITOR_STATE_WINNER = UML2Helper.createTerm(madesProfile, propertyPackage, STATE_WINNER);

		// <<SomF>>
		org.eclipse.uml2.uml.Class somf2 = UML2Helper.createSomF(madesProfile, propertyPackage, MONITOR_STATE_WINNER.getStereotypeApplications().get(0));

		// <<Term>>
		org.eclipse.uml2.uml.Class IDGENERATOR_STATE_END = UML2Helper.createTerm(madesProfile, propertyPackage, GENERATOR_END);
		
		// <<SomF>>
		org.eclipse.uml2.uml.Class somf1 = UML2Helper.createSomF(madesProfile, propertyPackage, IDGENERATOR_STATE_END.getStereotypeApplications().get(0));
		
		// <<Implies>>
		org.eclipse.uml2.uml.Class implies = UML2Helper.createImplies(madesProfile, propertyPackage, somf1.getStereotypeApplications().get(0), somf2.getStereotypeApplications().get(0));
		
		// <<Alw>>
		org.eclipse.uml2.uml.Class alw = UML2Helper.createAlw(madesProfile,propertyPackage, implies.getStereotypeApplications().get(0));

		// <<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));

	}
	
	//Alw(Not(MONITOR_STATE_ERROR))
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
		org.eclipse.uml2.uml.Class not = UML2Helper.createNot(
				madesProfile, propertyPackage, MONITOR_STATE_ERROR
						.getStereotypeApplications().get(0));

		// <<Alw>>
		org.eclipse.uml2.uml.Class alw = UML2Helper.createAlw(madesProfile,
				propertyPackage, not.getStereotypeApplications().get(0));

		// <<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw
				.getStereotypeApplications().get(0));

	}

	private void create_invariant_for_satTPD() {

		// Creazione <<Property>> package
		org.eclipse.uml2.uml.Package propertyPackage = UML2Helper.createPackage(myModel, "Property");
		org.eclipse.uml2.uml.Stereotype propertyStereotype = UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "Property");
		propertyPackage.applyStereotype(propertyStereotype);

		// Time Property diagram
		
		// <<Term>>
		org.eclipse.uml2.uml.Class IDGENERATOR_STATE_END = UML2Helper.createTerm(madesProfile, propertyPackage, GENERATOR_END);
		
		// <<SomF>>
		org.eclipse.uml2.uml.Class somf1 = UML2Helper.createSomF(madesProfile, propertyPackage, IDGENERATOR_STATE_END.getStereotypeApplications().get(0));
		
		// <<Implies>>
		org.eclipse.uml2.uml.Class not = UML2Helper.createNot(madesProfile, propertyPackage, somf1.getStereotypeApplications().get(0));
		
		// <<Alw>>
		org.eclipse.uml2.uml.Class alw = UML2Helper.createAlw(madesProfile,propertyPackage, not.getStereotypeApplications().get(0));

		// <<Property>>
		UML2Helper.createProperty(madesProfile, propertyPackage, alw.getStereotypeApplications().get(0));

	}
	
	private void create_leader_election_model(int num_process, String property) {
		// Prepare the model and the package
		myModel = UML2Helper.createModel("ScalabilityModel");
		madesProfile = UML2Helper
				.loadProfile(TestConfiguration.MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);

		// Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(
				myModel, "System");
		
		UML2Helper.createConstraint(systemPackage, "property", property);
		
		org.eclipse.uml2.uml.Stereotype systemStereotype = UML2Helper
				.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);

		// CLASS DIAGRAM - classes
		PrimitiveType integer = UML2Helper.createPrimitiveType(myModel,
				"Integer");

		org.eclipse.uml2.uml.Class idGeneratorClass = UML2Helper.createClass(
				systemPackage, "IdGenerator", false);
		for(int i=0; i<num_process; i++){
			UML2Helper.createAttribute(idGeneratorClass, "idattr" + i, integer);
		}
		
		org.eclipse.uml2.uml.Class processClass = UML2Helper.createClass(
				systemPackage, "Process", false);
		
		Property active_attr = UML2Helper.createAttribute(processClass, "active", integer);
		Property mynumber_attr = UML2Helper.createAttribute(processClass, "mynumber", integer);
		Property max_attr = UML2Helper.createAttribute(processClass, "max", integer);
		Property neighbourR_attr = UML2Helper.createAttribute(processClass, "neighbourR", integer);
		
		//This guy is going to monitor if we have a winner
		org.eclipse.uml2.uml.Class monitorClass = UML2Helper.createClass(
				systemPackage, "Monitor", false);
		org.eclipse.uml2.uml.Signal we_have_winner_signal = UML2Helper.createSignal(systemPackage, "we_have_winner");

		// TODO[mottalrd] need predicate disambiguation for parameters
		EList<String> one_parametersName = new BasicEList<String>();
		EList<Type> one_parametersType = new BasicEList<Type>();
		one_parametersName.add("one_nr");
		one_parametersType.add(integer);

		EList<String> two_parametersName = new BasicEList<String>();
		EList<Type> two_parametersType = new BasicEList<Type>();
		two_parametersName.add("two_nr");
		two_parametersType.add(integer);

		EList<String> win_parametersName = new BasicEList<String>();
		EList<Type> win_parametersType = new BasicEList<Type>();
		win_parametersName.add("win_nr");
		win_parametersType.add(integer);
		
		EList<String> setId_parametersName = new BasicEList<String>();
		EList<Type> setId_parametersType = new BasicEList<Type>();
		setId_parametersName.add("myId");
		setId_parametersType.add(integer);

		UML2Helper.createOperation(processClass, "one", one_parametersName,
				one_parametersType);
		UML2Helper.createOperation(processClass, "two", two_parametersName,
				two_parametersType);
		UML2Helper.createOperation(processClass, "winner", win_parametersName,
				win_parametersType);
		UML2Helper.createOperation(processClass, "setId", setId_parametersName,
				setId_parametersType);

		// TODO[mottalrd] the XMI generated is different from the one of
		// papyrus. UML2Zot uses the link instances hence this is actually ignored
		// for semantics generation
		org.eclipse.uml2.uml.Association processClass_processClass = UML2Helper
				.createAssociation("link",
						processClass, true,
						AggregationKind.NONE_LITERAL, "in", 1, 1,
						processClass, true,
						AggregationKind.NONE_LITERAL, "out", 1, 1);
		
		ArrayList<Association> idGeneratorAssociationList=new ArrayList<Association>();
		for(int i=0; i<num_process; i++){
			Association tmp = UML2Helper
					.createAssociation("gen_link_proc"+i,
							idGeneratorClass, true,
							AggregationKind.NONE_LITERAL, "in", 1, 1,
							processClass, true,
							AggregationKind.NONE_LITERAL, "out", 1, 1);
			idGeneratorAssociationList.add(tmp);	
		}

		// CLASS DIAGRAM - instances
		ArrayList<InstanceSpecification> processes=new ArrayList<InstanceSpecification>();
		IdGenerator gen=new IdGenerator(0, num_process);
		for(int i=0; i<num_process; i++){
			int id=gen.getNextId();
			
			InstanceSpecification tmp=UML2Helper
			.createInstanceSpecification(systemPackage, processClass,
					"proc_"+id);
			
			UML2Helper.createIntegerSlot(tmp, active_attr, 1);
			UML2Helper.createIntegerSlot(tmp, neighbourR_attr, 0);
			processes.add(tmp);
		}
		org.eclipse.uml2.uml.InstanceSpecification monitor = UML2Helper
				.createInstanceSpecification(systemPackage, monitorClass,
						"monitor");
		org.eclipse.uml2.uml.InstanceSpecification idGenerator = UML2Helper
				.createInstanceSpecification(systemPackage, idGeneratorClass,
						"idGenerator");

		//Build the process ring
		for(int i=0; i<num_process; i++){
			int pos1=i % num_process;
			int pos2=(i+1) % num_process;
			
			InstanceSpecification proc_1=processes.get(pos1);
			InstanceSpecification proc_2=processes.get(pos2);
			
			UML2Helper.createInstanceSpecificationLink(proc_1.getName()+"_"+proc_2.getName(),
							systemPackage, processClass_processClass, "in", proc_1,
							"out", proc_2);
		}
		
		// Connect the idGenerator to the processes
		for(int i=0; i<num_process; i++){
			InstanceSpecification proc=processes.get(i);
			Association association = idGeneratorAssociationList.get(i);
			
			UML2Helper.createInstanceSpecificationLink(idGenerator.getName()+"_"+proc.getName(),
					systemPackage, association, "in", idGenerator,
					"out", proc);
		}

		// STATE DIAGRAMS
		
		// STATE DIAGRAM - IDGENERATOR
		org.eclipse.uml2.uml.StateMachine idGenerator_SM = UML2Helper
				.createStateMachine(idGeneratorClass, "IdGenerator_SM");
		UML2Helper.createRegion(idGenerator_SM);

		org.eclipse.uml2.uml.Pseudostate GENERATOR_START = UML2Helper.createInitialState(idGenerator_SM, "START");
		org.eclipse.uml2.uml.State GENERATOR_SETID = UML2Helper.createState(idGenerator_SM, "SETID");
		GENERATOR_END = UML2Helper.createState(idGenerator_SM, "END");
		
//		UML2Helper.createTransition(idGenerator_SM, GENERATOR_START, GENERATOR_SETID, 
//				"@now - @START.enter > 1");
		UML2Helper.createTransition(idGenerator_SM, GENERATOR_START, GENERATOR_SETID, 
				"");

		String transition_guard = "";
		String transition_action = "";
		for (int i = 0; i < num_process - 1 ; i++) {
			for (int j = i + 1; j < num_process ; j++) {
				transition_guard += "{idattr" + i + "!=idattr" + j + "} && ";
			}
		}
		for (int i = 0; i < num_process; i++) {
			transition_action += "#gen_link_proc" + i + ".out@setId(idattr" + i + ").call, ";
		}
		transition_guard = transition_guard.substring(0, transition_guard.length() - 4);
		transition_action = transition_action.substring(0, transition_action.length() - 2);
//		For 3 processes:
//		UML2Helper.createTransition(idGenerator_SM, GENERATOR_SETID, GENERATOR_END, 
//				"[{idattr0!=idattr1} && {idattr0!=idattr2} && {idattr1!=idattr2}]/#gen_link_proc0.out@setId(idattr0).call, #gen_link_proc1.out@setId(idattr1).call, #gen_link_proc2.out@setId(idattr2).call");
		UML2Helper.createTransition(idGenerator_SM, GENERATOR_SETID, GENERATOR_END, "[" + transition_guard + "]/" + transition_action);
		// STATE DIAGRAM - MONITOR
		org.eclipse.uml2.uml.StateMachine monitor_SM = UML2Helper
				.createStateMachine(monitorClass, "Monitor_SM");
		UML2Helper.createRegion(monitor_SM);
		org.eclipse.uml2.uml.Pseudostate MONITOR_INIT = UML2Helper
				.createInitialState(monitor_SM, "start");
		STATE_NO_WINNER = UML2Helper.createState(
				monitor_SM, "STATE_NO_WINNER");
		STATE_WINNER = UML2Helper.createState(
				monitor_SM, "STATE_WINNER");
		STATE_ERROR = UML2Helper.createState(
				monitor_SM, "STATE_ERROR");		
		UML2Helper.createTransition(monitor_SM, MONITOR_INIT, STATE_NO_WINNER, "");
		UML2Helper.createTransition(monitor_SM, STATE_NO_WINNER, STATE_WINNER, "we_have_winner.sig");
		UML2Helper.createTransition(monitor_SM, STATE_WINNER, STATE_ERROR, "we_have_winner.sig");
		
		
		// STATE DIAGRAM - PROCESS
		org.eclipse.uml2.uml.StateMachine process_SM = UML2Helper
				.createStateMachine(processClass, "Process_SM");
		UML2Helper.createRegion(process_SM);
		org.eclipse.uml2.uml.Pseudostate STATE_0 = UML2Helper
				.createInitialState(process_SM, "start");
		org.eclipse.uml2.uml.State STATE_INIT = UML2Helper.createState(
				process_SM, "INIT");
		org.eclipse.uml2.uml.State STATE_MAIN = UML2Helper.createState(
				process_SM, "MAIN");
		org.eclipse.uml2.uml.State STATE_WIN = UML2Helper.createState(
				process_SM, "WIN");
		org.eclipse.uml2.uml.State STATE_LOST = UML2Helper.createState(
				process_SM, "LOST");

		// initial transition
		UML2Helper.createTransition(process_SM, STATE_0, STATE_INIT, "");
		UML2Helper.createTransition(process_SM, STATE_INIT, STATE_MAIN,//main
				"@setId.call / mynumber=<P>myId, #link.out@one(mynumber).call, max=mynumber");
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN,
				"@one.call[{active==0}]/#link.out@one(<P>one_nr).call");
		// no active, just pass the message
		UML2Helper.createTransition(process_SM, STATE_MAIN, STATE_MAIN,
				"@two.call[{active==0}]/#link.out@two(<P>two_nr).call");
		// active, receive one and pass the info
		UML2Helper
				.createTransition(
						process_SM,
						STATE_MAIN,
						STATE_MAIN,
						"@one.call[{active==1} && {one_nr!=max}]/#link.out@two(<P>one_nr).call, neighbourR=<P>one_nr");
		// active, receive two and keep playing
		UML2Helper
				.createTransition(
						process_SM,
						STATE_MAIN,
						STATE_MAIN,
						"@two.call[{active==1} && {neighbourR>two_nr} && {neighbourR>max}]/max=<P>neighbourR, #link.out@one(<P>neighbourR).call");
		// active, receive two and go out of the game
		UML2Helper
				.createTransition(
						process_SM,
						STATE_MAIN,
						STATE_MAIN,
						"@two.call[{active==1} && ({neighbourR<=two_nr} || {neighbourR<=max})]/active=0");
		// winner found, communicate the winner
		UML2Helper
				.createTransition(process_SM, STATE_MAIN, STATE_MAIN,
						"@one.call[{active==1} && {one_nr==max}]/#link.out@winner(<P>one_nr).call, @we_have_winner.sig");
		// received winner communication, it is me
		UML2Helper
				.createTransition(process_SM, STATE_MAIN, STATE_WIN,
						"@winner.call[{win_nr==mynumber}]/#link.out@winner(<P>win_nr).call");
		// received winner communication, it is NOT me
		UML2Helper
				.createTransition(process_SM, STATE_MAIN, STATE_LOST,
						"@winner.call[{win_nr!=mynumber}]/#link.out@winner(<P>win_nr).call");

	}

	private class IdGenerator{		
		private ArrayList<Integer> ids=new ArrayList<Integer>();
		
		public IdGenerator(int min, int max){
			for(int i=min; i<=max; i++) ids.add(i);
		}
		
		public int getNextId(){
			int r=ids.get(0); 
			ids.remove(ids.indexOf(r));		
			return r;
		}
	}
}
