/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.TerminationHistoryTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationHistoryTransitionViewImpl#getInternalTerminationHistoryTransition <em>Internal Termination History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminationHistoryTransitionViewImpl extends AbstractTransitionViewImpl implements TerminationHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalTerminationHistoryTransition() <em>Internal Termination History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTerminationHistoryTransition internalTerminationHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TERMINATION_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationHistoryTransition getInternalTerminationHistoryTransition() {
		if (internalTerminationHistoryTransition != null && internalTerminationHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalTerminationHistoryTransition = (InternalEObject)internalTerminationHistoryTransition;
			internalTerminationHistoryTransition = (InternalTerminationHistoryTransition)eResolveProxy(oldInternalTerminationHistoryTransition);
			if (internalTerminationHistoryTransition != oldInternalTerminationHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION, oldInternalTerminationHistoryTransition, internalTerminationHistoryTransition));
			}
		}
		return internalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTerminationHistoryTransition basicGetInternalTerminationHistoryTransition() {
		return internalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTerminationHistoryTransition(InternalTerminationHistoryTransition newInternalTerminationHistoryTransition) {
		InternalTerminationHistoryTransition oldInternalTerminationHistoryTransition = internalTerminationHistoryTransition;
		internalTerminationHistoryTransition = newInternalTerminationHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION, oldInternalTerminationHistoryTransition, internalTerminationHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalTerminationHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalTerminationHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalTerminationHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalTerminationHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalTerminationHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalTerminationHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalTerminationHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalTerminationHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalTerminationHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate() {
		return getInternalTerminationHistoryTransition().isImmediate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate(final boolean _arg) {
		getInternalTerminationHistoryTransition().getElement().transact("Set Immediate", () -> {
			getInternalTerminationHistoryTransition().setImmediate(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalTerminationHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalTerminationHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalTerminationHistoryTransition().setEffect(_arg);
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
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION:
				if (resolve) return getInternalTerminationHistoryTransition();
				return basicGetInternalTerminationHistoryTransition();
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
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION:
				setInternalTerminationHistoryTransition((InternalTerminationHistoryTransition)newValue);
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
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION:
				setInternalTerminationHistoryTransition((InternalTerminationHistoryTransition)null);
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
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW__INTERNAL_TERMINATION_HISTORY_TRANSITION:
				return internalTerminationHistoryTransition != null;
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
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___IS_IMMEDIATE:
				return isImmediate();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___SET_IMMEDIATE__BOOLEAN:
				setImmediate((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.TERMINATION_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminationHistoryTransitionViewImpl
