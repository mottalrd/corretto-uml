/**
 */
package org.correttouml.grammars.booleanExpressions.impl;

import org.correttouml.grammars.booleanExpressions.BooleanExpressionsPackage;
import org.correttouml.grammars.booleanExpressions.EXPRESSION;
import org.correttouml.grammars.booleanExpressions.TERM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPRESSION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.impl.EXPRESSIONImpl#getFirstTerm <em>First Term</em>}</li>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.impl.EXPRESSIONImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.impl.EXPRESSIONImpl#getSecondTerm <em>Second Term</em>}</li>
 *   <li>{@link org.correttouml.grammars.booleanExpressions.impl.EXPRESSIONImpl#getAlone <em>Alone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXPRESSIONImpl extends MinimalEObjectImpl.Container implements EXPRESSION
{
  /**
   * The cached value of the '{@link #getFirstTerm() <em>First Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstTerm()
   * @generated
   * @ordered
   */
  protected TERM firstTerm;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecondTerm() <em>Second Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondTerm()
   * @generated
   * @ordered
   */
  protected TERM secondTerm;

  /**
   * The cached value of the '{@link #getAlone() <em>Alone</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlone()
   * @generated
   * @ordered
   */
  protected TERM alone;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRESSIONImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BooleanExpressionsPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public TERM getFirstTerm()
  {
    return firstTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstTerm(TERM newFirstTerm, NotificationChain msgs)
  {
    TERM oldFirstTerm = firstTerm;
    firstTerm = newFirstTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__FIRST_TERM, oldFirstTerm, newFirstTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public void setFirstTerm(TERM newFirstTerm)
  {
    if (newFirstTerm != firstTerm)
    {
      NotificationChain msgs = null;
      if (firstTerm != null)
        msgs = ((InternalEObject)firstTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleanExpressionsPackage.EXPRESSION__FIRST_TERM, null, msgs);
      if (newFirstTerm != null)
        msgs = ((InternalEObject)newFirstTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleanExpressionsPackage.EXPRESSION__FIRST_TERM, null, msgs);
      msgs = basicSetFirstTerm(newFirstTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__FIRST_TERM, newFirstTerm, newFirstTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public TERM getSecondTerm()
  {
    return secondTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondTerm(TERM newSecondTerm, NotificationChain msgs)
  {
    TERM oldSecondTerm = secondTerm;
    secondTerm = newSecondTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__SECOND_TERM, oldSecondTerm, newSecondTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public void setSecondTerm(TERM newSecondTerm)
  {
    if (newSecondTerm != secondTerm)
    {
      NotificationChain msgs = null;
      if (secondTerm != null)
        msgs = ((InternalEObject)secondTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleanExpressionsPackage.EXPRESSION__SECOND_TERM, null, msgs);
      if (newSecondTerm != null)
        msgs = ((InternalEObject)newSecondTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleanExpressionsPackage.EXPRESSION__SECOND_TERM, null, msgs);
      msgs = basicSetSecondTerm(newSecondTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__SECOND_TERM, newSecondTerm, newSecondTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public TERM getAlone()
  {
    return alone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlone(TERM newAlone, NotificationChain msgs)
  {
    TERM oldAlone = alone;
    alone = newAlone;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__ALONE, oldAlone, newAlone);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public void setAlone(TERM newAlone)
  {
    if (newAlone != alone)
    {
      NotificationChain msgs = null;
      if (alone != null)
        msgs = ((InternalEObject)alone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleanExpressionsPackage.EXPRESSION__ALONE, null, msgs);
      if (newAlone != null)
        msgs = ((InternalEObject)newAlone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleanExpressionsPackage.EXPRESSION__ALONE, null, msgs);
      msgs = basicSetAlone(newAlone, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BooleanExpressionsPackage.EXPRESSION__ALONE, newAlone, newAlone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BooleanExpressionsPackage.EXPRESSION__FIRST_TERM:
        return basicSetFirstTerm(null, msgs);
      case BooleanExpressionsPackage.EXPRESSION__SECOND_TERM:
        return basicSetSecondTerm(null, msgs);
      case BooleanExpressionsPackage.EXPRESSION__ALONE:
        return basicSetAlone(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BooleanExpressionsPackage.EXPRESSION__FIRST_TERM:
        return getFirstTerm();
      case BooleanExpressionsPackage.EXPRESSION__OPERATOR:
        return getOperator();
      case BooleanExpressionsPackage.EXPRESSION__SECOND_TERM:
        return getSecondTerm();
      case BooleanExpressionsPackage.EXPRESSION__ALONE:
        return getAlone();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BooleanExpressionsPackage.EXPRESSION__FIRST_TERM:
        setFirstTerm((TERM)newValue);
        return;
      case BooleanExpressionsPackage.EXPRESSION__OPERATOR:
        setOperator((String)newValue);
        return;
      case BooleanExpressionsPackage.EXPRESSION__SECOND_TERM:
        setSecondTerm((TERM)newValue);
        return;
      case BooleanExpressionsPackage.EXPRESSION__ALONE:
        setAlone((TERM)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BooleanExpressionsPackage.EXPRESSION__FIRST_TERM:
        setFirstTerm((TERM)null);
        return;
      case BooleanExpressionsPackage.EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case BooleanExpressionsPackage.EXPRESSION__SECOND_TERM:
        setSecondTerm((TERM)null);
        return;
      case BooleanExpressionsPackage.EXPRESSION__ALONE:
        setAlone((TERM)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BooleanExpressionsPackage.EXPRESSION__FIRST_TERM:
        return firstTerm != null;
      case BooleanExpressionsPackage.EXPRESSION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case BooleanExpressionsPackage.EXPRESSION__SECOND_TERM:
        return secondTerm != null;
      case BooleanExpressionsPackage.EXPRESSION__ALONE:
        return alone != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //EXPRESSIONImpl
