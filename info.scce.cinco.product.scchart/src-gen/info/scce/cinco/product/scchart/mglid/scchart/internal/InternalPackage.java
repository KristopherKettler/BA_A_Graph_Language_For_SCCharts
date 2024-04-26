/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

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
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory
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
	String eNS_URI = "http://cinco.scce.info/product/scchart/mglid/internal";

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
	InternalPackage eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateImpl <em>Root State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootState()
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
	 * The feature id for the '<em><b>Generator Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__GENERATOR_OUTPUT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__NAME = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Root State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRegion()
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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionRefImpl <em>Region Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionRefImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRegionRef()
	 * @generated
	 */
	int INTERNAL_REGION_REF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Region Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_REF_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl <em>Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperState()
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
	 * The number of structural features of the '<em>Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialSuperStateImpl <em>Initial Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialSuperState()
	 * @generated
	 */
	int INTERNAL_INITIAL_SUPER_STATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__ID = INTERNAL_SUPER_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__CONTAINER = INTERNAL_SUPER_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__ELEMENT = INTERNAL_SUPER_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__X = INTERNAL_SUPER_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__Y = INTERNAL_SUPER_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__HEIGHT = INTERNAL_SUPER_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__WIDTH = INTERNAL_SUPER_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__INCOMING = INTERNAL_SUPER_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__OUTGOING = INTERNAL_SUPER_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__MODEL_ELEMENTS = INTERNAL_SUPER_STATE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__NAME = INTERNAL_SUPER_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE__LABEL = INTERNAL_SUPER_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Initial Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE_FEATURE_COUNT = INTERNAL_SUPER_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___EQUALS__OBJECT = INTERNAL_SUPER_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___HASH_CODE = INTERNAL_SUPER_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___SAVE = INTERNAL_SUPER_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_ELEMENT = INTERNAL_SUPER_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_ROOT_ELEMENT = INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SUCCESSORS = INTERNAL_SUPER_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_PREDECESSORS = INTERNAL_SUPER_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INCOMING__CLASS = INTERNAL_SUPER_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_OUTGOING__CLASS = INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___CAN_START__CLASS = INTERNAL_SUPER_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___CAN_END__CLASS = INTERNAL_SUPER_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___CAN_CONTAIN__CLASS = INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_CONTAINER_ELEMENT = INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___CAN_CONTAIN__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Initial Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUPER_STATE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalSuperStateImpl <em>Final Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalFinalSuperState()
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
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Final Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUPER_STATE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialFinalSuperStateImpl <em>Initial Final Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialFinalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialFinalSuperState()
	 * @generated
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__ID = INTERNAL_SUPER_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__CONTAINER = INTERNAL_SUPER_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__ELEMENT = INTERNAL_SUPER_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__X = INTERNAL_SUPER_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__Y = INTERNAL_SUPER_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__HEIGHT = INTERNAL_SUPER_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__WIDTH = INTERNAL_SUPER_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__INCOMING = INTERNAL_SUPER_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__OUTGOING = INTERNAL_SUPER_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__MODEL_ELEMENTS = INTERNAL_SUPER_STATE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__NAME = INTERNAL_SUPER_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE__LABEL = INTERNAL_SUPER_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Initial Final Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE_FEATURE_COUNT = INTERNAL_SUPER_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___EQUALS__OBJECT = INTERNAL_SUPER_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___HASH_CODE = INTERNAL_SUPER_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___SAVE = INTERNAL_SUPER_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_ELEMENT = INTERNAL_SUPER_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_ROOT_ELEMENT = INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SUCCESSORS = INTERNAL_SUPER_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_PREDECESSORS = INTERNAL_SUPER_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INCOMING__CLASS = INTERNAL_SUPER_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_OUTGOING__CLASS = INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___CAN_START__CLASS = INTERNAL_SUPER_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___CAN_END__CLASS = INTERNAL_SUPER_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___CAN_CONTAIN__CLASS = INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_CONTAINER_ELEMENT = INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___CAN_CONTAIN__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Initial Final Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUPER_STATE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDeclarationImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalDeclaration()
	 * @generated
	 */
	int INTERNAL_DECLARATION = 7;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuspensionImpl <em>Suspension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuspensionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuspension()
	 * @generated
	 */
	int INTERNAL_SUSPENSION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Suspension Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__SUSPENSION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__CONDITION = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION__UUID = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUSPENSION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalActionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 9;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSimpleState()
	 * @generated
	 */
	int INTERNAL_SIMPLE_STATE = 10;

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
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialState()
	 * @generated
	 */
	int INTERNAL_INITIAL_STATE = 11;

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
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalFinalState()
	 * @generated
	 */
	int INTERNAL_FINAL_STATE = 12;

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
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialFinalStateImpl <em>Initial Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialFinalStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialFinalState()
	 * @generated
	 */
	int INTERNAL_INITIAL_FINAL_STATE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__ID = INTERNAL_SIMPLE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__CONTAINER = INTERNAL_SIMPLE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__ELEMENT = INTERNAL_SIMPLE_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__X = INTERNAL_SIMPLE_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__Y = INTERNAL_SIMPLE_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__HEIGHT = INTERNAL_SIMPLE_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__WIDTH = INTERNAL_SIMPLE_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__INCOMING = INTERNAL_SIMPLE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__OUTGOING = INTERNAL_SIMPLE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__NAME = INTERNAL_SIMPLE_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE__LABEL = INTERNAL_SIMPLE_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Initial Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE_FEATURE_COUNT = INTERNAL_SIMPLE_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___EQUALS__OBJECT = INTERNAL_SIMPLE_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___HASH_CODE = INTERNAL_SIMPLE_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___SAVE = INTERNAL_SIMPLE_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_ROOT_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SUCCESSORS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_PREDECESSORS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INCOMING__CLASS = INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_OUTGOING__CLASS = INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___CAN_START__CLASS = INTERNAL_SIMPLE_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___CAN_END__CLASS = INTERNAL_SIMPLE_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Initial Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConnectorImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalConnector()
	 * @generated
	 */
	int INTERNAL_CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__ID = INTERNAL_SIMPLE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__CONTAINER = INTERNAL_SIMPLE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__ELEMENT = INTERNAL_SIMPLE_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__X = INTERNAL_SIMPLE_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__Y = INTERNAL_SIMPLE_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__HEIGHT = INTERNAL_SIMPLE_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__WIDTH = INTERNAL_SIMPLE_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__INCOMING = INTERNAL_SIMPLE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__OUTGOING = INTERNAL_SIMPLE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__NAME = INTERNAL_SIMPLE_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__LABEL = INTERNAL_SIMPLE_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR_FEATURE_COUNT = INTERNAL_SIMPLE_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___EQUALS__OBJECT = INTERNAL_SIMPLE_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___HASH_CODE = INTERNAL_SIMPLE_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___SAVE = INTERNAL_SIMPLE_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ROOT_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUCCESSORS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUCCESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_PREDECESSORS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_PREDECESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INCOMING__CLASS = INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_OUTGOING__CLASS = INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_CONNECT__EDGE_NODE = INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_START__CLASS = INTERNAL_SIMPLE_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_END__CLASS = INTERNAL_SIMPLE_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INCOMING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_OUTGOING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl <em>SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSCChartReferece()
	 * @generated
	 */
	int INTERNAL_SC_CHART_REFERECE = 15;

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
	 * The feature id for the '<em><b>Assignments</b></em>' attribute.
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
	 * The feature id for the '<em><b>Inputs Outputs Of Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 5;

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
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE___GET_REFERENCE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialSCChartRefereceImpl <em>Initial SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialSCChartReferece()
	 * @generated
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE = 16;

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
	 * The feature id for the '<em><b>Assignments</b></em>' attribute.
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
	 * The feature id for the '<em><b>Inputs Outputs Of Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF = INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE__LABEL = INTERNAL_SC_CHART_REFERECE__LABEL;

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
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE___GET_REFERENCE = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Initial SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_SC_CHART_REFERECE_OPERATION_COUNT = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalSCChartRefereceImpl <em>Final SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalFinalSCChartReferece()
	 * @generated
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE = 17;

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
	 * The feature id for the '<em><b>Assignments</b></em>' attribute.
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
	 * The feature id for the '<em><b>Inputs Outputs Of Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF = INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE__LABEL = INTERNAL_SC_CHART_REFERECE__LABEL;

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
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE___GET_REFERENCE = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Final SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_SC_CHART_REFERECE_OPERATION_COUNT = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialFinalSCChartRefereceImpl <em>Initial Final SC Chart Referece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialFinalSCChartRefereceImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialFinalSCChartReferece()
	 * @generated
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__ID = INTERNAL_SC_CHART_REFERECE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__CONTAINER = INTERNAL_SC_CHART_REFERECE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__ELEMENT = INTERNAL_SC_CHART_REFERECE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__X = INTERNAL_SC_CHART_REFERECE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__Y = INTERNAL_SC_CHART_REFERECE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__HEIGHT = INTERNAL_SC_CHART_REFERECE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__WIDTH = INTERNAL_SC_CHART_REFERECE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__INCOMING = INTERNAL_SC_CHART_REFERECE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__OUTGOING = INTERNAL_SC_CHART_REFERECE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__MODEL_ELEMENTS = INTERNAL_SC_CHART_REFERECE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__ASSIGNMENTS = INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__NAME = INTERNAL_SC_CHART_REFERECE__NAME;

	/**
	 * The feature id for the '<em><b>Inputs Outputs Of Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF = INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS_OF_REF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__LABEL = INTERNAL_SC_CHART_REFERECE__LABEL;

	/**
	 * The feature id for the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID = INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID;

	/**
	 * The number of structural features of the '<em>Initial Final SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE_FEATURE_COUNT = INTERNAL_SC_CHART_REFERECE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___EQUALS__OBJECT = INTERNAL_SC_CHART_REFERECE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___HASH_CODE = INTERNAL_SC_CHART_REFERECE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___SAVE = INTERNAL_SC_CHART_REFERECE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SUCCESSORS = INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS = INTERNAL_SC_CHART_REFERECE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_PREDECESSORS = INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS = INTERNAL_SC_CHART_REFERECE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INCOMING__CLASS = INTERNAL_SC_CHART_REFERECE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS = INTERNAL_SC_CHART_REFERECE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE = INTERNAL_SC_CHART_REFERECE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___CAN_START__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___CAN_END__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT = INTERNAL_SC_CHART_REFERECE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST = INTERNAL_SC_CHART_REFERECE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INCOMING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Initial Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Initial Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_STATE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE___GET_REFERENCE = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Initial Final SC Chart Referece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_FINAL_SC_CHART_REFERECE_OPERATION_COUNT = INTERNAL_SC_CHART_REFERECE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalAbstractTransitionImpl <em>Abstract Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalAbstractTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalAbstractTransition()
	 * @generated
	 */
	int INTERNAL_ABSTRACT_TRANSITION = 19;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 20;

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
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationTransitionImpl <em>Termination Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTerminationTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_TRANSITION = 21;

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
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortTransitionImpl <em>Strong Abort Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION = 22;

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
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDeferredTransitionImpl <em>Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalDeferredTransition()
	 * @generated
	 */
	int INTERNAL_DEFERRED_TRANSITION = 23;

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
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalHistoryTransitionImpl <em>History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalHistoryTransition()
	 * @generated
	 */
	int INTERNAL_HISTORY_TRANSITION = 24;

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
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationDeferredTransitionImpl <em>Termination Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTerminationDeferredTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Termination Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Termination Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortDeferredTransitionImpl <em>Strong Abort Deferred Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortDeferredTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION = 26;

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
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strong Abort Deferred Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationHistoryTransitionImpl <em>Termination History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTerminationHistoryTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION = 27;

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
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Termination History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortHistoryTransitionImpl <em>Strong Abort History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION = 28;

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
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Strong Abort History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDeferredHistoryTransitionImpl <em>Deferred History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDeferredHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalDeferredHistoryTransition()
	 * @generated
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deferred History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Deferred History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFERRED_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortDeferredHistoryTransitionImpl <em>Strong Abort Deferred History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortDeferredHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Strong Abort Deferred History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Strong Abort Deferred History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationDeferredHistoryTransitionImpl <em>Termination Deferred History Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTerminationDeferredHistoryTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__ID = INTERNAL_ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__CONTAINER = INTERNAL_ABSTRACT_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__ELEMENT = INTERNAL_ABSTRACT_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__BENDPOINTS = INTERNAL_ABSTRACT_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__DECORATORS = INTERNAL_ABSTRACT_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__PRIORITY = INTERNAL_ABSTRACT_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__CONDITION = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__COUNT_DELAY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__DEEP_HISTORY = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__IMMEDIATE = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION__EFFECT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Termination Deferred History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION_FEATURE_COUNT = INTERNAL_ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___EQUALS__OBJECT = INTERNAL_ABSTRACT_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___HASH_CODE = INTERNAL_ABSTRACT_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___SAVE = INTERNAL_ABSTRACT_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___GET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_ABSTRACT_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_ABSTRACT_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_ABSTRACT_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Termination Deferred History Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION_OPERATION_COUNT = INTERNAL_ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartImpl <em>SC Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSCChart()
	 * @generated
	 */
	int INTERNAL_SC_CHART = 32;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__NAME = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SC Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_FEATURE_COUNT + 1;

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
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState <em>Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState
	 * @generated
	 */
	EClass getInternalRootState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getGeneratorOutput <em>Generator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Output</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getGeneratorOutput()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EAttribute getInternalRootState_GeneratorOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getName()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EAttribute getInternalRootState_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getLabel()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EAttribute getInternalRootState_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRootState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalRootState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion
	 * @generated
	 */
	EClass getInternalRegion();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getName()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getLabel()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Label();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getUuid()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Uuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRegion__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegionRef <em>Region Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Ref</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegionRef
	 * @generated
	 */
	EClass getInternalRegionRef();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegionRef#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegionRef#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRegionRef__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState
	 * @generated
	 */
	EClass getInternalSuperState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getName()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EAttribute getInternalSuperState_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getLabel()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EAttribute getInternalSuperState_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState <em>Initial Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState
	 * @generated
	 */
	EClass getInternalInitialSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSuperState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState <em>Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState
	 * @generated
	 */
	EClass getInternalFinalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSuperState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState <em>Initial Final Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Final Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState
	 * @generated
	 */
	EClass getInternalInitialFinalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSuperState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration
	 * @generated
	 */
	EClass getInternalDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getDeclarationType()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#isConstant()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Constant();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getInputOutput <em>Input Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getInputOutput()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_InputOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getAssignment()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getName()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#isSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#isSignal()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Signal();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration#getUuid()
	 * @see #getInternalDeclaration()
	 * @generated
	 */
	EAttribute getInternalDeclaration_Uuid();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension
	 * @generated
	 */
	EClass getInternalSuspension();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension#getSuspensionType <em>Suspension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspension Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension#getSuspensionType()
	 * @see #getInternalSuspension()
	 * @generated
	 */
	EAttribute getInternalSuspension_SuspensionType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension#getCondition()
	 * @see #getInternalSuspension()
	 * @generated
	 */
	EAttribute getInternalSuspension_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension#getUuid()
	 * @see #getInternalSuspension()
	 * @generated
	 */
	EAttribute getInternalSuspension_Uuid();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getActionType()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_ActionType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getCondition()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getEffect()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_Effect();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction#getUuid()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_Uuid();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState
	 * @generated
	 */
	EClass getInternalSimpleState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getName()
	 * @see #getInternalSimpleState()
	 * @generated
	 */
	EAttribute getInternalSimpleState_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getLabel()
	 * @see #getInternalSimpleState()
	 * @generated
	 */
	EAttribute getInternalSimpleState_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState
	 * @generated
	 */
	EClass getInternalInitialState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState
	 * @generated
	 */
	EClass getInternalFinalState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState <em>Initial Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Final State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState
	 * @generated
	 */
	EClass getInternalInitialFinalState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalState__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector
	 * @generated
	 */
	EClass getInternalConnector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalConnector__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalConnector__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece <em>SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece
	 * @generated
	 */
	EClass getInternalSCChartReferece();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignments</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getAssignments()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Assignments();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getName()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Name();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInputsOutputsOfRef <em>Inputs Outputs Of Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inputs Outputs Of Ref</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInputsOutputsOfRef()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_InputsOutputsOfRef();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getLabel()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_Label();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getLibraryComponentUID <em>Library Component UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Component UID</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getLibraryComponentUID()
	 * @see #getInternalSCChartReferece()
	 * @generated
	 */
	EAttribute getInternalSCChartReferece_LibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece <em>Initial SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece
	 * @generated
	 */
	EClass getInternalInitialSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalInitialSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece <em>Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece
	 * @generated
	 */
	EClass getInternalFinalSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalFinalSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece <em>Initial Final SC Chart Referece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Final SC Chart Referece</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece
	 * @generated
	 */
	EClass getInternalInitialFinalSCChartReferece();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSuperStatePredecessors() <em>Get Initial Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSuperStatePredecessors() <em>Get Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSuperStatePredecessors() <em>Get Initial Final Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalStatePredecessors() <em>Get Initial Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSCChartReferecePredecessors() <em>Get SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSCChartReferecePredecessors() <em>Get Initial SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSCChartReferecePredecessors() <em>Get Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSCChartReferecePredecessors() <em>Get Initial Final SC Chart Referece Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSCChartReferecePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSCChartReferecePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSuperStateSuccessors() <em>Get Initial Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSuperStateSuccessors() <em>Get Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSuperStateSuccessors() <em>Get Initial Final Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalStateSuccessors() <em>Get Initial Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetConnectorSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSCChartRefereceSuccessors() <em>Get SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSCChartRefereceSuccessors() <em>Get Initial SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSCChartRefereceSuccessors() <em>Get Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSCChartRefereceSuccessors() <em>Get Initial Final SC Chart Referece Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial Final SC Chart Referece Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getInitialFinalSCChartRefereceSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetInitialFinalSCChartRefereceSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getReference() <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSCChartReferece#getReference()
	 * @generated
	 */
	EOperation getInternalInitialFinalSCChartReferece__GetReference();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAbstractTransition
	 * @generated
	 */
	EClass getInternalAbstractTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAbstractTransition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAbstractTransition#getPriority()
	 * @see #getInternalAbstractTransition()
	 * @generated
	 */
	EAttribute getInternalAbstractTransition_Priority();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getCondition()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getCount_delay()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isImmediate()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getEffect()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition <em>Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition
	 * @generated
	 */
	EClass getInternalTerminationTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#getCondition()
	 * @see #getInternalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#getCount_delay()
	 * @see #getInternalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#isImmediate()
	 * @see #getInternalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition#getEffect()
	 * @see #getInternalTerminationTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition <em>Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition
	 * @generated
	 */
	EClass getInternalStrongAbortTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#getCondition()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#getCount_delay()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#isImmediate()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition#getEffect()
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition <em>Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition
	 * @generated
	 */
	EClass getInternalDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#getCondition()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#getCount_delay()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#isImmediate()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition#getEffect()
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition <em>History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition
	 * @generated
	 */
	EClass getInternalHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#getCondition()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#getCount_delay()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#isDeepHistory()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#isImmediate()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition#getEffect()
	 * @see #getInternalHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition <em>Termination Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition
	 * @generated
	 */
	EClass getInternalTerminationDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#getCondition()
	 * @see #getInternalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#getCount_delay()
	 * @see #getInternalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#isImmediate()
	 * @see #getInternalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition#getEffect()
	 * @see #getInternalTerminationDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition <em>Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Deferred Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition
	 * @generated
	 */
	EClass getInternalStrongAbortDeferredTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#getCondition()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#getCount_delay()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#isImmediate()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition#getEffect()
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition <em>Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition
	 * @generated
	 */
	EClass getInternalTerminationHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#getCondition()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#getCount_delay()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#isDeepHistory()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#isImmediate()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition#getEffect()
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition <em>Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition
	 * @generated
	 */
	EClass getInternalStrongAbortHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#getCondition()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#getCount_delay()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#isDeepHistory()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#isImmediate()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition#getEffect()
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition <em>Deferred History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition
	 * @generated
	 */
	EClass getInternalDeferredHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#getCondition()
	 * @see #getInternalDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#getCount_delay()
	 * @see #getInternalDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#isDeepHistory()
	 * @see #getInternalDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#isImmediate()
	 * @see #getInternalDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredHistoryTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition#getEffect()
	 * @see #getInternalDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalDeferredHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition <em>Strong Abort Deferred History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Deferred History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition
	 * @generated
	 */
	EClass getInternalStrongAbortDeferredHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#getCondition()
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#getCount_delay()
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#isDeepHistory()
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#isImmediate()
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredHistoryTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition#getEffect()
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalStrongAbortDeferredHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition <em>Termination Deferred History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Deferred History Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition
	 * @generated
	 */
	EClass getInternalTerminationDeferredHistoryTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#getCondition()
	 * @see #getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredHistoryTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#getCount_delay <em>Count delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count delay</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#getCount_delay()
	 * @see #getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredHistoryTransition_Count_delay();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#isDeepHistory <em>Deep History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deep History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#isDeepHistory()
	 * @see #getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredHistoryTransition_DeepHistory();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#isImmediate()
	 * @see #getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredHistoryTransition_Immediate();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition#getEffect()
	 * @see #getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 */
	EAttribute getInternalTerminationDeferredHistoryTransition_Effect();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart <em>SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart
	 * @generated
	 */
	EClass getInternalSCChart();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart#getName()
	 * @see #getInternalSCChart()
	 * @generated
	 */
	EAttribute getInternalSCChart_Name();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSCChart__GetContainmentConstraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalFactory getInternalFactory();

} //InternalPackage
