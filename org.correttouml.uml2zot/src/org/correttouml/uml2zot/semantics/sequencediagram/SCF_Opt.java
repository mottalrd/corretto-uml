package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.sequencediagram.CF_Opt;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragment;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class SCF_Opt extends SCombinedFragment implements SCombinedFragmentItf{
//	private CombinedFragment;
	public SCF_Opt(CF_Opt cfopt) {
		super((CombinedFragment)cfopt.uml_cf_opt);
		// TODO Auto-generated constructor stub 
	}

	@Override
	public ArrayList<BooleanFormulae> getSemantics() {
		// // borders(CF_Opt, SD_End || SD_Stop)
		// // link_Pre_Post(CF_Opt, config)

		return null;
	}

}
