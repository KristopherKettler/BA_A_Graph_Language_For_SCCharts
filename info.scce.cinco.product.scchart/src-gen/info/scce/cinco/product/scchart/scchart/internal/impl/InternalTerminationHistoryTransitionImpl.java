/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination History Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationHistoryTransitionImpl#isDeepHistory <em>Deep History</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalTerminationHistoryTransitionImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalTerminationHistoryTransitionImpl extends InternalAbstractTransitionImpl implements InternalTerminationHistoryTransition {
	/**
	 * The default value of the '{@link #isDeepHistory() <em>Deep History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeepHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEEP_HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeepHistory() <em>Deep History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeepHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean deepHistory = DEEP_HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = "<No effect>";

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalTerminationHistoryTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_TERMINATION_HISTORY_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return deepHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(boolean newDeepHistory) {
		boolean oldDeepHistory = deepHistory;
		deepHistory = newDeepHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY, oldDeepHistory, deepHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				return isDeepHistory();
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				return getEffect();
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
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				setDeepHistory((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				setEffect((String)newValue);
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
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				setDeepHistory(DEEP_HISTORY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
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
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				return deepHistory != DEEP_HISTORY_EDEFAULT;
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (deepHistory: ");
		result.append(deepHistory);
		result.append(", effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //InternalTerminationHistoryTransitionImpl
