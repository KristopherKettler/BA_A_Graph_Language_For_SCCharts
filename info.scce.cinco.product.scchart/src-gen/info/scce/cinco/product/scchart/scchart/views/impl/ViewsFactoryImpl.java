/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.views.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsFactoryImpl extends EFactoryImpl implements ViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewsFactory init() {
		try {
			ViewsFactory theViewsFactory = (ViewsFactory)EPackage.Registry.INSTANCE.getEFactory(ViewsPackage.eNS_URI);
			if (theViewsFactory != null) {
				return theViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewsPackage.ROOT_STATE_VIEW: return createRootStateView();
			case ViewsPackage.REGION_VIEW: return createRegionView();
			case ViewsPackage.DATA_FLOW_REGION_VIEW: return createDataFlowRegionView();
			case ViewsPackage.SUPER_STATE_VIEW: return createSuperStateView();
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW: return createInitilalSuperStateView();
			case ViewsPackage.FINAL_SUPER_STATE_VIEW: return createFinalSuperStateView();
			case ViewsPackage.DECLARATION_VIEW: return createDeclarationView();
			case ViewsPackage.SUSPEND_VIEW: return createSuspendView();
			case ViewsPackage.ACTION_VIEW: return createActionView();
			case ViewsPackage.SIMPLE_STATE_VIEW: return createSimpleStateView();
			case ViewsPackage.INITIAL_STATE_VIEW: return createInitialStateView();
			case ViewsPackage.FINAL_STATE_VIEW: return createFinalStateView();
			case ViewsPackage.CONNECTOR_VIEW: return createConnectorView();
			case ViewsPackage.INPUT_VIEW: return createInputView();
			case ViewsPackage.OUTPUT_VIEW: return createOutputView();
			case ViewsPackage.OPERATOR_VIEW: return createOperatorView();
			case ViewsPackage.CIRCUIT_CONNECTER_VIEW: return createCircuitConnecterView();
			case ViewsPackage.SC_CHART_REFERECE_VIEW: return createSCChartRefereceView();
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW: return createInitialSCChartRefereceView();
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW: return createFinalSCChartRefereceView();
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW: return createAbstractTransitionView();
			case ViewsPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW: return createImmediateTransitionView();
			case ViewsPackage.TERMINATION_TRANSITION_VIEW: return createTerminationTransitionView();
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW: return createConditionalTerminationTransitionView();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW: return createStrongAbortTransitionView();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW: return createImmediateStrongAbortTransitionView();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW: return createDeferredTransitionView();
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW: return createImmediateDeferredTransitionView();
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW: return createTerminationDefferdTransitionView();
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW: return createConditionalTerminationDeferredTransitionView();
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW: return createStrongAbortDeferredTransitionView();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW: return createImmediateStrongAbortDeferredTransitionView();
			case ViewsPackage.HISTORY_TRANSITION_VIEW: return createHistoryTransitionView();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW: return createImmediateHistoryTransitionView();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW: return createTerminationHistoryTransitionView();
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW: return createConditionalTerminationHistoryTransitionView();
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW: return createStrongAbortHistoryTransitionView();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW: return createImmediateStrongAbortHistoryTransitionView();
			case ViewsPackage.CONNECTION_VIEW: return createConnectionView();
			case ViewsPackage.SC_CHART_VIEW: return createSCChartView();
			case ViewsPackage.ASSIGNMENT_VIEW: return createAssignmentView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateView createRootStateView() {
		RootStateViewImpl rootStateView = new RootStateViewImpl();
		return rootStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionView createRegionView() {
		RegionViewImpl regionView = new RegionViewImpl();
		return regionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegionView createDataFlowRegionView() {
		DataFlowRegionViewImpl dataFlowRegionView = new DataFlowRegionViewImpl();
		return dataFlowRegionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateView createSuperStateView() {
		SuperStateViewImpl superStateView = new SuperStateViewImpl();
		return superStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperStateView createInitilalSuperStateView() {
		InitilalSuperStateViewImpl initilalSuperStateView = new InitilalSuperStateViewImpl();
		return initilalSuperStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperStateView createFinalSuperStateView() {
		FinalSuperStateViewImpl finalSuperStateView = new FinalSuperStateViewImpl();
		return finalSuperStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclarationView createDeclarationView() {
		DeclarationViewImpl declarationView = new DeclarationViewImpl();
		return declarationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendView createSuspendView() {
		SuspendViewImpl suspendView = new SuspendViewImpl();
		return suspendView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionView createActionView() {
		ActionViewImpl actionView = new ActionViewImpl();
		return actionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleStateView createSimpleStateView() {
		SimpleStateViewImpl simpleStateView = new SimpleStateViewImpl();
		return simpleStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialStateView createInitialStateView() {
		InitialStateViewImpl initialStateView = new InitialStateViewImpl();
		return initialStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalStateView createFinalStateView() {
		FinalStateViewImpl finalStateView = new FinalStateViewImpl();
		return finalStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorView createConnectorView() {
		ConnectorViewImpl connectorView = new ConnectorViewImpl();
		return connectorView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputView createInputView() {
		InputViewImpl inputView = new InputViewImpl();
		return inputView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputView createOutputView() {
		OutputViewImpl outputView = new OutputViewImpl();
		return outputView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorView createOperatorView() {
		OperatorViewImpl operatorView = new OperatorViewImpl();
		return operatorView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecterView createCircuitConnecterView() {
		CircuitConnecterViewImpl circuitConnecterView = new CircuitConnecterViewImpl();
		return circuitConnecterView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartRefereceView createSCChartRefereceView() {
		SCChartRefereceViewImpl scChartRefereceView = new SCChartRefereceViewImpl();
		return scChartRefereceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartRefereceView createInitialSCChartRefereceView() {
		InitialSCChartRefereceViewImpl initialSCChartRefereceView = new InitialSCChartRefereceViewImpl();
		return initialSCChartRefereceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartRefereceView createFinalSCChartRefereceView() {
		FinalSCChartRefereceViewImpl finalSCChartRefereceView = new FinalSCChartRefereceViewImpl();
		return finalSCChartRefereceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTransitionView createAbstractTransitionView() {
		AbstractTransitionViewImpl abstractTransitionView = new AbstractTransitionViewImpl();
		return abstractTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionView createTransitionView() {
		TransitionViewImpl transitionView = new TransitionViewImpl();
		return transitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransitionView createImmediateTransitionView() {
		ImmediateTransitionViewImpl immediateTransitionView = new ImmediateTransitionViewImpl();
		return immediateTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransitionView createTerminationTransitionView() {
		TerminationTransitionViewImpl terminationTransitionView = new TerminationTransitionViewImpl();
		return terminationTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransitionView createConditionalTerminationTransitionView() {
		ConditionalTerminationTransitionViewImpl conditionalTerminationTransitionView = new ConditionalTerminationTransitionViewImpl();
		return conditionalTerminationTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransitionView createStrongAbortTransitionView() {
		StrongAbortTransitionViewImpl strongAbortTransitionView = new StrongAbortTransitionViewImpl();
		return strongAbortTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransitionView createImmediateStrongAbortTransitionView() {
		ImmediateStrongAbortTransitionViewImpl immediateStrongAbortTransitionView = new ImmediateStrongAbortTransitionViewImpl();
		return immediateStrongAbortTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransitionView createDeferredTransitionView() {
		DeferredTransitionViewImpl deferredTransitionView = new DeferredTransitionViewImpl();
		return deferredTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransitionView createImmediateDeferredTransitionView() {
		ImmediateDeferredTransitionViewImpl immediateDeferredTransitionView = new ImmediateDeferredTransitionViewImpl();
		return immediateDeferredTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransitionView createTerminationDefferdTransitionView() {
		TerminationDefferdTransitionViewImpl terminationDefferdTransitionView = new TerminationDefferdTransitionViewImpl();
		return terminationDefferdTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransitionView createConditionalTerminationDeferredTransitionView() {
		ConditionalTerminationDeferredTransitionViewImpl conditionalTerminationDeferredTransitionView = new ConditionalTerminationDeferredTransitionViewImpl();
		return conditionalTerminationDeferredTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransitionView createStrongAbortDeferredTransitionView() {
		StrongAbortDeferredTransitionViewImpl strongAbortDeferredTransitionView = new StrongAbortDeferredTransitionViewImpl();
		return strongAbortDeferredTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransitionView createImmediateStrongAbortDeferredTransitionView() {
		ImmediateStrongAbortDeferredTransitionViewImpl immediateStrongAbortDeferredTransitionView = new ImmediateStrongAbortDeferredTransitionViewImpl();
		return immediateStrongAbortDeferredTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransitionView createHistoryTransitionView() {
		HistoryTransitionViewImpl historyTransitionView = new HistoryTransitionViewImpl();
		return historyTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransitionView createImmediateHistoryTransitionView() {
		ImmediateHistoryTransitionViewImpl immediateHistoryTransitionView = new ImmediateHistoryTransitionViewImpl();
		return immediateHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransitionView createTerminationHistoryTransitionView() {
		TerminationHistoryTransitionViewImpl terminationHistoryTransitionView = new TerminationHistoryTransitionViewImpl();
		return terminationHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransitionView createConditionalTerminationHistoryTransitionView() {
		ConditionalTerminationHistoryTransitionViewImpl conditionalTerminationHistoryTransitionView = new ConditionalTerminationHistoryTransitionViewImpl();
		return conditionalTerminationHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransitionView createStrongAbortHistoryTransitionView() {
		StrongAbortHistoryTransitionViewImpl strongAbortHistoryTransitionView = new StrongAbortHistoryTransitionViewImpl();
		return strongAbortHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransitionView createImmediateStrongAbortHistoryTransitionView() {
		ImmediateStrongAbortHistoryTransitionViewImpl immediateStrongAbortHistoryTransitionView = new ImmediateStrongAbortHistoryTransitionViewImpl();
		return immediateStrongAbortHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionView createConnectionView() {
		ConnectionViewImpl connectionView = new ConnectionViewImpl();
		return connectionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartView createSCChartView() {
		SCChartViewImpl scChartView = new SCChartViewImpl();
		return scChartView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentView createAssignmentView() {
		AssignmentViewImpl assignmentView = new AssignmentViewImpl();
		return assignmentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsPackage getViewsPackage() {
		return (ViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewsPackage getPackage() {
		return ViewsPackage.eINSTANCE;
	}

} //ViewsFactoryImpl
