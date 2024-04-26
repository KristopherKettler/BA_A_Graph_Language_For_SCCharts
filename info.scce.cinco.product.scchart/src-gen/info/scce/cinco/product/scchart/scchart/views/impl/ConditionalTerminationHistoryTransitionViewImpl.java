/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition;

import info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Termination History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationHistoryTransitionViewImpl#getInternalConditionalTerminationHistoryTransition <em>Internal Conditional Termination History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalTerminationHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements ConditionalTerminationHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalConditionalTerminationHistoryTransition() <em>Internal Conditional Termination History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalConditionalTerminationHistoryTransition internalConditionalTerminationHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTerminationHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationHistoryTransition getInternalConditionalTerminationHistoryTransition() {
		if (internalConditionalTerminationHistoryTransition != null && internalConditionalTerminationHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalConditionalTerminationHistoryTransition = (InternalEObject)internalConditionalTerminationHistoryTransition;
			internalConditionalTerminationHistoryTransition = (InternalConditionalTerminationHistoryTransition)eResolveProxy(oldInternalConditionalTerminationHistoryTransition);
			if (internalConditionalTerminationHistoryTransition != oldInternalConditionalTerminationHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION, oldInternalConditionalTerminationHistoryTransition, internalConditionalTerminationHistoryTransition));
			}
		}
		return internalConditionalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConditionalTerminationHistoryTransition basicGetInternalConditionalTerminationHistoryTransition() {
		return internalConditionalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConditionalTerminationHistoryTransition(InternalConditionalTerminationHistoryTransition newInternalConditionalTerminationHistoryTransition) {
		InternalConditionalTerminationHistoryTransition oldInternalConditionalTerminationHistoryTransition = internalConditionalTerminationHistoryTransition;
		internalConditionalTerminationHistoryTransition = newInternalConditionalTerminationHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION, oldInternalConditionalTerminationHistoryTransition, internalConditionalTerminationHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalConditionalTerminationHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalConditionalTerminationHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalConditionalTerminationHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalConditionalTerminationHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalConditionalTerminationHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalConditionalTerminationHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalConditionalTerminationHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalConditionalTerminationHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalConditionalTerminationHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalConditionalTerminationHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalConditionalTerminationHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalConditionalTerminationHistoryTransition().setEffect(_arg);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION:
				if (resolve) return getInternalConditionalTerminationHistoryTransition();
				return basicGetInternalConditionalTerminationHistoryTransition();
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
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION:
				setInternalConditionalTerminationHistoryTransition((InternalConditionalTerminationHistoryTransition)newValue);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION:
				setInternalConditionalTerminationHistoryTransition((InternalConditionalTerminationHistoryTransition)null);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION:
				return internalConditionalTerminationHistoryTransition != null;
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
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConditionalTerminationHistoryTransitionViewImpl
