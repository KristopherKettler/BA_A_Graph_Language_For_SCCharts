/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strong Abort Deferred History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredHistoryTransitionViewImpl#getInternalStrongAbortDeferredHistoryTransition <em>Internal Strong Abort Deferred History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongAbortDeferredHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements StrongAbortDeferredHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalStrongAbortDeferredHistoryTransition() <em>Internal Strong Abort Deferred History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalStrongAbortDeferredHistoryTransition internalStrongAbortDeferredHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortDeferredHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortDeferredHistoryTransition getInternalStrongAbortDeferredHistoryTransition() {
		if (internalStrongAbortDeferredHistoryTransition != null && internalStrongAbortDeferredHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalStrongAbortDeferredHistoryTransition = (InternalEObject)internalStrongAbortDeferredHistoryTransition;
			internalStrongAbortDeferredHistoryTransition = (InternalStrongAbortDeferredHistoryTransition)eResolveProxy(oldInternalStrongAbortDeferredHistoryTransition);
			if (internalStrongAbortDeferredHistoryTransition != oldInternalStrongAbortDeferredHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION, oldInternalStrongAbortDeferredHistoryTransition, internalStrongAbortDeferredHistoryTransition));
			}
		}
		return internalStrongAbortDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStrongAbortDeferredHistoryTransition basicGetInternalStrongAbortDeferredHistoryTransition() {
		return internalStrongAbortDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStrongAbortDeferredHistoryTransition(InternalStrongAbortDeferredHistoryTransition newInternalStrongAbortDeferredHistoryTransition) {
		InternalStrongAbortDeferredHistoryTransition oldInternalStrongAbortDeferredHistoryTransition = internalStrongAbortDeferredHistoryTransition;
		internalStrongAbortDeferredHistoryTransition = newInternalStrongAbortDeferredHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION, oldInternalStrongAbortDeferredHistoryTransition, internalStrongAbortDeferredHistoryTransition));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION:
				if (resolve) return getInternalStrongAbortDeferredHistoryTransition();
				return basicGetInternalStrongAbortDeferredHistoryTransition();
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION:
				setInternalStrongAbortDeferredHistoryTransition((InternalStrongAbortDeferredHistoryTransition)newValue);
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION:
				setInternalStrongAbortDeferredHistoryTransition((InternalStrongAbortDeferredHistoryTransition)null);
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION:
				return internalStrongAbortDeferredHistoryTransition != null;
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE:
				return isImmediate();
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN:
				setImmediate((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.STRONG_ABORT_DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StrongAbortDeferredHistoryTransitionViewImpl
