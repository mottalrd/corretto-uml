package org.correttouml.uml2zot.tests.scalability;

import java.io.File;

import org.apache.log4j.Logger;
import org.correttouml.uml2zot.UML2Zot;
import org.correttouml.uml2zot.tests.helpers.UML2Helper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;

public class RadarTXT {

	public static String MADES_PROFILE_PATH="C:/Users/motta/Desktop/Dottorato/CorrettoUML/org.correttouml.profiles/resources/model.profile.uml";
	public static String MODEL_SAVE_PATH="C:/Users/motta/Desktop/Dottorato/CorrettoUML/org.correttouml.uml2zot/tmp";
	public static String MODEL_SAVE_NAME="model";

	
	/** SCALABILITY **/
	private static String MODEL_FILE="tmp/model.uml";
	
	/** The UML2ZOT entry point for making the transformation */
	private static UML2Zot t;
	
	private static final Logger LOGGER = Logger.getLogger(SequenceDiagram.class); 
	
	public static void main(String[] args){
		LOGGER.info("Creating the UML model");
		create_txt_model();
		
		LOGGER.info("Building the MADES UML representation");
		t=new UML2Zot(new File(MODEL_FILE).getAbsolutePath());
		
		LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(100, "meezot", "minisat", new File("output/zot_model.lisp").getAbsolutePath());
		//t.generateZOTFile(100, "ae2zot", "z3", new File("output/zot_model_"+i+"_msg.lisp").getAbsolutePath());

	}

	private static void create_txt_model() {
		//Preparazione modello e package
		Model myModel = UML2Helper.createModel("Radar TXT");
		org.eclipse.uml2.uml.Profile madesProfile = UML2Helper.loadProfile(MADES_PROFILE_PATH);
		myModel.createElementImport(madesProfile);
		myModel.applyProfile(madesProfile);
		
		//Creazione <<System>> package
		org.eclipse.uml2.uml.Package systemPackage = UML2Helper.createPackage(myModel, "System");
		org.eclipse.uml2.uml.Stereotype systemStereotype=UML2Helper.getMADESVerificationTagsStereotype(madesProfile, "System");
		systemPackage.applyStereotype(systemStereotype);
		
		//Class diagram
		org.eclipse.uml2.uml.Class swEnvironment=UML2Helper.createClass(systemPackage, "swEnvironment", false);
		org.eclipse.uml2.uml.InstanceSpecification environment=UML2Helper.createInstanceSpecification(systemPackage, swEnvironment, "environment");
		org.eclipse.uml2.uml.Operation swEnvironmentop1=UML2Helper.createOperation(swEnvironment, "main_panel_getButton");
		org.eclipse.uml2.uml.Operation swEnvironmentop2=UML2Helper.createOperation(swEnvironment, "main_radar_getSts");
		org.eclipse.uml2.uml.Operation swEnvironmentop3=UML2Helper.createOperation(swEnvironment, "main_nav_getLatitude");
		org.eclipse.uml2.uml.Operation swEnvironmentop4=UML2Helper.createOperation(swEnvironment, "main_nav_getLongitude");
		org.eclipse.uml2.uml.Operation swEnvironmentop5=UML2Helper.createOperation(swEnvironment, "main_weather_getStatus");
		org.eclipse.uml2.uml.Operation swEnvironmentop6=UML2Helper.createOperation(swEnvironment, "main_panel_setLed");
		org.eclipse.uml2.uml.Operation swEnvironmentop7=UML2Helper.createOperation(swEnvironment, "main_radar_setCmd");
		org.eclipse.uml2.uml.Operation swEnvironmentop8=UML2Helper.createOperation(swEnvironment, "main_weather_setNewImage");
		org.eclipse.uml2.uml.Operation swEnvironmentop9=UML2Helper.createOperation(swEnvironment, "main_weather_setImage");
		org.eclipse.uml2.uml.Operation swEnvironmentop10=UML2Helper.createOperation(swEnvironment, "main_radar_getResult");
		org.eclipse.uml2.uml.Operation swEnvironmentop11=UML2Helper.createOperation(swEnvironment, "nav_setLatitude");
		org.eclipse.uml2.uml.Operation swEnvironmentop12=UML2Helper.createOperation(swEnvironment, "nav_setLongitude");
		org.eclipse.uml2.uml.Operation swEnvironmentop13=UML2Helper.createOperation(swEnvironment, "panel_getLed");
		org.eclipse.uml2.uml.Operation swEnvironmentop14=UML2Helper.createOperation(swEnvironment, "panel_setButton");
		org.eclipse.uml2.uml.Operation swEnvironmentop15=UML2Helper.createOperation(swEnvironment, "weather_getNewImage");
		org.eclipse.uml2.uml.Operation swEnvironmentop16=UML2Helper.createOperation(swEnvironment, "weather_getImage");
		org.eclipse.uml2.uml.Operation swEnvironmentop17=UML2Helper.createOperation(swEnvironment, "weather_setStatus");
		org.eclipse.uml2.uml.Operation swEnvironmentop18=UML2Helper.createOperation(swEnvironment, "radar_getCmd");
		org.eclipse.uml2.uml.Operation swEnvironmentop19=UML2Helper.createOperation(swEnvironment, "radar_setSts");
		org.eclipse.uml2.uml.Operation swEnvironmentop20=UML2Helper.createOperation(swEnvironment, "radar_setResult");
		
		org.eclipse.uml2.uml.Class swMainMMI=UML2Helper.createClass(systemPackage, "swMainMMI", false);
		org.eclipse.uml2.uml.InstanceSpecification mainMMI=UML2Helper.createInstanceSpecification(systemPackage, swMainMMI, "mainMMI");
		org.eclipse.uml2.uml.Operation swMainMMIop1=UML2Helper.createOperation(swMainMMI, "activeMainMMI");
		org.eclipse.uml2.uml.Operation swMainMMIop2=UML2Helper.createOperation(swMainMMI, "getData");
		org.eclipse.uml2.uml.Operation swMainMMIop3=UML2Helper.createOperation(swMainMMI, "processData");
		org.eclipse.uml2.uml.Operation swMainMMIop4=UML2Helper.createOperation(swMainMMI, "setData");
		org.eclipse.uml2.uml.Operation swMainMMIop5=UML2Helper.createOperation(swMainMMI, "showData");
		
		org.eclipse.uml2.uml.Class swPanelData=UML2Helper.createClass(systemPackage, "swPanelData", false);
		org.eclipse.uml2.uml.InstanceSpecification panelData=UML2Helper.createInstanceSpecification(systemPackage, swPanelData, "panelData");
		org.eclipse.uml2.uml.Operation swPanelDataop1=UML2Helper.createOperation(swPanelData, "activePanelData");
		org.eclipse.uml2.uml.Operation swPanelDataop2=UML2Helper.createOperation(swPanelData, "getData");
		org.eclipse.uml2.uml.Operation swPanelDataop3=UML2Helper.createOperation(swPanelData, "processData");
		org.eclipse.uml2.uml.Operation swPanelDataop4=UML2Helper.createOperation(swPanelData, "setData");
		org.eclipse.uml2.uml.Operation swPanelDataop5=UML2Helper.createOperation(swPanelData, "showData");
		
		org.eclipse.uml2.uml.Class swRadarData=UML2Helper.createClass(systemPackage, "swRadarData", false);
		org.eclipse.uml2.uml.InstanceSpecification radarData=UML2Helper.createInstanceSpecification(systemPackage, swRadarData, "radarData");
		org.eclipse.uml2.uml.Operation swRadarDataop1=UML2Helper.createOperation(swRadarData, "activePanelData");
		org.eclipse.uml2.uml.Operation swRadarDataop2=UML2Helper.createOperation(swRadarData, "getData");
		org.eclipse.uml2.uml.Operation swRadarDataop3=UML2Helper.createOperation(swRadarData, "processData");
		org.eclipse.uml2.uml.Operation swRadarDataop4=UML2Helper.createOperation(swRadarData, "setData");
		org.eclipse.uml2.uml.Operation swRadarDataop5=UML2Helper.createOperation(swRadarData, "showData");
		
		org.eclipse.uml2.uml.Class swNavData=UML2Helper.createClass(systemPackage, "swNavData", false);
		org.eclipse.uml2.uml.InstanceSpecification navData=UML2Helper.createInstanceSpecification(systemPackage, swNavData, "navData");
		org.eclipse.uml2.uml.Operation swNavDataop1=UML2Helper.createOperation(swNavData, "activePanelData");
		org.eclipse.uml2.uml.Operation swNavDataop2=UML2Helper.createOperation(swNavData, "getData");
		org.eclipse.uml2.uml.Operation swNavDataop3=UML2Helper.createOperation(swNavData, "processData");
		org.eclipse.uml2.uml.Operation swNavDataop4=UML2Helper.createOperation(swNavData, "setData");
		org.eclipse.uml2.uml.Operation swNavDataop5=UML2Helper.createOperation(swNavData, "showData");
		
		org.eclipse.uml2.uml.Class swWeatherData=UML2Helper.createClass(systemPackage, "swWeatherData", false);
		org.eclipse.uml2.uml.InstanceSpecification weatherData=UML2Helper.createInstanceSpecification(systemPackage, swWeatherData, "weatherData");
		org.eclipse.uml2.uml.Operation swWeatherDataop1=UML2Helper.createOperation(swWeatherData, "activePanelData");
		org.eclipse.uml2.uml.Operation swWeatherDataop2=UML2Helper.createOperation(swWeatherData, "getData");
		org.eclipse.uml2.uml.Operation swWeatherDataop3=UML2Helper.createOperation(swWeatherData, "processData");
		org.eclipse.uml2.uml.Operation swWeatherDataop4=UML2Helper.createOperation(swWeatherData, "setData");
		org.eclipse.uml2.uml.Operation swWeatherDataop5=UML2Helper.createOperation(swWeatherData, "showData");
		
		
		//Sequence diagram MainMMIToEnvironment
		org.eclipse.uml2.uml.Interaction sdMainMMIToEnvironment=UML2Helper.createInteraction(systemPackage, "SDMainMMIToEnvironment");
		org.eclipse.uml2.uml.Lifeline l1=sdMainMMIToEnvironment.createLifeline("l1");
		l1.setSelector(mainMMI.getSpecification());
		org.eclipse.uml2.uml.Lifeline l2=sdMainMMIToEnvironment.createLifeline("l2");
		l2.setSelector(environment.getSpecification());
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop1, "main_panel_getButton_message");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop2, "main_radar_getSts");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop10, "main_radar_getResult");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop3, "main_nav_getLatitude");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop4, "main_nav_getLongitude");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l1, swMainMMIop3, "processData");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop6, "main_panel_setLed");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop7, "main_panel_setCmd");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop8, "main_weather_setNewImage");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l2, swEnvironmentop9, "main_weather_setImage");
		UML2Helper.createMessage(sdMainMMIToEnvironment, l1, l1, swMainMMIop5, "showData");
		
		
		//Salvataggio del modell
		UML2Helper.save(myModel, URI.createFileURI(MODEL_SAVE_PATH).appendSegment(MODEL_SAVE_NAME).appendFileExtension(UMLResource.FILE_EXTENSION)); 		
	}
	
	
}
