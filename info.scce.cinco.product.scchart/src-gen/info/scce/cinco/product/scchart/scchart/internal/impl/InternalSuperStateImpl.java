/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;
import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.scchart.scchart.Connector;
import info.scce.cinco.product.scchart.scchart.FinalState;
import info.scce.cinco.product.scchart.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.scchart.InitialState;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SimpleState;
import info.scce.cinco.product.scchart.scchart.SuperState;

import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.scchart.internal.InternalSuperState;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl#getInputsOutputs <em>Inputs Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalSuperStateImpl extends InternalContainerImpl implements InternalSuperState {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<insert name>";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputsOutputs() <em>Inputs Outputs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inputsOutputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSuperStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_SUPER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInputsOutputs() {
		if (inputsOutputs == null) {
			inputsOutputs = new EDataTypeUniqueEList<String>(String.class, this, InternalPackage.INTERNAL_SUPER_STATE__INPUTS_OUTPUTS);
		}
		return inputsOutputs;
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
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Region.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Declaration.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Action.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.Suspend.class));
		return constraints;
		
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
		ConnectionConstraint cons6 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
		ConnectionConstraint cons7 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
		ConnectionConstraint cons8 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
		ConnectionConstraint cons9 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
		ConnectionConstraint cons10 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
		ConnectionConstraint cons11 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
		ConnectionConstraint cons12 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
		ConnectionConstraint cons13 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
		ConnectionConstraint cons14 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
		ConnectionConstraint cons15 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
		ConnectionConstraint cons16 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
		ConnectionConstraint cons17 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0,cons1,cons2,cons3,cons4,cons5,cons6,cons7,cons8,cons9,cons10,cons11,cons12,cons13,cons14,cons15,cons16,cons17));
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
		ConnectionConstraint cons2 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
		ConnectionConstraint cons3 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
		ConnectionConstraint cons4 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
		ConnectionConstraint cons5 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
		ConnectionConstraint cons6 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
		ConnectionConstraint cons7 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
		ConnectionConstraint cons8 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
		ConnectionConstraint cons9 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
		ConnectionConstraint cons10 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
		ConnectionConstraint cons11 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
		ConnectionConstraint cons12 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
		ConnectionConstraint cons13 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
		ConnectionConstraint cons14 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
		ConnectionConstraint cons15 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
		ConnectionConstraint cons16 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
		ConnectionConstraint cons17 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0,cons1,cons2,cons3,cons4,cons5,cons6,cons7,cons8,cons9,cons10,cons11,cons12,cons13,cons14,cons15,cons16,cons17));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__NAME:
				return getName();
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				return getLabel();
			case InternalPackage.INTERNAL_SUPER_STATE__INPUTS_OUTPUTS:
				return getInputsOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				setLabel((String)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__INPUTS_OUTPUTS:
				getInputsOutputs().clear();
				getInputsOutputs().addAll((Collection<? extends String>)newValue);
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
			case InternalPackage.INTERNAL_SUPER_STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__INPUTS_OUTPUTS:
				getInputsOutputs().clear();
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
			case InternalPackage.INTERNAL_SUPER_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InternalPackage.INTERNAL_SUPER_STATE__INPUTS_OUTPUTS:
				return inputsOutputs != null && !inputsOutputs.isEmpty();
		}
		return super.eIsSet(featureID);
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
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS;
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
			case InternalPackage.INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", inputsOutputs: ");
		result.append(inputsOutputs);
		result.append(')');
		return result.toString();
	}

} //InternalSuperStateImpl
