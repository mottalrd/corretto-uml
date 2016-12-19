/*
* generated by Xtext
*/
package org.correttouml.grammars.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BooleanExpressionsGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cExpressionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionOrExpressionParserRuleCall_0 = (RuleCall)cExpressionAssignment.eContents().get(0);
		
		//Model:
		//	expression=OrExpression;
		public ParserRule getRule() { return rule; }

		//expression=OrExpression
		public Assignment getExpressionAssignment() { return cExpressionAssignment; }

		//OrExpression
		public RuleCall getExpressionOrExpressionParserRuleCall_0() { return cExpressionOrExpressionParserRuleCall_0; }
	}

	public class OrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftExpressionAndExpressionParserRuleCall_0_0 = (RuleCall)cLeftExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOrAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOrORTerminalRuleCall_1_0_0 = (RuleCall)cOrAssignment_1_0.eContents().get(0);
		private final Assignment cRightExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightExpressionOrExpressionParserRuleCall_1_1_0 = (RuleCall)cRightExpressionAssignment_1_1.eContents().get(0);
		
		////============================================//
		////				BOOLEAN EXPRESSIONS			  //
		////============================================//
		//OrExpression:
		//	leftExpression=AndExpression (or=OR rightExpression=OrExpression)?;
		public ParserRule getRule() { return rule; }

		//leftExpression=AndExpression (or=OR rightExpression=OrExpression)?
		public Group getGroup() { return cGroup; }

		//leftExpression=AndExpression
		public Assignment getLeftExpressionAssignment_0() { return cLeftExpressionAssignment_0; }

		//AndExpression
		public RuleCall getLeftExpressionAndExpressionParserRuleCall_0_0() { return cLeftExpressionAndExpressionParserRuleCall_0_0; }

		//(or=OR rightExpression=OrExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//or=OR
		public Assignment getOrAssignment_1_0() { return cOrAssignment_1_0; }

		//OR
		public RuleCall getOrORTerminalRuleCall_1_0_0() { return cOrORTerminalRuleCall_1_0_0; }

		//rightExpression=OrExpression
		public Assignment getRightExpressionAssignment_1_1() { return cRightExpressionAssignment_1_1; }

		//OrExpression
		public RuleCall getRightExpressionOrExpressionParserRuleCall_1_1_0() { return cRightExpressionOrExpressionParserRuleCall_1_1_0; }
	}

	public class AndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftExpressionBaseExpressionParserRuleCall_0_0 = (RuleCall)cLeftExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cAndAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cAndANDTerminalRuleCall_1_0_0 = (RuleCall)cAndAssignment_1_0.eContents().get(0);
		private final Assignment cRightExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightExpressionAndExpressionParserRuleCall_1_1_0 = (RuleCall)cRightExpressionAssignment_1_1.eContents().get(0);
		
		//AndExpression:
		//	leftExpression=BaseExpression (and=AND rightExpression=AndExpression)?;
		public ParserRule getRule() { return rule; }

		//leftExpression=BaseExpression (and=AND rightExpression=AndExpression)?
		public Group getGroup() { return cGroup; }

		//leftExpression=BaseExpression
		public Assignment getLeftExpressionAssignment_0() { return cLeftExpressionAssignment_0; }

		//BaseExpression
		public RuleCall getLeftExpressionBaseExpressionParserRuleCall_0_0() { return cLeftExpressionBaseExpressionParserRuleCall_0_0; }

		//(and=AND rightExpression=AndExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//and=AND
		public Assignment getAndAssignment_1_0() { return cAndAssignment_1_0; }

		//AND
		public RuleCall getAndANDTerminalRuleCall_1_0_0() { return cAndANDTerminalRuleCall_1_0_0; }

		//rightExpression=AndExpression
		public Assignment getRightExpressionAssignment_1_1() { return cRightExpressionAssignment_1_1; }

		//AndExpression
		public RuleCall getRightExpressionAndExpressionParserRuleCall_1_1_0() { return cRightExpressionAndExpressionParserRuleCall_1_1_0; }
	}

	public class BaseExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BaseExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNotAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNotNOTTerminalRuleCall_0_0 = (RuleCall)cNotAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cBooleanTermAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cBooleanTermBooleanTermParserRuleCall_1_0_0 = (RuleCall)cBooleanTermAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cRootExpressionAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cRootExpressionOrExpressionParserRuleCall_1_1_1_0 = (RuleCall)cRootExpressionAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		
		//BaseExpression:
		//	not=NOT? (booleanTerm=booleanTerm | "(" rootExpression=OrExpression ")");
		public ParserRule getRule() { return rule; }

		//not=NOT? (booleanTerm=booleanTerm | "(" rootExpression=OrExpression ")")
		public Group getGroup() { return cGroup; }

		//not=NOT?
		public Assignment getNotAssignment_0() { return cNotAssignment_0; }

		//NOT
		public RuleCall getNotNOTTerminalRuleCall_0_0() { return cNotNOTTerminalRuleCall_0_0; }

		//booleanTerm=booleanTerm | "(" rootExpression=OrExpression ")"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//booleanTerm=booleanTerm
		public Assignment getBooleanTermAssignment_1_0() { return cBooleanTermAssignment_1_0; }

		//booleanTerm
		public RuleCall getBooleanTermBooleanTermParserRuleCall_1_0_0() { return cBooleanTermBooleanTermParserRuleCall_1_0_0; }

		//"(" rootExpression=OrExpression ")"
		public Group getGroup_1_1() { return cGroup_1_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_1_0() { return cLeftParenthesisKeyword_1_1_0; }

		//rootExpression=OrExpression
		public Assignment getRootExpressionAssignment_1_1_1() { return cRootExpressionAssignment_1_1_1; }

		//OrExpression
		public RuleCall getRootExpressionOrExpressionParserRuleCall_1_1_1_0() { return cRootExpressionOrExpressionParserRuleCall_1_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_1_2() { return cRightParenthesisKeyword_1_1_2; }
	}

	public class BooleanTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "booleanTerm");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTimeConstraintAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTimeConstraintTimeConstraintParserRuleCall_0_0 = (RuleCall)cTimeConstraintAssignment_0.eContents().get(0);
		private final Assignment cBooleanVariableAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cBooleanVariableBooleanVariableParserRuleCall_1_0 = (RuleCall)cBooleanVariableAssignment_1.eContents().get(0);
		private final Assignment cVariableConditionAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cVariableConditionVariableConditionParserRuleCall_2_0 = (RuleCall)cVariableConditionAssignment_2.eContents().get(0);
		
		//booleanTerm:
		//	timeConstraint=TimeConstraint | booleanVariable=BooleanVariable | variableCondition=VariableCondition;
		public ParserRule getRule() { return rule; }

		//timeConstraint=TimeConstraint | booleanVariable=BooleanVariable | variableCondition=VariableCondition
		public Alternatives getAlternatives() { return cAlternatives; }

		//timeConstraint=TimeConstraint
		public Assignment getTimeConstraintAssignment_0() { return cTimeConstraintAssignment_0; }

		//TimeConstraint
		public RuleCall getTimeConstraintTimeConstraintParserRuleCall_0_0() { return cTimeConstraintTimeConstraintParserRuleCall_0_0; }

		//booleanVariable=BooleanVariable
		public Assignment getBooleanVariableAssignment_1() { return cBooleanVariableAssignment_1; }

		//BooleanVariable
		public RuleCall getBooleanVariableBooleanVariableParserRuleCall_1_0() { return cBooleanVariableBooleanVariableParserRuleCall_1_0; }

		//variableCondition=VariableCondition
		public Assignment getVariableConditionAssignment_2() { return cVariableConditionAssignment_2; }

		//VariableCondition
		public RuleCall getVariableConditionVariableConditionParserRuleCall_2_0() { return cVariableConditionVariableConditionParserRuleCall_2_0; }
	}

	public class TimeConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TimeConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEvent2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEvent2EventParserRuleCall_1_0 = (RuleCall)cEvent2Assignment_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cCommercialAtKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEvent1Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEvent1EventParserRuleCall_4_0 = (RuleCall)cEvent1Assignment_4.eContents().get(0);
		private final Assignment cOpAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOpRELATIONSTerminalRuleCall_5_0 = (RuleCall)cOpAssignment_5.eContents().get(0);
		private final Assignment cValueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cValueINTTerminalRuleCall_6_0 = (RuleCall)cValueAssignment_6.eContents().get(0);
		
		//TimeConstraint:
		//	"@" event2=Event "-" "@" event1=Event op=RELATIONS value=INT;
		public ParserRule getRule() { return rule; }

		//"@" event2=Event "-" "@" event1=Event op=RELATIONS value=INT
		public Group getGroup() { return cGroup; }

		//"@"
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//event2=Event
		public Assignment getEvent2Assignment_1() { return cEvent2Assignment_1; }

		//Event
		public RuleCall getEvent2EventParserRuleCall_1_0() { return cEvent2EventParserRuleCall_1_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_2() { return cHyphenMinusKeyword_2; }

		//"@"
		public Keyword getCommercialAtKeyword_3() { return cCommercialAtKeyword_3; }

		//event1=Event
		public Assignment getEvent1Assignment_4() { return cEvent1Assignment_4; }

		//Event
		public RuleCall getEvent1EventParserRuleCall_4_0() { return cEvent1EventParserRuleCall_4_0; }

		//op=RELATIONS
		public Assignment getOpAssignment_5() { return cOpAssignment_5; }

		//RELATIONS
		public RuleCall getOpRELATIONSTerminalRuleCall_5_0() { return cOpRELATIONSTerminalRuleCall_5_0; }

		//value=INT
		public Assignment getValueAssignment_6() { return cValueAssignment_6; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_6_0() { return cValueINTTerminalRuleCall_6_0; }
	}

	public class BooleanVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanVariable");
		private final Assignment cVariableAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVariableIDTerminalRuleCall_0 = (RuleCall)cVariableAssignment.eContents().get(0);
		
		//BooleanVariable:
		//	variable=ID;
		public ParserRule getRule() { return rule; }

		//variable=ID
		public Assignment getVariableAssignment() { return cVariableAssignment; }

		//ID
		public RuleCall getVariableIDTerminalRuleCall_0() { return cVariableIDTerminalRuleCall_0; }
	}

	public class VariableConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableCondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpression_leftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpression_leftEXPRESSIONParserRuleCall_1_0 = (RuleCall)cExpression_leftAssignment_1.eContents().get(0);
		private final Assignment cRelationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRelationRELATIONSTerminalRuleCall_2_0 = (RuleCall)cRelationAssignment_2.eContents().get(0);
		private final Assignment cExpression_rightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpression_rightEXPRESSIONParserRuleCall_3_0 = (RuleCall)cExpression_rightAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VariableCondition:
		//	"{" expression_left=EXPRESSION relation=RELATIONS expression_right=EXPRESSION "}";
		public ParserRule getRule() { return rule; }

		//"{" expression_left=EXPRESSION relation=RELATIONS expression_right=EXPRESSION "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//expression_left=EXPRESSION
		public Assignment getExpression_leftAssignment_1() { return cExpression_leftAssignment_1; }

		//EXPRESSION
		public RuleCall getExpression_leftEXPRESSIONParserRuleCall_1_0() { return cExpression_leftEXPRESSIONParserRuleCall_1_0; }

		//relation=RELATIONS
		public Assignment getRelationAssignment_2() { return cRelationAssignment_2; }

		//RELATIONS
		public RuleCall getRelationRELATIONSTerminalRuleCall_2_0() { return cRelationRELATIONSTerminalRuleCall_2_0; }

		//expression_right=EXPRESSION
		public Assignment getExpression_rightAssignment_3() { return cExpression_rightAssignment_3; }

		//EXPRESSION
		public RuleCall getExpression_rightEXPRESSIONParserRuleCall_3_0() { return cExpression_rightEXPRESSIONParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EXPRESSIONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EXPRESSION");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cFirstTermAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cFirstTermTERMParserRuleCall_0_0_0 = (RuleCall)cFirstTermAssignment_0_0.eContents().get(0);
		private final Assignment cOperatorAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cOperatorOPERATORTerminalRuleCall_0_1_0 = (RuleCall)cOperatorAssignment_0_1.eContents().get(0);
		private final Assignment cSecondTermAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cSecondTermTERMParserRuleCall_0_2_0 = (RuleCall)cSecondTermAssignment_0_2.eContents().get(0);
		private final Assignment cAloneAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cAloneTERMParserRuleCall_1_0 = (RuleCall)cAloneAssignment_1.eContents().get(0);
		
		//EXPRESSION:
		//	firstTerm=TERM operator=OPERATOR secondTerm=TERM | alone=TERM;
		public ParserRule getRule() { return rule; }

		//firstTerm=TERM operator=OPERATOR secondTerm=TERM | alone=TERM
		public Alternatives getAlternatives() { return cAlternatives; }

		//firstTerm=TERM operator=OPERATOR secondTerm=TERM
		public Group getGroup_0() { return cGroup_0; }

		//firstTerm=TERM
		public Assignment getFirstTermAssignment_0_0() { return cFirstTermAssignment_0_0; }

		//TERM
		public RuleCall getFirstTermTERMParserRuleCall_0_0_0() { return cFirstTermTERMParserRuleCall_0_0_0; }

		//operator=OPERATOR
		public Assignment getOperatorAssignment_0_1() { return cOperatorAssignment_0_1; }

		//OPERATOR
		public RuleCall getOperatorOPERATORTerminalRuleCall_0_1_0() { return cOperatorOPERATORTerminalRuleCall_0_1_0; }

		//secondTerm=TERM
		public Assignment getSecondTermAssignment_0_2() { return cSecondTermAssignment_0_2; }

		//TERM
		public RuleCall getSecondTermTERMParserRuleCall_0_2_0() { return cSecondTermTERMParserRuleCall_0_2_0; }

		//alone=TERM
		public Assignment getAloneAssignment_1() { return cAloneAssignment_1; }

		//TERM
		public RuleCall getAloneTERMParserRuleCall_1_0() { return cAloneTERMParserRuleCall_1_0; }
	}

	public class TERMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TERM");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cVariableAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cVariableIDTerminalRuleCall_0_0 = (RuleCall)cVariableAssignment_0.eContents().get(0);
		private final Assignment cConstantAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cConstantINTTerminalRuleCall_1_0 = (RuleCall)cConstantAssignment_1.eContents().get(0);
		
		//TERM:
		//	variable=ID | constant=INT;
		public ParserRule getRule() { return rule; }

		//variable=ID | constant=INT
		public Alternatives getAlternatives() { return cAlternatives; }

		//variable=ID
		public Assignment getVariableAssignment_0() { return cVariableAssignment_0; }

		//ID
		public RuleCall getVariableIDTerminalRuleCall_0_0() { return cVariableIDTerminalRuleCall_0_0; }

		//constant=INT
		public Assignment getConstantAssignment_1() { return cConstantAssignment_1; }

		//INT
		public RuleCall getConstantINTTerminalRuleCall_1_0() { return cConstantINTTerminalRuleCall_1_0; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Event");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cEventNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cEventNameIDTerminalRuleCall_0_0_0 = (RuleCall)cEventNameAssignment_0_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cEventExtensionAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cEventExtensionEventExtensionsParserRuleCall_0_2_0 = (RuleCall)cEventExtensionAssignment_0_2.eContents().get(0);
		private final Assignment cNowEventAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cNowEventNowKeyword_1_0 = (Keyword)cNowEventAssignment_1.eContents().get(0);
		
		//Event:
		//	eventName=ID "." eventExtension=EventExtensions | nowEvent?="now";
		public ParserRule getRule() { return rule; }

		//eventName=ID "." eventExtension=EventExtensions | nowEvent?="now"
		public Alternatives getAlternatives() { return cAlternatives; }

		//eventName=ID "." eventExtension=EventExtensions
		public Group getGroup_0() { return cGroup_0; }

		//eventName=ID
		public Assignment getEventNameAssignment_0_0() { return cEventNameAssignment_0_0; }

		//ID
		public RuleCall getEventNameIDTerminalRuleCall_0_0_0() { return cEventNameIDTerminalRuleCall_0_0_0; }

		//"."
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }

		//eventExtension=EventExtensions
		public Assignment getEventExtensionAssignment_0_2() { return cEventExtensionAssignment_0_2; }

		//EventExtensions
		public RuleCall getEventExtensionEventExtensionsParserRuleCall_0_2_0() { return cEventExtensionEventExtensionsParserRuleCall_0_2_0; }

		//nowEvent?="now"
		public Assignment getNowEventAssignment_1() { return cNowEventAssignment_1; }

		//"now"
		public Keyword getNowEventNowKeyword_1_0() { return cNowEventNowKeyword_1_0; }
	}

	public class EventExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EventExtensions");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cExitKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cEnterKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cStartKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cEndKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cTickKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cSigKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cCallKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cSendKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cReceiveKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final Keyword cReplyKeyword_9 = (Keyword)cAlternatives.eContents().get(9);
		
		//EventExtensions:
		//	"exit" | "enter" | "start" | "end" | "tick" | "sig" | "call" | "send" | "receive" | "reply";
		public ParserRule getRule() { return rule; }

		//"exit" | "enter" | "start" | "end" | "tick" | "sig" | "call" | "send" | "receive" | "reply"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"exit"
		public Keyword getExitKeyword_0() { return cExitKeyword_0; }

		//"enter"
		public Keyword getEnterKeyword_1() { return cEnterKeyword_1; }

		//"start"
		public Keyword getStartKeyword_2() { return cStartKeyword_2; }

		//"end"
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }

		//"tick"
		public Keyword getTickKeyword_4() { return cTickKeyword_4; }

		//"sig"
		public Keyword getSigKeyword_5() { return cSigKeyword_5; }

		//"call"
		public Keyword getCallKeyword_6() { return cCallKeyword_6; }

		//"send"
		public Keyword getSendKeyword_7() { return cSendKeyword_7; }

		//"receive"
		public Keyword getReceiveKeyword_8() { return cReceiveKeyword_8; }

		//"reply"
		public Keyword getReplyKeyword_9() { return cReplyKeyword_9; }
	}
	
	
	private ModelElements pModel;
	private OrExpressionElements pOrExpression;
	private AndExpressionElements pAndExpression;
	private BaseExpressionElements pBaseExpression;
	private BooleanTermElements pBooleanTerm;
	private TimeConstraintElements pTimeConstraint;
	private BooleanVariableElements pBooleanVariable;
	private VariableConditionElements pVariableCondition;
	private EXPRESSIONElements pEXPRESSION;
	private TERMElements pTERM;
	private TerminalRule tOPERATOR;
	private EventElements pEvent;
	private EventExtensionsElements pEventExtensions;
	private TerminalRule tRELATIONS;
	private TerminalRule tOR;
	private TerminalRule tAND;
	private TerminalRule tNOT;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public BooleanExpressionsGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.correttouml.grammars.BooleanExpressions".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	expression=OrExpression;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	////============================================//
	////				BOOLEAN EXPRESSIONS			  //
	////============================================//
	//OrExpression:
	//	leftExpression=AndExpression (or=OR rightExpression=OrExpression)?;
	public OrExpressionElements getOrExpressionAccess() {
		return (pOrExpression != null) ? pOrExpression : (pOrExpression = new OrExpressionElements());
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}

	//AndExpression:
	//	leftExpression=BaseExpression (and=AND rightExpression=AndExpression)?;
	public AndExpressionElements getAndExpressionAccess() {
		return (pAndExpression != null) ? pAndExpression : (pAndExpression = new AndExpressionElements());
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}

	//BaseExpression:
	//	not=NOT? (booleanTerm=booleanTerm | "(" rootExpression=OrExpression ")");
	public BaseExpressionElements getBaseExpressionAccess() {
		return (pBaseExpression != null) ? pBaseExpression : (pBaseExpression = new BaseExpressionElements());
	}
	
	public ParserRule getBaseExpressionRule() {
		return getBaseExpressionAccess().getRule();
	}

	//booleanTerm:
	//	timeConstraint=TimeConstraint | booleanVariable=BooleanVariable | variableCondition=VariableCondition;
	public BooleanTermElements getBooleanTermAccess() {
		return (pBooleanTerm != null) ? pBooleanTerm : (pBooleanTerm = new BooleanTermElements());
	}
	
	public ParserRule getBooleanTermRule() {
		return getBooleanTermAccess().getRule();
	}

	//TimeConstraint:
	//	"@" event2=Event "-" "@" event1=Event op=RELATIONS value=INT;
	public TimeConstraintElements getTimeConstraintAccess() {
		return (pTimeConstraint != null) ? pTimeConstraint : (pTimeConstraint = new TimeConstraintElements());
	}
	
	public ParserRule getTimeConstraintRule() {
		return getTimeConstraintAccess().getRule();
	}

	//BooleanVariable:
	//	variable=ID;
	public BooleanVariableElements getBooleanVariableAccess() {
		return (pBooleanVariable != null) ? pBooleanVariable : (pBooleanVariable = new BooleanVariableElements());
	}
	
	public ParserRule getBooleanVariableRule() {
		return getBooleanVariableAccess().getRule();
	}

	//VariableCondition:
	//	"{" expression_left=EXPRESSION relation=RELATIONS expression_right=EXPRESSION "}";
	public VariableConditionElements getVariableConditionAccess() {
		return (pVariableCondition != null) ? pVariableCondition : (pVariableCondition = new VariableConditionElements());
	}
	
	public ParserRule getVariableConditionRule() {
		return getVariableConditionAccess().getRule();
	}

	//EXPRESSION:
	//	firstTerm=TERM operator=OPERATOR secondTerm=TERM | alone=TERM;
	public EXPRESSIONElements getEXPRESSIONAccess() {
		return (pEXPRESSION != null) ? pEXPRESSION : (pEXPRESSION = new EXPRESSIONElements());
	}
	
	public ParserRule getEXPRESSIONRule() {
		return getEXPRESSIONAccess().getRule();
	}

	//TERM:
	//	variable=ID | constant=INT;
	public TERMElements getTERMAccess() {
		return (pTERM != null) ? pTERM : (pTERM = new TERMElements());
	}
	
	public ParserRule getTERMRule() {
		return getTERMAccess().getRule();
	}

	//terminal OPERATOR: //TODO: the minus does not work
	//	"+" | "*" | "--";
	public TerminalRule getOPERATORRule() {
		return (tOPERATOR != null) ? tOPERATOR : (tOPERATOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "OPERATOR"));
	} 

	//Event:
	//	eventName=ID "." eventExtension=EventExtensions | nowEvent?="now";
	public EventElements getEventAccess() {
		return (pEvent != null) ? pEvent : (pEvent = new EventElements());
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//EventExtensions:
	//	"exit" | "enter" | "start" | "end" | "tick" | "sig" | "call" | "send" | "receive" | "reply";
	public EventExtensionsElements getEventExtensionsAccess() {
		return (pEventExtensions != null) ? pEventExtensions : (pEventExtensions = new EventExtensionsElements());
	}
	
	public ParserRule getEventExtensionsRule() {
		return getEventExtensionsAccess().getRule();
	}

	//terminal RELATIONS:
	//	"<" | ">" | "==" | "<=" | ">=" | "!=";
	public TerminalRule getRELATIONSRule() {
		return (tRELATIONS != null) ? tRELATIONS : (tRELATIONS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "RELATIONS"));
	} 

	//terminal OR:
	//	"||";
	public TerminalRule getORRule() {
		return (tOR != null) ? tOR : (tOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "OR"));
	} 

	//terminal AND:
	//	"&&";
	public TerminalRule getANDRule() {
		return (tAND != null) ? tAND : (tAND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AND"));
	} 

	//terminal NOT:
	//	"!!";
	public TerminalRule getNOTRule() {
		return (tNOT != null) ? tNOT : (tNOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NOT"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
