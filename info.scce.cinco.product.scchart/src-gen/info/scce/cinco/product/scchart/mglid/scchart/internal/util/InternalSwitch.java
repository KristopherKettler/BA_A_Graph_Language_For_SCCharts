/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.scchart.mglid.scchart.internal.*;

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
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage
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
			case InternalPackage.INTERNAL_REGION_REF: {
				InternalRegionRef internalRegionRef = (InternalRegionRef)theEObject;
				T result = caseInternalRegionRef(internalRegionRef);
				if (result == null) result = caseInternalContainer(internalRegionRef);
				if (result == null) result = caseInternalNode(internalRegionRef);
				if (result == null) result = caseInternalModelElementContainer(internalRegionRef);
				if (result == null) result = caseInternalModelElement(internalRegionRef);
				if (result == null) result = caseInternalIdentifiableElement(internalRegionRef);
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
			case InternalPackage.INTERNAL_INITIAL_SUPER_STATE: {
				InternalInitialSuperState internalInitialSuperState = (InternalInitialSuperState)theEObject;
				T result = caseInternalInitialSuperState(internalInitialSuperState);
				if (result == null) result = caseInternalSuperState(internalInitialSuperState);
				if (result == null) result = caseInternalContainer(internalInitialSuperState);
				if (result == null) result = caseInternalNode(internalInitialSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalInitialSuperState);
				if (result == null) result = caseInternalModelElement(internalInitialSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialSuperState);
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
			case InternalPackage.INTERNAL_INITIAL_FINAL_SUPER_STATE: {
				InternalInitialFinalSuperState internalInitialFinalSuperState = (InternalInitialFinalSuperState)theEObject;
				T result = caseInternalInitialFinalSuperState(internalInitialFinalSuperState);
				if (result == null) result = caseInternalSuperState(internalInitialFinalSuperState);
				if (result == null) result = caseInternalContainer(internalInitialFinalSuperState);
				if (result == null) result = caseInternalNode(internalInitialFinalSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalInitialFinalSuperState);
				if (result == null) result = caseInternalModelElement(internalInitialFinalSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialFinalSuperState);
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
			case InternalPackage.INTERNAL_SUSPENSION: {
				InternalSuspension internalSuspension = (InternalSuspension)theEObject;
				T result = caseInternalSuspension(internalSuspension);
				if (result == null) result = caseInternalNode(internalSuspension);
				if (result == null) result = caseInternalModelElement(internalSuspension);
				if (result == null) result = caseInternalIdentifiableElement(internalSuspension);
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
			case InternalPackage.INTERNAL_INITIAL_FINAL_STATE: {
				InternalInitialFinalState internalInitialFinalState = (InternalInitialFinalState)theEObject;
				T result = caseInternalInitialFinalState(internalInitialFinalState);
				if (result == null) result = caseInternalSimpleState(internalInitialFinalState);
				if (result == null) result = caseInternalNode(internalInitialFinalState);
				if (result == null) result = caseInternalModelElement(internalInitialFinalState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialFinalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONNECTOR: {
				InternalConnector internalConnector = (InternalConnector)theEObject;
				T result = caseInternalConnector(internalConnector);
				if (result == null) result = caseInternalSimpleState(internalConnector);
				if (result == null) result = caseInternalNode(internalConnector);
				if (result == null) result = caseInternalModelElement(internalConnector);
				if (result == null) result = caseInternalIdentifiableElement(internalConnector);
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
			case InternalPackage.INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE: {
				InternalInitialFinalSCChartReferece internalInitialFinalSCChartReferece = (InternalInitialFinalSCChartReferece)theEObject;
				T result = caseInternalInitialFinalSCChartReferece(internalInitialFinalSCChartReferece);
				if (result == null) result = caseInternalSCChartReferece(internalInitialFinalSCChartReferece);
				if (result == null) result = caseInternalContainer(internalInitialFinalSCChartReferece);
				if (result == null) result = caseInternalNode(internalInitialFinalSCChartReferece);
				if (result == null) result = caseInternalModelElementContainer(internalInitialFinalSCChartReferece);
				if (result == null) result = caseInternalModelElement(internalInitialFinalSCChartReferece);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialFinalSCChartReferece);
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
			case InternalPackage.INTERNAL_TERMINATION_DEFERRED_TRANSITION: {
				InternalTerminationDeferredTransition internalTerminationDeferredTransition = (InternalTerminationDeferredTransition)theEObject;
				T result = caseInternalTerminationDeferredTransition(internalTerminationDeferredTransition);
				if (result == null) result = caseInternalAbstractTransition(internalTerminationDeferredTransition);
				if (result == null) result = caseInternalEdge(internalTerminationDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalTerminationDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTerminationDeferredTransition);
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
			case InternalPackage.INTERNAL_DEFERRED_HISTORY_TRANSITION: {
				InternalDeferredHistoryTransition internalDeferredHistoryTransition = (InternalDeferredHistoryTransition)theEObject;
				T result = caseInternalDeferredHistoryTransition(internalDeferredHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalDeferredHistoryTransition);
				if (result == null) result = caseInternalEdge(internalDeferredHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalDeferredHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalDeferredHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION: {
				InternalStrongAbortDeferredHistoryTransition internalStrongAbortDeferredHistoryTransition = (InternalStrongAbortDeferredHistoryTransition)theEObject;
				T result = caseInternalStrongAbortDeferredHistoryTransition(internalStrongAbortDeferredHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalStrongAbortDeferredHistoryTransition);
				if (result == null) result = caseInternalEdge(internalStrongAbortDeferredHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalStrongAbortDeferredHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalStrongAbortDeferredHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION: {
				InternalTerminationDeferredHistoryTransition internalTerminationDeferredHistoryTransition = (InternalTerminationDeferredHistoryTransition)theEObject;
				T result = caseInternalTerminationDeferredHistoryTransition(internalTerminationDeferredHistoryTransition);
				if (result == null) result = caseInternalAbstractTransition(internalTerminationDeferredHistoryTransition);
				if (result == null) result = caseInternalEdge(internalTerminationDeferredHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalTerminationDeferredHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTerminationDeferredHistoryTransition);
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
	 * Returns the result of interpreting the object as an instance of '<em>Region Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRegionRef(InternalRegionRef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Initial Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialSuperState(InternalInitialSuperState object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Initial Final Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Final Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialFinalSuperState(InternalInitialFinalSuperState object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuspension(InternalSuspension object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Initial Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialFinalState(InternalInitialFinalState object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Initial Final SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Final SC Chart Referece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialFinalSCChartReferece(InternalInitialFinalSCChartReferece object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Termination Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTerminationDeferredTransition(InternalTerminationDeferredTransition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Deferred History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferred History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDeferredHistoryTransition(InternalDeferredHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Deferred History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Deferred History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStrongAbortDeferredHistoryTransition(InternalStrongAbortDeferredHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Deferred History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Deferred History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTerminationDeferredHistoryTransition(InternalTerminationDeferredHistoryTransition object) {
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
