package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.*;
import org.correttouml.uml2zot.semantics.util.fun.*;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SSomPIn_i implements BooleanFormulae, MetaBooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[SomPIn_i].docx
	private String comment="";
	private BooleanFormulae ev1;
    private Predicate enclosingFragment;  

    public SSomPIn_i(BooleanFormulae ev1, Predicate enclosingFragment){
        this.ev1 = ev1;
        this.enclosingFragment= enclosingFragment;
    }
    
    public SSomPIn_i(BooleanFormulae ev1, Predicate enclosingFragment, String comment){
        this.ev1 = ev1;
        this.enclosingFragment= enclosingFragment;
        this.comment = comment;
    }

    @Override
	public String toString() {
    	return getFormula().toString();
	}
    
	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getComment() {
		return this.comment;
	}
    
    public BooleanFormulae getFun() {
    	return new SomPIn_i(ev1, enclosingFragment.getPredicateStart());
    }
	
    // // !!since_ii(!!ev1, enclosingCF_Start)    
	public BooleanFormulae getFormula() {
		return new Not(new Since_ii(new Not(ev1), enclosingFragment.getPredicateStart()));
	}
}
