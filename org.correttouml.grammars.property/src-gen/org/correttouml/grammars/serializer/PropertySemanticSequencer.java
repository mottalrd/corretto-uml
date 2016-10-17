package org.correttouml.grammars.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.correttouml.grammars.property.ArithBool;
import org.correttouml.grammars.property.ArithTerm;
import org.correttouml.grammars.property.ArithTermL;
import org.correttouml.grammars.property.ArithTermR;
import org.correttouml.grammars.property.ArithVar;
import org.correttouml.grammars.property.Corretto;
import org.correttouml.grammars.property.DataType;
import org.correttouml.grammars.property.Declaration;
import org.correttouml.grammars.property.Model;
import org.correttouml.grammars.property.PropertyPackage;
import org.correttouml.grammars.property.TRIO;
import org.correttouml.grammars.property.TRIOL;
import org.correttouml.grammars.property.TRIOR;
import org.correttouml.grammars.property.Verify;
import org.correttouml.grammars.services.PropertyGrammarAccess;
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
public class PropertySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PropertyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PropertyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PropertyPackage.ARITH_BOOL:
				if(context == grammarAccess.getArithBoolRule()) {
					sequence_ArithBool(context, (ArithBool) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.ARITH_TERM:
				if(context == grammarAccess.getArithTermRule()) {
					sequence_ArithTerm(context, (ArithTerm) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.ARITH_TERM_L:
				if(context == grammarAccess.getArithTermLRule()) {
					sequence_ArithTermL(context, (ArithTermL) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.ARITH_TERM_R:
				if(context == grammarAccess.getArithTermRRule()) {
					sequence_ArithTermR(context, (ArithTermR) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.ARITH_VAR:
				if(context == grammarAccess.getArithVarRule()) {
					sequence_ArithVar(context, (ArithVar) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.CORRETTO:
				if(context == grammarAccess.getCorrettoRule()) {
					sequence_Corretto(context, (Corretto) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.TRIO:
				if(context == grammarAccess.getTRIORule()) {
					sequence_TRIO(context, (TRIO) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.TRIOL:
				if(context == grammarAccess.getTRIOLRule()) {
					sequence_TRIOL(context, (TRIOL) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.TRIOR:
				if(context == grammarAccess.getTRIORRule()) {
					sequence_TRIOR(context, (TRIOR) semanticObject); 
					return; 
				}
				else break;
			case PropertyPackage.VERIFY:
				if(context == grammarAccess.getVerifyRule()) {
					sequence_Verify(context, (Verify) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (arithTerm1=ArithTerm (arithCOP=ARITH_COMPARE_OP arithTerm2=ArithTerm)?)
	 */
	protected void sequence_ArithBool(EObject context, ArithBool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trio=TRIO | constant=DataType | arithVar=ArithVar | (arithTermF=ArithTerm intF=INT) | (arithTermP=ArithTerm intP=INT))
	 */
	protected void sequence_ArithTermL(EObject context, ArithTermL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arithOP=ARITH_OP arithTerm=ArithTerm)
	 */
	protected void sequence_ArithTermR(EObject context, ArithTermR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.ARITH_TERM_R__ARITH_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.ARITH_TERM_R__ARITH_OP));
			if(transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.ARITH_TERM_R__ARITH_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.ARITH_TERM_R__ARITH_TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithTermRAccess().getArithOPARITH_OPTerminalRuleCall_0_0(), semanticObject.getArithOP());
		feeder.accept(grammarAccess.getArithTermRAccess().getArithTermArithTermParserRuleCall_1_0(), semanticObject.getArithTerm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arithTermL=ArithTermL arithTermR=ArithTermR?)
	 */
	protected void sequence_ArithTerm(EObject context, ArithTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((obj=ID atr=ID) | (obj=ID op=ID param=ID) | (sd=ID param=ID) | staticVar=ID)
	 */
	protected void sequence_ArithVar(EObject context, ArithVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (verify=Verify | execute=EXECUTE)
	 */
	protected void sequence_Corretto(EObject context, Corretto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (i=INT float=FLOAT?)
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((stateName=ID obj=ID std=ID uMLStateName=ID) | (trioVar=ID (trio=TRIO | (obj=ID (stateName=ID | operationName=ID)))))
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration* correttoCommand=Corretto)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         trioVar=ID | 
	 *         signal=ID | 
	 *         arithBool=ArithBool | 
	 *         trioNot=TRIO | 
	 *         (trioOpF=TRIOOPF trioOpF1=TRIO) | 
	 *         (trioOpFF=TRIOOPFF trioOpFF1=TRIO trioOpFF2=TRIO) | 
	 *         (trioOpFN=TRIOOPFN trioOpFN1=TRIO int=INT)
	 *     )
	 */
	protected void sequence_TRIOL(EObject context, TRIOL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trioOP2=TRIOOP2 trio=TRIO)
	 */
	protected void sequence_TRIOR(EObject context, TRIOR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.TRIOR__TRIO_OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.TRIOR__TRIO_OP2));
			if(transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.TRIOR__TRIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.TRIOR__TRIO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTRIORAccess().getTrioOP2TRIOOP2TerminalRuleCall_0_0(), semanticObject.getTrioOP2());
		feeder.accept(grammarAccess.getTRIORAccess().getTrioTRIOParserRuleCall_1_0(), semanticObject.getTrio());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (trioL=TRIOL trioR=TRIOR?)
	 */
	protected void sequence_TRIO(EObject context, TRIO semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     trio=TRIO
	 */
	protected void sequence_Verify(EObject context, Verify semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertyPackage.Literals.VERIFY__TRIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertyPackage.Literals.VERIFY__TRIO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVerifyAccess().getTrioTRIOParserRuleCall_1_0(), semanticObject.getTrio());
		feeder.finish();
	}
}
