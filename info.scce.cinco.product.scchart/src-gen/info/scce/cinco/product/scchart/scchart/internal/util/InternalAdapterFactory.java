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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage
 * @generated
 */
public class InternalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
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
	protected InternalSwitch<Adapter> modelSwitch =
		new InternalSwitch<Adapter>() {
			@Override
			public Adapter caseInternalRootState(InternalRootState object) {
				return createInternalRootStateAdapter();
			}
			@Override
			public Adapter caseInternalRegion(InternalRegion object) {
				return createInternalRegionAdapter();
			}
			@Override
			public Adapter caseInternalDataFlowRegion(InternalDataFlowRegion object) {
				return createInternalDataFlowRegionAdapter();
			}
			@Override
			public Adapter caseInternalSuperState(InternalSuperState object) {
				return createInternalSuperStateAdapter();
			}
			@Override
			public Adapter caseInternalInitilalSuperState(InternalInitilalSuperState object) {
				return createInternalInitilalSuperStateAdapter();
			}
			@Override
			public Adapter caseInternalFinalSuperState(InternalFinalSuperState object) {
				return createInternalFinalSuperStateAdapter();
			}
			@Override
			public Adapter caseInternalDeclaration(InternalDeclaration object) {
				return createInternalDeclarationAdapter();
			}
			@Override
			public Adapter caseInternalSuspend(InternalSuspend object) {
				return createInternalSuspendAdapter();
			}
			@Override
			public Adapter caseInternalAction(InternalAction object) {
				return createInternalActionAdapter();
			}
			@Override
			public Adapter caseInternalSimpleState(InternalSimpleState object) {
				return createInternalSimpleStateAdapter();
			}
			@Override
			public Adapter caseInternalInitialState(InternalInitialState object) {
				return createInternalInitialStateAdapter();
			}
			@Override
			public Adapter caseInternalFinalState(InternalFinalState object) {
				return createInternalFinalStateAdapter();
			}
			@Override
			public Adapter caseInternalConnector(InternalConnector object) {
				return createInternalConnectorAdapter();
			}
			@Override
			public Adapter caseInternalInput(InternalInput object) {
				return createInternalInputAdapter();
			}
			@Override
			public Adapter caseInternalOutput(InternalOutput object) {
				return createInternalOutputAdapter();
			}
			@Override
			public Adapter caseInternalOperator(InternalOperator object) {
				return createInternalOperatorAdapter();
			}
			@Override
			public Adapter caseInternalCircuitConnecter(InternalCircuitConnecter object) {
				return createInternalCircuitConnecterAdapter();
			}
			@Override
			public Adapter caseInternalSCChartReferece(InternalSCChartReferece object) {
				return createInternalSCChartRefereceAdapter();
			}
			@Override
			public Adapter caseInternalInitialSCChartReferece(InternalInitialSCChartReferece object) {
				return createInternalInitialSCChartRefereceAdapter();
			}
			@Override
			public Adapter caseInternalFinalSCChartReferece(InternalFinalSCChartReferece object) {
				return createInternalFinalSCChartRefereceAdapter();
			}
			@Override
			public Adapter caseInternalAbstractTransition(InternalAbstractTransition object) {
				return createInternalAbstractTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateTransition(InternalImmediateTransition object) {
				return createInternalImmediateTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTerminationTransition(InternalTerminationTransition object) {
				return createInternalTerminationTransitionAdapter();
			}
			@Override
			public Adapter caseInternalConditionalTerminationTransition(InternalConditionalTerminationTransition object) {
				return createInternalConditionalTerminationTransitionAdapter();
			}
			@Override
			public Adapter caseInternalStrongAbortTransition(InternalStrongAbortTransition object) {
				return createInternalStrongAbortTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateStrongAbortTransition(InternalImmediateStrongAbortTransition object) {
				return createInternalImmediateStrongAbortTransitionAdapter();
			}
			@Override
			public Adapter caseInternalDeferredTransition(InternalDeferredTransition object) {
				return createInternalDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateDeferredTransition(InternalImmediateDeferredTransition object) {
				return createInternalImmediateDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTerminationDefferdTransition(InternalTerminationDefferdTransition object) {
				return createInternalTerminationDefferdTransitionAdapter();
			}
			@Override
			public Adapter caseInternalConditionalTerminationDeferredTransition(InternalConditionalTerminationDeferredTransition object) {
				return createInternalConditionalTerminationDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseInternalStrongAbortDeferredTransition(InternalStrongAbortDeferredTransition object) {
				return createInternalStrongAbortDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateStrongAbortDeferredTransition(InternalImmediateStrongAbortDeferredTransition object) {
				return createInternalImmediateStrongAbortDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseInternalHistoryTransition(InternalHistoryTransition object) {
				return createInternalHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateHistoryTransition(InternalImmediateHistoryTransition object) {
				return createInternalImmediateHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTerminationHistoryTransition(InternalTerminationHistoryTransition object) {
				return createInternalTerminationHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseInternalConditionalTerminationHistoryTransition(InternalConditionalTerminationHistoryTransition object) {
				return createInternalConditionalTerminationHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseInternalStrongAbortHistoryTransition(InternalStrongAbortHistoryTransition object) {
				return createInternalStrongAbortHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateStrongAbortHistoryTransition(InternalImmediateStrongAbortHistoryTransition object) {
				return createInternalImmediateStrongAbortHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseInternalConnection(InternalConnection object) {
				return createInternalConnectionAdapter();
			}
			@Override
			public Adapter caseInternalSCChart(InternalSCChart object) {
				return createInternalSCChartAdapter();
			}
			@Override
			public Adapter caseInternalAssignment(InternalAssignment object) {
				return createInternalAssignmentAdapter();
			}
			@Override
			public Adapter caseInternalIdentifiableElement(InternalIdentifiableElement object) {
				return createInternalIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseInternalModelElement(InternalModelElement object) {
				return createInternalModelElementAdapter();
			}
			@Override
			public Adapter caseInternalNode(InternalNode object) {
				return createInternalNodeAdapter();
			}
			@Override
			public Adapter caseInternalModelElementContainer(InternalModelElementContainer object) {
				return createInternalModelElementContainerAdapter();
			}
			@Override
			public Adapter caseInternalContainer(InternalContainer object) {
				return createInternalContainerAdapter();
			}
			@Override
			public Adapter caseInternalEdge(InternalEdge object) {
				return createInternalEdgeAdapter();
			}
			@Override
			public Adapter caseInternalGraphModel(InternalGraphModel object) {
				return createInternalGraphModelAdapter();
			}
			@Override
			public Adapter caseInternalType(InternalType object) {
				return createInternalTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState <em>Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState
	 * @generated
	 */
	public Adapter createInternalRootStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRegion
	 * @generated
	 */
	public Adapter createInternalRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion <em>Data Flow Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion
	 * @generated
	 */
	public Adapter createInternalDataFlowRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState
	 * @generated
	 */
	public Adapter createInternalSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState <em>Initilal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState
	 * @generated
	 */
	public Adapter createInternalInitilalSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState <em>Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState
	 * @generated
	 */
	public Adapter createInternalFinalSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration
	 * @generated
	 */
	public Adapter createInternalDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend <em>Suspend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuspend
	 * @generated
	 */
	public Adapter createInternalSuspendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAction
	 * @generated
	 */
	public Adapter createInternalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState
	 * @generated
	 */
	public Adapter createInternalSimpleStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState
	 * @generated
	 */
	public Adapter createInternalInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState
	 * @generated
	 */
	public Adapter createInternalFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector
	 * @generated
	 */
	public Adapter createInternalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput
	 * @generated
	 */
	public Adapter createInternalInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput
	 * @generated
	 */
	public Adapter createInternalOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator
	 * @generated
	 */
	public Adapter createInternalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter <em>Circuit Connecter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter
	 * @generated
	 */
	public Adapter createInternalCircuitConnecterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece <em>SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece
	 * @generated
	 */
	public Adapter createInternalSCChartRefereceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece <em>Initial SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece
	 * @generated
	 */
	public Adapter createInternalInitialSCChartRefereceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece <em>Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece
	 * @generated
	 */
	public Adapter createInternalFinalSCChartRefereceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition
	 * @generated
	 */
	public Adapter createInternalAbstractTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition
	 * @generated
	 */
	public Adapter createInternalImmediateTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition <em>Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition
	 * @generated
	 */
	public Adapter createInternalTerminationTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition <em>Conditional Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition
	 * @generated
	 */
	public Adapter createInternalConditionalTerminationTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition <em>Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition
	 * @generated
	 */
	public Adapter createInternalStrongAbortTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition <em>Immediate Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition
	 * @generated
	 */
	public Adapter createInternalImmediateStrongAbortTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition <em>Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition
	 * @generated
	 */
	public Adapter createInternalDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition <em>Immediate Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition
	 * @generated
	 */
	public Adapter createInternalImmediateDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition <em>Termination Defferd Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition
	 * @generated
	 */
	public Adapter createInternalTerminationDefferdTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition <em>Conditional Termination Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition
	 * @generated
	 */
	public Adapter createInternalConditionalTerminationDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition <em>Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition
	 * @generated
	 */
	public Adapter createInternalStrongAbortDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition <em>Immediate Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition
	 * @generated
	 */
	public Adapter createInternalImmediateStrongAbortDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition <em>History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition
	 * @generated
	 */
	public Adapter createInternalHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition <em>Immediate History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition
	 * @generated
	 */
	public Adapter createInternalImmediateHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition <em>Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition
	 * @generated
	 */
	public Adapter createInternalTerminationHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition <em>Conditional Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition
	 * @generated
	 */
	public Adapter createInternalConditionalTerminationHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition <em>Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition
	 * @generated
	 */
	public Adapter createInternalStrongAbortHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition <em>Immediate Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition
	 * @generated
	 */
	public Adapter createInternalImmediateStrongAbortHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnection
	 * @generated
	 */
	public Adapter createInternalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChart <em>SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChart
	 * @generated
	 */
	public Adapter createInternalSCChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAssignment
	 * @generated
	 */
	public Adapter createInternalAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalIdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalIdentifiableElement
	 * @generated
	 */
	public Adapter createInternalIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElement
	 * @generated
	 */
	public Adapter createInternalModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalNode
	 * @generated
	 */
	public Adapter createInternalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElementContainer <em>Model Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElementContainer
	 * @generated
	 */
	public Adapter createInternalModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalContainer
	 * @generated
	 */
	public Adapter createInternalContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalEdge
	 * @generated
	 */
	public Adapter createInternalEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalGraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalGraphModel
	 * @generated
	 */
	public Adapter createInternalGraphModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalType
	 * @generated
	 */
	public Adapter createInternalTypeAdapter() {
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

} //InternalAdapterFactory
