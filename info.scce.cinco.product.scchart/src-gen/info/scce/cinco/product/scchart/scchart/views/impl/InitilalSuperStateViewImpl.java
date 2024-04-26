/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState;

import info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initilal Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.InitilalSuperStateViewImpl#getInternalInitilalSuperState <em>Internal Initilal Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitilalSuperStateViewImpl extends SuperStateViewImpl implements InitilalSuperStateView {
	/**
	 * The cached value of the '{@link #getInternalInitilalSuperState() <em>Internal Initilal Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitilalSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalInitilalSuperState internalInitilalSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitilalSuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITILAL_SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitilalSuperState getInternalInitilalSuperState() {
		if (internalInitilalSuperState != null && internalInitilalSuperState.eIsProxy()) {
			InternalEObject oldInternalInitilalSuperState = (InternalEObject)internalInitilalSuperState;
			internalInitilalSuperState = (InternalInitilalSuperState)eResolveProxy(oldInternalInitilalSuperState);
			if (internalInitilalSuperState != oldInternalInitilalSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE, oldInternalInitilalSuperState, internalInitilalSuperState));
			}
		}
		return internalInitilalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitilalSuperState basicGetInternalInitilalSuperState() {
		return internalInitilalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitilalSuperState(InternalInitilalSuperState newInternalInitilalSuperState) {
		InternalInitilalSuperState oldInternalInitilalSuperState = internalInitilalSuperState;
		internalInitilalSuperState = newInternalInitilalSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE, oldInternalInitilalSuperState, internalInitilalSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE:
				if (resolve) return getInternalInitilalSuperState();
				return basicGetInternalInitilalSuperState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE:
				setInternalInitilalSuperState((InternalInitilalSuperState)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE:
				setInternalInitilalSuperState((InternalInitilalSuperState)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE:
				return internalInitilalSuperState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitilalSuperStateViewImpl
