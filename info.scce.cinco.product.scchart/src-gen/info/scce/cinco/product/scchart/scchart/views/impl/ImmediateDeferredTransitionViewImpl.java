/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition;

import info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ImmediateDeferredTransitionViewImpl#getInternalImmediateDeferredTransition <em>Internal Immediate Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateDeferredTransitionViewImpl extends AbstractTransitionViewImpl implements ImmediateDeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateDeferredTransition() <em>Internal Immediate Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateDeferredTransition internalImmediateDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateDeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateDeferredTransition getInternalImmediateDeferredTransition() {
		if (internalImmediateDeferredTransition != null && internalImmediateDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateDeferredTransition = (InternalEObject)internalImmediateDeferredTransition;
			internalImmediateDeferredTransition = (InternalImmediateDeferredTransition)eResolveProxy(oldInternalImmediateDeferredTransition);
			if (internalImmediateDeferredTransition != oldInternalImmediateDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION, oldInternalImmediateDeferredTransition, internalImmediateDeferredTransition));
			}
		}
		return internalImmediateDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateDeferredTransition basicGetInternalImmediateDeferredTransition() {
		return internalImmediateDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateDeferredTransition(InternalImmediateDeferredTransition newInternalImmediateDeferredTransition) {
		InternalImmediateDeferredTransition oldInternalImmediateDeferredTransition = internalImmediateDeferredTransition;
		internalImmediateDeferredTransition = newInternalImmediateDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION, oldInternalImmediateDeferredTransition, internalImmediateDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalImmediateDeferredTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalImmediateDeferredTransition().getElement().transact("Set Count_delay", () -> {
			getInternalImmediateDeferredTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateDeferredTransition().setEffect(_arg);
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
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION:
				if (resolve) return getInternalImmediateDeferredTransition();
				return basicGetInternalImmediateDeferredTransition();
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
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION:
				setInternalImmediateDeferredTransition((InternalImmediateDeferredTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION:
				setInternalImmediateDeferredTransition((InternalImmediateDeferredTransition)null);
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
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW__INTERNAL_IMMEDIATE_DEFERRED_TRANSITION:
				return internalImmediateDeferredTransition != null;
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
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.IMMEDIATE_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateDeferredTransitionViewImpl
