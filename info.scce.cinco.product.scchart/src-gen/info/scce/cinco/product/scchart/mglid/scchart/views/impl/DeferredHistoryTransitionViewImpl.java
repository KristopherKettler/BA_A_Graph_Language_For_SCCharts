/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.DeferredHistoryTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deferred History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredHistoryTransitionViewImpl#getInternalDeferredHistoryTransition <em>Internal Deferred History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeferredHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements DeferredHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalDeferredHistoryTransition() <em>Internal Deferred History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDeferredHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalDeferredHistoryTransition internalDeferredHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferredHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DEFERRED_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeferredHistoryTransition getInternalDeferredHistoryTransition() {
		if (internalDeferredHistoryTransition != null && internalDeferredHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalDeferredHistoryTransition = (InternalEObject)internalDeferredHistoryTransition;
			internalDeferredHistoryTransition = (InternalDeferredHistoryTransition)eResolveProxy(oldInternalDeferredHistoryTransition);
			if (internalDeferredHistoryTransition != oldInternalDeferredHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION, oldInternalDeferredHistoryTransition, internalDeferredHistoryTransition));
			}
		}
		return internalDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDeferredHistoryTransition basicGetInternalDeferredHistoryTransition() {
		return internalDeferredHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDeferredHistoryTransition(InternalDeferredHistoryTransition newInternalDeferredHistoryTransition) {
		InternalDeferredHistoryTransition oldInternalDeferredHistoryTransition = internalDeferredHistoryTransition;
		internalDeferredHistoryTransition = newInternalDeferredHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION, oldInternalDeferredHistoryTransition, internalDeferredHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalDeferredHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalDeferredHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalDeferredHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalDeferredHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalDeferredHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalDeferredHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalDeferredHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalDeferredHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalDeferredHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate() {
		return getInternalDeferredHistoryTransition().isImmediate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate(final boolean _arg) {
		getInternalDeferredHistoryTransition().getElement().transact("Set Immediate", () -> {
			getInternalDeferredHistoryTransition().setImmediate(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalDeferredHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalDeferredHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalDeferredHistoryTransition().setEffect(_arg);
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
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION:
				if (resolve) return getInternalDeferredHistoryTransition();
				return basicGetInternalDeferredHistoryTransition();
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
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION:
				setInternalDeferredHistoryTransition((InternalDeferredHistoryTransition)newValue);
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
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION:
				setInternalDeferredHistoryTransition((InternalDeferredHistoryTransition)null);
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
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW__INTERNAL_DEFERRED_HISTORY_TRANSITION:
				return internalDeferredHistoryTransition != null;
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
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE:
				return isImmediate();
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN:
				setImmediate((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.DEFERRED_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeferredHistoryTransitionViewImpl
