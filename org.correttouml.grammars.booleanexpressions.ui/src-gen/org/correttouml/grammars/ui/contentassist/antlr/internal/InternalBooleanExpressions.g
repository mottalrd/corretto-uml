/*
* generated by Xtext
*/
grammar InternalBooleanExpressions;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.correttouml.grammars.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.correttouml.grammars.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.correttouml.grammars.services.BooleanExpressionsGrammarAccess;

}

@parser::members {
 
 	private BooleanExpressionsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(BooleanExpressionsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getExpressionAssignment()); }
(rule__Model__ExpressionAssignment)
{ after(grammarAccess.getModelAccess().getExpressionAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOrExpression
entryRuleOrExpression 
:
{ before(grammarAccess.getOrExpressionRule()); }
	 ruleOrExpression
{ after(grammarAccess.getOrExpressionRule()); } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOrExpressionAccess().getGroup()); }
(rule__OrExpression__Group__0)
{ after(grammarAccess.getOrExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAndExpression
entryRuleAndExpression 
:
{ before(grammarAccess.getAndExpressionRule()); }
	 ruleAndExpression
{ after(grammarAccess.getAndExpressionRule()); } 
	 EOF 
;

// Rule AndExpression
ruleAndExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAndExpressionAccess().getGroup()); }
(rule__AndExpression__Group__0)
{ after(grammarAccess.getAndExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBaseExpression
entryRuleBaseExpression 
:
{ before(grammarAccess.getBaseExpressionRule()); }
	 ruleBaseExpression
{ after(grammarAccess.getBaseExpressionRule()); } 
	 EOF 
;

// Rule BaseExpression
ruleBaseExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBaseExpressionAccess().getGroup()); }
(rule__BaseExpression__Group__0)
{ after(grammarAccess.getBaseExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulebooleanTerm
entryRulebooleanTerm 
:
{ before(grammarAccess.getBooleanTermRule()); }
	 rulebooleanTerm
{ after(grammarAccess.getBooleanTermRule()); } 
	 EOF 
;

// Rule booleanTerm
rulebooleanTerm
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBooleanTermAccess().getAlternatives()); }
(rule__BooleanTerm__Alternatives)
{ after(grammarAccess.getBooleanTermAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTimeConstraint
entryRuleTimeConstraint 
:
{ before(grammarAccess.getTimeConstraintRule()); }
	 ruleTimeConstraint
{ after(grammarAccess.getTimeConstraintRule()); } 
	 EOF 
;

// Rule TimeConstraint
ruleTimeConstraint
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTimeConstraintAccess().getGroup()); }
(rule__TimeConstraint__Group__0)
{ after(grammarAccess.getTimeConstraintAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBooleanVariable
entryRuleBooleanVariable 
:
{ before(grammarAccess.getBooleanVariableRule()); }
	 ruleBooleanVariable
{ after(grammarAccess.getBooleanVariableRule()); } 
	 EOF 
;

// Rule BooleanVariable
ruleBooleanVariable
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBooleanVariableAccess().getVariableAssignment()); }
(rule__BooleanVariable__VariableAssignment)
{ after(grammarAccess.getBooleanVariableAccess().getVariableAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariableCondition
entryRuleVariableCondition 
:
{ before(grammarAccess.getVariableConditionRule()); }
	 ruleVariableCondition
{ after(grammarAccess.getVariableConditionRule()); } 
	 EOF 
;

// Rule VariableCondition
ruleVariableCondition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableConditionAccess().getGroup()); }
(rule__VariableCondition__Group__0)
{ after(grammarAccess.getVariableConditionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEXPRESSION
entryRuleEXPRESSION 
:
{ before(grammarAccess.getEXPRESSIONRule()); }
	 ruleEXPRESSION
{ after(grammarAccess.getEXPRESSIONRule()); } 
	 EOF 
;

// Rule EXPRESSION
ruleEXPRESSION
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEXPRESSIONAccess().getAlternatives()); }
(rule__EXPRESSION__Alternatives)
{ after(grammarAccess.getEXPRESSIONAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTERM
entryRuleTERM 
:
{ before(grammarAccess.getTERMRule()); }
	 ruleTERM
{ after(grammarAccess.getTERMRule()); } 
	 EOF 
;

// Rule TERM
ruleTERM
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTERMAccess().getAlternatives()); }
(rule__TERM__Alternatives)
{ after(grammarAccess.getTERMAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEvent
entryRuleEvent 
:
{ before(grammarAccess.getEventRule()); }
	 ruleEvent
{ after(grammarAccess.getEventRule()); } 
	 EOF 
;

// Rule Event
ruleEvent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEventAccess().getAlternatives()); }
(rule__Event__Alternatives)
{ after(grammarAccess.getEventAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEventExtensions
entryRuleEventExtensions 
:
{ before(grammarAccess.getEventExtensionsRule()); }
	 ruleEventExtensions
{ after(grammarAccess.getEventExtensionsRule()); } 
	 EOF 
;

// Rule EventExtensions
ruleEventExtensions
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEventExtensionsAccess().getAlternatives()); }
(rule__EventExtensions__Alternatives)
{ after(grammarAccess.getEventExtensionsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__BaseExpression__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getBooleanTermAssignment_1_0()); }
(rule__BaseExpression__BooleanTermAssignment_1_0)
{ after(grammarAccess.getBaseExpressionAccess().getBooleanTermAssignment_1_0()); }
)

    |(
{ before(grammarAccess.getBaseExpressionAccess().getGroup_1_1()); }
(rule__BaseExpression__Group_1_1__0)
{ after(grammarAccess.getBaseExpressionAccess().getGroup_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanTerm__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanTermAccess().getTimeConstraintAssignment_0()); }
(rule__BooleanTerm__TimeConstraintAssignment_0)
{ after(grammarAccess.getBooleanTermAccess().getTimeConstraintAssignment_0()); }
)

    |(
{ before(grammarAccess.getBooleanTermAccess().getBooleanVariableAssignment_1()); }
(rule__BooleanTerm__BooleanVariableAssignment_1)
{ after(grammarAccess.getBooleanTermAccess().getBooleanVariableAssignment_1()); }
)

    |(
{ before(grammarAccess.getBooleanTermAccess().getVariableConditionAssignment_2()); }
(rule__BooleanTerm__VariableConditionAssignment_2)
{ after(grammarAccess.getBooleanTermAccess().getVariableConditionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getGroup_0()); }
(rule__EXPRESSION__Group_0__0)
{ after(grammarAccess.getEXPRESSIONAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getEXPRESSIONAccess().getAloneAssignment_1()); }
(rule__EXPRESSION__AloneAssignment_1)
{ after(grammarAccess.getEXPRESSIONAccess().getAloneAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TERM__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTERMAccess().getVariableAssignment_0()); }
(rule__TERM__VariableAssignment_0)
{ after(grammarAccess.getTERMAccess().getVariableAssignment_0()); }
)

    |(
{ before(grammarAccess.getTERMAccess().getConstantAssignment_1()); }
(rule__TERM__ConstantAssignment_1)
{ after(grammarAccess.getTERMAccess().getConstantAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getGroup_0()); }
(rule__Event__Group_0__0)
{ after(grammarAccess.getEventAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getEventAccess().getNowEventAssignment_1()); }
(rule__Event__NowEventAssignment_1)
{ after(grammarAccess.getEventAccess().getNowEventAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EventExtensions__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); }

	'exit' 

{ after(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); }

	'enter' 

{ after(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); }

	'start' 

{ after(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); }

	'end' 

{ after(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); }

	'tick' 

{ after(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); }

	'sig' 

{ after(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); }

	'call' 

{ after(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); }

	'send' 

{ after(grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); }
)

    |(
{ before(grammarAccess.getEventExtensionsAccess().getReceiveKeyword_8()); }

	'receive' 

{ after(grammarAccess.getEventExtensionsAccess().getReceiveKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__OrExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpression__Group__0__Impl
	rule__OrExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getLeftExpressionAssignment_0()); }
(rule__OrExpression__LeftExpressionAssignment_0)
{ after(grammarAccess.getOrExpressionAccess().getLeftExpressionAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getGroup_1()); }
(rule__OrExpression__Group_1__0)?
{ after(grammarAccess.getOrExpressionAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrExpression__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpression__Group_1__0__Impl
	rule__OrExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getOrAssignment_1_0()); }
(rule__OrExpression__OrAssignment_1_0)
{ after(grammarAccess.getOrExpressionAccess().getOrAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_1()); }
(rule__OrExpression__RightExpressionAssignment_1_1)
{ after(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AndExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpression__Group__0__Impl
	rule__AndExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getLeftExpressionAssignment_0()); }
(rule__AndExpression__LeftExpressionAssignment_0)
{ after(grammarAccess.getAndExpressionAccess().getLeftExpressionAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getGroup_1()); }
(rule__AndExpression__Group_1__0)?
{ after(grammarAccess.getAndExpressionAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AndExpression__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpression__Group_1__0__Impl
	rule__AndExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getAndAssignment_1_0()); }
(rule__AndExpression__AndAssignment_1_0)
{ after(grammarAccess.getAndExpressionAccess().getAndAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_1()); }
(rule__AndExpression__RightExpressionAssignment_1_1)
{ after(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BaseExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BaseExpression__Group__0__Impl
	rule__BaseExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getNotAssignment_0()); }
(rule__BaseExpression__NotAssignment_0)?
{ after(grammarAccess.getBaseExpressionAccess().getNotAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BaseExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getAlternatives_1()); }
(rule__BaseExpression__Alternatives_1)
{ after(grammarAccess.getBaseExpressionAccess().getAlternatives_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BaseExpression__Group_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BaseExpression__Group_1_1__0__Impl
	rule__BaseExpression__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__Group_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0()); }

	'(' 

{ after(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpression__Group_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BaseExpression__Group_1_1__1__Impl
	rule__BaseExpression__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__Group_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getRootExpressionAssignment_1_1_1()); }
(rule__BaseExpression__RootExpressionAssignment_1_1_1)
{ after(grammarAccess.getBaseExpressionAccess().getRootExpressionAssignment_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpression__Group_1_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BaseExpression__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__Group_1_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2()); }

	')' 

{ after(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__TimeConstraint__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__0__Impl
	rule__TimeConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0()); }

	'@' 

{ after(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TimeConstraint__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__1__Impl
	rule__TimeConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1()); }
(rule__TimeConstraint__Event2Assignment_1)
{ after(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TimeConstraint__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__2__Impl
	rule__TimeConstraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2()); }

	'-' 

{ after(grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TimeConstraint__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__3__Impl
	rule__TimeConstraint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3()); }

	'@' 

{ after(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TimeConstraint__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__4__Impl
	rule__TimeConstraint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4()); }
(rule__TimeConstraint__Event1Assignment_4)
{ after(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TimeConstraint__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__5__Impl
	rule__TimeConstraint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getOpAssignment_5()); }
(rule__TimeConstraint__OpAssignment_5)
{ after(grammarAccess.getTimeConstraintAccess().getOpAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TimeConstraint__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TimeConstraint__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getValueAssignment_6()); }
(rule__TimeConstraint__ValueAssignment_6)
{ after(grammarAccess.getTimeConstraintAccess().getValueAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__VariableCondition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableCondition__Group__0__Impl
	rule__VariableCondition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0()); }

	'{' 

{ after(grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableCondition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableCondition__Group__1__Impl
	rule__VariableCondition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getExpression_leftAssignment_1()); }
(rule__VariableCondition__Expression_leftAssignment_1)
{ after(grammarAccess.getVariableConditionAccess().getExpression_leftAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableCondition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableCondition__Group__2__Impl
	rule__VariableCondition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getRelationAssignment_2()); }
(rule__VariableCondition__RelationAssignment_2)
{ after(grammarAccess.getVariableConditionAccess().getRelationAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableCondition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableCondition__Group__3__Impl
	rule__VariableCondition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getExpression_rightAssignment_3()); }
(rule__VariableCondition__Expression_rightAssignment_3)
{ after(grammarAccess.getVariableConditionAccess().getExpression_rightAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableCondition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableCondition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__EXPRESSION__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EXPRESSION__Group_0__0__Impl
	rule__EXPRESSION__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getFirstTermAssignment_0_0()); }
(rule__EXPRESSION__FirstTermAssignment_0_0)
{ after(grammarAccess.getEXPRESSIONAccess().getFirstTermAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EXPRESSION__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EXPRESSION__Group_0__1__Impl
	rule__EXPRESSION__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getOperatorAssignment_0_1()); }
(rule__EXPRESSION__OperatorAssignment_0_1)
{ after(grammarAccess.getEXPRESSIONAccess().getOperatorAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EXPRESSION__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EXPRESSION__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getSecondTermAssignment_0_2()); }
(rule__EXPRESSION__SecondTermAssignment_0_2)
{ after(grammarAccess.getEXPRESSIONAccess().getSecondTermAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Event__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Event__Group_0__0__Impl
	rule__Event__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); }
(rule__Event__EventNameAssignment_0_0)
{ after(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Event__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Event__Group_0__1__Impl
	rule__Event__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); }

	'.' 

{ after(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Event__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Event__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); }
(rule__Event__EventExtensionAssignment_0_2)
{ after(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__ExpressionAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); }
	ruleOrExpression{ after(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__LeftExpressionAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); }
	ruleAndExpression{ after(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__OrAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); }
	RULE_OR{ after(grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__RightExpressionAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); }
	ruleOrExpression{ after(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__LeftExpressionAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); }
	ruleBaseExpression{ after(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__AndAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); }
	RULE_AND{ after(grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__RightExpressionAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); }
	ruleAndExpression{ after(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__NotAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); }
	RULE_NOT{ after(grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__BooleanTermAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); }
	rulebooleanTerm{ after(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpression__RootExpressionAssignment_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); }
	ruleOrExpression{ after(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanTerm__TimeConstraintAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); }
	ruleTimeConstraint{ after(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanTerm__BooleanVariableAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); }
	ruleBooleanVariable{ after(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanTerm__VariableConditionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); }
	ruleVariableCondition{ after(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Event2Assignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); }
	ruleEvent{ after(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__Event1Assignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); }
	ruleEvent{ after(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__OpAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); }
	RULE_RELATIONS{ after(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TimeConstraint__ValueAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); }
	RULE_INT{ after(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanVariable__VariableAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Expression_leftAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getExpression_leftEXPRESSIONParserRuleCall_1_0()); }
	ruleEXPRESSION{ after(grammarAccess.getVariableConditionAccess().getExpression_leftEXPRESSIONParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__RelationAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); }
	RULE_RELATIONS{ after(grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VariableCondition__Expression_rightAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableConditionAccess().getExpression_rightEXPRESSIONParserRuleCall_3_0()); }
	ruleEXPRESSION{ after(grammarAccess.getVariableConditionAccess().getExpression_rightEXPRESSIONParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__FirstTermAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getFirstTermTERMParserRuleCall_0_0_0()); }
	ruleTERM{ after(grammarAccess.getEXPRESSIONAccess().getFirstTermTERMParserRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__OperatorAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getOperatorOPERATORTerminalRuleCall_0_1_0()); }
	RULE_OPERATOR{ after(grammarAccess.getEXPRESSIONAccess().getOperatorOPERATORTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__SecondTermAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getSecondTermTERMParserRuleCall_0_2_0()); }
	ruleTERM{ after(grammarAccess.getEXPRESSIONAccess().getSecondTermTERMParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EXPRESSION__AloneAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEXPRESSIONAccess().getAloneTERMParserRuleCall_1_0()); }
	ruleTERM{ after(grammarAccess.getEXPRESSIONAccess().getAloneTERMParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TERM__VariableAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTERMAccess().getVariableIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getTERMAccess().getVariableIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TERM__ConstantAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTERMAccess().getConstantINTTerminalRuleCall_1_0()); }
	RULE_INT{ after(grammarAccess.getTERMAccess().getConstantINTTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Event__EventNameAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); }
	RULE_ID{ after(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Event__EventExtensionAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); }
	ruleEventExtensions{ after(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Event__NowEventAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); }
(
{ before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); }

	'now' 

{ after(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); }
)

{ after(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_OPERATOR : ('+'|'*'|'--');

RULE_RELATIONS : ('<'|'>'|'=='|'<='|'>='|'!=');

RULE_OR : '||';

RULE_AND : '&&';

RULE_NOT : '!!';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


