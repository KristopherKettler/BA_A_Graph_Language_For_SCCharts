/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationDeferredTransitionViewImpl#getInternalTerminationDeferredTransition <em>Internal Termination Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminationDeferredTransitionViewImpl extends AbstractTransitionViewImpl implements TerminationDeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalTerminationDeferredTransition() <em>Internal Termination Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTerminationDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTerminationDeferredTransition internalTerminationDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationDeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TERMINATION_DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationDeferredTransition getInternalTerminationDeferredTransition() {
		if (internalTerminationDeferredTransition != null && internalTerminationDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalTerminationDeferredTransition = (InternalEObject)internalTerminationDeferredTransition;
			internalTerminationDeferredTransition = (InternalTerminationDeferredTransition)eResolveProxy(oldInternalTerminationDeferredTransition);
			if (internalTerminationDeferredTransition != oldInternalTerminationDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION, oldInternalTerminationDeferredTransition, internalTerminationDeferredTransition));
			}
		}
		return internalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTerminationDeferredTransition basicGetInternalTerminationDeferredTransition() {
		return internalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTerminationDeferredTransition(InternalTerminationDeferredTransition newInternalTerminationDeferredTransition) {
		InternalTerminationDeferredTransition oldInternalTerminationDeferredTransition = internalTerminationDeferredTransition;
		internalTerminationDeferredTransition = newInternalTerminationDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION, oldInternalTerminationDeferredTransition, internalTerminationDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalTerminationDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalTerminationDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalTerminationDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalTerminationDeferredTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalTerminationDeferredTransition().getElement().transact("Set Count_delay", () -> {
			getInternalTerminationDeferredTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate() {
		return getInternalTerminationDeferredTransition().isImmediate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate(final boolean _arg) {
		getInternalTerminationDeferredTransition().getElement().transact("Set Immediate", () -> {
			getInternalTerminationDeferredTransition().setImmediate(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalTerminationDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalTerminationDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalTerminationDeferredTransition().setEffect(_arg);
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
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION:
				if (resolve) return getInternalTerminationDeferredTransition();
				return basicGetInternalTerminationDeferredTransition();
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
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION:
				setInternalTerminationDeferredTransition((InternalTerminationDeferredTransition)newValue);
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
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION:
				setInternalTerminationDeferredTransition((InternalTerminationDeferredTransition)null);
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
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFERRED_TRANSITION:
				return internalTerminationDeferredTransition != null;
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
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___IS_IMMEDIATE:
				return isImmediate();
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN:
				setImmediate((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.TERMINATION_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminationDeferredTransitionViewImpl
