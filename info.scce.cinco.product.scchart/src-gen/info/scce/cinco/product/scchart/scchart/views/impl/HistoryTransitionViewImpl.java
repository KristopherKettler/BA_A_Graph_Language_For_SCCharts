/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalHistoryTransition;

import info.scce.cinco.product.scchart.scchart.views.HistoryTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.HistoryTransitionViewImpl#getInternalHistoryTransition <em>Internal History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryTransitionViewImpl extends AbstractTransitionViewImpl implements HistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalHistoryTransition() <em>Internal History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalHistoryTransition internalHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalHistoryTransition getInternalHistoryTransition() {
		if (internalHistoryTransition != null && internalHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalHistoryTransition = (InternalEObject)internalHistoryTransition;
			internalHistoryTransition = (InternalHistoryTransition)eResolveProxy(oldInternalHistoryTransition);
			if (internalHistoryTransition != oldInternalHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION, oldInternalHistoryTransition, internalHistoryTransition));
			}
		}
		return internalHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalHistoryTransition basicGetInternalHistoryTransition() {
		return internalHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalHistoryTransition(InternalHistoryTransition newInternalHistoryTransition) {
		InternalHistoryTransition oldInternalHistoryTransition = internalHistoryTransition;
		internalHistoryTransition = newInternalHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION, oldInternalHistoryTransition, internalHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount_delay() {
		return getInternalHistoryTransition().getCount_delay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount_delay(final String _arg) {
		getInternalHistoryTransition().getElement().transact("Set Count_delay", () -> {
			getInternalHistoryTransition().setCount_delay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalHistoryTransition().setEffect(_arg);
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
			case ViewsPackage.HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION:
				if (resolve) return getInternalHistoryTransition();
				return basicGetInternalHistoryTransition();
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
			case ViewsPackage.HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION:
				setInternalHistoryTransition((InternalHistoryTransition)newValue);
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
			case ViewsPackage.HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION:
				setInternalHistoryTransition((InternalHistoryTransition)null);
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
			case ViewsPackage.HISTORY_TRANSITION_VIEW__INTERNAL_HISTORY_TRANSITION:
				return internalHistoryTransition != null;
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
			case ViewsPackage.HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.HISTORY_TRANSITION_VIEW___GET_COUNT_DELAY:
				return getCount_delay();
			case ViewsPackage.HISTORY_TRANSITION_VIEW___SET_COUNT_DELAY__STRING:
				setCount_delay((String)arguments.get(0));
				return null;
			case ViewsPackage.HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //HistoryTransitionViewImpl
