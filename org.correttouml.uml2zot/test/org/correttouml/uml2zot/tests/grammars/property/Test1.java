package org.correttouml.uml2zot.tests.grammars.property;

import org.apache.log4j.Logger;
import org.correttouml.uml.helpers.PropertyParser;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class Test1 {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(Test1.class); 
	
	@Test
	public void State() throws Exception{
System.out.println("State:\n\t" + new PropertyParser("state1 = obj1.getState(STD1, UMLstate1)\n"
		+ "inState1 = obj1.in(state1)\n"
		+ "Corretto.verify(!(inState1))").getProperty());
	}
	
	@Test
	public void ArithBool() throws Exception{
System.out.println("ArithBool:\n\t" + new PropertyParser("Corretto.verify(sd1.getParameter(distance) == (obj.atr1 / 3))").getProperty());
	}
	
	@Test
	public void Parentheses() throws Exception{
System.out.println("Parentheses:\n\t" + new PropertyParser("state1 = obj1.getState(STD1, UMLstate1)\n"
		+ "a= obj1.in(state1)\n"
		+ "b= obj1.in(state1)\n"
		+ "Corretto.verify((!(a) && b) || a)").getProperty());
	}
	
	@Test
	public void ParenthesesArithBool() throws Exception{
System.out.println("ParenthesesArithBool:\n\t" + new PropertyParser("state1 = obj1.getState(STD1, UMLstate1)\n"
		+ "a= obj1.in(state1)\n"
		+ "b= obj1.in(state1)\n"
		+ "Corretto.verify((a && b) || (3 > 4))").getProperty());
	}
	
	@Test
	public void Implies() throws Exception{
System.out.println("Implies:\n\t" + new PropertyParser("state1 = obj1.getState(STD1, UMLstate1)\n"
		+ "a= obj1.in(state1)\n"
		+ "b= obj1.in(state1)\n"
		+ "//Corretto.verify((a => b) || (3 > 4))\n"
		+ "Corretto.verify((b <=> b) || (22 > 2.22))").getProperty());
	}
	
	
	@Test
	public void ImpliesWithinF() throws Exception{
		System.out.println("ImpliesWithinf2:\n\t" + new PropertyParser("state1 = obj1.getState(STD1, UMLstate1)\n"
		+ "a= obj1.in(state1)\n"
		+ "b= obj1.in(state1)\n"
		+ "Corretto.verify(Time.withinF((a => b) || (3 > 4)), 5)").getProperty());
	}
	
	@Test
	public void CCAS1() throws Exception{
		System.out.println("CCAS1:\n\t" + new PropertyParser(
		"smallDistance= ctr::notifyDistance.receivedDistance < 2\n"
		+"brakingState = brakeS.getState(brakingSM, braking)\n"
		+ "inBraking = brakeS.in(brakingState)\n"
		+ "brakingInTime = Time.lasted(smallDistance, 52) => Time.withinP(inBraking, 52)\n"
		+ "myProperty = Time.alwaysTrue(brakingInTime)\n"
		+ "Corretto.verify(myProperty)").getProperty());
	}
	
	@Test
	public void CCAS() throws Exception{//system.getSignal(failure)
		System.out.println("CCAS:\n\t" + new PropertyParser(
		"smallDistance = sendSensorDistance.getParameter(distance) < 2\n"
		+"brakingState = brakeS.getState(brakingSM, braking)\n"
		+ "inBraking = brakeS.in(brakingState)\n"
		+ "brakingInTime = Time.lasted(smallDistance && !(system.getSignal(failure)), 52) => Time.withinP(inBraking, 52)\n"
		+ "myProperty = Time.alwaysTrue(brakingInTime)\n"
		+ "Corretto.verify(myProperty)"
				).getProperty());
	}
	
	@Test
	public void CCASSat() throws Exception{//system.getSignal(failure)
		BooleanFormulae property = new PropertyParser(
		"smallDistance = sendSensorDistance.getParameter(distance) < 2\n"
		+"brakingState = brakeS.getState(brakingSM, braking)\n"
		+ "inBraking = brakeS.in(brakingState)\n"
		+ "brakingInTime = Time.lasted(smallDistance && !(system.getSignal(failure)), 52) => Time.withinP(inBraking, 52)\n"
		+ "myProperty = Time.alwaysTrue(brakingInTime)\n"
		+ "//Corretto.verify(myProperty)\n"
		+ "Corretto.execute()"
				).getProperty();
		assertNull(property);
		System.out.println("CCASSat:\n\t property is commented out so Corretto returns an execution of the CUML model.");
	}
	
	@Test
	public void LeaderSAT() throws Exception{//system.getSignal(failure)
		System.out.println("LeaderSAT:\n\t" + new PropertyParser("stateEnd = idGenerator.getState(IdGenerator_SM, stateEnd)\n"
						+ "inStateEnd = idGenerator.in(stateEnd)\n"
						+ "Corretto.verify(Time.alwF(!(Time.eventually(inStateEnd))))"
				).getProperty());
	}
	
}