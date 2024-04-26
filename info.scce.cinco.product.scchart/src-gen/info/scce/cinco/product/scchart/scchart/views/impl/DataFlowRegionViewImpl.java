/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion;

import info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Region View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.DataFlowRegionViewImpl#getInternalDataFlowRegion <em>Internal Data Flow Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowRegionViewImpl extends RegionViewImpl implements DataFlowRegionView {
	/**
	 * The cached value of the '{@link #getInternalDataFlowRegion() <em>Internal Data Flow Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDataFlowRegion()
	 * @generated
	 * @ordered
	 */
	protected InternalDataFlowRegion internalDataFlowRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowRegionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DATA_FLOW_REGION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDataFlowRegion getInternalDataFlowRegion() {
		if (internalDataFlowRegion != null && internalDataFlowRegion.eIsProxy()) {
			InternalEObject oldInternalDataFlowRegion = (InternalEObject)internalDataFlowRegion;
			internalDataFlowRegion = (InternalDataFlowRegion)eResolveProxy(oldInternalDataFlowRegion);
			if (internalDataFlowRegion != oldInternalDataFlowRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION, oldInternalDataFlowRegion, internalDataFlowRegion));
			}
		}
		return internalDataFlowRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDataFlowRegion basicGetInternalDataFlowRegion() {
		return internalDataFlowRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDataFlowRegion(InternalDataFlowRegion newInternalDataFlowRegion) {
		InternalDataFlowRegion oldInternalDataFlowRegion = internalDataFlowRegion;
		internalDataFlowRegion = newInternalDataFlowRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION, oldInternalDataFlowRegion, internalDataFlowRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION:
				if (resolve) return getInternalDataFlowRegion();
				return basicGetInternalDataFlowRegion();
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
			case ViewsPackage.DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION:
				setInternalDataFlowRegion((InternalDataFlowRegion)newValue);
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
			case ViewsPackage.DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION:
				setInternalDataFlowRegion((InternalDataFlowRegion)null);
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
			case ViewsPackage.DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION:
				return internalDataFlowRegion != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFlowRegionViewImpl
