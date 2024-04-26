/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSuperStateViewImpl#getInternalFinalSuperState <em>Internal Final Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalSuperStateViewImpl extends SuperStateViewImpl implements FinalSuperStateView {
	/**
	 * The cached value of the '{@link #getInternalFinalSuperState() <em>Internal Final Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFinalSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalFinalSuperState internalFinalSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalSuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.FINAL_SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSuperState getInternalFinalSuperState() {
		if (internalFinalSuperState != null && internalFinalSuperState.eIsProxy()) {
			InternalEObject oldInternalFinalSuperState = (InternalEObject)internalFinalSuperState;
			internalFinalSuperState = (InternalFinalSuperState)eResolveProxy(oldInternalFinalSuperState);
			if (internalFinalSuperState != oldInternalFinalSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE, oldInternalFinalSuperState, internalFinalSuperState));
			}
		}
		return internalFinalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFinalSuperState basicGetInternalFinalSuperState() {
		return internalFinalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalFinalSuperState(InternalFinalSuperState newInternalFinalSuperState) {
		InternalFinalSuperState oldInternalFinalSuperState = internalFinalSuperState;
		internalFinalSuperState = newInternalFinalSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE, oldInternalFinalSuperState, internalFinalSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE:
				if (resolve) return getInternalFinalSuperState();
				return basicGetInternalFinalSuperState();
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
			case ViewsPackage.FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE:
				setInternalFinalSuperState((InternalFinalSuperState)newValue);
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
			case ViewsPackage.FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE:
				setInternalFinalSuperState((InternalFinalSuperState)null);
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
			case ViewsPackage.FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE:
				return internalFinalSuperState != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalSuperStateViewImpl
