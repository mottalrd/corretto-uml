package org.correttouml.grammars.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractBooleanExpressionsJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage.eINSTANCE);
		return result;
	}

}
