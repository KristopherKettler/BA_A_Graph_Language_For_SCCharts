/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strong Abort Deferred History Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StrongAbortDeferredHistoryTransitionImpl extends AbstractTransitionImpl implements StrongAbortDeferredHistoryTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortDeferredHistoryTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getStrongAbortDeferredHistoryTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalStrongAbortDeferredHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalStrongAbortDeferredHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalStrongAbortDeferredHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalStrongAbortDeferredHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalStrongAbortDeferredHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalStrongAbortDeferredHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalStrongAbortDeferredHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalStrongAbortDeferredHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalStrongAbortDeferredHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate() {
		return getInternalStrongAbortDeferredHistoryTransition().isImmediate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate(final boolean _arg) {
		getInternalStrongAbortDeferredHistoryTransition().getElement().transact("Set Immediate", () -> {
			getInternalStrongAbortDeferredHistoryTransition().setImmediate(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalStrongAbortDeferredHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalStrongAbortDeferredHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalStrongAbortDeferredHistoryTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortDeferredHistoryTransition getInternalStrongAbortDeferredHistoryTransition() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyStrongAbortDeferredHistoryTransition() {
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
		return (info.scce.cinco.product.scchart.mglid.scchart.SCChart) this.getInternalElement().getRootElement().getElement();
		
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
	public boolean canReconnectSource(final FinalSCChartReferece source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final FinalSCChartReferece source) {
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
	public boolean canReconnectSource(final InitialFinalSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitialFinalSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final InitialSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitialSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SCChartReferece source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SCChartReferece source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final InitialFinalSCChartReferece source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitialFinalSCChartReferece source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final InitialSCChartReferece source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitialSCChartReferece source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final FinalSCChartReferece target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final FinalSCChartReferece target) {
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
	public boolean canReconnectTarget(final InitialFinalSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitialFinalSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitialSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitialSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SCChartReferece target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SCChartReferece target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitialFinalSCChartReferece target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitialFinalSCChartReferece target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitialSCChartReferece target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitialSCChartReferece target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransitionView getStrongAbortDeferredHistoryTransitionView() {
		StrongAbortDeferredHistoryTransitionView strongAbortDeferredHistoryTransitionView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createStrongAbortDeferredHistoryTransitionView();
		strongAbortDeferredHistoryTransitionView.setInternalStrongAbortDeferredHistoryTransition((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition)getInternalElement());
		return strongAbortDeferredHistoryTransitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_DELETE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AbstractTransition.class) {
			switch (baseOperationID) {
				case ScchartPackage.ABSTRACT_TRANSITION___PRE_DELETE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_DELETE;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_POST_DELETE_FUNCTION: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_POST_DELETE_EVENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_POST_DELETE_EVENT;
				case ScchartPackage.ABSTRACT_TRANSITION___PRE_SAVE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_SAVE;
				case ScchartPackage.ABSTRACT_TRANSITION___POST_SAVE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___POST_SAVE;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_ROOT_ELEMENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_ROOT_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_SOURCE_ELEMENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_SOURCE_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___GET_TARGET_ELEMENT: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_TARGET_ELEMENT;
				case ScchartPackage.ABSTRACT_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE;
				case ScchartPackage.ABSTRACT_TRANSITION___RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__ROOTSTATE;
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
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_CONDITION:
				return getCondition();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_COUNT_DELAY:
				return getCount_delay();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___IS_IMMEDIATE:
				return isImmediate();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_IMMEDIATE__BOOLEAN:
				setImmediate((Boolean)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_EFFECT:
				return getEffect();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION:
				return getInternalStrongAbortDeferredHistoryTransition();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___IS_EXACTLY_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION:
				return isExactlyStrongAbortDeferredHistoryTransition();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__FINALSCCHARTREFERECE:
				return canReconnectSource((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__FINALSCCHARTREFERECE:
				reconnectSource((FinalSCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__SUPERSTATE:
				return canReconnectSource((SuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__SUPERSTATE:
				reconnectSource((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__FINALSUPERSTATE:
				return canReconnectSource((FinalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__FINALSUPERSTATE:
				reconnectSource((FinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__INITIALFINALSUPERSTATE:
				return canReconnectSource((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__INITIALFINALSUPERSTATE:
				reconnectSource((InitialFinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__INITIALSUPERSTATE:
				return canReconnectSource((InitialSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__INITIALSUPERSTATE:
				reconnectSource((InitialSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__SCCHARTREFERECE:
				return canReconnectSource((SCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__SCCHARTREFERECE:
				reconnectSource((SCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__INITIALFINALSCCHARTREFERECE:
				return canReconnectSource((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__INITIALFINALSCCHARTREFERECE:
				reconnectSource((InitialFinalSCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__INITIALSCCHARTREFERECE:
				return canReconnectSource((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_SOURCE__INITIALSCCHARTREFERECE:
				reconnectSource((InitialSCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__FINALSCCHARTREFERECE:
				return canReconnectTarget((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__FINALSCCHARTREFERECE:
				reconnectTarget((FinalSCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__SUPERSTATE:
				return canReconnectTarget((SuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__SUPERSTATE:
				reconnectTarget((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__FINALSUPERSTATE:
				return canReconnectTarget((FinalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__FINALSUPERSTATE:
				reconnectTarget((FinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__INITIALFINALSUPERSTATE:
				return canReconnectTarget((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__INITIALFINALSUPERSTATE:
				reconnectTarget((InitialFinalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__INITIALSUPERSTATE:
				return canReconnectTarget((InitialSuperState)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__INITIALSUPERSTATE:
				reconnectTarget((InitialSuperState)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__SCCHARTREFERECE:
				return canReconnectTarget((SCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__SCCHARTREFERECE:
				reconnectTarget((SCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__INITIALFINALSCCHARTREFERECE:
				return canReconnectTarget((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__INITIALFINALSCCHARTREFERECE:
				reconnectTarget((InitialFinalSCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__INITIALSCCHARTREFERECE:
				return canReconnectTarget((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___RECONNECT_TARGET__INITIALSCCHARTREFERECE:
				reconnectTarget((InitialSCChartReferece)arguments.get(0));
				return null;
			case ScchartPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION___GET_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW:
				return getStrongAbortDeferredHistoryTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StrongAbortDeferredHistoryTransitionImpl
