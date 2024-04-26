/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredHistoryTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination Deferred History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredHistoryTransitionViewImpl#getInternalTerminationDeferredHistoryTransition <em>Internal Termination Deferred History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminationDeferredHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements TerminationDeferredHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalTerminationDeferredHistoryTransition() <em>Internal Termination Deferred History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTerminationDeferredHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTerminationDeferredHistoryTransition internalTerminationDeferredHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationDeferredHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationDeferredHistoryTransition getInternalTerminationDeferredHistoryTransition() {
		if (internalTerminationDeferredHistoryTransition != null && internalTerminationDeferredHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalTerminationDeferredHistoryTransition = (InternalEObject)internalTerminationDeferredHistoryTransition;
			internalTerminationDeferredHistoryTransition = (InternalTerminationDeferredHistoryTransition)eResolveProxy(oldInternalTerminationDeferredHistoryTransition);
			if (internalTerminationDeferredHistoryTransition != oldInternalTerminationDeferredHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION, oldInternalTerminationDeferredHistoryTransition, internalTerminationDeferredHistoryTransition));
			}
		}
		return internalTerminationDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTerminationDeferredHistoryTransition basicGetInternalTerminationDeferredHistoryTransition() {
		return internalTerminationDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTerminationDeferredHistoryTransition(InternalTerminationDeferredHistoryTransition newInternalTerminationDeferredHistoryTransition) {
		InternalTerminationDeferredHistoryTransition oldInternalTerminationDeferredHistoryTransition = internalTerminationDeferredHistoryTransition;
		internalTerminationDeferredHistoryTransition = newInternalTerminationDeferredHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION, oldInternalTerminationDeferredHistoryTransition, internalTerminationDeferredHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalTerminationDeferredHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalTerminationDeferredHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalTerminationDeferredHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalTerminationDeferredHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalTerminationDeferredHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalTerminationDeferredHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalTerminationDeferredHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalTerminationDeferredHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalTerminationDeferredHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate() {
		return getInternalTerminationDeferredHistoryTransition().isImmediate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate(final boolean _arg) {
		getInternalTerminationDeferredHistoryTransition().getElement().transact("Set Immediate", () -> {
			getInternalTerminationDeferredHistoryTransition().setImmediate(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalTerminationDeferredHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalTerminationDeferredHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalTerminationDeferredHistoryTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION:
				if (resolve) return getInternalTerminationDeferredHistoryTransition();
				return basicGetInternalTerminationDeferredHistoryTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION:
				setInternalTerminationDeferredHistoryTransition((InternalTerminationDeferredHistoryTransition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION:
				setInternalTerminationDeferredHistoryTransition((InternalTerminationDeferredHistoryTransition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_HISTORY_TRANSITION:
				return internalTerminationDeferredHistoryTransition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE:
				return isImmediate();
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN:
				setImmediate((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.TERMINATION_DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminationDeferredHistoryTransitionViewImpl
