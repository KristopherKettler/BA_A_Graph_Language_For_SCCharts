/**
 */
package info.scce.cinco.product.scchart.scchart.views.util;

import info.scce.cinco.product.scchart.scchart.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage
 * @generated
 */
public class ViewsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsSwitch<Adapter> modelSwitch =
		new ViewsSwitch<Adapter>() {
			@Override
			public Adapter caseRootStateView(RootStateView object) {
				return createRootStateViewAdapter();
			}
			@Override
			public Adapter caseRegionView(RegionView object) {
				return createRegionViewAdapter();
			}
			@Override
			public Adapter caseDataFlowRegionView(DataFlowRegionView object) {
				return createDataFlowRegionViewAdapter();
			}
			@Override
			public Adapter caseSuperStateView(SuperStateView object) {
				return createSuperStateViewAdapter();
			}
			@Override
			public Adapter caseInitilalSuperStateView(InitilalSuperStateView object) {
				return createInitilalSuperStateViewAdapter();
			}
			@Override
			public Adapter caseFinalSuperStateView(FinalSuperStateView object) {
				return createFinalSuperStateViewAdapter();
			}
			@Override
			public Adapter caseDeclarationView(DeclarationView object) {
				return createDeclarationViewAdapter();
			}
			@Override
			public Adapter caseSuspendView(SuspendView object) {
				return createSuspendViewAdapter();
			}
			@Override
			public Adapter caseActionView(ActionView object) {
				return createActionViewAdapter();
			}
			@Override
			public Adapter caseSimpleStateView(SimpleStateView object) {
				return createSimpleStateViewAdapter();
			}
			@Override
			public Adapter caseInitialStateView(InitialStateView object) {
				return createInitialStateViewAdapter();
			}
			@Override
			public Adapter caseFinalStateView(FinalStateView object) {
				return createFinalStateViewAdapter();
			}
			@Override
			public Adapter caseConnectorView(ConnectorView object) {
				return createConnectorViewAdapter();
			}
			@Override
			public Adapter caseInputView(InputView object) {
				return createInputViewAdapter();
			}
			@Override
			public Adapter caseOutputView(OutputView object) {
				return createOutputViewAdapter();
			}
			@Override
			public Adapter caseOperatorView(OperatorView object) {
				return createOperatorViewAdapter();
			}
			@Override
			public Adapter caseCircuitConnecterView(CircuitConnecterView object) {
				return createCircuitConnecterViewAdapter();
			}
			@Override
			public Adapter caseSCChartRefereceView(SCChartRefereceView object) {
				return createSCChartRefereceViewAdapter();
			}
			@Override
			public Adapter caseInitialSCChartRefereceView(InitialSCChartRefereceView object) {
				return createInitialSCChartRefereceViewAdapter();
			}
			@Override
			public Adapter caseFinalSCChartRefereceView(FinalSCChartRefereceView object) {
				return createFinalSCChartRefereceViewAdapter();
			}
			@Override
			public Adapter caseAbstractTransitionView(AbstractTransitionView object) {
				return createAbstractTransitionViewAdapter();
			}
			@Override
			public Adapter caseTransitionView(TransitionView object) {
				return createTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateTransitionView(ImmediateTransitionView object) {
				return createImmediateTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationTransitionView(TerminationTransitionView object) {
				return createTerminationTransitionViewAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationTransitionView(ConditionalTerminationTransitionView object) {
				return createConditionalTerminationTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortTransitionView(StrongAbortTransitionView object) {
				return createStrongAbortTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateStrongAbortTransitionView(ImmediateStrongAbortTransitionView object) {
				return createImmediateStrongAbortTransitionViewAdapter();
			}
			@Override
			public Adapter caseDeferredTransitionView(DeferredTransitionView object) {
				return createDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateDeferredTransitionView(ImmediateDeferredTransitionView object) {
				return createImmediateDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationDefferdTransitionView(TerminationDefferdTransitionView object) {
				return createTerminationDefferdTransitionViewAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationDeferredTransitionView(ConditionalTerminationDeferredTransitionView object) {
				return createConditionalTerminationDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortDeferredTransitionView(StrongAbortDeferredTransitionView object) {
				return createStrongAbortDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateStrongAbortDeferredTransitionView(ImmediateStrongAbortDeferredTransitionView object) {
				return createImmediateStrongAbortDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseHistoryTransitionView(HistoryTransitionView object) {
				return createHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateHistoryTransitionView(ImmediateHistoryTransitionView object) {
				return createImmediateHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationHistoryTransitionView(TerminationHistoryTransitionView object) {
				return createTerminationHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationHistoryTransitionView(ConditionalTerminationHistoryTransitionView object) {
				return createConditionalTerminationHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortHistoryTransitionView(StrongAbortHistoryTransitionView object) {
				return createStrongAbortHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateStrongAbortHistoryTransitionView(ImmediateStrongAbortHistoryTransitionView object) {
				return createImmediateStrongAbortHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseConnectionView(ConnectionView object) {
				return createConnectionViewAdapter();
			}
			@Override
			public Adapter caseSCChartView(SCChartView object) {
				return createSCChartViewAdapter();
			}
			@Override
			public Adapter caseAssignmentView(AssignmentView object) {
				return createAssignmentViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView <em>Root State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView
	 * @generated
	 */
	public Adapter createRootStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.RegionView <em>Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView
	 * @generated
	 */
	public Adapter createRegionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView <em>Data Flow Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView
	 * @generated
	 */
	public Adapter createDataFlowRegionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView <em>Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView
	 * @generated
	 */
	public Adapter createSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView <em>Initilal Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView
	 * @generated
	 */
	public Adapter createInitilalSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView <em>Final Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView
	 * @generated
	 */
	public Adapter createFinalSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView <em>Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView
	 * @generated
	 */
	public Adapter createDeclarationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView <em>Suspend View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView
	 * @generated
	 */
	public Adapter createSuspendViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ActionView <em>Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView
	 * @generated
	 */
	public Adapter createActionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView <em>Simple State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView
	 * @generated
	 */
	public Adapter createSimpleStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.InitialStateView <em>Initial State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitialStateView
	 * @generated
	 */
	public Adapter createInitialStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.FinalStateView <em>Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalStateView
	 * @generated
	 */
	public Adapter createFinalStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ConnectorView <em>Connector View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConnectorView
	 * @generated
	 */
	public Adapter createConnectorViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.InputView <em>Input View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.InputView
	 * @generated
	 */
	public Adapter createInputViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.OutputView <em>Output View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.OutputView
	 * @generated
	 */
	public Adapter createOutputViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.OperatorView <em>Operator View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.OperatorView
	 * @generated
	 */
	public Adapter createOperatorViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView <em>Circuit Connecter View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView
	 * @generated
	 */
	public Adapter createCircuitConnecterViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView <em>SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView
	 * @generated
	 */
	public Adapter createSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView <em>Initial SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView
	 * @generated
	 */
	public Adapter createInitialSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView <em>Final SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView
	 * @generated
	 */
	public Adapter createFinalSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView <em>Abstract Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView
	 * @generated
	 */
	public Adapter createAbstractTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView
	 * @generated
	 */
	public Adapter createTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView <em>Immediate Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView
	 * @generated
	 */
	public Adapter createImmediateTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView <em>Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView
	 * @generated
	 */
	public Adapter createTerminationTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView <em>Conditional Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView
	 * @generated
	 */
	public Adapter createConditionalTerminationTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView <em>Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView <em>Immediate Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView
	 * @generated
	 */
	public Adapter createImmediateStrongAbortTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView <em>Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView
	 * @generated
	 */
	public Adapter createDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView <em>Immediate Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView
	 * @generated
	 */
	public Adapter createImmediateDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView <em>Termination Defferd Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView
	 * @generated
	 */
	public Adapter createTerminationDefferdTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView <em>Conditional Termination Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView
	 * @generated
	 */
	public Adapter createConditionalTerminationDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView <em>Strong Abort Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView <em>Immediate Strong Abort Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView
	 * @generated
	 */
	public Adapter createImmediateStrongAbortDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView <em>History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView
	 * @generated
	 */
	public Adapter createHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView <em>Immediate History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView
	 * @generated
	 */
	public Adapter createImmediateHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView <em>Termination History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView
	 * @generated
	 */
	public Adapter createTerminationHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView <em>Conditional Termination History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView
	 * @generated
	 */
	public Adapter createConditionalTerminationHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView <em>Strong Abort History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView <em>Immediate Strong Abort History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView
	 * @generated
	 */
	public Adapter createImmediateStrongAbortHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.ConnectionView <em>Connection View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConnectionView
	 * @generated
	 */
	public Adapter createConnectionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.SCChartView <em>SC Chart View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartView
	 * @generated
	 */
	public Adapter createSCChartViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView <em>Assignment View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.views.AssignmentView
	 * @generated
	 */
	public Adapter createAssignmentViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewsAdapterFactory
