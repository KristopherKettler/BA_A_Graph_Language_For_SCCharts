/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition;

import info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ConditionalTerminationTransitionViewImpl#getInternalConditionalTerminationTransition <em>Internal Conditional Termination Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalTerminationTransitionViewImpl extends AbstractTransitionViewImpl implements ConditionalTerminationTransitionView {
	/**
	 * The cached value of the '{@link #getInternalConditionalTerminationTransition() <em>Internal Conditional Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConditionalTerminationTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalConditionalTerminationTransition internalConditionalTerminationTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTerminationTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONDITIONAL_TERMINATION_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationTransition getInternalConditionalTerminationTransition() {
		if (internalConditionalTerminationTransition != null && internalConditionalTerminationTransition.eIsProxy()) {
			InternalEObject oldInternalConditionalTerminationTransition = (InternalEObject)internalConditionalTerminationTransition;
			internalConditionalTerminationTransition = (InternalConditionalTerminationTransition)eResolveProxy(oldInternalConditionalTerminationTransition);
			if (internalConditionalTerminationTransition != oldInternalConditionalTerminationTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION, oldInternalConditionalTerminationTransition, internalConditionalTerminationTransition));
			}
		}
		return internalConditionalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConditionalTerminationTransition basicGetInternalConditionalTerminationTransition() {
		return internalConditionalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConditionalTerminationTransition(InternalConditionalTerminationTransition newInternalConditionalTerminationTransition) {
		InternalConditionalTerminationTransition oldInternalConditionalTerminationTransition = internalConditionalTerminationTransition;
		internalConditionalTerminationTransition = newInternalConditionalTerminationTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION, oldInternalConditionalTerminationTransition, internalConditionalTerminationTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalConditionalTerminationTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalConditionalTerminationTransition().getElement().transact("Set Condition", () -> {
			getInternalConditionalTerminationTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalConditionalTerminationTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalConditionalTerminationTransition().getElement().transact("Set Count_delay", () -> {
			getInternalConditionalTerminationTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalConditionalTerminationTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalConditionalTerminationTransition().getElement().transact("Set Effect", () -> {
			getInternalConditionalTerminationTransition().setEffect(_arg);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				if (resolve) return getInternalConditionalTerminationTransition();
				return basicGetInternalConditionalTerminationTransition();
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
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				setInternalConditionalTerminationTransition((InternalConditionalTerminationTransition)newValue);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				setInternalConditionalTerminationTransition((InternalConditionalTerminationTransition)null);
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
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				return internalConditionalTerminationTransition != null;
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
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConditionalTerminationTransitionViewImpl
