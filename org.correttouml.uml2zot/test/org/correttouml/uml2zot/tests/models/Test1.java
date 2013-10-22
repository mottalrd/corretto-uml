package org.correttouml.uml2zot.tests.models;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragment;
import org.correttouml.uml2zot.UML2Zot;
import org.correttouml.uml2zot.semantics.sequencediagram.SBorders;
import org.correttouml.uml2zot.semantics.sequencediagram.SOrder;
import org.correttouml.uml2zot.semantics.util.bool.Atom;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.tests.TestHelper;
import org.junit.Test;

import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;


public class Test1 {
	private static final Logger LOGGER = Logger.getLogger(Test1.class); 
	/** THE CCAS MODEL */
	//private String MODEL_FILE="testmodels/ccas/v0.1/model.uml";
	//private String MODEL_FILE="testmodels/ccas/v0.2/model.uml";
	//private String MODEL_FILE="testmodels/plugin/model.uml";
	
	//###<del me>
//	String concurrent=new SOrder(new Predicate("ev1"),new Predicate("ev2"), new Or(new Predicate("sd_stop"),new Predicate("sd_end")), true).toString();
//	String noConcurrent=new SOrder(new Predicate("ev1"),new Predicate("ev2"), new Or(new Predicate("sd_stop"),new Predicate("sd_end")), false).toString();
//	String borders = new SBorders(new Predicate("sd1"), new Or(new Predicate("sd1_Stop"),new Predicate("sd1_end"))).toString();
	//###</del me>
	
	/** SD_CF */
//	private String MODEL_FILE="testmodels/MehdiTest6/model.uml";
	private String MODEL_FILE="testmodels/SD_CF/SD_IF/model.uml";
	
	
	/** SEQUENCE DIAGRAM TESTING */
	//private String MODEL_FILE="testmodels/sequencediagram/test1/model.uml";
	//private String MODEL_FILE="testmodels/sequencediagram/test2/model.uml";
	//private String MODEL_FILE="testmodels/sequencediagram/test3/model.uml";
	//private String MODEL_FILE="testmodels/sequencediagram/test4/model.uml";
	
	/** STATE DIAGRAM TESTING */
	//private String MODEL_FILE="testmodels/statediagram/test1/model.uml";
	
	/** IOD TESTING */
	//private String MODEL_FILE="testmodels/iod/test1/model.uml";
	
	/** TXT RADAR MODEL */
	//private String MODEL_FILE="testmodels/txt/v0.1/model.uml";
	
	/** CASSIDIAN RADAR MODEL */
	//private String MODEL_FILE="testmodels/cassidian/model.uml";
	
	/** OMEGA ATM MODEL */
	//private String MODEL_FILE="testmodels/atm_omega/v0.1/model.uml";
	
	/** SD and StD **/
//	private String MODEL_FILE="testmodels/SD_and_StD/test1/model.uml";
	
	/** ASSIGNMENTS IN TRANSACTIONS */
	//private String MODEL_FILE="testmodels/variables/assignments_in_transactions/model.uml";
	
	/** LAMP EXAMPLE **/
	//private String MODEL_FILE="testmodels/lamp/model.uml";
	
	/** TIME CONSTRAINTS **/
//	private String MODEL_FILE="testmodels/timeconstraints/MehdiTest1/model.uml";
	//private String MODEL_FILE="testmodels/timeconstraints/MehdiTest2/model.uml";
	
	/** The UML2ZOT entry point for making the transformation */
	private UML2Zot t=new UML2Zot(new File(this.MODEL_FILE).getAbsolutePath());
	
	/** A test helper, works on tmp folder before moving to output folder */
	TestHelper testHelper=new TestHelper("output","tmp");	

	@Test
	public void TestModel() throws Exception {
//		<test del>
//		String prdID = UML2Zot.Utility.umlIDtoPrdID("_Ab~C-");
//		String aaaa = UML2Zot.Utility.prdIDtoUMLID(prdID);
//		SOrder so = `"), new Predicate("exception"), true);
//		aaaa = so.toString();
//		</test del>
				
		LOGGER.info("Testing "+this.MODEL_FILE);
		
		LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(new File("tmp/zot_model.lisp").getAbsolutePath());
		LOGGER.info("Generate the Mappings File");
		t.generateMappingsFile(new File("tmp/model.mappings"));
		
		assertTrue("The ZOT file contains errors ",testHelper.isZOTFileValid());
		
		testHelper.cleanUp();
	}


}
