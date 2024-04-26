/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartPackageImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl;

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
	private EClass internalRegionRefEClass = null;

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
	private EClass internalInitialSuperStateEClass = null;

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
	private EClass internalInitialFinalSuperStateEClass = null;

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
	private EClass internalSuspensionEClass = null;

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
	private EClass internalInitialFinalStateEClass = null;

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
	private EClass internalInitialFinalSCChartRefereceEClass = null;

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
	private EClass internalTerminationTransitionEClass = null;

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
	private EClass internalDeferredTransitionEClass = null;

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
	private EClass internalTerminationDeferredTransitionEClass = null;

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
	private EClass internalTerminationHistoryTransitionEClass = null;

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
	private EClass internalDeferredHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStrongAbortDeferredHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTerminationDeferredHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSCChartEClass = null;

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
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#eNS_URI
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
	public EAttribute getInternalRootState_GeneratorOutput() {
        return (EAttribute)getInternalRootState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRootState_Name() {
        return (EAttribute)getInternalRootState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRootState_Label() {
        return (EAttribute)getInternalRootState().getEStructuralFeatures().get(2);
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
	public EOperation getInternalRootState__GetInitialSuperStateSuccessors() {
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
	public EOperation getInternalRootState__GetInitialFinalSuperStateSuccessors() {
        return getInternalRootState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetSimpleStateSuccessors() {
        return getInternalRootState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitialStateSuccessors() {
        return getInternalRootState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetFinalStateSuccessors() {
        return getInternalRootState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitialFinalStateSuccessors() {
        return getInternalRootState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetConnectorSuccessors() {
        return getInternalRootState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetSCChartRefereceSuccessors() {
        return getInternalRootState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitialSCChartRefereceSuccessors() {
        return getInternalRootState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetFinalSCChartRefereceSuccessors() {
        return getInternalRootState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalRootState().getEOperations().get(14);
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
	public EClass getInternalRegionRef() {
		if (internalRegionRefEClass == null) {
			internalRegionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(2);
		}
		return internalRegionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRegionRef__GetContainmentConstraints() {
        return getInternalRegionRef().getEOperations().get(0);
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
	public EOperation getInternalSuperState__GetInitialSuperStatePredecessors() {
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
	public EOperation getInternalSuperState__GetInitialFinalSuperStatePredecessors() {
        return getInternalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSimpleStatePredecessors() {
        return getInternalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialStatePredecessors() {
        return getInternalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalStatePredecessors() {
        return getInternalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialFinalStatePredecessors() {
        return getInternalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetConnectorPredecessors() {
        return getInternalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSCChartReferecePredecessors() {
        return getInternalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialSCChartReferecePredecessors() {
        return getInternalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalSCChartReferecePredecessors() {
        return getInternalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialFinalSuperStateSuccessors() {
        return getInternalSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSimpleStateSuccessors() {
        return getInternalSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialStateSuccessors() {
        return getInternalSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalStateSuccessors() {
        return getInternalSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialFinalStateSuccessors() {
        return getInternalSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetConnectorSuccessors() {
        return getInternalSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetSCChartRefereceSuccessors() {
        return getInternalSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialSCChartRefereceSuccessors() {
        return getInternalSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetFinalSCChartRefereceSuccessors() {
        return getInternalSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialSuperState() {
		if (internalInitialSuperStateEClass == null) {
			internalInitialSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(4);
		}
		return internalInitialSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetContainmentConstraints() {
        return getInternalInitialSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetIncomingConstraints() {
        return getInternalInitialSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetOutgoingConstraints() {
        return getInternalInitialSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetRootStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetSuperStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialSuperStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetFinalSuperStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialFinalSuperStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetSimpleStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetFinalStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialFinalStatePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetConnectorPredecessors() {
        return getInternalInitialSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetSCChartReferecePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialSCChartReferecePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetFinalSCChartReferecePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalInitialSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetSuperStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialSuperStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetFinalSuperStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialFinalSuperStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetSimpleStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetFinalStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialFinalStateSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetConnectorSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetSCChartRefereceSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialSCChartRefereceSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetFinalSCChartRefereceSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSuperState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalInitialSuperState().getEOperations().get(29);
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
	public EOperation getInternalFinalSuperState__GetInitialSuperStatePredecessors() {
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
	public EOperation getInternalFinalSuperState__GetInitialFinalSuperStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSimpleStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialFinalStatePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetConnectorPredecessors() {
        return getInternalFinalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSCChartReferecePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialSCChartReferecePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalSCChartReferecePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalFinalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialFinalSuperStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSimpleStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialFinalStateSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetConnectorSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetSCChartRefereceSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialSCChartRefereceSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetFinalSCChartRefereceSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSuperState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalFinalSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialFinalSuperState() {
		if (internalInitialFinalSuperStateEClass == null) {
			internalInitialFinalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(6);
		}
		return internalInitialFinalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetContainmentConstraints() {
        return getInternalInitialFinalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetIncomingConstraints() {
        return getInternalInitialFinalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetOutgoingConstraints() {
        return getInternalInitialFinalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetRootStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetSuperStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialSuperStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetFinalSuperStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialFinalSuperStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetSimpleStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetFinalStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialFinalStatePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetConnectorPredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetSCChartReferecePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialSCChartReferecePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetFinalSCChartReferecePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetSuperStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialSuperStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetFinalSuperStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialFinalSuperStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetSimpleStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetFinalStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialFinalStateSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetConnectorSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetSCChartRefereceSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialSCChartRefereceSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetFinalSCChartRefereceSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSuperState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalInitialFinalSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDeclaration() {
		if (internalDeclarationEClass == null) {
			internalDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(7);
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
	public EClass getInternalSuspension() {
		if (internalSuspensionEClass == null) {
			internalSuspensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(8);
		}
		return internalSuspensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuspension_SuspensionType() {
        return (EAttribute)getInternalSuspension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuspension_Condition() {
        return (EAttribute)getInternalSuspension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuspension_Uuid() {
        return (EAttribute)getInternalSuspension().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAction() {
		if (internalActionEClass == null) {
			internalActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(9);
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
			internalSimpleStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(10);
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
	public EOperation getInternalSimpleState__GetInitialSuperStatePredecessors() {
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
	public EOperation getInternalSimpleState__GetInitialFinalSuperStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSimpleStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialFinalStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetConnectorPredecessors() {
        return getInternalSimpleState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSCChartReferecePredecessors() {
        return getInternalSimpleState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialSCChartReferecePredecessors() {
        return getInternalSimpleState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalSCChartReferecePredecessors() {
        return getInternalSimpleState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalSimpleState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialFinalSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSimpleStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialFinalStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetConnectorSuccessors() {
        return getInternalSimpleState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSCChartRefereceSuccessors() {
        return getInternalSimpleState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialSCChartRefereceSuccessors() {
        return getInternalSimpleState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalSCChartRefereceSuccessors() {
        return getInternalSimpleState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalSimpleState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialState() {
		if (internalInitialStateEClass == null) {
			internalInitialStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(11);
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
	public EOperation getInternalInitialState__GetInitialSuperStatePredecessors() {
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
	public EOperation getInternalInitialState__GetInitialFinalSuperStatePredecessors() {
        return getInternalInitialState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSimpleStatePredecessors() {
        return getInternalInitialState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialStatePredecessors() {
        return getInternalInitialState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalStatePredecessors() {
        return getInternalInitialState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialFinalStatePredecessors() {
        return getInternalInitialState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetConnectorPredecessors() {
        return getInternalInitialState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSCChartReferecePredecessors() {
        return getInternalInitialState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialSCChartReferecePredecessors() {
        return getInternalInitialState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalSCChartReferecePredecessors() {
        return getInternalInitialState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalInitialState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialFinalSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSimpleStateSuccessors() {
        return getInternalInitialState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialStateSuccessors() {
        return getInternalInitialState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalStateSuccessors() {
        return getInternalInitialState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialFinalStateSuccessors() {
        return getInternalInitialState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetConnectorSuccessors() {
        return getInternalInitialState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSCChartRefereceSuccessors() {
        return getInternalInitialState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialSCChartRefereceSuccessors() {
        return getInternalInitialState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalSCChartRefereceSuccessors() {
        return getInternalInitialState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalInitialState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFinalState() {
		if (internalFinalStateEClass == null) {
			internalFinalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(12);
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
	public EOperation getInternalFinalState__GetInitialSuperStatePredecessors() {
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
	public EOperation getInternalFinalState__GetInitialFinalSuperStatePredecessors() {
        return getInternalFinalState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSimpleStatePredecessors() {
        return getInternalFinalState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialStatePredecessors() {
        return getInternalFinalState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalStatePredecessors() {
        return getInternalFinalState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialFinalStatePredecessors() {
        return getInternalFinalState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetConnectorPredecessors() {
        return getInternalFinalState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSCChartReferecePredecessors() {
        return getInternalFinalState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialSCChartReferecePredecessors() {
        return getInternalFinalState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalSCChartReferecePredecessors() {
        return getInternalFinalState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalFinalState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialFinalSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSimpleStateSuccessors() {
        return getInternalFinalState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialStateSuccessors() {
        return getInternalFinalState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalStateSuccessors() {
        return getInternalFinalState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialFinalStateSuccessors() {
        return getInternalFinalState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetConnectorSuccessors() {
        return getInternalFinalState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSCChartRefereceSuccessors() {
        return getInternalFinalState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialSCChartRefereceSuccessors() {
        return getInternalFinalState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalSCChartRefereceSuccessors() {
        return getInternalFinalState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalFinalState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialFinalState() {
		if (internalInitialFinalStateEClass == null) {
			internalInitialFinalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(13);
		}
		return internalInitialFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetIncomingConstraints() {
        return getInternalInitialFinalState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetOutgoingConstraints() {
        return getInternalInitialFinalState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetRootStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetSuperStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialSuperStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetFinalSuperStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialFinalSuperStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetSimpleStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetFinalStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialFinalStatePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetConnectorPredecessors() {
        return getInternalInitialFinalState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetSCChartReferecePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialSCChartReferecePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetFinalSCChartReferecePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalInitialFinalState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetSuperStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialSuperStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetFinalSuperStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialFinalSuperStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetSimpleStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetFinalStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialFinalStateSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetConnectorSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetSCChartRefereceSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialSCChartRefereceSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetFinalSCChartRefereceSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalState__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalInitialFinalState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConnector() {
		if (internalConnectorEClass == null) {
			internalConnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(14);
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
	public EOperation getInternalConnector__GetInitialSuperStatePredecessors() {
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
	public EOperation getInternalConnector__GetInitialFinalSuperStatePredecessors() {
        return getInternalConnector().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSimpleStatePredecessors() {
        return getInternalConnector().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialStatePredecessors() {
        return getInternalConnector().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalStatePredecessors() {
        return getInternalConnector().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialFinalStatePredecessors() {
        return getInternalConnector().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetConnectorPredecessors() {
        return getInternalConnector().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSCChartReferecePredecessors() {
        return getInternalConnector().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialSCChartReferecePredecessors() {
        return getInternalConnector().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalSCChartReferecePredecessors() {
        return getInternalConnector().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalConnector().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialFinalSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSimpleStateSuccessors() {
        return getInternalConnector().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialStateSuccessors() {
        return getInternalConnector().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalStateSuccessors() {
        return getInternalConnector().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialFinalStateSuccessors() {
        return getInternalConnector().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetConnectorSuccessors() {
        return getInternalConnector().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSCChartRefereceSuccessors() {
        return getInternalConnector().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialSCChartRefereceSuccessors() {
        return getInternalConnector().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalSCChartRefereceSuccessors() {
        return getInternalConnector().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalConnector().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSCChartReferece() {
		if (internalSCChartRefereceEClass == null) {
			internalSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(15);
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
	public EAttribute getInternalSCChartReferece_InputsOutputsOfRef() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_Label() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChartReferece_LibraryComponentUID() {
        return (EAttribute)getInternalSCChartReferece().getEStructuralFeatures().get(4);
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
	public EOperation getInternalSCChartReferece__GetIncomingConstraints() {
        return getInternalSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetOutgoingConstraints() {
        return getInternalSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetRootStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetSuperStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialSuperStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetFinalSuperStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialFinalSuperStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetSimpleStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetFinalStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialFinalStatePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetConnectorPredecessors() {
        return getInternalSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetSCChartReferecePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialSCChartReferecePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetFinalSCChartReferecePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetSuperStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialSuperStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetFinalSuperStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialFinalSuperStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetSimpleStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetFinalStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialFinalStateSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetConnectorSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetSCChartRefereceSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialSCChartRefereceSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetFinalSCChartRefereceSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChartReferece__GetReference() {
        return getInternalSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialSCChartReferece() {
		if (internalInitialSCChartRefereceEClass == null) {
			internalInitialSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(16);
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
	public EOperation getInternalInitialSCChartReferece__GetIncomingConstraints() {
        return getInternalInitialSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetOutgoingConstraints() {
        return getInternalInitialSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetRootStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetSuperStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialSuperStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetFinalSuperStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialFinalSuperStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetSimpleStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetFinalStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialFinalStatePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetConnectorPredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetSCChartReferecePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialSCChartReferecePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetFinalSCChartReferecePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetSuperStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialSuperStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetFinalSuperStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialFinalSuperStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetSimpleStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetFinalStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialFinalStateSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetConnectorSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetSCChartRefereceSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialSCChartRefereceSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetFinalSCChartRefereceSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalInitialSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialSCChartReferece__GetReference() {
        return getInternalInitialSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFinalSCChartReferece() {
		if (internalFinalSCChartRefereceEClass == null) {
			internalFinalSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(17);
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
	public EOperation getInternalFinalSCChartReferece__GetIncomingConstraints() {
        return getInternalFinalSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetOutgoingConstraints() {
        return getInternalFinalSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetRootStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetSuperStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialSuperStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetFinalSuperStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialFinalSuperStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetSimpleStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetFinalStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialFinalStatePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetConnectorPredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetSCChartReferecePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialSCChartReferecePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetFinalSCChartReferecePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetSuperStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialSuperStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetFinalSuperStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialFinalSuperStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetSimpleStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetFinalStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialFinalStateSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetConnectorSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetSCChartRefereceSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialSCChartRefereceSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetFinalSCChartRefereceSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalFinalSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalSCChartReferece__GetReference() {
        return getInternalFinalSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialFinalSCChartReferece() {
		if (internalInitialFinalSCChartRefereceEClass == null) {
			internalInitialFinalSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(18);
		}
		return internalInitialFinalSCChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetContainmentConstraints() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetIncomingConstraints() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetOutgoingConstraints() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetRootStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetSuperStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialSuperStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetFinalSuperStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSuperStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetSimpleStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetFinalStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalStatePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetConnectorPredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetSCChartReferecePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialSCChartReferecePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetFinalSCChartReferecePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSCChartReferecePredecessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetSuperStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialSuperStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetFinalSuperStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSuperStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetSimpleStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetFinalStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalStateSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetConnectorSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetSCChartRefereceSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialSCChartRefereceSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetFinalSCChartRefereceSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSCChartRefereceSuccessors() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialFinalSCChartReferece__GetReference() {
        return getInternalInitialFinalSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAbstractTransition() {
		if (internalAbstractTransitionEClass == null) {
			internalAbstractTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(19);
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
			internalTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(20);
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
	public EAttribute getInternalTransition_Immediate() {
        return (EAttribute)getInternalTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTransition_Effect() {
        return (EAttribute)getInternalTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationTransition() {
		if (internalTerminationTransitionEClass == null) {
			internalTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(21);
		}
		return internalTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationTransition_Condition() {
        return (EAttribute)getInternalTerminationTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationTransition_Count_delay() {
        return (EAttribute)getInternalTerminationTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationTransition_Immediate() {
        return (EAttribute)getInternalTerminationTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationTransition_Effect() {
        return (EAttribute)getInternalTerminationTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortTransition() {
		if (internalStrongAbortTransitionEClass == null) {
			internalStrongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(22);
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
	public EAttribute getInternalStrongAbortTransition_Immediate() {
        return (EAttribute)getInternalStrongAbortTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortTransition_Effect() {
        return (EAttribute)getInternalStrongAbortTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDeferredTransition() {
		if (internalDeferredTransitionEClass == null) {
			internalDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(23);
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
	public EAttribute getInternalDeferredTransition_Immediate() {
        return (EAttribute)getInternalDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredTransition_Effect() {
        return (EAttribute)getInternalDeferredTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalHistoryTransition() {
		if (internalHistoryTransitionEClass == null) {
			internalHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(24);
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
	public EAttribute getInternalHistoryTransition_Immediate() {
        return (EAttribute)getInternalHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalHistoryTransition_Effect() {
        return (EAttribute)getInternalHistoryTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationDeferredTransition() {
		if (internalTerminationDeferredTransitionEClass == null) {
			internalTerminationDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(25);
		}
		return internalTerminationDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredTransition_Condition() {
        return (EAttribute)getInternalTerminationDeferredTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredTransition_Count_delay() {
        return (EAttribute)getInternalTerminationDeferredTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredTransition_Immediate() {
        return (EAttribute)getInternalTerminationDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredTransition_Effect() {
        return (EAttribute)getInternalTerminationDeferredTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortDeferredTransition() {
		if (internalStrongAbortDeferredTransitionEClass == null) {
			internalStrongAbortDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(26);
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
	public EAttribute getInternalStrongAbortDeferredTransition_Immediate() {
        return (EAttribute)getInternalStrongAbortDeferredTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredTransition_Effect() {
        return (EAttribute)getInternalStrongAbortDeferredTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationHistoryTransition() {
		if (internalTerminationHistoryTransitionEClass == null) {
			internalTerminationHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(27);
		}
		return internalTerminationHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_Condition() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_Count_delay() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_Immediate() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationHistoryTransition_Effect() {
        return (EAttribute)getInternalTerminationHistoryTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortHistoryTransition() {
		if (internalStrongAbortHistoryTransitionEClass == null) {
			internalStrongAbortHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(28);
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
	public EAttribute getInternalStrongAbortHistoryTransition_Immediate() {
        return (EAttribute)getInternalStrongAbortHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortHistoryTransition_Effect() {
        return (EAttribute)getInternalStrongAbortHistoryTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDeferredHistoryTransition() {
		if (internalDeferredHistoryTransitionEClass == null) {
			internalDeferredHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(29);
		}
		return internalDeferredHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredHistoryTransition_Condition() {
        return (EAttribute)getInternalDeferredHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredHistoryTransition_Count_delay() {
        return (EAttribute)getInternalDeferredHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalDeferredHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredHistoryTransition_Immediate() {
        return (EAttribute)getInternalDeferredHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDeferredHistoryTransition_Effect() {
        return (EAttribute)getInternalDeferredHistoryTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortDeferredHistoryTransition() {
		if (internalStrongAbortDeferredHistoryTransitionEClass == null) {
			internalStrongAbortDeferredHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(30);
		}
		return internalStrongAbortDeferredHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredHistoryTransition_Condition() {
        return (EAttribute)getInternalStrongAbortDeferredHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredHistoryTransition_Count_delay() {
        return (EAttribute)getInternalStrongAbortDeferredHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalStrongAbortDeferredHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredHistoryTransition_Immediate() {
        return (EAttribute)getInternalStrongAbortDeferredHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalStrongAbortDeferredHistoryTransition_Effect() {
        return (EAttribute)getInternalStrongAbortDeferredHistoryTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTerminationDeferredHistoryTransition() {
		if (internalTerminationDeferredHistoryTransitionEClass == null) {
			internalTerminationDeferredHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(31);
		}
		return internalTerminationDeferredHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredHistoryTransition_Condition() {
        return (EAttribute)getInternalTerminationDeferredHistoryTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredHistoryTransition_Count_delay() {
        return (EAttribute)getInternalTerminationDeferredHistoryTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredHistoryTransition_DeepHistory() {
        return (EAttribute)getInternalTerminationDeferredHistoryTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredHistoryTransition_Immediate() {
        return (EAttribute)getInternalTerminationDeferredHistoryTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTerminationDeferredHistoryTransition_Effect() {
        return (EAttribute)getInternalTerminationDeferredHistoryTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSCChart() {
		if (internalSCChartEClass == null) {
			internalSCChartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(32);
		}
		return internalSCChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSCChart_Name() {
        return (EAttribute)getInternalSCChart().getEStructuralFeatures().get(0);
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.mglid.scchart.internal." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InternalPackageImpl
