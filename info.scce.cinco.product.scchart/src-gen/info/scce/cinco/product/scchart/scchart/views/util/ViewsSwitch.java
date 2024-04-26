/**
 */
package info.scce.cinco.product.scchart.scchart.views.util;

import info.scce.cinco.product.scchart.scchart.views.*;

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
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage
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
			case ViewsPackage.DATA_FLOW_REGION_VIEW: {
				DataFlowRegionView dataFlowRegionView = (DataFlowRegionView)theEObject;
				T result = caseDataFlowRegionView(dataFlowRegionView);
				if (result == null) result = caseRegionView(dataFlowRegionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUPER_STATE_VIEW: {
				SuperStateView superStateView = (SuperStateView)theEObject;
				T result = caseSuperStateView(superStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW: {
				InitilalSuperStateView initilalSuperStateView = (InitilalSuperStateView)theEObject;
				T result = caseInitilalSuperStateView(initilalSuperStateView);
				if (result == null) result = caseSuperStateView(initilalSuperStateView);
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
			case ViewsPackage.DECLARATION_VIEW: {
				DeclarationView declarationView = (DeclarationView)theEObject;
				T result = caseDeclarationView(declarationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUSPEND_VIEW: {
				SuspendView suspendView = (SuspendView)theEObject;
				T result = caseSuspendView(suspendView);
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
			case ViewsPackage.CONNECTOR_VIEW: {
				ConnectorView connectorView = (ConnectorView)theEObject;
				T result = caseConnectorView(connectorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INPUT_VIEW: {
				InputView inputView = (InputView)theEObject;
				T result = caseInputView(inputView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.OUTPUT_VIEW: {
				OutputView outputView = (OutputView)theEObject;
				T result = caseOutputView(outputView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.OPERATOR_VIEW: {
				OperatorView operatorView = (OperatorView)theEObject;
				T result = caseOperatorView(operatorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CIRCUIT_CONNECTER_VIEW: {
				CircuitConnecterView circuitConnecterView = (CircuitConnecterView)theEObject;
				T result = caseCircuitConnecterView(circuitConnecterView);
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
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW: {
				ImmediateTransitionView immediateTransitionView = (ImmediateTransitionView)theEObject;
				T result = caseImmediateTransitionView(immediateTransitionView);
				if (result == null) result = caseAbstractTransitionView(immediateTransitionView);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW: {
				ConditionalTerminationTransitionView conditionalTerminationTransitionView = (ConditionalTerminationTransitionView)theEObject;
				T result = caseConditionalTerminationTransitionView(conditionalTerminationTransitionView);
				if (result == null) result = caseAbstractTransitionView(conditionalTerminationTransitionView);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW: {
				ImmediateStrongAbortTransitionView immediateStrongAbortTransitionView = (ImmediateStrongAbortTransitionView)theEObject;
				T result = caseImmediateStrongAbortTransitionView(immediateStrongAbortTransitionView);
				if (result == null) result = caseAbstractTransitionView(immediateStrongAbortTransitionView);
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
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW: {
				ImmediateDeferredTransitionView immediateDeferredTransitionView = (ImmediateDeferredTransitionView)theEObject;
				T result = caseImmediateDeferredTransitionView(immediateDeferredTransitionView);
				if (result == null) result = caseAbstractTransitionView(immediateDeferredTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW: {
				TerminationDefferdTransitionView terminationDefferdTransitionView = (TerminationDefferdTransitionView)theEObject;
				T result = caseTerminationDefferdTransitionView(terminationDefferdTransitionView);
				if (result == null) result = caseAbstractTransitionView(terminationDefferdTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW: {
				ConditionalTerminationDeferredTransitionView conditionalTerminationDeferredTransitionView = (ConditionalTerminationDeferredTransitionView)theEObject;
				T result = caseConditionalTerminationDeferredTransitionView(conditionalTerminationDeferredTransitionView);
				if (result == null) result = caseAbstractTransitionView(conditionalTerminationDeferredTransitionView);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW: {
				ImmediateStrongAbortDeferredTransitionView immediateStrongAbortDeferredTransitionView = (ImmediateStrongAbortDeferredTransitionView)theEObject;
				T result = caseImmediateStrongAbortDeferredTransitionView(immediateStrongAbortDeferredTransitionView);
				if (result == null) result = caseAbstractTransitionView(immediateStrongAbortDeferredTransitionView);
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
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW: {
				ImmediateHistoryTransitionView immediateHistoryTransitionView = (ImmediateHistoryTransitionView)theEObject;
				T result = caseImmediateHistoryTransitionView(immediateHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(immediateHistoryTransitionView);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW: {
				ConditionalTerminationHistoryTransitionView conditionalTerminationHistoryTransitionView = (ConditionalTerminationHistoryTransitionView)theEObject;
				T result = caseConditionalTerminationHistoryTransitionView(conditionalTerminationHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(conditionalTerminationHistoryTransitionView);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW: {
				ImmediateStrongAbortHistoryTransitionView immediateStrongAbortHistoryTransitionView = (ImmediateStrongAbortHistoryTransitionView)theEObject;
				T result = caseImmediateStrongAbortHistoryTransitionView(immediateStrongAbortHistoryTransitionView);
				if (result == null) result = caseAbstractTransitionView(immediateStrongAbortHistoryTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONNECTION_VIEW: {
				ConnectionView connectionView = (ConnectionView)theEObject;
				T result = caseConnectionView(connectionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SC_CHART_VIEW: {
				SCChartView scChartView = (SCChartView)theEObject;
				T result = caseSCChartView(scChartView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ASSIGNMENT_VIEW: {
				AssignmentView assignmentView = (AssignmentView)theEObject;
				T result = caseAssignmentView(assignmentView);
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Region View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Region View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowRegionView(DataFlowRegionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Initilal Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initilal Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitilalSuperStateView(InitilalSuperStateView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Suspend View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendView(SuspendView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Input View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputView(InputView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputView(OutputView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorView(OperatorView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Connecter View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Connecter View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitConnecterView(CircuitConnecterView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateTransitionView(ImmediateTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalTerminationTransitionView(ConditionalTerminationTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateStrongAbortTransitionView(ImmediateStrongAbortTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Deferred Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Deferred Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateDeferredTransitionView(ImmediateDeferredTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Defferd Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Defferd Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationDefferdTransitionView(TerminationDefferdTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination Deferred Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination Deferred Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalTerminationDeferredTransitionView(ConditionalTerminationDeferredTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort Deferred Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort Deferred Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateStrongAbortDeferredTransitionView(ImmediateStrongAbortDeferredTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immediate History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateHistoryTransitionView(ImmediateHistoryTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalTerminationHistoryTransitionView(ConditionalTerminationHistoryTransitionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort History Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort History Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateStrongAbortHistoryTransitionView(ImmediateStrongAbortHistoryTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionView(ConnectionView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Assignment View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentView(AssignmentView object) {
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
