package org.correttouml.uml2zot.semantics.expressions;

import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;

public class SConstant implements BooleanFormulae{

	private int mades_constant;

	public SConstant(int mades_constant){
		this.mades_constant=mades_constant;
	}
	
	@Override
	public String toString(){
		return Integer.toString(mades_constant);
	}
	
}
