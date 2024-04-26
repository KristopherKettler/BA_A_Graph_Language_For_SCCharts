/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortHistoryTransition;

import info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortHistoryTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Strong Abort History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortHistoryTransitionViewImpl#getInternalImmediateStrongAbortHistoryTransition <em>Internal Immediate Strong Abort History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateStrongAbortHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements ImmediateStrongAbortHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateStrongAbortHistoryTransition() <em>Internal Immediate Strong Abort History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateStrongAbortHistoryTransition internalImmediateStrongAbortHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateStrongAbortHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateStrongAbortHistoryTransition getInternalImmediateStrongAbortHistoryTransition() {
		if (internalImmediateStrongAbortHistoryTransition != null && internalImmediateStrongAbortHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateStrongAbortHistoryTransition = (InternalEObject)internalImmediateStrongAbortHistoryTransition;
			internalImmediateStrongAbortHistoryTransition = (InternalImmediateStrongAbortHistoryTransition)eResolveProxy(oldInternalImmediateStrongAbortHistoryTransition);
			if (internalImmediateStrongAbortHistoryTransition != oldInternalImmediateStrongAbortHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION, oldInternalImmediateStrongAbortHistoryTransition, internalImmediateStrongAbortHistoryTransition));
			}
		}
		return internalImmediateStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateStrongAbortHistoryTransition basicGetInternalImmediateStrongAbortHistoryTransition() {
		return internalImmediateStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateStrongAbortHistoryTransition(InternalImmediateStrongAbortHistoryTransition newInternalImmediateStrongAbortHistoryTransition) {
		InternalImmediateStrongAbortHistoryTransition oldInternalImmediateStrongAbortHistoryTransition = internalImmediateStrongAbortHistoryTransition;
		internalImmediateStrongAbortHistoryTransition = newInternalImmediateStrongAbortHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION, oldInternalImmediateStrongAbortHistoryTransition, internalImmediateStrongAbortHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateStrongAbortHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalImmediateStrongAbortHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalImmediateStrongAbortHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateStrongAbortHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setEffect(_arg);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION:
				if (resolve) return getInternalImmediateStrongAbortHistoryTransition();
				return basicGetInternalImmediateStrongAbortHistoryTransition();
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION:
				setInternalImmediateStrongAbortHistoryTransition((InternalImmediateStrongAbortHistoryTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION:
				setInternalImmediateStrongAbortHistoryTransition((InternalImmediateStrongAbortHistoryTransition)null);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION:
				return internalImmediateStrongAbortHistoryTransition != null;
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateStrongAbortHistoryTransitionViewImpl
