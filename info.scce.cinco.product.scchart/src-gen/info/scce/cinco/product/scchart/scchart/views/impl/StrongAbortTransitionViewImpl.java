/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition;

import info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strong Abort Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.StrongAbortTransitionViewImpl#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongAbortTransitionViewImpl extends AbstractTransitionViewImpl implements StrongAbortTransitionView {
	/**
	 * The cached value of the '{@link #getInternalStrongAbortTransition() <em>Internal Strong Abort Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalStrongAbortTransition internalStrongAbortTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.STRONG_ABORT_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortTransition getInternalStrongAbortTransition() {
		if (internalStrongAbortTransition != null && internalStrongAbortTransition.eIsProxy()) {
			InternalEObject oldInternalStrongAbortTransition = (InternalEObject)internalStrongAbortTransition;
			internalStrongAbortTransition = (InternalStrongAbortTransition)eResolveProxy(oldInternalStrongAbortTransition);
			if (internalStrongAbortTransition != oldInternalStrongAbortTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION, oldInternalStrongAbortTransition, internalStrongAbortTransition));
			}
		}
		return internalStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStrongAbortTransition basicGetInternalStrongAbortTransition() {
		return internalStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStrongAbortTransition(InternalStrongAbortTransition newInternalStrongAbortTransition) {
		InternalStrongAbortTransition oldInternalStrongAbortTransition = internalStrongAbortTransition;
		internalStrongAbortTransition = newInternalStrongAbortTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION, oldInternalStrongAbortTransition, internalStrongAbortTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalStrongAbortTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalStrongAbortTransition().getElement().transact("Set Condition", () -> {
			getInternalStrongAbortTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalStrongAbortTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalStrongAbortTransition().getElement().transact("Set Count_delay", () -> {
			getInternalStrongAbortTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalStrongAbortTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalStrongAbortTransition().getElement().transact("Set Effect", () -> {
			getInternalStrongAbortTransition().setEffect(_arg);
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				if (resolve) return getInternalStrongAbortTransition();
				return basicGetInternalStrongAbortTransition();
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				setInternalStrongAbortTransition((InternalStrongAbortTransition)newValue);
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				setInternalStrongAbortTransition((InternalStrongAbortTransition)null);
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				return internalStrongAbortTransition != null;
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StrongAbortTransitionViewImpl
