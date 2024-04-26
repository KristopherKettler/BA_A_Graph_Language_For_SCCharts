/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import info.scce.cinco.product.scchart.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.scchart.Connector;
import info.scce.cinco.product.scchart.scchart.FinalState;
import info.scce.cinco.product.scchart.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.scchart.InitialState;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.scchart.SimpleState;
import info.scce.cinco.product.scchart.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.scchart.SuperState;

import info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition;

import info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strong Abort Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StrongAbortTransitionImpl extends AbstractTransitionImpl implements StrongAbortTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getStrongAbortTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalStrongAbortTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalStrongAbortTransition().getElement().transact("Set Condition", () -> {
			getInternalStrongAbortTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalStrongAbortTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalStrongAbortTransition().getElement().transact("Set Count_delay", () -> {
			getInternalStrongAbortTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalStrongAbortTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalStrongAbortTransition().getElement().transact("Set Effect", () -> {
			getInternalStrongAbortTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortTransition getInternalStrongAbortTransition() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyStrongAbortTransition() {
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
	public boolean canReconnectSource(final InitilalSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitilalSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final FinalSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final FinalSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitilalSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitilalSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Connector target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Connector target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SimpleState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SimpleState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitialState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitialState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final FinalSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final FinalSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final FinalState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final FinalState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransitionView getStrongAbortTransitionView() {
		StrongAbortTransitionView strongAbortTransitionView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createStrongAbortTransitionView();
		strongAbortTransitionView.setInternalStrongAbortTransition((info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition)getInternalElement());
		return strongAbortTransitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.STRONG_ABORT_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.STRONG_ABORT_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.STRONG_ABORT_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.STRONG_ABORT_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.STRONG_ABORT_TRANSITION___PRE_DELETE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AbstractTransition.class) {
			switch (baseOperationID) {
				case ScchartPackage.ABSTRACT_TRANSITION___PRE_DELETE: return ScchartPackage.STRONG_ABORT_TRANSITION___PRE_DELETE;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_POST_DELETE_FUNCTION: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_POST_DELETE_EVENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_POST_DELETE_EVENT;
				case ScchartPackage.ABSTRACT_TRANSITION___PRE_SAVE: return ScchartPackage.STRONG_ABORT_TRANSITION___PRE_SAVE;
				case ScchartPackage.ABSTRACT_TRANSITION___POST_SAVE: return ScchartPackage.STRONG_ABORT_TRANSITION___POST_SAVE;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_ROOT_ELEMENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_ROOT_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_SOURCE_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_TARGET_ELEMENT: return ScchartPackage.STRONG_ABORT_TRANSITION___GET_TARGET_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE;
				case ScchartPackage.ABSTRACT_TRANSITION___RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_SOURCE__ROOTSTATE;
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
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_CONDITION:
				return getCondition();
			case ScchartPackage.STRONG_ABORT_TRANSITION___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_COUNT_DELAY:
				return getCount_delay();
			case ScchartPackage.STRONG_ABORT_TRANSITION___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_EFFECT:
				return getEffect();
			case ScchartPackage.STRONG_ABORT_TRANSITION___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_INTERNAL_STRONG_ABORT_TRANSITION:
				return getInternalStrongAbortTransition();
			case ScchartPackage.STRONG_ABORT_TRANSITION___IS_EXACTLY_STRONG_ABORT_TRANSITION:
				return isExactlyStrongAbortTransition();
			case ScchartPackage.STRONG_ABORT_TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.STRONG_ABORT_TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUPERSTATE:
				return canReconnectSource((InitilalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_SOURCE__INITILALSUPERSTATE:
				reconnectSource((InitilalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_SOURCE__SUPERSTATE:
				return canReconnectSource((SuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_SOURCE__SUPERSTATE:
				reconnectSource((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_SOURCE__FINALSUPERSTATE:
				return canReconnectSource((FinalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_SOURCE__FINALSUPERSTATE:
				reconnectSource((FinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__INITILALSUPERSTATE:
				return canReconnectTarget((InitilalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__INITILALSUPERSTATE:
				reconnectTarget((InitilalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__CONNECTOR:
				return canReconnectTarget((Connector)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__CONNECTOR:
				reconnectTarget((Connector)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__SUPERSTATE:
				return canReconnectTarget((SuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__SUPERSTATE:
				reconnectTarget((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__SIMPLESTATE:
				return canReconnectTarget((SimpleState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__SIMPLESTATE:
				reconnectTarget((SimpleState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__INITIALSTATE:
				return canReconnectTarget((InitialState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__INITIALSTATE:
				reconnectTarget((InitialState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__FINALSUPERSTATE:
				return canReconnectTarget((FinalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__FINALSUPERSTATE:
				reconnectTarget((FinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___CAN_RECONNECT_TARGET__FINALSTATE:
				return canReconnectTarget((FinalState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_TRANSITION___RECONNECT_TARGET__FINALSTATE:
				reconnectTarget((FinalState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_TRANSITION___GET_STRONG_ABORT_TRANSITION_VIEW:
				return getStrongAbortTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StrongAbortTransitionImpl
