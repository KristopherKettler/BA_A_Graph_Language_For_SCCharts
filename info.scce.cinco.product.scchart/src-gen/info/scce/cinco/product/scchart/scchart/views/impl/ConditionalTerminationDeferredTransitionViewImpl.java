/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition;

import info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Termination Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationDeferredTransitionViewImpl#getInternalConditionalTerminationDeferredTransition <em>Internal Conditional Termination Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalTerminationDeferredTransitionViewImpl extends AbstractTransitionViewImpl implements ConditionalTerminationDeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalConditionalTerminationDeferredTransition() <em>Internal Conditional Termination Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConditionalTerminationDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalConditionalTerminationDeferredTransition internalConditionalTerminationDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTerminationDeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationDeferredTransition getInternalConditionalTerminationDeferredTransition() {
		if (internalConditionalTerminationDeferredTransition != null && internalConditionalTerminationDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalConditionalTerminationDeferredTransition = (InternalEObject)internalConditionalTerminationDeferredTransition;
			internalConditionalTerminationDeferredTransition = (InternalConditionalTerminationDeferredTransition)eResolveProxy(oldInternalConditionalTerminationDeferredTransition);
			if (internalConditionalTerminationDeferredTransition != oldInternalConditionalTerminationDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION, oldInternalConditionalTerminationDeferredTransition, internalConditionalTerminationDeferredTransition));
			}
		}
		return internalConditionalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConditionalTerminationDeferredTransition basicGetInternalConditionalTerminationDeferredTransition() {
		return internalConditionalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConditionalTerminationDeferredTransition(InternalConditionalTerminationDeferredTransition newInternalConditionalTerminationDeferredTransition) {
		InternalConditionalTerminationDeferredTransition oldInternalConditionalTerminationDeferredTransition = internalConditionalTerminationDeferredTransition;
		internalConditionalTerminationDeferredTransition = newInternalConditionalTerminationDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION, oldInternalConditionalTerminationDeferredTransition, internalConditionalTerminationDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalConditionalTerminationDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalConditionalTerminationDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalConditionalTerminationDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalConditionalTerminationDeferredTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalConditionalTerminationDeferredTransition().getElement().transact("Set Count_delay", () -> {
			getInternalConditionalTerminationDeferredTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalConditionalTerminationDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalConditionalTerminationDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalConditionalTerminationDeferredTransition().setEffect(_arg);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION:
				if (resolve) return getInternalConditionalTerminationDeferredTransition();
				return basicGetInternalConditionalTerminationDeferredTransition();
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
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION:
				setInternalConditionalTerminationDeferredTransition((InternalConditionalTerminationDeferredTransition)newValue);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION:
				setInternalConditionalTerminationDeferredTransition((InternalConditionalTerminationDeferredTransition)null);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION:
				return internalConditionalTerminationDeferredTransition != null;
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
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConditionalTerminationDeferredTransitionViewImpl
