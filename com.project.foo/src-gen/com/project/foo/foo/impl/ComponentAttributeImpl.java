/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.foo.impl;

import com.project.foo.foo.Component;
import com.project.foo.foo.ComponentAttribute;
import com.project.foo.foo.FooPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.project.foo.foo.impl.ComponentAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.project.foo.foo.impl.ComponentAttributeImpl#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentAttributeImpl extends MinimalEObjectImpl.Container implements ComponentAttribute
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getComposant() <em>Composant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposant()
   * @generated
   * @ordered
   */
  protected Component composant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentAttributeImpl()
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
    return FooPackage.Literals.COMPONENT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FooPackage.COMPONENT_ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getComposant()
  {
    if (composant != null && composant.eIsProxy())
    {
      InternalEObject oldComposant = (InternalEObject)composant;
      composant = (Component)eResolveProxy(oldComposant);
      if (composant != oldComposant)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FooPackage.COMPONENT_ATTRIBUTE__COMPOSANT, oldComposant, composant));
      }
    }
    return composant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetComposant()
  {
    return composant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposant(Component newComposant)
  {
    Component oldComposant = composant;
    composant = newComposant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FooPackage.COMPONENT_ATTRIBUTE__COMPOSANT, oldComposant, composant));
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
      case FooPackage.COMPONENT_ATTRIBUTE__NAME:
        return getName();
      case FooPackage.COMPONENT_ATTRIBUTE__COMPOSANT:
        if (resolve) return getComposant();
        return basicGetComposant();
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
      case FooPackage.COMPONENT_ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case FooPackage.COMPONENT_ATTRIBUTE__COMPOSANT:
        setComposant((Component)newValue);
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
      case FooPackage.COMPONENT_ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FooPackage.COMPONENT_ATTRIBUTE__COMPOSANT:
        setComposant((Component)null);
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
      case FooPackage.COMPONENT_ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FooPackage.COMPONENT_ATTRIBUTE__COMPOSANT:
        return composant != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComponentAttributeImpl
