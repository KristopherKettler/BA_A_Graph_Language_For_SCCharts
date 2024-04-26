/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Final SC Chart Referece View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSCChartRefereceViewImpl#getInternalInitialFinalSCChartReferece <em>Internal Initial Final SC Chart Referece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialFinalSCChartRefereceViewImpl extends SCChartRefereceViewImpl implements InitialFinalSCChartRefereceView {
	/**
	 * The cached value of the '{@link #getInternalInitialFinalSCChartReferece() <em>Internal Initial Final SC Chart Referece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitialFinalSCChartReferece()
	 * @generated
	 * @ordered
	 */
	protected InternalInitialFinalSCChartReferece internalInitialFinalSCChartReferece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialFinalSCChartRefereceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITIAL_FINAL_SC_CHART_REFERECE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialFinalSCChartReferece getInternalInitialFinalSCChartReferece() {
		if (internalInitialFinalSCChartReferece != null && internalInitialFinalSCChartReferece.eIsProxy()) {
			InternalEObject oldInternalInitialFinalSCChartReferece = (InternalEObject)internalInitialFinalSCChartReferece;
			internalInitialFinalSCChartReferece = (InternalInitialFinalSCChartReferece)eResolveProxy(oldInternalInitialFinalSCChartReferece);
			if (internalInitialFinalSCChartReferece != oldInternalInitialFinalSCChartReferece) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE, oldInternalInitialFinalSCChartReferece, internalInitialFinalSCChartReferece));
			}
		}
		return internalInitialFinalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitialFinalSCChartReferece basicGetInternalInitialFinalSCChartReferece() {
		return internalInitialFinalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitialFinalSCChartReferece(InternalInitialFinalSCChartReferece newInternalInitialFinalSCChartReferece) {
		InternalInitialFinalSCChartReferece oldInternalInitialFinalSCChartReferece = internalInitialFinalSCChartReferece;
		internalInitialFinalSCChartReferece = newInternalInitialFinalSCChartReferece;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE, oldInternalInitialFinalSCChartReferece, internalInitialFinalSCChartReferece));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE:
				if (resolve) return getInternalInitialFinalSCChartReferece();
				return basicGetInternalInitialFinalSCChartReferece();
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
			case ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE:
				setInternalInitialFinalSCChartReferece((InternalInitialFinalSCChartReferece)newValue);
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
			case ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE:
				setInternalInitialFinalSCChartReferece((InternalInitialFinalSCChartReferece)null);
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
			case ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE:
				return internalInitialFinalSCChartReferece != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialFinalSCChartRefereceViewImpl
