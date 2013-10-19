/*
* Author: Alfredo Motta
* Mail: motta@elet.polimi.it
* Website: http://www.alfredo.motta.name
*/

package org.correttouml.uml2zot.semantics.util.bool;


public class Implies implements BooleanFormulae, MetaBooleanFormulae{
	private String comment="";
    BooleanFormulae f1;
    BooleanFormulae f2;

    public Implies(BooleanFormulae f1, BooleanFormulae f2){
        this.f1=f1;
        this.f2=f2;
    }
    
    public Implies(BooleanFormulae f1, BooleanFormulae f2, String comment){
        this.f1=f1;
        this.f2=f2;
        this.comment = comment;
    }

    @Override
    public String toString(){
        return "(-> " + f1 + " " + f2 + ")";
    }
    
	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getComment() {
		return this.comment;
	}

}
