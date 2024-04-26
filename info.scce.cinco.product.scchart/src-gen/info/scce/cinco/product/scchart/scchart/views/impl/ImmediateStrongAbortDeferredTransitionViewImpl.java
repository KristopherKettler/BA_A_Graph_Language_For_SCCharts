/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition;

import info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Strong Abort Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateStrongAbortDeferredTransitionViewImpl#getInternalImmediateStrongAbortDeferredTransition <em>Internal Immediate Strong Abort Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateStrongAbortDeferredTransitionViewImpl extends AbstractTransitionViewImpl implements ImmediateStrongAbortDeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateStrongAbortDeferredTransition() <em>Internal Immediate Strong Abort Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateStrongAbortDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateStrongAbortDeferredTransition internalImmediateStrongAbortDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateStrongAbortDeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateStrongAbortDeferredTransition getInternalImmediateStrongAbortDeferredTransition() {
		if (internalImmediateStrongAbortDeferredTransition != null && internalImmediateStrongAbortDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateStrongAbortDeferredTransition = (InternalEObject)internalImmediateStrongAbortDeferredTransition;
			internalImmediateStrongAbortDeferredTransition = (InternalImmediateStrongAbortDeferredTransition)eResolveProxy(oldInternalImmediateStrongAbortDeferredTransition);
			if (internalImmediateStrongAbortDeferredTransition != oldInternalImmediateStrongAbortDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION, oldInternalImmediateStrongAbortDeferredTransition, internalImmediateStrongAbortDeferredTransition));
			}
		}
		return internalImmediateStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateStrongAbortDeferredTransition basicGetInternalImmediateStrongAbortDeferredTransition() {
		return internalImmediateStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateStrongAbortDeferredTransition(InternalImmediateStrongAbortDeferredTransition newInternalImmediateStrongAbortDeferredTransition) {
		InternalImmediateStrongAbortDeferredTransition oldInternalImmediateStrongAbortDeferredTransition = internalImmediateStrongAbortDeferredTransition;
		internalImmediateStrongAbortDeferredTransition = newInternalImmediateStrongAbortDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION, oldInternalImmediateStrongAbortDeferredTransition, internalImmediateStrongAbortDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateStrongAbortDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateStrongAbortDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateStrongAbortDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalImmediateStrongAbortDeferredTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalImmediateStrongAbortDeferredTransition().getElement().transact("Set Count_delay", () -> {
			getInternalImmediateStrongAbortDeferredTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateStrongAbortDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateStrongAbortDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateStrongAbortDeferredTransition().setEffect(_arg);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION:
				if (resolve) return getInternalImmediateStrongAbortDeferredTransition();
				return basicGetInternalImmediateStrongAbortDeferredTransition();
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION:
				setInternalImmediateStrongAbortDeferredTransition((InternalImmediateStrongAbortDeferredTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION:
				setInternalImmediateStrongAbortDeferredTransition((InternalImmediateStrongAbortDeferredTransition)null);
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION:
				return internalImmediateStrongAbortDeferredTransition != null;
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
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateStrongAbortDeferredTransitionViewImpl
