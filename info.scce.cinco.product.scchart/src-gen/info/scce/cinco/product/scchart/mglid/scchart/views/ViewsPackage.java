/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/scchart/mglid/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scchart-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl <em>Root State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateView()
	 * @generated
	 */
	int ROOT_STATE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal Root State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW__INTERNAL_ROOT_STATE = 0;

	/**
	 * The number of structural features of the '<em>Root State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Generator Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_GENERATOR_OUTPUT = 0;

	/**
	 * The operation id for the '<em>Set Generator Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_GENERATOR_OUTPUT__STRING = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_NAME = 2;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_NAME__STRING = 3;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_LABEL = 4;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_LABEL__STRING = 5;

	/**
	 * The number of operations of the '<em>Root State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl <em>Region View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRegionView()
	 * @generated
	 */
	int REGION_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Internal Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW__INTERNAL_REGION = 0;

	/**
	 * The number of structural features of the '<em>Region View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___SET_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___GET_LABEL = 2;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___SET_LABEL__STRING = 3;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___GET_UUID = 4;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___SET_UUID__STRING = 5;

	/**
	 * The number of operations of the '<em>Region View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionRefViewImpl <em>Region Ref View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionRefViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRegionRefView()
	 * @generated
	 */
	int REGION_REF_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal Region Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_REF_VIEW__INTERNAL_REGION_REF = 0;

	/**
	 * The number of structural features of the '<em>Region Ref View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_REF_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Region Ref View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_REF_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl <em>Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateView()
	 * @generated
	 */
	int SUPER_STATE_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = 0;

	/**
	 * The number of structural features of the '<em>Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___SET_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___GET_LABEL = 2;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___SET_LABEL__STRING = 3;

	/**
	 * The number of operations of the '<em>Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSuperStateViewImpl <em>Initial Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialSuperStateView()
	 * @generated
	 */
	int INITIAL_SUPER_STATE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = SUPER_STATE_VIEW__INTERNAL_SUPER_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initial Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE = SUPER_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW_FEATURE_COUNT = SUPER_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW___GET_NAME = SUPER_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW___SET_NAME__STRING = SUPER_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW___GET_LABEL = SUPER_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW___SET_LABEL__STRING = SUPER_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SUPER_STATE_VIEW_OPERATION_COUNT = SUPER_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSuperStateViewImpl <em>Final Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalSuperStateView()
	 * @generated
	 */
	int FINAL_SUPER_STATE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = SUPER_STATE_VIEW__INTERNAL_SUPER_STATE;

	/**
	 * The feature id for the '<em><b>Internal Final Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE = SUPER_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW_FEATURE_COUNT = SUPER_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___GET_NAME = SUPER_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___SET_NAME__STRING = SUPER_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___GET_LABEL = SUPER_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___SET_LABEL__STRING = SUPER_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Final Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW_OPERATION_COUNT = SUPER_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSuperStateViewImpl <em>Initial Final Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialFinalSuperStateView()
	 * @generated
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = SUPER_STATE_VIEW__INTERNAL_SUPER_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initial Final Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE = SUPER_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Final Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW_FEATURE_COUNT = SUPER_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW___GET_NAME = SUPER_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW___SET_NAME__STRING = SUPER_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW___GET_LABEL = SUPER_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW___SET_LABEL__STRING = SUPER_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial Final Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SUPER_STATE_VIEW_OPERATION_COUNT = SUPER_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeclarationViewImpl <em>Declaration View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeclarationViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDeclarationView()
	 * @generated
	 */
	int DECLARATION_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Internal Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW__INTERNAL_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Declaration View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___GET_DECLARATION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Is Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___IS_CONSTANT = 2;

	/**
	 * The operation id for the '<em>Set Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_CONSTANT__BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Get Input Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___GET_INPUT_OUTPUT = 4;

	/**
	 * The operation id for the '<em>Set Input Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING = 5;

	/**
	 * The operation id for the '<em>Get Assignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___GET_ASSIGNMENT = 6;

	/**
	 * The operation id for the '<em>Set Assignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_ASSIGNMENT__STRING = 7;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___GET_NAME = 8;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_NAME__STRING = 9;

	/**
	 * The operation id for the '<em>Is Signal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___IS_SIGNAL = 10;

	/**
	 * The operation id for the '<em>Set Signal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_SIGNAL__BOOLEAN = 11;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___GET_UUID = 12;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW___SET_UUID__STRING = 13;

	/**
	 * The number of operations of the '<em>Declaration View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VIEW_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuspensionViewImpl <em>Suspension View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuspensionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuspensionView()
	 * @generated
	 */
	int SUSPENSION_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Internal Suspension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW__INTERNAL_SUSPENSION = 0;

	/**
	 * The number of structural features of the '<em>Suspension View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Suspension Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW___GET_SUSPENSION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Suspension Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW___SET_SUSPENSION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW___GET_CONDITION = 2;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW___SET_CONDITION__STRING = 3;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW___GET_UUID = 4;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW___SET_UUID__STRING = 5;

	/**
	 * The number of operations of the '<em>Suspension View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ActionViewImpl <em>Action View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ActionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getActionView()
	 * @generated
	 */
	int ACTION_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Internal Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW__INTERNAL_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Action View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Action Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___GET_ACTION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Action Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___SET_ACTION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___GET_CONDITION = 2;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___SET_CONDITION__STRING = 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___GET_EFFECT = 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___SET_EFFECT__STRING = 5;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___GET_UUID = 6;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW___SET_UUID__STRING = 7;

	/**
	 * The number of operations of the '<em>Action View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VIEW_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl <em>Simple State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSimpleStateView()
	 * @generated
	 */
	int SIMPLE_STATE_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE = 0;

	/**
	 * The number of structural features of the '<em>Simple State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW___SET_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW___GET_LABEL = 2;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW___SET_LABEL__STRING = 3;

	/**
	 * The number of operations of the '<em>Simple State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl <em>Initial State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialStateView()
	 * @generated
	 */
	int INITIAL_STATE_VIEW = 11;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW__INTERNAL_SIMPLE_STATE = SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE = SIMPLE_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW_FEATURE_COUNT = SIMPLE_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW___GET_NAME = SIMPLE_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW___SET_NAME__STRING = SIMPLE_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW___GET_LABEL = SIMPLE_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW___SET_LABEL__STRING = SIMPLE_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW_OPERATION_COUNT = SIMPLE_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl <em>Final State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalStateView()
	 * @generated
	 */
	int FINAL_STATE_VIEW = 12;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW__INTERNAL_SIMPLE_STATE = SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE;

	/**
	 * The feature id for the '<em><b>Internal Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW__INTERNAL_FINAL_STATE = SIMPLE_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW_FEATURE_COUNT = SIMPLE_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW___GET_NAME = SIMPLE_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW___SET_NAME__STRING = SIMPLE_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW___GET_LABEL = SIMPLE_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW___SET_LABEL__STRING = SIMPLE_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Final State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW_OPERATION_COUNT = SIMPLE_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalStateViewImpl <em>Initial Final State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialFinalStateView()
	 * @generated
	 */
	int INITIAL_FINAL_STATE_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW__INTERNAL_SIMPLE_STATE = SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initial Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE = SIMPLE_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Final State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW_FEATURE_COUNT = SIMPLE_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW___GET_NAME = SIMPLE_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW___SET_NAME__STRING = SIMPLE_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW___GET_LABEL = SIMPLE_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW___SET_LABEL__STRING = SIMPLE_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial Final State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_STATE_VIEW_OPERATION_COUNT = SIMPLE_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl <em>Connector View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getConnectorView()
	 * @generated
	 */
	int CONNECTOR_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW__INTERNAL_SIMPLE_STATE = SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE;

	/**
	 * The feature id for the '<em><b>Internal Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW__INTERNAL_CONNECTOR = SIMPLE_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW_FEATURE_COUNT = SIMPLE_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW___GET_NAME = SIMPLE_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW___SET_NAME__STRING = SIMPLE_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW___GET_LABEL = SIMPLE_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW___SET_LABEL__STRING = SIMPLE_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Connector View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW_OPERATION_COUNT = SIMPLE_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartRefereceViewImpl <em>SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSCChartRefereceView()
	 * @generated
	 */
	int SC_CHART_REFERECE_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Internal SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE = 0;

	/**
	 * The number of structural features of the '<em>SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS = 0;

	/**
	 * The operation id for the '<em>Set Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_NAME = 2;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_NAME__STRING = 3;

	/**
	 * The operation id for the '<em>Get Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF = 4;

	/**
	 * The operation id for the '<em>Set Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING = 5;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_LABEL = 6;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_LABEL__STRING = 7;

	/**
	 * The number of operations of the '<em>SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSCChartRefereceViewImpl <em>Initial SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialSCChartRefereceView()
	 * @generated
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Internal SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE = SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE;

	/**
	 * The feature id for the '<em><b>Internal Initial SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE = SC_CHART_REFERECE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW_FEATURE_COUNT = SC_CHART_REFERECE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS = SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS;

	/**
	 * The operation id for the '<em>Set Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___GET_NAME = SC_CHART_REFERECE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_NAME__STRING = SC_CHART_REFERECE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF = SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF;

	/**
	 * The operation id for the '<em>Set Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING = SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___GET_LABEL = SC_CHART_REFERECE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_LABEL__STRING = SC_CHART_REFERECE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW_OPERATION_COUNT = SC_CHART_REFERECE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSCChartRefereceViewImpl <em>Final SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalSCChartRefereceView()
	 * @generated
	 */
	int FINAL_SC_CHART_REFERECE_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Internal SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE = SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE;

	/**
	 * The feature id for the '<em><b>Internal Final SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE = SC_CHART_REFERECE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW_FEATURE_COUNT = SC_CHART_REFERECE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS = SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS;

	/**
	 * The operation id for the '<em>Set Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___GET_NAME = SC_CHART_REFERECE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___SET_NAME__STRING = SC_CHART_REFERECE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF = SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF;

	/**
	 * The operation id for the '<em>Set Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING = SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___GET_LABEL = SC_CHART_REFERECE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___SET_LABEL__STRING = SC_CHART_REFERECE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Final SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW_OPERATION_COUNT = SC_CHART_REFERECE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSCChartRefereceViewImpl <em>Initial Final SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialFinalSCChartRefereceView()
	 * @generated
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW = 18;

	/**
	 * The feature id for the '<em><b>Internal SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE = SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE;

	/**
	 * The feature id for the '<em><b>Internal Initial Final SC Chart Referece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE = SC_CHART_REFERECE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Final SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW_FEATURE_COUNT = SC_CHART_REFERECE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS = SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS;

	/**
	 * The operation id for the '<em>Set Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___GET_NAME = SC_CHART_REFERECE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___SET_NAME__STRING = SC_CHART_REFERECE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF = SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF;

	/**
	 * The operation id for the '<em>Set Inputs Outputs Of Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING = SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___GET_LABEL = SC_CHART_REFERECE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW___SET_LABEL__STRING = SC_CHART_REFERECE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial Final SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FINAL_SC_CHART_REFERECE_VIEW_OPERATION_COUNT = SC_CHART_REFERECE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.AbstractTransitionViewImpl <em>Abstract Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.AbstractTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getAbstractTransitionView()
	 * @generated
	 */
	int ABSTRACT_TRANSITION_VIEW = 19;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Abstract Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_VIEW___GET_PRIORITY = 0;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING = 1;

	/**
	 * The number of operations of the '<em>Abstract Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTransitionView()
	 * @generated
	 */
	int TRANSITION_VIEW = 20;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__INTERNAL_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationTransitionViewImpl <em>Termination Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationTransitionView()
	 * @generated
	 */
	int TERMINATION_TRANSITION_VIEW = 21;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Termination Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl <em>Strong Abort Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_TRANSITION_VIEW = 22;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Strong Abort Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredTransitionViewImpl <em>Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDeferredTransitionView()
	 * @generated
	 */
	int DEFERRED_TRANSITION_VIEW = 23;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.HistoryTransitionViewImpl <em>History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.HistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getHistoryTransitionView()
	 * @generated
	 */
	int HISTORY_TRANSITION_VIEW = 24;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredTransitionViewImpl <em>Termination Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationDeferredTransitionView()
	 * @generated
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW = 25;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Termination Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Termination Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredTransitionViewImpl <em>Strong Abort Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortDeferredTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW = 26;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Strong Abort Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Abort Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Strong Abort Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationHistoryTransitionViewImpl <em>Termination History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationHistoryTransitionView()
	 * @generated
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW = 27;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Termination History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Termination History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortHistoryTransitionViewImpl <em>Strong Abort History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortHistoryTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW = 28;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Strong Abort History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Abort History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Strong Abort History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredHistoryTransitionViewImpl <em>Deferred History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDeferredHistoryTransitionView()
	 * @generated
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW = 29;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Deferred History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deferred History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Deferred History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredHistoryTransitionViewImpl <em>Strong Abort Deferred History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortDeferredHistoryTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW = 30;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Strong Abort Deferred History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Abort Deferred History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Strong Abort Deferred History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredHistoryTransitionViewImpl <em>Termination Deferred History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationDeferredHistoryTransitionView()
	 * @generated
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW = 31;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Termination Deferred History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination Deferred History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Immediate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Termination Deferred History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl <em>SC Chart View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSCChartView()
	 * @generated
	 */
	int SC_CHART_VIEW = 32;

	/**
	 * The feature id for the '<em><b>Internal SC Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW__INTERNAL_SC_CHART = 0;

	/**
	 * The number of structural features of the '<em>SC Chart View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW___SET_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>SC Chart View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView <em>Root State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView
	 * @generated
	 */
	EClass getRootStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getInternalRootState <em>Internal Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Root State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getInternalRootState()
	 * @see #getRootStateView()
	 * @generated
	 */
	EReference getRootStateView_InternalRootState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getGeneratorOutput() <em>Get Generator Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generator Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getGeneratorOutput()
	 * @generated
	 */
	EOperation getRootStateView__GetGeneratorOutput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setGeneratorOutput(java.lang.String) <em>Set Generator Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Generator Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setGeneratorOutput(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateView__SetGeneratorOutput__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getName()
	 * @generated
	 */
	EOperation getRootStateView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getLabel()
	 * @generated
	 */
	EOperation getRootStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView <em>Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView
	 * @generated
	 */
	EClass getRegionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getInternalRegion <em>Internal Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Region</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getInternalRegion()
	 * @see #getRegionView()
	 * @generated
	 */
	EReference getRegionView_InternalRegion();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getName()
	 * @generated
	 */
	EOperation getRegionView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getLabel()
	 * @generated
	 */
	EOperation getRegionView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getUuid()
	 * @generated
	 */
	EOperation getRegionView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView <em>Region Ref View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Ref View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView
	 * @generated
	 */
	EClass getRegionRefView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView#getInternalRegionRef <em>Internal Region Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Region Ref</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView#getInternalRegionRef()
	 * @see #getRegionRefView()
	 * @generated
	 */
	EReference getRegionRefView_InternalRegionRef();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView <em>Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView
	 * @generated
	 */
	EClass getSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getInternalSuperState()
	 * @see #getSuperStateView()
	 * @generated
	 */
	EReference getSuperStateView_InternalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getName()
	 * @generated
	 */
	EOperation getSuperStateView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getLabel()
	 * @generated
	 */
	EOperation getSuperStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView <em>Initial Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView
	 * @generated
	 */
	EClass getInitialSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView#getInternalInitialSuperState <em>Internal Initial Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialSuperStateView#getInternalInitialSuperState()
	 * @see #getInitialSuperStateView()
	 * @generated
	 */
	EReference getInitialSuperStateView_InternalInitialSuperState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView <em>Final Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView
	 * @generated
	 */
	EClass getFinalSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView#getInternalFinalSuperState <em>Internal Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalSuperStateView#getInternalFinalSuperState()
	 * @see #getFinalSuperStateView()
	 * @generated
	 */
	EReference getFinalSuperStateView_InternalFinalSuperState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView <em>Initial Final Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Final Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView
	 * @generated
	 */
	EClass getInitialFinalSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView#getInternalInitialFinalSuperState <em>Internal Initial Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial Final Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSuperStateView#getInternalInitialFinalSuperState()
	 * @see #getInitialFinalSuperStateView()
	 * @generated
	 */
	EReference getInitialFinalSuperStateView_InternalInitialFinalSuperState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView <em>Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView
	 * @generated
	 */
	EClass getDeclarationView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getInternalDeclaration <em>Internal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getInternalDeclaration()
	 * @see #getDeclarationView()
	 * @generated
	 */
	EReference getDeclarationView_InternalDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getDeclarationType() <em>Get Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getDeclarationType()
	 * @generated
	 */
	EOperation getDeclarationView__GetDeclarationType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setDeclarationType(java.lang.String) <em>Set Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setDeclarationType(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetDeclarationType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#isConstant() <em>Is Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Constant</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#isConstant()
	 * @generated
	 */
	EOperation getDeclarationView__IsConstant();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setConstant(boolean) <em>Set Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Constant</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setConstant(boolean)
	 * @generated
	 */
	EOperation getDeclarationView__SetConstant__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getInputOutput() <em>Get Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getInputOutput()
	 * @generated
	 */
	EOperation getDeclarationView__GetInputOutput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setInputOutput(java.lang.String) <em>Set Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setInputOutput(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetInputOutput__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getAssignment() <em>Get Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assignment</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getAssignment()
	 * @generated
	 */
	EOperation getDeclarationView__GetAssignment();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setAssignment(java.lang.String) <em>Set Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Assignment</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setAssignment(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetAssignment__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getName()
	 * @generated
	 */
	EOperation getDeclarationView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#isSignal() <em>Is Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Signal</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#isSignal()
	 * @generated
	 */
	EOperation getDeclarationView__IsSignal();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setSignal(boolean) <em>Set Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Signal</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setSignal(boolean)
	 * @generated
	 */
	EOperation getDeclarationView__SetSignal__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#getUuid()
	 * @generated
	 */
	EOperation getDeclarationView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView <em>Suspension View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView
	 * @generated
	 */
	EClass getSuspensionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getInternalSuspension <em>Internal Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Suspension</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getInternalSuspension()
	 * @see #getSuspensionView()
	 * @generated
	 */
	EReference getSuspensionView_InternalSuspension();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getSuspensionType() <em>Get Suspension Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Suspension Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getSuspensionType()
	 * @generated
	 */
	EOperation getSuspensionView__GetSuspensionType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#setSuspensionType(java.lang.String) <em>Set Suspension Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Suspension Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#setSuspensionType(java.lang.String)
	 * @generated
	 */
	EOperation getSuspensionView__SetSuspensionType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getCondition()
	 * @generated
	 */
	EOperation getSuspensionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getSuspensionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#getUuid()
	 * @generated
	 */
	EOperation getSuspensionView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getSuspensionView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView <em>Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView
	 * @generated
	 */
	EClass getActionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getInternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Action</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getInternalAction()
	 * @see #getActionView()
	 * @generated
	 */
	EReference getActionView_InternalAction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getActionType() <em>Get Action Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Action Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getActionType()
	 * @generated
	 */
	EOperation getActionView__GetActionType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setActionType(java.lang.String) <em>Set Action Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Action Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setActionType(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetActionType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getCondition()
	 * @generated
	 */
	EOperation getActionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getEffect()
	 * @generated
	 */
	EOperation getActionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetEffect__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#getUuid()
	 * @generated
	 */
	EOperation getActionView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView <em>Simple State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView
	 * @generated
	 */
	EClass getSimpleStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getInternalSimpleState <em>Internal Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Simple State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getInternalSimpleState()
	 * @see #getSimpleStateView()
	 * @generated
	 */
	EReference getSimpleStateView_InternalSimpleState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getName()
	 * @generated
	 */
	EOperation getSimpleStateView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSimpleStateView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getLabel()
	 * @generated
	 */
	EOperation getSimpleStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSimpleStateView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView <em>Initial State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView
	 * @generated
	 */
	EClass getInitialStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView#getInternalInitialState <em>Internal Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView#getInternalInitialState()
	 * @see #getInitialStateView()
	 * @generated
	 */
	EReference getInitialStateView_InternalInitialState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView <em>Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView
	 * @generated
	 */
	EClass getFinalStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView#getInternalFinalState <em>Internal Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView#getInternalFinalState()
	 * @see #getFinalStateView()
	 * @generated
	 */
	EReference getFinalStateView_InternalFinalState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView <em>Initial Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Final State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView
	 * @generated
	 */
	EClass getInitialFinalStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView#getInternalInitialFinalState <em>Internal Initial Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial Final State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalStateView#getInternalInitialFinalState()
	 * @see #getInitialFinalStateView()
	 * @generated
	 */
	EReference getInitialFinalStateView_InternalInitialFinalState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView <em>Connector View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView
	 * @generated
	 */
	EClass getConnectorView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView#getInternalConnector <em>Internal Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Connector</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView#getInternalConnector()
	 * @see #getConnectorView()
	 * @generated
	 */
	EReference getConnectorView_InternalConnector();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView <em>SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView
	 * @generated
	 */
	EClass getSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getInternalSCChartReferece <em>Internal SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getInternalSCChartReferece()
	 * @see #getSCChartRefereceView()
	 * @generated
	 */
	EReference getSCChartRefereceView_InternalSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getAssignments() <em>Get Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assignments</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getAssignments()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetAssignments();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setAssignments(java.lang.String) <em>Set Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Assignments</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setAssignments(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetAssignments__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getName()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getInputsOutputsOfRef() <em>Get Inputs Outputs Of Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inputs Outputs Of Ref</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getInputsOutputsOfRef()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetInputsOutputsOfRef();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setInputsOutputsOfRef(java.lang.String) <em>Set Inputs Outputs Of Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Inputs Outputs Of Ref</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setInputsOutputsOfRef(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetInputsOutputsOfRef__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#getLabel()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartRefereceView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialSCChartRefereceView <em>Initial SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialSCChartRefereceView
	 * @generated
	 */
	EClass getInitialSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialSCChartRefereceView#getInternalInitialSCChartReferece <em>Internal Initial SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialSCChartRefereceView#getInternalInitialSCChartReferece()
	 * @see #getInitialSCChartRefereceView()
	 * @generated
	 */
	EReference getInitialSCChartRefereceView_InternalInitialSCChartReferece();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView <em>Final SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView
	 * @generated
	 */
	EClass getFinalSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView#getInternalFinalSCChartReferece <em>Internal Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView#getInternalFinalSCChartReferece()
	 * @see #getFinalSCChartRefereceView()
	 * @generated
	 */
	EReference getFinalSCChartRefereceView_InternalFinalSCChartReferece();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView <em>Initial Final SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Final SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView
	 * @generated
	 */
	EClass getInitialFinalSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView#getInternalInitialFinalSCChartReferece <em>Internal Initial Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial Final SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialFinalSCChartRefereceView#getInternalInitialFinalSCChartReferece()
	 * @see #getInitialFinalSCChartRefereceView()
	 * @generated
	 */
	EReference getInitialFinalSCChartRefereceView_InternalInitialFinalSCChartReferece();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView <em>Abstract Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView
	 * @generated
	 */
	EClass getAbstractTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView#getInternalAbstractTransition <em>Internal Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Abstract Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView#getInternalAbstractTransition()
	 * @see #getAbstractTransitionView()
	 * @generated
	 */
	EReference getAbstractTransitionView_InternalAbstractTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView#getPriority() <em>Get Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Priority</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView#getPriority()
	 * @generated
	 */
	EOperation getAbstractTransitionView__GetPriority();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView#setPriority(java.lang.String) <em>Set Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Priority</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.AbstractTransitionView#setPriority(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractTransitionView__SetPriority__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView
	 * @generated
	 */
	EClass getTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getInternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getInternalTransition()
	 * @see #getTransitionView()
	 * @generated
	 */
	EReference getTransitionView_InternalTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getCondition()
	 * @generated
	 */
	EOperation getTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#isImmediate()
	 * @generated
	 */
	EOperation getTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getEffect()
	 * @generated
	 */
	EOperation getTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView <em>Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView
	 * @generated
	 */
	EClass getTerminationTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getInternalTerminationTransition <em>Internal Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getInternalTerminationTransition()
	 * @see #getTerminationTransitionView()
	 * @generated
	 */
	EReference getTerminationTransitionView_InternalTerminationTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getCondition()
	 * @generated
	 */
	EOperation getTerminationTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getTerminationTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getTerminationTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getTerminationTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView <em>Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView
	 * @generated
	 */
	EClass getStrongAbortTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition()
	 * @see #getStrongAbortTransitionView()
	 * @generated
	 */
	EReference getStrongAbortTransitionView_InternalStrongAbortTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView <em>Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView
	 * @generated
	 */
	EClass getDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getInternalDeferredTransition <em>Internal Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getInternalDeferredTransition()
	 * @see #getDeferredTransitionView()
	 * @generated
	 */
	EReference getDeferredTransitionView_InternalDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getDeferredTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView <em>History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView
	 * @generated
	 */
	EClass getHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getInternalHistoryTransition <em>Internal History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getInternalHistoryTransition()
	 * @see #getHistoryTransitionView()
	 * @generated
	 */
	EReference getHistoryTransitionView_InternalHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getHistoryTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView <em>Termination Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView
	 * @generated
	 */
	EClass getTerminationDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getInternalTerminationDeferredTransition <em>Internal Termination Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getInternalTerminationDeferredTransition()
	 * @see #getTerminationDeferredTransitionView()
	 * @generated
	 */
	EReference getTerminationDeferredTransitionView_InternalTerminationDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView <em>Strong Abort Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView
	 * @generated
	 */
	EClass getStrongAbortDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getInternalStrongAbortDeferredTransition <em>Internal Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getInternalStrongAbortDeferredTransition()
	 * @see #getStrongAbortDeferredTransitionView()
	 * @generated
	 */
	EReference getStrongAbortDeferredTransitionView_InternalStrongAbortDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView <em>Termination History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView
	 * @generated
	 */
	EClass getTerminationHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getInternalTerminationHistoryTransition <em>Internal Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getInternalTerminationHistoryTransition()
	 * @see #getTerminationHistoryTransitionView()
	 * @generated
	 */
	EReference getTerminationHistoryTransitionView_InternalTerminationHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView <em>Strong Abort History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView
	 * @generated
	 */
	EClass getStrongAbortHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getInternalStrongAbortHistoryTransition <em>Internal Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getInternalStrongAbortHistoryTransition()
	 * @see #getStrongAbortHistoryTransitionView()
	 * @generated
	 */
	EReference getStrongAbortHistoryTransitionView_InternalStrongAbortHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView <em>Deferred History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView
	 * @generated
	 */
	EClass getDeferredHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getInternalDeferredHistoryTransition <em>Internal Deferred History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Deferred History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getInternalDeferredHistoryTransition()
	 * @see #getDeferredHistoryTransitionView()
	 * @generated
	 */
	EReference getDeferredHistoryTransitionView_InternalDeferredHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView <em>Strong Abort Deferred History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Deferred History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView
	 * @generated
	 */
	EClass getStrongAbortDeferredHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getInternalStrongAbortDeferredHistoryTransition <em>Internal Strong Abort Deferred History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort Deferred History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getInternalStrongAbortDeferredHistoryTransition()
	 * @see #getStrongAbortDeferredHistoryTransitionView()
	 * @generated
	 */
	EReference getStrongAbortDeferredHistoryTransitionView_InternalStrongAbortDeferredHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView <em>Termination Deferred History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Deferred History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView
	 * @generated
	 */
	EClass getTerminationDeferredHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getInternalTerminationDeferredHistoryTransition <em>Internal Termination Deferred History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination Deferred History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getInternalTerminationDeferredHistoryTransition()
	 * @see #getTerminationDeferredHistoryTransitionView()
	 * @generated
	 */
	EReference getTerminationDeferredHistoryTransitionView_InternalTerminationDeferredHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#isImmediate() <em>Is Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#isImmediate()
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__IsImmediate();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setImmediate(boolean) <em>Set Immediate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Immediate</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setImmediate(boolean)
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__SetImmediate__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDeferredHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView <em>SC Chart View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView
	 * @generated
	 */
	EClass getSCChartView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#getInternalSCChart <em>Internal SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal SC Chart</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#getInternalSCChart()
	 * @see #getSCChartView()
	 * @generated
	 */
	EReference getSCChartView_InternalSCChart();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#getName()
	 * @generated
	 */
	EOperation getSCChartView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartView__SetName__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl <em>Root State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateView()
		 * @generated
		 */
		EClass ROOT_STATE_VIEW = eINSTANCE.getRootStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Root State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_STATE_VIEW__INTERNAL_ROOT_STATE = eINSTANCE.getRootStateView_InternalRootState();

		/**
		 * The meta object literal for the '<em><b>Get Generator Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___GET_GENERATOR_OUTPUT = eINSTANCE.getRootStateView__GetGeneratorOutput();

		/**
		 * The meta object literal for the '<em><b>Set Generator Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___SET_GENERATOR_OUTPUT__STRING = eINSTANCE.getRootStateView__SetGeneratorOutput__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___GET_NAME = eINSTANCE.getRootStateView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___SET_NAME__STRING = eINSTANCE.getRootStateView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___GET_LABEL = eINSTANCE.getRootStateView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___SET_LABEL__STRING = eINSTANCE.getRootStateView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl <em>Region View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRegionView()
		 * @generated
		 */
		EClass REGION_VIEW = eINSTANCE.getRegionView();

		/**
		 * The meta object literal for the '<em><b>Internal Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_VIEW__INTERNAL_REGION = eINSTANCE.getRegionView_InternalRegion();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___GET_NAME = eINSTANCE.getRegionView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___SET_NAME__STRING = eINSTANCE.getRegionView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___GET_LABEL = eINSTANCE.getRegionView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___SET_LABEL__STRING = eINSTANCE.getRegionView__SetLabel__String();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___GET_UUID = eINSTANCE.getRegionView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___SET_UUID__STRING = eINSTANCE.getRegionView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionRefViewImpl <em>Region Ref View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionRefViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRegionRefView()
		 * @generated
		 */
		EClass REGION_REF_VIEW = eINSTANCE.getRegionRefView();

		/**
		 * The meta object literal for the '<em><b>Internal Region Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_REF_VIEW__INTERNAL_REGION_REF = eINSTANCE.getRegionRefView_InternalRegionRef();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl <em>Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateView()
		 * @generated
		 */
		EClass SUPER_STATE_VIEW = eINSTANCE.getSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = eINSTANCE.getSuperStateView_InternalSuperState();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___GET_NAME = eINSTANCE.getSuperStateView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___SET_NAME__STRING = eINSTANCE.getSuperStateView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___GET_LABEL = eINSTANCE.getSuperStateView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___SET_LABEL__STRING = eINSTANCE.getSuperStateView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSuperStateViewImpl <em>Initial Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialSuperStateView()
		 * @generated
		 */
		EClass INITIAL_SUPER_STATE_VIEW = eINSTANCE.getInitialSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_SUPER_STATE = eINSTANCE.getInitialSuperStateView_InternalInitialSuperState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSuperStateViewImpl <em>Final Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalSuperStateView()
		 * @generated
		 */
		EClass FINAL_SUPER_STATE_VIEW = eINSTANCE.getFinalSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Final Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_SUPER_STATE_VIEW__INTERNAL_FINAL_SUPER_STATE = eINSTANCE.getFinalSuperStateView_InternalFinalSuperState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSuperStateViewImpl <em>Initial Final Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialFinalSuperStateView()
		 * @generated
		 */
		EClass INITIAL_FINAL_SUPER_STATE_VIEW = eINSTANCE.getInitialFinalSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial Final Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_FINAL_SUPER_STATE_VIEW__INTERNAL_INITIAL_FINAL_SUPER_STATE = eINSTANCE.getInitialFinalSuperStateView_InternalInitialFinalSuperState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeclarationViewImpl <em>Declaration View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeclarationViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDeclarationView()
		 * @generated
		 */
		EClass DECLARATION_VIEW = eINSTANCE.getDeclarationView();

		/**
		 * The meta object literal for the '<em><b>Internal Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_VIEW__INTERNAL_DECLARATION = eINSTANCE.getDeclarationView_InternalDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___GET_DECLARATION_TYPE = eINSTANCE.getDeclarationView__GetDeclarationType();

		/**
		 * The meta object literal for the '<em><b>Set Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING = eINSTANCE.getDeclarationView__SetDeclarationType__String();

		/**
		 * The meta object literal for the '<em><b>Is Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___IS_CONSTANT = eINSTANCE.getDeclarationView__IsConstant();

		/**
		 * The meta object literal for the '<em><b>Set Constant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_CONSTANT__BOOLEAN = eINSTANCE.getDeclarationView__SetConstant__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Input Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___GET_INPUT_OUTPUT = eINSTANCE.getDeclarationView__GetInputOutput();

		/**
		 * The meta object literal for the '<em><b>Set Input Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING = eINSTANCE.getDeclarationView__SetInputOutput__String();

		/**
		 * The meta object literal for the '<em><b>Get Assignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___GET_ASSIGNMENT = eINSTANCE.getDeclarationView__GetAssignment();

		/**
		 * The meta object literal for the '<em><b>Set Assignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_ASSIGNMENT__STRING = eINSTANCE.getDeclarationView__SetAssignment__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___GET_NAME = eINSTANCE.getDeclarationView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_NAME__STRING = eINSTANCE.getDeclarationView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Is Signal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___IS_SIGNAL = eINSTANCE.getDeclarationView__IsSignal();

		/**
		 * The meta object literal for the '<em><b>Set Signal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_SIGNAL__BOOLEAN = eINSTANCE.getDeclarationView__SetSignal__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___GET_UUID = eINSTANCE.getDeclarationView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECLARATION_VIEW___SET_UUID__STRING = eINSTANCE.getDeclarationView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuspensionViewImpl <em>Suspension View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuspensionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuspensionView()
		 * @generated
		 */
		EClass SUSPENSION_VIEW = eINSTANCE.getSuspensionView();

		/**
		 * The meta object literal for the '<em><b>Internal Suspension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUSPENSION_VIEW__INTERNAL_SUSPENSION = eINSTANCE.getSuspensionView_InternalSuspension();

		/**
		 * The meta object literal for the '<em><b>Get Suspension Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPENSION_VIEW___GET_SUSPENSION_TYPE = eINSTANCE.getSuspensionView__GetSuspensionType();

		/**
		 * The meta object literal for the '<em><b>Set Suspension Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPENSION_VIEW___SET_SUSPENSION_TYPE__STRING = eINSTANCE.getSuspensionView__SetSuspensionType__String();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPENSION_VIEW___GET_CONDITION = eINSTANCE.getSuspensionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPENSION_VIEW___SET_CONDITION__STRING = eINSTANCE.getSuspensionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPENSION_VIEW___GET_UUID = eINSTANCE.getSuspensionView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPENSION_VIEW___SET_UUID__STRING = eINSTANCE.getSuspensionView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ActionViewImpl <em>Action View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ActionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getActionView()
		 * @generated
		 */
		EClass ACTION_VIEW = eINSTANCE.getActionView();

		/**
		 * The meta object literal for the '<em><b>Internal Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_VIEW__INTERNAL_ACTION = eINSTANCE.getActionView_InternalAction();

		/**
		 * The meta object literal for the '<em><b>Get Action Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___GET_ACTION_TYPE = eINSTANCE.getActionView__GetActionType();

		/**
		 * The meta object literal for the '<em><b>Set Action Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___SET_ACTION_TYPE__STRING = eINSTANCE.getActionView__SetActionType__String();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___GET_CONDITION = eINSTANCE.getActionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___SET_CONDITION__STRING = eINSTANCE.getActionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___GET_EFFECT = eINSTANCE.getActionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___SET_EFFECT__STRING = eINSTANCE.getActionView__SetEffect__String();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___GET_UUID = eINSTANCE.getActionView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_VIEW___SET_UUID__STRING = eINSTANCE.getActionView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl <em>Simple State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSimpleStateView()
		 * @generated
		 */
		EClass SIMPLE_STATE_VIEW = eINSTANCE.getSimpleStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Simple State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE = eINSTANCE.getSimpleStateView_InternalSimpleState();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_STATE_VIEW___GET_NAME = eINSTANCE.getSimpleStateView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_STATE_VIEW___SET_NAME__STRING = eINSTANCE.getSimpleStateView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_STATE_VIEW___GET_LABEL = eINSTANCE.getSimpleStateView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_STATE_VIEW___SET_LABEL__STRING = eINSTANCE.getSimpleStateView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl <em>Initial State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialStateView()
		 * @generated
		 */
		EClass INITIAL_STATE_VIEW = eINSTANCE.getInitialStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE = eINSTANCE.getInitialStateView_InternalInitialState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl <em>Final State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalStateView()
		 * @generated
		 */
		EClass FINAL_STATE_VIEW = eINSTANCE.getFinalStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Final State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE_VIEW__INTERNAL_FINAL_STATE = eINSTANCE.getFinalStateView_InternalFinalState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalStateViewImpl <em>Initial Final State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialFinalStateView()
		 * @generated
		 */
		EClass INITIAL_FINAL_STATE_VIEW = eINSTANCE.getInitialFinalStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial Final State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_FINAL_STATE_VIEW__INTERNAL_INITIAL_FINAL_STATE = eINSTANCE.getInitialFinalStateView_InternalInitialFinalState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl <em>Connector View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getConnectorView()
		 * @generated
		 */
		EClass CONNECTOR_VIEW = eINSTANCE.getConnectorView();

		/**
		 * The meta object literal for the '<em><b>Internal Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_VIEW__INTERNAL_CONNECTOR = eINSTANCE.getConnectorView_InternalConnector();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartRefereceViewImpl <em>SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSCChartRefereceView()
		 * @generated
		 */
		EClass SC_CHART_REFERECE_VIEW = eINSTANCE.getSCChartRefereceView();

		/**
		 * The meta object literal for the '<em><b>Internal SC Chart Referece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE = eINSTANCE.getSCChartRefereceView_InternalSCChartReferece();

		/**
		 * The meta object literal for the '<em><b>Get Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS = eINSTANCE.getSCChartRefereceView__GetAssignments();

		/**
		 * The meta object literal for the '<em><b>Set Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__STRING = eINSTANCE.getSCChartRefereceView__SetAssignments__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___GET_NAME = eINSTANCE.getSCChartRefereceView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___SET_NAME__STRING = eINSTANCE.getSCChartRefereceView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Inputs Outputs Of Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS_OF_REF = eINSTANCE.getSCChartRefereceView__GetInputsOutputsOfRef();

		/**
		 * The meta object literal for the '<em><b>Set Inputs Outputs Of Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS_OF_REF__STRING = eINSTANCE.getSCChartRefereceView__SetInputsOutputsOfRef__String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___GET_LABEL = eINSTANCE.getSCChartRefereceView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___SET_LABEL__STRING = eINSTANCE.getSCChartRefereceView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSCChartRefereceViewImpl <em>Initial SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialSCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialSCChartRefereceView()
		 * @generated
		 */
		EClass INITIAL_SC_CHART_REFERECE_VIEW = eINSTANCE.getInitialSCChartRefereceView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial SC Chart Referece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_SC_CHART_REFERECE = eINSTANCE.getInitialSCChartRefereceView_InternalInitialSCChartReferece();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSCChartRefereceViewImpl <em>Final SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalSCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalSCChartRefereceView()
		 * @generated
		 */
		EClass FINAL_SC_CHART_REFERECE_VIEW = eINSTANCE.getFinalSCChartRefereceView();

		/**
		 * The meta object literal for the '<em><b>Internal Final SC Chart Referece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_FINAL_SC_CHART_REFERECE = eINSTANCE.getFinalSCChartRefereceView_InternalFinalSCChartReferece();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSCChartRefereceViewImpl <em>Initial Final SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialFinalSCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialFinalSCChartRefereceView()
		 * @generated
		 */
		EClass INITIAL_FINAL_SC_CHART_REFERECE_VIEW = eINSTANCE.getInitialFinalSCChartRefereceView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial Final SC Chart Referece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_FINAL_SC_CHART_REFERECE_VIEW__INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE = eINSTANCE.getInitialFinalSCChartRefereceView_InternalInitialFinalSCChartReferece();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.AbstractTransitionViewImpl <em>Abstract Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.AbstractTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getAbstractTransitionView()
		 * @generated
		 */
		EClass ABSTRACT_TRANSITION_VIEW = eINSTANCE.getAbstractTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Abstract Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = eINSTANCE.getAbstractTransitionView_InternalAbstractTransition();

		/**
		 * The meta object literal for the '<em><b>Get Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TRANSITION_VIEW___GET_PRIORITY = eINSTANCE.getAbstractTransitionView__GetPriority();

		/**
		 * The meta object literal for the '<em><b>Set Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING = eINSTANCE.getAbstractTransitionView__SetPriority__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTransitionView()
		 * @generated
		 */
		EClass TRANSITION_VIEW = eINSTANCE.getTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIEW__INTERNAL_TRANSITION = eINSTANCE.getTransitionView_InternalTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationTransitionViewImpl <em>Termination Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationTransitionView()
		 * @generated
		 */
		EClass TERMINATION_TRANSITION_VIEW = eINSTANCE.getTerminationTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Termination Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION = eINSTANCE.getTerminationTransitionView_InternalTerminationTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getTerminationTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getTerminationTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getTerminationTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getTerminationTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getTerminationTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getTerminationTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getTerminationTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getTerminationTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl <em>Strong Abort Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortTransitionView()
		 * @generated
		 */
		EClass STRONG_ABORT_TRANSITION_VIEW = eINSTANCE.getStrongAbortTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Strong Abort Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION = eINSTANCE.getStrongAbortTransitionView_InternalStrongAbortTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getStrongAbortTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getStrongAbortTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getStrongAbortTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getStrongAbortTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getStrongAbortTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getStrongAbortTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getStrongAbortTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getStrongAbortTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredTransitionViewImpl <em>Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDeferredTransitionView()
		 * @generated
		 */
		EClass DEFERRED_TRANSITION_VIEW = eINSTANCE.getDeferredTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Deferred Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION = eINSTANCE.getDeferredTransitionView_InternalDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getDeferredTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getDeferredTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getDeferredTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getDeferredTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getDeferredTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getDeferredTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getDeferredTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getDeferredTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.HistoryTransitionViewImpl <em>History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.HistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getHistoryTransitionView()
		 * @generated
		 */
		EClass HISTORY_TRANSITION_VIEW = eINSTANCE.getHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION = eINSTANCE.getHistoryTransitionView_InternalHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getHistoryTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getHistoryTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredTransitionViewImpl <em>Termination Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationDeferredTransitionView()
		 * @generated
		 */
		EClass TERMINATION_DEFERRED_TRANSITION_VIEW = eINSTANCE.getTerminationDeferredTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Termination Deferred Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION = eINSTANCE.getTerminationDeferredTransitionView_InternalTerminationDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getTerminationDeferredTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getTerminationDeferredTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getTerminationDeferredTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getTerminationDeferredTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getTerminationDeferredTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getTerminationDeferredTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getTerminationDeferredTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getTerminationDeferredTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredTransitionViewImpl <em>Strong Abort Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortDeferredTransitionView()
		 * @generated
		 */
		EClass STRONG_ABORT_DEFERRED_TRANSITION_VIEW = eINSTANCE.getStrongAbortDeferredTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Strong Abort Deferred Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION = eINSTANCE.getStrongAbortDeferredTransitionView_InternalStrongAbortDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getStrongAbortDeferredTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getStrongAbortDeferredTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getStrongAbortDeferredTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getStrongAbortDeferredTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getStrongAbortDeferredTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getStrongAbortDeferredTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getStrongAbortDeferredTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getStrongAbortDeferredTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationHistoryTransitionViewImpl <em>Termination History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationHistoryTransitionView()
		 * @generated
		 */
		EClass TERMINATION_HISTORY_TRANSITION_VIEW = eINSTANCE.getTerminationHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Termination History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION = eINSTANCE.getTerminationHistoryTransitionView_InternalTerminationHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getTerminationHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getTerminationHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getTerminationHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getTerminationHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getTerminationHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getTerminationHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getTerminationHistoryTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getTerminationHistoryTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getTerminationHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getTerminationHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortHistoryTransitionViewImpl <em>Strong Abort History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortHistoryTransitionView()
		 * @generated
		 */
		EClass STRONG_ABORT_HISTORY_TRANSITION_VIEW = eINSTANCE.getStrongAbortHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Strong Abort History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION = eINSTANCE.getStrongAbortHistoryTransitionView_InternalStrongAbortHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getStrongAbortHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getStrongAbortHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getStrongAbortHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getStrongAbortHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getStrongAbortHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getStrongAbortHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getStrongAbortHistoryTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getStrongAbortHistoryTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getStrongAbortHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getStrongAbortHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredHistoryTransitionViewImpl <em>Deferred History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDeferredHistoryTransitionView()
		 * @generated
		 */
		EClass DEFERRED_HISTORY_TRANSITION_VIEW = eINSTANCE.getDeferredHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Deferred History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION = eINSTANCE.getDeferredHistoryTransitionView_InternalDeferredHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getDeferredHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getDeferredHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getDeferredHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getDeferredHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getDeferredHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getDeferredHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getDeferredHistoryTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getDeferredHistoryTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getDeferredHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getDeferredHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredHistoryTransitionViewImpl <em>Strong Abort Deferred History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortDeferredHistoryTransitionView()
		 * @generated
		 */
		EClass STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW = eINSTANCE.getStrongAbortDeferredHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Strong Abort Deferred History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION = eINSTANCE.getStrongAbortDeferredHistoryTransitionView_InternalStrongAbortDeferredHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getStrongAbortDeferredHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredHistoryTransitionViewImpl <em>Termination Deferred History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTerminationDeferredHistoryTransitionView()
		 * @generated
		 */
		EClass TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW = eINSTANCE.getTerminationDeferredHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Termination Deferred History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION = eINSTANCE.getTerminationDeferredHistoryTransitionView_InternalTerminationDeferredHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getTerminationDeferredHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getTerminationDeferredHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getTerminationDeferredHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getTerminationDeferredHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getTerminationDeferredHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getTerminationDeferredHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE = eINSTANCE.getTerminationDeferredHistoryTransitionView__IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Set Immediate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN = eINSTANCE.getTerminationDeferredHistoryTransitionView__SetImmediate__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getTerminationDeferredHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getTerminationDeferredHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl <em>SC Chart View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSCChartView()
		 * @generated
		 */
		EClass SC_CHART_VIEW = eINSTANCE.getSCChartView();

		/**
		 * The meta object literal for the '<em><b>Internal SC Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CHART_VIEW__INTERNAL_SC_CHART = eINSTANCE.getSCChartView_InternalSCChart();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_VIEW___GET_NAME = eINSTANCE.getSCChartView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_VIEW___SET_NAME__STRING = eINSTANCE.getSCChartView__SetName__String();

	}

} //ViewsPackage
