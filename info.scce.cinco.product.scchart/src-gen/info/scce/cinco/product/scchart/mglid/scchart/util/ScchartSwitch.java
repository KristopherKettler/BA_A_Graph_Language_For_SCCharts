/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.util;

import graphmodel.Container;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.*;

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
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage
 * @generated
 */
public class ScchartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScchartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScchartSwitch() {
		if (modelPackage == null) {
			modelPackage = ScchartPackage.eINSTANCE;
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
			case ScchartPackage.ROOT_STATE: {
				RootState rootState = (RootState)theEObject;
				T result = caseRootState(rootState);
				if (result == null) result = caseContainer(rootState);
				if (result == null) result = caseModelElementContainer(rootState);
				if (result == null) result = caseNode(rootState);
				if (result == null) result = caseModelElement(rootState);
				if (result == null) result = caseIdentifiableElement(rootState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseContainer(region);
				if (result == null) result = caseModelElementContainer(region);
				if (result == null) result = caseNode(region);
				if (result == null) result = caseModelElement(region);
				if (result == null) result = caseIdentifiableElement(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.REGION_REF: {
				RegionRef regionRef = (RegionRef)theEObject;
				T result = caseRegionRef(regionRef);
				if (result == null) result = caseContainer(regionRef);
				if (result == null) result = caseModelElementContainer(regionRef);
				if (result == null) result = caseNode(regionRef);
				if (result == null) result = caseModelElement(regionRef);
				if (result == null) result = caseIdentifiableElement(regionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUPER_STATE: {
				SuperState superState = (SuperState)theEObject;
				T result = caseSuperState(superState);
				if (result == null) result = caseContainer(superState);
				if (result == null) result = caseModelElementContainer(superState);
				if (result == null) result = caseNode(superState);
				if (result == null) result = caseModelElement(superState);
				if (result == null) result = caseIdentifiableElement(superState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_SUPER_STATE: {
				InitialSuperState initialSuperState = (InitialSuperState)theEObject;
				T result = caseInitialSuperState(initialSuperState);
				if (result == null) result = caseSuperState(initialSuperState);
				if (result == null) result = caseContainer(initialSuperState);
				if (result == null) result = caseModelElementContainer(initialSuperState);
				if (result == null) result = caseNode(initialSuperState);
				if (result == null) result = caseModelElement(initialSuperState);
				if (result == null) result = caseIdentifiableElement(initialSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.FINAL_SUPER_STATE: {
				FinalSuperState finalSuperState = (FinalSuperState)theEObject;
				T result = caseFinalSuperState(finalSuperState);
				if (result == null) result = caseSuperState(finalSuperState);
				if (result == null) result = caseContainer(finalSuperState);
				if (result == null) result = caseModelElementContainer(finalSuperState);
				if (result == null) result = caseNode(finalSuperState);
				if (result == null) result = caseModelElement(finalSuperState);
				if (result == null) result = caseIdentifiableElement(finalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_FINAL_SUPER_STATE: {
				InitialFinalSuperState initialFinalSuperState = (InitialFinalSuperState)theEObject;
				T result = caseInitialFinalSuperState(initialFinalSuperState);
				if (result == null) result = caseSuperState(initialFinalSuperState);
				if (result == null) result = caseContainer(initialFinalSuperState);
				if (result == null) result = caseModelElementContainer(initialFinalSuperState);
				if (result == null) result = caseNode(initialFinalSuperState);
				if (result == null) result = caseModelElement(initialFinalSuperState);
				if (result == null) result = caseIdentifiableElement(initialFinalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseNode(declaration);
				if (result == null) result = caseModelElement(declaration);
				if (result == null) result = caseIdentifiableElement(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUSPENSION: {
				Suspension suspension = (Suspension)theEObject;
				T result = caseSuspension(suspension);
				if (result == null) result = caseNode(suspension);
				if (result == null) result = caseModelElement(suspension);
				if (result == null) result = caseIdentifiableElement(suspension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNode(action);
				if (result == null) result = caseModelElement(action);
				if (result == null) result = caseIdentifiableElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SIMPLE_STATE: {
				SimpleState simpleState = (SimpleState)theEObject;
				T result = caseSimpleState(simpleState);
				if (result == null) result = caseNode(simpleState);
				if (result == null) result = caseModelElement(simpleState);
				if (result == null) result = caseIdentifiableElement(simpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseSimpleState(initialState);
				if (result == null) result = caseNode(initialState);
				if (result == null) result = caseModelElement(initialState);
				if (result == null) result = caseIdentifiableElement(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseSimpleState(finalState);
				if (result == null) result = caseNode(finalState);
				if (result == null) result = caseModelElement(finalState);
				if (result == null) result = caseIdentifiableElement(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_FINAL_STATE: {
				InitialFinalState initialFinalState = (InitialFinalState)theEObject;
				T result = caseInitialFinalState(initialFinalState);
				if (result == null) result = caseSimpleState(initialFinalState);
				if (result == null) result = caseNode(initialFinalState);
				if (result == null) result = caseModelElement(initialFinalState);
				if (result == null) result = caseIdentifiableElement(initialFinalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseSimpleState(connector);
				if (result == null) result = caseNode(connector);
				if (result == null) result = caseModelElement(connector);
				if (result == null) result = caseIdentifiableElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SC_CHART_REFERECE: {
				SCChartReferece scChartReferece = (SCChartReferece)theEObject;
				T result = caseSCChartReferece(scChartReferece);
				if (result == null) result = caseContainer(scChartReferece);
				if (result == null) result = caseModelElementContainer(scChartReferece);
				if (result == null) result = caseNode(scChartReferece);
				if (result == null) result = caseModelElement(scChartReferece);
				if (result == null) result = caseIdentifiableElement(scChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_SC_CHART_REFERECE: {
				InitialSCChartReferece initialSCChartReferece = (InitialSCChartReferece)theEObject;
				T result = caseInitialSCChartReferece(initialSCChartReferece);
				if (result == null) result = caseSCChartReferece(initialSCChartReferece);
				if (result == null) result = caseContainer(initialSCChartReferece);
				if (result == null) result = caseModelElementContainer(initialSCChartReferece);
				if (result == null) result = caseNode(initialSCChartReferece);
				if (result == null) result = caseModelElement(initialSCChartReferece);
				if (result == null) result = caseIdentifiableElement(initialSCChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.FINAL_SC_CHART_REFERECE: {
				FinalSCChartReferece finalSCChartReferece = (FinalSCChartReferece)theEObject;
				T result = caseFinalSCChartReferece(finalSCChartReferece);
				if (result == null) result = caseSCChartReferece(finalSCChartReferece);
				if (result == null) result = caseContainer(finalSCChartReferece);
				if (result == null) result = caseModelElementContainer(finalSCChartReferece);
				if (result == null) result = caseNode(finalSCChartReferece);
				if (result == null) result = caseModelElement(finalSCChartReferece);
				if (result == null) result = caseIdentifiableElement(finalSCChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_FINAL_SC_CHART_REFERECE: {
				InitialFinalSCChartReferece initialFinalSCChartReferece = (InitialFinalSCChartReferece)theEObject;
				T result = caseInitialFinalSCChartReferece(initialFinalSCChartReferece);
				if (result == null) result = caseSCChartReferece(initialFinalSCChartReferece);
				if (result == null) result = caseContainer(initialFinalSCChartReferece);
				if (result == null) result = caseModelElementContainer(initialFinalSCChartReferece);
				if (result == null) result = caseNode(initialFinalSCChartReferece);
				if (result == null) result = caseModelElement(initialFinalSCChartReferece);
				if (result == null) result = caseIdentifiableElement(initialFinalSCChartReferece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.ABSTRACT_TRANSITION: {
				AbstractTransition abstractTransition = (AbstractTransition)theEObject;
				T result = caseAbstractTransition(abstractTransition);
				if (result == null) result = caseEdge(abstractTransition);
				if (result == null) result = caseModelElement(abstractTransition);
				if (result == null) result = caseIdentifiableElement(abstractTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseAbstractTransition(transition);
				if (result == null) result = caseEdge(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseIdentifiableElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_TRANSITION: {
				TerminationTransition terminationTransition = (TerminationTransition)theEObject;
				T result = caseTerminationTransition(terminationTransition);
				if (result == null) result = caseAbstractTransition(terminationTransition);
				if (result == null) result = caseEdge(terminationTransition);
				if (result == null) result = caseModelElement(terminationTransition);
				if (result == null) result = caseIdentifiableElement(terminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_TRANSITION: {
				StrongAbortTransition strongAbortTransition = (StrongAbortTransition)theEObject;
				T result = caseStrongAbortTransition(strongAbortTransition);
				if (result == null) result = caseAbstractTransition(strongAbortTransition);
				if (result == null) result = caseEdge(strongAbortTransition);
				if (result == null) result = caseModelElement(strongAbortTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.DEFERRED_TRANSITION: {
				DeferredTransition deferredTransition = (DeferredTransition)theEObject;
				T result = caseDeferredTransition(deferredTransition);
				if (result == null) result = caseAbstractTransition(deferredTransition);
				if (result == null) result = caseEdge(deferredTransition);
				if (result == null) result = caseModelElement(deferredTransition);
				if (result == null) result = caseIdentifiableElement(deferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.HISTORY_TRANSITION: {
				HistoryTransition historyTransition = (HistoryTransition)theEObject;
				T result = caseHistoryTransition(historyTransition);
				if (result == null) result = caseAbstractTransition(historyTransition);
				if (result == null) result = caseEdge(historyTransition);
				if (result == null) result = caseModelElement(historyTransition);
				if (result == null) result = caseIdentifiableElement(historyTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_DEFERRED_TRANSITION: {
				TerminationDeferredTransition terminationDeferredTransition = (TerminationDeferredTransition)theEObject;
				T result = caseTerminationDeferredTransition(terminationDeferredTransition);
				if (result == null) result = caseAbstractTransition(terminationDeferredTransition);
				if (result == null) result = caseEdge(terminationDeferredTransition);
				if (result == null) result = caseModelElement(terminationDeferredTransition);
				if (result == null) result = caseIdentifiableElement(terminationDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_DEFERRED_TRANSITION: {
				StrongAbortDeferredTransition strongAbortDeferredTransition = (StrongAbortDeferredTransition)theEObject;
				T result = caseStrongAbortDeferredTransition(strongAbortDeferredTransition);
				if (result == null) result = caseAbstractTransition(strongAbortDeferredTransition);
				if (result == null) result = caseEdge(strongAbortDeferredTransition);
				if (result == null) result = caseModelElement(strongAbortDeferredTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_HISTORY_TRANSITION: {
				TerminationHistoryTransition terminationHistoryTransition = (TerminationHistoryTransition)theEObject;
				T result = caseTerminationHistoryTransition(terminationHistoryTransition);
				if (result == null) result = caseAbstractTransition(terminationHistoryTransition);
				if (result == null) result = caseEdge(terminationHistoryTransition);
				if (result == null) result = caseModelElement(terminationHistoryTransition);
				if (result == null) result = caseIdentifiableElement(terminationHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_HISTORY_TRANSITION: {
				StrongAbortHistoryTransition strongAbortHistoryTransition = (StrongAbortHistoryTransition)theEObject;
				T result = caseStrongAbortHistoryTransition(strongAbortHistoryTransition);
				if (result == null) result = caseAbstractTransition(strongAbortHistoryTransition);
				if (result == null) result = caseEdge(strongAbortHistoryTransition);
				if (result == null) result = caseModelElement(strongAbortHistoryTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.DEFERRED_HISTORY_TRANSITION: {
				DeferredHistoryTransition deferredHistoryTransition = (DeferredHistoryTransition)theEObject;
				T result = caseDeferredHistoryTransition(deferredHistoryTransition);
				if (result == null) result = caseAbstractTransition(deferredHistoryTransition);
				if (result == null) result = caseEdge(deferredHistoryTransition);
				if (result == null) result = caseModelElement(deferredHistoryTransition);
				if (result == null) result = caseIdentifiableElement(deferredHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION: {
				StrongAbortDeferredHistoryTransition strongAbortDeferredHistoryTransition = (StrongAbortDeferredHistoryTransition)theEObject;
				T result = caseStrongAbortDeferredHistoryTransition(strongAbortDeferredHistoryTransition);
				if (result == null) result = caseAbstractTransition(strongAbortDeferredHistoryTransition);
				if (result == null) result = caseEdge(strongAbortDeferredHistoryTransition);
				if (result == null) result = caseModelElement(strongAbortDeferredHistoryTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortDeferredHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION: {
				TerminationDeferredHistoryTransition terminationDeferredHistoryTransition = (TerminationDeferredHistoryTransition)theEObject;
				T result = caseTerminationDeferredHistoryTransition(terminationDeferredHistoryTransition);
				if (result == null) result = caseAbstractTransition(terminationDeferredHistoryTransition);
				if (result == null) result = caseEdge(terminationDeferredHistoryTransition);
				if (result == null) result = caseModelElement(terminationDeferredHistoryTransition);
				if (result == null) result = caseIdentifiableElement(terminationDeferredHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SC_CHART: {
				SCChart scChart = (SCChart)theEObject;
				T result = caseSCChart(scChart);
				if (result == null) result = caseGraphModel(scChart);
				if (result == null) result = caseModelElementContainer(scChart);
				if (result == null) result = caseIdentifiableElement(scChart);
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
	public T caseRootState(RootState object) {
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
	public T caseRegion(Region object) {
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
	public T caseRegionRef(RegionRef object) {
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
	public T caseSuperState(SuperState object) {
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
	public T caseInitialSuperState(InitialSuperState object) {
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
	public T caseFinalSuperState(FinalSuperState object) {
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
	public T caseInitialFinalSuperState(InitialFinalSuperState object) {
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
	public T caseDeclaration(Declaration object) {
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
	public T caseSuspension(Suspension object) {
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
	public T caseAction(Action object) {
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
	public T caseSimpleState(SimpleState object) {
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
	public T caseInitialState(InitialState object) {
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
	public T caseFinalState(FinalState object) {
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
	public T caseInitialFinalState(InitialFinalState object) {
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
	public T caseConnector(Connector object) {
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
	public T caseSCChartReferece(SCChartReferece object) {
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
	public T caseInitialSCChartReferece(InitialSCChartReferece object) {
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
	public T caseFinalSCChartReferece(FinalSCChartReferece object) {
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
	public T caseInitialFinalSCChartReferece(InitialFinalSCChartReferece object) {
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
	public T caseAbstractTransition(AbstractTransition object) {
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
	public T caseTransition(Transition object) {
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
	public T caseTerminationTransition(TerminationTransition object) {
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
	public T caseStrongAbortTransition(StrongAbortTransition object) {
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
	public T caseDeferredTransition(DeferredTransition object) {
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
	public T caseHistoryTransition(HistoryTransition object) {
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
	public T caseTerminationDeferredTransition(TerminationDeferredTransition object) {
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
	public T caseStrongAbortDeferredTransition(StrongAbortDeferredTransition object) {
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
	public T caseTerminationHistoryTransition(TerminationHistoryTransition object) {
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
	public T caseStrongAbortHistoryTransition(StrongAbortHistoryTransition object) {
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
	public T caseDeferredHistoryTransition(DeferredHistoryTransition object) {
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
	public T caseStrongAbortDeferredHistoryTransition(StrongAbortDeferredHistoryTransition object) {
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
	public T caseTerminationDeferredHistoryTransition(TerminationDeferredHistoryTransition object) {
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
	public T caseSCChart(SCChart object) {
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
	public T caseIdentifiableElement(IdentifiableElement object) {
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
	public T caseModelElementContainer(ModelElementContainer object) {
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
	public T caseModelElement(ModelElement object) {
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
	public T caseNode(Node object) {
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
	public T caseContainer(Container object) {
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
	public T caseEdge(Edge object) {
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
	public T caseGraphModel(GraphModel object) {
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

} //ScchartSwitch
