/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSuperStateViewImpl#getInternalInitialSuperState <em>Internal Initial Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialSuperStateViewImpl extends SuperStateViewImpl implements InitialSuperStateView {
	/**
	 * The cached value of the '{@link #getInternalInitialSuperState() <em>Internal Initial Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitialSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalInitialSuperState internalInitialSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialSuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITIAL_SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialSuperState getInternalInitialSuperState() {
		if (internalInitialSuperState != null && internalInitialSuperState.eIsProxy()) {
			InternalEObject oldInternalInitialSuperState = (InternalEObject)internalInitialSuperState;
			internalInitialSuperState = (InternalInitialSuperState)eResolveProxy(oldInternalInitialSuperState);
			if (internalInitialSuperState != oldInternalInitialSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE, oldInternalInitialSuperState, internalInitialSuperState));
			}
		}
		return internalInitialSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitialSuperState basicGetInternalInitialSuperState() {
		return internalInitialSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitialSuperState(InternalInitialSuperState newInternalInitialSuperState) {
		InternalInitialSuperState oldInternalInitialSuperState = internalInitialSuperState;
		internalInitialSuperState = newInternalInitialSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE, oldInternalInitialSuperState, internalInitialSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE:
				if (resolve) return getInternalInitialSuperState();
				return basicGetInternalInitialSuperState();
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
			case ViewsPackage.INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE:
				setInternalInitialSuperState((InternalInitialSuperState)newValue);
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
			case ViewsPackage.INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE:
				setInternalInitialSuperState((InternalInitialSuperState)null);
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
			case ViewsPackage.INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE:
				return internalInitialSuperState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialSuperStateViewImpl
