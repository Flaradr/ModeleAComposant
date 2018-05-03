/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.foo.impl;

import com.project.foo.foo.Binding;
import com.project.foo.foo.BindingProvided;
import com.project.foo.foo.BindingRequiered;
import com.project.foo.foo.FooPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.project.foo.foo.impl.BindingImpl#getMG <em>MG</em>}</li>
 *   <li>{@link com.project.foo.foo.impl.BindingImpl#getMD <em>MD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getMG() <em>MG</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMG()
   * @generated
   * @ordered
   */
  protected BindingRequiered mG;

  /**
   * The cached value of the '{@link #getMD() <em>MD</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMD()
   * @generated
   * @ordered
   */
  protected BindingProvided mD;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return FooPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingRequiered getMG()
  {
    return mG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMG(BindingRequiered newMG, NotificationChain msgs)
  {
    BindingRequiered oldMG = mG;
    mG = newMG;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FooPackage.BINDING__MG, oldMG, newMG);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMG(BindingRequiered newMG)
  {
    if (newMG != mG)
    {
      NotificationChain msgs = null;
      if (mG != null)
        msgs = ((InternalEObject)mG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FooPackage.BINDING__MG, null, msgs);
      if (newMG != null)
        msgs = ((InternalEObject)newMG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FooPackage.BINDING__MG, null, msgs);
      msgs = basicSetMG(newMG, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FooPackage.BINDING__MG, newMG, newMG));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingProvided getMD()
  {
    return mD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMD(BindingProvided newMD, NotificationChain msgs)
  {
    BindingProvided oldMD = mD;
    mD = newMD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FooPackage.BINDING__MD, oldMD, newMD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMD(BindingProvided newMD)
  {
    if (newMD != mD)
    {
      NotificationChain msgs = null;
      if (mD != null)
        msgs = ((InternalEObject)mD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FooPackage.BINDING__MD, null, msgs);
      if (newMD != null)
        msgs = ((InternalEObject)newMD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FooPackage.BINDING__MD, null, msgs);
      msgs = basicSetMD(newMD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FooPackage.BINDING__MD, newMD, newMD));
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
      case FooPackage.BINDING__MG:
        return basicSetMG(null, msgs);
      case FooPackage.BINDING__MD:
        return basicSetMD(null, msgs);
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
      case FooPackage.BINDING__MG:
        return getMG();
      case FooPackage.BINDING__MD:
        return getMD();
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
      case FooPackage.BINDING__MG:
        setMG((BindingRequiered)newValue);
        return;
      case FooPackage.BINDING__MD:
        setMD((BindingProvided)newValue);
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
      case FooPackage.BINDING__MG:
        setMG((BindingRequiered)null);
        return;
      case FooPackage.BINDING__MD:
        setMD((BindingProvided)null);
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
      case FooPackage.BINDING__MG:
        return mG != null;
      case FooPackage.BINDING__MD:
        return mD != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
