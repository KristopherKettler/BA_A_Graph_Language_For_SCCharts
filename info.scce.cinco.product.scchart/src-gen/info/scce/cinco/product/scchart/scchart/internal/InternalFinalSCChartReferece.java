/**
 */
package info.scce.cinco.product.scchart.scchart.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import info.scce.cinco.product.scchart.scchart.RootState;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalFinalSCChartReferece()
 * @model
 * @generated
 */
public interface InternalFinalSCChartReferece extends InternalSCChartReferece {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RootState getReference();

} // InternalFinalSCChartReferece
