package org.correttouml.uml2zot.semantics.util.bool;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public interface MetaBooleanFormulae extends BooleanFormulae {
    
	/* MetaBooleanFormulae inherits from BooleanFormulae, and has additional attributes ("comment"),
     *  which helps tester to find out which part of project produced current semantics (BooleanFormulae).
     *  */

	public void setComment(String comment);
    
    public String getComment();
}
