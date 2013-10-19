package org.correttouml.uml2zot.semantics.sequencediagram;

import org.correttouml.uml.diagrams.sequencediagram.CF_Opt;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragment;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragmentItf;

public class SCombinedFragmentFactory {
	public static SCombinedFragmentItf getInstance(CombinedFragmentItf mades_combinedfragment, Config config){
		if (mades_combinedfragment instanceof CF_Opt)
			return new SCF_Opt((CF_Opt)mades_combinedfragment, config);
		return null;
	}
	
}
