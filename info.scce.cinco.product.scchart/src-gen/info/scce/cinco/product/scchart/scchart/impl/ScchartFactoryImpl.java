/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import info.scce.cinco.product.scchart.scchart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ScchartFactoryImpl extends EFactoryImpl implements ScchartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScchartFactory init() {
		try {
			ScchartFactory theScchartFactory = (ScchartFactory)EPackage.Registry.INSTANCE.getEFactory(ScchartPackage.eNS_URI);
			if (theScchartFactory != null) {
				return theScchartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScchartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScchartFactoryImpl() {
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
			case ScchartPackage.ROOT_STATE: return createRootState();
			case ScchartPackage.REGION: return createRegion();
			case ScchartPackage.DATA_FLOW_REGION: return createDataFlowRegion();
			case ScchartPackage.SUPER_STATE: return createSuperState();
			case ScchartPackage.INITILAL_SUPER_STATE: return createInitilalSuperState();
			case ScchartPackage.FINAL_SUPER_STATE: return createFinalSuperState();
			case ScchartPackage.DECLARATION: return createDeclaration();
			case ScchartPackage.SUSPEND: return createSuspend();
			case ScchartPackage.ACTION: return createAction();
			case ScchartPackage.SIMPLE_STATE: return createSimpleState();
			case ScchartPackage.INITIAL_STATE: return createInitialState();
			case ScchartPackage.FINAL_STATE: return createFinalState();
			case ScchartPackage.CONNECTOR: return createConnector();
			case ScchartPackage.INPUT: return createInput();
			case ScchartPackage.OUTPUT: return createOutput();
			case ScchartPackage.OPERATOR: return createOperator();
			case ScchartPackage.CIRCUIT_CONNECTER: return createCircuitConnecter();
			case ScchartPackage.SC_CHART_REFERECE: return createSCChartReferece();
			case ScchartPackage.INITIAL_SC_CHART_REFERECE: return createInitialSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE: return createFinalSCChartReferece();
			case ScchartPackage.ABSTRACT_TRANSITION: return createAbstractTransition();
			case ScchartPackage.TRANSITION: return createTransition();
			case ScchartPackage.IMMEDIATE_TRANSITION: return createImmediateTransition();
			case ScchartPackage.TERMINATION_TRANSITION: return createTerminationTransition();
			case ScchartPackage.CONDITIONAL_TERMINATION_TRANSITION: return createConditionalTerminationTransition();
			case ScchartPackage.STRONG_ABORT_TRANSITION: return createStrongAbortTransition();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_TRANSITION: return createImmediateStrongAbortTransition();
			case ScchartPackage.DEFERRED_TRANSITION: return createDeferredTransition();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION: return createImmediateDeferredTransition();
			case ScchartPackage.TERMINATION_DEFFERD_TRANSITION: return createTerminationDefferdTransition();
			case ScchartPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION: return createConditionalTerminationDeferredTransition();
			case ScchartPackage.STRONG_ABORT_DEFERRED_TRANSITION: return createStrongAbortDeferredTransition();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION: return createImmediateStrongAbortDeferredTransition();
			case ScchartPackage.HISTORY_TRANSITION: return createHistoryTransition();
			case ScchartPackage.IMMEDIATE_HISTORY_TRANSITION: return createImmediateHistoryTransition();
			case ScchartPackage.TERMINATION_HISTORY_TRANSITION: return createTerminationHistoryTransition();
			case ScchartPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION: return createConditionalTerminationHistoryTransition();
			case ScchartPackage.STRONG_ABORT_HISTORY_TRANSITION: return createStrongAbortHistoryTransition();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION: return createImmediateStrongAbortHistoryTransition();
			case ScchartPackage.CONNECTION: return createConnection();
			case ScchartPackage.SC_CHART: return createSCChart();
			case ScchartPackage.ASSIGNMENT: return createAssignment();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScchartPackage.ASSIGN:
				return createAssignFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScchartPackage.ASSIGN:
				return convertAssignToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState createRootState() {
		RootStateImpl rootState = new RootStateImpl();
		return rootState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion createDataFlowRegion() {
		DataFlowRegionImpl dataFlowRegion = new DataFlowRegionImpl();
		return dataFlowRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState createSuperState() {
		SuperStateImpl superState = new SuperStateImpl();
		return superState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState createInitilalSuperState() {
		InitilalSuperStateImpl initilalSuperState = new InitilalSuperStateImpl();
		return initilalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState createFinalSuperState() {
		FinalSuperStateImpl finalSuperState = new FinalSuperStateImpl();
		return finalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend createSuspend() {
		SuspendImpl suspend = new SuspendImpl();
		return suspend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState createSimpleState() {
		SimpleStateImpl simpleState = new SimpleStateImpl();
		return simpleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecter createCircuitConnecter() {
		CircuitConnecterImpl circuitConnecter = new CircuitConnecterImpl();
		return circuitConnecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece createSCChartReferece() {
		SCChartRefereceImpl scChartReferece = new SCChartRefereceImpl();
		return scChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece createInitialSCChartReferece() {
		InitialSCChartRefereceImpl initialSCChartReferece = new InitialSCChartRefereceImpl();
		return initialSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece createFinalSCChartReferece() {
		FinalSCChartRefereceImpl finalSCChartReferece = new FinalSCChartRefereceImpl();
		return finalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTransition createAbstractTransition() {
		AbstractTransitionImpl abstractTransition = new AbstractTransitionImpl();
		return abstractTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition createImmediateTransition() {
		ImmediateTransitionImpl immediateTransition = new ImmediateTransitionImpl();
		return immediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition createTerminationTransition() {
		TerminationTransitionImpl terminationTransition = new TerminationTransitionImpl();
		return terminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition createConditionalTerminationTransition() {
		ConditionalTerminationTransitionImpl conditionalTerminationTransition = new ConditionalTerminationTransitionImpl();
		return conditionalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition createStrongAbortTransition() {
		StrongAbortTransitionImpl strongAbortTransition = new StrongAbortTransitionImpl();
		return strongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition createImmediateStrongAbortTransition() {
		ImmediateStrongAbortTransitionImpl immediateStrongAbortTransition = new ImmediateStrongAbortTransitionImpl();
		return immediateStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition createDeferredTransition() {
		DeferredTransitionImpl deferredTransition = new DeferredTransitionImpl();
		return deferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition createImmediateDeferredTransition() {
		ImmediateDeferredTransitionImpl immediateDeferredTransition = new ImmediateDeferredTransitionImpl();
		return immediateDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition createTerminationDefferdTransition() {
		TerminationDefferdTransitionImpl terminationDefferdTransition = new TerminationDefferdTransitionImpl();
		return terminationDefferdTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition createConditionalTerminationDeferredTransition() {
		ConditionalTerminationDeferredTransitionImpl conditionalTerminationDeferredTransition = new ConditionalTerminationDeferredTransitionImpl();
		return conditionalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition createStrongAbortDeferredTransition() {
		StrongAbortDeferredTransitionImpl strongAbortDeferredTransition = new StrongAbortDeferredTransitionImpl();
		return strongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition createImmediateStrongAbortDeferredTransition() {
		ImmediateStrongAbortDeferredTransitionImpl immediateStrongAbortDeferredTransition = new ImmediateStrongAbortDeferredTransitionImpl();
		return immediateStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition createHistoryTransition() {
		HistoryTransitionImpl historyTransition = new HistoryTransitionImpl();
		return historyTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition createImmediateHistoryTransition() {
		ImmediateHistoryTransitionImpl immediateHistoryTransition = new ImmediateHistoryTransitionImpl();
		return immediateHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition createTerminationHistoryTransition() {
		TerminationHistoryTransitionImpl terminationHistoryTransition = new TerminationHistoryTransitionImpl();
		return terminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition createConditionalTerminationHistoryTransition() {
		ConditionalTerminationHistoryTransitionImpl conditionalTerminationHistoryTransition = new ConditionalTerminationHistoryTransitionImpl();
		return conditionalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition createStrongAbortHistoryTransition() {
		StrongAbortHistoryTransitionImpl strongAbortHistoryTransition = new StrongAbortHistoryTransitionImpl();
		return strongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition createImmediateStrongAbortHistoryTransition() {
		ImmediateStrongAbortHistoryTransitionImpl immediateStrongAbortHistoryTransition = new ImmediateStrongAbortHistoryTransitionImpl();
		return immediateStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart createSCChart() {
		SCChartImpl scChart = new SCChartImpl();
		return scChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssignFromString(EDataType eDataType, String initialValue) {
		Assign result = Assign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScchartPackage getScchartPackage() {
		return (ScchartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScchartPackage getPackage() {
		return ScchartPackage.eINSTANCE;
	}

} //ScchartFactoryImpl
