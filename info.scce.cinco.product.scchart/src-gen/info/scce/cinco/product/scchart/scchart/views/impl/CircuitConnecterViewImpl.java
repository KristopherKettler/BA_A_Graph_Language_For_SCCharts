/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter;

import info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Connecter View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.CircuitConnecterViewImpl#getInternalCircuitConnecter <em>Internal Circuit Connecter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitConnecterViewImpl extends EObjectImpl implements CircuitConnecterView {
	/**
	 * The cached value of the '{@link #getInternalCircuitConnecter() <em>Internal Circuit Connecter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalCircuitConnecter()
	 * @generated
	 * @ordered
	 */
	protected InternalCircuitConnecter internalCircuitConnecter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitConnecterViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CIRCUIT_CONNECTER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCircuitConnecter getInternalCircuitConnecter() {
		if (internalCircuitConnecter != null && internalCircuitConnecter.eIsProxy()) {
			InternalEObject oldInternalCircuitConnecter = (InternalEObject)internalCircuitConnecter;
			internalCircuitConnecter = (InternalCircuitConnecter)eResolveProxy(oldInternalCircuitConnecter);
			if (internalCircuitConnecter != oldInternalCircuitConnecter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER, oldInternalCircuitConnecter, internalCircuitConnecter));
			}
		}
		return internalCircuitConnecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalCircuitConnecter basicGetInternalCircuitConnecter() {
		return internalCircuitConnecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalCircuitConnecter(InternalCircuitConnecter newInternalCircuitConnecter) {
		InternalCircuitConnecter oldInternalCircuitConnecter = internalCircuitConnecter;
		internalCircuitConnecter = newInternalCircuitConnecter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER, oldInternalCircuitConnecter, internalCircuitConnecter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER:
				if (resolve) return getInternalCircuitConnecter();
				return basicGetInternalCircuitConnecter();
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
			case ViewsPackage.CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER:
				setInternalCircuitConnecter((InternalCircuitConnecter)newValue);
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
			case ViewsPackage.CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER:
				setInternalCircuitConnecter((InternalCircuitConnecter)null);
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
			case ViewsPackage.CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER:
				return internalCircuitConnecter != null;
		}
		return super.eIsSet(featureID);
	}

} //CircuitConnecterViewImpl
