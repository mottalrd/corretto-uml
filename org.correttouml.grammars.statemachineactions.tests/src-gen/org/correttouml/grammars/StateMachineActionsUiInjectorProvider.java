/*
* generated by Xtext
*/
package org.correttouml.grammars;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class StateMachineActionsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.correttouml.grammars.ui.internal.StateMachineActionsActivator.getInstance().getInjector("org.correttouml.grammars.StateMachineActions");
	}
	
}
