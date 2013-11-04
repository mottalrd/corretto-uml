package test;

import com.thoughtworks.xstream.XStream;

public class CloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		final XStream XSTREAM = new XStream();
		
		TestObject obj1 = new TestObject();
		
		TestObject obj2= (TestObject) XSTREAM.fromXML(XSTREAM.toXML(obj1));
		
			obj2.str ="Bye";
			
			System.out.println(obj1.str);
			System.out.println(obj2.str);

	}

}
