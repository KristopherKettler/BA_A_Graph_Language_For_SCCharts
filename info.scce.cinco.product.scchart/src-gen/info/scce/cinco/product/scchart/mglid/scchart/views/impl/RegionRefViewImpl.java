/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegionRef;

import info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Ref View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionRefViewImpl#getInternalRegionRef <em>Internal Region Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionRefViewImpl extends EObjectImpl implements RegionRefView {
	/**
	 * The cached value of the '{@link #getInternalRegionRef() <em>Internal Region Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRegionRef()
	 * @generated
	 * @ordered
	 */
	protected InternalRegionRef internalRegionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionRefViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.REGION_REF_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRegionRef getInternalRegionRef() {
		if (internalRegionRef != null && internalRegionRef.eIsProxy()) {
			InternalEObject oldInternalRegionRef = (InternalEObject)internalRegionRef;
			internalRegionRef = (InternalRegionRef)eResolveProxy(oldInternalRegionRef);
			if (internalRegionRef != oldInternalRegionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.REGION_REF_VIEW__INTERNAL_REGION_REF, oldInternalRegionRef, internalRegionRef));
			}
		}
		return internalRegionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRegionRef basicGetInternalRegionRef() {
		return internalRegionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalRegionRef(InternalRegionRef newInternalRegionRef) {
		InternalRegionRef oldInternalRegionRef = internalRegionRef;
		internalRegionRef = newInternalRegionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.REGION_REF_VIEW__INTERNAL_REGION_REF, oldInternalRegionRef, internalRegionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.REGION_REF_VIEW__INTERNAL_REGION_REF:
				if (resolve) return getInternalRegionRef();
				return basicGetInternalRegionRef();
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
			case ViewsPackage.REGION_REF_VIEW__INTERNAL_REGION_REF:
				setInternalRegionRef((InternalRegionRef)newValue);
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
			case ViewsPackage.REGION_REF_VIEW__INTERNAL_REGION_REF:
				setInternalRegionRef((InternalRegionRef)null);
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
			case ViewsPackage.REGION_REF_VIEW__INTERNAL_REGION_REF:
				return internalRegionRef != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionRefViewImpl
