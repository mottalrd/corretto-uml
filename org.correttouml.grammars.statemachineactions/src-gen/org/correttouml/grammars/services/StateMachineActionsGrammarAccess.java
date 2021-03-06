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
public class StateMachineActionsGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActionActionParserRuleCall_0_0 = (RuleCall)cActionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cActionsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cActionsModelParserRuleCall_1_1_0 = (RuleCall)cActionsAssignment_1_1.eContents().get(0);
		
		//Model:
		//	action=Action (',' actions=Model)?;
		public ParserRule getRule() { return rule; }

		//action=Action (',' actions=Model)?
		public Group getGroup() { return cGroup; }

		//action=Action
		public Assignment getActionAssignment_0() { return cActionAssignment_0; }

		//Action
		public RuleCall getActionActionParserRuleCall_0_0() { return cActionActionParserRuleCall_0_0; }

		//(',' actions=Model)?
		public Group getGroup_1() { return cGroup_1; }

		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//actions=Model
		public Assignment getActionsAssignment_1_1() { return cActionsAssignment_1_1; }

		//Model
		public RuleCall getActionsModelParserRuleCall_1_1_0() { return cActionsModelParserRuleCall_1_1_0; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cAssignmentAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cAssignmentAssignmentParserRuleCall_0_0 = (RuleCall)cAssignmentAssignment_0.eContents().get(0);
		private final Assignment cEventActionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cEventActionEventActionParserRuleCall_1_0 = (RuleCall)cEventActionAssignment_1.eContents().get(0);
		
		//Action:
		//	assignment=Assignment | eventAction=EventAction;
		public ParserRule getRule() { return rule; }

		//assignment=Assignment | eventAction=EventAction
		public Alternatives getAlternatives() { return cAlternatives; }

		//assignment=Assignment
		public Assignment getAssignmentAssignment_0() { return cAssignmentAssignment_0; }

		//Assignment
		public RuleCall getAssignmentAssignmentParserRuleCall_0_0() { return cAssignmentAssignmentParserRuleCall_0_0; }

		//eventAction=EventAction
		public Assignment getEventActionAssignment_1() { return cEventActionAssignment_1; }

		//EventAction
		public RuleCall getEventActionEventActionParserRuleCall_1_0() { return cEventActionEventActionParserRuleCall_1_0; }
	}

	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftvarAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftvarIDTerminalRuleCall_0_0 = (RuleCall)cLeftvarAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionEXPRESSIONParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		/// * 
		// * This is replicated in eu.mades.assignment because I did not found a way
		// * to make cross references between grammars
		// * / Assignment:
		//	leftvar=ID '=' expression=EXPRESSION;
		public ParserRule getRule() { return rule; }

		//leftvar=ID '=' expression=EXPRESSION
		public Group getGroup() { return cGroup; }

		//leftvar=ID
		public Assignment getLeftvarAssignment_0() { return cLeftvarAssignment_0; }

		//ID
		public RuleCall getLeftvarIDTerminalRuleCall_0_0() { return cLeftvarIDTerminalRuleCall_0_0; }

		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//expression=EXPRESSION
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//EXPRESSION
		public RuleCall getExpressionEXPRESSIONParserRuleCall_2_0() { return cExpressionEXPRESSIONParserRuleCall_2_0; }
	}

	public class EXPRESSIONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.EXPRESSION");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.TERM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cIsPastAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final Keyword cIsPastYKeyword_0_0_0 = (Keyword)cIsPastAssignment_0_0.eContents().get(0);
		private final Assignment cIsFutureAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cIsFutureXKeyword_0_1_0 = (Keyword)cIsFutureAssignment_0_1.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cVariableAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cVariableIDTerminalRuleCall_1_0_0 = (RuleCall)cVariableAssignment_1_0.eContents().get(0);
		private final Assignment cConstantAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cConstantINTTerminalRuleCall_1_1_0 = (RuleCall)cConstantAssignment_1_1.eContents().get(0);
		
		//TERM:
		//	(isPast='<Y>' | isFuture='<X>')? (variable=ID | constant=INT);
		public ParserRule getRule() { return rule; }

		//(isPast='<Y>' | isFuture='<X>')? (variable=ID | constant=INT)
		public Group getGroup() { return cGroup; }

		//(isPast='<Y>' | isFuture='<X>')?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//isPast='<Y>'
		public Assignment getIsPastAssignment_0_0() { return cIsPastAssignment_0_0; }

		//'<Y>'
		public Keyword getIsPastYKeyword_0_0_0() { return cIsPastYKeyword_0_0_0; }

		//isFuture='<X>'
		public Assignment getIsFutureAssignment_0_1() { return cIsFutureAssignment_0_1; }

		//'<X>'
		public Keyword getIsFutureXKeyword_0_1_0() { return cIsFutureXKeyword_0_1_0; }

		//(variable=ID | constant=INT)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//variable=ID
		public Assignment getVariableAssignment_1_0() { return cVariableAssignment_1_0; }

		//ID
		public RuleCall getVariableIDTerminalRuleCall_1_0_0() { return cVariableIDTerminalRuleCall_1_0_0; }

		//constant=INT
		public Assignment getConstantAssignment_1_1() { return cConstantAssignment_1_1; }

		//INT
		public RuleCall getConstantINTTerminalRuleCall_1_1_0() { return cConstantINTTerminalRuleCall_1_1_0; }
	}

	public class EventActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.EventAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLinkAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLinkLinkParserRuleCall_0_0 = (RuleCall)cLinkAssignment_0.eContents().get(0);
		private final Assignment cEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEventEventParserRuleCall_1_0 = (RuleCall)cEventAssignment_1.eContents().get(0);
		
		//EventAction:
		//	link=Link? event=Event;
		public ParserRule getRule() { return rule; }

		////we need the link for .call events
		//link=Link? event=Event
		public Group getGroup() { return cGroup; }

		////we need the link for .call events
		//link=Link?
		public Assignment getLinkAssignment_0() { return cLinkAssignment_0; }

		//Link
		public RuleCall getLinkLinkParserRuleCall_0_0() { return cLinkLinkParserRuleCall_0_0; }

		//event=Event
		public Assignment getEventAssignment_1() { return cEventAssignment_1; }

		//Event
		public RuleCall getEventEventParserRuleCall_1_0() { return cEventEventParserRuleCall_1_0; }
	}

	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.Link");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cNumberSignKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cLinkNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cLinkNameIDTerminalRuleCall_0_1_0 = (RuleCall)cLinkNameAssignment_0_1.eContents().get(0);
		private final Keyword cFullStopKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cAssociationEndAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cAssociationEndIDTerminalRuleCall_0_3_0 = (RuleCall)cAssociationEndAssignment_0_3.eContents().get(0);
		private final Assignment cSelfAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cSelfSelfKeyword_1_0 = (Keyword)cSelfAssignment_1.eContents().get(0);
		
		//Link:
		//	'#' linkName=ID '.' associationEnd=ID | self='self';
		public ParserRule getRule() { return rule; }

		//'#' linkName=ID '.' associationEnd=ID | self='self'
		public Alternatives getAlternatives() { return cAlternatives; }

		//'#' linkName=ID '.' associationEnd=ID
		public Group getGroup_0() { return cGroup_0; }

		//'#'
		public Keyword getNumberSignKeyword_0_0() { return cNumberSignKeyword_0_0; }

		//linkName=ID
		public Assignment getLinkNameAssignment_0_1() { return cLinkNameAssignment_0_1; }

		//ID
		public RuleCall getLinkNameIDTerminalRuleCall_0_1_0() { return cLinkNameIDTerminalRuleCall_0_1_0; }

		//'.'
		public Keyword getFullStopKeyword_0_2() { return cFullStopKeyword_0_2; }

		//associationEnd=ID
		public Assignment getAssociationEndAssignment_0_3() { return cAssociationEndAssignment_0_3; }

		//ID
		public RuleCall getAssociationEndIDTerminalRuleCall_0_3_0() { return cAssociationEndIDTerminalRuleCall_0_3_0; }

		//self='self'
		public Assignment getSelfAssignment_1() { return cSelfAssignment_1; }

		//'self'
		public Keyword getSelfSelfKeyword_1_0() { return cSelfSelfKeyword_1_0; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cEventNameAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cEventNameIDTerminalRuleCall_1_0_0 = (RuleCall)cEventNameAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cAssociationEndAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cAssociationEndIDTerminalRuleCall_1_1_0_0 = (RuleCall)cAssociationEndAssignment_1_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cOpNameAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cOpNameIDTerminalRuleCall_1_1_2_0 = (RuleCall)cOpNameAssignment_1_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParametersAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cParametersParametersParserRuleCall_2_1_0 = (RuleCall)cParametersAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEventExtensionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEventExtensionEventExtensionsParserRuleCall_4_0 = (RuleCall)cEventExtensionAssignment_4.eContents().get(0);
		
		////Event:
		////	'@' eventName=ID ('(' parameters=Parameters ')')? '.' eventExtension=EventExtensions
		////;
		//Event:
		//	'@' (eventName=ID | associationEnd=ID '.' opName=ID) ('(' parameters=Parameters ')')? '.'
		//	eventExtension=EventExtensions;
		public ParserRule getRule() { return rule; }

		//'@' (eventName=ID | associationEnd=ID '.' opName=ID) ('(' parameters=Parameters ')')? '.' eventExtension=EventExtensions
		public Group getGroup() { return cGroup; }

		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//(eventName=ID | associationEnd=ID '.' opName=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//eventName=ID
		public Assignment getEventNameAssignment_1_0() { return cEventNameAssignment_1_0; }

		//ID
		public RuleCall getEventNameIDTerminalRuleCall_1_0_0() { return cEventNameIDTerminalRuleCall_1_0_0; }

		//associationEnd=ID '.' opName=ID
		public Group getGroup_1_1() { return cGroup_1_1; }

		//associationEnd=ID
		public Assignment getAssociationEndAssignment_1_1_0() { return cAssociationEndAssignment_1_1_0; }

		//ID
		public RuleCall getAssociationEndIDTerminalRuleCall_1_1_0_0() { return cAssociationEndIDTerminalRuleCall_1_1_0_0; }

		//'.'
		public Keyword getFullStopKeyword_1_1_1() { return cFullStopKeyword_1_1_1; }

		//opName=ID
		public Assignment getOpNameAssignment_1_1_2() { return cOpNameAssignment_1_1_2; }

		//ID
		public RuleCall getOpNameIDTerminalRuleCall_1_1_2_0() { return cOpNameIDTerminalRuleCall_1_1_2_0; }

		//('(' parameters=Parameters ')')?
		public Group getGroup_2() { return cGroup_2; }

		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//parameters=Parameters
		public Assignment getParametersAssignment_2_1() { return cParametersAssignment_2_1; }

		//Parameters
		public RuleCall getParametersParametersParserRuleCall_2_1_0() { return cParametersParametersParserRuleCall_2_1_0; }

		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//eventExtension=EventExtensions
		public Assignment getEventExtensionAssignment_4() { return cEventExtensionAssignment_4; }

		//EventExtensions
		public RuleCall getEventExtensionEventExtensionsParserRuleCall_4_0() { return cEventExtensionEventExtensionsParserRuleCall_4_0; }
	}

	public class ParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.Parameters");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cGroup_0.eContents().get(0);
		private final Assignment cIsPastAssignment_0_0_0 = (Assignment)cAlternatives_0_0.eContents().get(0);
		private final Keyword cIsPastPKeyword_0_0_0_0 = (Keyword)cIsPastAssignment_0_0_0.eContents().get(0);
		private final Assignment cIsFutureAssignment_0_0_1 = (Assignment)cAlternatives_0_0.eContents().get(1);
		private final Keyword cIsFutureFKeyword_0_0_1_0 = (Keyword)cIsFutureAssignment_0_0_1.eContents().get(0);
		private final Assignment cParamAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cParamIDTerminalRuleCall_0_1_0 = (RuleCall)cParamAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Assignment cIsPastAssignment_1_0_0 = (Assignment)cAlternatives_1_0.eContents().get(0);
		private final Keyword cIsPastPKeyword_1_0_0_0 = (Keyword)cIsPastAssignment_1_0_0.eContents().get(0);
		private final Assignment cIsFutureAssignment_1_0_1 = (Assignment)cAlternatives_1_0.eContents().get(1);
		private final Keyword cIsFutureFKeyword_1_0_1_0 = (Keyword)cIsFutureAssignment_1_0_1.eContents().get(0);
		private final Assignment cParamAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cParamIDTerminalRuleCall_1_1_0 = (RuleCall)cParamAssignment_1_1.eContents().get(0);
		private final Keyword cCommaKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cParametersAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cParametersParametersParserRuleCall_1_3_0 = (RuleCall)cParametersAssignment_1_3.eContents().get(0);
		
		//Parameters:
		//	(isPast='<P>' | isFuture='<F>')? param=ID | (isPast='<P>' | isFuture='<F>')? param=ID ',' parameters=Parameters;
		public ParserRule getRule() { return rule; }

		//(isPast='<P>' | isFuture='<F>')? param=ID | (isPast='<P>' | isFuture='<F>')? param=ID ',' parameters=Parameters
		public Alternatives getAlternatives() { return cAlternatives; }

		//(isPast='<P>' | isFuture='<F>')? param=ID
		public Group getGroup_0() { return cGroup_0; }

		//(isPast='<P>' | isFuture='<F>')?
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }

		//isPast='<P>'
		public Assignment getIsPastAssignment_0_0_0() { return cIsPastAssignment_0_0_0; }

		//'<P>'
		public Keyword getIsPastPKeyword_0_0_0_0() { return cIsPastPKeyword_0_0_0_0; }

		//isFuture='<F>'
		public Assignment getIsFutureAssignment_0_0_1() { return cIsFutureAssignment_0_0_1; }

		//'<F>'
		public Keyword getIsFutureFKeyword_0_0_1_0() { return cIsFutureFKeyword_0_0_1_0; }

		//param=ID
		public Assignment getParamAssignment_0_1() { return cParamAssignment_0_1; }

		//ID
		public RuleCall getParamIDTerminalRuleCall_0_1_0() { return cParamIDTerminalRuleCall_0_1_0; }

		//(isPast='<P>' | isFuture='<F>')? param=ID ',' parameters=Parameters
		public Group getGroup_1() { return cGroup_1; }

		//(isPast='<P>' | isFuture='<F>')?
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }

		//isPast='<P>'
		public Assignment getIsPastAssignment_1_0_0() { return cIsPastAssignment_1_0_0; }

		//'<P>'
		public Keyword getIsPastPKeyword_1_0_0_0() { return cIsPastPKeyword_1_0_0_0; }

		//isFuture='<F>'
		public Assignment getIsFutureAssignment_1_0_1() { return cIsFutureAssignment_1_0_1; }

		//'<F>'
		public Keyword getIsFutureFKeyword_1_0_1_0() { return cIsFutureFKeyword_1_0_1_0; }

		//param=ID
		public Assignment getParamAssignment_1_1() { return cParamAssignment_1_1; }

		//ID
		public RuleCall getParamIDTerminalRuleCall_1_1_0() { return cParamIDTerminalRuleCall_1_1_0; }

		//','
		public Keyword getCommaKeyword_1_2() { return cCommaKeyword_1_2; }

		//parameters=Parameters
		public Assignment getParametersAssignment_1_3() { return cParametersAssignment_1_3; }

		//Parameters
		public RuleCall getParametersParametersParserRuleCall_1_3_0() { return cParametersParametersParserRuleCall_1_3_0; }
	}

	public class EventExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.EventExtensions");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cExitKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cEnterKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cStartKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cEndKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cTickKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cSigKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cCallKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		
		//EventExtensions:
		//	'exit' | 'enter' | 'start' | 'end' | 'tick' | 'sig' | 'call';
		public ParserRule getRule() { return rule; }

		//'exit' | 'enter' | 'start' | 'end' | 'tick' | 'sig' | 'call'
		public Alternatives getAlternatives() { return cAlternatives; }

		//'exit'
		public Keyword getExitKeyword_0() { return cExitKeyword_0; }

		//'enter'
		public Keyword getEnterKeyword_1() { return cEnterKeyword_1; }

		//'start'
		public Keyword getStartKeyword_2() { return cStartKeyword_2; }

		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }

		//'tick'
		public Keyword getTickKeyword_4() { return cTickKeyword_4; }

		//'sig'
		public Keyword getSigKeyword_5() { return cSigKeyword_5; }

		//'call'
		public Keyword getCallKeyword_6() { return cCallKeyword_6; }
	}
	
	
	private final ModelElements pModel;
	private final ActionElements pAction;
	private final AssignmentElements pAssignment;
	private final EXPRESSIONElements pEXPRESSION;
	private final TERMElements pTERM;
	private final TerminalRule tOPERATOR;
	private final EventActionElements pEventAction;
	private final LinkElements pLink;
	private final EventElements pEvent;
	private final ParametersElements pParameters;
	private final EventExtensionsElements pEventExtensions;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public StateMachineActionsGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAction = new ActionElements();
		this.pAssignment = new AssignmentElements();
		this.pEXPRESSION = new EXPRESSIONElements();
		this.pTERM = new TERMElements();
		this.tOPERATOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.correttouml.grammars.StateMachineActions.OPERATOR");
		this.pEventAction = new EventActionElements();
		this.pLink = new LinkElements();
		this.pEvent = new EventElements();
		this.pParameters = new ParametersElements();
		this.pEventExtensions = new EventExtensionsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.correttouml.grammars.StateMachineActions".equals(grammar.getName())) {
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
	//	action=Action (',' actions=Model)?;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Action:
	//	assignment=Assignment | eventAction=EventAction;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	/// * 
	// * This is replicated in eu.mades.assignment because I did not found a way
	// * to make cross references between grammars
	// * / Assignment:
	//	leftvar=ID '=' expression=EXPRESSION;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}

	//EXPRESSION:
	//	firstTerm=TERM operator=OPERATOR secondTerm=TERM | alone=TERM;
	public EXPRESSIONElements getEXPRESSIONAccess() {
		return pEXPRESSION;
	}
	
	public ParserRule getEXPRESSIONRule() {
		return getEXPRESSIONAccess().getRule();
	}

	//TERM:
	//	(isPast='<Y>' | isFuture='<X>')? (variable=ID | constant=INT);
	public TERMElements getTERMAccess() {
		return pTERM;
	}
	
	public ParserRule getTERMRule() {
		return getTERMAccess().getRule();
	}

	//terminal OPERATOR:
	//	'-' | '+' | '*';
	public TerminalRule getOPERATORRule() {
		return tOPERATOR;
	} 

	//EventAction:
	//	link=Link? event=Event;
	public EventActionElements getEventActionAccess() {
		return pEventAction;
	}
	
	public ParserRule getEventActionRule() {
		return getEventActionAccess().getRule();
	}

	//Link:
	//	'#' linkName=ID '.' associationEnd=ID | self='self';
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}

	////Event:
	////	'@' eventName=ID ('(' parameters=Parameters ')')? '.' eventExtension=EventExtensions
	////;
	//Event:
	//	'@' (eventName=ID | associationEnd=ID '.' opName=ID) ('(' parameters=Parameters ')')? '.'
	//	eventExtension=EventExtensions;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//Parameters:
	//	(isPast='<P>' | isFuture='<F>')? param=ID | (isPast='<P>' | isFuture='<F>')? param=ID ',' parameters=Parameters;
	public ParametersElements getParametersAccess() {
		return pParameters;
	}
	
	public ParserRule getParametersRule() {
		return getParametersAccess().getRule();
	}

	//EventExtensions:
	//	'exit' | 'enter' | 'start' | 'end' | 'tick' | 'sig' | 'call';
	public EventExtensionsElements getEventExtensionsAccess() {
		return pEventExtensions;
	}
	
	public ParserRule getEventExtensionsRule() {
		return getEventExtensionsAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
