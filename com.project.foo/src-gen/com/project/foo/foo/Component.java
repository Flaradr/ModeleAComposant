/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.foo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.project.foo.foo.Component#getName <em>Name</em>}</li>
 *   <li>{@link com.project.foo.foo.Component#getListOfPServices <em>List Of PServices</em>}</li>
 *   <li>{@link com.project.foo.foo.Component#getListOfRServices <em>List Of RServices</em>}</li>
 *   <li>{@link com.project.foo.foo.Component#getMProvServices <em>MProv Services</em>}</li>
 *   <li>{@link com.project.foo.foo.Component#getMReqServices <em>MReq Services</em>}</li>
 *   <li>{@link com.project.foo.foo.Component#getAssemblies <em>Assemblies</em>}</li>
 * </ul>
 *
 * @see com.project.foo.foo.FooPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Element
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.project.foo.foo.FooPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.project.foo.foo.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>List Of PServices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of PServices</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of PServices</em>' containment reference.
   * @see #setListOfPServices(ListOfProvidedServices)
   * @see com.project.foo.foo.FooPackage#getComponent_ListOfPServices()
   * @model containment="true"
   * @generated
   */
  ListOfProvidedServices getListOfPServices();

  /**
   * Sets the value of the '{@link com.project.foo.foo.Component#getListOfPServices <em>List Of PServices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of PServices</em>' containment reference.
   * @see #getListOfPServices()
   * @generated
   */
  void setListOfPServices(ListOfProvidedServices value);

  /**
   * Returns the value of the '<em><b>List Of RServices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of RServices</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of RServices</em>' containment reference.
   * @see #setListOfRServices(ListOfrequiredServices)
   * @see com.project.foo.foo.FooPackage#getComponent_ListOfRServices()
   * @model containment="true"
   * @generated
   */
  ListOfrequiredServices getListOfRServices();

  /**
   * Sets the value of the '{@link com.project.foo.foo.Component#getListOfRServices <em>List Of RServices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of RServices</em>' containment reference.
   * @see #getListOfRServices()
   * @generated
   */
  void setListOfRServices(ListOfrequiredServices value);

  /**
   * Returns the value of the '<em><b>MProv Services</b></em>' containment reference list.
   * The list contents are of type {@link com.project.foo.foo.MProvidedService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MProv Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MProv Services</em>' containment reference list.
   * @see com.project.foo.foo.FooPackage#getComponent_MProvServices()
   * @model containment="true"
   * @generated
   */
  EList<MProvidedService> getMProvServices();

  /**
   * Returns the value of the '<em><b>MReq Services</b></em>' containment reference list.
   * The list contents are of type {@link com.project.foo.foo.MRequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MReq Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MReq Services</em>' containment reference list.
   * @see com.project.foo.foo.FooPackage#getComponent_MReqServices()
   * @model containment="true"
   * @generated
   */
  EList<MRequiredService> getMReqServices();

  /**
   * Returns the value of the '<em><b>Assemblies</b></em>' reference list.
   * The list contents are of type {@link com.project.foo.foo.Assembly}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assemblies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assemblies</em>' reference list.
   * @see com.project.foo.foo.FooPackage#getComponent_Assemblies()
   * @model
   * @generated
   */
  EList<Assembly> getAssemblies();

} // Component
