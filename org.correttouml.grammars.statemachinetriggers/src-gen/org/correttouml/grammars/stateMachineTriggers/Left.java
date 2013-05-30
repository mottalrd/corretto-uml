/**
 */
package org.correttouml.grammars.stateMachineTriggers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.correttouml.grammars.stateMachineTriggers.Left#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.correttouml.grammars.stateMachineTriggers.Left#getSelf <em>Self</em>}</li>
 *   <li>{@link org.correttouml.grammars.stateMachineTriggers.Left#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.correttouml.grammars.stateMachineTriggers.StateMachineTriggersPackage#getLeft()
 * @model
 * @generated
 */
public interface Left extends EObject
{
  /**
   * Returns the value of the '<em><b>Link Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Name</em>' attribute.
   * @see #setLinkName(String)
   * @see org.correttouml.grammars.stateMachineTriggers.StateMachineTriggersPackage#getLeft_LinkName()
   * @model
   * @generated
   */
  String getLinkName();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.stateMachineTriggers.Left#getLinkName <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Name</em>' attribute.
   * @see #getLinkName()
   * @generated
   */
  void setLinkName(String value);

  /**
   * Returns the value of the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self</em>' attribute.
   * @see #setSelf(String)
   * @see org.correttouml.grammars.stateMachineTriggers.StateMachineTriggersPackage#getLeft_Self()
   * @model
   * @generated
   */
  String getSelf();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.stateMachineTriggers.Left#getSelf <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self</em>' attribute.
   * @see #getSelf()
   * @generated
   */
  void setSelf(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Event)
   * @see org.correttouml.grammars.stateMachineTriggers.StateMachineTriggersPackage#getLeft_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.correttouml.grammars.stateMachineTriggers.Left#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

} // Left
