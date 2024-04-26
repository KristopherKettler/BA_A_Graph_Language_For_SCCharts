/**
 */
package info.scce.cinco.product.scchart.scchart.views;

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
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsFactory
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
	String eNS_URI = "http://cinco.scce.info/product/scchart/views";

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
	ViewsPackage eINSTANCE = info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.RootStateViewImpl <em>Root State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.RootStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getRootStateView()
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
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_LABEL = 2;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_LABEL__STRING = 3;

	/**
	 * The number of operations of the '<em>Root State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.RegionViewImpl <em>Region View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.RegionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getRegionView()
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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.DataFlowRegionViewImpl <em>Data Flow Region View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.DataFlowRegionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getDataFlowRegionView()
	 * @generated
	 */
	int DATA_FLOW_REGION_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW__INTERNAL_REGION = REGION_VIEW__INTERNAL_REGION;

	/**
	 * The feature id for the '<em><b>Internal Data Flow Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION = REGION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Flow Region View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW_FEATURE_COUNT = REGION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW___GET_NAME = REGION_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW___SET_NAME__STRING = REGION_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW___GET_LABEL = REGION_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW___SET_LABEL__STRING = REGION_VIEW___SET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW___GET_UUID = REGION_VIEW___GET_UUID;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW___SET_UUID__STRING = REGION_VIEW___SET_UUID__STRING;

	/**
	 * The number of operations of the '<em>Data Flow Region View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_REGION_VIEW_OPERATION_COUNT = REGION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SuperStateViewImpl <em>Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.SuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSuperStateView()
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
	 * The operation id for the '<em>Get Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___GET_INPUTS_OUTPUTS = 4;

	/**
	 * The operation id for the '<em>Set Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___SET_INPUTS_OUTPUTS__ELIST = 5;

	/**
	 * The operation id for the '<em>Add Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___ADD_INPUTS_OUTPUTS__STRING = 6;

	/**
	 * The operation id for the '<em>Remove Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___REMOVE_INPUTS_OUTPUTS__STRING = 7;

	/**
	 * The number of operations of the '<em>Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InitilalSuperStateViewImpl <em>Initilal Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.InitilalSuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInitilalSuperStateView()
	 * @generated
	 */
	int INITILAL_SUPER_STATE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = SUPER_STATE_VIEW__INTERNAL_SUPER_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initilal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE = SUPER_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initilal Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW_FEATURE_COUNT = SUPER_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___GET_NAME = SUPER_STATE_VIEW___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___SET_NAME__STRING = SUPER_STATE_VIEW___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___GET_LABEL = SUPER_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___SET_LABEL__STRING = SUPER_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___GET_INPUTS_OUTPUTS = SUPER_STATE_VIEW___GET_INPUTS_OUTPUTS;

	/**
	 * The operation id for the '<em>Set Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___SET_INPUTS_OUTPUTS__ELIST = SUPER_STATE_VIEW___SET_INPUTS_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Add Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___ADD_INPUTS_OUTPUTS__STRING = SUPER_STATE_VIEW___ADD_INPUTS_OUTPUTS__STRING;

	/**
	 * The operation id for the '<em>Remove Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___REMOVE_INPUTS_OUTPUTS__STRING = SUPER_STATE_VIEW___REMOVE_INPUTS_OUTPUTS__STRING;

	/**
	 * The number of operations of the '<em>Initilal Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW_OPERATION_COUNT = SUPER_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalSuperStateViewImpl <em>Final Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.FinalSuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getFinalSuperStateView()
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
	 * The operation id for the '<em>Get Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___GET_INPUTS_OUTPUTS = SUPER_STATE_VIEW___GET_INPUTS_OUTPUTS;

	/**
	 * The operation id for the '<em>Set Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___SET_INPUTS_OUTPUTS__ELIST = SUPER_STATE_VIEW___SET_INPUTS_OUTPUTS__ELIST;

	/**
	 * The operation id for the '<em>Add Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___ADD_INPUTS_OUTPUTS__STRING = SUPER_STATE_VIEW___ADD_INPUTS_OUTPUTS__STRING;

	/**
	 * The operation id for the '<em>Remove Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW___REMOVE_INPUTS_OUTPUTS__STRING = SUPER_STATE_VIEW___REMOVE_INPUTS_OUTPUTS__STRING;

	/**
	 * The number of operations of the '<em>Final Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SUPER_STATE_VIEW_OPERATION_COUNT = SUPER_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.DeclarationViewImpl <em>Declaration View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.DeclarationViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getDeclarationView()
	 * @generated
	 */
	int DECLARATION_VIEW = 6;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SuspendViewImpl <em>Suspend View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.SuspendViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSuspendView()
	 * @generated
	 */
	int SUSPEND_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Internal Suspend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW__INTERNAL_SUSPEND = 0;

	/**
	 * The number of structural features of the '<em>Suspend View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW___GET_CONDITION = 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW___SET_CONDITION__STRING = 1;

	/**
	 * The operation id for the '<em>Get Suspend Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW___GET_SUSPEND_TYPE = 2;

	/**
	 * The operation id for the '<em>Set Suspend Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW___SET_SUSPEND_TYPE__STRING = 3;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW___GET_UUID = 4;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW___SET_UUID__STRING = 5;

	/**
	 * The number of operations of the '<em>Suspend View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ActionViewImpl <em>Action View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ActionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getActionView()
	 * @generated
	 */
	int ACTION_VIEW = 8;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SimpleStateViewImpl <em>Simple State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.SimpleStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSimpleStateView()
	 * @generated
	 */
	int SIMPLE_STATE_VIEW = 9;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InitialStateViewImpl <em>Initial State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.InitialStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInitialStateView()
	 * @generated
	 */
	int INITIAL_STATE_VIEW = 10;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalStateViewImpl <em>Final State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.FinalStateViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getFinalStateView()
	 * @generated
	 */
	int FINAL_STATE_VIEW = 11;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConnectorViewImpl <em>Connector View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConnectorViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConnectorView()
	 * @generated
	 */
	int CONNECTOR_VIEW = 12;

	/**
	 * The feature id for the '<em><b>Internal Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW__INTERNAL_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Connector View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InputViewImpl <em>Input View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.InputViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInputView()
	 * @generated
	 */
	int INPUT_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Internal Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW__INTERNAL_INPUT = 0;

	/**
	 * The number of structural features of the '<em>Input View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The number of operations of the '<em>Input View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.OutputViewImpl <em>Output View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.OutputViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getOutputView()
	 * @generated
	 */
	int OUTPUT_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Internal Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VIEW__INTERNAL_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Output View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The number of operations of the '<em>Output View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.OperatorViewImpl <em>Operator View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.OperatorViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getOperatorView()
	 * @generated
	 */
	int OPERATOR_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Internal Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_VIEW__INTERNAL_OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Operator View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_VIEW___GET_OPERATOR = 0;

	/**
	 * The operation id for the '<em>Set Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_VIEW___SET_OPERATOR__STRING = 1;

	/**
	 * The number of operations of the '<em>Operator View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.CircuitConnecterViewImpl <em>Circuit Connecter View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.CircuitConnecterViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getCircuitConnecterView()
	 * @generated
	 */
	int CIRCUIT_CONNECTER_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Internal Circuit Connecter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER = 0;

	/**
	 * The number of structural features of the '<em>Circuit Connecter View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_CONNECTER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Circuit Connecter View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_CONNECTER_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SCChartRefereceViewImpl <em>SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.SCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSCChartRefereceView()
	 * @generated
	 */
	int SC_CHART_REFERECE_VIEW = 17;

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
	int SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST = 1;

	/**
	 * The operation id for the '<em>Add Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING = 2;

	/**
	 * The operation id for the '<em>Remove Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING = 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_NAME = 4;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_NAME__STRING = 5;

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
	 * The operation id for the '<em>Get Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS = 8;

	/**
	 * The operation id for the '<em>Set Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING = 9;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___GET_UUID = 10;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW___SET_UUID__STRING = 11;

	/**
	 * The number of operations of the '<em>SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_REFERECE_VIEW_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InitialSCChartRefereceViewImpl <em>Initial SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.InitialSCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInitialSCChartRefereceView()
	 * @generated
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW = 18;

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
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST = SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST;

	/**
	 * The operation id for the '<em>Add Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING;

	/**
	 * The operation id for the '<em>Remove Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING;

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
	 * The operation id for the '<em>Get Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS = SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS;

	/**
	 * The operation id for the '<em>Set Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING = SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___GET_UUID = SC_CHART_REFERECE_VIEW___GET_UUID;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW___SET_UUID__STRING = SC_CHART_REFERECE_VIEW___SET_UUID__STRING;

	/**
	 * The number of operations of the '<em>Initial SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SC_CHART_REFERECE_VIEW_OPERATION_COUNT = SC_CHART_REFERECE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalSCChartRefereceViewImpl <em>Final SC Chart Referece View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.FinalSCChartRefereceViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getFinalSCChartRefereceView()
	 * @generated
	 */
	int FINAL_SC_CHART_REFERECE_VIEW = 19;

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
	int FINAL_SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST = SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST;

	/**
	 * The operation id for the '<em>Add Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING;

	/**
	 * The operation id for the '<em>Remove Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING = SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING;

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
	 * The operation id for the '<em>Get Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS = SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS;

	/**
	 * The operation id for the '<em>Set Inputs Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING = SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___GET_UUID = SC_CHART_REFERECE_VIEW___GET_UUID;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW___SET_UUID__STRING = SC_CHART_REFERECE_VIEW___SET_UUID__STRING;

	/**
	 * The number of operations of the '<em>Final SC Chart Referece View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_SC_CHART_REFERECE_VIEW_OPERATION_COUNT = SC_CHART_REFERECE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.AbstractTransitionViewImpl <em>Abstract Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.AbstractTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getAbstractTransitionView()
	 * @generated
	 */
	int ABSTRACT_TRANSITION_VIEW = 20;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.TransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTransitionView()
	 * @generated
	 */
	int TRANSITION_VIEW = 21;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateTransitionViewImpl <em>Immediate Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateTransitionView()
	 * @generated
	 */
	int IMMEDIATE_TRANSITION_VIEW = 22;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Immediate Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationTransitionViewImpl <em>Termination Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.TerminationTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTerminationTransitionView()
	 * @generated
	 */
	int TERMINATION_TRANSITION_VIEW = 23;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationTransitionViewImpl <em>Conditional Termination Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConditionalTerminationTransitionView()
	 * @generated
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW = 24;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Conditional Termination Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Conditional Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortTransitionViewImpl <em>Strong Abort Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getStrongAbortTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_TRANSITION_VIEW = 25;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortTransitionViewImpl <em>Immediate Strong Abort Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateStrongAbortTransitionView()
	 * @generated
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW = 26;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Strong Abort Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Immediate Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.DeferredTransitionViewImpl <em>Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.DeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getDeferredTransitionView()
	 * @generated
	 */
	int DEFERRED_TRANSITION_VIEW = 27;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateDeferredTransitionViewImpl <em>Immediate Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateDeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateDeferredTransitionView()
	 * @generated
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW = 28;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Immediate Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationDefferdTransitionViewImpl <em>Termination Defferd Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.TerminationDefferdTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTerminationDefferdTransitionView()
	 * @generated
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW = 29;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Termination Defferd Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination Defferd Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Termination Defferd Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_DEFFERD_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationDeferredTransitionViewImpl <em>Conditional Termination Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationDeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConditionalTerminationDeferredTransitionView()
	 * @generated
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW = 30;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Conditional Termination Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Termination Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Conditional Termination Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortDeferredTransitionViewImpl <em>Strong Abort Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortDeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getStrongAbortDeferredTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW = 31;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Strong Abort Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortDeferredTransitionViewImpl <em>Immediate Strong Abort Deferred Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortDeferredTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateStrongAbortDeferredTransitionView()
	 * @generated
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW = 32;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Strong Abort Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Strong Abort Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Immediate Strong Abort Deferred Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.HistoryTransitionViewImpl <em>History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.HistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getHistoryTransitionView()
	 * @generated
	 */
	int HISTORY_TRANSITION_VIEW = 33;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateHistoryTransitionViewImpl <em>Immediate History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateHistoryTransitionView()
	 * @generated
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW = 34;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Immediate History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationHistoryTransitionViewImpl <em>Termination History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.TerminationHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTerminationHistoryTransitionView()
	 * @generated
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW = 35;

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
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Termination History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationHistoryTransitionViewImpl <em>Conditional Termination History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConditionalTerminationHistoryTransitionView()
	 * @generated
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW = 36;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Conditional Termination History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Termination History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Conditional Termination History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortHistoryTransitionViewImpl <em>Strong Abort History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getStrongAbortHistoryTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW = 37;

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
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Strong Abort History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortHistoryTransitionViewImpl <em>Immediate Strong Abort History Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortHistoryTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateStrongAbortHistoryTransitionView()
	 * @generated
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW = 38;

	/**
	 * The feature id for the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION = ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Strong Abort History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Strong Abort History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW_FEATURE_COUNT = ABSTRACT_TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_PRIORITY = ABSTRACT_TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING = ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING;

	/**
	 * The operation id for the '<em>Get Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_CONDITION = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Count delay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Deep History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Immediate Strong Abort History Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW_OPERATION_COUNT = ABSTRACT_TRANSITION_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConnectionViewImpl <em>Connection View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConnectionViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConnectionView()
	 * @generated
	 */
	int CONNECTION_VIEW = 39;

	/**
	 * The feature id for the '<em><b>Internal Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_VIEW__INTERNAL_CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connection View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SCChartViewImpl <em>SC Chart View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.SCChartViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSCChartView()
	 * @generated
	 */
	int SC_CHART_VIEW = 40;

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
	 * The number of operations of the '<em>SC Chart View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.AssignmentViewImpl <em>Assignment View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.AssignmentViewImpl
	 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getAssignmentView()
	 * @generated
	 */
	int ASSIGNMENT_VIEW = 41;

	/**
	 * The feature id for the '<em><b>Internal Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Assignment View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Assignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_VIEW___GET_ASSIGNMENT = 0;

	/**
	 * The operation id for the '<em>Set Assignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_VIEW___SET_ASSIGNMENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Assignment View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_VIEW_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView <em>Root State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView
	 * @generated
	 */
	EClass getRootStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#getInternalRootState <em>Internal Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Root State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView#getInternalRootState()
	 * @see #getRootStateView()
	 * @generated
	 */
	EReference getRootStateView_InternalRootState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView#getName()
	 * @generated
	 */
	EOperation getRootStateView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView#getLabel()
	 * @generated
	 */
	EOperation getRootStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RootStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.RegionView <em>Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView
	 * @generated
	 */
	EClass getRegionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#getInternalRegion <em>Internal Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Region</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#getInternalRegion()
	 * @see #getRegionView()
	 * @generated
	 */
	EReference getRegionView_InternalRegion();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#getName()
	 * @generated
	 */
	EOperation getRegionView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#getLabel()
	 * @generated
	 */
	EOperation getRegionView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#getUuid()
	 * @generated
	 */
	EOperation getRegionView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.RegionView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.RegionView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView <em>Data Flow Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Region View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView
	 * @generated
	 */
	EClass getDataFlowRegionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView#getInternalDataFlowRegion <em>Internal Data Flow Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Data Flow Region</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView#getInternalDataFlowRegion()
	 * @see #getDataFlowRegionView()
	 * @generated
	 */
	EReference getDataFlowRegionView_InternalDataFlowRegion();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView <em>Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView
	 * @generated
	 */
	EClass getSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#getInternalSuperState()
	 * @see #getSuperStateView()
	 * @generated
	 */
	EReference getSuperStateView_InternalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#getName()
	 * @generated
	 */
	EOperation getSuperStateView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#getLabel()
	 * @generated
	 */
	EOperation getSuperStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#getInputsOutputs() <em>Get Inputs Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inputs Outputs</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#getInputsOutputs()
	 * @generated
	 */
	EOperation getSuperStateView__GetInputsOutputs();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#setInputsOutputs(org.eclipse.emf.common.util.EList) <em>Set Inputs Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Inputs Outputs</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#setInputsOutputs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSuperStateView__SetInputsOutputs__EList();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#addInputsOutputs(java.lang.String) <em>Add Inputs Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Inputs Outputs</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#addInputsOutputs(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__AddInputsOutputs__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#removeInputsOutputs(java.lang.String) <em>Remove Inputs Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Inputs Outputs</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuperStateView#removeInputsOutputs(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__RemoveInputsOutputs__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView <em>Initilal Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initilal Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView
	 * @generated
	 */
	EClass getInitilalSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView#getInternalInitilalSuperState <em>Internal Initilal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initilal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitilalSuperStateView#getInternalInitilalSuperState()
	 * @see #getInitilalSuperStateView()
	 * @generated
	 */
	EReference getInitilalSuperStateView_InternalInitilalSuperState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView <em>Final Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView
	 * @generated
	 */
	EClass getFinalSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView#getInternalFinalSuperState <em>Internal Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final Super State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView#getInternalFinalSuperState()
	 * @see #getFinalSuperStateView()
	 * @generated
	 */
	EReference getFinalSuperStateView_InternalFinalSuperState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView <em>Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView
	 * @generated
	 */
	EClass getDeclarationView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#getInternalDeclaration <em>Internal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#getInternalDeclaration()
	 * @see #getDeclarationView()
	 * @generated
	 */
	EReference getDeclarationView_InternalDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#getDeclarationType() <em>Get Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#getDeclarationType()
	 * @generated
	 */
	EOperation getDeclarationView__GetDeclarationType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setDeclarationType(java.lang.String) <em>Set Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setDeclarationType(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetDeclarationType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#isConstant() <em>Is Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Constant</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#isConstant()
	 * @generated
	 */
	EOperation getDeclarationView__IsConstant();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setConstant(boolean) <em>Set Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Constant</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setConstant(boolean)
	 * @generated
	 */
	EOperation getDeclarationView__SetConstant__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#getInputOutput() <em>Get Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#getInputOutput()
	 * @generated
	 */
	EOperation getDeclarationView__GetInputOutput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setInputOutput(java.lang.String) <em>Set Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setInputOutput(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetInputOutput__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#getAssignment() <em>Get Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assignment</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#getAssignment()
	 * @generated
	 */
	EOperation getDeclarationView__GetAssignment();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setAssignment(java.lang.String) <em>Set Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Assignment</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setAssignment(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetAssignment__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#getName()
	 * @generated
	 */
	EOperation getDeclarationView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#isSignal() <em>Is Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Signal</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#isSignal()
	 * @generated
	 */
	EOperation getDeclarationView__IsSignal();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setSignal(boolean) <em>Set Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Signal</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setSignal(boolean)
	 * @generated
	 */
	EOperation getDeclarationView__SetSignal__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#getUuid()
	 * @generated
	 */
	EOperation getDeclarationView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeclarationView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeclarationView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getDeclarationView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView <em>Suspend View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView
	 * @generated
	 */
	EClass getSuspendView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#getInternalSuspend <em>Internal Suspend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Suspend</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#getInternalSuspend()
	 * @see #getSuspendView()
	 * @generated
	 */
	EReference getSuspendView_InternalSuspend();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#getCondition()
	 * @generated
	 */
	EOperation getSuspendView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getSuspendView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#getSuspendType() <em>Get Suspend Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Suspend Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#getSuspendType()
	 * @generated
	 */
	EOperation getSuspendView__GetSuspendType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#setSuspendType(java.lang.String) <em>Set Suspend Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Suspend Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#setSuspendType(java.lang.String)
	 * @generated
	 */
	EOperation getSuspendView__SetSuspendType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#getUuid()
	 * @generated
	 */
	EOperation getSuspendView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SuspendView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getSuspendView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ActionView <em>Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView
	 * @generated
	 */
	EClass getActionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getInternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Action</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#getInternalAction()
	 * @see #getActionView()
	 * @generated
	 */
	EReference getActionView_InternalAction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getActionType() <em>Get Action Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Action Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#getActionType()
	 * @generated
	 */
	EOperation getActionView__GetActionType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#setActionType(java.lang.String) <em>Set Action Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Action Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#setActionType(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetActionType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#getCondition()
	 * @generated
	 */
	EOperation getActionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#getEffect()
	 * @generated
	 */
	EOperation getActionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetEffect__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#getUuid()
	 * @generated
	 */
	EOperation getActionView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ActionView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getActionView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView <em>Simple State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView
	 * @generated
	 */
	EClass getSimpleStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getInternalSimpleState <em>Internal Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Simple State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getInternalSimpleState()
	 * @see #getSimpleStateView()
	 * @generated
	 */
	EReference getSimpleStateView_InternalSimpleState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getName()
	 * @generated
	 */
	EOperation getSimpleStateView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSimpleStateView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getLabel()
	 * @generated
	 */
	EOperation getSimpleStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SimpleStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSimpleStateView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.InitialStateView <em>Initial State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitialStateView
	 * @generated
	 */
	EClass getInitialStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.InitialStateView#getInternalInitialState <em>Internal Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitialStateView#getInternalInitialState()
	 * @see #getInitialStateView()
	 * @generated
	 */
	EReference getInitialStateView_InternalInitialState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.FinalStateView <em>Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalStateView
	 * @generated
	 */
	EClass getFinalStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.FinalStateView#getInternalFinalState <em>Internal Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalStateView#getInternalFinalState()
	 * @see #getFinalStateView()
	 * @generated
	 */
	EReference getFinalStateView_InternalFinalState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ConnectorView <em>Connector View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConnectorView
	 * @generated
	 */
	EClass getConnectorView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ConnectorView#getInternalConnector <em>Internal Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Connector</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConnectorView#getInternalConnector()
	 * @see #getConnectorView()
	 * @generated
	 */
	EReference getConnectorView_InternalConnector();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.InputView <em>Input View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InputView
	 * @generated
	 */
	EClass getInputView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.InputView#getInternalInput <em>Internal Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Input</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InputView#getInternalInput()
	 * @see #getInputView()
	 * @generated
	 */
	EReference getInputView_InternalInput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.InputView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.InputView#getLabel()
	 * @generated
	 */
	EOperation getInputView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.InputView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.InputView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getInputView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.OutputView <em>Output View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.OutputView
	 * @generated
	 */
	EClass getOutputView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.OutputView#getInternalOutput <em>Internal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Output</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.OutputView#getInternalOutput()
	 * @see #getOutputView()
	 * @generated
	 */
	EReference getOutputView_InternalOutput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.OutputView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.OutputView#getLabel()
	 * @generated
	 */
	EOperation getOutputView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.OutputView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.OutputView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getOutputView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.OperatorView <em>Operator View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.OperatorView
	 * @generated
	 */
	EClass getOperatorView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.OperatorView#getInternalOperator <em>Internal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Operator</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.OperatorView#getInternalOperator()
	 * @see #getOperatorView()
	 * @generated
	 */
	EReference getOperatorView_InternalOperator();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.OperatorView#getOperator() <em>Get Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.OperatorView#getOperator()
	 * @generated
	 */
	EOperation getOperatorView__GetOperator();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.OperatorView#setOperator(java.lang.String) <em>Set Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Operator</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.OperatorView#setOperator(java.lang.String)
	 * @generated
	 */
	EOperation getOperatorView__SetOperator__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView <em>Circuit Connecter View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Connecter View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView
	 * @generated
	 */
	EClass getCircuitConnecterView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView#getInternalCircuitConnecter <em>Internal Circuit Connecter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Circuit Connecter</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.CircuitConnecterView#getInternalCircuitConnecter()
	 * @see #getCircuitConnecterView()
	 * @generated
	 */
	EReference getCircuitConnecterView_InternalCircuitConnecter();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView <em>SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView
	 * @generated
	 */
	EClass getSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getInternalSCChartReferece <em>Internal SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getInternalSCChartReferece()
	 * @see #getSCChartRefereceView()
	 * @generated
	 */
	EReference getSCChartRefereceView_InternalSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getAssignments() <em>Get Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assignments</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getAssignments()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetAssignments();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setAssignments(org.eclipse.emf.common.util.EList) <em>Set Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Assignments</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setAssignments(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetAssignments__EList();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#addAssignments(java.lang.String) <em>Add Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Assignments</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#addAssignments(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__AddAssignments__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#removeAssignments(java.lang.String) <em>Remove Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Assignments</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#removeAssignments(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__RemoveAssignments__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getName()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getLabel()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getInputsOutputs() <em>Get Inputs Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inputs Outputs</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getInputsOutputs()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetInputsOutputs();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setInputsOutputs(java.lang.String) <em>Set Inputs Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Inputs Outputs</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setInputsOutputs(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetInputsOutputs__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#getUuid()
	 * @generated
	 */
	EOperation getSCChartRefereceView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getSCChartRefereceView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView <em>Initial SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView
	 * @generated
	 */
	EClass getInitialSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView#getInternalInitialSCChartReferece <em>Internal Initial SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.InitialSCChartRefereceView#getInternalInitialSCChartReferece()
	 * @see #getInitialSCChartRefereceView()
	 * @generated
	 */
	EReference getInitialSCChartRefereceView_InternalInitialSCChartReferece();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView <em>Final SC Chart Referece View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final SC Chart Referece View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView
	 * @generated
	 */
	EClass getFinalSCChartRefereceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView#getInternalFinalSCChartReferece <em>Internal Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView#getInternalFinalSCChartReferece()
	 * @see #getFinalSCChartRefereceView()
	 * @generated
	 */
	EReference getFinalSCChartRefereceView_InternalFinalSCChartReferece();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView <em>Abstract Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView
	 * @generated
	 */
	EClass getAbstractTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#getInternalAbstractTransition <em>Internal Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Abstract Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#getInternalAbstractTransition()
	 * @see #getAbstractTransitionView()
	 * @generated
	 */
	EReference getAbstractTransitionView_InternalAbstractTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#getPriority() <em>Get Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Priority</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#getPriority()
	 * @generated
	 */
	EOperation getAbstractTransitionView__GetPriority();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#setPriority(java.lang.String) <em>Set Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Priority</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#setPriority(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractTransitionView__SetPriority__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView
	 * @generated
	 */
	EClass getTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#getInternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#getInternalTransition()
	 * @see #getTransitionView()
	 * @generated
	 */
	EReference getTransitionView_InternalTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#getCondition()
	 * @generated
	 */
	EOperation getTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#getEffect()
	 * @generated
	 */
	EOperation getTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView <em>Immediate Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView
	 * @generated
	 */
	EClass getImmediateTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getInternalImmediateTransition <em>Internal Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getInternalImmediateTransition()
	 * @see #getImmediateTransitionView()
	 * @generated
	 */
	EReference getImmediateTransitionView_InternalImmediateTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getCondition()
	 * @generated
	 */
	EOperation getImmediateTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getImmediateTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#getEffect()
	 * @generated
	 */
	EOperation getImmediateTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView <em>Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView
	 * @generated
	 */
	EClass getTerminationTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#getInternalTerminationTransition <em>Internal Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#getInternalTerminationTransition()
	 * @see #getTerminationTransitionView()
	 * @generated
	 */
	EReference getTerminationTransitionView_InternalTerminationTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView <em>Conditional Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Termination Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView
	 * @generated
	 */
	EClass getConditionalTerminationTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getInternalConditionalTerminationTransition <em>Internal Conditional Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Conditional Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getInternalConditionalTerminationTransition()
	 * @see #getConditionalTerminationTransitionView()
	 * @generated
	 */
	EReference getConditionalTerminationTransitionView_InternalConditionalTerminationTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getCondition()
	 * @generated
	 */
	EOperation getConditionalTerminationTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getConditionalTerminationTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getEffect()
	 * @generated
	 */
	EOperation getConditionalTerminationTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView <em>Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView
	 * @generated
	 */
	EClass getStrongAbortTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition()
	 * @see #getStrongAbortTransitionView()
	 * @generated
	 */
	EReference getStrongAbortTransitionView_InternalStrongAbortTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView <em>Immediate Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Strong Abort Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView
	 * @generated
	 */
	EClass getImmediateStrongAbortTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getInternalImmediateStrongAbortTransition <em>Internal Immediate Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getInternalImmediateStrongAbortTransition()
	 * @see #getImmediateStrongAbortTransitionView()
	 * @generated
	 */
	EReference getImmediateStrongAbortTransitionView_InternalImmediateStrongAbortTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getCondition()
	 * @generated
	 */
	EOperation getImmediateStrongAbortTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getImmediateStrongAbortTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#getEffect()
	 * @generated
	 */
	EOperation getImmediateStrongAbortTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView <em>Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView
	 * @generated
	 */
	EClass getDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getInternalDeferredTransition <em>Internal Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getInternalDeferredTransition()
	 * @see #getDeferredTransitionView()
	 * @generated
	 */
	EReference getDeferredTransitionView_InternalDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.DeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView <em>Immediate Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView
	 * @generated
	 */
	EClass getImmediateDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getInternalImmediateDeferredTransition <em>Internal Immediate Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getInternalImmediateDeferredTransition()
	 * @see #getImmediateDeferredTransitionView()
	 * @generated
	 */
	EReference getImmediateDeferredTransitionView_InternalImmediateDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getImmediateDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getImmediateDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getImmediateDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView <em>Termination Defferd Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Defferd Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView
	 * @generated
	 */
	EClass getTerminationDefferdTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#getInternalTerminationDefferdTransition <em>Internal Termination Defferd Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination Defferd Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#getInternalTerminationDefferdTransition()
	 * @see #getTerminationDefferdTransitionView()
	 * @generated
	 */
	EReference getTerminationDefferdTransitionView_InternalTerminationDefferdTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationDefferdTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationDefferdTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView <em>Conditional Termination Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Termination Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView
	 * @generated
	 */
	EClass getConditionalTerminationDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getInternalConditionalTerminationDeferredTransition <em>Internal Conditional Termination Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Conditional Termination Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getInternalConditionalTerminationDeferredTransition()
	 * @see #getConditionalTerminationDeferredTransitionView()
	 * @generated
	 */
	EReference getConditionalTerminationDeferredTransitionView_InternalConditionalTerminationDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getConditionalTerminationDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getConditionalTerminationDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getConditionalTerminationDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView <em>Strong Abort Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView
	 * @generated
	 */
	EClass getStrongAbortDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getInternalStrongAbortDeferredTransition <em>Internal Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getInternalStrongAbortDeferredTransition()
	 * @see #getStrongAbortDeferredTransitionView()
	 * @generated
	 */
	EReference getStrongAbortDeferredTransitionView_InternalStrongAbortDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortDeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView <em>Immediate Strong Abort Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Strong Abort Deferred Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView
	 * @generated
	 */
	EClass getImmediateStrongAbortDeferredTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getInternalImmediateStrongAbortDeferredTransition <em>Internal Immediate Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Strong Abort Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getInternalImmediateStrongAbortDeferredTransition()
	 * @see #getImmediateStrongAbortDeferredTransitionView()
	 * @generated
	 */
	EReference getImmediateStrongAbortDeferredTransitionView_InternalImmediateStrongAbortDeferredTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getCondition()
	 * @generated
	 */
	EOperation getImmediateStrongAbortDeferredTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortDeferredTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getImmediateStrongAbortDeferredTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortDeferredTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getEffect()
	 * @generated
	 */
	EOperation getImmediateStrongAbortDeferredTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortDeferredTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView <em>History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView
	 * @generated
	 */
	EClass getHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getInternalHistoryTransition <em>Internal History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getInternalHistoryTransition()
	 * @see #getHistoryTransitionView()
	 * @generated
	 */
	EReference getHistoryTransitionView_InternalHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView <em>Immediate History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView
	 * @generated
	 */
	EClass getImmediateHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getInternalImmediateHistoryTransition <em>Internal Immediate History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getInternalImmediateHistoryTransition()
	 * @see #getImmediateHistoryTransitionView()
	 * @generated
	 */
	EReference getImmediateHistoryTransitionView_InternalImmediateHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView <em>Termination History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView
	 * @generated
	 */
	EClass getTerminationHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#getInternalTerminationHistoryTransition <em>Internal Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Termination History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#getInternalTerminationHistoryTransition()
	 * @see #getTerminationHistoryTransitionView()
	 * @generated
	 */
	EReference getTerminationHistoryTransitionView_InternalTerminationHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getTerminationHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView <em>Conditional Termination History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Termination History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView
	 * @generated
	 */
	EClass getConditionalTerminationHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getInternalConditionalTerminationHistoryTransition <em>Internal Conditional Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Conditional Termination History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getInternalConditionalTerminationHistoryTransition()
	 * @see #getConditionalTerminationHistoryTransitionView()
	 * @generated
	 */
	EReference getConditionalTerminationHistoryTransitionView_InternalConditionalTerminationHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getConditionalTerminationHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView <em>Strong Abort History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView
	 * @generated
	 */
	EClass getStrongAbortHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getInternalStrongAbortHistoryTransition <em>Internal Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getInternalStrongAbortHistoryTransition()
	 * @see #getStrongAbortHistoryTransitionView()
	 * @generated
	 */
	EReference getStrongAbortHistoryTransitionView_InternalStrongAbortHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getStrongAbortHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView <em>Immediate Strong Abort History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Strong Abort History Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView
	 * @generated
	 */
	EClass getImmediateStrongAbortHistoryTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getInternalImmediateStrongAbortHistoryTransition <em>Internal Immediate Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Strong Abort History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getInternalImmediateStrongAbortHistoryTransition()
	 * @see #getImmediateStrongAbortHistoryTransitionView()
	 * @generated
	 */
	EReference getImmediateStrongAbortHistoryTransitionView_InternalImmediateStrongAbortHistoryTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getCondition() <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getCondition()
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__GetCondition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setCondition(java.lang.String) <em>Set Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Condition</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setCondition(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__SetCondition__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getCount_delay() <em>Get Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getCount_delay()
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__GetCount_delay();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setCount_delay(java.lang.String) <em>Set Count delay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Count delay</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setCount_delay(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__SetCount_delay__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#isDeepHistory() <em>Is Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#isDeepHistory()
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__IsDeepHistory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setDeepHistory(boolean) <em>Set Deep History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Deep History</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setDeepHistory(boolean)
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__SetDeepHistory__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getEffect() <em>Get Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#getEffect()
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__GetEffect();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setEffect(java.lang.String) <em>Set Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Effect</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView#setEffect(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateStrongAbortHistoryTransitionView__SetEffect__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.ConnectionView <em>Connection View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConnectionView
	 * @generated
	 */
	EClass getConnectionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.ConnectionView#getInternalConnection <em>Internal Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Connection</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.ConnectionView#getInternalConnection()
	 * @see #getConnectionView()
	 * @generated
	 */
	EReference getConnectionView_InternalConnection();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.SCChartView <em>SC Chart View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartView
	 * @generated
	 */
	EClass getSCChartView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.SCChartView#getInternalSCChart <em>Internal SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal SC Chart</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.SCChartView#getInternalSCChart()
	 * @see #getSCChartView()
	 * @generated
	 */
	EReference getSCChartView_InternalSCChart();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView <em>Assignment View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment View</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.AssignmentView
	 * @generated
	 */
	EClass getAssignmentView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView#getInternalAssignment <em>Internal Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Assignment</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.views.AssignmentView#getInternalAssignment()
	 * @see #getAssignmentView()
	 * @generated
	 */
	EReference getAssignmentView_InternalAssignment();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView#getAssignment() <em>Get Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assignment</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.AssignmentView#getAssignment()
	 * @generated
	 */
	EOperation getAssignmentView__GetAssignment();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView#setAssignment(java.lang.String) <em>Set Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Assignment</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.views.AssignmentView#setAssignment(java.lang.String)
	 * @generated
	 */
	EOperation getAssignmentView__SetAssignment__String();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.RootStateViewImpl <em>Root State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.RootStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getRootStateView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.RegionViewImpl <em>Region View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.RegionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getRegionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.DataFlowRegionViewImpl <em>Data Flow Region View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.DataFlowRegionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getDataFlowRegionView()
		 * @generated
		 */
		EClass DATA_FLOW_REGION_VIEW = eINSTANCE.getDataFlowRegionView();

		/**
		 * The meta object literal for the '<em><b>Internal Data Flow Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_REGION_VIEW__INTERNAL_DATA_FLOW_REGION = eINSTANCE.getDataFlowRegionView_InternalDataFlowRegion();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SuperStateViewImpl <em>Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.SuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSuperStateView()
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
		 * The meta object literal for the '<em><b>Get Inputs Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___GET_INPUTS_OUTPUTS = eINSTANCE.getSuperStateView__GetInputsOutputs();

		/**
		 * The meta object literal for the '<em><b>Set Inputs Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___SET_INPUTS_OUTPUTS__ELIST = eINSTANCE.getSuperStateView__SetInputsOutputs__EList();

		/**
		 * The meta object literal for the '<em><b>Add Inputs Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___ADD_INPUTS_OUTPUTS__STRING = eINSTANCE.getSuperStateView__AddInputsOutputs__String();

		/**
		 * The meta object literal for the '<em><b>Remove Inputs Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___REMOVE_INPUTS_OUTPUTS__STRING = eINSTANCE.getSuperStateView__RemoveInputsOutputs__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InitilalSuperStateViewImpl <em>Initilal Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.InitilalSuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInitilalSuperStateView()
		 * @generated
		 */
		EClass INITILAL_SUPER_STATE_VIEW = eINSTANCE.getInitilalSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initilal Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE = eINSTANCE.getInitilalSuperStateView_InternalInitilalSuperState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalSuperStateViewImpl <em>Final Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.FinalSuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getFinalSuperStateView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.DeclarationViewImpl <em>Declaration View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.DeclarationViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getDeclarationView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SuspendViewImpl <em>Suspend View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.SuspendViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSuspendView()
		 * @generated
		 */
		EClass SUSPEND_VIEW = eINSTANCE.getSuspendView();

		/**
		 * The meta object literal for the '<em><b>Internal Suspend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUSPEND_VIEW__INTERNAL_SUSPEND = eINSTANCE.getSuspendView_InternalSuspend();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPEND_VIEW___GET_CONDITION = eINSTANCE.getSuspendView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPEND_VIEW___SET_CONDITION__STRING = eINSTANCE.getSuspendView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Suspend Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPEND_VIEW___GET_SUSPEND_TYPE = eINSTANCE.getSuspendView__GetSuspendType();

		/**
		 * The meta object literal for the '<em><b>Set Suspend Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPEND_VIEW___SET_SUSPEND_TYPE__STRING = eINSTANCE.getSuspendView__SetSuspendType__String();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPEND_VIEW___GET_UUID = eINSTANCE.getSuspendView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUSPEND_VIEW___SET_UUID__STRING = eINSTANCE.getSuspendView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ActionViewImpl <em>Action View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ActionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getActionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SimpleStateViewImpl <em>Simple State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.SimpleStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSimpleStateView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InitialStateViewImpl <em>Initial State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.InitialStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInitialStateView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalStateViewImpl <em>Final State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.FinalStateViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getFinalStateView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConnectorViewImpl <em>Connector View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConnectorViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConnectorView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InputViewImpl <em>Input View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.InputViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInputView()
		 * @generated
		 */
		EClass INPUT_VIEW = eINSTANCE.getInputView();

		/**
		 * The meta object literal for the '<em><b>Internal Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VIEW__INTERNAL_INPUT = eINSTANCE.getInputView_InternalInput();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___GET_LABEL = eINSTANCE.getInputView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___SET_LABEL__STRING = eINSTANCE.getInputView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.OutputViewImpl <em>Output View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.OutputViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getOutputView()
		 * @generated
		 */
		EClass OUTPUT_VIEW = eINSTANCE.getOutputView();

		/**
		 * The meta object literal for the '<em><b>Internal Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_VIEW__INTERNAL_OUTPUT = eINSTANCE.getOutputView_InternalOutput();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_VIEW___GET_LABEL = eINSTANCE.getOutputView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_VIEW___SET_LABEL__STRING = eINSTANCE.getOutputView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.OperatorViewImpl <em>Operator View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.OperatorViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getOperatorView()
		 * @generated
		 */
		EClass OPERATOR_VIEW = eINSTANCE.getOperatorView();

		/**
		 * The meta object literal for the '<em><b>Internal Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_VIEW__INTERNAL_OPERATOR = eINSTANCE.getOperatorView_InternalOperator();

		/**
		 * The meta object literal for the '<em><b>Get Operator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR_VIEW___GET_OPERATOR = eINSTANCE.getOperatorView__GetOperator();

		/**
		 * The meta object literal for the '<em><b>Set Operator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR_VIEW___SET_OPERATOR__STRING = eINSTANCE.getOperatorView__SetOperator__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.CircuitConnecterViewImpl <em>Circuit Connecter View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.CircuitConnecterViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getCircuitConnecterView()
		 * @generated
		 */
		EClass CIRCUIT_CONNECTER_VIEW = eINSTANCE.getCircuitConnecterView();

		/**
		 * The meta object literal for the '<em><b>Internal Circuit Connecter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_CONNECTER_VIEW__INTERNAL_CIRCUIT_CONNECTER = eINSTANCE.getCircuitConnecterView_InternalCircuitConnecter();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SCChartRefereceViewImpl <em>SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.SCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSCChartRefereceView()
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
		EOperation SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST = eINSTANCE.getSCChartRefereceView__SetAssignments__EList();

		/**
		 * The meta object literal for the '<em><b>Add Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING = eINSTANCE.getSCChartRefereceView__AddAssignments__String();

		/**
		 * The meta object literal for the '<em><b>Remove Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING = eINSTANCE.getSCChartRefereceView__RemoveAssignments__String();

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
		 * The meta object literal for the '<em><b>Get Inputs Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS = eINSTANCE.getSCChartRefereceView__GetInputsOutputs();

		/**
		 * The meta object literal for the '<em><b>Set Inputs Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING = eINSTANCE.getSCChartRefereceView__SetInputsOutputs__String();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___GET_UUID = eINSTANCE.getSCChartRefereceView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SC_CHART_REFERECE_VIEW___SET_UUID__STRING = eINSTANCE.getSCChartRefereceView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.InitialSCChartRefereceViewImpl <em>Initial SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.InitialSCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getInitialSCChartRefereceView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.FinalSCChartRefereceViewImpl <em>Final SC Chart Referece View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.FinalSCChartRefereceViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getFinalSCChartRefereceView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.AbstractTransitionViewImpl <em>Abstract Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.AbstractTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getAbstractTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.TransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateTransitionViewImpl <em>Immediate Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_TRANSITION_VIEW = eINSTANCE.getImmediateTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION = eINSTANCE.getImmediateTransitionView_InternalImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getImmediateTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getImmediateTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getImmediateTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getImmediateTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getImmediateTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getImmediateTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationTransitionViewImpl <em>Termination Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.TerminationTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTerminationTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationTransitionViewImpl <em>Conditional Termination Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConditionalTerminationTransitionView()
		 * @generated
		 */
		EClass CONDITIONAL_TERMINATION_TRANSITION_VIEW = eINSTANCE.getConditionalTerminationTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Conditional Termination Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION = eINSTANCE.getConditionalTerminationTransitionView_InternalConditionalTerminationTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getConditionalTerminationTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getConditionalTerminationTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getConditionalTerminationTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getConditionalTerminationTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getConditionalTerminationTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getConditionalTerminationTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortTransitionViewImpl <em>Strong Abort Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getStrongAbortTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortTransitionViewImpl <em>Immediate Strong Abort Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateStrongAbortTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW = eINSTANCE.getImmediateStrongAbortTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Strong Abort Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION = eINSTANCE.getImmediateStrongAbortTransitionView_InternalImmediateStrongAbortTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getImmediateStrongAbortTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getImmediateStrongAbortTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getImmediateStrongAbortTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getImmediateStrongAbortTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getImmediateStrongAbortTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getImmediateStrongAbortTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.DeferredTransitionViewImpl <em>Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.DeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getDeferredTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateDeferredTransitionViewImpl <em>Immediate Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateDeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateDeferredTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_DEFERRED_TRANSITION_VIEW = eINSTANCE.getImmediateDeferredTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Deferred Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION = eINSTANCE.getImmediateDeferredTransitionView_InternalImmediateDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getImmediateDeferredTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getImmediateDeferredTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getImmediateDeferredTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getImmediateDeferredTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getImmediateDeferredTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getImmediateDeferredTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationDefferdTransitionViewImpl <em>Termination Defferd Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.TerminationDefferdTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTerminationDefferdTransitionView()
		 * @generated
		 */
		EClass TERMINATION_DEFFERD_TRANSITION_VIEW = eINSTANCE.getTerminationDefferdTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Termination Defferd Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION = eINSTANCE.getTerminationDefferdTransitionView_InternalTerminationDefferdTransition();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFFERD_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getTerminationDefferdTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATION_DEFFERD_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getTerminationDefferdTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationDeferredTransitionViewImpl <em>Conditional Termination Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationDeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConditionalTerminationDeferredTransitionView()
		 * @generated
		 */
		EClass CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW = eINSTANCE.getConditionalTerminationDeferredTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Conditional Termination Deferred Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION = eINSTANCE.getConditionalTerminationDeferredTransitionView_InternalConditionalTerminationDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getConditionalTerminationDeferredTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getConditionalTerminationDeferredTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getConditionalTerminationDeferredTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getConditionalTerminationDeferredTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getConditionalTerminationDeferredTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getConditionalTerminationDeferredTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortDeferredTransitionViewImpl <em>Strong Abort Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortDeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getStrongAbortDeferredTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortDeferredTransitionViewImpl <em>Immediate Strong Abort Deferred Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortDeferredTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateStrongAbortDeferredTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW = eINSTANCE.getImmediateStrongAbortDeferredTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Strong Abort Deferred Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION = eINSTANCE.getImmediateStrongAbortDeferredTransitionView_InternalImmediateStrongAbortDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getImmediateStrongAbortDeferredTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getImmediateStrongAbortDeferredTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getImmediateStrongAbortDeferredTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getImmediateStrongAbortDeferredTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getImmediateStrongAbortDeferredTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getImmediateStrongAbortDeferredTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.HistoryTransitionViewImpl <em>History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.HistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getHistoryTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateHistoryTransitionViewImpl <em>Immediate History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateHistoryTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_HISTORY_TRANSITION_VIEW = eINSTANCE.getImmediateHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION = eINSTANCE.getImmediateHistoryTransitionView_InternalImmediateHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getImmediateHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getImmediateHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getImmediateHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getImmediateHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getImmediateHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getImmediateHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getImmediateHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getImmediateHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationHistoryTransitionViewImpl <em>Termination History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.TerminationHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getTerminationHistoryTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationHistoryTransitionViewImpl <em>Conditional Termination History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConditionalTerminationHistoryTransitionView()
		 * @generated
		 */
		EClass CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW = eINSTANCE.getConditionalTerminationHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Conditional Termination History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION = eINSTANCE.getConditionalTerminationHistoryTransitionView_InternalConditionalTerminationHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getConditionalTerminationHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getConditionalTerminationHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getConditionalTerminationHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getConditionalTerminationHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getConditionalTerminationHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getConditionalTerminationHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getConditionalTerminationHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getConditionalTerminationHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortHistoryTransitionViewImpl <em>Strong Abort History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getStrongAbortHistoryTransitionView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortHistoryTransitionViewImpl <em>Immediate Strong Abort History Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortHistoryTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getImmediateStrongAbortHistoryTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW = eINSTANCE.getImmediateStrongAbortHistoryTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Strong Abort History Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION = eINSTANCE.getImmediateStrongAbortHistoryTransitionView_InternalImmediateStrongAbortHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Get Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_CONDITION = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__GetCondition();

		/**
		 * The meta object literal for the '<em><b>Set Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__SetCondition__String();

		/**
		 * The meta object literal for the '<em><b>Get Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__GetCount_delay();

		/**
		 * The meta object literal for the '<em><b>Set Count delay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__SetCount_delay__String();

		/**
		 * The meta object literal for the '<em><b>Is Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__IsDeepHistory();

		/**
		 * The meta object literal for the '<em><b>Set Deep History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__SetDeepHistory__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__GetEffect();

		/**
		 * The meta object literal for the '<em><b>Set Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING = eINSTANCE.getImmediateStrongAbortHistoryTransitionView__SetEffect__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.ConnectionViewImpl <em>Connection View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ConnectionViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getConnectionView()
		 * @generated
		 */
		EClass CONNECTION_VIEW = eINSTANCE.getConnectionView();

		/**
		 * The meta object literal for the '<em><b>Internal Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_VIEW__INTERNAL_CONNECTION = eINSTANCE.getConnectionView_InternalConnection();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.SCChartViewImpl <em>SC Chart View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.SCChartViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getSCChartView()
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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.views.impl.AssignmentViewImpl <em>Assignment View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.AssignmentViewImpl
		 * @see info.scce.cinco.product.scchart.scchart.views.impl.ViewsPackageImpl#getAssignmentView()
		 * @generated
		 */
		EClass ASSIGNMENT_VIEW = eINSTANCE.getAssignmentView();

		/**
		 * The meta object literal for the '<em><b>Internal Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT = eINSTANCE.getAssignmentView_InternalAssignment();

		/**
		 * The meta object literal for the '<em><b>Get Assignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIGNMENT_VIEW___GET_ASSIGNMENT = eINSTANCE.getAssignmentView__GetAssignment();

		/**
		 * The meta object literal for the '<em><b>Set Assignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIGNMENT_VIEW___SET_ASSIGNMENT__STRING = eINSTANCE.getAssignmentView__SetAssignment__String();

	}

} //ViewsPackage
