/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.foo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.project.foo.foo.ProvidedService#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.project.foo.foo.FooPackage#getProvidedService()
 * @model
 * @generated
 */
public interface ProvidedService extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(PSignature)
   * @see com.project.foo.foo.FooPackage#getProvidedService_Name()
   * @model
   * @generated
   */
  PSignature getName();

  /**
   * Sets the value of the '{@link com.project.foo.foo.ProvidedService#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(PSignature value);

} // ProvidedService
