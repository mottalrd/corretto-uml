package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;
import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.*;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SSomPIn_i implements BooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[SomPIn_i].docx
	Predicate ev1;
    Predicate enclosingFragment;  

    public SSomPIn_i(Predicate ev1, Predicate enclosingFragment){
        this.ev1 = ev1;
        this.enclosingFragment= enclosingFragment;
    }

    @Override
	public String toString() {
    	return getFormula().toString();
	}
    // // !!since_ii(!!ev1, enclosingCF_Start)    
	public BooleanFormulae getFormula() {
		return new Not(new Since_ii(new Not(ev1), enclosingFragment.getPredicateStart()));
	}
}
