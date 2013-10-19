
package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.Since_ei;
import org.correttouml.uml2zot.semantics.util.trio.Until_ei;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SOrder implements BooleanFormulae, MetaBooleanFormulae{
	private String comment="";
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[order].docx
	BooleanFormulae f1; //ev1 (which can be more complex than atomic event(m1_Start), like (m1_Start && SDX_CF_X_Op1_Start))
    BooleanFormulae f2; //ev2 (similar to ev1)
    BooleanFormulae guard; //guard is checked at the time instant that ev1 happens.
    BooleanFormulae exception; //if ev1 happens it has to be followed by ev2 and if ev2 happens it has to be preceded by ev1 except we have exception between them.  
    Boolean isConcurrent; //It can be true or not, if so we may have ev2 at the same moment as ev1 happens, if not they must be separated at least by one time instant.

    public SOrder(BooleanFormulae f1, BooleanFormulae f2, BooleanFormulae guard, BooleanFormulae exception, Boolean isConcurrent){
        this.f1=f1;
        this.f2=f2;
        this.guard = guard;
        this.exception = exception;
        this.isConcurrent = isConcurrent;
    }

    public SOrder(BooleanFormulae f1, BooleanFormulae f2, BooleanFormulae guard, BooleanFormulae exception, Boolean isConcurrent, String comment){
        this.f1=f1;
        this.f2=f2;
        this.guard = guard;
        this.exception = exception;
        this.isConcurrent = isConcurrent;
        this.comment = comment;
    }
    
    public SOrder(BooleanFormulae f1, BooleanFormulae f2, BooleanFormulae exception, Boolean isConcurrent){
        this.f1=f1;
        this.f2=f2;
        this.exception = exception;
        this.isConcurrent = isConcurrent;
    }
    
    public SOrder(BooleanFormulae f1, BooleanFormulae f2, BooleanFormulae exception, Boolean isConcurrent, String comment){
        this.f1=f1;
        this.f2=f2;
        this.exception = exception;
        this.isConcurrent = isConcurrent;
        this.comment = comment;
    }

    /*
     (f1 && Guard) => (until_ei((!!f1 && !!f2), exception) || until_ei((!!f1 && !!exception), f2))
    		f2 => since_ei((!!f2 && !!exception), (f1 && Guard))
    		if (!! isConcurrent)
    		    (f1 && Guard) => !!f2
    */

    @Override
	public String toString() {
    	String s = "";
    	for (BooleanFormulae f: getFormulae()) {
    		if (f instanceof MetaBooleanFormulae && ((MetaBooleanFormulae) f).getComment()!="")
    			s += ";;[SOrder]" + ((MetaBooleanFormulae)f).getComment() + "\n";
    		s += f.toString() + "\n";
    	}
    	return s;
	}
    
	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getComment() {
		return this.comment;
	}
	
    public BooleanFormulae getFormula() {
    	// return conjunction of set of formulae
		return new And(getFormulae());
	}
    
    public ArrayList<BooleanFormulae> getFormulae() {
    	// return set of formulae
		ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
		if (guard != null) {
			f.add((new Implies(new And(f1, guard), new Or(new Until_ei(new And(new Not(f1), new Not(f2)), exception), new Until_ei(new And(new Not(f1), new Not(exception)), f2)))));
			f.add(new Implies(f2, new Since_ei(new And(new Not(f2), new Not(exception)), new And(f1, guard))));
			if (!isConcurrent)
				f.add(new Implies(new And(f1, guard), new Not(f2)));
		} else {
			f.add(new Implies(f1, new Or(new Until_ei(new And(new Not(f1), new Not(f2)), exception), new Until_ei(new And(new Not(f1), new Not(exception)), f2))));
			f.add(new Implies(f2, new Since_ei(new And(new Not(f2), new Not(exception)), f1)));
			if (!isConcurrent)
				f.add(new Implies(f1, new Not(f2)));
		}
		return f;
	}
}