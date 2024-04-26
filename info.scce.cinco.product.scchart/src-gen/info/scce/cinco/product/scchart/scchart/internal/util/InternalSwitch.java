/**
 */
package info.scce.cinco.product.scchart.scchart.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;
import graphmodel.internal.InternalType;

import info.scce.cinco.product.scchart.scchart.internal.*;

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
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage
 * @generated
 */
public class InternalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSwitch() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
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
			case InternalPackage.INTERNAL_ROOT_STATE: {
				InternalRootState internalRootState = (InternalRootState)theEObject;
				T result = caseInternalRootState(internalRootState);
				if (result == null) result = caseInternalContainer(internalRootState);
				if (result == null) result = caseInternalNode(internalRootState);
				if (result == null) result = caseInternalModelElementContainer(internalRootState);
				if (result == null) result = caseInternalModelElement(internalRootState);
				if (result == null) result = caseInternalIdentifiableElement(internalRootState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_REGION: {
				InternalRegion internalRegion = (InternalRegion)theEObject;
				T result = caseInternalRegion(internalRegion);
				if (result == null) result = caseInternalContainer(internalRegion);
				if (result == null) result = caseInternalNode(internalRegion);
				if (result == null) result = caseInternalModelElementContainer(internalRegion);
				if (result == null) result = caseInternalModelElement(internalRegion);
				if (result == null) result = caseInternalIdentifiableElement(internalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DATA_FLOW_REGION: {
				InternalDataFlowRegion internalDataFlowRegion = (InternalDataFlowRegion)theEObject;
				T result = caseInternalDataFlowRegion(internalDataFlowRegion);
				if (result == null) result = caseInternalRegion(internalDataFlowRegion);
				if (result == null) result = caseInternalContainer(internalDataFlowRegion);
				if (result == null) result = caseInternalNode(internalDataFlowRegion);
				if (result == null) result = caseInternalModelElementContainer(internalDataFlowRegion);
				if (result == null) result = caseInternalModelElement(internalDataFlowRegion);
				if (result == null) result = caseInternalIdentifiableElement(internalDataFlowRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUPER_STATE: {
				InternalSuperState internalSuperState = (InternalSuperState)theEObject;
				T result = caseInternalSuperState(internalSuperState);
				if (result == null) result = caseInternalContainer(internalSuperState);
				if (result == null) result = caseInternalNode(internalSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalSuperState);
				if (result == null) result = caseInternalModelElement(internalSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INITILAL_SUPER_STATE: {
				InternalInitilalSuperState internalInitilalSuperState = (InternalInitilalSuperState)theEObject;
				T result = caseInternalInitilalSuperState(internalInitilalSuperState);
				if (result == null) result = caseInternalSuperState(internalInitilalSuperState);
				if (result == null) result = caseInternalContainer(internalInitilalSuperState);
				if (result == null) result = caseInternalNode(internalInitilalSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalInitilalSuperState);
				if (result == null) result = caseInternalModelElement(internalInitilalSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitilalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FINAL_SUPER_STATE: {
				InternalFinalSuperState internalFinalSuperState = (InternalFinalSuperState)theEObject;
				T result = caseInternalFinalSuperState(internalFinalSuperState);
				if (result == null) result = caseInternalSuperState(internalFinalSuperState);
				if (result == null) result = caseInternalContainer(internalFinalSuperState);
				if (result == null) result = caseInternalNode(internalFinalSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalFinalSuperState);
				if (result == null) result = caseInternalModelElement(internalFinalSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalFinalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DECLARATION: {
				InternalDeclaration internalDeclaration = (InternalDeclaration)theEObject;
				T result = caseInternalDeclaration(internalDeclaration);
				if (result == null) result = caseInternalNode(internalDeclaration);
				if (result == null) result = caseInternalModelElement(internalDeclaration);
				if (result == null) result = caseInternalIdentifiableElement(internalDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUSPEND: {
				InternalSuspend internalSuspend = (InternalSuspend)theEObject;
				T result = caseInternalSuspend(internalSuspend);
				if (result == null) result = caseInternalNode(internalSuspend);
				if (result == null) result = caseInternalModelElement(internalSuspend);
				if (result == null) result = caseInternalIdentifiableElement(internalSuspend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_ACTION: {
				InternalAction internalAction = (InternalAction)theEObject;
				T result = caseInternalAction(internalAction);
				if (result == null) result = caseInternalNode(internalAction);
				if (result == null) result = caseInternalModelElement(internalAction);
				if (result == null) result = caseInternalIdentifiableElement(internalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SIMPLE_STATE: {
				InternalSimpleState internalSimpleState = (InternalSimpleState)theEObject;
				T result = caseInternalSimpleState(internalSimpleState);
				if (result == null) result = caseInternalNode(internalSimpleState);
				if (result == null) result = caseInternalModelElement(internalSimpleState);
				if (result == null) result = caseInternalIdentifiableElement(internalSimpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INITIAL_STATE: {
				InternalInitialState internalInitialState = (InternalInitialState)theEObject;
				T result = caseInternalInitialState(internalInitialState);
				if (result == null) result = caseInternalSimpleState(internalInitialState);
				if (result == null) result = caseInternalNode(internalInitialState);
				if (result == null) result = caseInternalModelElement(internalInitialState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FINAL_STATE: {
				InternalFinalState internalFinalState = (InternalFinalState)theEObject;
				T result = caseInternalFinalState(internalFinalState);
				if (result == null) result = caseInternalSimpleState(internalFinalState);
				if (result == null) result = caseInternalNode(internalFinalState);
				if (result == null) result = caseInternalModelElement(internalFinalState);
				if (result == null) result = caseInternalIdentifiableElement(internalFinalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONNECTOR: {
				InternalConnector internalConnector = (InternalConnector)theEObject;
				T result = caseInternalConnector(internalConnector);
				if (result == null) result = caseInternalNode(internalConnector);
				if (result == null) result = caseInternalModelElement(internalConnector);
				if (result == null) result = caseInternalIdentifiableElement(internalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INPUT: {
				InternalInput internalInput = (InternalInput)theEObject;
				T result = caseInternalInput(internalInput);
				if (result == null) result = caseInternalNode(internalInput);
				if (result == null) result = caseInternalModelElement(internalInput);
				if (result == null) result = caseInternalIdentifiableElement(internalInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_OUTPUT: {
				InternalOutput internalOutput = (InternalOutput)theEObject;
				T result = caseInternalOutput(internalOutput);
				if (result == null) result = caseInternalNode(internalOutput);
				if (result == null) result = caseInternalModelElement(internalOutput);
				if (result == null) result = caseInternalIdentifiableElement(internalOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_OPERATOR: {
				InternalOperator internalOperator = (InternalOperator)theEObject;
				T result = caseInternalOperator(internalOperator);
				if (result == null) result = caseInternalNode(internalOperator);
				if (result == null) result = caseInternalModelElement(internalOperator);
				if (result == null) result = caseInternalIdentifiableElement(internalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CIRCUIT_CONNECTER: {
				InternalCircuitConnecter internalCircuitConnecter = (InternalCircuitConnecter)theEObject;
				T result = caseInternalCircuitConnecter(internalCircuitConnecter);
				if (result == null) result = caseInternalNode(internalCircuitConnecter);
				if (result == null) result = caseInternalModelElement(internalCircuitConnecter);
				if (result == null) result = caseInternalIdentifiableElement(internalCircuitConnecter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SC_CHART_REFERECE: {
				InternalSCChartReferece internalSCChartReferece = (InternalSCChartReferece)theEObject;
				T result = caseInternalSCChartReferece(internalSCChartReferece);
				if (result == null) result = caseInternalContainer(internalSCChartReferece);
				if (result == null) result = caseInternalNode(internalSCChartReferece);
				if (result == null) result = caseInternalModelElementContainer(internalSCChartReferece);
				if (result == null) result = caseInternalModelElement(internalSCChartReferece);
				if (result == null) result = caseInternalIdentifiableElement(internalSCChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE: {
				InternalInitialSCChartReferece internalInitialSCChartReferece = (InternalInitialSCChartReferece)theEObject;
				T result = caseInternalInitialSCChartReferece(internalInitialSCChartReferece);
				if (result == null) result = caseInternalSCChartReferece(internalInitialSCChartReferece);
				if (result == null) result = caseInternalContainer(internalInitialSCChartReferece);
				if (result == null) result = caseInternalNode(internalInitialSCChartReferece);
				if (result == null) result = caseInternalModelElementContainer(internalInitialSCChartReferece);
				if (result == null) result = caseInternalModelElement(internalInitialSCChartReferece);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialSCChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FINAL_SC_CHART_REFERECE: {
				InternalFinalSCChartReferece internalFinalSCChartReferece = (InternalFinalSCChartReferece)theEObject;
				T result = caseInternalFinalSCChartReferece(internalFinalSCChartReferece);
				if (result == null) result = caseInternalSCChartReferece(internalFinalSCChartReferece);
				if (result == null) result = caseInternalContainer(internalFinalSCChartReferece);
				if (result == null) result = caseInternalNode(internalFinalSCChartReferece);
				if (result == null) result = caseInternalModelElementContainer(internalFinalSCChartReferece);
				if (result == null) result = caseInternalModelElement(internalFinalSCChartReferece);
				if (result == null) result = caseInternalIdentifiableElement(internalFinalSCChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_ABSTRACT_TRANSITION: {
				InternalAbstractTransition internalAbstractTransition = (InternalAbstractTransition)theEObject;
				T result = caseInternalAbstractTransition(internalAbstractTransition);
				if (result == null) result = caseInternalEdge(internalAbstractTransition);
				if (result == null) result = caseInternalModelElement(internalAbstractTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalAbstractTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TRANSITION: {
				InternalTransition internalTransition = (InternalTransition)theEObject;
				T result = caseInternalTransition(internalTransition);
				if (result == null) result = caseInternalAbstractTransition(internalTransition);
				if (result == null) result = caseInternalEdge(internalTransition);
				if (result == null) result = caseInternalModelElement(internalTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION: {
				InternalImmediateTransition internalImmediateTransition = (InternalImmediateTransition)theEObject;
				T result = caseInternalImmediateTransition(internalImmediateTransition);
				if (result == null) result = caseInternalAbstractTransition(internalImmediateTransition);
				if (result == null) result = caseInternalEdge(internalImmediateTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TERMINATION_TRANSITION: {
				InternalTerminationTransition internalTerminationTransition = (InternalTerminationTransition)theEObject;
				T result = caseInternalTerminationTransition(internalTerminationTransition);
				if (result == null) result = caseInternalAbstractTransition(internalTerminationTransition);
				if (result == null) result = caseInternalEdge(internalTerminationTransition);
				if (result == null) result = caseInternalModelElement(internalTerminationTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_TRANSITION: {
				InternalConditionalTerminationTransition internalConditionalTerminationTransition = (InternalConditionalTerminationTransition)theEObject;
				T result = caseInternalConditionalTerminationTransition(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalAbstractTransition(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalEdge(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalModelElement(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalConditionalTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_STRONG_ABORT_TRANSITION: {
				InternalStrongAbortTransition internalStrongAbortTransition = (InternalStrongAbortTransition)theEObject;
				T result = caseInternalStrongAbortTransition(internalStrongAbortTransition);
				if (result == null) result = caseInternalAbstractTransition(internalStrongAbortTransition);
				if (result == null) result = caseInternalEdge(internalStrongAbortTransition);
				if (result == null) result = caseInternalModelElement(internalStrongAbortTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalStrongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION: {
				InternalImmediateStrongAbortTransition internalImmediateStrongAbortTransition = (InternalImmediateStrongAbortTransition)theEObject;
				T result = caseInternalImmediateStrongAbortTransition(internalImmediateStrongAbortTransition);
				if (result == null) result = caseInternalAbstractTransition(internalImmediateStrongAbortTransition);
				if (result == null) result = caseInternalEdge(internalImmediateStrongAbortTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateStrongAbortTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateStrongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DEFERRED_TRANSITION: {
				InternalDeferredTransition internalDeferredTransition = (InternalDeferredTransition)theEObject;
				T result = caseInternalDeferredTransition(internalDeferredTransition);
				if (result == null) result = caseInternalAbstractTransition(internalDeferredTransition);
				if (result == null) result = caseInternalEdge(internalDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_DEFERRED_TRANSITION: {
				InternalImmediateDeferredTransition internalImmediateDeferredTransition = (InternalImmediateDeferredTransition)theEObject;
				T result = caseInternalImmediateDeferredTransition(internalImmediateDeferredTransition);
				if (result == null) result = caseInternalAbstractTransition(internalImmediateDeferredTransition);
				if (result == null) result = caseInternalEdge(internalImmediateDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TERMINATION_DEFFERD_TRANSITION: {
				InternalTerminationDefferdTransition internalTerminationDefferdTransition = (InternalTerminationDefferdTransition)theEObject;
				T result = caseInternalTerminationDefferdTransition(internalTerminationDefferdTransition);
				if (result == null) result = caseInternalAbstractTransition(internalTerminationDefferdTransition);
				if (result == null) result = caseInternalEdge(internalTerminationDefferdTransition);
				if (result == null) result = caseInternalModelElement(internalTerminationDefferdTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTerminationDefferdTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION: {
				InternalConditionalTerminationDeferredTransition internalConditionalTerminationDeferredTransition = (InternalConditionalTerminationDeferredTransition)theEObject;
				T result = caseInternalConditionalTerminationDeferredTransition(internalConditionalTerminationDeferredTransition);
				if (result == null) result = caseInternalAbstractTransition(internalConditionalTerminationDeferredTransition);
				if (result == null) result = caseInternalEdge(internalConditionalTerminationDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalConditionalTerminationDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalConditionalTerminationDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION: {
				InternalStrongAbortDeferredTransition internalStrongAbortDeferredTransition = (InternalStrongAbortDeferredTransition)theEObject;
				T result = caseInternalStrongAbortDeferredTransition(internalStrongAbortDeferredTransition);
				if (result == null) result = caseInternalAbstractTransition(internalStrongAbortDeferredTransition);
				if (result == null) result = caseInternalEdge(internalStrongAbortDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalStrongAbortDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalStrongAbortDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION: {
				InternalImmediateStrongAbortDeferredTransition internalImmediateStrongAbortDeferredTransition = (InternalImmediateStrongAbortDeferredTransition)theEObject;
				T result = caseInternalImmediateStrongAbortDeferredTransition(internalImmediateStrongAbortDeferredTransition);
				if (result == null) result = caseInternalAbstractTransition(internalImmediateStrongAbortDeferredTransition);
				if (result == null) result = caseInternalEdge(internalImmediateStrongAbortDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateStrongAbortDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateStrongAbortDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_HISTORY_TRANSITION: {
				InternalHistoryTransition internalHistoryTransition = (InternalHistoryTransition)theEObject;
				T result = caseInternalHistoryTransition(internalHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalHistoryTransition);
				if (result == null) result = caseInternalEdge(internalHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_HISTORY_TRANSITION: {
				InternalImmediateHistoryTransition internalImmediateHistoryTransition = (InternalImmediateHistoryTransition)theEObject;
				T result = caseInternalImmediateHistoryTransition(internalImmediateHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalImmediateHistoryTransition);
				if (result == null) result = caseInternalEdge(internalImmediateHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION: {
				InternalTerminationHistoryTransition internalTerminationHistoryTransition = (InternalTerminationHistoryTransition)theEObject;
				T result = caseInternalTerminationHistoryTransition(internalTerminationHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalTerminationHistoryTransition);
				if (result == null) result = caseInternalEdge(internalTerminationHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalTerminationHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTerminationHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION: {
				InternalConditionalTerminationHistoryTransition internalConditionalTerminationHistoryTransition = (InternalConditionalTerminationHistoryTransition)theEObject;
				T result = caseInternalConditionalTerminationHistoryTransition(internalConditionalTerminationHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalConditionalTerminationHistoryTransition);
				if (result == null) result = caseInternalEdge(internalConditionalTerminationHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalConditionalTerminationHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalConditionalTerminationHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_STRONG_ABORT_HISTORY_TRANSITION: {
				InternalStrongAbortHistoryTransition internalStrongAbortHistoryTransition = (InternalStrongAbortHistoryTransition)theEObject;
				T result = caseInternalStrongAbortHistoryTransition(internalStrongAbortHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalStrongAbortHistoryTransition);
				if (result == null) result = caseInternalEdge(internalStrongAbortHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalStrongAbortHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalStrongAbortHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION: {
				InternalImmediateStrongAbortHistoryTransition internalImmediateStrongAbortHistoryTransition = (InternalImmediateStrongAbortHistoryTransition)theEObject;
				T result = caseInternalImmediateStrongAbortHistoryTransition(internalImmediateStrongAbortHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalImmediateStrongAbortHistoryTransition);
				if (result == null) result = caseInternalEdge(internalImmediateStrongAbortHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateStrongAbortHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateStrongAbortHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONNECTION: {
				InternalConnection internalConnection = (InternalConnection)theEObject;
				T result = caseInternalConnection(internalConnection);
				if (result == null) result = caseInternalEdge(internalConnection);
				if (result == null) result = caseInternalModelElement(internalConnection);
				if (result == null) result = caseInternalIdentifiableElement(internalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SC_CHART: {
				InternalSCChart internalSCChart = (InternalSCChart)theEObject;
				T result = caseInternalSCChart(internalSCChart);
				if (result == null) result = caseInternalGraphModel(internalSCChart);
				if (result == null) result = caseInternalModelElementContainer(internalSCChart);
				if (result == null) result = caseInternalIdentifiableElement(internalSCChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_ASSIGNMENT: {
				InternalAssignment internalAssignment = (InternalAssignment)theEObject;
				T result = caseInternalAssignment(internalAssignment);
				if (result == null) result = caseInternalType(internalAssignment);
				if (result == null) result = caseInternalIdentifiableElement(internalAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRootState(InternalRootState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRegion(InternalRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDataFlowRegion(InternalDataFlowRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuperState(InternalSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initilal Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initilal Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitilalSuperState(InternalInitilalSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFinalSuperState(InternalFinalSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDeclaration(InternalDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuspend(InternalSuspend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAction(InternalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSimpleState(InternalSimpleState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialState(InternalInitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFinalState(InternalFinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConnector(InternalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInput(InternalInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalOutput(InternalOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalOperator(InternalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Connecter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Connecter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalCircuitConnecter(InternalCircuitConnecter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Chart Referece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSCChartReferece(InternalSCChartReferece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial SC Chart Referece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialSCChartReferece(InternalInitialSCChartReferece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final SC Chart Referece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFinalSCChartReferece(InternalFinalSCChartReferece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAbstractTransition(InternalAbstractTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTransition(InternalTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateTransition(InternalImmediateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTerminationTransition(InternalTerminationTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConditionalTerminationTransition(InternalConditionalTerminationTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStrongAbortTransition(InternalStrongAbortTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateStrongAbortTransition(InternalImmediateStrongAbortTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDeferredTransition(InternalDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateDeferredTransition(InternalImmediateDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Defferd Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Defferd Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTerminationDefferdTransition(InternalTerminationDefferdTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConditionalTerminationDeferredTransition(InternalConditionalTerminationDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStrongAbortDeferredTransition(InternalStrongAbortDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateStrongAbortDeferredTransition(InternalImmediateStrongAbortDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalHistoryTransition(InternalHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateHistoryTransition(InternalImmediateHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTerminationHistoryTransition(InternalTerminationHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConditionalTerminationHistoryTransition(InternalConditionalTerminationHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStrongAbortHistoryTransition(InternalStrongAbortHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateStrongAbortHistoryTransition(InternalImmediateStrongAbortHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConnection(InternalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSCChart(InternalSCChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAssignment(InternalAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalIdentifiableElement(InternalIdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalModelElement(InternalModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalNode(InternalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalModelElementContainer(InternalModelElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalContainer(InternalContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEdge(InternalEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalGraphModel(InternalGraphModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalType(InternalType object) {
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

} //InternalSwitch
