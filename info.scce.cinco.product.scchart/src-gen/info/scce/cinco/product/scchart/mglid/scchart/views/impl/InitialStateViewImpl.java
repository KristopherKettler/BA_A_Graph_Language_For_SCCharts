/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl#getInternalInitialState <em>Internal Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialStateViewImpl extends SimpleStateViewImpl implements InitialStateView {
	/**
	 * The cached value of the '{@link #getInternalInitialState() <em>Internal Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitialState()
	 * @generated
	 * @ordered
	 */
	protected InternalInitialState internalInitialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITIAL_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialState getInternalInitialState() {
		if (internalInitialState != null && internalInitialState.eIsProxy()) {
			InternalEObject oldInternalInitialState = (InternalEObject)internalInitialState;
			internalInitialState = (InternalInitialState)eResolveProxy(oldInternalInitialState);
			if (internalInitialState != oldInternalInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE, oldInternalInitialState, internalInitialState));
			}
		}
		return internalInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitialState basicGetInternalInitialState() {
		return internalInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitialState(InternalInitialState newInternalInitialState) {
		InternalInitialState oldInternalInitialState = internalInitialState;
		internalInitialState = newInternalInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE, oldInternalInitialState, internalInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE:
				if (resolve) return getInternalInitialState();
				return basicGetInternalInitialState();
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
			case ViewsPackage.INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE:
				setInternalInitialState((InternalInitialState)newValue);
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
			case ViewsPackage.INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE:
				setInternalInitialState((InternalInitialState)null);
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
			case ViewsPackage.INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE:
				return internalInitialState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialStateViewImpl
