/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.foo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.project.foo.foo.DomainModel#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see com.project.foo.foo.FooPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link com.project.foo.foo.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see com.project.foo.foo.FooPackage#getDomainModel_Models()
   * @model containment="true"
   * @generated
   */
  EList<Model> getModels();

} // DomainModel
