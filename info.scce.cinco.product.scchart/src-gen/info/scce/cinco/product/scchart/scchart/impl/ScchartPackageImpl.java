/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.scchart.ScchartFactory;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScchartPackageImpl extends EPackageImpl implements ScchartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "scchart.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initilalSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitConnecterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scChartRefereceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialSCChartRefereceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalSCChartRefereceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateStrongAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationDefferdTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTerminationDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateStrongAbortDeferredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTerminationHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateStrongAbortHistoryTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assignEEnum = null;

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
	 * @see info.scce.cinco.product.scchart.scchart.ScchartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScchartPackageImpl() {
		super(eNS_URI, ScchartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScchartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ScchartPackage init() {
		if (isInited) return (ScchartPackage)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScchartPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScchartPackageImpl theScchartPackage = registeredScchartPackage instanceof ScchartPackageImpl ? (ScchartPackageImpl)registeredScchartPackage : new ScchartPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Load packages
		theScchartPackage.loadPackage();

		// Fix loaded packages
		theScchartPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theScchartPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScchartPackage.eNS_URI, theScchartPackage);
		return theScchartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootState() {
		if (rootStateEClass == null) {
			rootStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(0);
		}
		return rootStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetName() {
        return getRootState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__SetName__String() {
        return getRootState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetLabel() {
        return getRootState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__SetLabel__String() {
        return getRootState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInternalRootState() {
        return getRootState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__IsExactlyRootState() {
        return getRootState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreDelete() {
        return getRootState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetPostDeleteFunction() {
        return getRootState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetPostDeleteEvent() {
        return getRootState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreSave() {
        return getRootState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PostSave() {
        return getRootState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRootElement() {
        return getRootState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetNodes() {
        return getRootState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSuspends() {
        return getRootState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewSuspend() {
        return getRootState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuspend__int_int() {
        return getRootState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuspend__String_int_int() {
        return getRootState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuspend__int_int_int_int() {
        return getRootState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuspend__String_int_int_int_int() {
        return getRootState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetDataFlowRegions() {
        return getRootState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDataFlowRegion() {
        return getRootState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDataFlowRegion__int_int() {
        return getRootState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDataFlowRegion__String_int_int() {
        return getRootState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDataFlowRegion__int_int_int_int() {
        return getRootState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDataFlowRegion__String_int_int_int_int() {
        return getRootState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetActions() {
        return getRootState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewAction() {
        return getRootState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewAction__int_int() {
        return getRootState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewAction__String_int_int() {
        return getRootState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewAction__int_int_int_int() {
        return getRootState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewAction__String_int_int_int_int() {
        return getRootState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRegions() {
        return getRootState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewRegion() {
        return getRootState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__int_int() {
        return getRootState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__String_int_int() {
        return getRootState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__int_int_int_int() {
        return getRootState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__String_int_int_int_int() {
        return getRootState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetDeclarations() {
        return getRootState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDeclaration() {
        return getRootState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeclaration__int_int() {
        return getRootState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeclaration__String_int_int() {
        return getRootState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeclaration__int_int_int_int() {
        return getRootState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeclaration__String_int_int_int_int() {
        return getRootState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoing() {
        return getRootState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSuccessors() {
        return getRootState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__ModelElementContainer_int_int() {
        return getRootState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreMove__ModelElementContainer_int_int() {
        return getRootState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getRootState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreResize__int_int_int_int_Direction() {
        return getRootState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PostResize__int_int_int_int_Direction() {
        return getRootState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingConditionalTerminationTransitions() {
        return getRootState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingStrongAbortTransitions() {
        return getRootState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateTransitions() {
        return getRootState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingAbstractTransitions() {
        return getRootState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateHistoryTransitions() {
        return getRootState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateDeferredTransitions() {
        return getRootState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingTerminationHistoryTransitions() {
        return getRootState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingTerminationTransitions() {
        return getRootState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingConnections() {
        return getRootState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingDeferredTransitions() {
        return getRootState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingConditionalTerminationHistoryTransitions() {
        return getRootState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingTransitions() {
        return getRootState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingStrongAbortDeferredTransitions() {
        return getRootState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingStrongAbortHistoryTransitions() {
        return getRootState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingHistoryTransitions() {
        return getRootState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingTerminationDefferdTransitions() {
        return getRootState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateStrongAbortDeferredTransitions() {
        return getRootState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateStrongAbortHistoryTransitions() {
        return getRootState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateStrongAbortTransitions() {
        return getRootState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingConditionalTerminationDeferredTransitions() {
        return getRootState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSuperStateSuccessors() {
        return getRootState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInitilalSuperStateSuccessors() {
        return getRootState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetFinalSuperStateSuccessors() {
        return getRootState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSimpleStateSuccessors() {
        return getRootState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInitialStateSuccessors() {
        return getRootState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetFinalStateSuccessors() {
        return getRootState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetConnectorSuccessors() {
        return getRootState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutputSuccessors() {
        return getRootState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOperatorSuccessors() {
        return getRootState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetCircuitConnecterSuccessors() {
        return getRootState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__Connector() {
        return getRootState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__Connector() {
        return getRootState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__Connector_String() {
        return getRootState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__SuperState_String() {
        return getRootState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__SimpleState_String() {
        return getRootState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__InitialState_String() {
        return getRootState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__FinalSuperState() {
        return getRootState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__FinalSuperState() {
        return getRootState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationTransition__FinalState_String() {
        return getRootState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__Connector_String() {
        return getRootState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__SuperState() {
        return getRootState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SuperState() {
        return getRootState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SuperState_String() {
        return getRootState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SimpleState_String() {
        return getRootState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitialState_String() {
        return getRootState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__FinalSuperState() {
        return getRootState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalSuperState() {
        return getRootState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalState_String() {
        return getRootState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__Connector() {
        return getRootState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__Connector() {
        return getRootState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__Connector_String() {
        return getRootState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__SuperState() {
        return getRootState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SuperState() {
        return getRootState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SuperState_String() {
        return getRootState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__SimpleState() {
        return getRootState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SimpleState() {
        return getRootState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SimpleState_String() {
        return getRootState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__InitialState() {
        return getRootState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitialState() {
        return getRootState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitialState_String() {
        return getRootState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__FinalSuperState() {
        return getRootState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalSuperState() {
        return getRootState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__FinalState() {
        return getRootState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalState() {
        return getRootState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalState_String() {
        return getRootState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__Connector() {
        return getRootState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__Connector() {
        return getRootState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__Connector_String() {
        return getRootState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__SuperState() {
        return getRootState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SuperState() {
        return getRootState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SuperState_String() {
        return getRootState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__SimpleState() {
        return getRootState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SimpleState() {
        return getRootState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SimpleState_String() {
        return getRootState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__InitialState() {
        return getRootState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitialState() {
        return getRootState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitialState_String() {
        return getRootState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__FinalSuperState() {
        return getRootState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalSuperState() {
        return getRootState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__FinalState() {
        return getRootState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalState() {
        return getRootState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalState_String() {
        return getRootState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__Connector() {
        return getRootState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__Connector() {
        return getRootState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__Connector_String() {
        return getRootState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__SuperState_String() {
        return getRootState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__SimpleState_String() {
        return getRootState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__InitialState_String() {
        return getRootState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__FinalSuperState() {
        return getRootState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__FinalSuperState() {
        return getRootState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationTransition__FinalState_String() {
        return getRootState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__Connector_String() {
        return getRootState().getEOperations().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__SuperState() {
        return getRootState().getEOperations().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__SuperState() {
        return getRootState().getEOperations().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__SuperState_String() {
        return getRootState().getEOperations().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__SimpleState_String() {
        return getRootState().getEOperations().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__InitialState_String() {
        return getRootState().getEOperations().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__FinalSuperState() {
        return getRootState().getEOperations().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__FinalSuperState() {
        return getRootState().getEOperations().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortTransition__FinalState_String() {
        return getRootState().getEOperations().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeferredTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeferredTransition__SuperState_String() {
        return getRootState().getEOperations().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDeferredTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateDeferredTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateDeferredTransition__SuperState_String() {
        return getRootState().getEOperations().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateDeferredTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationDefferdTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationDefferdTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationDefferdTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationDefferdTransition__SuperState() {
        return getRootState().getEOperations().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationDefferdTransition__SuperState() {
        return getRootState().getEOperations().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationDefferdTransition__SuperState_String() {
        return getRootState().getEOperations().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationDefferdTransition__FinalSuperState() {
        return getRootState().getEOperations().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationDefferdTransition__FinalSuperState() {
        return getRootState().getEOperations().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationDefferdTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationDeferredTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationDeferredTransition__SuperState_String() {
        return getRootState().getEOperations().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationDeferredTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortDeferredTransition__SuperState_String() {
        return getRootState().getEOperations().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortDeferredTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortDeferredTransition__SuperState() {
        return getRootState().getEOperations().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortDeferredTransition__SuperState_String() {
        return getRootState().getEOperations().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getRootState().getEOperations().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortDeferredTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewHistoryTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewHistoryTransition__SuperState_String() {
        return getRootState().getEOperations().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewHistoryTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateHistoryTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateHistoryTransition__SuperState_String() {
        return getRootState().getEOperations().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateHistoryTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationHistoryTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationHistoryTransition__SuperState_String() {
        return getRootState().getEOperations().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTerminationHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTerminationHistoryTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationHistoryTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationHistoryTransition__SuperState_String() {
        return getRootState().getEOperations().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConditionalTerminationHistoryTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortHistoryTransition__SuperState_String() {
        return getRootState().getEOperations().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortHistoryTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortHistoryTransition__SuperState() {
        return getRootState().getEOperations().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortHistoryTransition__SuperState_String() {
        return getRootState().getEOperations().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getRootState().getEOperations().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateStrongAbortHistoryTransition__FinalSuperState_String() {
        return getRootState().getEOperations().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConnection__Operator() {
        return getRootState().getEOperations().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConnection__Operator() {
        return getRootState().getEOperations().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConnection__Operator_String() {
        return getRootState().getEOperations().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConnection__CircuitConnecter() {
        return getRootState().getEOperations().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConnection__CircuitConnecter() {
        return getRootState().getEOperations().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConnection__CircuitConnecter_String() {
        return getRootState().getEOperations().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewConnection__Output() {
        return getRootState().getEOperations().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConnection__Output() {
        return getRootState().getEOperations().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewConnection__Output_String() {
        return getRootState().getEOperations().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanMoveTo__SCChart_int_int() {
        return getRootState().getEOperations().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__MoveTo__SCChart_int_int() {
        return getRootState().getEOperations().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__SCChart_int_int() {
        return getRootState().getEOperations().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanMoveTo__SCChartReferece_int_int() {
        return getRootState().getEOperations().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__MoveTo__SCChartReferece_int_int() {
        return getRootState().getEOperations().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__SCChartReferece_int_int() {
        return getRootState().getEOperations().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getRootState().getEOperations().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__MoveTo__InitialSCChartReferece_int_int() {
        return getRootState().getEOperations().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__InitialSCChartReferece_int_int() {
        return getRootState().getEOperations().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getRootState().getEOperations().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__MoveTo__FinalSCChartReferece_int_int() {
        return getRootState().getEOperations().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__FinalSCChartReferece_int_int() {
        return getRootState().getEOperations().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRootStateView() {
        return getRootState().getEOperations().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegion() {
		if (regionEClass == null) {
			regionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(1);
		}
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetName() {
        return getRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__SetName__String() {
        return getRegion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetLabel() {
        return getRegion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__SetLabel__String() {
        return getRegion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetUuid() {
        return getRegion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__SetUuid__String() {
        return getRegion().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInternalRegion() {
        return getRegion().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__IsExactlyRegion() {
        return getRegion().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreDelete() {
        return getRegion().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetPostDeleteFunction() {
        return getRegion().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetPostDeleteEvent() {
        return getRegion().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreSave() {
        return getRegion().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PostSave() {
        return getRegion().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetRootElement() {
        return getRegion().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetNodes() {
        return getRegion().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInitilalSuperStates() {
        return getRegion().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewInitilalSuperState() {
        return getRegion().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__int_int() {
        return getRegion().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__String_int_int() {
        return getRegion().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__int_int_int_int() {
        return getRegion().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__String_int_int_int_int() {
        return getRegion().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetConnectors() {
        return getRegion().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewConnector() {
        return getRegion().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__int_int() {
        return getRegion().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__String_int_int() {
        return getRegion().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__int_int_int_int() {
        return getRegion().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__String_int_int_int_int() {
        return getRegion().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetSuperStates() {
        return getRegion().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewSuperState() {
        return getRegion().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__int_int() {
        return getRegion().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__String_int_int() {
        return getRegion().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__int_int_int_int() {
        return getRegion().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__String_int_int_int_int() {
        return getRegion().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetSimpleStates() {
        return getRegion().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewSimpleState() {
        return getRegion().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__int_int() {
        return getRegion().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__String_int_int() {
        return getRegion().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__int_int_int_int() {
        return getRegion().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__String_int_int_int_int() {
        return getRegion().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInitialStates() {
        return getRegion().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewInitialState() {
        return getRegion().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__int_int() {
        return getRegion().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__String_int_int() {
        return getRegion().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__int_int_int_int() {
        return getRegion().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__String_int_int_int_int() {
        return getRegion().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInitialSCChartRefereces() {
        return getRegion().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewInitialSCChartReferece() {
        return getRegion().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialSCChartReferece__EObject_int_int() {
        return getRegion().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialSCChartReferece__EObject_String_int_int() {
        return getRegion().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialSCChartReferece__EObject_int_int_int_int() {
        return getRegion().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialSCChartReferece__EObject_String_int_int_int_int() {
        return getRegion().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetFinalSCChartRefereces() {
        return getRegion().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewFinalSCChartReferece() {
        return getRegion().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSCChartReferece__EObject_int_int() {
        return getRegion().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSCChartReferece__EObject_String_int_int() {
        return getRegion().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSCChartReferece__EObject_int_int_int_int() {
        return getRegion().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSCChartReferece__EObject_String_int_int_int_int() {
        return getRegion().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetSCChartRefereces() {
        return getRegion().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewSCChartReferece() {
        return getRegion().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSCChartReferece__EObject_int_int() {
        return getRegion().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSCChartReferece__EObject_String_int_int() {
        return getRegion().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSCChartReferece__EObject_int_int_int_int() {
        return getRegion().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSCChartReferece__EObject_String_int_int_int_int() {
        return getRegion().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetFinalSuperStates() {
        return getRegion().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewFinalSuperState() {
        return getRegion().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSuperState__int_int() {
        return getRegion().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSuperState__String_int_int() {
        return getRegion().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSuperState__int_int_int_int() {
        return getRegion().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalSuperState__String_int_int_int_int() {
        return getRegion().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetFinalStates() {
        return getRegion().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewFinalState() {
        return getRegion().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__int_int() {
        return getRegion().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__String_int_int() {
        return getRegion().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__int_int_int_int() {
        return getRegion().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__String_int_int_int_int() {
        return getRegion().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__ModelElementContainer_int_int() {
        return getRegion().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreMove__ModelElementContainer_int_int() {
        return getRegion().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getRegion().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreResize__int_int_int_int_Direction() {
        return getRegion().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PostResize__int_int_int_int_Direction() {
        return getRegion().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__RootState_int_int() {
        return getRegion().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__RootState_int_int() {
        return getRegion().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__RootState_int_int() {
        return getRegion().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__SuperState_int_int() {
        return getRegion().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__SuperState_int_int() {
        return getRegion().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__SuperState_int_int() {
        return getRegion().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__InitilalSuperState_int_int() {
        return getRegion().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__InitilalSuperState_int_int() {
        return getRegion().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__InitilalSuperState_int_int() {
        return getRegion().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__FinalSuperState_int_int() {
        return getRegion().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__FinalSuperState_int_int() {
        return getRegion().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__FinalSuperState_int_int() {
        return getRegion().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__SCChartReferece_int_int() {
        return getRegion().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__SCChartReferece_int_int() {
        return getRegion().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__SCChartReferece_int_int() {
        return getRegion().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__InitialSCChartReferece_int_int() {
        return getRegion().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__InitialSCChartReferece_int_int() {
        return getRegion().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__InitialSCChartReferece_int_int() {
        return getRegion().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__FinalSCChartReferece_int_int() {
        return getRegion().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__FinalSCChartReferece_int_int() {
        return getRegion().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__FinalSCChartReferece_int_int() {
        return getRegion().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetRegionView() {
        return getRegion().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFlowRegion() {
		if (dataFlowRegionEClass == null) {
			dataFlowRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(2);
		}
		return dataFlowRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetInternalDataFlowRegion() {
        return getDataFlowRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__IsExactlyDataFlowRegion() {
        return getDataFlowRegion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PreDelete() {
        return getDataFlowRegion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetPostDeleteFunction() {
        return getDataFlowRegion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetPostDeleteEvent() {
        return getDataFlowRegion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PreSave() {
        return getDataFlowRegion().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PostSave() {
        return getDataFlowRegion().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetRootElement() {
        return getDataFlowRegion().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetNodes() {
        return getDataFlowRegion().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetOperators() {
        return getDataFlowRegion().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewOperator() {
        return getDataFlowRegion().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOperator__int_int() {
        return getDataFlowRegion().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOperator__String_int_int() {
        return getDataFlowRegion().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOperator__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOperator__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetInputs() {
        return getDataFlowRegion().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewInput() {
        return getDataFlowRegion().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInput__int_int() {
        return getDataFlowRegion().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInput__String_int_int() {
        return getDataFlowRegion().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInput__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInput__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetConnectors() {
        return getDataFlowRegion().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewConnector() {
        return getDataFlowRegion().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewConnector__int_int() {
        return getDataFlowRegion().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewConnector__String_int_int() {
        return getDataFlowRegion().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewConnector__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewConnector__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetInitialStates() {
        return getDataFlowRegion().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewInitialState() {
        return getDataFlowRegion().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialState__int_int() {
        return getDataFlowRegion().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialState__String_int_int() {
        return getDataFlowRegion().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialState__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialState__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetSCChartRefereces() {
        return getDataFlowRegion().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewSCChartReferece() {
        return getDataFlowRegion().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSCChartReferece__EObject_int_int() {
        return getDataFlowRegion().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSCChartReferece__EObject_String_int_int() {
        return getDataFlowRegion().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSCChartReferece__EObject_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSCChartReferece__EObject_String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetCircuitConnecters() {
        return getDataFlowRegion().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewCircuitConnecter() {
        return getDataFlowRegion().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewCircuitConnecter__int_int() {
        return getDataFlowRegion().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewCircuitConnecter__String_int_int() {
        return getDataFlowRegion().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewCircuitConnecter__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewCircuitConnecter__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetOutputs() {
        return getDataFlowRegion().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewOutput() {
        return getDataFlowRegion().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOutput__int_int() {
        return getDataFlowRegion().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOutput__String_int_int() {
        return getDataFlowRegion().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOutput__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewOutput__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetInitilalSuperStates() {
        return getDataFlowRegion().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewInitilalSuperState() {
        return getDataFlowRegion().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitilalSuperState__int_int() {
        return getDataFlowRegion().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitilalSuperState__String_int_int() {
        return getDataFlowRegion().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitilalSuperState__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitilalSuperState__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetSuperStates() {
        return getDataFlowRegion().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewSuperState() {
        return getDataFlowRegion().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSuperState__int_int() {
        return getDataFlowRegion().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSuperState__String_int_int() {
        return getDataFlowRegion().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSuperState__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSuperState__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetSimpleStates() {
        return getDataFlowRegion().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewSimpleState() {
        return getDataFlowRegion().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSimpleState__int_int() {
        return getDataFlowRegion().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSimpleState__String_int_int() {
        return getDataFlowRegion().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSimpleState__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewSimpleState__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetInitialSCChartRefereces() {
        return getDataFlowRegion().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewInitialSCChartReferece() {
        return getDataFlowRegion().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialSCChartReferece__EObject_int_int() {
        return getDataFlowRegion().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialSCChartReferece__EObject_String_int_int() {
        return getDataFlowRegion().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialSCChartReferece__EObject_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewInitialSCChartReferece__EObject_String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetFinalSCChartRefereces() {
        return getDataFlowRegion().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewFinalSCChartReferece() {
        return getDataFlowRegion().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSCChartReferece__EObject_int_int() {
        return getDataFlowRegion().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSCChartReferece__EObject_String_int_int() {
        return getDataFlowRegion().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSCChartReferece__EObject_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSCChartReferece__EObject_String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetFinalSuperStates() {
        return getDataFlowRegion().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewFinalSuperState() {
        return getDataFlowRegion().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSuperState__int_int() {
        return getDataFlowRegion().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSuperState__String_int_int() {
        return getDataFlowRegion().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSuperState__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalSuperState__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetFinalStates() {
        return getDataFlowRegion().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanNewFinalState() {
        return getDataFlowRegion().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalState__int_int() {
        return getDataFlowRegion().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalState__String_int_int() {
        return getDataFlowRegion().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalState__int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__NewFinalState__String_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__ModelElementContainer_int_int() {
        return getDataFlowRegion().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PreMove__ModelElementContainer_int_int() {
        return getDataFlowRegion().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getDataFlowRegion().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PreResize__int_int_int_int_Direction() {
        return getDataFlowRegion().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__PostResize__int_int_int_int_Direction() {
        return getDataFlowRegion().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__RootState_int_int() {
        return getDataFlowRegion().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__RootState_int_int() {
        return getDataFlowRegion().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__RootState_int_int() {
        return getDataFlowRegion().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__SuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__SuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__SuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__InitilalSuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__InitilalSuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__InitilalSuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__FinalSuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__FinalSuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__FinalSuperState_int_int() {
        return getDataFlowRegion().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__SCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__SCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__SCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__InitialSCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__InitialSCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__InitialSCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__CanMoveTo__FinalSCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__MoveTo__FinalSCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__S_moveTo__FinalSCChartReferece_int_int() {
        return getDataFlowRegion().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowRegion__GetDataFlowRegionView() {
        return getDataFlowRegion().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperState() {
		if (superStateEClass == null) {
			superStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(3);
		}
		return superStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetName() {
        return getSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__SetName__String() {
        return getSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetLabel() {
        return getSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__SetLabel__String() {
        return getSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInputsOutputs() {
        return getSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__SetInputsOutputs__EList() {
        return getSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__AddInputsOutputs__String() {
        return getSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__RemoveInputsOutputs__String() {
        return getSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInternalSuperState() {
        return getSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__IsExactlySuperState() {
        return getSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreDelete() {
        return getSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetPostDeleteFunction() {
        return getSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetPostDeleteEvent() {
        return getSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreSave() {
        return getSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PostSave() {
        return getSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetRootElement() {
        return getSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetNodes() {
        return getSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuspends() {
        return getSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewSuspend() {
        return getSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuspend__int_int() {
        return getSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuspend__String_int_int() {
        return getSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuspend__int_int_int_int() {
        return getSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuspend__String_int_int_int_int() {
        return getSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetDataFlowRegions() {
        return getSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDataFlowRegion() {
        return getSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDataFlowRegion__int_int() {
        return getSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDataFlowRegion__String_int_int() {
        return getSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDataFlowRegion__int_int_int_int() {
        return getSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDataFlowRegion__String_int_int_int_int() {
        return getSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetActions() {
        return getSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewAction() {
        return getSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewAction__int_int() {
        return getSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewAction__String_int_int() {
        return getSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewAction__int_int_int_int() {
        return getSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewAction__String_int_int_int_int() {
        return getSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetRegions() {
        return getSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewRegion() {
        return getSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__int_int() {
        return getSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__String_int_int() {
        return getSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__int_int_int_int() {
        return getSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__String_int_int_int_int() {
        return getSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetDeclarations() {
        return getSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDeclaration() {
        return getSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeclaration__int_int() {
        return getSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeclaration__String_int_int() {
        return getSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeclaration__int_int_int_int() {
        return getSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeclaration__String_int_int_int_int() {
        return getSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoing() {
        return getSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuccessors() {
        return getSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncoming() {
        return getSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetPredecessors() {
        return getSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreMove__ModelElementContainer_int_int() {
        return getSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreResize__int_int_int_int_Direction() {
        return getSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PostResize__int_int_int_int_Direction() {
        return getSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingConditionalTerminationTransitions() {
        return getSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingStrongAbortTransitions() {
        return getSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateTransitions() {
        return getSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateHistoryTransitions() {
        return getSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingAbstractTransitions() {
        return getSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateDeferredTransitions() {
        return getSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingTerminationHistoryTransitions() {
        return getSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingTerminationTransitions() {
        return getSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingDeferredTransitions() {
        return getSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingConditionalTerminationHistoryTransitions() {
        return getSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingTransitions() {
        return getSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingStrongAbortDeferredTransitions() {
        return getSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingStrongAbortHistoryTransitions() {
        return getSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingHistoryTransitions() {
        return getSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingTerminationDefferdTransitions() {
        return getSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateStrongAbortDeferredTransitions() {
        return getSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateStrongAbortHistoryTransitions() {
        return getSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateStrongAbortTransitions() {
        return getSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingConditionalTerminationDeferredTransitions() {
        return getSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingConditionalTerminationTransitions() {
        return getSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingStrongAbortTransitions() {
        return getSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateTransitions() {
        return getSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateHistoryTransitions() {
        return getSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingAbstractTransitions() {
        return getSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateDeferredTransitions() {
        return getSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingTerminationHistoryTransitions() {
        return getSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingTerminationTransitions() {
        return getSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingDeferredTransitions() {
        return getSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingConditionalTerminationHistoryTransitions() {
        return getSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingTransitions() {
        return getSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingStrongAbortDeferredTransitions() {
        return getSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingStrongAbortHistoryTransitions() {
        return getSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingHistoryTransitions() {
        return getSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingTerminationDefferdTransitions() {
        return getSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateStrongAbortDeferredTransitions() {
        return getSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateStrongAbortHistoryTransitions() {
        return getSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateStrongAbortTransitions() {
        return getSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingConditionalTerminationDeferredTransitions() {
        return getSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetRootStatePredecessors() {
        return getSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStatePredecessors() {
        return getSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitilalSuperStatePredecessors() {
        return getSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetFinalSuperStatePredecessors() {
        return getSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSimpleStatePredecessors() {
        return getSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitialStatePredecessors() {
        return getSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetFinalStatePredecessors() {
        return getSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetConnectorPredecessors() {
        return getSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStateSuccessors() {
        return getSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitilalSuperStateSuccessors() {
        return getSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetFinalSuperStateSuccessors() {
        return getSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSimpleStateSuccessors() {
        return getSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitialStateSuccessors() {
        return getSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetFinalStateSuccessors() {
        return getSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetConnectorSuccessors() {
        return getSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__Connector_String() {
        return getSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__SuperState_String() {
        return getSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__InitialState_String() {
        return getSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationTransition__FinalState_String() {
        return getSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__Connector() {
        return getSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__Connector() {
        return getSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__Connector_String() {
        return getSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SuperState_String() {
        return getSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitialState_String() {
        return getSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__FinalState_String() {
        return getSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__Connector() {
        return getSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__Connector() {
        return getSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__Connector_String() {
        return getSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__SuperState() {
        return getSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SuperState() {
        return getSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SuperState_String() {
        return getSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__SimpleState() {
        return getSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SimpleState() {
        return getSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__InitialState() {
        return getSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitialState() {
        return getSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitialState_String() {
        return getSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__FinalState() {
        return getSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__FinalState() {
        return getSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__FinalState_String() {
        return getSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateHistoryTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateHistoryTransition__SuperState_String() {
        return getSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateHistoryTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateDeferredTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateDeferredTransition__SuperState_String() {
        return getSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateDeferredTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationHistoryTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationHistoryTransition__SuperState_String() {
        return getSuperState().getEOperations().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationHistoryTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__Connector_String() {
        return getSuperState().getEOperations().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__SuperState_String() {
        return getSuperState().getEOperations().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__InitialState_String() {
        return getSuperState().getEOperations().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationTransition__FinalState_String() {
        return getSuperState().getEOperations().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeferredTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeferredTransition__SuperState_String() {
        return getSuperState().getEOperations().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDeferredTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationHistoryTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationHistoryTransition__SuperState_String() {
        return getSuperState().getEOperations().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationHistoryTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__Connector() {
        return getSuperState().getEOperations().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__Connector() {
        return getSuperState().getEOperations().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__Connector_String() {
        return getSuperState().getEOperations().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__SuperState() {
        return getSuperState().getEOperations().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SuperState() {
        return getSuperState().getEOperations().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SuperState_String() {
        return getSuperState().getEOperations().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__SimpleState() {
        return getSuperState().getEOperations().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SimpleState() {
        return getSuperState().getEOperations().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__InitialState() {
        return getSuperState().getEOperations().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitialState() {
        return getSuperState().getEOperations().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitialState_String() {
        return getSuperState().getEOperations().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__FinalState() {
        return getSuperState().getEOperations().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__FinalState() {
        return getSuperState().getEOperations().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__FinalState_String() {
        return getSuperState().getEOperations().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortDeferredTransition__SuperState_String() {
        return getSuperState().getEOperations().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortDeferredTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortHistoryTransition__SuperState_String() {
        return getSuperState().getEOperations().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortHistoryTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewHistoryTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewHistoryTransition__SuperState_String() {
        return getSuperState().getEOperations().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewHistoryTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationDefferdTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationDefferdTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationDefferdTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationDefferdTransition__SuperState() {
        return getSuperState().getEOperations().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationDefferdTransition__SuperState() {
        return getSuperState().getEOperations().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationDefferdTransition__SuperState_String() {
        return getSuperState().getEOperations().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTerminationDefferdTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationDefferdTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTerminationDefferdTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortDeferredTransition__SuperState_String() {
        return getSuperState().getEOperations().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortDeferredTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortHistoryTransition__SuperState() {
        return getSuperState().getEOperations().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortHistoryTransition__SuperState_String() {
        return getSuperState().getEOperations().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortHistoryTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__Connector() {
        return getSuperState().getEOperations().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__Connector() {
        return getSuperState().getEOperations().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__Connector_String() {
        return getSuperState().getEOperations().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__SuperState_String() {
        return getSuperState().getEOperations().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__InitialState_String() {
        return getSuperState().getEOperations().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateStrongAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateStrongAbortTransition__FinalState_String() {
        return getSuperState().getEOperations().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationDeferredTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationDeferredTransition__SuperState() {
        return getSuperState().getEOperations().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationDeferredTransition__SuperState_String() {
        return getSuperState().getEOperations().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getSuperState().getEOperations().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewConditionalTerminationDeferredTransition__FinalSuperState_String() {
        return getSuperState().getEOperations().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanMoveTo__Region_int_int() {
        return getSuperState().getEOperations().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__MoveTo__Region_int_int() {
        return getSuperState().getEOperations().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__Region_int_int() {
        return getSuperState().getEOperations().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanMoveTo__DataFlowRegion_int_int() {
        return getSuperState().getEOperations().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__MoveTo__DataFlowRegion_int_int() {
        return getSuperState().getEOperations().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__DataFlowRegion_int_int() {
        return getSuperState().getEOperations().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanMoveTo__SCChartReferece_int_int() {
        return getSuperState().getEOperations().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__MoveTo__SCChartReferece_int_int() {
        return getSuperState().getEOperations().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__SCChartReferece_int_int() {
        return getSuperState().getEOperations().get(351);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getSuperState().getEOperations().get(352);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__MoveTo__InitialSCChartReferece_int_int() {
        return getSuperState().getEOperations().get(353);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__InitialSCChartReferece_int_int() {
        return getSuperState().getEOperations().get(354);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getSuperState().getEOperations().get(355);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__MoveTo__FinalSCChartReferece_int_int() {
        return getSuperState().getEOperations().get(356);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__FinalSCChartReferece_int_int() {
        return getSuperState().getEOperations().get(357);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStateView() {
        return getSuperState().getEOperations().get(358);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitilalSuperState() {
		if (initilalSuperStateEClass == null) {
			initilalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(4);
		}
		return initilalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInternalInitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__IsExactlyInitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreDelete() {
        return getInitilalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetPostDeleteFunction() {
        return getInitilalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetPostDeleteEvent() {
        return getInitilalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreSave() {
        return getInitilalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PostSave() {
        return getInitilalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetRootElement() {
        return getInitilalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetNodes() {
        return getInitilalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuspends() {
        return getInitilalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewSuspend() {
        return getInitilalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuspend__int_int() {
        return getInitilalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuspend__String_int_int() {
        return getInitilalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuspend__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuspend__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetDataFlowRegions() {
        return getInitilalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDataFlowRegion() {
        return getInitilalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDataFlowRegion__int_int() {
        return getInitilalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDataFlowRegion__String_int_int() {
        return getInitilalSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDataFlowRegion__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDataFlowRegion__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetActions() {
        return getInitilalSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewAction() {
        return getInitilalSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewAction__int_int() {
        return getInitilalSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewAction__String_int_int() {
        return getInitilalSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewAction__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewAction__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetRegions() {
        return getInitilalSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewRegion() {
        return getInitilalSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__int_int() {
        return getInitilalSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__String_int_int() {
        return getInitilalSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetDeclarations() {
        return getInitilalSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDeclaration() {
        return getInitilalSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeclaration__int_int() {
        return getInitilalSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeclaration__String_int_int() {
        return getInitilalSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeclaration__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeclaration__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoing() {
        return getInitilalSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuccessors() {
        return getInitilalSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncoming() {
        return getInitilalSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetPredecessors() {
        return getInitilalSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getInitilalSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreMove__ModelElementContainer_int_int() {
        return getInitilalSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreResize__int_int_int_int_Direction() {
        return getInitilalSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PostResize__int_int_int_int_Direction() {
        return getInitilalSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingConditionalTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingStrongAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateTransitions() {
        return getInitilalSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingAbstractTransitions() {
        return getInitilalSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingTerminationHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingConditionalTerminationHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingTransitions() {
        return getInitilalSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingStrongAbortDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingStrongAbortHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingTerminationDefferdTransitions() {
        return getInitilalSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateStrongAbortDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateStrongAbortHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateStrongAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingConditionalTerminationDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingConditionalTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingStrongAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateTransitions() {
        return getInitilalSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingAbstractTransitions() {
        return getInitilalSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingTerminationHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingConditionalTerminationHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingTransitions() {
        return getInitilalSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingStrongAbortDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingStrongAbortHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingTerminationDefferdTransitions() {
        return getInitilalSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateStrongAbortDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateStrongAbortHistoryTransitions() {
        return getInitilalSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateStrongAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingConditionalTerminationDeferredTransitions() {
        return getInitilalSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetRootStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuperStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitilalSuperStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetFinalSuperStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSimpleStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitialStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetFinalStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetConnectorPredecessors() {
        return getInitilalSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuperStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitilalSuperStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetFinalSuperStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSimpleStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitialStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetFinalStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetConnectorSuccessors() {
        return getInitilalSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateHistoryTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateHistoryTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateHistoryTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateDeferredTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateDeferredTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateDeferredTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationHistoryTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationHistoryTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationHistoryTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeferredTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeferredTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDeferredTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationHistoryTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationHistoryTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationHistoryTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortDeferredTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortDeferredTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortHistoryTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortHistoryTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewHistoryTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewHistoryTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewHistoryTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationDefferdTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationDefferdTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationDefferdTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationDefferdTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationDefferdTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationDefferdTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTerminationDefferdTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationDefferdTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTerminationDefferdTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortDeferredTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortDeferredTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortHistoryTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortHistoryTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortHistoryTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateStrongAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateStrongAbortTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationDeferredTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationDeferredTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationDeferredTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getInitilalSuperState().getEOperations().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewConditionalTerminationDeferredTransition__FinalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanMoveTo__Region_int_int() {
        return getInitilalSuperState().getEOperations().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__MoveTo__Region_int_int() {
        return getInitilalSuperState().getEOperations().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__Region_int_int() {
        return getInitilalSuperState().getEOperations().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanMoveTo__DataFlowRegion_int_int() {
        return getInitilalSuperState().getEOperations().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__MoveTo__DataFlowRegion_int_int() {
        return getInitilalSuperState().getEOperations().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__DataFlowRegion_int_int() {
        return getInitilalSuperState().getEOperations().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanMoveTo__SCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__MoveTo__SCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__SCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__MoveTo__InitialSCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__InitialSCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__MoveTo__FinalSCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__FinalSCChartReferece_int_int() {
        return getInitilalSuperState().getEOperations().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitilalSuperStateView() {
        return getInitilalSuperState().getEOperations().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalSuperState() {
		if (finalSuperStateEClass == null) {
			finalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(5);
		}
		return finalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetInternalFinalSuperState() {
        return getFinalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__IsExactlyFinalSuperState() {
        return getFinalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PreDelete() {
        return getFinalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetPostDeleteFunction() {
        return getFinalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetPostDeleteEvent() {
        return getFinalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PreSave() {
        return getFinalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PostSave() {
        return getFinalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetRootElement() {
        return getFinalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetNodes() {
        return getFinalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetSuspends() {
        return getFinalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewSuspend() {
        return getFinalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewSuspend__int_int() {
        return getFinalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewSuspend__String_int_int() {
        return getFinalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewSuspend__int_int_int_int() {
        return getFinalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewSuspend__String_int_int_int_int() {
        return getFinalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetDataFlowRegions() {
        return getFinalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewDataFlowRegion() {
        return getFinalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDataFlowRegion__int_int() {
        return getFinalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDataFlowRegion__String_int_int() {
        return getFinalSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDataFlowRegion__int_int_int_int() {
        return getFinalSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDataFlowRegion__String_int_int_int_int() {
        return getFinalSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetActions() {
        return getFinalSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewAction() {
        return getFinalSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewAction__int_int() {
        return getFinalSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewAction__String_int_int() {
        return getFinalSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewAction__int_int_int_int() {
        return getFinalSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewAction__String_int_int_int_int() {
        return getFinalSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetRegions() {
        return getFinalSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewRegion() {
        return getFinalSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewRegion__int_int() {
        return getFinalSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewRegion__String_int_int() {
        return getFinalSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewRegion__int_int_int_int() {
        return getFinalSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewRegion__String_int_int_int_int() {
        return getFinalSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetDeclarations() {
        return getFinalSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewDeclaration() {
        return getFinalSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeclaration__int_int() {
        return getFinalSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeclaration__String_int_int() {
        return getFinalSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeclaration__int_int_int_int() {
        return getFinalSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeclaration__String_int_int_int_int() {
        return getFinalSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoing() {
        return getFinalSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetSuccessors() {
        return getFinalSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncoming() {
        return getFinalSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetPredecessors() {
        return getFinalSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getFinalSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PreMove__ModelElementContainer_int_int() {
        return getFinalSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getFinalSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PreResize__int_int_int_int_Direction() {
        return getFinalSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__PostResize__int_int_int_int_Direction() {
        return getFinalSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingConditionalTerminationTransitions() {
        return getFinalSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingStrongAbortTransitions() {
        return getFinalSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingImmediateTransitions() {
        return getFinalSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingImmediateHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingAbstractTransitions() {
        return getFinalSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingImmediateDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingTerminationHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingTerminationTransitions() {
        return getFinalSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingConditionalTerminationHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingTransitions() {
        return getFinalSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingStrongAbortDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingStrongAbortHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingTerminationDefferdTransitions() {
        return getFinalSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingImmediateStrongAbortDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingImmediateStrongAbortHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingImmediateStrongAbortTransitions() {
        return getFinalSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetOutgoingConditionalTerminationDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingConditionalTerminationTransitions() {
        return getFinalSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingStrongAbortTransitions() {
        return getFinalSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingImmediateTransitions() {
        return getFinalSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingImmediateHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingAbstractTransitions() {
        return getFinalSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingImmediateDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingTerminationHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingTerminationTransitions() {
        return getFinalSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingConditionalTerminationHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingTransitions() {
        return getFinalSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingStrongAbortDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingStrongAbortHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingTerminationDefferdTransitions() {
        return getFinalSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingImmediateStrongAbortDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingImmediateStrongAbortHistoryTransitions() {
        return getFinalSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingImmediateStrongAbortTransitions() {
        return getFinalSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetIncomingConditionalTerminationDeferredTransitions() {
        return getFinalSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetRootStatePredecessors() {
        return getFinalSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetSuperStatePredecessors() {
        return getFinalSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetInitilalSuperStatePredecessors() {
        return getFinalSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetFinalSuperStatePredecessors() {
        return getFinalSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetSimpleStatePredecessors() {
        return getFinalSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetInitialStatePredecessors() {
        return getFinalSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetFinalStatePredecessors() {
        return getFinalSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetConnectorPredecessors() {
        return getFinalSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetSuperStateSuccessors() {
        return getFinalSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetInitilalSuperStateSuccessors() {
        return getFinalSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetFinalSuperStateSuccessors() {
        return getFinalSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetSimpleStateSuccessors() {
        return getFinalSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetInitialStateSuccessors() {
        return getFinalSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetFinalStateSuccessors() {
        return getFinalSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetConnectorSuccessors() {
        return getFinalSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__Connector() {
        return getFinalSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__Connector() {
        return getFinalSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__Connector_String() {
        return getFinalSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__SimpleState_String() {
        return getFinalSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__InitialState_String() {
        return getFinalSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationTransition__FinalState_String() {
        return getFinalSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__Connector() {
        return getFinalSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__Connector() {
        return getFinalSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__Connector_String() {
        return getFinalSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getFinalSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__InitialState_String() {
        return getFinalSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortTransition__FinalState_String() {
        return getFinalSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__Connector() {
        return getFinalSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__Connector() {
        return getFinalSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__Connector_String() {
        return getFinalSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__SimpleState_String() {
        return getFinalSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__InitialState_String() {
        return getFinalSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateTransition__FinalState_String() {
        return getFinalSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateHistoryTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateHistoryTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateHistoryTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateDeferredTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateDeferredTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateDeferredTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationHistoryTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationHistoryTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationHistoryTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__Connector() {
        return getFinalSuperState().getEOperations().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__Connector() {
        return getFinalSuperState().getEOperations().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__Connector_String() {
        return getFinalSuperState().getEOperations().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__SimpleState_String() {
        return getFinalSuperState().getEOperations().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__InitialState_String() {
        return getFinalSuperState().getEOperations().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationTransition__FinalState_String() {
        return getFinalSuperState().getEOperations().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeferredTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeferredTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewDeferredTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationHistoryTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationHistoryTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationHistoryTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__Connector() {
        return getFinalSuperState().getEOperations().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__Connector() {
        return getFinalSuperState().getEOperations().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__Connector_String() {
        return getFinalSuperState().getEOperations().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__SimpleState_String() {
        return getFinalSuperState().getEOperations().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__InitialState_String() {
        return getFinalSuperState().getEOperations().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTransition__FinalState_String() {
        return getFinalSuperState().getEOperations().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortDeferredTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortDeferredTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortHistoryTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewStrongAbortHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewStrongAbortHistoryTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewHistoryTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewHistoryTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewHistoryTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationDefferdTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationDefferdTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationDefferdTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationDefferdTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationDefferdTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationDefferdTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewTerminationDefferdTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationDefferdTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewTerminationDefferdTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortDeferredTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortDeferredTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortDeferredTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortHistoryTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortHistoryTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortHistoryTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortHistoryTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortHistoryTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__Connector() {
        return getFinalSuperState().getEOperations().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__Connector() {
        return getFinalSuperState().getEOperations().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__Connector_String() {
        return getFinalSuperState().getEOperations().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__SimpleState() {
        return getFinalSuperState().getEOperations().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__SimpleState_String() {
        return getFinalSuperState().getEOperations().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__InitialState() {
        return getFinalSuperState().getEOperations().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__InitialState_String() {
        return getFinalSuperState().getEOperations().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewImmediateStrongAbortTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__FinalState() {
        return getFinalSuperState().getEOperations().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewImmediateStrongAbortTransition__FinalState_String() {
        return getFinalSuperState().getEOperations().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationDeferredTransition__InitilalSuperState() {
        return getFinalSuperState().getEOperations().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationDeferredTransition__InitilalSuperState_String() {
        return getFinalSuperState().getEOperations().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationDeferredTransition__SuperState() {
        return getFinalSuperState().getEOperations().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationDeferredTransition__SuperState_String() {
        return getFinalSuperState().getEOperations().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanNewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationDeferredTransition__FinalSuperState() {
        return getFinalSuperState().getEOperations().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__NewConditionalTerminationDeferredTransition__FinalSuperState_String() {
        return getFinalSuperState().getEOperations().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanMoveTo__Region_int_int() {
        return getFinalSuperState().getEOperations().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__MoveTo__Region_int_int() {
        return getFinalSuperState().getEOperations().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__S_moveTo__Region_int_int() {
        return getFinalSuperState().getEOperations().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanMoveTo__DataFlowRegion_int_int() {
        return getFinalSuperState().getEOperations().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__MoveTo__DataFlowRegion_int_int() {
        return getFinalSuperState().getEOperations().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__S_moveTo__DataFlowRegion_int_int() {
        return getFinalSuperState().getEOperations().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanMoveTo__SCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__MoveTo__SCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__S_moveTo__SCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__MoveTo__InitialSCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__S_moveTo__InitialSCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__MoveTo__FinalSCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__S_moveTo__FinalSCChartReferece_int_int() {
        return getFinalSuperState().getEOperations().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSuperState__GetFinalSuperStateView() {
        return getFinalSuperState().getEOperations().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclaration() {
		if (declarationEClass == null) {
			declarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(6);
		}
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetDeclarationType() {
        return getDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetDeclarationType__String() {
        return getDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__IsConstant() {
        return getDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetConstant__boolean() {
        return getDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetInputOutput() {
        return getDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetInputOutput__String() {
        return getDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetAssignment() {
        return getDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetAssignment__String() {
        return getDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetName() {
        return getDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetName__String() {
        return getDeclaration().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__IsSignal() {
        return getDeclaration().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetSignal__boolean() {
        return getDeclaration().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetUuid() {
        return getDeclaration().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__SetUuid__String() {
        return getDeclaration().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetInternalDeclaration() {
        return getDeclaration().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__IsExactlyDeclaration() {
        return getDeclaration().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PreDelete() {
        return getDeclaration().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetPostDeleteFunction() {
        return getDeclaration().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetPostDeleteEvent() {
        return getDeclaration().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PreSave() {
        return getDeclaration().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PostSave() {
        return getDeclaration().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetRootElement() {
        return getDeclaration().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__ModelElementContainer_int_int() {
        return getDeclaration().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PreMove__ModelElementContainer_int_int() {
        return getDeclaration().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getDeclaration().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PreResize__int_int_int_int_Direction() {
        return getDeclaration().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__PostResize__int_int_int_int_Direction() {
        return getDeclaration().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__RootState_int_int() {
        return getDeclaration().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__RootState_int_int() {
        return getDeclaration().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__RootState_int_int() {
        return getDeclaration().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__SuperState_int_int() {
        return getDeclaration().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__SuperState_int_int() {
        return getDeclaration().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__SuperState_int_int() {
        return getDeclaration().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__InitilalSuperState_int_int() {
        return getDeclaration().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__InitilalSuperState_int_int() {
        return getDeclaration().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__InitilalSuperState_int_int() {
        return getDeclaration().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__FinalSuperState_int_int() {
        return getDeclaration().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__FinalSuperState_int_int() {
        return getDeclaration().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__FinalSuperState_int_int() {
        return getDeclaration().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__SCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__SCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__SCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__InitialSCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__InitialSCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__InitialSCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__CanMoveTo__FinalSCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__MoveTo__FinalSCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__S_moveTo__FinalSCChartReferece_int_int() {
        return getDeclaration().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeclaration__GetDeclarationView() {
        return getDeclaration().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuspend() {
		if (suspendEClass == null) {
			suspendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(7);
		}
		return suspendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetCondition() {
        return getSuspend().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__SetCondition__String() {
        return getSuspend().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetSuspendType() {
        return getSuspend().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__SetSuspendType__String() {
        return getSuspend().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetUuid() {
        return getSuspend().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__SetUuid__String() {
        return getSuspend().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetInternalSuspend() {
        return getSuspend().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__IsExactlySuspend() {
        return getSuspend().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PreDelete() {
        return getSuspend().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetPostDeleteFunction() {
        return getSuspend().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetPostDeleteEvent() {
        return getSuspend().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PreSave() {
        return getSuspend().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PostSave() {
        return getSuspend().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetRootElement() {
        return getSuspend().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__ModelElementContainer_int_int() {
        return getSuspend().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PreMove__ModelElementContainer_int_int() {
        return getSuspend().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSuspend().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PreResize__int_int_int_int_Direction() {
        return getSuspend().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__PostResize__int_int_int_int_Direction() {
        return getSuspend().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__RootState_int_int() {
        return getSuspend().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__RootState_int_int() {
        return getSuspend().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__RootState_int_int() {
        return getSuspend().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__SuperState_int_int() {
        return getSuspend().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__SuperState_int_int() {
        return getSuspend().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__SuperState_int_int() {
        return getSuspend().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__InitilalSuperState_int_int() {
        return getSuspend().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__InitilalSuperState_int_int() {
        return getSuspend().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__InitilalSuperState_int_int() {
        return getSuspend().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__FinalSuperState_int_int() {
        return getSuspend().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__FinalSuperState_int_int() {
        return getSuspend().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__FinalSuperState_int_int() {
        return getSuspend().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__SCChartReferece_int_int() {
        return getSuspend().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__SCChartReferece_int_int() {
        return getSuspend().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__SCChartReferece_int_int() {
        return getSuspend().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__InitialSCChartReferece_int_int() {
        return getSuspend().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__InitialSCChartReferece_int_int() {
        return getSuspend().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__InitialSCChartReferece_int_int() {
        return getSuspend().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__CanMoveTo__FinalSCChartReferece_int_int() {
        return getSuspend().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__MoveTo__FinalSCChartReferece_int_int() {
        return getSuspend().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__S_moveTo__FinalSCChartReferece_int_int() {
        return getSuspend().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuspend__GetSuspendView() {
        return getSuspend().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		if (actionEClass == null) {
			actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(8);
		}
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetActionType() {
        return getAction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__SetActionType__String() {
        return getAction().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetCondition() {
        return getAction().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__SetCondition__String() {
        return getAction().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetEffect() {
        return getAction().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__SetEffect__String() {
        return getAction().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetUuid() {
        return getAction().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__SetUuid__String() {
        return getAction().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetInternalAction() {
        return getAction().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__IsExactlyAction() {
        return getAction().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PreDelete() {
        return getAction().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetPostDeleteFunction() {
        return getAction().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetPostDeleteEvent() {
        return getAction().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PreSave() {
        return getAction().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PostSave() {
        return getAction().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetRootElement() {
        return getAction().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__ModelElementContainer_int_int() {
        return getAction().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PreMove__ModelElementContainer_int_int() {
        return getAction().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getAction().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PreResize__int_int_int_int_Direction() {
        return getAction().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PostResize__int_int_int_int_Direction() {
        return getAction().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__RootState_int_int() {
        return getAction().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__RootState_int_int() {
        return getAction().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__RootState_int_int() {
        return getAction().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__SuperState_int_int() {
        return getAction().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__SuperState_int_int() {
        return getAction().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__SuperState_int_int() {
        return getAction().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__InitilalSuperState_int_int() {
        return getAction().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__InitilalSuperState_int_int() {
        return getAction().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__InitilalSuperState_int_int() {
        return getAction().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__FinalSuperState_int_int() {
        return getAction().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__FinalSuperState_int_int() {
        return getAction().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__FinalSuperState_int_int() {
        return getAction().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__SCChartReferece_int_int() {
        return getAction().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__SCChartReferece_int_int() {
        return getAction().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__SCChartReferece_int_int() {
        return getAction().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__InitialSCChartReferece_int_int() {
        return getAction().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__InitialSCChartReferece_int_int() {
        return getAction().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__InitialSCChartReferece_int_int() {
        return getAction().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__CanMoveTo__FinalSCChartReferece_int_int() {
        return getAction().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__MoveTo__FinalSCChartReferece_int_int() {
        return getAction().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__S_moveTo__FinalSCChartReferece_int_int() {
        return getAction().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__GetActionView() {
        return getAction().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleState() {
		if (simpleStateEClass == null) {
			simpleStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(9);
		}
		return simpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetName() {
        return getSimpleState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__SetName__String() {
        return getSimpleState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetLabel() {
        return getSimpleState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__SetLabel__String() {
        return getSimpleState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInternalSimpleState() {
        return getSimpleState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__IsExactlySimpleState() {
        return getSimpleState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreDelete() {
        return getSimpleState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetPostDeleteFunction() {
        return getSimpleState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetPostDeleteEvent() {
        return getSimpleState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreSave() {
        return getSimpleState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PostSave() {
        return getSimpleState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetRootElement() {
        return getSimpleState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoing() {
        return getSimpleState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSuccessors() {
        return getSimpleState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncoming() {
        return getSimpleState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetPredecessors() {
        return getSimpleState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__ModelElementContainer_int_int() {
        return getSimpleState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreMove__ModelElementContainer_int_int() {
        return getSimpleState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSimpleState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreResize__int_int_int_int_Direction() {
        return getSimpleState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PostResize__int_int_int_int_Direction() {
        return getSimpleState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingImmediateTransitions() {
        return getSimpleState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingTransitions() {
        return getSimpleState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingAbstractTransitions() {
        return getSimpleState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingConditionalTerminationTransitions() {
        return getSimpleState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingStrongAbortTransitions() {
        return getSimpleState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingImmediateTransitions() {
        return getSimpleState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingTransitions() {
        return getSimpleState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingAbstractTransitions() {
        return getSimpleState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingTerminationTransitions() {
        return getSimpleState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingImmediateStrongAbortTransitions() {
        return getSimpleState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetRootStatePredecessors() {
        return getSimpleState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSuperStatePredecessors() {
        return getSimpleState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitilalSuperStatePredecessors() {
        return getSimpleState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetFinalSuperStatePredecessors() {
        return getSimpleState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStatePredecessors() {
        return getSimpleState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitialStatePredecessors() {
        return getSimpleState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetFinalStatePredecessors() {
        return getSimpleState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetConnectorPredecessors() {
        return getSimpleState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSuperStateSuccessors() {
        return getSimpleState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitilalSuperStateSuccessors() {
        return getSimpleState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetFinalSuperStateSuccessors() {
        return getSimpleState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStateSuccessors() {
        return getSimpleState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitialStateSuccessors() {
        return getSimpleState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetFinalStateSuccessors() {
        return getSimpleState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetConnectorSuccessors() {
        return getSimpleState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__Connector() {
        return getSimpleState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__Connector() {
        return getSimpleState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__Connector_String() {
        return getSimpleState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__SuperState() {
        return getSimpleState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SuperState() {
        return getSimpleState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__SimpleState() {
        return getSimpleState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SimpleState() {
        return getSimpleState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__InitialState() {
        return getSimpleState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitialState() {
        return getSimpleState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__FinalSuperState() {
        return getSimpleState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalSuperState() {
        return getSimpleState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalSuperState_String() {
        return getSimpleState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__FinalState() {
        return getSimpleState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalState() {
        return getSimpleState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__Connector() {
        return getSimpleState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__Connector() {
        return getSimpleState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__Connector_String() {
        return getSimpleState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__SuperState() {
        return getSimpleState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SuperState() {
        return getSimpleState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__SimpleState() {
        return getSimpleState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SimpleState() {
        return getSimpleState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__InitialState() {
        return getSimpleState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitialState() {
        return getSimpleState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__FinalSuperState() {
        return getSimpleState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalSuperState() {
        return getSimpleState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalSuperState_String() {
        return getSimpleState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__FinalState() {
        return getSimpleState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalState() {
        return getSimpleState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__Region_int_int() {
        return getSimpleState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__Region_int_int() {
        return getSimpleState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__Region_int_int() {
        return getSimpleState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__DataFlowRegion_int_int() {
        return getSimpleState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__DataFlowRegion_int_int() {
        return getSimpleState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__DataFlowRegion_int_int() {
        return getSimpleState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__SCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__SCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__SCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__InitialSCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__InitialSCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__FinalSCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__FinalSCChartReferece_int_int() {
        return getSimpleState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStateView() {
        return getSimpleState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialState() {
		if (initialStateEClass == null) {
			initialStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(10);
		}
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInternalInitialState() {
        return getInitialState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__IsExactlyInitialState() {
        return getInitialState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreDelete() {
        return getInitialState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetPostDeleteFunction() {
        return getInitialState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetPostDeleteEvent() {
        return getInitialState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreSave() {
        return getInitialState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PostSave() {
        return getInitialState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetRootElement() {
        return getInitialState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoing() {
        return getInitialState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSuccessors() {
        return getInitialState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncoming() {
        return getInitialState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetPredecessors() {
        return getInitialState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__ModelElementContainer_int_int() {
        return getInitialState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreMove__ModelElementContainer_int_int() {
        return getInitialState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInitialState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreResize__int_int_int_int_Direction() {
        return getInitialState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PostResize__int_int_int_int_Direction() {
        return getInitialState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingImmediateTransitions() {
        return getInitialState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingTransitions() {
        return getInitialState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingAbstractTransitions() {
        return getInitialState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingConditionalTerminationTransitions() {
        return getInitialState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingStrongAbortTransitions() {
        return getInitialState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingImmediateTransitions() {
        return getInitialState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingTransitions() {
        return getInitialState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingAbstractTransitions() {
        return getInitialState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingTerminationTransitions() {
        return getInitialState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingImmediateStrongAbortTransitions() {
        return getInitialState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetRootStatePredecessors() {
        return getInitialState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSuperStatePredecessors() {
        return getInitialState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitilalSuperStatePredecessors() {
        return getInitialState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetFinalSuperStatePredecessors() {
        return getInitialState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSimpleStatePredecessors() {
        return getInitialState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStatePredecessors() {
        return getInitialState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetFinalStatePredecessors() {
        return getInitialState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetConnectorPredecessors() {
        return getInitialState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSuperStateSuccessors() {
        return getInitialState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitilalSuperStateSuccessors() {
        return getInitialState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetFinalSuperStateSuccessors() {
        return getInitialState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSimpleStateSuccessors() {
        return getInitialState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStateSuccessors() {
        return getInitialState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetFinalStateSuccessors() {
        return getInitialState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetConnectorSuccessors() {
        return getInitialState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__Connector() {
        return getInitialState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__Connector() {
        return getInitialState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__Connector_String() {
        return getInitialState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__SuperState() {
        return getInitialState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SuperState() {
        return getInitialState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SuperState_String() {
        return getInitialState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__SimpleState() {
        return getInitialState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SimpleState() {
        return getInitialState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__InitialState() {
        return getInitialState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitialState() {
        return getInitialState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitialState_String() {
        return getInitialState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__FinalSuperState() {
        return getInitialState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalSuperState() {
        return getInitialState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalSuperState_String() {
        return getInitialState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__FinalState() {
        return getInitialState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalState() {
        return getInitialState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalState_String() {
        return getInitialState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__Connector() {
        return getInitialState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__Connector() {
        return getInitialState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__Connector_String() {
        return getInitialState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__SuperState() {
        return getInitialState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SuperState() {
        return getInitialState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SuperState_String() {
        return getInitialState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__SimpleState() {
        return getInitialState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SimpleState() {
        return getInitialState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__InitialState() {
        return getInitialState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitialState() {
        return getInitialState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitialState_String() {
        return getInitialState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__FinalSuperState() {
        return getInitialState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalSuperState() {
        return getInitialState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalSuperState_String() {
        return getInitialState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__FinalState() {
        return getInitialState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalState() {
        return getInitialState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalState_String() {
        return getInitialState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__Region_int_int() {
        return getInitialState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__Region_int_int() {
        return getInitialState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__Region_int_int() {
        return getInitialState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__DataFlowRegion_int_int() {
        return getInitialState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__DataFlowRegion_int_int() {
        return getInitialState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__DataFlowRegion_int_int() {
        return getInitialState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__SCChartReferece_int_int() {
        return getInitialState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__SCChartReferece_int_int() {
        return getInitialState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__SCChartReferece_int_int() {
        return getInitialState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getInitialState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__InitialSCChartReferece_int_int() {
        return getInitialState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__InitialSCChartReferece_int_int() {
        return getInitialState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getInitialState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__FinalSCChartReferece_int_int() {
        return getInitialState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__FinalSCChartReferece_int_int() {
        return getInitialState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStateView() {
        return getInitialState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalState() {
		if (finalStateEClass == null) {
			finalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(11);
		}
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInternalFinalState() {
        return getFinalState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__IsExactlyFinalState() {
        return getFinalState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreDelete() {
        return getFinalState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetPostDeleteFunction() {
        return getFinalState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetPostDeleteEvent() {
        return getFinalState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreSave() {
        return getFinalState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PostSave() {
        return getFinalState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetRootElement() {
        return getFinalState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoing() {
        return getFinalState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSuccessors() {
        return getFinalState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncoming() {
        return getFinalState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetPredecessors() {
        return getFinalState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__ModelElementContainer_int_int() {
        return getFinalState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreMove__ModelElementContainer_int_int() {
        return getFinalState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getFinalState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreResize__int_int_int_int_Direction() {
        return getFinalState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PostResize__int_int_int_int_Direction() {
        return getFinalState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingImmediateTransitions() {
        return getFinalState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingTransitions() {
        return getFinalState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingAbstractTransitions() {
        return getFinalState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingConditionalTerminationTransitions() {
        return getFinalState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingStrongAbortTransitions() {
        return getFinalState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingImmediateTransitions() {
        return getFinalState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingTransitions() {
        return getFinalState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingAbstractTransitions() {
        return getFinalState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingTerminationTransitions() {
        return getFinalState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingImmediateStrongAbortTransitions() {
        return getFinalState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetRootStatePredecessors() {
        return getFinalState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSuperStatePredecessors() {
        return getFinalState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitilalSuperStatePredecessors() {
        return getFinalState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalSuperStatePredecessors() {
        return getFinalState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSimpleStatePredecessors() {
        return getFinalState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitialStatePredecessors() {
        return getFinalState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStatePredecessors() {
        return getFinalState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetConnectorPredecessors() {
        return getFinalState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSuperStateSuccessors() {
        return getFinalState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitilalSuperStateSuccessors() {
        return getFinalState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalSuperStateSuccessors() {
        return getFinalState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSimpleStateSuccessors() {
        return getFinalState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitialStateSuccessors() {
        return getFinalState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStateSuccessors() {
        return getFinalState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetConnectorSuccessors() {
        return getFinalState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__Connector() {
        return getFinalState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__Connector() {
        return getFinalState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__Connector_String() {
        return getFinalState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__SuperState() {
        return getFinalState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SuperState() {
        return getFinalState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SuperState_String() {
        return getFinalState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__SimpleState() {
        return getFinalState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SimpleState() {
        return getFinalState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__InitialState() {
        return getFinalState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitialState() {
        return getFinalState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitialState_String() {
        return getFinalState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__FinalSuperState() {
        return getFinalState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalSuperState() {
        return getFinalState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalSuperState_String() {
        return getFinalState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__FinalState() {
        return getFinalState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalState() {
        return getFinalState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalState_String() {
        return getFinalState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__Connector() {
        return getFinalState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__Connector() {
        return getFinalState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__Connector_String() {
        return getFinalState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__SuperState() {
        return getFinalState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SuperState() {
        return getFinalState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SuperState_String() {
        return getFinalState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__SimpleState() {
        return getFinalState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SimpleState() {
        return getFinalState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__InitialState() {
        return getFinalState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitialState() {
        return getFinalState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitialState_String() {
        return getFinalState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__FinalSuperState() {
        return getFinalState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalSuperState() {
        return getFinalState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalSuperState_String() {
        return getFinalState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__FinalState() {
        return getFinalState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalState() {
        return getFinalState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalState_String() {
        return getFinalState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__Region_int_int() {
        return getFinalState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__Region_int_int() {
        return getFinalState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__Region_int_int() {
        return getFinalState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__DataFlowRegion_int_int() {
        return getFinalState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__DataFlowRegion_int_int() {
        return getFinalState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__DataFlowRegion_int_int() {
        return getFinalState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__SCChartReferece_int_int() {
        return getFinalState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__SCChartReferece_int_int() {
        return getFinalState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__SCChartReferece_int_int() {
        return getFinalState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__InitialSCChartReferece_int_int() {
        return getFinalState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__InitialSCChartReferece_int_int() {
        return getFinalState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__InitialSCChartReferece_int_int() {
        return getFinalState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__FinalSCChartReferece_int_int() {
        return getFinalState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__FinalSCChartReferece_int_int() {
        return getFinalState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__FinalSCChartReferece_int_int() {
        return getFinalState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStateView() {
        return getFinalState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		if (connectorEClass == null) {
			connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(12);
		}
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInternalConnector() {
        return getConnector().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__IsExactlyConnector() {
        return getConnector().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreDelete() {
        return getConnector().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetPostDeleteFunction() {
        return getConnector().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetPostDeleteEvent() {
        return getConnector().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreSave() {
        return getConnector().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PostSave() {
        return getConnector().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetRootElement() {
        return getConnector().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoing() {
        return getConnector().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSuccessors() {
        return getConnector().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncoming() {
        return getConnector().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetPredecessors() {
        return getConnector().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__ModelElementContainer_int_int() {
        return getConnector().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreMove__ModelElementContainer_int_int() {
        return getConnector().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getConnector().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreResize__int_int_int_int_Direction() {
        return getConnector().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PostResize__int_int_int_int_Direction() {
        return getConnector().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingImmediateTransitions() {
        return getConnector().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingTransitions() {
        return getConnector().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingAbstractTransitions() {
        return getConnector().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingConditionalTerminationTransitions() {
        return getConnector().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingStrongAbortTransitions() {
        return getConnector().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingImmediateTransitions() {
        return getConnector().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingTransitions() {
        return getConnector().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingAbstractTransitions() {
        return getConnector().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingTerminationTransitions() {
        return getConnector().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingImmediateStrongAbortTransitions() {
        return getConnector().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetRootStatePredecessors() {
        return getConnector().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSuperStatePredecessors() {
        return getConnector().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitilalSuperStatePredecessors() {
        return getConnector().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetFinalSuperStatePredecessors() {
        return getConnector().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSimpleStatePredecessors() {
        return getConnector().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitialStatePredecessors() {
        return getConnector().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetFinalStatePredecessors() {
        return getConnector().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorPredecessors() {
        return getConnector().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSuperStateSuccessors() {
        return getConnector().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitilalSuperStateSuccessors() {
        return getConnector().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetFinalSuperStateSuccessors() {
        return getConnector().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSimpleStateSuccessors() {
        return getConnector().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitialStateSuccessors() {
        return getConnector().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetFinalStateSuccessors() {
        return getConnector().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorSuccessors() {
        return getConnector().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__Connector() {
        return getConnector().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__Connector() {
        return getConnector().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__Connector_String() {
        return getConnector().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__SuperState() {
        return getConnector().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SuperState() {
        return getConnector().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SuperState_String() {
        return getConnector().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__SimpleState() {
        return getConnector().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SimpleState() {
        return getConnector().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SimpleState_String() {
        return getConnector().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__InitialState() {
        return getConnector().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitialState() {
        return getConnector().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitialState_String() {
        return getConnector().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__FinalSuperState() {
        return getConnector().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalSuperState() {
        return getConnector().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalSuperState_String() {
        return getConnector().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__FinalState() {
        return getConnector().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalState() {
        return getConnector().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalState_String() {
        return getConnector().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__Connector() {
        return getConnector().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__Connector() {
        return getConnector().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__Connector_String() {
        return getConnector().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__SuperState() {
        return getConnector().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SuperState() {
        return getConnector().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SuperState_String() {
        return getConnector().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__SimpleState() {
        return getConnector().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SimpleState() {
        return getConnector().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SimpleState_String() {
        return getConnector().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__InitialState() {
        return getConnector().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitialState() {
        return getConnector().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitialState_String() {
        return getConnector().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__FinalSuperState() {
        return getConnector().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalSuperState() {
        return getConnector().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalSuperState_String() {
        return getConnector().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__FinalState() {
        return getConnector().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalState() {
        return getConnector().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalState_String() {
        return getConnector().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__Region_int_int() {
        return getConnector().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__Region_int_int() {
        return getConnector().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__Region_int_int() {
        return getConnector().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__DataFlowRegion_int_int() {
        return getConnector().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__DataFlowRegion_int_int() {
        return getConnector().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__DataFlowRegion_int_int() {
        return getConnector().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__SCChartReferece_int_int() {
        return getConnector().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__SCChartReferece_int_int() {
        return getConnector().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__SCChartReferece_int_int() {
        return getConnector().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__InitialSCChartReferece_int_int() {
        return getConnector().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__InitialSCChartReferece_int_int() {
        return getConnector().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__InitialSCChartReferece_int_int() {
        return getConnector().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__FinalSCChartReferece_int_int() {
        return getConnector().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__FinalSCChartReferece_int_int() {
        return getConnector().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__FinalSCChartReferece_int_int() {
        return getConnector().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorView() {
        return getConnector().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		if (inputEClass == null) {
			inputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(13);
		}
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetLabel() {
        return getInput().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__SetLabel__String() {
        return getInput().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetInternalInput() {
        return getInput().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__IsExactlyInput() {
        return getInput().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PreDelete() {
        return getInput().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetPostDeleteFunction() {
        return getInput().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetPostDeleteEvent() {
        return getInput().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PreSave() {
        return getInput().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PostSave() {
        return getInput().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetRootElement() {
        return getInput().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetOutgoing() {
        return getInput().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetSuccessors() {
        return getInput().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__S_moveTo__ModelElementContainer_int_int() {
        return getInput().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PreMove__ModelElementContainer_int_int() {
        return getInput().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInput().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PreResize__int_int_int_int_Direction() {
        return getInput().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__PostResize__int_int_int_int_Direction() {
        return getInput().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetOutgoingConnections() {
        return getInput().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetOutputSuccessors() {
        return getInput().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetOperatorSuccessors() {
        return getInput().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetCircuitConnecterSuccessors() {
        return getInput().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanNewConnection__Operator() {
        return getInput().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__NewConnection__Operator() {
        return getInput().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__NewConnection__Operator_String() {
        return getInput().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanNewConnection__CircuitConnecter() {
        return getInput().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__NewConnection__CircuitConnecter() {
        return getInput().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__NewConnection__CircuitConnecter_String() {
        return getInput().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanNewConnection__Output() {
        return getInput().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__NewConnection__Output() {
        return getInput().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__NewConnection__Output_String() {
        return getInput().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanMoveTo__DataFlowRegion_int_int() {
        return getInput().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__MoveTo__DataFlowRegion_int_int() {
        return getInput().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__S_moveTo__DataFlowRegion_int_int() {
        return getInput().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanMoveTo__SCChartReferece_int_int() {
        return getInput().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__MoveTo__SCChartReferece_int_int() {
        return getInput().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__S_moveTo__SCChartReferece_int_int() {
        return getInput().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanMoveTo__InitialSCChartReferece_int_int() {
        return getInput().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__MoveTo__InitialSCChartReferece_int_int() {
        return getInput().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__S_moveTo__InitialSCChartReferece_int_int() {
        return getInput().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__CanMoveTo__FinalSCChartReferece_int_int() {
        return getInput().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__MoveTo__FinalSCChartReferece_int_int() {
        return getInput().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__S_moveTo__FinalSCChartReferece_int_int() {
        return getInput().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInput__GetInputView() {
        return getInput().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		if (outputEClass == null) {
			outputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(14);
		}
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetLabel() {
        return getOutput().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__SetLabel__String() {
        return getOutput().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetInternalOutput() {
        return getOutput().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__IsExactlyOutput() {
        return getOutput().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PreDelete() {
        return getOutput().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetPostDeleteFunction() {
        return getOutput().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetPostDeleteEvent() {
        return getOutput().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PreSave() {
        return getOutput().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PostSave() {
        return getOutput().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetRootElement() {
        return getOutput().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetIncoming() {
        return getOutput().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetPredecessors() {
        return getOutput().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__S_moveTo__ModelElementContainer_int_int() {
        return getOutput().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PreMove__ModelElementContainer_int_int() {
        return getOutput().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getOutput().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PreResize__int_int_int_int_Direction() {
        return getOutput().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__PostResize__int_int_int_int_Direction() {
        return getOutput().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetIncomingConnections() {
        return getOutput().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetRootStatePredecessors() {
        return getOutput().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetInputPredecessors() {
        return getOutput().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetOperatorPredecessors() {
        return getOutput().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetCircuitConnecterPredecessors() {
        return getOutput().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__CanMoveTo__DataFlowRegion_int_int() {
        return getOutput().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__MoveTo__DataFlowRegion_int_int() {
        return getOutput().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__S_moveTo__DataFlowRegion_int_int() {
        return getOutput().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__CanMoveTo__SCChartReferece_int_int() {
        return getOutput().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__MoveTo__SCChartReferece_int_int() {
        return getOutput().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__S_moveTo__SCChartReferece_int_int() {
        return getOutput().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__CanMoveTo__InitialSCChartReferece_int_int() {
        return getOutput().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__MoveTo__InitialSCChartReferece_int_int() {
        return getOutput().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__S_moveTo__InitialSCChartReferece_int_int() {
        return getOutput().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__CanMoveTo__FinalSCChartReferece_int_int() {
        return getOutput().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__MoveTo__FinalSCChartReferece_int_int() {
        return getOutput().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__S_moveTo__FinalSCChartReferece_int_int() {
        return getOutput().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutput__GetOutputView() {
        return getOutput().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperator() {
		if (operatorEClass == null) {
			operatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(15);
		}
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOperator() {
        return getOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__SetOperator__String() {
        return getOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetInternalOperator() {
        return getOperator().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__IsExactlyOperator() {
        return getOperator().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PreDelete() {
        return getOperator().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetPostDeleteFunction() {
        return getOperator().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetPostDeleteEvent() {
        return getOperator().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PreSave() {
        return getOperator().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PostSave() {
        return getOperator().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetRootElement() {
        return getOperator().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOutgoing() {
        return getOperator().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetSuccessors() {
        return getOperator().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetIncoming() {
        return getOperator().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetPredecessors() {
        return getOperator().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__S_moveTo__ModelElementContainer_int_int() {
        return getOperator().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PreMove__ModelElementContainer_int_int() {
        return getOperator().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getOperator().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PreResize__int_int_int_int_Direction() {
        return getOperator().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__PostResize__int_int_int_int_Direction() {
        return getOperator().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOutgoingConnections() {
        return getOperator().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetIncomingConnections() {
        return getOperator().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetRootStatePredecessors() {
        return getOperator().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetInputPredecessors() {
        return getOperator().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOperatorPredecessors() {
        return getOperator().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetCircuitConnecterPredecessors() {
        return getOperator().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOutputSuccessors() {
        return getOperator().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOperatorSuccessors() {
        return getOperator().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetCircuitConnecterSuccessors() {
        return getOperator().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanNewConnection__Operator() {
        return getOperator().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__NewConnection__Operator() {
        return getOperator().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__NewConnection__Operator_String() {
        return getOperator().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanNewConnection__CircuitConnecter() {
        return getOperator().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__NewConnection__CircuitConnecter() {
        return getOperator().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__NewConnection__CircuitConnecter_String() {
        return getOperator().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanNewConnection__Output() {
        return getOperator().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__NewConnection__Output() {
        return getOperator().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__NewConnection__Output_String() {
        return getOperator().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanMoveTo__DataFlowRegion_int_int() {
        return getOperator().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__MoveTo__DataFlowRegion_int_int() {
        return getOperator().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__S_moveTo__DataFlowRegion_int_int() {
        return getOperator().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanMoveTo__SCChartReferece_int_int() {
        return getOperator().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__MoveTo__SCChartReferece_int_int() {
        return getOperator().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__S_moveTo__SCChartReferece_int_int() {
        return getOperator().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanMoveTo__InitialSCChartReferece_int_int() {
        return getOperator().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__MoveTo__InitialSCChartReferece_int_int() {
        return getOperator().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__S_moveTo__InitialSCChartReferece_int_int() {
        return getOperator().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__CanMoveTo__FinalSCChartReferece_int_int() {
        return getOperator().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__MoveTo__FinalSCChartReferece_int_int() {
        return getOperator().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__S_moveTo__FinalSCChartReferece_int_int() {
        return getOperator().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetOperatorView() {
        return getOperator().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircuitConnecter() {
		if (circuitConnecterEClass == null) {
			circuitConnecterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(16);
		}
		return circuitConnecterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetInternalCircuitConnecter() {
        return getCircuitConnecter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__IsExactlyCircuitConnecter() {
        return getCircuitConnecter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PreDelete() {
        return getCircuitConnecter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetPostDeleteFunction() {
        return getCircuitConnecter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetPostDeleteEvent() {
        return getCircuitConnecter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PreSave() {
        return getCircuitConnecter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PostSave() {
        return getCircuitConnecter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetRootElement() {
        return getCircuitConnecter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetOutgoing() {
        return getCircuitConnecter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetSuccessors() {
        return getCircuitConnecter().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetIncoming() {
        return getCircuitConnecter().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetPredecessors() {
        return getCircuitConnecter().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__S_moveTo__ModelElementContainer_int_int() {
        return getCircuitConnecter().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PreMove__ModelElementContainer_int_int() {
        return getCircuitConnecter().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getCircuitConnecter().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PreResize__int_int_int_int_Direction() {
        return getCircuitConnecter().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__PostResize__int_int_int_int_Direction() {
        return getCircuitConnecter().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetOutgoingConnections() {
        return getCircuitConnecter().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetIncomingConnections() {
        return getCircuitConnecter().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetRootStatePredecessors() {
        return getCircuitConnecter().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetInputPredecessors() {
        return getCircuitConnecter().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetOperatorPredecessors() {
        return getCircuitConnecter().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetCircuitConnecterPredecessors() {
        return getCircuitConnecter().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetOutputSuccessors() {
        return getCircuitConnecter().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetOperatorSuccessors() {
        return getCircuitConnecter().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetCircuitConnecterSuccessors() {
        return getCircuitConnecter().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanNewConnection__Operator() {
        return getCircuitConnecter().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__NewConnection__Operator() {
        return getCircuitConnecter().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__NewConnection__Operator_String() {
        return getCircuitConnecter().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanNewConnection__CircuitConnecter() {
        return getCircuitConnecter().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__NewConnection__CircuitConnecter() {
        return getCircuitConnecter().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__NewConnection__CircuitConnecter_String() {
        return getCircuitConnecter().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanNewConnection__Output() {
        return getCircuitConnecter().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__NewConnection__Output() {
        return getCircuitConnecter().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__NewConnection__Output_String() {
        return getCircuitConnecter().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanMoveTo__DataFlowRegion_int_int() {
        return getCircuitConnecter().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__MoveTo__DataFlowRegion_int_int() {
        return getCircuitConnecter().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__S_moveTo__DataFlowRegion_int_int() {
        return getCircuitConnecter().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanMoveTo__SCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__MoveTo__SCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__S_moveTo__SCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanMoveTo__InitialSCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__MoveTo__InitialSCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__S_moveTo__InitialSCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__CanMoveTo__FinalSCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__MoveTo__FinalSCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__S_moveTo__FinalSCChartReferece_int_int() {
        return getCircuitConnecter().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCircuitConnecter__GetCircuitConnecterView() {
        return getCircuitConnecter().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCChartReferece() {
		if (scChartRefereceEClass == null) {
			scChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(17);
		}
		return scChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetAssignments() {
        return getSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__SetAssignments__EList() {
        return getSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__AddAssignments__String() {
        return getSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__RemoveAssignments__String() {
        return getSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetName() {
        return getSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__SetName__String() {
        return getSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetLabel() {
        return getSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__SetLabel__String() {
        return getSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetInputsOutputs() {
        return getSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__SetInputsOutputs__String() {
        return getSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetUuid() {
        return getSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__SetUuid__String() {
        return getSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetInternalSCChartReferece() {
        return getSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__IsExactlySCChartReferece() {
        return getSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PreDelete() {
        return getSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetPostDeleteFunction() {
        return getSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetPostDeleteEvent() {
        return getSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PreSave() {
        return getSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PostSave() {
        return getSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetRootElement() {
        return getSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetNodes() {
        return getSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetOperators() {
        return getSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewOperator() {
        return getSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOperator__int_int() {
        return getSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOperator__String_int_int() {
        return getSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOperator__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOperator__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetRootStates() {
        return getSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewRootState() {
        return getSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRootState__int_int() {
        return getSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRootState__String_int_int() {
        return getSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRootState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRootState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetInputs() {
        return getSCChartReferece().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewInput() {
        return getSCChartReferece().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInput__int_int() {
        return getSCChartReferece().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInput__String_int_int() {
        return getSCChartReferece().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInput__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInput__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetSuspends() {
        return getSCChartReferece().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewSuspend() {
        return getSCChartReferece().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuspend__int_int() {
        return getSCChartReferece().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuspend__String_int_int() {
        return getSCChartReferece().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuspend__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuspend__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetConnectors() {
        return getSCChartReferece().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewConnector() {
        return getSCChartReferece().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewConnector__int_int() {
        return getSCChartReferece().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewConnector__String_int_int() {
        return getSCChartReferece().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewConnector__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewConnector__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetInitialStates() {
        return getSCChartReferece().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewInitialState() {
        return getSCChartReferece().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialState__int_int() {
        return getSCChartReferece().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialState__String_int_int() {
        return getSCChartReferece().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetSCChartRefereces() {
        return getSCChartReferece().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewSCChartReferece() {
        return getSCChartReferece().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSCChartReferece__EObject_int_int() {
        return getSCChartReferece().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSCChartReferece__EObject_String_int_int() {
        return getSCChartReferece().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSCChartReferece__EObject_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSCChartReferece__EObject_String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetDeclarations() {
        return getSCChartReferece().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewDeclaration() {
        return getSCChartReferece().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDeclaration__int_int() {
        return getSCChartReferece().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDeclaration__String_int_int() {
        return getSCChartReferece().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDeclaration__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDeclaration__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetCircuitConnecters() {
        return getSCChartReferece().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewCircuitConnecter() {
        return getSCChartReferece().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewCircuitConnecter__int_int() {
        return getSCChartReferece().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewCircuitConnecter__String_int_int() {
        return getSCChartReferece().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewCircuitConnecter__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewCircuitConnecter__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetOutputs() {
        return getSCChartReferece().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewOutput() {
        return getSCChartReferece().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOutput__int_int() {
        return getSCChartReferece().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOutput__String_int_int() {
        return getSCChartReferece().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOutput__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewOutput__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetDataFlowRegions() {
        return getSCChartReferece().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewDataFlowRegion() {
        return getSCChartReferece().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDataFlowRegion__int_int() {
        return getSCChartReferece().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDataFlowRegion__String_int_int() {
        return getSCChartReferece().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDataFlowRegion__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewDataFlowRegion__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetInitilalSuperStates() {
        return getSCChartReferece().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewInitilalSuperState() {
        return getSCChartReferece().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitilalSuperState__int_int() {
        return getSCChartReferece().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitilalSuperState__String_int_int() {
        return getSCChartReferece().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitilalSuperState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitilalSuperState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetSuperStates() {
        return getSCChartReferece().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewSuperState() {
        return getSCChartReferece().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuperState__int_int() {
        return getSCChartReferece().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuperState__String_int_int() {
        return getSCChartReferece().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuperState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSuperState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetSimpleStates() {
        return getSCChartReferece().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewSimpleState() {
        return getSCChartReferece().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSimpleState__int_int() {
        return getSCChartReferece().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSimpleState__String_int_int() {
        return getSCChartReferece().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSimpleState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewSimpleState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetActions() {
        return getSCChartReferece().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewAction() {
        return getSCChartReferece().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewAction__int_int() {
        return getSCChartReferece().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewAction__String_int_int() {
        return getSCChartReferece().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewAction__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewAction__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetInitialSCChartRefereces() {
        return getSCChartReferece().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewInitialSCChartReferece() {
        return getSCChartReferece().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialSCChartReferece__EObject_int_int() {
        return getSCChartReferece().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialSCChartReferece__EObject_String_int_int() {
        return getSCChartReferece().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialSCChartReferece__EObject_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewInitialSCChartReferece__EObject_String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetFinalSCChartRefereces() {
        return getSCChartReferece().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewFinalSCChartReferece() {
        return getSCChartReferece().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSCChartReferece__EObject_int_int() {
        return getSCChartReferece().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSCChartReferece__EObject_String_int_int() {
        return getSCChartReferece().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSCChartReferece__EObject_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSCChartReferece__EObject_String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetRegions() {
        return getSCChartReferece().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewRegion() {
        return getSCChartReferece().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRegion__int_int() {
        return getSCChartReferece().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRegion__String_int_int() {
        return getSCChartReferece().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRegion__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewRegion__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetFinalSuperStates() {
        return getSCChartReferece().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewFinalSuperState() {
        return getSCChartReferece().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSuperState__int_int() {
        return getSCChartReferece().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSuperState__String_int_int() {
        return getSCChartReferece().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSuperState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalSuperState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetFinalStates() {
        return getSCChartReferece().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanNewFinalState() {
        return getSCChartReferece().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalState__int_int() {
        return getSCChartReferece().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalState__String_int_int() {
        return getSCChartReferece().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalState__int_int_int_int() {
        return getSCChartReferece().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__NewFinalState__String_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__S_moveTo__ModelElementContainer_int_int() {
        return getSCChartReferece().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PreMove__ModelElementContainer_int_int() {
        return getSCChartReferece().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSCChartReferece().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PreResize__int_int_int_int_Direction() {
        return getSCChartReferece().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__PostResize__int_int_int_int_Direction() {
        return getSCChartReferece().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanMoveTo__Region_int_int() {
        return getSCChartReferece().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__MoveTo__Region_int_int() {
        return getSCChartReferece().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__S_moveTo__Region_int_int() {
        return getSCChartReferece().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanMoveTo__DataFlowRegion_int_int() {
        return getSCChartReferece().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__MoveTo__DataFlowRegion_int_int() {
        return getSCChartReferece().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__S_moveTo__DataFlowRegion_int_int() {
        return getSCChartReferece().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanMoveTo__SCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__MoveTo__SCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__S_moveTo__SCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanMoveTo__InitialSCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__MoveTo__InitialSCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__S_moveTo__InitialSCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__CanMoveTo__FinalSCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__MoveTo__FinalSCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__S_moveTo__FinalSCChartReferece_int_int() {
        return getSCChartReferece().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetReference() {
        return getSCChartReferece().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetLibraryComponentUID() {
        return getSCChartReferece().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__SetLibraryComponentUID__String() {
        return getSCChartReferece().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChartReferece__GetSCChartRefereceView() {
        return getSCChartReferece().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialSCChartReferece() {
		if (initialSCChartRefereceEClass == null) {
			initialSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(18);
		}
		return initialSCChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetInternalInitialSCChartReferece() {
        return getInitialSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__IsExactlyInitialSCChartReferece() {
        return getInitialSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PreDelete() {
        return getInitialSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetPostDeleteFunction() {
        return getInitialSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetPostDeleteEvent() {
        return getInitialSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PreSave() {
        return getInitialSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PostSave() {
        return getInitialSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetRootElement() {
        return getInitialSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetNodes() {
        return getInitialSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetOperators() {
        return getInitialSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewOperator() {
        return getInitialSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOperator__int_int() {
        return getInitialSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOperator__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOperator__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOperator__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetRootStates() {
        return getInitialSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewRootState() {
        return getInitialSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRootState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRootState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRootState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRootState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetInputs() {
        return getInitialSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewInput() {
        return getInitialSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInput__int_int() {
        return getInitialSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInput__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInput__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInput__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetSuspends() {
        return getInitialSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewSuspend() {
        return getInitialSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuspend__int_int() {
        return getInitialSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuspend__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuspend__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuspend__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetConnectors() {
        return getInitialSCChartReferece().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewConnector() {
        return getInitialSCChartReferece().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewConnector__int_int() {
        return getInitialSCChartReferece().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewConnector__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewConnector__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewConnector__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetInitialStates() {
        return getInitialSCChartReferece().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewInitialState() {
        return getInitialSCChartReferece().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetSCChartRefereces() {
        return getInitialSCChartReferece().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewSCChartReferece() {
        return getInitialSCChartReferece().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSCChartReferece__EObject_int_int() {
        return getInitialSCChartReferece().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSCChartReferece__EObject_String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSCChartReferece__EObject_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSCChartReferece__EObject_String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetDeclarations() {
        return getInitialSCChartReferece().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewDeclaration() {
        return getInitialSCChartReferece().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDeclaration__int_int() {
        return getInitialSCChartReferece().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDeclaration__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDeclaration__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDeclaration__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetCircuitConnecters() {
        return getInitialSCChartReferece().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewCircuitConnecter() {
        return getInitialSCChartReferece().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewCircuitConnecter__int_int() {
        return getInitialSCChartReferece().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewCircuitConnecter__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewCircuitConnecter__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewCircuitConnecter__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetOutputs() {
        return getInitialSCChartReferece().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewOutput() {
        return getInitialSCChartReferece().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOutput__int_int() {
        return getInitialSCChartReferece().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOutput__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOutput__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewOutput__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetDataFlowRegions() {
        return getInitialSCChartReferece().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewDataFlowRegion() {
        return getInitialSCChartReferece().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDataFlowRegion__int_int() {
        return getInitialSCChartReferece().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDataFlowRegion__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDataFlowRegion__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewDataFlowRegion__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetInitilalSuperStates() {
        return getInitialSCChartReferece().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewInitilalSuperState() {
        return getInitialSCChartReferece().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitilalSuperState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitilalSuperState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitilalSuperState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitilalSuperState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetSuperStates() {
        return getInitialSCChartReferece().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewSuperState() {
        return getInitialSCChartReferece().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuperState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuperState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuperState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSuperState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetSimpleStates() {
        return getInitialSCChartReferece().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewSimpleState() {
        return getInitialSCChartReferece().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSimpleState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSimpleState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSimpleState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewSimpleState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetActions() {
        return getInitialSCChartReferece().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewAction() {
        return getInitialSCChartReferece().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewAction__int_int() {
        return getInitialSCChartReferece().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewAction__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewAction__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewAction__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetInitialSCChartRefereces() {
        return getInitialSCChartReferece().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewInitialSCChartReferece() {
        return getInitialSCChartReferece().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialSCChartReferece__EObject_int_int() {
        return getInitialSCChartReferece().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialSCChartReferece__EObject_String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialSCChartReferece__EObject_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewInitialSCChartReferece__EObject_String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetFinalSCChartRefereces() {
        return getInitialSCChartReferece().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewFinalSCChartReferece() {
        return getInitialSCChartReferece().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSCChartReferece__EObject_int_int() {
        return getInitialSCChartReferece().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSCChartReferece__EObject_String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSCChartReferece__EObject_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSCChartReferece__EObject_String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetRegions() {
        return getInitialSCChartReferece().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewRegion() {
        return getInitialSCChartReferece().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRegion__int_int() {
        return getInitialSCChartReferece().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRegion__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRegion__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewRegion__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetFinalSuperStates() {
        return getInitialSCChartReferece().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewFinalSuperState() {
        return getInitialSCChartReferece().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSuperState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSuperState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSuperState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalSuperState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetFinalStates() {
        return getInitialSCChartReferece().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanNewFinalState() {
        return getInitialSCChartReferece().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalState__int_int() {
        return getInitialSCChartReferece().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalState__String_int_int() {
        return getInitialSCChartReferece().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalState__int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__NewFinalState__String_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__S_moveTo__ModelElementContainer_int_int() {
        return getInitialSCChartReferece().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PreMove__ModelElementContainer_int_int() {
        return getInitialSCChartReferece().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInitialSCChartReferece().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PreResize__int_int_int_int_Direction() {
        return getInitialSCChartReferece().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__PostResize__int_int_int_int_Direction() {
        return getInitialSCChartReferece().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanMoveTo__Region_int_int() {
        return getInitialSCChartReferece().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__MoveTo__Region_int_int() {
        return getInitialSCChartReferece().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__S_moveTo__Region_int_int() {
        return getInitialSCChartReferece().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanMoveTo__DataFlowRegion_int_int() {
        return getInitialSCChartReferece().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__MoveTo__DataFlowRegion_int_int() {
        return getInitialSCChartReferece().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__S_moveTo__DataFlowRegion_int_int() {
        return getInitialSCChartReferece().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanMoveTo__SCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__MoveTo__SCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__S_moveTo__SCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanMoveTo__InitialSCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__MoveTo__InitialSCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__S_moveTo__InitialSCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__CanMoveTo__FinalSCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__MoveTo__FinalSCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__S_moveTo__FinalSCChartReferece_int_int() {
        return getInitialSCChartReferece().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetReference() {
        return getInitialSCChartReferece().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialSCChartReferece__GetInitialSCChartRefereceView() {
        return getInitialSCChartReferece().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalSCChartReferece() {
		if (finalSCChartRefereceEClass == null) {
			finalSCChartRefereceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(19);
		}
		return finalSCChartRefereceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetInternalFinalSCChartReferece() {
        return getFinalSCChartReferece().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__IsExactlyFinalSCChartReferece() {
        return getFinalSCChartReferece().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PreDelete() {
        return getFinalSCChartReferece().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetPostDeleteFunction() {
        return getFinalSCChartReferece().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetPostDeleteEvent() {
        return getFinalSCChartReferece().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PreSave() {
        return getFinalSCChartReferece().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PostSave() {
        return getFinalSCChartReferece().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetRootElement() {
        return getFinalSCChartReferece().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetNodes() {
        return getFinalSCChartReferece().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetOperators() {
        return getFinalSCChartReferece().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewOperator() {
        return getFinalSCChartReferece().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOperator__int_int() {
        return getFinalSCChartReferece().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOperator__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOperator__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOperator__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetRootStates() {
        return getFinalSCChartReferece().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewRootState() {
        return getFinalSCChartReferece().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRootState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRootState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRootState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRootState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetInputs() {
        return getFinalSCChartReferece().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewInput() {
        return getFinalSCChartReferece().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInput__int_int() {
        return getFinalSCChartReferece().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInput__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInput__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInput__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetSuspends() {
        return getFinalSCChartReferece().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewSuspend() {
        return getFinalSCChartReferece().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuspend__int_int() {
        return getFinalSCChartReferece().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuspend__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuspend__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuspend__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetConnectors() {
        return getFinalSCChartReferece().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewConnector() {
        return getFinalSCChartReferece().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewConnector__int_int() {
        return getFinalSCChartReferece().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewConnector__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewConnector__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewConnector__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetInitialStates() {
        return getFinalSCChartReferece().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewInitialState() {
        return getFinalSCChartReferece().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetSCChartRefereces() {
        return getFinalSCChartReferece().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewSCChartReferece() {
        return getFinalSCChartReferece().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSCChartReferece__EObject_int_int() {
        return getFinalSCChartReferece().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSCChartReferece__EObject_String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSCChartReferece__EObject_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSCChartReferece__EObject_String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetDeclarations() {
        return getFinalSCChartReferece().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewDeclaration() {
        return getFinalSCChartReferece().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDeclaration__int_int() {
        return getFinalSCChartReferece().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDeclaration__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDeclaration__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDeclaration__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetCircuitConnecters() {
        return getFinalSCChartReferece().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewCircuitConnecter() {
        return getFinalSCChartReferece().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewCircuitConnecter__int_int() {
        return getFinalSCChartReferece().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewCircuitConnecter__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewCircuitConnecter__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewCircuitConnecter__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetOutputs() {
        return getFinalSCChartReferece().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewOutput() {
        return getFinalSCChartReferece().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOutput__int_int() {
        return getFinalSCChartReferece().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOutput__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOutput__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewOutput__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetDataFlowRegions() {
        return getFinalSCChartReferece().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewDataFlowRegion() {
        return getFinalSCChartReferece().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDataFlowRegion__int_int() {
        return getFinalSCChartReferece().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDataFlowRegion__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDataFlowRegion__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewDataFlowRegion__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetInitilalSuperStates() {
        return getFinalSCChartReferece().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewInitilalSuperState() {
        return getFinalSCChartReferece().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitilalSuperState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitilalSuperState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitilalSuperState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitilalSuperState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetSuperStates() {
        return getFinalSCChartReferece().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewSuperState() {
        return getFinalSCChartReferece().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuperState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuperState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuperState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSuperState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetSimpleStates() {
        return getFinalSCChartReferece().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewSimpleState() {
        return getFinalSCChartReferece().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSimpleState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSimpleState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSimpleState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewSimpleState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetActions() {
        return getFinalSCChartReferece().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewAction() {
        return getFinalSCChartReferece().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewAction__int_int() {
        return getFinalSCChartReferece().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewAction__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewAction__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewAction__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetInitialSCChartRefereces() {
        return getFinalSCChartReferece().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewInitialSCChartReferece() {
        return getFinalSCChartReferece().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialSCChartReferece__EObject_int_int() {
        return getFinalSCChartReferece().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialSCChartReferece__EObject_String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialSCChartReferece__EObject_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewInitialSCChartReferece__EObject_String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetFinalSCChartRefereces() {
        return getFinalSCChartReferece().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewFinalSCChartReferece() {
        return getFinalSCChartReferece().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSCChartReferece__EObject_int_int() {
        return getFinalSCChartReferece().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSCChartReferece__EObject_String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSCChartReferece__EObject_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSCChartReferece__EObject_String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetRegions() {
        return getFinalSCChartReferece().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewRegion() {
        return getFinalSCChartReferece().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRegion__int_int() {
        return getFinalSCChartReferece().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRegion__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRegion__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewRegion__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetFinalSuperStates() {
        return getFinalSCChartReferece().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewFinalSuperState() {
        return getFinalSCChartReferece().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSuperState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSuperState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSuperState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalSuperState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetFinalStates() {
        return getFinalSCChartReferece().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanNewFinalState() {
        return getFinalSCChartReferece().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalState__int_int() {
        return getFinalSCChartReferece().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalState__String_int_int() {
        return getFinalSCChartReferece().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalState__int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__NewFinalState__String_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__S_moveTo__ModelElementContainer_int_int() {
        return getFinalSCChartReferece().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PreMove__ModelElementContainer_int_int() {
        return getFinalSCChartReferece().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getFinalSCChartReferece().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PreResize__int_int_int_int_Direction() {
        return getFinalSCChartReferece().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__PostResize__int_int_int_int_Direction() {
        return getFinalSCChartReferece().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanMoveTo__Region_int_int() {
        return getFinalSCChartReferece().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__MoveTo__Region_int_int() {
        return getFinalSCChartReferece().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__S_moveTo__Region_int_int() {
        return getFinalSCChartReferece().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanMoveTo__DataFlowRegion_int_int() {
        return getFinalSCChartReferece().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__MoveTo__DataFlowRegion_int_int() {
        return getFinalSCChartReferece().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__S_moveTo__DataFlowRegion_int_int() {
        return getFinalSCChartReferece().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanMoveTo__SCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__MoveTo__SCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__S_moveTo__SCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanMoveTo__InitialSCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__MoveTo__InitialSCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__S_moveTo__InitialSCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__CanMoveTo__FinalSCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__MoveTo__FinalSCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__S_moveTo__FinalSCChartReferece_int_int() {
        return getFinalSCChartReferece().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetReference() {
        return getFinalSCChartReferece().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalSCChartReferece__GetFinalSCChartRefereceView() {
        return getFinalSCChartReferece().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTransition() {
		if (abstractTransitionEClass == null) {
			abstractTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(20);
		}
		return abstractTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetPriority() {
        return getAbstractTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__SetPriority__String() {
        return getAbstractTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetInternalAbstractTransition() {
        return getAbstractTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__IsExactlyAbstractTransition() {
        return getAbstractTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__PreDelete() {
        return getAbstractTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetPostDeleteFunction() {
        return getAbstractTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetPostDeleteEvent() {
        return getAbstractTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__PreSave() {
        return getAbstractTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__PostSave() {
        return getAbstractTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetRootElement() {
        return getAbstractTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetSourceElement() {
        return getAbstractTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetTargetElement() {
        return getAbstractTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__CanReconnectSource__RootState() {
        return getAbstractTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__ReconnectSource__RootState() {
        return getAbstractTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTransition__GetAbstractTransitionView() {
        return getAbstractTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		if (transitionEClass == null) {
			transitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(21);
		}
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetCondition() {
        return getTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetCondition__String() {
        return getTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetCount_delay() {
        return getTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetCount_delay__String() {
        return getTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetEffect() {
        return getTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetEffect__String() {
        return getTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetInternalTransition() {
        return getTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsExactlyTransition() {
        return getTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PreDelete() {
        return getTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPostDeleteFunction() {
        return getTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPostDeleteEvent() {
        return getTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PreSave() {
        return getTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PostSave() {
        return getTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetRootElement() {
        return getTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetSourceElement() {
        return getTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTargetElement() {
        return getTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__RootState() {
        return getTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__RootState() {
        return getTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__InitilalSuperState() {
        return getTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__InitilalSuperState() {
        return getTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__Connector() {
        return getTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__Connector() {
        return getTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__SuperState() {
        return getTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__SuperState() {
        return getTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__SimpleState() {
        return getTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__SimpleState() {
        return getTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__InitialState() {
        return getTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__InitialState() {
        return getTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__FinalSuperState() {
        return getTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__FinalSuperState() {
        return getTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__FinalState() {
        return getTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__FinalState() {
        return getTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__InitilalSuperState() {
        return getTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__InitilalSuperState() {
        return getTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__Connector() {
        return getTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__Connector() {
        return getTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__SuperState() {
        return getTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__SuperState() {
        return getTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__SimpleState() {
        return getTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__SimpleState() {
        return getTransition().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__InitialState() {
        return getTransition().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__InitialState() {
        return getTransition().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__FinalSuperState() {
        return getTransition().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__FinalSuperState() {
        return getTransition().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__FinalState() {
        return getTransition().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__FinalState() {
        return getTransition().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTransitionView() {
        return getTransition().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTransition() {
		if (immediateTransitionEClass == null) {
			immediateTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(22);
		}
		return immediateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetCondition() {
        return getImmediateTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetCondition__String() {
        return getImmediateTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetCount_delay() {
        return getImmediateTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetCount_delay__String() {
        return getImmediateTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetEffect() {
        return getImmediateTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetEffect__String() {
        return getImmediateTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetInternalImmediateTransition() {
        return getImmediateTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__IsExactlyImmediateTransition() {
        return getImmediateTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PreDelete() {
        return getImmediateTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPostDeleteFunction() {
        return getImmediateTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPostDeleteEvent() {
        return getImmediateTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PreSave() {
        return getImmediateTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PostSave() {
        return getImmediateTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetRootElement() {
        return getImmediateTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetSourceElement() {
        return getImmediateTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetTargetElement() {
        return getImmediateTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__RootState() {
        return getImmediateTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__RootState() {
        return getImmediateTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__Connector() {
        return getImmediateTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__Connector() {
        return getImmediateTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__SuperState() {
        return getImmediateTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__SuperState() {
        return getImmediateTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__SimpleState() {
        return getImmediateTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__SimpleState() {
        return getImmediateTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__InitialState() {
        return getImmediateTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__InitialState() {
        return getImmediateTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__FinalSuperState() {
        return getImmediateTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__FinalSuperState() {
        return getImmediateTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__FinalState() {
        return getImmediateTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__FinalState() {
        return getImmediateTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__Connector() {
        return getImmediateTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__Connector() {
        return getImmediateTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__SuperState() {
        return getImmediateTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__SuperState() {
        return getImmediateTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__SimpleState() {
        return getImmediateTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__SimpleState() {
        return getImmediateTransition().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__InitialState() {
        return getImmediateTransition().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__InitialState() {
        return getImmediateTransition().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__FinalSuperState() {
        return getImmediateTransition().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__FinalSuperState() {
        return getImmediateTransition().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__FinalState() {
        return getImmediateTransition().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__FinalState() {
        return getImmediateTransition().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetImmediateTransitionView() {
        return getImmediateTransition().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminationTransition() {
		if (terminationTransitionEClass == null) {
			terminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(23);
		}
		return terminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetEffect() {
        return getTerminationTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__SetEffect__String() {
        return getTerminationTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetInternalTerminationTransition() {
        return getTerminationTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__IsExactlyTerminationTransition() {
        return getTerminationTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__PreDelete() {
        return getTerminationTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetPostDeleteFunction() {
        return getTerminationTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetPostDeleteEvent() {
        return getTerminationTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__PreSave() {
        return getTerminationTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__PostSave() {
        return getTerminationTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetRootElement() {
        return getTerminationTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetSourceElement() {
        return getTerminationTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetTargetElement() {
        return getTerminationTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectSource__RootState() {
        return getTerminationTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectSource__RootState() {
        return getTerminationTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectSource__InitilalSuperState() {
        return getTerminationTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectSource__InitilalSuperState() {
        return getTerminationTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectSource__SuperState() {
        return getTerminationTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectSource__SuperState() {
        return getTerminationTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectSource__FinalSuperState() {
        return getTerminationTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectSource__FinalSuperState() {
        return getTerminationTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__InitilalSuperState() {
        return getTerminationTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__InitilalSuperState() {
        return getTerminationTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__Connector() {
        return getTerminationTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__Connector() {
        return getTerminationTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__SuperState() {
        return getTerminationTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__SuperState() {
        return getTerminationTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__SimpleState() {
        return getTerminationTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__SimpleState() {
        return getTerminationTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__InitialState() {
        return getTerminationTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__InitialState() {
        return getTerminationTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__FinalSuperState() {
        return getTerminationTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__FinalSuperState() {
        return getTerminationTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__CanReconnectTarget__FinalState() {
        return getTerminationTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__ReconnectTarget__FinalState() {
        return getTerminationTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationTransition__GetTerminationTransitionView() {
        return getTerminationTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTerminationTransition() {
		if (conditionalTerminationTransitionEClass == null) {
			conditionalTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(24);
		}
		return conditionalTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetCondition() {
        return getConditionalTerminationTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__SetCondition__String() {
        return getConditionalTerminationTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetCount_delay() {
        return getConditionalTerminationTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__SetCount_delay__String() {
        return getConditionalTerminationTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetEffect() {
        return getConditionalTerminationTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__SetEffect__String() {
        return getConditionalTerminationTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetInternalConditionalTerminationTransition() {
        return getConditionalTerminationTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__IsExactlyConditionalTerminationTransition() {
        return getConditionalTerminationTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__PreDelete() {
        return getConditionalTerminationTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetPostDeleteFunction() {
        return getConditionalTerminationTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetPostDeleteEvent() {
        return getConditionalTerminationTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__PreSave() {
        return getConditionalTerminationTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__PostSave() {
        return getConditionalTerminationTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetRootElement() {
        return getConditionalTerminationTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetSourceElement() {
        return getConditionalTerminationTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetTargetElement() {
        return getConditionalTerminationTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectSource__RootState() {
        return getConditionalTerminationTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectSource__RootState() {
        return getConditionalTerminationTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectSource__InitilalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectSource__InitilalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectSource__SuperState() {
        return getConditionalTerminationTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectSource__SuperState() {
        return getConditionalTerminationTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectSource__FinalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectSource__FinalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__InitilalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__InitilalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__Connector() {
        return getConditionalTerminationTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__Connector() {
        return getConditionalTerminationTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__SuperState() {
        return getConditionalTerminationTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__SuperState() {
        return getConditionalTerminationTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__SimpleState() {
        return getConditionalTerminationTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__SimpleState() {
        return getConditionalTerminationTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__InitialState() {
        return getConditionalTerminationTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__InitialState() {
        return getConditionalTerminationTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__FinalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__FinalSuperState() {
        return getConditionalTerminationTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__CanReconnectTarget__FinalState() {
        return getConditionalTerminationTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__ReconnectTarget__FinalState() {
        return getConditionalTerminationTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationTransition__GetConditionalTerminationTransitionView() {
        return getConditionalTerminationTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortTransition() {
		if (strongAbortTransitionEClass == null) {
			strongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(25);
		}
		return strongAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetCondition() {
        return getStrongAbortTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__SetCondition__String() {
        return getStrongAbortTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetCount_delay() {
        return getStrongAbortTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__SetCount_delay__String() {
        return getStrongAbortTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetEffect() {
        return getStrongAbortTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__SetEffect__String() {
        return getStrongAbortTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetInternalStrongAbortTransition() {
        return getStrongAbortTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__IsExactlyStrongAbortTransition() {
        return getStrongAbortTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__PreDelete() {
        return getStrongAbortTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetPostDeleteFunction() {
        return getStrongAbortTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetPostDeleteEvent() {
        return getStrongAbortTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__PreSave() {
        return getStrongAbortTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__PostSave() {
        return getStrongAbortTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetRootElement() {
        return getStrongAbortTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetSourceElement() {
        return getStrongAbortTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetTargetElement() {
        return getStrongAbortTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__RootState() {
        return getStrongAbortTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__RootState() {
        return getStrongAbortTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__SuperState() {
        return getStrongAbortTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__SuperState() {
        return getStrongAbortTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__FinalSuperState() {
        return getStrongAbortTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__FinalSuperState() {
        return getStrongAbortTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__Connector() {
        return getStrongAbortTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__Connector() {
        return getStrongAbortTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__SuperState() {
        return getStrongAbortTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__SuperState() {
        return getStrongAbortTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__InitialState() {
        return getStrongAbortTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__InitialState() {
        return getStrongAbortTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__FinalSuperState() {
        return getStrongAbortTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__FinalSuperState() {
        return getStrongAbortTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__FinalState() {
        return getStrongAbortTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__FinalState() {
        return getStrongAbortTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetStrongAbortTransitionView() {
        return getStrongAbortTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateStrongAbortTransition() {
		if (immediateStrongAbortTransitionEClass == null) {
			immediateStrongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(26);
		}
		return immediateStrongAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetCondition() {
        return getImmediateStrongAbortTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__SetCondition__String() {
        return getImmediateStrongAbortTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetCount_delay() {
        return getImmediateStrongAbortTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__SetCount_delay__String() {
        return getImmediateStrongAbortTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetEffect() {
        return getImmediateStrongAbortTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__SetEffect__String() {
        return getImmediateStrongAbortTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetInternalImmediateStrongAbortTransition() {
        return getImmediateStrongAbortTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__IsExactlyImmediateStrongAbortTransition() {
        return getImmediateStrongAbortTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__PreDelete() {
        return getImmediateStrongAbortTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetPostDeleteFunction() {
        return getImmediateStrongAbortTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetPostDeleteEvent() {
        return getImmediateStrongAbortTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__PreSave() {
        return getImmediateStrongAbortTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__PostSave() {
        return getImmediateStrongAbortTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetRootElement() {
        return getImmediateStrongAbortTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetSourceElement() {
        return getImmediateStrongAbortTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetTargetElement() {
        return getImmediateStrongAbortTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectSource__RootState() {
        return getImmediateStrongAbortTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectSource__RootState() {
        return getImmediateStrongAbortTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectSource__SuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectSource__SuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectSource__FinalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectSource__FinalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__Connector() {
        return getImmediateStrongAbortTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__Connector() {
        return getImmediateStrongAbortTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__SuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__SuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__SimpleState() {
        return getImmediateStrongAbortTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__SimpleState() {
        return getImmediateStrongAbortTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__InitialState() {
        return getImmediateStrongAbortTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__InitialState() {
        return getImmediateStrongAbortTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__FinalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__FinalSuperState() {
        return getImmediateStrongAbortTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__CanReconnectTarget__FinalState() {
        return getImmediateStrongAbortTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__ReconnectTarget__FinalState() {
        return getImmediateStrongAbortTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortTransition__GetImmediateStrongAbortTransitionView() {
        return getImmediateStrongAbortTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeferredTransition() {
		if (deferredTransitionEClass == null) {
			deferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(27);
		}
		return deferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetCondition() {
        return getDeferredTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__SetCondition__String() {
        return getDeferredTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetCount_delay() {
        return getDeferredTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__SetCount_delay__String() {
        return getDeferredTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetEffect() {
        return getDeferredTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__SetEffect__String() {
        return getDeferredTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetInternalDeferredTransition() {
        return getDeferredTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__IsExactlyDeferredTransition() {
        return getDeferredTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__PreDelete() {
        return getDeferredTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetPostDeleteFunction() {
        return getDeferredTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetPostDeleteEvent() {
        return getDeferredTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__PreSave() {
        return getDeferredTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__PostSave() {
        return getDeferredTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetRootElement() {
        return getDeferredTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetSourceElement() {
        return getDeferredTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetTargetElement() {
        return getDeferredTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectSource__RootState() {
        return getDeferredTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectSource__RootState() {
        return getDeferredTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectSource__InitilalSuperState() {
        return getDeferredTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectSource__InitilalSuperState() {
        return getDeferredTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectSource__SuperState() {
        return getDeferredTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectSource__SuperState() {
        return getDeferredTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectSource__FinalSuperState() {
        return getDeferredTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectSource__FinalSuperState() {
        return getDeferredTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectTarget__InitilalSuperState() {
        return getDeferredTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectTarget__InitilalSuperState() {
        return getDeferredTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectTarget__SuperState() {
        return getDeferredTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectTarget__SuperState() {
        return getDeferredTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__CanReconnectTarget__FinalSuperState() {
        return getDeferredTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__ReconnectTarget__FinalSuperState() {
        return getDeferredTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeferredTransition__GetDeferredTransitionView() {
        return getDeferredTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateDeferredTransition() {
		if (immediateDeferredTransitionEClass == null) {
			immediateDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(28);
		}
		return immediateDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetCondition() {
        return getImmediateDeferredTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__SetCondition__String() {
        return getImmediateDeferredTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetCount_delay() {
        return getImmediateDeferredTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__SetCount_delay__String() {
        return getImmediateDeferredTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetEffect() {
        return getImmediateDeferredTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__SetEffect__String() {
        return getImmediateDeferredTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetInternalImmediateDeferredTransition() {
        return getImmediateDeferredTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__IsExactlyImmediateDeferredTransition() {
        return getImmediateDeferredTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__PreDelete() {
        return getImmediateDeferredTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetPostDeleteFunction() {
        return getImmediateDeferredTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetPostDeleteEvent() {
        return getImmediateDeferredTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__PreSave() {
        return getImmediateDeferredTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__PostSave() {
        return getImmediateDeferredTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetRootElement() {
        return getImmediateDeferredTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetSourceElement() {
        return getImmediateDeferredTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetTargetElement() {
        return getImmediateDeferredTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectSource__RootState() {
        return getImmediateDeferredTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectSource__RootState() {
        return getImmediateDeferredTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectSource__SuperState() {
        return getImmediateDeferredTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectSource__SuperState() {
        return getImmediateDeferredTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectSource__FinalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectSource__FinalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectTarget__SuperState() {
        return getImmediateDeferredTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectTarget__SuperState() {
        return getImmediateDeferredTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__CanReconnectTarget__FinalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__ReconnectTarget__FinalSuperState() {
        return getImmediateDeferredTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateDeferredTransition__GetImmediateDeferredTransitionView() {
        return getImmediateDeferredTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminationDefferdTransition() {
		if (terminationDefferdTransitionEClass == null) {
			terminationDefferdTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(29);
		}
		return terminationDefferdTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetEffect() {
        return getTerminationDefferdTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__SetEffect__String() {
        return getTerminationDefferdTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetInternalTerminationDefferdTransition() {
        return getTerminationDefferdTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__IsExactlyTerminationDefferdTransition() {
        return getTerminationDefferdTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__PreDelete() {
        return getTerminationDefferdTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetPostDeleteFunction() {
        return getTerminationDefferdTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetPostDeleteEvent() {
        return getTerminationDefferdTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__PreSave() {
        return getTerminationDefferdTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__PostSave() {
        return getTerminationDefferdTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetRootElement() {
        return getTerminationDefferdTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetSourceElement() {
        return getTerminationDefferdTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetTargetElement() {
        return getTerminationDefferdTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectSource__RootState() {
        return getTerminationDefferdTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectSource__RootState() {
        return getTerminationDefferdTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectSource__InitilalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectSource__InitilalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectSource__SuperState() {
        return getTerminationDefferdTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectSource__SuperState() {
        return getTerminationDefferdTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectSource__FinalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectSource__FinalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectTarget__InitilalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectTarget__InitilalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectTarget__SuperState() {
        return getTerminationDefferdTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectTarget__SuperState() {
        return getTerminationDefferdTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__CanReconnectTarget__FinalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__ReconnectTarget__FinalSuperState() {
        return getTerminationDefferdTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationDefferdTransition__GetTerminationDefferdTransitionView() {
        return getTerminationDefferdTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTerminationDeferredTransition() {
		if (conditionalTerminationDeferredTransitionEClass == null) {
			conditionalTerminationDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(30);
		}
		return conditionalTerminationDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetCondition() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__SetCondition__String() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetCount_delay() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__SetCount_delay__String() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetEffect() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__SetEffect__String() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetInternalConditionalTerminationDeferredTransition() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__IsExactlyConditionalTerminationDeferredTransition() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__PreDelete() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetPostDeleteFunction() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetPostDeleteEvent() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__PreSave() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__PostSave() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetRootElement() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetSourceElement() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetTargetElement() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectSource__RootState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectSource__RootState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectSource__InitilalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectSource__InitilalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectSource__SuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectSource__SuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectSource__FinalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectSource__FinalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectTarget__InitilalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectTarget__InitilalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectTarget__SuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectTarget__SuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__CanReconnectTarget__FinalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__ReconnectTarget__FinalSuperState() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationDeferredTransition__GetConditionalTerminationDeferredTransitionView() {
        return getConditionalTerminationDeferredTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortDeferredTransition() {
		if (strongAbortDeferredTransitionEClass == null) {
			strongAbortDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(31);
		}
		return strongAbortDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetCondition() {
        return getStrongAbortDeferredTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__SetCondition__String() {
        return getStrongAbortDeferredTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetCount_delay() {
        return getStrongAbortDeferredTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__SetCount_delay__String() {
        return getStrongAbortDeferredTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetEffect() {
        return getStrongAbortDeferredTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__SetEffect__String() {
        return getStrongAbortDeferredTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetInternalStrongAbortDeferredTransition() {
        return getStrongAbortDeferredTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__IsExactlyStrongAbortDeferredTransition() {
        return getStrongAbortDeferredTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__PreDelete() {
        return getStrongAbortDeferredTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetPostDeleteFunction() {
        return getStrongAbortDeferredTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetPostDeleteEvent() {
        return getStrongAbortDeferredTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__PreSave() {
        return getStrongAbortDeferredTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__PostSave() {
        return getStrongAbortDeferredTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetRootElement() {
        return getStrongAbortDeferredTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetSourceElement() {
        return getStrongAbortDeferredTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetTargetElement() {
        return getStrongAbortDeferredTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectSource__RootState() {
        return getStrongAbortDeferredTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectSource__RootState() {
        return getStrongAbortDeferredTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectSource__InitilalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectSource__InitilalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectSource__SuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectSource__SuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectSource__FinalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectSource__FinalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectTarget__InitilalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectTarget__InitilalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectTarget__SuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectTarget__SuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__CanReconnectTarget__FinalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__ReconnectTarget__FinalSuperState() {
        return getStrongAbortDeferredTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortDeferredTransition__GetStrongAbortDeferredTransitionView() {
        return getStrongAbortDeferredTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateStrongAbortDeferredTransition() {
		if (immediateStrongAbortDeferredTransitionEClass == null) {
			immediateStrongAbortDeferredTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(32);
		}
		return immediateStrongAbortDeferredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetCondition() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__SetCondition__String() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetCount_delay() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__SetCount_delay__String() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetEffect() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__SetEffect__String() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetInternalImmediateStrongAbortDeferredTransition() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__IsExactlyImmediateStrongAbortDeferredTransition() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__PreDelete() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetPostDeleteFunction() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetPostDeleteEvent() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__PreSave() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__PostSave() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetRootElement() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetSourceElement() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetTargetElement() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectSource__RootState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectSource__RootState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectSource__SuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectSource__SuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectSource__FinalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectSource__FinalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectTarget__SuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectTarget__SuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__CanReconnectTarget__FinalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__ReconnectTarget__FinalSuperState() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortDeferredTransition__GetImmediateStrongAbortDeferredTransitionView() {
        return getImmediateStrongAbortDeferredTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryTransition() {
		if (historyTransitionEClass == null) {
			historyTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(33);
		}
		return historyTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetCondition() {
        return getHistoryTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__SetCondition__String() {
        return getHistoryTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetCount_delay() {
        return getHistoryTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__SetCount_delay__String() {
        return getHistoryTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__IsDeepHistory() {
        return getHistoryTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__SetDeepHistory__boolean() {
        return getHistoryTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetEffect() {
        return getHistoryTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__SetEffect__String() {
        return getHistoryTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetInternalHistoryTransition() {
        return getHistoryTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__IsExactlyHistoryTransition() {
        return getHistoryTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__PreDelete() {
        return getHistoryTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetPostDeleteFunction() {
        return getHistoryTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetPostDeleteEvent() {
        return getHistoryTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__PreSave() {
        return getHistoryTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__PostSave() {
        return getHistoryTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetRootElement() {
        return getHistoryTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetSourceElement() {
        return getHistoryTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetTargetElement() {
        return getHistoryTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectSource__RootState() {
        return getHistoryTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectSource__RootState() {
        return getHistoryTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectSource__InitilalSuperState() {
        return getHistoryTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectSource__InitilalSuperState() {
        return getHistoryTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectSource__SuperState() {
        return getHistoryTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectSource__SuperState() {
        return getHistoryTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectSource__FinalSuperState() {
        return getHistoryTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectSource__FinalSuperState() {
        return getHistoryTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectTarget__InitilalSuperState() {
        return getHistoryTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectTarget__InitilalSuperState() {
        return getHistoryTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectTarget__SuperState() {
        return getHistoryTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectTarget__SuperState() {
        return getHistoryTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__CanReconnectTarget__FinalSuperState() {
        return getHistoryTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__ReconnectTarget__FinalSuperState() {
        return getHistoryTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHistoryTransition__GetHistoryTransitionView() {
        return getHistoryTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateHistoryTransition() {
		if (immediateHistoryTransitionEClass == null) {
			immediateHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(34);
		}
		return immediateHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetCondition() {
        return getImmediateHistoryTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__SetCondition__String() {
        return getImmediateHistoryTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetCount_delay() {
        return getImmediateHistoryTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__SetCount_delay__String() {
        return getImmediateHistoryTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__IsDeepHistory() {
        return getImmediateHistoryTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__SetDeepHistory__boolean() {
        return getImmediateHistoryTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetEffect() {
        return getImmediateHistoryTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__SetEffect__String() {
        return getImmediateHistoryTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetInternalImmediateHistoryTransition() {
        return getImmediateHistoryTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__IsExactlyImmediateHistoryTransition() {
        return getImmediateHistoryTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__PreDelete() {
        return getImmediateHistoryTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetPostDeleteFunction() {
        return getImmediateHistoryTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetPostDeleteEvent() {
        return getImmediateHistoryTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__PreSave() {
        return getImmediateHistoryTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__PostSave() {
        return getImmediateHistoryTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetRootElement() {
        return getImmediateHistoryTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetSourceElement() {
        return getImmediateHistoryTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetTargetElement() {
        return getImmediateHistoryTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectSource__RootState() {
        return getImmediateHistoryTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectSource__RootState() {
        return getImmediateHistoryTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectSource__SuperState() {
        return getImmediateHistoryTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectSource__SuperState() {
        return getImmediateHistoryTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectSource__FinalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectSource__FinalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectTarget__SuperState() {
        return getImmediateHistoryTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectTarget__SuperState() {
        return getImmediateHistoryTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__CanReconnectTarget__FinalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__ReconnectTarget__FinalSuperState() {
        return getImmediateHistoryTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateHistoryTransition__GetImmediateHistoryTransitionView() {
        return getImmediateHistoryTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminationHistoryTransition() {
		if (terminationHistoryTransitionEClass == null) {
			terminationHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(35);
		}
		return terminationHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__IsDeepHistory() {
        return getTerminationHistoryTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__SetDeepHistory__boolean() {
        return getTerminationHistoryTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetEffect() {
        return getTerminationHistoryTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__SetEffect__String() {
        return getTerminationHistoryTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetInternalTerminationHistoryTransition() {
        return getTerminationHistoryTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__IsExactlyTerminationHistoryTransition() {
        return getTerminationHistoryTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__PreDelete() {
        return getTerminationHistoryTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetPostDeleteFunction() {
        return getTerminationHistoryTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetPostDeleteEvent() {
        return getTerminationHistoryTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__PreSave() {
        return getTerminationHistoryTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__PostSave() {
        return getTerminationHistoryTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetRootElement() {
        return getTerminationHistoryTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetSourceElement() {
        return getTerminationHistoryTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetTargetElement() {
        return getTerminationHistoryTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectSource__RootState() {
        return getTerminationHistoryTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectSource__RootState() {
        return getTerminationHistoryTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectSource__InitilalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectSource__InitilalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectSource__SuperState() {
        return getTerminationHistoryTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectSource__SuperState() {
        return getTerminationHistoryTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectSource__FinalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectSource__FinalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectTarget__InitilalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectTarget__InitilalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectTarget__SuperState() {
        return getTerminationHistoryTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectTarget__SuperState() {
        return getTerminationHistoryTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__CanReconnectTarget__FinalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__ReconnectTarget__FinalSuperState() {
        return getTerminationHistoryTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTerminationHistoryTransition__GetTerminationHistoryTransitionView() {
        return getTerminationHistoryTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTerminationHistoryTransition() {
		if (conditionalTerminationHistoryTransitionEClass == null) {
			conditionalTerminationHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(36);
		}
		return conditionalTerminationHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetCondition() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__SetCondition__String() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetCount_delay() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__SetCount_delay__String() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__IsDeepHistory() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__SetDeepHistory__boolean() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetEffect() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__SetEffect__String() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetInternalConditionalTerminationHistoryTransition() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__IsExactlyConditionalTerminationHistoryTransition() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__PreDelete() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetPostDeleteFunction() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetPostDeleteEvent() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__PreSave() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__PostSave() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetRootElement() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetSourceElement() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetTargetElement() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectSource__RootState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectSource__RootState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectSource__InitilalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectSource__InitilalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectSource__SuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectSource__SuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectSource__FinalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectSource__FinalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectTarget__InitilalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectTarget__InitilalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectTarget__SuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectTarget__SuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__CanReconnectTarget__FinalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__ReconnectTarget__FinalSuperState() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConditionalTerminationHistoryTransition__GetConditionalTerminationHistoryTransitionView() {
        return getConditionalTerminationHistoryTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortHistoryTransition() {
		if (strongAbortHistoryTransitionEClass == null) {
			strongAbortHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(37);
		}
		return strongAbortHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetCondition() {
        return getStrongAbortHistoryTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__SetCondition__String() {
        return getStrongAbortHistoryTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetCount_delay() {
        return getStrongAbortHistoryTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__SetCount_delay__String() {
        return getStrongAbortHistoryTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__IsDeepHistory() {
        return getStrongAbortHistoryTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__SetDeepHistory__boolean() {
        return getStrongAbortHistoryTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetEffect() {
        return getStrongAbortHistoryTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__SetEffect__String() {
        return getStrongAbortHistoryTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetInternalStrongAbortHistoryTransition() {
        return getStrongAbortHistoryTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__IsExactlyStrongAbortHistoryTransition() {
        return getStrongAbortHistoryTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__PreDelete() {
        return getStrongAbortHistoryTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetPostDeleteFunction() {
        return getStrongAbortHistoryTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetPostDeleteEvent() {
        return getStrongAbortHistoryTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__PreSave() {
        return getStrongAbortHistoryTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__PostSave() {
        return getStrongAbortHistoryTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetRootElement() {
        return getStrongAbortHistoryTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetSourceElement() {
        return getStrongAbortHistoryTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetTargetElement() {
        return getStrongAbortHistoryTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectSource__RootState() {
        return getStrongAbortHistoryTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectSource__RootState() {
        return getStrongAbortHistoryTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectSource__InitilalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectSource__InitilalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectSource__SuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectSource__SuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectSource__FinalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectSource__FinalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectTarget__InitilalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectTarget__InitilalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectTarget__SuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectTarget__SuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__CanReconnectTarget__FinalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__ReconnectTarget__FinalSuperState() {
        return getStrongAbortHistoryTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortHistoryTransition__GetStrongAbortHistoryTransitionView() {
        return getStrongAbortHistoryTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateStrongAbortHistoryTransition() {
		if (immediateStrongAbortHistoryTransitionEClass == null) {
			immediateStrongAbortHistoryTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(38);
		}
		return immediateStrongAbortHistoryTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetCondition() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__SetCondition__String() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetCount_delay() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__SetCount_delay__String() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__IsDeepHistory() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__SetDeepHistory__boolean() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetEffect() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__SetEffect__String() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetInternalImmediateStrongAbortHistoryTransition() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__IsExactlyImmediateStrongAbortHistoryTransition() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__PreDelete() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetPostDeleteFunction() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetPostDeleteEvent() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__PreSave() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__PostSave() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetRootElement() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetSourceElement() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetTargetElement() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectSource__RootState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectSource__RootState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectSource__SuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectSource__SuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectSource__FinalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectSource__FinalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectTarget__SuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectTarget__SuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__CanReconnectTarget__FinalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__ReconnectTarget__FinalSuperState() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateStrongAbortHistoryTransition__GetImmediateStrongAbortHistoryTransitionView() {
        return getImmediateStrongAbortHistoryTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		if (connectionEClass == null) {
			connectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(39);
		}
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetInternalConnection() {
        return getConnection().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__IsExactlyConnection() {
        return getConnection().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__PreDelete() {
        return getConnection().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetPostDeleteFunction() {
        return getConnection().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetPostDeleteEvent() {
        return getConnection().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__PreSave() {
        return getConnection().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__PostSave() {
        return getConnection().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetRootElement() {
        return getConnection().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetSourceElement() {
        return getConnection().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetTargetElement() {
        return getConnection().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectSource__Operator() {
        return getConnection().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectSource__Operator() {
        return getConnection().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectSource__CircuitConnecter() {
        return getConnection().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectSource__CircuitConnecter() {
        return getConnection().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectSource__RootState() {
        return getConnection().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectSource__RootState() {
        return getConnection().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectSource__Input() {
        return getConnection().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectSource__Input() {
        return getConnection().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectTarget__Operator() {
        return getConnection().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectTarget__Operator() {
        return getConnection().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectTarget__CircuitConnecter() {
        return getConnection().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectTarget__CircuitConnecter() {
        return getConnection().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__CanReconnectTarget__Output() {
        return getConnection().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__ReconnectTarget__Output() {
        return getConnection().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnection__GetConnectionView() {
        return getConnection().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCChart() {
		if (scChartEClass == null) {
			scChartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(40);
		}
		return scChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetInternalSCChart() {
        return getSCChart().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__IsExactlySCChart() {
        return getSCChart().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__PreDelete() {
        return getSCChart().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetPostDeleteFunction() {
        return getSCChart().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetPostDeleteEvent() {
        return getSCChart().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__PreSave() {
        return getSCChart().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__PostSave() {
        return getSCChart().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetRootElement() {
        return getSCChart().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetNodes() {
        return getSCChart().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetRootStates() {
        return getSCChart().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__CanNewRootState() {
        return getSCChart().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__int_int() {
        return getSCChart().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__String_int_int() {
        return getSCChart().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__int_int_int_int() {
        return getSCChart().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__String_int_int_int_int() {
        return getSCChart().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewSCChart__String_String_boolean() {
        return getSCChart().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetSCChartView() {
        return getSCChart().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment() {
		if (assignmentEClass == null) {
			assignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(41);
		}
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignment__GetAssignment() {
        return getAssignment().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignment__SetAssignment__String() {
        return getAssignment().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignment__GetInternalAssignment() {
        return getAssignment().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignment__IsExactlyAssignment() {
        return getAssignment().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssignment__GetAssignmentView() {
        return getAssignment().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssign() {
		if (assignEEnum == null) {
			assignEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(42);
		}
		return assignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScchartFactory getScchartFactory() {
		return (ScchartFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.scchart." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ScchartPackageImpl
