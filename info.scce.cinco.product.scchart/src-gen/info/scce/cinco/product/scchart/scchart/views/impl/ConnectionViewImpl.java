/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalConnection;

import info.scce.cinco.product.scchart.scchart.views.ConnectionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ConnectionViewImpl#getInternalConnection <em>Internal Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionViewImpl extends EObjectImpl implements ConnectionView {
	/**
	 * The cached value of the '{@link #getInternalConnection() <em>Internal Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConnection()
	 * @generated
	 * @ordered
	 */
	protected InternalConnection internalConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONNECTION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnection getInternalConnection() {
		if (internalConnection != null && internalConnection.eIsProxy()) {
			InternalEObject oldInternalConnection = (InternalEObject)internalConnection;
			internalConnection = (InternalConnection)eResolveProxy(oldInternalConnection);
			if (internalConnection != oldInternalConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONNECTION_VIEW__INTERNAL_CONNECTION, oldInternalConnection, internalConnection));
			}
		}
		return internalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConnection basicGetInternalConnection() {
		return internalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConnection(InternalConnection newInternalConnection) {
		InternalConnection oldInternalConnection = internalConnection;
		internalConnection = newInternalConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONNECTION_VIEW__INTERNAL_CONNECTION, oldInternalConnection, internalConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CONNECTION_VIEW__INTERNAL_CONNECTION:
				if (resolve) return getInternalConnection();
				return basicGetInternalConnection();
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
			case ViewsPackage.CONNECTION_VIEW__INTERNAL_CONNECTION:
				setInternalConnection((InternalConnection)newValue);
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
			case ViewsPackage.CONNECTION_VIEW__INTERNAL_CONNECTION:
				setInternalConnection((InternalConnection)null);
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
			case ViewsPackage.CONNECTION_VIEW__INTERNAL_CONNECTION:
				return internalConnection != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionViewImpl
