package org.correttouml.grammars.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.correttouml.grammars.booleanExpressions.AndExpression;
import org.correttouml.grammars.booleanExpressions.BaseExpression;
import org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage;
import org.correttouml.grammars.booleanExpressions.BooleanVariable;
import org.correttouml.grammars.booleanExpressions.Event;
import org.correttouml.grammars.booleanExpressions.Model;
import org.correttouml.grammars.booleanExpressions.OrExpression;
import org.correttouml.grammars.booleanExpressions.TimeConstraint;
import org.correttouml.grammars.booleanExpressions.VariableCondition;
import org.correttouml.grammars.booleanExpressions.booleanTerm;
import org.correttouml.grammars.services.BooleanExpressionsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BooleanExpressionsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BooleanExpressionsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BooleanExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BooleanExpressionsPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.BASE_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule()) {
					sequence_BaseExpression(context, (BaseExpression) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.BOOLEAN_VARIABLE:
				if(context == grammarAccess.getBooleanVariableRule()) {
					sequence_BooleanVariable(context, (BooleanVariable) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.OR_EXPRESSION:
				if(context == grammarAccess.getOrExpressionRule()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.TIME_CONSTRAINT:
				if(context == grammarAccess.getTimeConstraintRule()) {
					sequence_TimeConstraint(context, (TimeConstraint) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.VARIABLE_CONDITION:
				if(context == grammarAccess.getVariableConditionRule()) {
					sequence_VariableCondition(context, (VariableCondition) semanticObject); 
					return; 
				}
				else break;
			case BooleanExpressionsPackage.BOOLEAN_TERM:
				if(context == grammarAccess.getBooleanTermRule()) {
					sequence_booleanTerm(context, (booleanTerm) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftExpression=BaseExpression (and=AND rightExpression=AndExpression)?)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (not=NOT? (booleanTerm=booleanTerm | rootExpression=OrExpression))
	 */
	protected void sequence_BaseExpression(EObject context, BaseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=ID
	 */
	protected void sequence_BooleanVariable(EObject context, BooleanVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BooleanExpressionsPackage.Literals.BOOLEAN_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BooleanExpressionsPackage.Literals.BOOLEAN_VARIABLE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((eventName=ID eventExtension=EventExtensions) | nowEvent?='now')
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=OrExpression
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BooleanExpressionsPackage.Literals.MODEL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BooleanExpressionsPackage.Literals.MODEL__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpression=AndExpression (or=OR rightExpression=OrExpression)?)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event2=Event event1=Event op=RELATIONS value=INT)
	 */
	protected void sequence_TimeConstraint(EObject context, TimeConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__EVENT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__EVENT2));
			if(transientValues.isValueTransient(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__EVENT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__EVENT1));
			if(transientValues.isValueTransient(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__OP));
			if(transientValues.isValueTransient(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BooleanExpressionsPackage.Literals.TIME_CONSTRAINT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0(), semanticObject.getEvent2());
		feeder.accept(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0(), semanticObject.getEvent1());
		feeder.accept(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=ID relation=RELATIONS (value=INT | rightVariable=ID))
	 */
	protected void sequence_VariableCondition(EObject context, VariableCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (timeConstraint=TimeConstraint | booleanVariable=BooleanVariable | variableCondition=VariableCondition)
	 */
	protected void sequence_booleanTerm(EObject context, booleanTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
