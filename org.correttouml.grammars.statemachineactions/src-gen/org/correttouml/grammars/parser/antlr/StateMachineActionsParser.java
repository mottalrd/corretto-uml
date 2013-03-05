/*
* generated by Xtext
*/
package org.correttouml.grammars.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.correttouml.grammars.services.StateMachineActionsGrammarAccess;

public class StateMachineActionsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private StateMachineActionsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.correttouml.grammars.parser.antlr.internal.InternalStateMachineActionsParser createParser(XtextTokenStream stream) {
		return new org.correttouml.grammars.parser.antlr.internal.InternalStateMachineActionsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public StateMachineActionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StateMachineActionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}