/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;

import info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion;
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.scchart.internal.InternalRegion;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InternalDataFlowRegionImpl extends InternalRegionImpl implements InternalDataFlowRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalDataFlowRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_DATA_FLOW_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.SuperState.class));
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.scchart.scchart.InitilalSuperState.class));
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.scchart.scchart.InitialState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.SimpleState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.FinalState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Connector.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.FinalSuperState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Input.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Output.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Operator.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.CircuitConnecter.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.SCChartReferece.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.SuperState.class));
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.scchart.scchart.InitilalSuperState.class));
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.scchart.scchart.InitialState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.SimpleState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.FinalState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Connector.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.FinalSuperState.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.SCChartReferece.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_DATA_FLOW_REGION___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_DATA_FLOW_REGION___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalRegion.class) {
			switch (baseOperationID) {
				case InternalPackage.INTERNAL_REGION___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_DATA_FLOW_REGION___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_DATA_FLOW_REGION___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalDataFlowRegionImpl
