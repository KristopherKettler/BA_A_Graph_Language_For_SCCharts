/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.scchart.impl.ScchartPackageImpl;

import info.scce.cinco.product.scchart.scchart.internal.InternalFactory;
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalPackageImpl extends EPackageImpl implements InternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRootStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalDataFlowRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInitilalSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFinalSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSuspendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSimpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInitialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalCircuitConnecterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSCChartRefereceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInitialSCChartRefereceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFinalSCChartRefereceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalAbstractTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConditionalTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStrongAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateStrongAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTerminationDefferdTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConditionalTerminationDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStrongAbortDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateStrongAbortDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTerminationHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConditionalTerminationHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStrongAbortHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateStrongAbortHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSCChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalAssignmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalPackageImpl() {
		super(eNS_URI, InternalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InternalPackage init() {
		if (isInited) return (InternalPackage)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInternalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InternalPackageImpl theInternalPackage = registeredInternalPackage instanceof InternalPackageImpl ? (InternalPackageImpl)registeredInternalPackage : new InternalPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI);
		ScchartPackageImpl theScchartPackage = (ScchartPackageImpl)(registeredPackage instanceof ScchartPackageImpl ? registeredPackage : ScchartPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Load packages
		theScchartPackage.loadPackage();

		// Fix loaded packages
		theInternalPackage.fixPackageContents();
		theScchartPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalPackage.eNS_URI, theInternalPackage);
		return theInternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalRootState() {
		if (internalRootStateEClass == null) {
			internalRootStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(0);
		}
		return internalRootStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRootState_Name() {
        return (EAttribute)getInternalRootState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRootState_Label() {
        return (EAttribute)getInternalRootState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetContainmentConstraints() {
        return getInternalRootState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetOutgoingConstraints() {
        return getInternalRootState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetSuperStateSuccessors() {
        return getInternalRootState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitilalSuperStateSuccessors() {
        return getInternalRootState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetFinalSuperStateSuccessors() {
        return getInternalRootState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetSimpleStateSuccessors() {
        return getInternalRootState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitialStateSuccessors() {
        return getInternalRootState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetFinalStateSuccessors() {
        return getInternalRootState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetConnectorSuccessors() {
        return getInternalRootState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetOutputSuccessors() {
        return getInternalRootState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetOperatorSuccessors() {
        return getInternalRootState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetCircuitConnecterSuccessors() {
        return getInternalRootState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalRegion() {
		if (internalRegionEClass == null) {
			internalRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(1);
		}
		return internalRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRegion_Name() {
        return (EAttribute)getInternalRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRegion_Label() {
        return (EAttribute)getInternalRegion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRegion_Uuid() {
        return (EAttribute)getInternalRegion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRegion__GetContainmentConstraints() {
        return getInternalRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDataFlowRegion() {
		if (internalDataFlowRegionEClass == null) {
			internalDataFlowRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(2);
		}
		return internalDataFlowRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDataFlowRegion__GetContainmentConstraints() {
        return getInternalDataFlowRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSuperState() {
		if (internalSuperStateEClass == null) {
			internalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(3);
		}
		return internalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperState_Name() {
        return (EAttribute)getInternalSuperState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperState_Label() {
        return (EAttribute)getInternalSuperState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperState_InputsOutputs() {
        return (EAttribute)getInternalSuperState().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetContainmentConstraints() {
        return getInternalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetIncomingConstraints() {
        return getInternalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetOutgoingConstraints() {
        return getInternalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetRootStatePredecessors() {
        return getInternalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSuperStatePredecessors() {
        return getInternalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitilalSuperStatePredecessors() {
        return getInternalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalSuperStatePredecessors() {
        return getInternalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSimpleStatePredecessors() {
        return getInternalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialStatePredecessors() {
        return getInternalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalStatePredecessors() {
        return getInternalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetConnectorPredecessors() {
        return getInternalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitilalSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSimpleStateSuccessors() {
        return getInternalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialStateSuccessors() {
        return getInternalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalStateSuccessors() {
        return getInternalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetConnectorSuccessors() {
        return getInternalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitilalSuperState() {
		if (internalInitilalSuperStateEClass == null) {
			internalInitilalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(4);
		}
		return internalInitilalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetContainmentConstraints() {
        return getInternalInitilalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetIncomingConstraints() {
        return getInternalInitilalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetOutgoingConstraints() {
        return getInternalInitilalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetRootStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetSuperStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetInitilalSuperStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetFinalSuperStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetSimpleStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetInitialStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetFinalStatePredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetConnectorPredecessors() {
        return getInternalInitilalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetSuperStateSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetInitilalSuperStateSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetFinalSuperStateSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetSimpleStateSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetInitialStateSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetFinalStateSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSuperState__GetConnectorSuccessors() {
        return getInternalInitilalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFinalSuperState() {
		if (internalFinalSuperStateEClass == null) {
			internalFinalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(5);
		}
		return internalFinalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetContainmentConstraints() {
        return getInternalFinalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetIncomingConstraints() {
        return getInternalFinalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetOutgoingConstraints() {
        return getInternalFinalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetRootStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSuperStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitilalSuperStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalSuperStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSimpleStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetConnectorPredecessors() {
        return getInternalFinalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitilalSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSimpleStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetConnectorSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDeclaration() {
		if (internalDeclarationEClass == null) {
			internalDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(6);
		}
		return internalDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_DeclarationType() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_Constant() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_InputOutput() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_Assignment() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_Name() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_Signal() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeclaration_Uuid() {
        return (EAttribute)getInternalDeclaration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSuspend() {
		if (internalSuspendEClass == null) {
			internalSuspendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(7);
		}
		return internalSuspendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuspend_Condition() {
        return (EAttribute)getInternalSuspend().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuspend_SuspendType() {
        return (EAttribute)getInternalSuspend().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuspend_Uuid() {
        return (EAttribute)getInternalSuspend().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAction() {
		if (internalActionEClass == null) {
			internalActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(8);
		}
		return internalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalAction_ActionType() {
        return (EAttribute)getInternalAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalAction_Condition() {
        return (EAttribute)getInternalAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalAction_Effect() {
        return (EAttribute)getInternalAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalAction_Uuid() {
        return (EAttribute)getInternalAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSimpleState() {
		if (internalSimpleStateEClass == null) {
			internalSimpleStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(9);
		}
		return internalSimpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSimpleState_Name() {
        return (EAttribute)getInternalSimpleState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSimpleState_Label() {
        return (EAttribute)getInternalSimpleState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetIncomingConstraints() {
        return getInternalSimpleState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetOutgoingConstraints() {
        return getInternalSimpleState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetRootStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSuperStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitilalSuperStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalSuperStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSimpleStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetConnectorPredecessors() {
        return getInternalSimpleState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitilalSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSimpleStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetConnectorSuccessors() {
        return getInternalSimpleState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialState() {
		if (internalInitialStateEClass == null) {
			internalInitialStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(10);
		}
		return internalInitialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetIncomingConstraints() {
        return getInternalInitialState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetOutgoingConstraints() {
        return getInternalInitialState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetRootStatePredecessors() {
        return getInternalInitialState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSuperStatePredecessors() {
        return getInternalInitialState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitilalSuperStatePredecessors() {
        return getInternalInitialState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalSuperStatePredecessors() {
        return getInternalInitialState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSimpleStatePredecessors() {
        return getInternalInitialState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialStatePredecessors() {
        return getInternalInitialState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalStatePredecessors() {
        return getInternalInitialState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetConnectorPredecessors() {
        return getInternalInitialState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitilalSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSimpleStateSuccessors() {
        return getInternalInitialState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialStateSuccessors() {
        return getInternalInitialState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalStateSuccessors() {
        return getInternalInitialState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetConnectorSuccessors() {
        return getInternalInitialState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFinalState() {
		if (internalFinalStateEClass == null) {
			internalFinalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(11);
		}
		return internalFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetIncomingConstraints() {
        return getInternalFinalState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetOutgoingConstraints() {
        return getInternalFinalState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetRootStatePredecessors() {
        return getInternalFinalState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSuperStatePredecessors() {
        return getInternalFinalState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitilalSuperStatePredecessors() {
        return getInternalFinalState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalSuperStatePredecessors() {
        return getInternalFinalState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSimpleStatePredecessors() {
        return getInternalFinalState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialStatePredecessors() {
        return getInternalFinalState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalStatePredecessors() {
        return getInternalFinalState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetConnectorPredecessors() {
        return getInternalFinalState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitilalSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSimpleStateSuccessors() {
        return getInternalFinalState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialStateSuccessors() {
        return getInternalFinalState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalStateSuccessors() {
        return getInternalFinalState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetConnectorSuccessors() {
        return getInternalFinalState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConnector() {
		if (internalConnectorEClass == null) {
			internalConnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(12);
		}
		return internalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetIncomingConstraints() {
        return getInternalConnector().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetOutgoingConstraints() {
        return getInternalConnector().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetRootStatePredecessors() {
        return getInternalConnector().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSuperStatePredecessors() {
        return getInternalConnector().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitilalSuperStatePredecessors() {
        return getInternalConnector().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalSuperStatePredecessors() {
        return getInternalConnector().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSimpleStatePredecessors() {
        return getInternalConnector().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialStatePredecessors() {
        return getInternalConnector().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalStatePredecessors() {
        return getInternalConnector().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetConnectorPredecessors() {
        return getInternalConnector().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitilalSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSimpleStateSuccessors() {
        return getInternalConnector().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialStateSuccessors() {
        return getInternalConnector().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalStateSuccessors() {
        return getInternalConnector().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetConnectorSuccessors() {
        return getInternalConnector().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInput() {
		if (internalInputEClass == null) {
			internalInputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(13);
		}
		return internalInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalInput_Label() {
        return (EAttribute)getInternalInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInput__GetOutgoingConstraints() {
        return getInternalInput().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInput__GetOutputSuccessors() {
        return getInternalInput().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInput__GetOperatorSuccessors() {
        return getInternalInput().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInput__GetCircuitConnecterSuccessors() {
        return getInternalInput().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalOutput() {
		if (internalOutputEClass == null) {
			internalOutputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(14);
		}
		return internalOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalOutput_Label() {
        return (EAttribute)getInternalOutput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOutput__GetIncomingConstraints() {
        return getInternalOutput().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOutput__GetRootStatePredecessors() {
        return getInternalOutput().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOutput__GetInputPredecessors() {
        return getInternalOutput().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOutput__GetOperatorPredecessors() {
        return getInternalOutput().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOutput__GetCircuitConnecterPredecessors() {
        return getInternalOutput().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalOperator() {
		if (internalOperatorEClass == null) {
			internalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(15);
		}
		return internalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalOperator_Operator() {
        return (EAttribute)getInternalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetIncomingConstraints() {
        return getInternalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetOutgoingConstraints() {
        return getInternalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetRootStatePredecessors() {
        return getInternalOperator().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetInputPredecessors() {
        return getInternalOperator().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetOperatorPredecessors() {
        return getInternalOperator().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetCircuitConnecterPredecessors() {
        return getInternalOperator().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetOutputSuccessors() {
        return getInternalOperator().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetOperatorSuccessors() {
        return getInternalOperator().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalOperator__GetCircuitConnecterSuccessors() {
        return getInternalOperator().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalCircuitConnecter() {
		if (internalCircuitConnecterEClass == null) {
			internalCircuitConnecterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(16);
		}
		return internalCircuitConnecterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetIncomingConstraints() {
        return getInternalCircuitConnecter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetOutgoingConstraints() {
        return getInternalCircuitConnecter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetRootStatePredecessors() {
        return getInternalCircuitConnecter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetInputPredecessors() {
        return getInternalCircuitConnecter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetOperatorPredecessors() {
        return getInternalCircuitConnecter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetCircuitConnecterPredecessors() {
        return getInternalCircuitConnecter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetOutputSuccessors() {
        return getInternalCircuitConnecter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetOperatorSuccessors() {
        return getInternalCircuitConnecter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCircuitConnecter__GetCircuitConnecterSuccessors() {
        return getInternalCircuitConnecter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSCChartReferece() {
		if (internalSCChartRefereceEClass == null) {
			internalSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(17);
		}
		return internalSCChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_Assignments() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_Name() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_Label() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_InputsOutputs() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_Uuid() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_LibraryComponentUID() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetContainmentConstraints() {
        return getInternalSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetReference() {
        return getInternalSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialSCChartReferece() {
		if (internalInitialSCChartRefereceEClass == null) {
			internalInitialSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(18);
		}
		return internalInitialSCChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetContainmentConstraints() {
        return getInternalInitialSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetReference() {
        return getInternalInitialSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFinalSCChartReferece() {
		if (internalFinalSCChartRefereceEClass == null) {
			internalFinalSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(19);
		}
		return internalFinalSCChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetContainmentConstraints() {
        return getInternalFinalSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetReference() {
        return getInternalFinalSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAbstractTransition() {
		if (internalAbstractTransitionEClass == null) {
			internalAbstractTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(20);
		}
		return internalAbstractTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalAbstractTransition_Priority() {
        return (EAttribute)getInternalAbstractTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTransition() {
		if (internalTransitionEClass == null) {
			internalTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(21);
		}
		return internalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTransition_Condition() {
        return (EAttribute)getInternalTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTransition_Count_delay() {
        return (EAttribute)getInternalTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTransition_Effect() {
        return (EAttribute)getInternalTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateTransition() {
		if (internalImmediateTransitionEClass == null) {
			internalImmediateTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(22);
		}
		return internalImmediateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_Condition() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_Count_delay() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_Effect() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationTransition() {
		if (internalTerminationTransitionEClass == null) {
			internalTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(23);
		}
		return internalTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationTransition_Effect() {
        return (EAttribute)getInternalTerminationTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConditionalTerminationTransition() {
		if (internalConditionalTerminationTransitionEClass == null) {
			internalConditionalTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(24);
		}
		return internalConditionalTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationTransition_Condition() {
        return (EAttribute)getInternalConditionalTerminationTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationTransition_Count_delay() {
        return (EAttribute)getInternalConditionalTerminationTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationTransition_Effect() {
        return (EAttribute)getInternalConditionalTerminationTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortTransition() {
		if (internalStrongAbortTransitionEClass == null) {
			internalStrongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(25);
		}
		return internalStrongAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortTransition_Condition() {
        return (EAttribute)getInternalStrongAbortTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortTransition_Count_delay() {
        return (EAttribute)getInternalStrongAbortTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortTransition_Effect() {
        return (EAttribute)getInternalStrongAbortTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateStrongAbortTransition() {
		if (internalImmediateStrongAbortTransitionEClass == null) {
			internalImmediateStrongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(26);
		}
		return internalImmediateStrongAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortTransition_Condition() {
        return (EAttribute)getInternalImmediateStrongAbortTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortTransition_Count_delay() {
        return (EAttribute)getInternalImmediateStrongAbortTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortTransition_Effect() {
        return (EAttribute)getInternalImmediateStrongAbortTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDeferredTransition() {
		if (internalDeferredTransitionEClass == null) {
			internalDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(27);
		}
		return internalDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredTransition_Condition() {
        return (EAttribute)getInternalDeferredTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredTransition_Count_delay() {
        return (EAttribute)getInternalDeferredTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredTransition_Effect() {
        return (EAttribute)getInternalDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateDeferredTransition() {
		if (internalImmediateDeferredTransitionEClass == null) {
			internalImmediateDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(28);
		}
		return internalImmediateDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateDeferredTransition_Condition() {
        return (EAttribute)getInternalImmediateDeferredTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateDeferredTransition_Count_delay() {
        return (EAttribute)getInternalImmediateDeferredTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateDeferredTransition_Effect() {
        return (EAttribute)getInternalImmediateDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationDefferdTransition() {
		if (internalTerminationDefferdTransitionEClass == null) {
			internalTerminationDefferdTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(29);
		}
		return internalTerminationDefferdTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDefferdTransition_Effect() {
        return (EAttribute)getInternalTerminationDefferdTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConditionalTerminationDeferredTransition() {
		if (internalConditionalTerminationDeferredTransitionEClass == null) {
			internalConditionalTerminationDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(30);
		}
		return internalConditionalTerminationDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationDeferredTransition_Condition() {
        return (EAttribute)getInternalConditionalTerminationDeferredTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationDeferredTransition_Count_delay() {
        return (EAttribute)getInternalConditionalTerminationDeferredTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationDeferredTransition_Effect() {
        return (EAttribute)getInternalConditionalTerminationDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortDeferredTransition() {
		if (internalStrongAbortDeferredTransitionEClass == null) {
			internalStrongAbortDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(31);
		}
		return internalStrongAbortDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredTransition_Condition() {
        return (EAttribute)getInternalStrongAbortDeferredTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredTransition_Count_delay() {
        return (EAttribute)getInternalStrongAbortDeferredTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredTransition_Effect() {
        return (EAttribute)getInternalStrongAbortDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateStrongAbortDeferredTransition() {
		if (internalImmediateStrongAbortDeferredTransitionEClass == null) {
			internalImmediateStrongAbortDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(32);
		}
		return internalImmediateStrongAbortDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortDeferredTransition_Condition() {
        return (EAttribute)getInternalImmediateStrongAbortDeferredTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortDeferredTransition_Count_delay() {
        return (EAttribute)getInternalImmediateStrongAbortDeferredTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortDeferredTransition_Effect() {
        return (EAttribute)getInternalImmediateStrongAbortDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalHistoryTransition() {
		if (internalHistoryTransitionEClass == null) {
			internalHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(33);
		}
		return internalHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalHistoryTransition_Condition() {
        return (EAttribute)getInternalHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalHistoryTransition_Count_delay() {
        return (EAttribute)getInternalHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalHistoryTransition_Effect() {
        return (EAttribute)getInternalHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateHistoryTransition() {
		if (internalImmediateHistoryTransitionEClass == null) {
			internalImmediateHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(34);
		}
		return internalImmediateHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateHistoryTransition_Condition() {
        return (EAttribute)getInternalImmediateHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateHistoryTransition_Count_delay() {
        return (EAttribute)getInternalImmediateHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalImmediateHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateHistoryTransition_Effect() {
        return (EAttribute)getInternalImmediateHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationHistoryTransition() {
		if (internalTerminationHistoryTransitionEClass == null) {
			internalTerminationHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(35);
		}
		return internalTerminationHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_Effect() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConditionalTerminationHistoryTransition() {
		if (internalConditionalTerminationHistoryTransitionEClass == null) {
			internalConditionalTerminationHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(36);
		}
		return internalConditionalTerminationHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationHistoryTransition_Condition() {
        return (EAttribute)getInternalConditionalTerminationHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationHistoryTransition_Count_delay() {
        return (EAttribute)getInternalConditionalTerminationHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalConditionalTerminationHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalConditionalTerminationHistoryTransition_Effect() {
        return (EAttribute)getInternalConditionalTerminationHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortHistoryTransition() {
		if (internalStrongAbortHistoryTransitionEClass == null) {
			internalStrongAbortHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(37);
		}
		return internalStrongAbortHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortHistoryTransition_Condition() {
        return (EAttribute)getInternalStrongAbortHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortHistoryTransition_Count_delay() {
        return (EAttribute)getInternalStrongAbortHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalStrongAbortHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortHistoryTransition_Effect() {
        return (EAttribute)getInternalStrongAbortHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateStrongAbortHistoryTransition() {
		if (internalImmediateStrongAbortHistoryTransitionEClass == null) {
			internalImmediateStrongAbortHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(38);
		}
		return internalImmediateStrongAbortHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortHistoryTransition_Condition() {
        return (EAttribute)getInternalImmediateStrongAbortHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortHistoryTransition_Count_delay() {
        return (EAttribute)getInternalImmediateStrongAbortHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalImmediateStrongAbortHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateStrongAbortHistoryTransition_Effect() {
        return (EAttribute)getInternalImmediateStrongAbortHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConnection() {
		if (internalConnectionEClass == null) {
			internalConnectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(39);
		}
		return internalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSCChart() {
		if (internalSCChartEClass == null) {
			internalSCChartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(40);
		}
		return internalSCChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChart__GetContainmentConstraints() {
        return getInternalSCChart().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAssignment() {
		if (internalAssignmentEClass == null) {
			internalAssignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(41);
		}
		return internalAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalAssignment_Assignment() {
        return (EAttribute)getInternalAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFactory getInternalFactory() {
		return (InternalFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.scchart.internal." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InternalPackageImpl
