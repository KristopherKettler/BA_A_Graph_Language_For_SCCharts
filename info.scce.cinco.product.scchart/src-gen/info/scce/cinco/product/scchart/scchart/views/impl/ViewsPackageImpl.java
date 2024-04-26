/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.scchart.impl.ScchartPackageImpl;

import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.scchart.scchart.views.ViewsFactory;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowRegionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initilalSuperStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalSuperStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitConnecterViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scChartRefereceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialSCChartRefereceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalSCChartRefereceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTerminationTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateStrongAbortTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deferredTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateDeferredTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationDefferdTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTerminationDeferredTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortDeferredTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateStrongAbortDeferredTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateHistoryTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationHistoryTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTerminationHistoryTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortHistoryTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateStrongAbortHistoryTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scChartViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentViewEClass = null;

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
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited) return (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewsPackageImpl theViewsPackage = registeredViewsPackage instanceof ViewsPackageImpl ? (ViewsPackageImpl)registeredViewsPackage : new ViewsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI);
		ScchartPackageImpl theScchartPackage = (ScchartPackageImpl)(registeredPackage instanceof ScchartPackageImpl ? registeredPackage : ScchartPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);

		// Load packages
		theScchartPackage.loadPackage();

		// Fix loaded packages
		theViewsPackage.fixPackageContents();
		theScchartPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootStateView() {
		if (rootStateViewEClass == null) {
			rootStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return rootStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRootStateView_InternalRootState() {
        return (EReference)getRootStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__GetName() {
        return getRootStateView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__SetName__String() {
        return getRootStateView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__GetLabel() {
        return getRootStateView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__SetLabel__String() {
        return getRootStateView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionView() {
		if (regionViewEClass == null) {
			regionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return regionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegionView_InternalRegion() {
        return (EReference)getRegionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegionView__GetName() {
        return getRegionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegionView__SetName__String() {
        return getRegionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegionView__GetLabel() {
        return getRegionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegionView__SetLabel__String() {
        return getRegionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegionView__GetUuid() {
        return getRegionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegionView__SetUuid__String() {
        return getRegionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFlowRegionView() {
		if (dataFlowRegionViewEClass == null) {
			dataFlowRegionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return dataFlowRegionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataFlowRegionView_InternalDataFlowRegion() {
        return (EReference)getDataFlowRegionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateView() {
		if (superStateViewEClass == null) {
			superStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return superStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperStateView_InternalSuperState() {
        return (EReference)getSuperStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__GetName() {
        return getSuperStateView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__SetName__String() {
        return getSuperStateView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__GetLabel() {
        return getSuperStateView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__SetLabel__String() {
        return getSuperStateView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__GetInputsOutputs() {
        return getSuperStateView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__SetInputsOutputs__EList() {
        return getSuperStateView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__AddInputsOutputs__String() {
        return getSuperStateView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateView__RemoveInputsOutputs__String() {
        return getSuperStateView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitilalSuperStateView() {
		if (initilalSuperStateViewEClass == null) {
			initilalSuperStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return initilalSuperStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitilalSuperStateView_InternalInitilalSuperState() {
        return (EReference)getInitilalSuperStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalSuperStateView() {
		if (finalSuperStateViewEClass == null) {
			finalSuperStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return finalSuperStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalSuperStateView_InternalFinalSuperState() {
        return (EReference)getFinalSuperStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclarationView() {
		if (declarationViewEClass == null) {
			declarationViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return declarationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationView_InternalDeclaration() {
        return (EReference)getDeclarationView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__GetDeclarationType() {
        return getDeclarationView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetDeclarationType__String() {
        return getDeclarationView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__IsConstant() {
        return getDeclarationView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetConstant__boolean() {
        return getDeclarationView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__GetInputOutput() {
        return getDeclarationView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetInputOutput__String() {
        return getDeclarationView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__GetAssignment() {
        return getDeclarationView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetAssignment__String() {
        return getDeclarationView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__GetName() {
        return getDeclarationView().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetName__String() {
        return getDeclarationView().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__IsSignal() {
        return getDeclarationView().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetSignal__boolean() {
        return getDeclarationView().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__GetUuid() {
        return getDeclarationView().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclarationView__SetUuid__String() {
        return getDeclarationView().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuspendView() {
		if (suspendViewEClass == null) {
			suspendViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return suspendViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuspendView_InternalSuspend() {
        return (EReference)getSuspendView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspendView__GetCondition() {
        return getSuspendView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspendView__SetCondition__String() {
        return getSuspendView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspendView__GetSuspendType() {
        return getSuspendView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspendView__SetSuspendType__String() {
        return getSuspendView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspendView__GetUuid() {
        return getSuspendView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspendView__SetUuid__String() {
        return getSuspendView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionView() {
		if (actionViewEClass == null) {
			actionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return actionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionView_InternalAction() {
        return (EReference)getActionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__GetActionType() {
        return getActionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__SetActionType__String() {
        return getActionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__GetCondition() {
        return getActionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__SetCondition__String() {
        return getActionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__GetEffect() {
        return getActionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__SetEffect__String() {
        return getActionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__GetUuid() {
        return getActionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionView__SetUuid__String() {
        return getActionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleStateView() {
		if (simpleStateViewEClass == null) {
			simpleStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return simpleStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleStateView_InternalSimpleState() {
        return (EReference)getSimpleStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleStateView__GetName() {
        return getSimpleStateView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleStateView__SetName__String() {
        return getSimpleStateView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleStateView__GetLabel() {
        return getSimpleStateView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleStateView__SetLabel__String() {
        return getSimpleStateView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialStateView() {
		if (initialStateViewEClass == null) {
			initialStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return initialStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialStateView_InternalInitialState() {
        return (EReference)getInitialStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalStateView() {
		if (finalStateViewEClass == null) {
			finalStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return finalStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalStateView_InternalFinalState() {
        return (EReference)getFinalStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorView() {
		if (connectorViewEClass == null) {
			connectorViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return connectorViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorView_InternalConnector() {
        return (EReference)getConnectorView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputView() {
		if (inputViewEClass == null) {
			inputViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return inputViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputView_InternalInput() {
        return (EReference)getInputView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__GetLabel() {
        return getInputView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__SetLabel__String() {
        return getInputView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputView() {
		if (outputViewEClass == null) {
			outputViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return outputViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputView_InternalOutput() {
        return (EReference)getOutputView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutputView__GetLabel() {
        return getOutputView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutputView__SetLabel__String() {
        return getOutputView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatorView() {
		if (operatorViewEClass == null) {
			operatorViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return operatorViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorView_InternalOperator() {
        return (EReference)getOperatorView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperatorView__GetOperator() {
        return getOperatorView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperatorView__SetOperator__String() {
        return getOperatorView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircuitConnecterView() {
		if (circuitConnecterViewEClass == null) {
			circuitConnecterViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return circuitConnecterViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCircuitConnecterView_InternalCircuitConnecter() {
        return (EReference)getCircuitConnecterView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCChartRefereceView() {
		if (scChartRefereceViewEClass == null) {
			scChartRefereceViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return scChartRefereceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCChartRefereceView_InternalSCChartReferece() {
        return (EReference)getSCChartRefereceView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__GetAssignments() {
        return getSCChartRefereceView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__SetAssignments__EList() {
        return getSCChartRefereceView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__AddAssignments__String() {
        return getSCChartRefereceView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__RemoveAssignments__String() {
        return getSCChartRefereceView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__GetName() {
        return getSCChartRefereceView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__SetName__String() {
        return getSCChartRefereceView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__GetLabel() {
        return getSCChartRefereceView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__SetLabel__String() {
        return getSCChartRefereceView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__GetInputsOutputs() {
        return getSCChartRefereceView().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__SetInputsOutputs__String() {
        return getSCChartRefereceView().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__GetUuid() {
        return getSCChartRefereceView().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartRefereceView__SetUuid__String() {
        return getSCChartRefereceView().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialSCChartRefereceView() {
		if (initialSCChartRefereceViewEClass == null) {
			initialSCChartRefereceViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return initialSCChartRefereceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialSCChartRefereceView_InternalInitialSCChartReferece() {
        return (EReference)getInitialSCChartRefereceView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalSCChartRefereceView() {
		if (finalSCChartRefereceViewEClass == null) {
			finalSCChartRefereceViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return finalSCChartRefereceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalSCChartRefereceView_InternalFinalSCChartReferece() {
        return (EReference)getFinalSCChartRefereceView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTransitionView() {
		if (abstractTransitionViewEClass == null) {
			abstractTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return abstractTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTransitionView_InternalAbstractTransition() {
        return (EReference)getAbstractTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransitionView__GetPriority() {
        return getAbstractTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransitionView__SetPriority__String() {
        return getAbstractTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionView() {
		if (transitionViewEClass == null) {
			transitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return transitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionView_InternalTransition() {
        return (EReference)getTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__GetCondition() {
        return getTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__SetCondition__String() {
        return getTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__GetCount_delay() {
        return getTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__SetCount_delay__String() {
        return getTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__GetEffect() {
        return getTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__SetEffect__String() {
        return getTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTransitionView() {
		if (immediateTransitionViewEClass == null) {
			immediateTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return immediateTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateTransitionView_InternalImmediateTransition() {
        return (EReference)getImmediateTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__GetCondition() {
        return getImmediateTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetCondition__String() {
        return getImmediateTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__GetCount_delay() {
        return getImmediateTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetCount_delay__String() {
        return getImmediateTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__GetEffect() {
        return getImmediateTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetEffect__String() {
        return getImmediateTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminationTransitionView() {
		if (terminationTransitionViewEClass == null) {
			terminationTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return terminationTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminationTransitionView_InternalTerminationTransition() {
        return (EReference)getTerminationTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransitionView__GetEffect() {
        return getTerminationTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransitionView__SetEffect__String() {
        return getTerminationTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTerminationTransitionView() {
		if (conditionalTerminationTransitionViewEClass == null) {
			conditionalTerminationTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return conditionalTerminationTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalTerminationTransitionView_InternalConditionalTerminationTransition() {
        return (EReference)getConditionalTerminationTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransitionView__GetCondition() {
        return getConditionalTerminationTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransitionView__SetCondition__String() {
        return getConditionalTerminationTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransitionView__GetCount_delay() {
        return getConditionalTerminationTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransitionView__SetCount_delay__String() {
        return getConditionalTerminationTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransitionView__GetEffect() {
        return getConditionalTerminationTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransitionView__SetEffect__String() {
        return getConditionalTerminationTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortTransitionView() {
		if (strongAbortTransitionViewEClass == null) {
			strongAbortTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return strongAbortTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrongAbortTransitionView_InternalStrongAbortTransition() {
        return (EReference)getStrongAbortTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransitionView__GetCondition() {
        return getStrongAbortTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransitionView__SetCondition__String() {
        return getStrongAbortTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransitionView__GetCount_delay() {
        return getStrongAbortTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransitionView__SetCount_delay__String() {
        return getStrongAbortTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransitionView__GetEffect() {
        return getStrongAbortTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransitionView__SetEffect__String() {
        return getStrongAbortTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateStrongAbortTransitionView() {
		if (immediateStrongAbortTransitionViewEClass == null) {
			immediateStrongAbortTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return immediateStrongAbortTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateStrongAbortTransitionView_InternalImmediateStrongAbortTransition() {
        return (EReference)getImmediateStrongAbortTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransitionView__GetCondition() {
        return getImmediateStrongAbortTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransitionView__SetCondition__String() {
        return getImmediateStrongAbortTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransitionView__GetCount_delay() {
        return getImmediateStrongAbortTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransitionView__SetCount_delay__String() {
        return getImmediateStrongAbortTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransitionView__GetEffect() {
        return getImmediateStrongAbortTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransitionView__SetEffect__String() {
        return getImmediateStrongAbortTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeferredTransitionView() {
		if (deferredTransitionViewEClass == null) {
			deferredTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return deferredTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeferredTransitionView_InternalDeferredTransition() {
        return (EReference)getDeferredTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransitionView__GetCondition() {
        return getDeferredTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransitionView__SetCondition__String() {
        return getDeferredTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransitionView__GetCount_delay() {
        return getDeferredTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransitionView__SetCount_delay__String() {
        return getDeferredTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransitionView__GetEffect() {
        return getDeferredTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransitionView__SetEffect__String() {
        return getDeferredTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateDeferredTransitionView() {
		if (immediateDeferredTransitionViewEClass == null) {
			immediateDeferredTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return immediateDeferredTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateDeferredTransitionView_InternalImmediateDeferredTransition() {
        return (EReference)getImmediateDeferredTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransitionView__GetCondition() {
        return getImmediateDeferredTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransitionView__SetCondition__String() {
        return getImmediateDeferredTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransitionView__GetCount_delay() {
        return getImmediateDeferredTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransitionView__SetCount_delay__String() {
        return getImmediateDeferredTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransitionView__GetEffect() {
        return getImmediateDeferredTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransitionView__SetEffect__String() {
        return getImmediateDeferredTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminationDefferdTransitionView() {
		if (terminationDefferdTransitionViewEClass == null) {
			terminationDefferdTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return terminationDefferdTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminationDefferdTransitionView_InternalTerminationDefferdTransition() {
        return (EReference)getTerminationDefferdTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransitionView__GetEffect() {
        return getTerminationDefferdTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransitionView__SetEffect__String() {
        return getTerminationDefferdTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTerminationDeferredTransitionView() {
		if (conditionalTerminationDeferredTransitionViewEClass == null) {
			conditionalTerminationDeferredTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return conditionalTerminationDeferredTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalTerminationDeferredTransitionView_InternalConditionalTerminationDeferredTransition() {
        return (EReference)getConditionalTerminationDeferredTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransitionView__GetCondition() {
        return getConditionalTerminationDeferredTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransitionView__SetCondition__String() {
        return getConditionalTerminationDeferredTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransitionView__GetCount_delay() {
        return getConditionalTerminationDeferredTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransitionView__SetCount_delay__String() {
        return getConditionalTerminationDeferredTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransitionView__GetEffect() {
        return getConditionalTerminationDeferredTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransitionView__SetEffect__String() {
        return getConditionalTerminationDeferredTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortDeferredTransitionView() {
		if (strongAbortDeferredTransitionViewEClass == null) {
			strongAbortDeferredTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return strongAbortDeferredTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrongAbortDeferredTransitionView_InternalStrongAbortDeferredTransition() {
        return (EReference)getStrongAbortDeferredTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransitionView__GetCondition() {
        return getStrongAbortDeferredTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransitionView__SetCondition__String() {
        return getStrongAbortDeferredTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransitionView__GetCount_delay() {
        return getStrongAbortDeferredTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransitionView__SetCount_delay__String() {
        return getStrongAbortDeferredTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransitionView__GetEffect() {
        return getStrongAbortDeferredTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransitionView__SetEffect__String() {
        return getStrongAbortDeferredTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateStrongAbortDeferredTransitionView() {
		if (immediateStrongAbortDeferredTransitionViewEClass == null) {
			immediateStrongAbortDeferredTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return immediateStrongAbortDeferredTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateStrongAbortDeferredTransitionView_InternalImmediateStrongAbortDeferredTransition() {
        return (EReference)getImmediateStrongAbortDeferredTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransitionView__GetCondition() {
        return getImmediateStrongAbortDeferredTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransitionView__SetCondition__String() {
        return getImmediateStrongAbortDeferredTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransitionView__GetCount_delay() {
        return getImmediateStrongAbortDeferredTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransitionView__SetCount_delay__String() {
        return getImmediateStrongAbortDeferredTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransitionView__GetEffect() {
        return getImmediateStrongAbortDeferredTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransitionView__SetEffect__String() {
        return getImmediateStrongAbortDeferredTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryTransitionView() {
		if (historyTransitionViewEClass == null) {
			historyTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return historyTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoryTransitionView_InternalHistoryTransition() {
        return (EReference)getHistoryTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__GetCondition() {
        return getHistoryTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__SetCondition__String() {
        return getHistoryTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__GetCount_delay() {
        return getHistoryTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__SetCount_delay__String() {
        return getHistoryTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__IsDeepHistory() {
        return getHistoryTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__SetDeepHistory__boolean() {
        return getHistoryTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__GetEffect() {
        return getHistoryTransitionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransitionView__SetEffect__String() {
        return getHistoryTransitionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateHistoryTransitionView() {
		if (immediateHistoryTransitionViewEClass == null) {
			immediateHistoryTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return immediateHistoryTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateHistoryTransitionView_InternalImmediateHistoryTransition() {
        return (EReference)getImmediateHistoryTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__GetCondition() {
        return getImmediateHistoryTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__SetCondition__String() {
        return getImmediateHistoryTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__GetCount_delay() {
        return getImmediateHistoryTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__SetCount_delay__String() {
        return getImmediateHistoryTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__IsDeepHistory() {
        return getImmediateHistoryTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__SetDeepHistory__boolean() {
        return getImmediateHistoryTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__GetEffect() {
        return getImmediateHistoryTransitionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransitionView__SetEffect__String() {
        return getImmediateHistoryTransitionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminationHistoryTransitionView() {
		if (terminationHistoryTransitionViewEClass == null) {
			terminationHistoryTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return terminationHistoryTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminationHistoryTransitionView_InternalTerminationHistoryTransition() {
        return (EReference)getTerminationHistoryTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransitionView__IsDeepHistory() {
        return getTerminationHistoryTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransitionView__SetDeepHistory__boolean() {
        return getTerminationHistoryTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransitionView__GetEffect() {
        return getTerminationHistoryTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransitionView__SetEffect__String() {
        return getTerminationHistoryTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTerminationHistoryTransitionView() {
		if (conditionalTerminationHistoryTransitionViewEClass == null) {
			conditionalTerminationHistoryTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return conditionalTerminationHistoryTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalTerminationHistoryTransitionView_InternalConditionalTerminationHistoryTransition() {
        return (EReference)getConditionalTerminationHistoryTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__GetCondition() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__SetCondition__String() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__GetCount_delay() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__SetCount_delay__String() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__IsDeepHistory() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__SetDeepHistory__boolean() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__GetEffect() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransitionView__SetEffect__String() {
        return getConditionalTerminationHistoryTransitionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortHistoryTransitionView() {
		if (strongAbortHistoryTransitionViewEClass == null) {
			strongAbortHistoryTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return strongAbortHistoryTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrongAbortHistoryTransitionView_InternalStrongAbortHistoryTransition() {
        return (EReference)getStrongAbortHistoryTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__GetCondition() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__SetCondition__String() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__GetCount_delay() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__SetCount_delay__String() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__IsDeepHistory() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__SetDeepHistory__boolean() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__GetEffect() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransitionView__SetEffect__String() {
        return getStrongAbortHistoryTransitionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateStrongAbortHistoryTransitionView() {
		if (immediateStrongAbortHistoryTransitionViewEClass == null) {
			immediateStrongAbortHistoryTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return immediateStrongAbortHistoryTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateStrongAbortHistoryTransitionView_InternalImmediateStrongAbortHistoryTransition() {
        return (EReference)getImmediateStrongAbortHistoryTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__GetCondition() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__SetCondition__String() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__GetCount_delay() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__SetCount_delay__String() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__IsDeepHistory() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__SetDeepHistory__boolean() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__GetEffect() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransitionView__SetEffect__String() {
        return getImmediateStrongAbortHistoryTransitionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionView() {
		if (connectionViewEClass == null) {
			connectionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return connectionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionView_InternalConnection() {
        return (EReference)getConnectionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCChartView() {
		if (scChartViewEClass == null) {
			scChartViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return scChartViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCChartView_InternalSCChart() {
        return (EReference)getSCChartView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentView() {
		if (assignmentViewEClass == null) {
			assignmentViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return assignmentViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentView_InternalAssignment() {
        return (EReference)getAssignmentView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignmentView__GetAssignment() {
        return getAssignmentView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignmentView__SetAssignment__String() {
        return getAssignmentView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.scchart.views." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ViewsPackageImpl
