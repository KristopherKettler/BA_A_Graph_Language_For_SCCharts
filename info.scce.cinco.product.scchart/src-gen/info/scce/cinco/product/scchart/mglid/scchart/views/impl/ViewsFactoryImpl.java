/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.views.*;

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
			case ViewsPackage.REGION_REF_VIEW: return createRegionRefView();
			case ViewsPackage.SUPER_STATE_VIEW: return createSuperStateView();
			case ViewsPackage.INITIAL_SUPER_STATE_VIEW: return createInitialSuperStateView();
			case ViewsPackage.FINAL_SUPER_STATE_VIEW: return createFinalSuperStateView();
			case ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW: return createInitialFinalSuperStateView();
			case ViewsPackage.DECLARATION_VIEW: return createDeclarationView();
			case ViewsPackage.SUSPENSION_VIEW: return createSuspensionView();
			case ViewsPackage.ACTION_VIEW: return createActionView();
			case ViewsPackage.SIMPLE_STATE_VIEW: return createSimpleStateView();
			case ViewsPackage.INITIAL_STATE_VIEW: return createInitialStateView();
			case ViewsPackage.FINAL_STATE_VIEW: return createFinalStateView();
			case ViewsPackage.INITIAL_FINAL_STATE_VIEW: return createInitialFinalStateView();
			case ViewsPackage.CONNECTOR_VIEW: return createConnectorView();
			case ViewsPackage.SC_CHART_REFERECE_VIEW: return createSCChartRefereceView();
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW: return createInitialSCChartRefereceView();
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW: return createFinalSCChartRefereceView();
			case ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW: return createInitialFinalSCChartRefereceView();
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW: return createAbstractTransitionView();
			case ViewsPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewsPackage.TERMINATION_TRANSITION_VIEW: return createTerminationTransitionView();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW: return createStrongAbortTransitionView();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW: return createDeferredTransitionView();
			case ViewsPackage.HISTORY_TRANSITION_VIEW: return createHistoryTransitionView();
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW: return createTerminationDeferredTransitionView();
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW: return createStrongAbortDeferredTransitionView();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW: return createTerminationHistoryTransitionView();
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW: return createStrongAbortHistoryTransitionView();
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW: return createDeferredHistoryTransitionView();
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW: return createStrongAbortDeferredHistoryTransitionView();
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW: return createTerminationDeferredHistoryTransitionView();
			case ViewsPackage.SC_CHART_VIEW: return createSCChartView();
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
	public RegionRefView createRegionRefView() {
		RegionRefViewImpl regionRefView = new RegionRefViewImpl();
		return regionRefView;
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
	public InitialSuperStateView createInitialSuperStateView() {
		InitialSuperStateViewImpl initialSuperStateView = new InitialSuperStateViewImpl();
		return initialSuperStateView;
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
	public InitialFinalSuperStateView createInitialFinalSuperStateView() {
		InitialFinalSuperStateViewImpl initialFinalSuperStateView = new InitialFinalSuperStateViewImpl();
		return initialFinalSuperStateView;
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
	public SuspensionView createSuspensionView() {
		SuspensionViewImpl suspensionView = new SuspensionViewImpl();
		return suspensionView;
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
	public InitialFinalStateView createInitialFinalStateView() {
		InitialFinalStateViewImpl initialFinalStateView = new InitialFinalStateViewImpl();
		return initialFinalStateView;
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
	public InitialFinalSCChartRefereceView createInitialFinalSCChartRefereceView() {
		InitialFinalSCChartRefereceViewImpl initialFinalSCChartRefereceView = new InitialFinalSCChartRefereceViewImpl();
		return initialFinalSCChartRefereceView;
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
	public TerminationDeferredTransitionView createTerminationDeferredTransitionView() {
		TerminationDeferredTransitionViewImpl terminationDeferredTransitionView = new TerminationDeferredTransitionViewImpl();
		return terminationDeferredTransitionView;
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
	public DeferredHistoryTransitionView createDeferredHistoryTransitionView() {
		DeferredHistoryTransitionViewImpl deferredHistoryTransitionView = new DeferredHistoryTransitionViewImpl();
		return deferredHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransitionView createStrongAbortDeferredHistoryTransitionView() {
		StrongAbortDeferredHistoryTransitionViewImpl strongAbortDeferredHistoryTransitionView = new StrongAbortDeferredHistoryTransitionViewImpl();
		return strongAbortDeferredHistoryTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransitionView createTerminationDeferredHistoryTransitionView() {
		TerminationDeferredHistoryTransitionViewImpl terminationDeferredHistoryTransitionView = new TerminationDeferredHistoryTransitionViewImpl();
		return terminationDeferredHistoryTransitionView;
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
