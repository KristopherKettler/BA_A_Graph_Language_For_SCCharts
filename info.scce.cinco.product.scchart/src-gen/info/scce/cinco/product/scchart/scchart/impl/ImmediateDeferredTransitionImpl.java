/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import info.scce.cinco.product.scchart.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.scchart.SuperState;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition;

import info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Deferred Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImmediateDeferredTransitionImpl extends AbstractTransitionImpl implements ImmediateDeferredTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateDeferredTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getImmediateDeferredTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalImmediateDeferredTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalImmediateDeferredTransition().getElement().transact("Set Count_delay", () -> {
			getInternalImmediateDeferredTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateDeferredTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateDeferredTransition getInternalImmediateDeferredTransition() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyImmediateDeferredTransition() {
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
	public SuperState getTargetElement() {
		return(info.scce.cinco.product.scchart.scchart.SuperState)super.getTargetElement();
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
	public ImmediateDeferredTransitionView getImmediateDeferredTransitionView() {
		ImmediateDeferredTransitionView immediateDeferredTransitionView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createImmediateDeferredTransitionView();
		immediateDeferredTransitionView.setInternalImmediateDeferredTransition((info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition)getInternalElement());
		return immediateDeferredTransitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_DELETE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AbstractTransition.class) {
			switch (baseOperationID) {
				case ScchartPackage.ABSTRACT_TRANSITION___PRE_DELETE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_DELETE;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_POST_DELETE_FUNCTION: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_POST_DELETE_EVENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_POST_DELETE_EVENT;
				case ScchartPackage.ABSTRACT_TRANSITION___PRE_SAVE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_SAVE;
				case ScchartPackage.ABSTRACT_TRANSITION___POST_SAVE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___POST_SAVE;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_ROOT_ELEMENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_ROOT_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_TARGET_ELEMENT: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_TARGET_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE;
				case ScchartPackage.ABSTRACT_TRANSITION___RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_SOURCE__ROOTSTATE;
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
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_CONDITION:
				return getCondition();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_COUNT_DELAY:
				return getCount_delay();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_EFFECT:
				return getEffect();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_INTERNAL_IMMEDIATE_DEFERRED_TRANSITION:
				return getInternalImmediateDeferredTransition();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___IS_EXACTLY_IMMEDIATE_DEFERRED_TRANSITION:
				return isExactlyImmediateDeferredTransition();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUPERSTATE:
				return canReconnectSource((InitilalSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_SOURCE__INITILALSUPERSTATE:
				reconnectSource((InitilalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_SOURCE__SUPERSTATE:
				return canReconnectSource((SuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_SOURCE__SUPERSTATE:
				reconnectSource((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_SOURCE__FINALSUPERSTATE:
				return canReconnectSource((FinalSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_SOURCE__FINALSUPERSTATE:
				reconnectSource((FinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_TARGET__INITILALSUPERSTATE:
				return canReconnectTarget((InitilalSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_TARGET__INITILALSUPERSTATE:
				reconnectTarget((InitilalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_TARGET__SUPERSTATE:
				return canReconnectTarget((SuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_TARGET__SUPERSTATE:
				reconnectTarget((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___CAN_RECONNECT_TARGET__FINALSUPERSTATE:
				return canReconnectTarget((FinalSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___RECONNECT_TARGET__FINALSUPERSTATE:
				reconnectTarget((FinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION___GET_IMMEDIATE_DEFERRED_TRANSITION_VIEW:
				return getImmediateDeferredTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateDeferredTransitionImpl
