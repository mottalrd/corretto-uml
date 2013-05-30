/**
 */
package org.correttouml.grammars.stateMachineTriggers.impl;

import org.correttouml.grammars.stateMachineTriggers.Event;
import org.correttouml.grammars.stateMachineTriggers.Left;
import org.correttouml.grammars.stateMachineTriggers.StateMachineTriggersPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.correttouml.grammars.stateMachineTriggers.impl.LeftImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.correttouml.grammars.stateMachineTriggers.impl.LeftImpl#getSelf <em>Self</em>}</li>
 *   <li>{@link org.correttouml.grammars.stateMachineTriggers.impl.LeftImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftImpl extends MinimalEObjectImpl.Container implements Left
{
  /**
   * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected static final String LINK_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected String linkName = LINK_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSelf() <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelf()
   * @generated
   * @ordered
   */
  protected static final String SELF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelf() <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelf()
   * @generated
   * @ordered
   */
  protected String self = SELF_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftImpl()
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
    return StateMachineTriggersPackage.Literals.LEFT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLinkName()
  {
    return linkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkName(String newLinkName)
  {
    String oldLinkName = linkName;
    linkName = newLinkName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachineTriggersPackage.LEFT__LINK_NAME, oldLinkName, linkName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelf()
  {
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelf(String newSelf)
  {
    String oldSelf = self;
    self = newSelf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachineTriggersPackage.LEFT__SELF, oldSelf, self));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachineTriggersPackage.LEFT__EVENT, oldEvent, newEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    if (newEvent != event)
    {
      NotificationChain msgs = null;
      if (event != null)
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateMachineTriggersPackage.LEFT__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateMachineTriggersPackage.LEFT__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachineTriggersPackage.LEFT__EVENT, newEvent, newEvent));
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
      case StateMachineTriggersPackage.LEFT__EVENT:
        return basicSetEvent(null, msgs);
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
      case StateMachineTriggersPackage.LEFT__LINK_NAME:
        return getLinkName();
      case StateMachineTriggersPackage.LEFT__SELF:
        return getSelf();
      case StateMachineTriggersPackage.LEFT__EVENT:
        return getEvent();
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
      case StateMachineTriggersPackage.LEFT__LINK_NAME:
        setLinkName((String)newValue);
        return;
      case StateMachineTriggersPackage.LEFT__SELF:
        setSelf((String)newValue);
        return;
      case StateMachineTriggersPackage.LEFT__EVENT:
        setEvent((Event)newValue);
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
      case StateMachineTriggersPackage.LEFT__LINK_NAME:
        setLinkName(LINK_NAME_EDEFAULT);
        return;
      case StateMachineTriggersPackage.LEFT__SELF:
        setSelf(SELF_EDEFAULT);
        return;
      case StateMachineTriggersPackage.LEFT__EVENT:
        setEvent((Event)null);
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
      case StateMachineTriggersPackage.LEFT__LINK_NAME:
        return LINK_NAME_EDEFAULT == null ? linkName != null : !LINK_NAME_EDEFAULT.equals(linkName);
      case StateMachineTriggersPackage.LEFT__SELF:
        return SELF_EDEFAULT == null ? self != null : !SELF_EDEFAULT.equals(self);
      case StateMachineTriggersPackage.LEFT__EVENT:
        return event != null;
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
    result.append(" (linkName: ");
    result.append(linkName);
    result.append(", self: ");
    result.append(self);
    result.append(')');
    return result.toString();
  }

} //LeftImpl
