/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import graphmodel.impl.EdgeImpl;

import info.scce.cinco.product.scchart.scchart.CircuitConnecter;
import info.scce.cinco.product.scchart.scchart.Connection;
import info.scce.cinco.product.scchart.scchart.Input;
import info.scce.cinco.product.scchart.scchart.Operator;
import info.scce.cinco.product.scchart.scchart.Output;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.scchart.internal.InternalConnection;

import info.scce.cinco.product.scchart.scchart.views.ConnectionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectionImpl extends EdgeImpl implements Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnection getInternalConnection() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalConnection) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyConnection() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteFunction() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteEvent() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart getRootElement() {
		return (info.scce.cinco.product.scchart.scchart.SCChart) this.getInternalElement().getRootElement().getElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSourceElement() {
		return(graphmodel.Node)super.getSourceElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTargetElement() {
		return(graphmodel.Node)super.getTargetElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Operator source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Operator source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final CircuitConnecter source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final CircuitConnecter source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final RootState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final RootState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Input source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Input source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Operator target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Operator target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final CircuitConnecter target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final CircuitConnecter target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Output target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Output target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionView getConnectionView() {
		ConnectionView connectionView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createConnectionView();
		connectionView.setInternalConnection((info.scce.cinco.product.scchart.scchart.internal.InternalConnection)getInternalElement());
		return connectionView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.CONNECTION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.CONNECTION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.CONNECTION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.CONNECTION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.CONNECTION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.CONNECTION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.CONNECTION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.CONNECTION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.CONNECTION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.CONNECTION___PRE_DELETE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScchartPackage.CONNECTION___GET_INTERNAL_CONNECTION:
				return getInternalConnection();
			case ScchartPackage.CONNECTION___IS_EXACTLY_CONNECTION:
				return isExactlyConnection();
			case ScchartPackage.CONNECTION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.CONNECTION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.CONNECTION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.CONNECTION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.CONNECTION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.CONNECTION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.CONNECTION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.CONNECTION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.CONNECTION___CAN_RECONNECT_SOURCE__OPERATOR:
				return canReconnectSource((Operator)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_SOURCE__OPERATOR:
				reconnectSource((Operator)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___CAN_RECONNECT_SOURCE__CIRCUITCONNECTER:
				return canReconnectSource((CircuitConnecter)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_SOURCE__CIRCUITCONNECTER:
				reconnectSource((CircuitConnecter)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___CAN_RECONNECT_SOURCE__INPUT:
				return canReconnectSource((Input)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_SOURCE__INPUT:
				reconnectSource((Input)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___CAN_RECONNECT_TARGET__OPERATOR:
				return canReconnectTarget((Operator)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_TARGET__OPERATOR:
				reconnectTarget((Operator)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___CAN_RECONNECT_TARGET__CIRCUITCONNECTER:
				return canReconnectTarget((CircuitConnecter)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_TARGET__CIRCUITCONNECTER:
				reconnectTarget((CircuitConnecter)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___CAN_RECONNECT_TARGET__OUTPUT:
				return canReconnectTarget((Output)arguments.get(0));
			case ScchartPackage.CONNECTION___RECONNECT_TARGET__OUTPUT:
				reconnectTarget((Output)arguments.get(0));
				return null;
			case ScchartPackage.CONNECTION___GET_CONNECTION_VIEW:
				return getConnectionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectionImpl
