/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import info.scce.cinco.product.scchart.scchart.Connector;
import info.scce.cinco.product.scchart.scchart.FinalState;
import info.scce.cinco.product.scchart.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.scchart.InitialState;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SimpleState;
import info.scce.cinco.product.scchart.scchart.SuperState;

import info.scce.cinco.product.scchart.scchart.internal.InternalFinalState;
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InternalFinalStateImpl extends InternalSimpleStateImpl implements InternalFinalState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalFinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_FINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.Transition.class);
		ConnectionConstraint cons1 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
		ConnectionConstraint cons2 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
		ConnectionConstraint cons3 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
		ConnectionConstraint cons4 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
		ConnectionConstraint cons5 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0,cons1,cons2,cons3,cons4,cons5));
		eList.addAll(super.getIncomingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.Transition.class);
		ConnectionConstraint cons1 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0,cons1));
		eList.addAll(super.getOutgoingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalNode.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalSimpleState.class) {
			switch (baseOperationID) {
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS;
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
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalFinalStateImpl
