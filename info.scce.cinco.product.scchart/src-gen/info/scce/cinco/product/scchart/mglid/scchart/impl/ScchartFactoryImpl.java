/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import info.scce.cinco.product.scchart.mglid.scchart.*;

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
			case ScchartPackage.REGION_REF: return createRegionRef();
			case ScchartPackage.SUPER_STATE: return createSuperState();
			case ScchartPackage.INITIAL_SUPER_STATE: return createInitialSuperState();
			case ScchartPackage.FINAL_SUPER_STATE: return createFinalSuperState();
			case ScchartPackage.INITIAL_FINAL_SUPER_STATE: return createInitialFinalSuperState();
			case ScchartPackage.DECLARATION: return createDeclaration();
			case ScchartPackage.SUSPENSION: return createSuspension();
			case ScchartPackage.ACTION: return createAction();
			case ScchartPackage.SIMPLE_STATE: return createSimpleState();
			case ScchartPackage.INITIAL_STATE: return createInitialState();
			case ScchartPackage.FINAL_STATE: return createFinalState();
			case ScchartPackage.INITIAL_FINAL_STATE: return createInitialFinalState();
			case ScchartPackage.CONNECTOR: return createConnector();
			case ScchartPackage.SC_CHART_REFERECE: return createSCChartReferece();
			case ScchartPackage.INITIAL_SC_CHART_REFERECE: return createInitialSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE: return createFinalSCChartReferece();
			case ScchartPackage.INITIAL_FINAL_SC_CHART_REFERECE: return createInitialFinalSCChartReferece();
			case ScchartPackage.ABSTRACT_TRANSITION: return createAbstractTransition();
			case ScchartPackage.TRANSITION: return createTransition();
			case ScchartPackage.TERMINATION_TRANSITION: return createTerminationTransition();
			case ScchartPackage.STRONG_ABORT_TRANSITION: return createStrongAbortTransition();
			case ScchartPackage.DEFERRED_TRANSITION: return createDeferredTransition();
			case ScchartPackage.HISTORY_TRANSITION: return createHistoryTransition();
			case ScchartPackage.TERMINATION_DEFERRED_TRANSITION: return createTerminationDeferredTransition();
			case ScchartPackage.STRONG_ABORT_DEFERRED_TRANSITION: return createStrongAbortDeferredTransition();
			case ScchartPackage.TERMINATION_HISTORY_TRANSITION: return createTerminationHistoryTransition();
			case ScchartPackage.STRONG_ABORT_HISTORY_TRANSITION: return createStrongAbortHistoryTransition();
			case ScchartPackage.DEFERRED_HISTORY_TRANSITION: return createDeferredHistoryTransition();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION: return createStrongAbortDeferredHistoryTransition();
			case ScchartPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION: return createTerminationDeferredHistoryTransition();
			case ScchartPackage.SC_CHART: return createSCChart();
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
	public RegionRef createRegionRef() {
		RegionRefImpl regionRef = new RegionRefImpl();
		return regionRef;
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
	public InitialSuperState createInitialSuperState() {
		InitialSuperStateImpl initialSuperState = new InitialSuperStateImpl();
		return initialSuperState;
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
	public InitialFinalSuperState createInitialFinalSuperState() {
		InitialFinalSuperStateImpl initialFinalSuperState = new InitialFinalSuperStateImpl();
		return initialFinalSuperState;
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
	public Suspension createSuspension() {
		SuspensionImpl suspension = new SuspensionImpl();
		return suspension;
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
	public InitialFinalState createInitialFinalState() {
		InitialFinalStateImpl initialFinalState = new InitialFinalStateImpl();
		return initialFinalState;
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
	public InitialFinalSCChartReferece createInitialFinalSCChartReferece() {
		InitialFinalSCChartRefereceImpl initialFinalSCChartReferece = new InitialFinalSCChartRefereceImpl();
		return initialFinalSCChartReferece;
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
	public TerminationDeferredTransition createTerminationDeferredTransition() {
		TerminationDeferredTransitionImpl terminationDeferredTransition = new TerminationDeferredTransitionImpl();
		return terminationDeferredTransition;
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
	public DeferredHistoryTransition createDeferredHistoryTransition() {
		DeferredHistoryTransitionImpl deferredHistoryTransition = new DeferredHistoryTransitionImpl();
		return deferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition() {
		StrongAbortDeferredHistoryTransitionImpl strongAbortDeferredHistoryTransition = new StrongAbortDeferredHistoryTransitionImpl();
		return strongAbortDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition() {
		TerminationDeferredHistoryTransitionImpl terminationDeferredHistoryTransition = new TerminationDeferredHistoryTransitionImpl();
		return terminationDeferredHistoryTransition;
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
