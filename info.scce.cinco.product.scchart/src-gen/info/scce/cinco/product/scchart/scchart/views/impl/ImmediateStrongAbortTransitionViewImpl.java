/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortTransition;

import info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Strong Abort Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortTransitionViewImpl#getInternalImmediateStrongAbortTransition <em>Internal Immediate Strong Abort Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateStrongAbortTransitionViewImpl extends AbstractTransitionViewImpl implements ImmediateStrongAbortTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateStrongAbortTransition() <em>Internal Immediate Strong Abort Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateStrongAbortTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateStrongAbortTransition internalImmediateStrongAbortTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateStrongAbortTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateStrongAbortTransition getInternalImmediateStrongAbortTransition() {
		if (internalImmediateStrongAbortTransition != null && internalImmediateStrongAbortTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateStrongAbortTransition = (InternalEObject)internalImmediateStrongAbortTransition;
			internalImmediateStrongAbortTransition = (InternalImmediateStrongAbortTransition)eResolveProxy(oldInternalImmediateStrongAbortTransition);
			if (internalImmediateStrongAbortTransition != oldInternalImmediateStrongAbortTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION, oldInternalImmediateStrongAbortTransition, internalImmediateStrongAbortTransition));
			}
		}
		return internalImmediateStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateStrongAbortTransition basicGetInternalImmediateStrongAbortTransition() {
		return internalImmediateStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateStrongAbortTransition(InternalImmediateStrongAbortTransition newInternalImmediateStrongAbortTransition) {
		InternalImmediateStrongAbortTransition oldInternalImmediateStrongAbortTransition = internalImmediateStrongAbortTransition;
		internalImmediateStrongAbortTransition = newInternalImmediateStrongAbortTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION, oldInternalImmediateStrongAbortTransition, internalImmediateStrongAbortTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateStrongAbortTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateStrongAbortTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateStrongAbortTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalImmediateStrongAbortTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalImmediateStrongAbortTransition().getElement().transact("Set Count_delay", () -> {
			getInternalImmediateStrongAbortTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateStrongAbortTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateStrongAbortTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateStrongAbortTransition().setEffect(_arg);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION:
				if (resolve) return getInternalImmediateStrongAbortTransition();
				return basicGetInternalImmediateStrongAbortTransition();
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION:
				setInternalImmediateStrongAbortTransition((InternalImmediateStrongAbortTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION:
				setInternalImmediateStrongAbortTransition((InternalImmediateStrongAbortTransition)null);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION:
				return internalImmediateStrongAbortTransition != null;
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateStrongAbortTransitionViewImpl
