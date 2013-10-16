
package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.Since_ei;
import org.correttouml.uml2zot.semantics.util.trio.Until_ei;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SBorders implements BooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[borders].docx
	Predicate module; //ev1 (which can be more complex than atomic event(m1_Start), like (m1_Start && SDX_CF_X_Op1_Start))
    BooleanFormulae exception; //if ev1 happens it has to be followed by ev2 and if ev2 happens it has to be preceded by ev1 except we have exception between them.  

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
    	return getFormula().toString();
	}
    
	public BooleanFormulae getFormula() {
		return new And(getFormulae());
	}
	public ArrayList<BooleanFormulae> getFormulae() {
		ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
		f.add(new Iff(module, new Or(module.getPredicateStart(), new Since_ei(new Not(new Or(module.getPredicateEnd(), exception)), module.getPredicateStart()))));
		f.add(new Implies(module.getPredicateStart(), new Until_ei(new Not(module.getPredicateStart()), new Or(module.getPredicateEnd(), exception))));
		return f;
	}
}
