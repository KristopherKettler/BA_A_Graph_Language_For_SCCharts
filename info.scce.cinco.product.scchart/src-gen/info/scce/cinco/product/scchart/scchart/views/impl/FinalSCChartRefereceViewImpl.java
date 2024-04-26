/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece;

import info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final SC Chart Referece View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalSCChartRefereceViewImpl#getInternalFinalSCChartReferece <em>Internal Final SC Chart Referece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalSCChartRefereceViewImpl extends SCChartRefereceViewImpl implements FinalSCChartRefereceView {
	/**
	 * The cached value of the '{@link #getInternalFinalSCChartReferece() <em>Internal Final SC Chart Referece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFinalSCChartReferece()
	 * @generated
	 * @ordered
	 */
	protected InternalFinalSCChartReferece internalFinalSCChartReferece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalSCChartRefereceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.FINAL_SC_CHART_REFERECE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSCChartReferece getInternalFinalSCChartReferece() {
		if (internalFinalSCChartReferece != null && internalFinalSCChartReferece.eIsProxy()) {
			InternalEObject oldInternalFinalSCChartReferece = (InternalEObject)internalFinalSCChartReferece;
			internalFinalSCChartReferece = (InternalFinalSCChartReferece)eResolveProxy(oldInternalFinalSCChartReferece);
			if (internalFinalSCChartReferece != oldInternalFinalSCChartReferece) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE, oldInternalFinalSCChartReferece, internalFinalSCChartReferece));
			}
		}
		return internalFinalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFinalSCChartReferece basicGetInternalFinalSCChartReferece() {
		return internalFinalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalFinalSCChartReferece(InternalFinalSCChartReferece newInternalFinalSCChartReferece) {
		InternalFinalSCChartReferece oldInternalFinalSCChartReferece = internalFinalSCChartReferece;
		internalFinalSCChartReferece = newInternalFinalSCChartReferece;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE, oldInternalFinalSCChartReferece, internalFinalSCChartReferece));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE:
				if (resolve) return getInternalFinalSCChartReferece();
				return basicGetInternalFinalSCChartReferece();
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
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE:
				setInternalFinalSCChartReferece((InternalFinalSCChartReferece)newValue);
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
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE:
				setInternalFinalSCChartReferece((InternalFinalSCChartReferece)null);
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
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE:
				return internalFinalSCChartReferece != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalSCChartRefereceViewImpl
