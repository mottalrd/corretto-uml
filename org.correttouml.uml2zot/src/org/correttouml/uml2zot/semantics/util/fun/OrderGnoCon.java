package org.correttouml.uml2zot.semantics.util.fun;

import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.MetaBooleanFormulae;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class OrderGnoCon implements BooleanFormulae, MetaBooleanFormulae {
	BooleanFormulae f1;
	BooleanFormulae f2;
	BooleanFormulae guard;
	BooleanFormulae exception;
	
	public OrderGnoCon() {
	}
	
	public OrderGnoCon(BooleanFormulae f1, BooleanFormulae f2, BooleanFormulae guard, BooleanFormulae exception) {
		this.f1 = f1;
		this.f2 = f2;
		this.guard = guard;
		this.exception = exception;
	}

	@Override
	public String toString() {
		return "(OrderGnoCon " + f1 + " " + f2 + " " + guard + " " + exception + ")";
	}
	
	// // (defun ordergnocon (f1 f2 guard exception); !!isconcurrent
	// // (f1 && guard) => (until_ei((!!f1 && !!f2), exception) || until_ei((!!f1 && !!exception), f2))
	// // f2 => since_ei((!!f2 && !!exception), (f1 && guard))
    // // (f1 && guard) => !!f2
	// // )
	public String getDefun() {
		return "(defun OrderGnoCon (f1 f2 guard exception)\n" +
				"(&&\n"+
				"\t(-> (&& f1 guard) (|| (until_ei (&& (!! f1) (!! f2)) exception) (until_ei (&& (!! f1) (!! exception)) f2)))\n" +
				"\t(-> f2 (since_ei (&& (!! f2) (!! exception)) (&& f1 guard)))\n" +
				"\t(-> (&& f1 guard) (!! f2))\n" +
				"))";
	}

	@Override
	public void setComment(String comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getComment() {
		// TODO Auto-generated method stub
		return "";
	}
}
