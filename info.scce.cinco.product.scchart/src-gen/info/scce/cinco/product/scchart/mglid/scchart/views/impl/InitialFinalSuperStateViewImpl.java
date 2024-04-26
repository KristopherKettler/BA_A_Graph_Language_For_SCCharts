/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Final Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSuperStateViewImpl#getInternalInitialFinalSuperState <em>Internal Initial Final Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialFinalSuperStateViewImpl extends SuperStateViewImpl implements InitialFinalSuperStateView {
	/**
	 * The cached value of the '{@link #getInternalInitialFinalSuperState() <em>Internal Initial Final Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitialFinalSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalInitialFinalSuperState internalInitialFinalSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialFinalSuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITIAL_FINAL_SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialFinalSuperState getInternalInitialFinalSuperState() {
		if (internalInitialFinalSuperState != null && internalInitialFinalSuperState.eIsProxy()) {
			InternalEObject oldInternalInitialFinalSuperState = (InternalEObject)internalInitialFinalSuperState;
			internalInitialFinalSuperState = (InternalInitialFinalSuperState)eResolveProxy(oldInternalInitialFinalSuperState);
			if (internalInitialFinalSuperState != oldInternalInitialFinalSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE, oldInternalInitialFinalSuperState, internalInitialFinalSuperState));
			}
		}
		return internalInitialFinalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitialFinalSuperState basicGetInternalInitialFinalSuperState() {
		return internalInitialFinalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitialFinalSuperState(InternalInitialFinalSuperState newInternalInitialFinalSuperState) {
		InternalInitialFinalSuperState oldInternalInitialFinalSuperState = internalInitialFinalSuperState;
		internalInitialFinalSuperState = newInternalInitialFinalSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE, oldInternalInitialFinalSuperState, internalInitialFinalSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE:
				if (resolve) return getInternalInitialFinalSuperState();
				return basicGetInternalInitialFinalSuperState();
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
			case ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE:
				setInternalInitialFinalSuperState((InternalInitialFinalSuperState)newValue);
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
			case ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE:
				setInternalInitialFinalSuperState((InternalInitialFinalSuperState)null);
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
			case ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE:
				return internalInitialFinalSuperState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialFinalSuperStateViewImpl
