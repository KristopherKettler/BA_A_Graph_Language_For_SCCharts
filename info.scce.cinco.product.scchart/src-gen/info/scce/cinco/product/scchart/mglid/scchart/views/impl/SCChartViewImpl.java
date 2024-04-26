/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart;

import info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Chart View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl#getInternalSCChart <em>Internal SC Chart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCChartViewImpl extends EObjectImpl implements SCChartView {
	/**
	 * The cached value of the '{@link #getInternalSCChart() <em>Internal SC Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSCChart()
	 * @generated
	 * @ordered
	 */
	protected InternalSCChart internalSCChart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCChartViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SC_CHART_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSCChart getInternalSCChart() {
		if (internalSCChart != null && internalSCChart.eIsProxy()) {
			InternalEObject oldInternalSCChart = (InternalEObject)internalSCChart;
			internalSCChart = (InternalSCChart)eResolveProxy(oldInternalSCChart);
			if (internalSCChart != oldInternalSCChart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SC_CHART_VIEW__INTERNAL_SC_CHART, oldInternalSCChart, internalSCChart));
			}
		}
		return internalSCChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSCChart basicGetInternalSCChart() {
		return internalSCChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSCChart(InternalSCChart newInternalSCChart) {
		InternalSCChart oldInternalSCChart = internalSCChart;
		internalSCChart = newInternalSCChart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SC_CHART_VIEW__INTERNAL_SC_CHART, oldInternalSCChart, internalSCChart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSCChart().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSCChart().getElement().transact("Set Name", () -> {
			getInternalSCChart().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.SC_CHART_VIEW__INTERNAL_SC_CHART:
				if (resolve) return getInternalSCChart();
				return basicGetInternalSCChart();
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
			case ViewsPackage.SC_CHART_VIEW__INTERNAL_SC_CHART:
				setInternalSCChart((InternalSCChart)newValue);
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
			case ViewsPackage.SC_CHART_VIEW__INTERNAL_SC_CHART:
				setInternalSCChart((InternalSCChart)null);
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
			case ViewsPackage.SC_CHART_VIEW__INTERNAL_SC_CHART:
				return internalSCChart != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.SC_CHART_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SC_CHART_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SCChartViewImpl
