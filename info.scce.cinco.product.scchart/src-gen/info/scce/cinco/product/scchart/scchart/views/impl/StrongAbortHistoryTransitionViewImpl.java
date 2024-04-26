/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortHistoryTransition;

import info.scce.cinco.product.scchart.scchart.views.StrongAbortHistoryTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strong Abort History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortHistoryTransitionViewImpl#getInternalStrongAbortHistoryTransition <em>Internal Strong Abort History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongAbortHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements StrongAbortHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalStrongAbortHistoryTransition() <em>Internal Strong Abort History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStrongAbortHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalStrongAbortHistoryTransition internalStrongAbortHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.STRONG_ABORT_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortHistoryTransition getInternalStrongAbortHistoryTransition() {
		if (internalStrongAbortHistoryTransition != null && internalStrongAbortHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalStrongAbortHistoryTransition = (InternalEObject)internalStrongAbortHistoryTransition;
			internalStrongAbortHistoryTransition = (InternalStrongAbortHistoryTransition)eResolveProxy(oldInternalStrongAbortHistoryTransition);
			if (internalStrongAbortHistoryTransition != oldInternalStrongAbortHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION, oldInternalStrongAbortHistoryTransition, internalStrongAbortHistoryTransition));
			}
		}
		return internalStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStrongAbortHistoryTransition basicGetInternalStrongAbortHistoryTransition() {
		return internalStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStrongAbortHistoryTransition(InternalStrongAbortHistoryTransition newInternalStrongAbortHistoryTransition) {
		InternalStrongAbortHistoryTransition oldInternalStrongAbortHistoryTransition = internalStrongAbortHistoryTransition;
		internalStrongAbortHistoryTransition = newInternalStrongAbortHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION, oldInternalStrongAbortHistoryTransition, internalStrongAbortHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalStrongAbortHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalStrongAbortHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalStrongAbortHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalStrongAbortHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalStrongAbortHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalStrongAbortHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalStrongAbortHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalStrongAbortHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalStrongAbortHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalStrongAbortHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalStrongAbortHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalStrongAbortHistoryTransition().setEffect(_arg);
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
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION:
				if (resolve) return getInternalStrongAbortHistoryTransition();
				return basicGetInternalStrongAbortHistoryTransition();
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
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION:
				setInternalStrongAbortHistoryTransition((InternalStrongAbortHistoryTransition)newValue);
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
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION:
				setInternalStrongAbortHistoryTransition((InternalStrongAbortHistoryTransition)null);
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
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_HISTORY_TRANSITION:
				return internalStrongAbortHistoryTransition != null;
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
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StrongAbortHistoryTransitionViewImpl
