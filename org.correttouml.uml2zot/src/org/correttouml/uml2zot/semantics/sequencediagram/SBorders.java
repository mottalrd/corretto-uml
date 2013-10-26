
package org.correttouml.uml2zot.semantics.sequencediagram;

import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.fun.*;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SBorders implements BooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[borders].docx
	Predicate module;
    BooleanFormulae exception;  

    public SBorders(Predicate module, BooleanFormulae exception){
        this.module = module;
        this.exception = exception;
    }

	/*
	 * module <=> (module_Start || since_ei(!!(module_End || exception), module_Start))  //Assures that we have (module = True) when it is active, i.e. some events are happening inside its borders.
	 * module_Start => until_ei(!!module_Start, (module_End || exception)) //Assures that we cannot have more than one module_Start, when module is true.
	 */

    @Override
    public String toString() {
//    	String s = "";
//    	for (BooleanFormulae f: getFormulae())
//    		s += f.toString() + "\n";
    	return getFun().toString();
	}
    
//	public BooleanFormulae getFormula() {
//		return new And(getFormulae());
//	}
	
	public BooleanFormulae getFun() {
    	return new Borders(module, module.getPredicateStart(), module.getPredicateEnd(), exception);
    }
	
//	public ArrayList<BooleanFormulae> getFormulae() {
//		ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
//		f.add(new Iff(module, new Or(module.getPredicateStart(), new Since_ei(new Not(new Or(module.getPredicateEnd(), exception)), module.getPredicateStart()))));
//		f.add(new Implies(module.getPredicateStart(), new Until_ei(new Not(module.getPredicateStart()), new Or(module.getPredicateEnd(), exception))));
//		return f;
//	}
}
