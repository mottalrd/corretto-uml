/**
 */
package org.correttouml.grammars.booleanExpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPRESSION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getFirstTerm <em>First Term</em>}</li>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getSecondTerm <em>Second Term</em>}</li>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getAlone <em>Alone</em>}</li>
 * </ul>
 *
 * @see org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage#getEXPRESSION()
 * @model
 * @generated
 */
public interface EXPRESSION extends EObject
{
  /**
   * Returns the value of the '<em><b>First Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Term</em>' containment reference.
   * @see #setFirstTerm(TERM)
   * @see org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage#getEXPRESSION_FirstTerm()
   * @model containment="true"
   * @generated
   */
  TERM getFirstTerm();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getFirstTerm <em>First Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Term</em>' containment reference.
   * @see #getFirstTerm()
   * @generated
   */
  void setFirstTerm(TERM value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage#getEXPRESSION_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Second Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Term</em>' containment reference.
   * @see #setSecondTerm(TERM)
   * @see org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage#getEXPRESSION_SecondTerm()
   * @model containment="true"
   * @generated
   */
  TERM getSecondTerm();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getSecondTerm <em>Second Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Term</em>' containment reference.
   * @see #getSecondTerm()
   * @generated
   */
  void setSecondTerm(TERM value);

  /**
   * Returns the value of the '<em><b>Alone</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alone</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alone</em>' containment reference.
   * @see #setAlone(TERM)
   * @see org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage#getEXPRESSION_Alone()
   * @model containment="true"
   * @generated
   */
  TERM getAlone();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.booleanExpressions.EXPRESSION#getAlone <em>Alone</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alone</em>' containment reference.
   * @see #getAlone()
   * @generated
   */
  void setAlone(TERM value);

} // EXPRESSION
