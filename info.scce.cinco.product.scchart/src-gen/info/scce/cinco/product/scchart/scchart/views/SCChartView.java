/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalSCChart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Chart View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.SCChartView#getInternalSCChart <em>Internal SC Chart</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSCChartView()
 * @model
 * @generated
 */
public interface SCChartView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal SC Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal SC Chart</em>' reference.
	 * @see #setInternalSCChart(InternalSCChart)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSCChartView_InternalSCChart()
	 * @model
	 * @generated
	 */
	InternalSCChart getInternalSCChart();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartView#getInternalSCChart <em>Internal SC Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal SC Chart</em>' reference.
	 * @see #getInternalSCChart()
	 * @generated
	 */
	void setInternalSCChart(InternalSCChart value);

} // SCChartView
