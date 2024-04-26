/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState;

import info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl#getInternalFinalState <em>Internal Final State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalStateViewImpl extends SimpleStateViewImpl implements FinalStateView {
	/**
	 * The cached value of the '{@link #getInternalFinalState() <em>Internal Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFinalState()
	 * @generated
	 * @ordered
	 */
	protected InternalFinalState internalFinalState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.FINAL_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalState getInternalFinalState() {
		if (internalFinalState != null && internalFinalState.eIsProxy()) {
			InternalEObject oldInternalFinalState = (InternalEObject)internalFinalState;
			internalFinalState = (InternalFinalState)eResolveProxy(oldInternalFinalState);
			if (internalFinalState != oldInternalFinalState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.FINAL_STATE_VIEW__INTERNAL_FINAL_STATE, oldInternalFinalState, internalFinalState));
			}
		}
		return internalFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFinalState basicGetInternalFinalState() {
		return internalFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalFinalState(InternalFinalState newInternalFinalState) {
		InternalFinalState oldInternalFinalState = internalFinalState;
		internalFinalState = newInternalFinalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.FINAL_STATE_VIEW__INTERNAL_FINAL_STATE, oldInternalFinalState, internalFinalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.FINAL_STATE_VIEW__INTERNAL_FINAL_STATE:
				if (resolve) return getInternalFinalState();
				return basicGetInternalFinalState();
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
			case ViewsPackage.FINAL_STATE_VIEW__INTERNAL_FINAL_STATE:
				setInternalFinalState((InternalFinalState)newValue);
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
			case ViewsPackage.FINAL_STATE_VIEW__INTERNAL_FINAL_STATE:
				setInternalFinalState((InternalFinalState)null);
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
			case ViewsPackage.FINAL_STATE_VIEW__INTERNAL_FINAL_STATE:
				return internalFinalState != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalStateViewImpl
