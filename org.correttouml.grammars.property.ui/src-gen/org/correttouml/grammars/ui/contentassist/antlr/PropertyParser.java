/*
 * generated by Xtext
 */
package org.correttouml.grammars.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.correttouml.grammars.services.PropertyGrammarAccess;

public class PropertyParser extends AbstractContentAssistParser {
	
	@Inject
	private PropertyGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.correttouml.grammars.ui.contentassist.antlr.internal.InternalPropertyParser createParser() {
		org.correttouml.grammars.ui.contentassist.antlr.internal.InternalPropertyParser result = new org.correttouml.grammars.ui.contentassist.antlr.internal.InternalPropertyParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCorrettoAccess().getAlternatives_1(), "rule__Corretto__Alternatives_1");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getDeclarationAccess().getAlternatives_1_2(), "rule__Declaration__Alternatives_1_2");
					put(grammarAccess.getTRIOLAccess().getAlternatives(), "rule__TRIOL__Alternatives");
					put(grammarAccess.getArithTermLAccess().getAlternatives(), "rule__ArithTermL__Alternatives");
					put(grammarAccess.getArithVarAccess().getAlternatives(), "rule__ArithVar__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getCorrettoAccess().getGroup(), "rule__Corretto__Group__0");
					put(grammarAccess.getVerifyAccess().getGroup(), "rule__Verify__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup_0(), "rule__Declaration__Group_0__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1(), "rule__Declaration__Group_1__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1_2_1(), "rule__Declaration__Group_1_2_1__0");
					put(grammarAccess.getTRIOAccess().getGroup(), "rule__TRIO__Group__0");
					put(grammarAccess.getTRIOLAccess().getGroup_0(), "rule__TRIOL__Group_0__0");
					put(grammarAccess.getTRIOLAccess().getGroup_0_1(), "rule__TRIOL__Group_0_1__0");
					put(grammarAccess.getTRIOLAccess().getGroup_2(), "rule__TRIOL__Group_2__0");
					put(grammarAccess.getTRIOLAccess().getGroup_3(), "rule__TRIOL__Group_3__0");
					put(grammarAccess.getTRIOLAccess().getGroup_4(), "rule__TRIOL__Group_4__0");
					put(grammarAccess.getTRIOLAccess().getGroup_5(), "rule__TRIOL__Group_5__0");
					put(grammarAccess.getTRIORAccess().getGroup(), "rule__TRIOR__Group__0");
					put(grammarAccess.getArithBoolAccess().getGroup(), "rule__ArithBool__Group__0");
					put(grammarAccess.getArithBoolAccess().getGroup_1(), "rule__ArithBool__Group_1__0");
					put(grammarAccess.getArithTermAccess().getGroup(), "rule__ArithTerm__Group__0");
					put(grammarAccess.getArithTermLAccess().getGroup_0(), "rule__ArithTermL__Group_0__0");
					put(grammarAccess.getArithTermLAccess().getGroup_3(), "rule__ArithTermL__Group_3__0");
					put(grammarAccess.getArithTermLAccess().getGroup_4(), "rule__ArithTermL__Group_4__0");
					put(grammarAccess.getArithTermRAccess().getGroup(), "rule__ArithTermR__Group__0");
					put(grammarAccess.getArithVarAccess().getGroup_0(), "rule__ArithVar__Group_0__0");
					put(grammarAccess.getArithVarAccess().getGroup_1(), "rule__ArithVar__Group_1__0");
					put(grammarAccess.getArithVarAccess().getGroup_2(), "rule__ArithVar__Group_2__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment_0(), "rule__Model__DeclarationsAssignment_0");
					put(grammarAccess.getModelAccess().getCorrettoCommandAssignment_1(), "rule__Model__CorrettoCommandAssignment_1");
					put(grammarAccess.getCorrettoAccess().getVerifyAssignment_1_0(), "rule__Corretto__VerifyAssignment_1_0");
					put(grammarAccess.getCorrettoAccess().getExecuteAssignment_1_1(), "rule__Corretto__ExecuteAssignment_1_1");
					put(grammarAccess.getVerifyAccess().getTrioAssignment_1(), "rule__Verify__TrioAssignment_1");
					put(grammarAccess.getDeclarationAccess().getStateNameAssignment_0_0(), "rule__Declaration__StateNameAssignment_0_0");
					put(grammarAccess.getDeclarationAccess().getObjAssignment_0_2(), "rule__Declaration__ObjAssignment_0_2");
					put(grammarAccess.getDeclarationAccess().getStdAssignment_0_4(), "rule__Declaration__StdAssignment_0_4");
					put(grammarAccess.getDeclarationAccess().getUMLStateNameAssignment_0_6(), "rule__Declaration__UMLStateNameAssignment_0_6");
					put(grammarAccess.getDeclarationAccess().getTrioVarAssignment_1_0(), "rule__Declaration__TrioVarAssignment_1_0");
					put(grammarAccess.getDeclarationAccess().getTrioAssignment_1_2_0(), "rule__Declaration__TrioAssignment_1_2_0");
					put(grammarAccess.getDeclarationAccess().getObjAssignment_1_2_1_0(), "rule__Declaration__ObjAssignment_1_2_1_0");
					put(grammarAccess.getDeclarationAccess().getStateNameAssignment_1_2_1_2(), "rule__Declaration__StateNameAssignment_1_2_1_2");
					put(grammarAccess.getTRIOAccess().getTrioLAssignment_0(), "rule__TRIO__TrioLAssignment_0");
					put(grammarAccess.getTRIOAccess().getTrioRAssignment_1(), "rule__TRIO__TrioRAssignment_1");
					put(grammarAccess.getTRIOLAccess().getTrioVarAssignment_0_0(), "rule__TRIOL__TrioVarAssignment_0_0");
					put(grammarAccess.getTRIOLAccess().getOpNameAssignment_0_1_0(), "rule__TRIOL__OpNameAssignment_0_1_0");
					put(grammarAccess.getTRIOLAccess().getArithBoolAssignment_1(), "rule__TRIOL__ArithBoolAssignment_1");
					put(grammarAccess.getTRIOLAccess().getTrioNotAssignment_2_1(), "rule__TRIOL__TrioNotAssignment_2_1");
					put(grammarAccess.getTRIOLAccess().getTrioOpFAssignment_3_1(), "rule__TRIOL__TrioOpFAssignment_3_1");
					put(grammarAccess.getTRIOLAccess().getTrioOpF1Assignment_3_3(), "rule__TRIOL__TrioOpF1Assignment_3_3");
					put(grammarAccess.getTRIOLAccess().getTrioOpFFAssignment_4_1(), "rule__TRIOL__TrioOpFFAssignment_4_1");
					put(grammarAccess.getTRIOLAccess().getTrioOpFF1Assignment_4_3(), "rule__TRIOL__TrioOpFF1Assignment_4_3");
					put(grammarAccess.getTRIOLAccess().getTrioOpFF2Assignment_4_5(), "rule__TRIOL__TrioOpFF2Assignment_4_5");
					put(grammarAccess.getTRIOLAccess().getTrioOpFNAssignment_5_1(), "rule__TRIOL__TrioOpFNAssignment_5_1");
					put(grammarAccess.getTRIOLAccess().getTrioOpFN1Assignment_5_3(), "rule__TRIOL__TrioOpFN1Assignment_5_3");
					put(grammarAccess.getTRIOLAccess().getIntAssignment_5_5(), "rule__TRIOL__IntAssignment_5_5");
					put(grammarAccess.getTRIORAccess().getTrioOP2Assignment_0(), "rule__TRIOR__TrioOP2Assignment_0");
					put(grammarAccess.getTRIORAccess().getTrioAssignment_1(), "rule__TRIOR__TrioAssignment_1");
					put(grammarAccess.getArithBoolAccess().getArithTerm1Assignment_0(), "rule__ArithBool__ArithTerm1Assignment_0");
					put(grammarAccess.getArithBoolAccess().getArithCOPAssignment_1_0(), "rule__ArithBool__ArithCOPAssignment_1_0");
					put(grammarAccess.getArithBoolAccess().getArithTerm2Assignment_1_1(), "rule__ArithBool__ArithTerm2Assignment_1_1");
					put(grammarAccess.getArithTermAccess().getArithTermLAssignment_0(), "rule__ArithTerm__ArithTermLAssignment_0");
					put(grammarAccess.getArithTermAccess().getArithTermRAssignment_1(), "rule__ArithTerm__ArithTermRAssignment_1");
					put(grammarAccess.getArithTermLAccess().getTrioAssignment_0_1(), "rule__ArithTermL__TrioAssignment_0_1");
					put(grammarAccess.getArithTermLAccess().getConstantAssignment_1(), "rule__ArithTermL__ConstantAssignment_1");
					put(grammarAccess.getArithTermLAccess().getArithVarAssignment_2(), "rule__ArithTermL__ArithVarAssignment_2");
					put(grammarAccess.getArithTermLAccess().getArithTermFAssignment_3_1(), "rule__ArithTermL__ArithTermFAssignment_3_1");
					put(grammarAccess.getArithTermLAccess().getIntFAssignment_3_3(), "rule__ArithTermL__IntFAssignment_3_3");
					put(grammarAccess.getArithTermLAccess().getArithTermPAssignment_4_1(), "rule__ArithTermL__ArithTermPAssignment_4_1");
					put(grammarAccess.getArithTermLAccess().getIntPAssignment_4_3(), "rule__ArithTermL__IntPAssignment_4_3");
					put(grammarAccess.getArithTermRAccess().getArithOPAssignment_0(), "rule__ArithTermR__ArithOPAssignment_0");
					put(grammarAccess.getArithTermRAccess().getArithTermAssignment_1(), "rule__ArithTermR__ArithTermAssignment_1");
					put(grammarAccess.getArithVarAccess().getObjAssignment_0_0(), "rule__ArithVar__ObjAssignment_0_0");
					put(grammarAccess.getArithVarAccess().getAtrAssignment_0_2(), "rule__ArithVar__AtrAssignment_0_2");
					put(grammarAccess.getArithVarAccess().getObjAssignment_1_0(), "rule__ArithVar__ObjAssignment_1_0");
					put(grammarAccess.getArithVarAccess().getOpAssignment_1_2(), "rule__ArithVar__OpAssignment_1_2");
					put(grammarAccess.getArithVarAccess().getParamAssignment_1_4(), "rule__ArithVar__ParamAssignment_1_4");
					put(grammarAccess.getArithVarAccess().getSdAssignment_2_0(), "rule__ArithVar__SdAssignment_2_0");
					put(grammarAccess.getArithVarAccess().getParamAssignment_2_2(), "rule__ArithVar__ParamAssignment_2_2");
					put(grammarAccess.getDataTypeAccess().getIAssignment_0(), "rule__DataType__IAssignment_0");
					put(grammarAccess.getDataTypeAccess().getFloatAssignment_1(), "rule__DataType__FloatAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.correttouml.grammars.ui.contentassist.antlr.internal.InternalPropertyParser typedParser = (org.correttouml.grammars.ui.contentassist.antlr.internal.InternalPropertyParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PropertyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PropertyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	public void initializeFor(AbstractRule rule) {
		// TODO Auto-generated method stub
		
	}
}
