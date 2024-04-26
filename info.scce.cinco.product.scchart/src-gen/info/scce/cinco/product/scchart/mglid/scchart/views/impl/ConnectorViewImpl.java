/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector;

import info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl#getInternalConnector <em>Internal Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorViewImpl extends SimpleStateViewImpl implements ConnectorView {
	/**
	 * The cached value of the '{@link #getInternalConnector() <em>Internal Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConnector()
	 * @generated
	 * @ordered
	 */
	protected InternalConnector internalConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONNECTOR_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnector getInternalConnector() {
		if (internalConnector != null && internalConnector.eIsProxy()) {
			InternalEObject oldInternalConnector = (InternalEObject)internalConnector;
			internalConnector = (InternalConnector)eResolveProxy(oldInternalConnector);
			if (internalConnector != oldInternalConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONNECTOR_VIEW__INTERNAL_CONNECTOR, oldInternalConnector, internalConnector));
			}
		}
		return internalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConnector basicGetInternalConnector() {
		return internalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConnector(InternalConnector newInternalConnector) {
		InternalConnector oldInternalConnector = internalConnector;
		internalConnector = newInternalConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONNECTOR_VIEW__INTERNAL_CONNECTOR, oldInternalConnector, internalConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CONNECTOR_VIEW__INTERNAL_CONNECTOR:
				if (resolve) return getInternalConnector();
				return basicGetInternalConnector();
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
			case ViewsPackage.CONNECTOR_VIEW__INTERNAL_CONNECTOR:
				setInternalConnector((InternalConnector)newValue);
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
			case ViewsPackage.CONNECTOR_VIEW__INTERNAL_CONNECTOR:
				setInternalConnector((InternalConnector)null);
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
			case ViewsPackage.CONNECTOR_VIEW__INTERNAL_CONNECTOR:
				return internalConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorViewImpl
