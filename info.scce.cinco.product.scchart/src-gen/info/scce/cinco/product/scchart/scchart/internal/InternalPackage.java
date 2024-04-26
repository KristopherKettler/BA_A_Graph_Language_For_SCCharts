/**
 */
package info.scce.cinco.product.scchart.scchart.internal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFactory
 * @model kind="package"
 * @generated
 */
public interface InternalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "internal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/scchart/internal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scchart-internal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalPackage eINSTANCE = info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalRootStateImpl <em>Root State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalRootStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalRootState()
	 * @generated
	 */
	int INTERNAL_ROOT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__NAME = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Output Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_OUTPUT_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Operator Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_OPERATOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CIRCUIT_CONNECTER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Root State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalRegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalRegionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalRegion()
	 * @generated
	 */
	int INTERNAL_REGION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__NAME = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__UUID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDataFlowRegionImpl <em>Data Flow Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalDataFlowRegionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalDataFlowRegion()
	 * @generated
	 */
	int INTERNAL_DATA_FLOW_REGION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__ID = INTERNAL_REGION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__CONTAINER = INTERNAL_REGION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__ELEMENT = INTERNAL_REGION__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__X = INTERNAL_REGION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__Y = INTERNAL_REGION__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__HEIGHT = INTERNAL_REGION__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__WIDTH = INTERNAL_REGION__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__INCOMING = INTERNAL_REGION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__OUTGOING = INTERNAL_REGION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__MODEL_ELEMENTS = INTERNAL_REGION__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__NAME = INTERNAL_REGION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__LABEL = INTERNAL_REGION__LABEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION__UUID = INTERNAL_REGION__UUID;

	/**
	 * The number of structural features of the '<em>Data Flow Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION_FEATURE_COUNT = INTERNAL_REGION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___EQUALS__OBJECT = INTERNAL_REGION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___HASH_CODE = INTERNAL_REGION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___SAVE = INTERNAL_REGION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_ELEMENT = INTERNAL_REGION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_ROOT_ELEMENT = INTERNAL_REGION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_SUCCESSORS = INTERNAL_REGION___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_SUCCESSORS__CLASS = INTERNAL_REGION___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_PREDECESSORS = INTERNAL_REGION___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_PREDECESSORS__CLASS = INTERNAL_REGION___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_INCOMING__CLASS = INTERNAL_REGION___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_OUTGOING__CLASS = INTERNAL_REGION___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___CAN_CONNECT__EDGE_NODE = INTERNAL_REGION___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_OUTGOING_CONSTRAINTS = INTERNAL_REGION___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_INCOMING_CONSTRAINTS = INTERNAL_REGION___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___CAN_START__CLASS = INTERNAL_REGION___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___CAN_END__CLASS = INTERNAL_REGION___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___CAN_CONTAIN__CLASS = INTERNAL_REGION___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___CAN_CONTAIN_NODES__ELIST = INTERNAL_REGION___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_CONTAINER_ELEMENT = INTERNAL_REGION___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___CAN_CONTAIN__ELIST = INTERNAL_REGION___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_REGION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_REGION_OPERATION_COUNT = INTERNAL_REGION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl <em>Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSuperState()
	 * @generated
	 */
	int INTERNAL_SUPER_STATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__NAME = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__INPUTS_OUTPUTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitilalSuperStateImpl <em>Initilal Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitilalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInitilalSuperState()
	 * @generated
	 */
	int INTERNAL_INITILAL_SUPER_STATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__ID = INTERNAL_SUPER_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__CONTAINER = INTERNAL_SUPER_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__ELEMENT = INTERNAL_SUPER_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__X = INTERNAL_SUPER_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__Y = INTERNAL_SUPER_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__HEIGHT = INTERNAL_SUPER_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__WIDTH = INTERNAL_SUPER_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__INCOMING = INTERNAL_SUPER_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__OUTGOING = INTERNAL_SUPER_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__MODEL_ELEMENTS = INTERNAL_SUPER_STATE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__NAME = INTERNAL_SUPER_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__LABEL = INTERNAL_SUPER_STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Inputs Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__INPUTS_OUTPUTS = INTERNAL_SUPER_STATE__INPUTS_OUTPUTS;

	/**
	 * The number of structural features of the '<em>Initilal Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE_FEATURE_COUNT = INTERNAL_SUPER_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___EQUALS__OBJECT = INTERNAL_SUPER_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___HASH_CODE = INTERNAL_SUPER_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___SAVE = INTERNAL_SUPER_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_ELEMENT = INTERNAL_SUPER_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_ROOT_ELEMENT = INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUCCESSORS = INTERNAL_SUPER_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_PREDECESSORS = INTERNAL_SUPER_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INCOMING__CLASS = INTERNAL_SUPER_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_OUTGOING__CLASS = INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_START__CLASS = INTERNAL_SUPER_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_END__CLASS = INTERNAL_SUPER_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONTAIN__CLASS = INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONTAINER_ELEMENT = INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONTAIN__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>Initilal Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUPER_STATE_OPERATION_COUNT + 18;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSuperStateImpl <em>Final Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalFinalSuperState()
	 * @generated
	 */
	int INTERNAL_FINAL_SUPER_STATE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__ID = INTERNAL_SUPER_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__CONTAINER = INTERNAL_SUPER_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__ELEMENT = INTERNAL_SUPER_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__X = INTERNAL_SUPER_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__Y = INTERNAL_SUPER_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__HEIGHT = INTERNAL_SUPER_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__WIDTH = INTERNAL_SUPER_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__INCOMING = INTERNAL_SUPER_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__OUTGOING = INTERNAL_SUPER_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__MODEL_ELEMENTS = INTERNAL_SUPER_STATE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__NAME = INTERNAL_SUPER_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__LABEL = INTERNAL_SUPER_STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Inputs Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE__INPUTS_OUTPUTS = INTERNAL_SUPER_STATE__INPUTS_OUTPUTS;

	/**
	 * The number of structural features of the '<em>Final Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE_FEATURE_COUNT = INTERNAL_SUPER_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___EQUALS__OBJECT = INTERNAL_SUPER_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___HASH_CODE = INTERNAL_SUPER_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___SAVE = INTERNAL_SUPER_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_ELEMENT = INTERNAL_SUPER_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_ROOT_ELEMENT = INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SUCCESSORS = INTERNAL_SUPER_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_PREDECESSORS = INTERNAL_SUPER_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INCOMING__CLASS = INTERNAL_SUPER_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_OUTGOING__CLASS = INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___CAN_START__CLASS = INTERNAL_SUPER_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___CAN_END__CLASS = INTERNAL_SUPER_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___CAN_CONTAIN__CLASS = INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_CONTAINER_ELEMENT = INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___CAN_CONTAIN__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>Final Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUPER_STATE_OPERATION_COUNT + 18;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalDeclaration()
	 * @generated
	 */
	int INTERNAL_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__CONSTANT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__INPUT_OUTPUT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__ASSIGNMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__NAME = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__SIGNAL = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION__UUID = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DECLARATION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuspendImpl <em>Suspend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuspendImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSuspend()
	 * @generated
	 */
	int INTERNAL_SUSPEND = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__CONDITION = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suspend Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__SUSPEND_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND__UUID = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Suspend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Suspend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPEND_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalActionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ACTION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__CONDITION = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__EFFECT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__UUID = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSimpleStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSimpleState()
	 * @generated
	 */
	int INTERNAL_SIMPLE_STATE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__NAME = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 17;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInitialState()
	 * @generated
	 */
	int INTERNAL_INITIAL_STATE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__ID = INTERNAL_SIMPLE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__CONTAINER = INTERNAL_SIMPLE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__ELEMENT = INTERNAL_SIMPLE_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__X = INTERNAL_SIMPLE_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__Y = INTERNAL_SIMPLE_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__HEIGHT = INTERNAL_SIMPLE_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__WIDTH = INTERNAL_SIMPLE_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__INCOMING = INTERNAL_SIMPLE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__OUTGOING = INTERNAL_SIMPLE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__NAME = INTERNAL_SIMPLE_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__LABEL = INTERNAL_SIMPLE_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE_FEATURE_COUNT = INTERNAL_SIMPLE_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___EQUALS__OBJECT = INTERNAL_SIMPLE_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___HASH_CODE = INTERNAL_SIMPLE_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___SAVE = INTERNAL_SIMPLE_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_ROOT_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUCCESSORS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_PREDECESSORS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INCOMING__CLASS = INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_OUTGOING__CLASS = INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___CAN_START__CLASS = INTERNAL_SIMPLE_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___CAN_END__CLASS = INTERNAL_SIMPLE_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 17;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalStateImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalFinalState()
	 * @generated
	 */
	int INTERNAL_FINAL_STATE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__ID = INTERNAL_SIMPLE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__CONTAINER = INTERNAL_SIMPLE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__ELEMENT = INTERNAL_SIMPLE_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__X = INTERNAL_SIMPLE_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__Y = INTERNAL_SIMPLE_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__HEIGHT = INTERNAL_SIMPLE_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__WIDTH = INTERNAL_SIMPLE_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__INCOMING = INTERNAL_SIMPLE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__OUTGOING = INTERNAL_SIMPLE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__NAME = INTERNAL_SIMPLE_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__LABEL = INTERNAL_SIMPLE_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE_FEATURE_COUNT = INTERNAL_SIMPLE_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___EQUALS__OBJECT = INTERNAL_SIMPLE_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___HASH_CODE = INTERNAL_SIMPLE_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___SAVE = INTERNAL_SIMPLE_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_ROOT_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUCCESSORS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_PREDECESSORS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INCOMING__CLASS = INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_OUTGOING__CLASS = INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___CAN_START__CLASS = INTERNAL_SIMPLE_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___CAN_END__CLASS = INTERNAL_SIMPLE_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 17;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectorImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConnector()
	 * @generated
	 */
	int INTERNAL_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 17;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInputImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInput()
	 * @generated
	 */
	int INTERNAL_INPUT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__LABEL = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Output Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_OUTPUT_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Operator Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_OPERATOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT___GET_CIRCUIT_CONNECTER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalOutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalOutputImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalOutput()
	 * @generated
	 */
	int INTERNAL_OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__LABEL = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Input Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_INPUT_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Operator Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_OPERATOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT___GET_CIRCUIT_CONNECTER_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalOperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalOperatorImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalOperator()
	 * @generated
	 */
	int INTERNAL_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR__OPERATOR = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Input Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_INPUT_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Operator Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_OPERATOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_CIRCUIT_CONNECTER_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Output Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_OUTPUT_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Operator Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_OPERATOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR___GET_CIRCUIT_CONNECTER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATOR_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalCircuitConnecterImpl <em>Circuit Connecter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalCircuitConnecterImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalCircuitConnecter()
	 * @generated
	 */
	int INTERNAL_CIRCUIT_CONNECTER = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Circuit Connecter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Input Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_INPUT_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Operator Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_OPERATOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Output Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_OUTPUT_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Operator Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_OPERATOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Circuit Connecter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CIRCUIT_CONNECTER_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl <em>SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSCChartReferece()
	 * @generated
	 */
	int INTERNAL_SC_CHART_REFERECE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__NAME = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__UUID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_REFERENCE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialSCChartRefereceImpl <em>Initial SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInitialSCChartReferece()
	 * @generated
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__ID = INTERNAL_SC_CHART_REFERECE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__CONTAINER = INTERNAL_SC_CHART_REFERECE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__ELEMENT = INTERNAL_SC_CHART_REFERECE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__X = INTERNAL_SC_CHART_REFERECE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__Y = INTERNAL_SC_CHART_REFERECE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__HEIGHT = INTERNAL_SC_CHART_REFERECE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__WIDTH = INTERNAL_SC_CHART_REFERECE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__INCOMING = INTERNAL_SC_CHART_REFERECE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__OUTGOING = INTERNAL_SC_CHART_REFERECE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__MODEL_ELEMENTS = INTERNAL_SC_CHART_REFERECE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__ASSIGNMENTS = INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__NAME = INTERNAL_SC_CHART_REFERECE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__LABEL = INTERNAL_SC_CHART_REFERECE__LABEL;

	/**
	 * The feature id for the '<em><b>Inputs Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__INPUTS_OUTPUTS = INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__UUID = INTERNAL_SC_CHART_REFERECE__UUID;

	/**
	 * The feature id for the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID = INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID;

	/**
	 * The number of structural features of the '<em>Initial SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE_FEATURE_COUNT = INTERNAL_SC_CHART_REFERECE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___EQUALS__OBJECT = INTERNAL_SC_CHART_REFERECE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___HASH_CODE = INTERNAL_SC_CHART_REFERECE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___SAVE = INTERNAL_SC_CHART_REFERECE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SUCCESSORS = INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS = INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_PREDECESSORS = INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS = INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INCOMING__CLASS = INTERNAL_SC_CHART_REFERECE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS = INTERNAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE = INTERNAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___CAN_START__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___CAN_END__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_REFERENCE = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initial SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE_OPERATION_COUNT = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSCChartRefereceImpl <em>Final SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalFinalSCChartReferece()
	 * @generated
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__ID = INTERNAL_SC_CHART_REFERECE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__CONTAINER = INTERNAL_SC_CHART_REFERECE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__ELEMENT = INTERNAL_SC_CHART_REFERECE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__X = INTERNAL_SC_CHART_REFERECE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__Y = INTERNAL_SC_CHART_REFERECE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__HEIGHT = INTERNAL_SC_CHART_REFERECE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__WIDTH = INTERNAL_SC_CHART_REFERECE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__INCOMING = INTERNAL_SC_CHART_REFERECE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__OUTGOING = INTERNAL_SC_CHART_REFERECE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__MODEL_ELEMENTS = INTERNAL_SC_CHART_REFERECE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__ASSIGNMENTS = INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__NAME = INTERNAL_SC_CHART_REFERECE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__LABEL = INTERNAL_SC_CHART_REFERECE__LABEL;

	/**
	 * The feature id for the '<em><b>Inputs Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__INPUTS_OUTPUTS = INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__UUID = INTERNAL_SC_CHART_REFERECE__UUID;

	/**
	 * The feature id for the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID = INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID;

	/**
	 * The number of structural features of the '<em>Final SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE_FEATURE_COUNT = INTERNAL_SC_CHART_REFERECE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___EQUALS__OBJECT = INTERNAL_SC_CHART_REFERECE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___HASH_CODE = INTERNAL_SC_CHART_REFERECE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___SAVE = INTERNAL_SC_CHART_REFERECE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SUCCESSORS = INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS = INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_PREDECESSORS = INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS = INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INCOMING__CLASS = INTERNAL_SC_CHART_REFERECE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS = INTERNAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE = INTERNAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___CAN_START__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___CAN_END__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_REFERENCE = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE_OPERATION_COUNT = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalAbstractTransitionImpl <em>Abstract Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalAbstractTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalAbstractTransition()
	 * @generated
	 */
	int INTERNAL_ABSTRACT_TRANSITION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__ID = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_EDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__DECORATORS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION__PRIORITY = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateTransitionImpl <em>Immediate Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_TRANSITION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Immediate Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationTransitionImpl <em>Termination Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTerminationTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_TRANSITION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationTransitionImpl <em>Conditional Termination Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConditionalTerminationTransition()
	 * @generated
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Conditional Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortTransitionImpl <em>Strong Abort Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortTransitionImpl <em>Immediate Strong Abort Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateStrongAbortTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Immediate Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeferredTransitionImpl <em>Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalDeferredTransition()
	 * @generated
	 */
	int INTERNAL_DEFERRED_TRANSITION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateDeferredTransitionImpl <em>Immediate Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateDeferredTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Immediate Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_DEFERRED_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationDefferdTransitionImpl <em>Termination Defferd Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationDefferdTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTerminationDefferdTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Termination Defferd Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Termination Defferd Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFFERD_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationDeferredTransitionImpl <em>Conditional Termination Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConditionalTerminationDeferredTransition()
	 * @generated
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Termination Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Conditional Termination Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortDeferredTransitionImpl <em>Strong Abort Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strong Abort Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Strong Abort Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl <em>Immediate Strong Abort Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateStrongAbortDeferredTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Immediate Strong Abort Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Strong Abort Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalHistoryTransitionImpl <em>History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalHistoryTransition()
	 * @generated
	 */
	int INTERNAL_HISTORY_TRANSITION = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateHistoryTransitionImpl <em>Immediate History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateHistoryTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Immediate History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationHistoryTransitionImpl <em>Termination History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTerminationHistoryTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Termination History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Termination History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl <em>Conditional Termination History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conditional Termination History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Conditional Termination History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortHistoryTransitionImpl <em>Strong Abort History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strong Abort History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Strong Abort History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortHistoryTransitionImpl <em>Immediate Strong Abort History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Immediate Strong Abort History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Strong Abort History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectionImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConnection()
	 * @generated
	 */
	int INTERNAL_CONNECTION = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__ID = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_EDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__BENDPOINTS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION__DECORATORS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__DECORATORS;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___GET_SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___GET_TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___SET_SOURCE_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___SET_TARGET_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION___ADD_BENDPOINT__INT_INT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartImpl <em>SC Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSCChart()
	 * @generated
	 */
	int INTERNAL_SC_CHART = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__ID = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__ELEMENT;

	/**
	 * The number of structural features of the '<em>SC Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___SAVE = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SC Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalAssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalAssignmentImpl
	 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalAssignment()
	 * @generated
	 */
	int INTERNAL_ASSIGNMENT = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT__ID = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT__ASSIGNMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT___SAVE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___GET_ELEMENT;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ASSIGNMENT_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState <em>Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState
	 * @generated
	 */
	EClass getInternalRootState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getName()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EAttribute getInternalRootState_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getLabel()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EAttribute getInternalRootState_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRootState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalRootState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getOutputSuccessors() <em>Get Output Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getOutputSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetOutputSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getOperatorSuccessors() <em>Get Operator Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getOperatorSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetOperatorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getCircuitConnecterSuccessors() <em>Get Circuit Connecter Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRootState#getCircuitConnecterSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetCircuitConnecterSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRegion
	 * @generated
	 */
	EClass getInternalRegion();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getName()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getLabel()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Label();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getUuid()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Uuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalRegion#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRegion__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion <em>Data Flow Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Region</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion
	 * @generated
	 */
	EClass getInternalDataFlowRegion();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalDataFlowRegion__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState
	 * @generated
	 */
	EClass getInternalSuperState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getName()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EAttribute getInternalSuperState_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getLabel()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EAttribute getInternalSuperState_Label();

	/**
	 * Returns the meta object for the attribute list '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInputsOutputs <em>Inputs Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inputs Outputs</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInputsOutputs()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EAttribute getInternalSuperState_InputsOutputs();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState <em>Initilal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initilal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState
	 * @generated
	 */
	EClass getInternalInitilalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState <em>Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Super State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState
	 * @generated
	 */
	EClass getInternalFinalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration
	 * @generated
	 */
	EClass getInternalDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getDeclarationType()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isConstant()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Constant();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getInputOutput <em>Input Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getInputOutput()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_InputOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getAssignment()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getName()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isSignal()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Signal();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getUuid()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Uuid();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend <em>Suspend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuspend
	 * @generated
	 */
	EClass getInternalSuspend();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getCondition()
	 * @see #getInternalSuspend()
	 * @generated
	 */
	EAttribute getInternalSuspend_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getSuspendType <em>Suspend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Type</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getSuspendType()
	 * @see #getInternalSuspend()
	 * @generated
	 */
	EAttribute getInternalSuspend_SuspendType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getUuid()
	 * @see #getInternalSuspend()
	 * @generated
	 */
	EAttribute getInternalSuspend_Uuid();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAction#getActionType()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_ActionType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAction#getCondition()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAction#getEffect()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_Effect();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAction#getUuid()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_Uuid();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState
	 * @generated
	 */
	EClass getInternalSimpleState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getName()
	 * @see #getInternalSimpleState()
	 * @generated
	 */
	EAttribute getInternalSimpleState_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getLabel()
	 * @see #getInternalSimpleState()
	 * @generated
	 */
	EAttribute getInternalSimpleState_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState
	 * @generated
	 */
	EClass getInternalInitialState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState
	 * @generated
	 */
	EClass getInternalFinalState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector
	 * @generated
	 */
	EClass getInternalConnector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalConnector__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalConnector__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnector#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput
	 * @generated
	 */
	EClass getInternalInput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput#getLabel()
	 * @see #getInternalInput()
	 * @generated
	 */
	EAttribute getInternalInput_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInput__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput#getOutputSuccessors() <em>Get Output Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput#getOutputSuccessors()
	 * @generated
	 */
	EOperation getInternalInput__GetOutputSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput#getOperatorSuccessors() <em>Get Operator Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput#getOperatorSuccessors()
	 * @generated
	 */
	EOperation getInternalInput__GetOperatorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInput#getCircuitConnecterSuccessors() <em>Get Circuit Connecter Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInput#getCircuitConnecterSuccessors()
	 * @generated
	 */
	EOperation getInternalInput__GetCircuitConnecterSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput
	 * @generated
	 */
	EClass getInternalOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getLabel()
	 * @see #getInternalOutput()
	 * @generated
	 */
	EAttribute getInternalOutput_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalOutput__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalOutput__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getInputPredecessors() <em>Get Input Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getInputPredecessors()
	 * @generated
	 */
	EOperation getInternalOutput__GetInputPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getOperatorPredecessors() <em>Get Operator Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getOperatorPredecessors()
	 * @generated
	 */
	EOperation getInternalOutput__GetOperatorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getCircuitConnecterPredecessors() <em>Get Circuit Connecter Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOutput#getCircuitConnecterPredecessors()
	 * @generated
	 */
	EOperation getInternalOutput__GetCircuitConnecterPredecessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator
	 * @generated
	 */
	EClass getInternalOperator();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOperator()
	 * @see #getInternalOperator()
	 * @generated
	 */
	EAttribute getInternalOperator_Operator();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalOperator__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalOperator__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getInputPredecessors() <em>Get Input Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getInputPredecessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetInputPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOperatorPredecessors() <em>Get Operator Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOperatorPredecessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetOperatorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getCircuitConnecterPredecessors() <em>Get Circuit Connecter Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getCircuitConnecterPredecessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetCircuitConnecterPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOutputSuccessors() <em>Get Output Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOutputSuccessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetOutputSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOperatorSuccessors() <em>Get Operator Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getOperatorSuccessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetOperatorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getCircuitConnecterSuccessors() <em>Get Circuit Connecter Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalOperator#getCircuitConnecterSuccessors()
	 * @generated
	 */
	EOperation getInternalOperator__GetCircuitConnecterSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter <em>Circuit Connecter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Connecter</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter
	 * @generated
	 */
	EClass getInternalCircuitConnecter();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getInputPredecessors() <em>Get Input Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getInputPredecessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetInputPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOperatorPredecessors() <em>Get Operator Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOperatorPredecessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetOperatorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getCircuitConnecterPredecessors() <em>Get Circuit Connecter Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getCircuitConnecterPredecessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetCircuitConnecterPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOutputSuccessors() <em>Get Output Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOutputSuccessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetOutputSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOperatorSuccessors() <em>Get Operator Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operator Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getOperatorSuccessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetOperatorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getCircuitConnecterSuccessors() <em>Get Circuit Connecter Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Circuit Connecter Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalCircuitConnecter#getCircuitConnecterSuccessors()
	 * @generated
	 */
	EOperation getInternalCircuitConnecter__GetCircuitConnecterSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece <em>SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece
	 * @generated
	 */
	EClass getInternalSCChartReferece();

	/**
	 * Returns the meta object for the attribute list '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Assignments</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getAssignments()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Assignments();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getName()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLabel()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Label();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getInputsOutputs <em>Inputs Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inputs Outputs</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getInputsOutputs()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_InputsOutputs();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getUuid()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLibraryComponentUID <em>Library Component UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Component UID</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLibraryComponentUID()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_LibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece <em>Initial SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece
	 * @generated
	 */
	EClass getInternalInitialSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece <em>Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece
	 * @generated
	 */
	EClass getInternalFinalSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition
	 * @generated
	 */
	EClass getInternalAbstractTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition#getPriority()
	 * @see #getInternalAbstractTransition()
	 * @generated
	 */
	EAttribute getInternalAbstractTransition_Priority();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTransition#getCondition()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTransition#getCount_delay()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTransition#getEffect()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition
	 * @generated
	 */
	EClass getInternalImmediateTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition#getCondition()
	 * @see #getInternalImmediateTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition#getCount_delay()
	 * @see #getInternalImmediateTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateTransition#getEffect()
	 * @see #getInternalImmediateTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition <em>Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition
	 * @generated
	 */
	EClass getInternalTerminationTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition#getEffect()
	 * @see #getInternalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition <em>Conditional Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition
	 * @generated
	 */
	EClass getInternalConditionalTerminationTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition#getCondition()
	 * @see #getInternalConditionalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition#getCount_delay()
	 * @see #getInternalConditionalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition#getEffect()
	 * @see #getInternalConditionalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition <em>Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition
	 * @generated
	 */
	EClass getInternalStrongAbortTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition#getCondition()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition#getCount_delay()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition#getEffect()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition <em>Immediate Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition
	 * @generated
	 */
	EClass getInternalImmediateStrongAbortTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition#getCondition()
	 * @see #getInternalImmediateStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition#getCount_delay()
	 * @see #getInternalImmediateStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition#getEffect()
	 * @see #getInternalImmediateStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition <em>Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition
	 * @generated
	 */
	EClass getInternalDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition#getCondition()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition#getCount_delay()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalDeferredTransition#getEffect()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition <em>Immediate Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition
	 * @generated
	 */
	EClass getInternalImmediateDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition#getCondition()
	 * @see #getInternalImmediateDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition#getCount_delay()
	 * @see #getInternalImmediateDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition#getEffect()
	 * @see #getInternalImmediateDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition <em>Termination Defferd Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Defferd Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition
	 * @generated
	 */
	EClass getInternalTerminationDefferdTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition#getEffect()
	 * @see #getInternalTerminationDefferdTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDefferdTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition <em>Conditional Termination Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Termination Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition
	 * @generated
	 */
	EClass getInternalConditionalTerminationDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition#getCondition()
	 * @see #getInternalConditionalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition#getCount_delay()
	 * @see #getInternalConditionalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition#getEffect()
	 * @see #getInternalConditionalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition <em>Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition
	 * @generated
	 */
	EClass getInternalStrongAbortDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition#getCondition()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition#getCount_delay()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortDeferredTransition#getEffect()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition <em>Immediate Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Strong Abort Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition
	 * @generated
	 */
	EClass getInternalImmediateStrongAbortDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition#getCondition()
	 * @see #getInternalImmediateStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition#getCount_delay()
	 * @see #getInternalImmediateStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition#getEffect()
	 * @see #getInternalImmediateStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition <em>History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition
	 * @generated
	 */
	EClass getInternalHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#getCondition()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#getCount_delay()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#isDeepHistory()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition#getEffect()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition <em>Immediate History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition
	 * @generated
	 */
	EClass getInternalImmediateHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#getCondition()
	 * @see #getInternalImmediateHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#getCount_delay()
	 * @see #getInternalImmediateHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#isDeepHistory()
	 * @see #getInternalImmediateHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateHistoryTransition#getEffect()
	 * @see #getInternalImmediateHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition <em>Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition
	 * @generated
	 */
	EClass getInternalTerminationHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#isDeepHistory()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#getEffect()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition <em>Conditional Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Termination History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition
	 * @generated
	 */
	EClass getInternalConditionalTerminationHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCondition()
	 * @see #getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCount_delay()
	 * @see #getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#isDeepHistory()
	 * @see #getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getEffect()
	 * @see #getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalConditionalTerminationHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition <em>Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition
	 * @generated
	 */
	EClass getInternalStrongAbortHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#getCondition()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#getCount_delay()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#isDeepHistory()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition#getEffect()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition <em>Immediate Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Strong Abort History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition
	 * @generated
	 */
	EClass getInternalImmediateStrongAbortHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#getCondition()
	 * @see #getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#getCount_delay()
	 * @see #getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#isDeepHistory()
	 * @see #getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition#getEffect()
	 * @see #getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateStrongAbortHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalConnection
	 * @generated
	 */
	EClass getInternalConnection();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChart <em>SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChart
	 * @generated
	 */
	EClass getInternalSCChart();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChart#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalSCChart#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSCChart__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAssignment
	 * @generated
	 */
	EClass getInternalAssignment();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAssignment#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalAssignment#getAssignment()
	 * @see #getInternalAssignment()
	 * @generated
	 */
	EAttribute getInternalAssignment_Assignment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalFactory getInternalFactory();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalRootStateImpl <em>Root State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalRootStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalRootState()
		 * @generated
		 */
		EClass INTERNAL_ROOT_STATE = eINSTANCE.getInternalRootState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE__NAME = eINSTANCE.getInternalRootState_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE__LABEL = eINSTANCE.getInternalRootState_Label();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalRootState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalRootState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalRootState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Output Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_OUTPUT_SUCCESSORS = eINSTANCE.getInternalRootState__GetOutputSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_OPERATOR_SUCCESSORS = eINSTANCE.getInternalRootState__GetOperatorSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_CIRCUIT_CONNECTER_SUCCESSORS = eINSTANCE.getInternalRootState__GetCircuitConnecterSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalRegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalRegionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalRegion()
		 * @generated
		 */
		EClass INTERNAL_REGION = eINSTANCE.getInternalRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REGION__NAME = eINSTANCE.getInternalRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REGION__LABEL = eINSTANCE.getInternalRegion_Label();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REGION__UUID = eINSTANCE.getInternalRegion_Uuid();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_REGION___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalRegion__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDataFlowRegionImpl <em>Data Flow Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalDataFlowRegionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalDataFlowRegion()
		 * @generated
		 */
		EClass INTERNAL_DATA_FLOW_REGION = eINSTANCE.getInternalDataFlowRegion();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DATA_FLOW_REGION___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalDataFlowRegion__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl <em>Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuperStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSuperState()
		 * @generated
		 */
		EClass INTERNAL_SUPER_STATE = eINSTANCE.getInternalSuperState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE__NAME = eINSTANCE.getInternalSuperState_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE__LABEL = eINSTANCE.getInternalSuperState_Label();

		/**
		 * The meta object literal for the '<em><b>Inputs Outputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE__INPUTS_OUTPUTS = eINSTANCE.getInternalSuperState_InputsOutputs();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitilalSuperStateImpl <em>Initilal Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitilalSuperStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInitilalSuperState()
		 * @generated
		 */
		EClass INTERNAL_INITILAL_SUPER_STATE = eINSTANCE.getInternalInitilalSuperState();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalInitilalSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalInitilalSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalInitilalSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSuperStateImpl <em>Final Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSuperStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalFinalSuperState()
		 * @generated
		 */
		EClass INTERNAL_FINAL_SUPER_STATE = eINSTANCE.getInternalFinalSuperState();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalFinalSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalFinalSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalFinalSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalFinalSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalFinalSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalDeclaration()
		 * @generated
		 */
		EClass INTERNAL_DECLARATION = eINSTANCE.getInternalDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__DECLARATION_TYPE = eINSTANCE.getInternalDeclaration_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__CONSTANT = eINSTANCE.getInternalDeclaration_Constant();

		/**
		 * The meta object literal for the '<em><b>Input Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__INPUT_OUTPUT = eINSTANCE.getInternalDeclaration_InputOutput();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__ASSIGNMENT = eINSTANCE.getInternalDeclaration_Assignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__NAME = eINSTANCE.getInternalDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__SIGNAL = eINSTANCE.getInternalDeclaration_Signal();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DECLARATION__UUID = eINSTANCE.getInternalDeclaration_Uuid();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuspendImpl <em>Suspend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSuspendImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSuspend()
		 * @generated
		 */
		EClass INTERNAL_SUSPEND = eINSTANCE.getInternalSuspend();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUSPEND__CONDITION = eINSTANCE.getInternalSuspend_Condition();

		/**
		 * The meta object literal for the '<em><b>Suspend Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUSPEND__SUSPEND_TYPE = eINSTANCE.getInternalSuspend_SuspendType();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUSPEND__UUID = eINSTANCE.getInternalSuspend_Uuid();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalActionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ACTION__ACTION_TYPE = eINSTANCE.getInternalAction_ActionType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ACTION__CONDITION = eINSTANCE.getInternalAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ACTION__EFFECT = eINSTANCE.getInternalAction_Effect();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ACTION__UUID = eINSTANCE.getInternalAction_Uuid();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSimpleStateImpl <em>Simple State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSimpleStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSimpleState()
		 * @generated
		 */
		EClass INTERNAL_SIMPLE_STATE = eINSTANCE.getInternalSimpleState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SIMPLE_STATE__NAME = eINSTANCE.getInternalSimpleState_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SIMPLE_STATE__LABEL = eINSTANCE.getInternalSimpleState_Label();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalSimpleState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalSimpleState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInitialState()
		 * @generated
		 */
		EClass INTERNAL_INITIAL_STATE = eINSTANCE.getInternalInitialState();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalInitialState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalInitialState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalInitialState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalInitialState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalStateImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalFinalState()
		 * @generated
		 */
		EClass INTERNAL_FINAL_STATE = eINSTANCE.getInternalFinalState();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalFinalState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalFinalState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalFinalState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalFinalState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectorImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConnector()
		 * @generated
		 */
		EClass INTERNAL_CONNECTOR = eINSTANCE.getInternalConnector();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalConnector__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalConnector__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_FINAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetFinalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalConnector__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_FINAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetFinalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalConnector__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInputImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInput()
		 * @generated
		 */
		EClass INTERNAL_INPUT = eINSTANCE.getInternalInput();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_INPUT__LABEL = eINSTANCE.getInternalInput_Label();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INPUT___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalInput__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Output Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INPUT___GET_OUTPUT_SUCCESSORS = eINSTANCE.getInternalInput__GetOutputSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INPUT___GET_OPERATOR_SUCCESSORS = eINSTANCE.getInternalInput__GetOperatorSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INPUT___GET_CIRCUIT_CONNECTER_SUCCESSORS = eINSTANCE.getInternalInput__GetCircuitConnecterSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalOutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalOutputImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalOutput()
		 * @generated
		 */
		EClass INTERNAL_OUTPUT = eINSTANCE.getInternalOutput();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_OUTPUT__LABEL = eINSTANCE.getInternalOutput_Label();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OUTPUT___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalOutput__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OUTPUT___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalOutput__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Input Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OUTPUT___GET_INPUT_PREDECESSORS = eINSTANCE.getInternalOutput__GetInputPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OUTPUT___GET_OPERATOR_PREDECESSORS = eINSTANCE.getInternalOutput__GetOperatorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OUTPUT___GET_CIRCUIT_CONNECTER_PREDECESSORS = eINSTANCE.getInternalOutput__GetCircuitConnecterPredecessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalOperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalOperatorImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalOperator()
		 * @generated
		 */
		EClass INTERNAL_OPERATOR = eINSTANCE.getInternalOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_OPERATOR__OPERATOR = eINSTANCE.getInternalOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalOperator__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalOperator__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalOperator__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Input Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_INPUT_PREDECESSORS = eINSTANCE.getInternalOperator__GetInputPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_OPERATOR_PREDECESSORS = eINSTANCE.getInternalOperator__GetOperatorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_CIRCUIT_CONNECTER_PREDECESSORS = eINSTANCE.getInternalOperator__GetCircuitConnecterPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Output Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_OUTPUT_SUCCESSORS = eINSTANCE.getInternalOperator__GetOutputSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_OPERATOR_SUCCESSORS = eINSTANCE.getInternalOperator__GetOperatorSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_OPERATOR___GET_CIRCUIT_CONNECTER_SUCCESSORS = eINSTANCE.getInternalOperator__GetCircuitConnecterSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalCircuitConnecterImpl <em>Circuit Connecter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalCircuitConnecterImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalCircuitConnecter()
		 * @generated
		 */
		EClass INTERNAL_CIRCUIT_CONNECTER = eINSTANCE.getInternalCircuitConnecter();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalCircuitConnecter__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalCircuitConnecter__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalCircuitConnecter__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Input Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_INPUT_PREDECESSORS = eINSTANCE.getInternalCircuitConnecter__GetInputPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_OPERATOR_PREDECESSORS = eINSTANCE.getInternalCircuitConnecter__GetOperatorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_PREDECESSORS = eINSTANCE.getInternalCircuitConnecter__GetCircuitConnecterPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Output Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_OUTPUT_SUCCESSORS = eINSTANCE.getInternalCircuitConnecter__GetOutputSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Operator Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_OPERATOR_SUCCESSORS = eINSTANCE.getInternalCircuitConnecter__GetOperatorSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Circuit Connecter Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_SUCCESSORS = eINSTANCE.getInternalCircuitConnecter__GetCircuitConnecterSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl <em>SC Chart Referece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSCChartReferece()
		 * @generated
		 */
		EClass INTERNAL_SC_CHART_REFERECE = eINSTANCE.getInternalSCChartReferece();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS = eINSTANCE.getInternalSCChartReferece_Assignments();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SC_CHART_REFERECE__NAME = eINSTANCE.getInternalSCChartReferece_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SC_CHART_REFERECE__LABEL = eINSTANCE.getInternalSCChartReferece_Label();

		/**
		 * The meta object literal for the '<em><b>Inputs Outputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS = eINSTANCE.getInternalSCChartReferece_InputsOutputs();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SC_CHART_REFERECE__UUID = eINSTANCE.getInternalSCChartReferece_Uuid();

		/**
		 * The meta object literal for the '<em><b>Library Component UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID = eINSTANCE.getInternalSCChartReferece_LibraryComponentUID();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSCChartReferece__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SC_CHART_REFERECE___GET_REFERENCE = eINSTANCE.getInternalSCChartReferece__GetReference();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialSCChartRefereceImpl <em>Initial SC Chart Referece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalInitialSCChartRefereceImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalInitialSCChartReferece()
		 * @generated
		 */
		EClass INTERNAL_INITIAL_SC_CHART_REFERECE = eINSTANCE.getInternalInitialSCChartReferece();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalInitialSCChartReferece__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_SC_CHART_REFERECE___GET_REFERENCE = eINSTANCE.getInternalInitialSCChartReferece__GetReference();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSCChartRefereceImpl <em>Final SC Chart Referece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalFinalSCChartRefereceImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalFinalSCChartReferece()
		 * @generated
		 */
		EClass INTERNAL_FINAL_SC_CHART_REFERECE = eINSTANCE.getInternalFinalSCChartReferece();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalFinalSCChartReferece__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_SC_CHART_REFERECE___GET_REFERENCE = eINSTANCE.getInternalFinalSCChartReferece__GetReference();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalAbstractTransitionImpl <em>Abstract Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalAbstractTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalAbstractTransition()
		 * @generated
		 */
		EClass INTERNAL_ABSTRACT_TRANSITION = eINSTANCE.getInternalAbstractTransition();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ABSTRACT_TRANSITION__PRIORITY = eINSTANCE.getInternalAbstractTransition_Priority();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__CONDITION = eINSTANCE.getInternalTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__EFFECT = eINSTANCE.getInternalTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateTransitionImpl <em>Immediate Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_TRANSITION = eINSTANCE.getInternalImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_TRANSITION__CONDITION = eINSTANCE.getInternalImmediateTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalImmediateTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_TRANSITION__EFFECT = eINSTANCE.getInternalImmediateTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationTransitionImpl <em>Termination Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTerminationTransition()
		 * @generated
		 */
		EClass INTERNAL_TERMINATION_TRANSITION = eINSTANCE.getInternalTerminationTransition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TERMINATION_TRANSITION__EFFECT = eINSTANCE.getInternalTerminationTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationTransitionImpl <em>Conditional Termination Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConditionalTerminationTransition()
		 * @generated
		 */
		EClass INTERNAL_CONDITIONAL_TERMINATION_TRANSITION = eINSTANCE.getInternalConditionalTerminationTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__CONDITION = eINSTANCE.getInternalConditionalTerminationTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalConditionalTerminationTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_TRANSITION__EFFECT = eINSTANCE.getInternalConditionalTerminationTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortTransitionImpl <em>Strong Abort Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortTransition()
		 * @generated
		 */
		EClass INTERNAL_STRONG_ABORT_TRANSITION = eINSTANCE.getInternalStrongAbortTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_TRANSITION__CONDITION = eINSTANCE.getInternalStrongAbortTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalStrongAbortTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_TRANSITION__EFFECT = eINSTANCE.getInternalStrongAbortTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortTransitionImpl <em>Immediate Strong Abort Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateStrongAbortTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION = eINSTANCE.getInternalImmediateStrongAbortTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__CONDITION = eINSTANCE.getInternalImmediateStrongAbortTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalImmediateStrongAbortTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION__EFFECT = eINSTANCE.getInternalImmediateStrongAbortTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeferredTransitionImpl <em>Deferred Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeferredTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalDeferredTransition()
		 * @generated
		 */
		EClass INTERNAL_DEFERRED_TRANSITION = eINSTANCE.getInternalDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DEFERRED_TRANSITION__CONDITION = eINSTANCE.getInternalDeferredTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DEFERRED_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalDeferredTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DEFERRED_TRANSITION__EFFECT = eINSTANCE.getInternalDeferredTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateDeferredTransitionImpl <em>Immediate Deferred Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateDeferredTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateDeferredTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_DEFERRED_TRANSITION = eINSTANCE.getInternalImmediateDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__CONDITION = eINSTANCE.getInternalImmediateDeferredTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalImmediateDeferredTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_DEFERRED_TRANSITION__EFFECT = eINSTANCE.getInternalImmediateDeferredTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationDefferdTransitionImpl <em>Termination Defferd Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationDefferdTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTerminationDefferdTransition()
		 * @generated
		 */
		EClass INTERNAL_TERMINATION_DEFFERD_TRANSITION = eINSTANCE.getInternalTerminationDefferdTransition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TERMINATION_DEFFERD_TRANSITION__EFFECT = eINSTANCE.getInternalTerminationDefferdTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationDeferredTransitionImpl <em>Conditional Termination Deferred Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationDeferredTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConditionalTerminationDeferredTransition()
		 * @generated
		 */
		EClass INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION = eINSTANCE.getInternalConditionalTerminationDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__CONDITION = eINSTANCE.getInternalConditionalTerminationDeferredTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalConditionalTerminationDeferredTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__EFFECT = eINSTANCE.getInternalConditionalTerminationDeferredTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortDeferredTransitionImpl <em>Strong Abort Deferred Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortDeferredTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortDeferredTransition()
		 * @generated
		 */
		EClass INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION = eINSTANCE.getInternalStrongAbortDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION = eINSTANCE.getInternalStrongAbortDeferredTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalStrongAbortDeferredTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT = eINSTANCE.getInternalStrongAbortDeferredTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl <em>Immediate Strong Abort Deferred Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateStrongAbortDeferredTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION = eINSTANCE.getInternalImmediateStrongAbortDeferredTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION = eINSTANCE.getInternalImmediateStrongAbortDeferredTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalImmediateStrongAbortDeferredTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT = eINSTANCE.getInternalImmediateStrongAbortDeferredTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalHistoryTransitionImpl <em>History Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalHistoryTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalHistoryTransition()
		 * @generated
		 */
		EClass INTERNAL_HISTORY_TRANSITION = eINSTANCE.getInternalHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_HISTORY_TRANSITION__CONDITION = eINSTANCE.getInternalHistoryTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_HISTORY_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalHistoryTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY = eINSTANCE.getInternalHistoryTransition_DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_HISTORY_TRANSITION__EFFECT = eINSTANCE.getInternalHistoryTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateHistoryTransitionImpl <em>Immediate History Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateHistoryTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateHistoryTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_HISTORY_TRANSITION = eINSTANCE.getInternalImmediateHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_HISTORY_TRANSITION__CONDITION = eINSTANCE.getInternalImmediateHistoryTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_HISTORY_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalImmediateHistoryTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_HISTORY_TRANSITION__DEEP_HISTORY = eINSTANCE.getInternalImmediateHistoryTransition_DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_HISTORY_TRANSITION__EFFECT = eINSTANCE.getInternalImmediateHistoryTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationHistoryTransitionImpl <em>Termination History Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationHistoryTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalTerminationHistoryTransition()
		 * @generated
		 */
		EClass INTERNAL_TERMINATION_HISTORY_TRANSITION = eINSTANCE.getInternalTerminationHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY = eINSTANCE.getInternalTerminationHistoryTransition_DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT = eINSTANCE.getInternalTerminationHistoryTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl <em>Conditional Termination History Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConditionalTerminationHistoryTransition()
		 * @generated
		 */
		EClass INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION = eINSTANCE.getInternalConditionalTerminationHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION = eINSTANCE.getInternalConditionalTerminationHistoryTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalConditionalTerminationHistoryTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY = eINSTANCE.getInternalConditionalTerminationHistoryTransition_DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT = eINSTANCE.getInternalConditionalTerminationHistoryTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortHistoryTransitionImpl <em>Strong Abort History Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalStrongAbortHistoryTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortHistoryTransition()
		 * @generated
		 */
		EClass INTERNAL_STRONG_ABORT_HISTORY_TRANSITION = eINSTANCE.getInternalStrongAbortHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__CONDITION = eINSTANCE.getInternalStrongAbortHistoryTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalStrongAbortHistoryTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__DEEP_HISTORY = eINSTANCE.getInternalStrongAbortHistoryTransition_DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__EFFECT = eINSTANCE.getInternalStrongAbortHistoryTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortHistoryTransitionImpl <em>Immediate Strong Abort History Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalImmediateStrongAbortHistoryTransitionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalImmediateStrongAbortHistoryTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION = eINSTANCE.getInternalImmediateStrongAbortHistoryTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__CONDITION = eINSTANCE.getInternalImmediateStrongAbortHistoryTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Count delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__COUNT_DELAY = eINSTANCE.getInternalImmediateStrongAbortHistoryTransition_Count_delay();

		/**
		 * The meta object literal for the '<em><b>Deep History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__DEEP_HISTORY = eINSTANCE.getInternalImmediateStrongAbortHistoryTransition_DeepHistory();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__EFFECT = eINSTANCE.getInternalImmediateStrongAbortHistoryTransition_Effect();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalConnectionImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalConnection()
		 * @generated
		 */
		EClass INTERNAL_CONNECTION = eINSTANCE.getInternalConnection();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartImpl <em>SC Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalSCChart()
		 * @generated
		 */
		EClass INTERNAL_SC_CHART = eINSTANCE.getInternalSCChart();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SC_CHART___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSCChart__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalAssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalAssignmentImpl
		 * @see info.scce.cinco.product.scchart.scchart.internal.impl.InternalPackageImpl#getInternalAssignment()
		 * @generated
		 */
		EClass INTERNAL_ASSIGNMENT = eINSTANCE.getInternalAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ASSIGNMENT__ASSIGNMENT = eINSTANCE.getInternalAssignment_Assignment();

	}

} //InternalPackage
