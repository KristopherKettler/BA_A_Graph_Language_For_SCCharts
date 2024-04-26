/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Final State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalStateViewImpl#getInternalInitialFinalState <em>Internal Initial Final State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialFinalStateViewImpl extends SimpleStateViewImpl implements InitialFinalStateView {
	/**
	 * The cached value of the '{@link #getInternalInitialFinalState() <em>Internal Initial Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitialFinalState()
	 * @generated
	 * @ordered
	 */
	protected InternalInitialFinalState internalInitialFinalState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialFinalStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITIAL_FINAL_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialFinalState getInternalInitialFinalState() {
		if (internalInitialFinalState != null && internalInitialFinalState.eIsProxy()) {
			InternalEObject oldInternalInitialFinalState = (InternalEObject)internalInitialFinalState;
			internalInitialFinalState = (InternalInitialFinalState)eResolveProxy(oldInternalInitialFinalState);
			if (internalInitialFinalState != oldInternalInitialFinalState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE, oldInternalInitialFinalState, internalInitialFinalState));
			}
		}
		return internalInitialFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitialFinalState basicGetInternalInitialFinalState() {
		return internalInitialFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitialFinalState(InternalInitialFinalState newInternalInitialFinalState) {
		InternalInitialFinalState oldInternalInitialFinalState = internalInitialFinalState;
		internalInitialFinalState = newInternalInitialFinalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE, oldInternalInitialFinalState, internalInitialFinalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE:
				if (resolve) return getInternalInitialFinalState();
				return basicGetInternalInitialFinalState();
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
			case ViewsPackage.INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE:
				setInternalInitialFinalState((InternalInitialFinalState)newValue);
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
			case ViewsPackage.INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE:
				setInternalInitialFinalState((InternalInitialFinalState)null);
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
			case ViewsPackage.INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE:
				return internalInitialFinalState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialFinalStateViewImpl
