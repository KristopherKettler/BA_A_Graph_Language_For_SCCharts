/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.util;

import info.scce.cinco.product.scchart.mglid.scchart.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage
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
			public Adapter caseRegionRefView(RegionRefView object) {
				return createRegionRefViewAdapter();
			}
			@Override
			public Adapter caseSuperStateView(SuperStateView object) {
				return createSuperStateViewAdapter();
			}
			@Override
			public Adapter caseInitialSuperStateView(InitialSuperStateView object) {
				return createInitialSuperStateViewAdapter();
			}
			@Override
			public Adapter caseFinalSuperStateView(FinalSuperStateView object) {
				return createFinalSuperStateViewAdapter();
			}
			@Override
			public Adapter caseInitialFinalSuperStateView(InitialFinalSuperStateView object) {
				return createInitialFinalSuperStateViewAdapter();
			}
			@Override
			public Adapter caseDeclarationView(DeclarationView object) {
				return createDeclarationViewAdapter();
			}
			@Override
			public Adapter caseSuspensionView(SuspensionView object) {
				return createSuspensionViewAdapter();
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
			public Adapter caseInitialFinalStateView(InitialFinalStateView object) {
				return createInitialFinalStateViewAdapter();
			}
			@Override
			public Adapter caseConnectorView(ConnectorView object) {
				return createConnectorViewAdapter();
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
			public Adapter caseInitialFinalSCChartRefereceView(InitialFinalSCChartRefereceView object) {
				return createInitialFinalSCChartRefereceViewAdapter();
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
			public Adapter caseTerminationTransitionView(TerminationTransitionView object) {
				return createTerminationTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortTransitionView(StrongAbortTransitionView object) {
				return createStrongAbortTransitionViewAdapter();
			}
			@Override
			public Adapter caseDeferredTransitionView(DeferredTransitionView object) {
				return createDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseHistoryTransitionView(HistoryTransitionView object) {
				return createHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationDeferredTransitionView(TerminationDeferredTransitionView object) {
				return createTerminationDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortDeferredTransitionView(StrongAbortDeferredTransitionView object) {
				return createStrongAbortDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationHistoryTransitionView(TerminationHistoryTransitionView object) {
				return createTerminationHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortHistoryTransitionView(StrongAbortHistoryTransitionView object) {
				return createStrongAbortHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseDeferredHistoryTransitionView(DeferredHistoryTransitionView object) {
				return createDeferredHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortDeferredHistoryTransitionView(StrongAbortDeferredHistoryTransitionView object) {
				return createStrongAbortDeferredHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationDeferredHistoryTransitionView(TerminationDeferredHistoryTransitionView object) {
				return createTerminationDeferredHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseSCChartView(SCChartView object) {
				return createSCChartViewAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView <em>Root State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView
	 * @generated
	 */
	public Adapter createRootStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView <em>Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView
	 * @generated
	 */
	public Adapter createRegionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView <em>Region Ref View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView
	 * @generated
	 */
	public Adapter createRegionRefViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView <em>Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView
	 * @generated
	 */
	public Adapter createSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView <em>Initial Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView
	 * @generated
	 */
	public Adapter createInitialSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView <em>Final Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView
	 * @generated
	 */
	public Adapter createFinalSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView <em>Initial Final Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView
	 * @generated
	 */
	public Adapter createInitialFinalSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView <em>Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView
	 * @generated
	 */
	public Adapter createDeclarationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView <em>Suspension View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView
	 * @generated
	 */
	public Adapter createSuspensionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView <em>Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView
	 * @generated
	 */
	public Adapter createActionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView <em>Simple State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView
	 * @generated
	 */
	public Adapter createSimpleStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView <em>Initial State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView
	 * @generated
	 */
	public Adapter createInitialStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView <em>Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView
	 * @generated
	 */
	public Adapter createFinalStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView <em>Initial Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView
	 * @generated
	 */
	public Adapter createInitialFinalStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView <em>Connector View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView
	 * @generated
	 */
	public Adapter createConnectorViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView <em>SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView
	 * @generated
	 */
	public Adapter createSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialSCChartRefereceView <em>Initial SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialSCChartRefereceView
	 * @generated
	 */
	public Adapter createInitialSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView <em>Final SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView
	 * @generated
	 */
	public Adapter createFinalSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView <em>Initial Final SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView
	 * @generated
	 */
	public Adapter createInitialFinalSCChartRefereceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView <em>Abstract Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView
	 * @generated
	 */
	public Adapter createAbstractTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView
	 * @generated
	 */
	public Adapter createTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView <em>Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView
	 * @generated
	 */
	public Adapter createTerminationTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView <em>Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView <em>Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView
	 * @generated
	 */
	public Adapter createDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView <em>History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView
	 * @generated
	 */
	public Adapter createHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView <em>Termination Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView
	 * @generated
	 */
	public Adapter createTerminationDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView <em>Strong Abort Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView <em>Termination History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView
	 * @generated
	 */
	public Adapter createTerminationHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView <em>Strong Abort History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView <em>Deferred History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView
	 * @generated
	 */
	public Adapter createDeferredHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView <em>Strong Abort Deferred History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortDeferredHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView <em>Termination Deferred History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView
	 * @generated
	 */
	public Adapter createTerminationDeferredHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView <em>SC Chart View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView
	 * @generated
	 */
	public Adapter createSCChartViewAdapter() {
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
