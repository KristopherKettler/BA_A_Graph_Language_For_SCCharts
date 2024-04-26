/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.util;

import info.scce.cinco.product.scchart.mglid.scchart.views.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewsPackage.ROOT_STATE_VIEW: {
				RootStateView rootStateView = (RootStateView)theEObject;
				T result = caseRootStateView(rootStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.REGION_VIEW: {
				RegionView regionView = (RegionView)theEObject;
				T result = caseRegionView(regionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.REGION_REF_VIEW: {
				RegionRefView regionRefView = (RegionRefView)theEObject;
				T result = caseRegionRefView(regionRefView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUPER_STATE_VIEW: {
				SuperStateView superStateView = (SuperStateView)theEObject;
				T result = caseSuperStateView(superStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_SUPER_STATE_VIEW: {
				InitialSuperStateView initialSuperStateView = (InitialSuperStateView)theEObject;
				T result = caseInitialSuperStateView(initialSuperStateView);
				if (result == null) result = caseSuperStateView(initialSuperStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FINAL_SUPER_STATE_VIEW: {
				FinalSuperStateView finalSuperStateView = (FinalSuperStateView)theEObject;
				T result = caseFinalSuperStateView(finalSuperStateView);
				if (result == null) result = caseSuperStateView(finalSuperStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_FINAL_SUPER_STATE_VIEW: {
				InitialFinalSuperStateView initialFinalSuperStateView = (InitialFinalSuperStateView)theEObject;
				T result = caseInitialFinalSuperStateView(initialFinalSuperStateView);
				if (result == null) result = caseSuperStateView(initialFinalSuperStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DECLARATION_VIEW: {
				DeclarationView declarationView = (DeclarationView)theEObject;
				T result = caseDeclarationView(declarationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUSPENSION_VIEW: {
				SuspensionView suspensionView = (SuspensionView)theEObject;
				T result = caseSuspensionView(suspensionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ACTION_VIEW: {
				ActionView actionView = (ActionView)theEObject;
				T result = caseActionView(actionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SIMPLE_STATE_VIEW: {
				SimpleStateView simpleStateView = (SimpleStateView)theEObject;
				T result = caseSimpleStateView(simpleStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_STATE_VIEW: {
				InitialStateView initialStateView = (InitialStateView)theEObject;
				T result = caseInitialStateView(initialStateView);
				if (result == null) result = caseSimpleStateView(initialStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FINAL_STATE_VIEW: {
				FinalStateView finalStateView = (FinalStateView)theEObject;
				T result = caseFinalStateView(finalStateView);
				if (result == null) result = caseSimpleStateView(finalStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_FINAL_STATE_VIEW: {
				InitialFinalStateView initialFinalStateView = (InitialFinalStateView)theEObject;
				T result = caseInitialFinalStateView(initialFinalStateView);
				if (result == null) result = caseSimpleStateView(initialFinalStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONNECTOR_VIEW: {
				ConnectorView connectorView = (ConnectorView)theEObject;
				T result = caseConnectorView(connectorView);
				if (result == null) result = caseSimpleStateView(connectorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SC_CHART_REFERECE_VIEW: {
				SCChartRefereceView scChartRefereceView = (SCChartRefereceView)theEObject;
				T result = caseSCChartRefereceView(scChartRefereceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_SC_CHART_REFERECE_VIEW: {
				InitialSCChartRefereceView initialSCChartRefereceView = (InitialSCChartRefereceView)theEObject;
				T result = caseInitialSCChartRefereceView(initialSCChartRefereceView);
				if (result == null) result = caseSCChartRefereceView(initialSCChartRefereceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FINAL_SC_CHART_REFERECE_VIEW: {
				FinalSCChartRefereceView finalSCChartRefereceView = (FinalSCChartRefereceView)theEObject;
				T result = caseFinalSCChartRefereceView(finalSCChartRefereceView);
				if (result == null) result = caseSCChartRefereceView(finalSCChartRefereceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_FINAL_SC_CHART_REFERECE_VIEW: {
				InitialFinalSCChartRefereceView initialFinalSCChartRefereceView = (InitialFinalSCChartRefereceView)theEObject;
				T result = caseInitialFinalSCChartRefereceView(initialFinalSCChartRefereceView);
				if (result == null) result = caseSCChartRefereceView(initialFinalSCChartRefereceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW: {
				AbstractTransitionView abstractTransitionView = (AbstractTransitionView)theEObject;
				T result = caseAbstractTransitionView(abstractTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TRANSITION_VIEW: {
				TransitionView transitionView = (TransitionView)theEObject;
				T result = caseTransitionView(transitionView);
				if (result == null) result = caseAbstractTransitionView(transitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TERMINATION_TRANSITION_VIEW: {
				TerminationTransitionView terminationTransitionView = (TerminationTransitionView)theEObject;
				T result = caseTerminationTransitionView(terminationTransitionView);
				if (result == null) result = caseAbstractTransitionView(terminationTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW: {
				StrongAbortTransitionView strongAbortTransitionView = (StrongAbortTransitionView)theEObject;
				T result = caseStrongAbortTransitionView(strongAbortTransitionView);
				if (result == null) result = caseAbstractTransitionView(strongAbortTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DEFERRED_TRANSITION_VIEW: {
				DeferredTransitionView deferredTransitionView = (DeferredTransitionView)theEObject;
				T result = caseDeferredTransitionView(deferredTransitionView);
				if (result == null) result = caseAbstractTransitionView(deferredTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.HISTORY_TRANSITION_VIEW: {
				HistoryTransitionView historyTransitionView = (HistoryTransitionView)theEObject;
				T result = caseHistoryTransitionView(historyTransitionView);
				if (result == null) result = caseAbstractTransitionView(historyTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW: {
				TerminationDeferredTransitionView terminationDeferredTransitionView = (TerminationDeferredTransitionView)theEObject;
				T result = caseTerminationDeferredTransitionView(terminationDeferredTransitionView);
				if (result == null) result = caseAbstractTransitionView(terminationDeferredTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW: {
				StrongAbortDeferredTransitionView strongAbortDeferredTransitionView = (StrongAbortDeferredTransitionView)theEObject;
				T result = caseStrongAbortDeferredTransitionView(strongAbortDeferredTransitionView);
				if (result == null) result = caseAbstractTransitionView(strongAbortDeferredTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW: {
				TerminationHistoryTransitionView terminationHistoryTransitionView = (TerminationHistoryTransitionView)theEObject;
				T result = caseTerminationHistoryTransitionView(terminationHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(terminationHistoryTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW: {
				StrongAbortHistoryTransitionView strongAbortHistoryTransitionView = (StrongAbortHistoryTransitionView)theEObject;
				T result = caseStrongAbortHistoryTransitionView(strongAbortHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(strongAbortHistoryTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW: {
				DeferredHistoryTransitionView deferredHistoryTransitionView = (DeferredHistoryTransitionView)theEObject;
				T result = caseDeferredHistoryTransitionView(deferredHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(deferredHistoryTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW: {
				StrongAbortDeferredHistoryTransitionView strongAbortDeferredHistoryTransitionView = (StrongAbortDeferredHistoryTransitionView)theEObject;
				T result = caseStrongAbortDeferredHistoryTransitionView(strongAbortDeferredHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(strongAbortDeferredHistoryTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW: {
				TerminationDeferredHistoryTransitionView terminationDeferredHistoryTransitionView = (TerminationDeferredHistoryTransitionView)theEObject;
				T result = caseTerminationDeferredHistoryTransitionView(terminationDeferredHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(terminationDeferredHistoryTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SC_CHART_VIEW: {
				SCChartView scChartView = (SCChartView)theEObject;
				T result = caseSCChartView(scChartView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootStateView(RootStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionView(RegionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Ref View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Ref View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionRefView(RegionRefView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperStateView(SuperStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialSuperStateView(InitialSuperStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalSuperStateView(FinalSuperStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Final Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Final Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialFinalSuperStateView(InitialFinalSuperStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationView(DeclarationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspensionView(SuspensionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionView(ActionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleStateView(SimpleStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialStateView(InitialStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalStateView(FinalStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Final State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Final State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialFinalStateView(InitialFinalStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorView(ConnectorView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC Chart Referece View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Chart Referece View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCChartRefereceView(SCChartRefereceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial SC Chart Referece View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial SC Chart Referece View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialSCChartRefereceView(InitialSCChartRefereceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final SC Chart Referece View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final SC Chart Referece View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalSCChartRefereceView(FinalSCChartRefereceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Final SC Chart Referece View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Final SC Chart Referece View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialFinalSCChartRefereceView(InitialFinalSCChartRefereceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransitionView(AbstractTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionView(TransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationTransitionView(TerminationTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortTransitionView(StrongAbortTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deferred Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferred Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeferredTransitionView(DeferredTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryTransitionView(HistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Deferred Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Deferred Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationDeferredTransitionView(TerminationDeferredTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Deferred Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Deferred Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortDeferredTransitionView(StrongAbortDeferredTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationHistoryTransitionView(TerminationHistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortHistoryTransitionView(StrongAbortHistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deferred History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferred History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeferredHistoryTransitionView(DeferredHistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Deferred History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Deferred History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortDeferredHistoryTransitionView(StrongAbortDeferredHistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Deferred History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Deferred History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationDeferredHistoryTransitionView(TerminationDeferredHistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC Chart View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Chart View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCChartView(SCChartView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewsSwitch
