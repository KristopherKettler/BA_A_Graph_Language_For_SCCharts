/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.*;

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
public class InternalFactoryImpl extends EFactoryImpl implements InternalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalFactory init() {
		try {
			InternalFactory theInternalFactory = (InternalFactory)EPackage.Registry.INSTANCE.getEFactory(InternalPackage.eNS_URI);
			if (theInternalFactory != null) {
				return theInternalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFactoryImpl() {
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
			case InternalPackage.INTERNAL_ROOT_STATE: return createInternalRootState();
			case InternalPackage.INTERNAL_REGION: return createInternalRegion();
			case InternalPackage.INTERNAL_REGION_REF: return createInternalRegionRef();
			case InternalPackage.INTERNAL_SUPER_STATE: return createInternalSuperState();
			case InternalPackage.INTERNAL_INITIAL_SUPER_STATE: return createInternalInitialSuperState();
			case InternalPackage.INTERNAL_FINAL_SUPER_STATE: return createInternalFinalSuperState();
			case InternalPackage.INTERNAL_INITIAL_FINAL_SUPER_STATE: return createInternalInitialFinalSuperState();
			case InternalPackage.INTERNAL_DECLARATION: return createInternalDeclaration();
			case InternalPackage.INTERNAL_SUSPENSION: return createInternalSuspension();
			case InternalPackage.INTERNAL_ACTION: return createInternalAction();
			case InternalPackage.INTERNAL_SIMPLE_STATE: return createInternalSimpleState();
			case InternalPackage.INTERNAL_INITIAL_STATE: return createInternalInitialState();
			case InternalPackage.INTERNAL_FINAL_STATE: return createInternalFinalState();
			case InternalPackage.INTERNAL_INITIAL_FINAL_STATE: return createInternalInitialFinalState();
			case InternalPackage.INTERNAL_CONNECTOR: return createInternalConnector();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE: return createInternalSCChartReferece();
			case InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE: return createInternalInitialSCChartReferece();
			case InternalPackage.INTERNAL_FINAL_SC_CHART_REFERECE: return createInternalFinalSCChartReferece();
			case InternalPackage.INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE: return createInternalInitialFinalSCChartReferece();
			case InternalPackage.INTERNAL_ABSTRACT_TRANSITION: return createInternalAbstractTransition();
			case InternalPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case InternalPackage.INTERNAL_TERMINATION_TRANSITION: return createInternalTerminationTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_TRANSITION: return createInternalStrongAbortTransition();
			case InternalPackage.INTERNAL_DEFERRED_TRANSITION: return createInternalDeferredTransition();
			case InternalPackage.INTERNAL_HISTORY_TRANSITION: return createInternalHistoryTransition();
			case InternalPackage.INTERNAL_TERMINATION_DEFERRED_TRANSITION: return createInternalTerminationDeferredTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION: return createInternalStrongAbortDeferredTransition();
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION: return createInternalTerminationHistoryTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_HISTORY_TRANSITION: return createInternalStrongAbortHistoryTransition();
			case InternalPackage.INTERNAL_DEFERRED_HISTORY_TRANSITION: return createInternalDeferredHistoryTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION: return createInternalStrongAbortDeferredHistoryTransition();
			case InternalPackage.INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION: return createInternalTerminationDeferredHistoryTransition();
			case InternalPackage.INTERNAL_SC_CHART: return createInternalSCChart();
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
	public InternalRootState createInternalRootState() {
		InternalRootStateImpl internalRootState = new InternalRootStateImpl();
		return internalRootState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRegion createInternalRegion() {
		InternalRegionImpl internalRegion = new InternalRegionImpl();
		return internalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRegionRef createInternalRegionRef() {
		InternalRegionRefImpl internalRegionRef = new InternalRegionRefImpl();
		return internalRegionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperState createInternalSuperState() {
		InternalSuperStateImpl internalSuperState = new InternalSuperStateImpl();
		return internalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialSuperState createInternalInitialSuperState() {
		InternalInitialSuperStateImpl internalInitialSuperState = new InternalInitialSuperStateImpl();
		return internalInitialSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSuperState createInternalFinalSuperState() {
		InternalFinalSuperStateImpl internalFinalSuperState = new InternalFinalSuperStateImpl();
		return internalFinalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialFinalSuperState createInternalInitialFinalSuperState() {
		InternalInitialFinalSuperStateImpl internalInitialFinalSuperState = new InternalInitialFinalSuperStateImpl();
		return internalInitialFinalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeclaration createInternalDeclaration() {
		InternalDeclarationImpl internalDeclaration = new InternalDeclarationImpl();
		return internalDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuspension createInternalSuspension() {
		InternalSuspensionImpl internalSuspension = new InternalSuspensionImpl();
		return internalSuspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAction createInternalAction() {
		InternalActionImpl internalAction = new InternalActionImpl();
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSimpleState createInternalSimpleState() {
		InternalSimpleStateImpl internalSimpleState = new InternalSimpleStateImpl();
		return internalSimpleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialState createInternalInitialState() {
		InternalInitialStateImpl internalInitialState = new InternalInitialStateImpl();
		return internalInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalState createInternalFinalState() {
		InternalFinalStateImpl internalFinalState = new InternalFinalStateImpl();
		return internalFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialFinalState createInternalInitialFinalState() {
		InternalInitialFinalStateImpl internalInitialFinalState = new InternalInitialFinalStateImpl();
		return internalInitialFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnector createInternalConnector() {
		InternalConnectorImpl internalConnector = new InternalConnectorImpl();
		return internalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSCChartReferece createInternalSCChartReferece() {
		InternalSCChartRefereceImpl internalSCChartReferece = new InternalSCChartRefereceImpl();
		return internalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialSCChartReferece createInternalInitialSCChartReferece() {
		InternalInitialSCChartRefereceImpl internalInitialSCChartReferece = new InternalInitialSCChartRefereceImpl();
		return internalInitialSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSCChartReferece createInternalFinalSCChartReferece() {
		InternalFinalSCChartRefereceImpl internalFinalSCChartReferece = new InternalFinalSCChartRefereceImpl();
		return internalFinalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialFinalSCChartReferece createInternalInitialFinalSCChartReferece() {
		InternalInitialFinalSCChartRefereceImpl internalInitialFinalSCChartReferece = new InternalInitialFinalSCChartRefereceImpl();
		return internalInitialFinalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAbstractTransition createInternalAbstractTransition() {
		InternalAbstractTransitionImpl internalAbstractTransition = new InternalAbstractTransitionImpl();
		return internalAbstractTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationTransition createInternalTerminationTransition() {
		InternalTerminationTransitionImpl internalTerminationTransition = new InternalTerminationTransitionImpl();
		return internalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortTransition createInternalStrongAbortTransition() {
		InternalStrongAbortTransitionImpl internalStrongAbortTransition = new InternalStrongAbortTransitionImpl();
		return internalStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeferredTransition createInternalDeferredTransition() {
		InternalDeferredTransitionImpl internalDeferredTransition = new InternalDeferredTransitionImpl();
		return internalDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalHistoryTransition createInternalHistoryTransition() {
		InternalHistoryTransitionImpl internalHistoryTransition = new InternalHistoryTransitionImpl();
		return internalHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationDeferredTransition createInternalTerminationDeferredTransition() {
		InternalTerminationDeferredTransitionImpl internalTerminationDeferredTransition = new InternalTerminationDeferredTransitionImpl();
		return internalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortDeferredTransition createInternalStrongAbortDeferredTransition() {
		InternalStrongAbortDeferredTransitionImpl internalStrongAbortDeferredTransition = new InternalStrongAbortDeferredTransitionImpl();
		return internalStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationHistoryTransition createInternalTerminationHistoryTransition() {
		InternalTerminationHistoryTransitionImpl internalTerminationHistoryTransition = new InternalTerminationHistoryTransitionImpl();
		return internalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortHistoryTransition createInternalStrongAbortHistoryTransition() {
		InternalStrongAbortHistoryTransitionImpl internalStrongAbortHistoryTransition = new InternalStrongAbortHistoryTransitionImpl();
		return internalStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeferredHistoryTransition createInternalDeferredHistoryTransition() {
		InternalDeferredHistoryTransitionImpl internalDeferredHistoryTransition = new InternalDeferredHistoryTransitionImpl();
		return internalDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortDeferredHistoryTransition createInternalStrongAbortDeferredHistoryTransition() {
		InternalStrongAbortDeferredHistoryTransitionImpl internalStrongAbortDeferredHistoryTransition = new InternalStrongAbortDeferredHistoryTransitionImpl();
		return internalStrongAbortDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationDeferredHistoryTransition createInternalTerminationDeferredHistoryTransition() {
		InternalTerminationDeferredHistoryTransitionImpl internalTerminationDeferredHistoryTransition = new InternalTerminationDeferredHistoryTransitionImpl();
		return internalTerminationDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSCChart createInternalSCChart() {
		InternalSCChartImpl internalSCChart = new InternalSCChartImpl();
		return internalSCChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPackage getInternalPackage() {
		return (InternalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalPackage getPackage() {
		return InternalPackage.eINSTANCE;
	}

} //InternalFactoryImpl
