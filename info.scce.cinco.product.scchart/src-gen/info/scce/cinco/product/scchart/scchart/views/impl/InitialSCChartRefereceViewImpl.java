/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece;

import info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial SC Chart Referece View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.InitialSCChartRefereceViewImpl#getInternalInitialSCChartReferece <em>Internal Initial SC Chart Referece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialSCChartRefereceViewImpl extends SCChartRefereceViewImpl implements InitialSCChartRefereceView {
	/**
	 * The cached value of the '{@link #getInternalInitialSCChartReferece() <em>Internal Initial SC Chart Referece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitialSCChartReferece()
	 * @generated
	 * @ordered
	 */
	protected InternalInitialSCChartReferece internalInitialSCChartReferece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialSCChartRefereceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITIAL_SC_CHART_REFERECE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialSCChartReferece getInternalInitialSCChartReferece() {
		if (internalInitialSCChartReferece != null && internalInitialSCChartReferece.eIsProxy()) {
			InternalEObject oldInternalInitialSCChartReferece = (InternalEObject)internalInitialSCChartReferece;
			internalInitialSCChartReferece = (InternalInitialSCChartReferece)eResolveProxy(oldInternalInitialSCChartReferece);
			if (internalInitialSCChartReferece != oldInternalInitialSCChartReferece) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE, oldInternalInitialSCChartReferece, internalInitialSCChartReferece));
			}
		}
		return internalInitialSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitialSCChartReferece basicGetInternalInitialSCChartReferece() {
		return internalInitialSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitialSCChartReferece(InternalInitialSCChartReferece newInternalInitialSCChartReferece) {
		InternalInitialSCChartReferece oldInternalInitialSCChartReferece = internalInitialSCChartReferece;
		internalInitialSCChartReferece = newInternalInitialSCChartReferece;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE, oldInternalInitialSCChartReferece, internalInitialSCChartReferece));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE:
				if (resolve) return getInternalInitialSCChartReferece();
				return basicGetInternalInitialSCChartReferece();
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
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE:
				setInternalInitialSCChartReferece((InternalInitialSCChartReferece)newValue);
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
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE:
				setInternalInitialSCChartReferece((InternalInitialSCChartReferece)null);
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
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE:
				return internalInitialSCChartReferece != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialSCChartRefereceViewImpl
