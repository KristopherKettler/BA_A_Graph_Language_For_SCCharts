/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;
import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl#getInputsOutputsOfRef <em>Inputs Outputs Of Ref</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalSCChartRefereceImpl extends InternalContainerImpl implements InternalSCChartReferece {
	/**
	 * The default value of the '{@link #getAssignments() <em>Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENTS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected String assignments = ASSIGNMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<set name>";

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
	 * The default value of the '{@link #getInputsOutputsOfRef() <em>Inputs Outputs Of Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsOutputsOfRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUTS_OUTPUTS_OF_REF_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInputsOutputsOfRef() <em>Inputs Outputs Of Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsOutputsOfRef()
	 * @generated
	 * @ordered
	 */
	protected String inputsOutputsOfRef = INPUTS_OUTPUTS_OF_REF_EDEFAULT;

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
	 * The default value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_COMPONENT_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected String libraryComponentUID = LIBRARY_COMPONENT_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSCChartRefereceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.eINSTANCE.getInternalSCChartReferece();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignments() {
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignments(String newAssignments) {
		String oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS, oldAssignments, assignments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputsOutputsOfRef() {
		return inputsOutputsOfRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputsOutputsOfRef(String newInputsOutputsOfRef) {
		String oldInputsOutputsOfRef = inputsOutputsOfRef;
		inputsOutputsOfRef = newInputsOutputsOfRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF, oldInputsOutputsOfRef, inputsOutputsOfRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return libraryComponentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(String newLibraryComponentUID) {
		String oldLibraryComponentUID = libraryComponentUID;
		libraryComponentUID = newLibraryComponentUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
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
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.RegionRef.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
		ConnectionConstraint cons1 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
		ConnectionConstraint cons2 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
		ConnectionConstraint cons3 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
		ConnectionConstraint cons4 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
		ConnectionConstraint cons5 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
		ConnectionConstraint cons6 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
		ConnectionConstraint cons7 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
		ConnectionConstraint cons8 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
		ConnectionConstraint cons9 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
		ConnectionConstraint cons10 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
		ConnectionConstraint cons11 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0,cons1,cons2,cons3,cons4,cons5,cons6,cons7,cons8,cons9,cons10,cons11));
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
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
		ConnectionConstraint cons1 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
		ConnectionConstraint cons2 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
		ConnectionConstraint cons3 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
		ConnectionConstraint cons4 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
		ConnectionConstraint cons5 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
		ConnectionConstraint cons6 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
		ConnectionConstraint cons7 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
		ConnectionConstraint cons8 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
		ConnectionConstraint cons9 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
		ConnectionConstraint cons10 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
		ConnectionConstraint cons11 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0,cons1,cons2,cons3,cons4,cons5,cons6,cons7,cons8,cons9,cons10,cons11));
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
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSuperState> getInitialSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSuperState> getInitialFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalState> getInitialFinalStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCChartReferece> getSCChartReferecePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartReferecePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartReferecePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSCChartReferece> getInitialFinalSCChartReferecePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSuperState> getInitialSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSuperState> getInitialFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalState> getInitialFinalStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCChartReferece> getSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSCChartReferece> getInitialFinalSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart getReference() {
		String uid = getLibraryComponentUID();
		return (info.scce.cinco.product.scchart.mglid.scchart.SCChart) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				return getAssignments();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				return getName();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF:
				return getInputsOutputsOfRef();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				return getLabel();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
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
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				setAssignments((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF:
				setInputsOutputsOfRef((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				setLabel((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID((String)newValue);
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
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				setAssignments(ASSIGNMENTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF:
				setInputsOutputsOfRef(INPUTS_OUTPUTS_OF_REF_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID(LIBRARY_COMPONENT_UID_EDEFAULT);
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
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				return ASSIGNMENTS_EDEFAULT == null ? assignments != null : !ASSIGNMENTS_EDEFAULT.equals(assignments);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF:
				return INPUTS_OUTPUTS_OF_REF_EDEFAULT == null ? inputsOutputsOfRef != null : !INPUTS_OUTPUTS_OF_REF_EDEFAULT.equals(inputsOutputsOfRef);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				return LIBRARY_COMPONENT_UID_EDEFAULT == null ? libraryComponentUID != null : !LIBRARY_COMPONENT_UID_EDEFAULT.equals(libraryComponentUID);
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
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
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
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_PREDECESSORS:
				return getInitialSuperStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS:
				return getInitialFinalSuperStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_PREDECESSORS:
				return getInitialFinalStatePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS:
				return getSCChartReferecePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialSCChartReferecePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getFinalSCChartReferecePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialFinalSCChartReferecePredecessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_SUCCESSORS:
				return getInitialSuperStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS:
				return getInitialFinalSuperStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_SUCCESSORS:
				return getInitialFinalStateSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS:
				return getSCChartRefereceSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialSCChartRefereceSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getFinalSCChartRefereceSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialFinalSCChartRefereceSuccessors();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_REFERENCE:
				return getReference();
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
		result.append(" (assignments: ");
		result.append(assignments);
		result.append(", name: ");
		result.append(name);
		result.append(", inputsOutputsOfRef: ");
		result.append(inputsOutputsOfRef);
		result.append(", label: ");
		result.append(label);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalSCChartRefereceImpl
