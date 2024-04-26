/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition;

import info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination Defferd Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.TerminationDefferdTransitionViewImpl#getInternalTerminationDefferdTransition <em>Internal Termination Defferd Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminationDefferdTransitionViewImpl extends AbstractTransitionViewImpl implements TerminationDefferdTransitionView {
	/**
	 * The cached value of the '{@link #getInternalTerminationDefferdTransition() <em>Internal Termination Defferd Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTerminationDefferdTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTerminationDefferdTransition internalTerminationDefferdTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationDefferdTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TERMINATION_DEFFERD_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationDefferdTransition getInternalTerminationDefferdTransition() {
		if (internalTerminationDefferdTransition != null && internalTerminationDefferdTransition.eIsProxy()) {
			InternalEObject oldInternalTerminationDefferdTransition = (InternalEObject)internalTerminationDefferdTransition;
			internalTerminationDefferdTransition = (InternalTerminationDefferdTransition)eResolveProxy(oldInternalTerminationDefferdTransition);
			if (internalTerminationDefferdTransition != oldInternalTerminationDefferdTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION, oldInternalTerminationDefferdTransition, internalTerminationDefferdTransition));
			}
		}
		return internalTerminationDefferdTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTerminationDefferdTransition basicGetInternalTerminationDefferdTransition() {
		return internalTerminationDefferdTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTerminationDefferdTransition(InternalTerminationDefferdTransition newInternalTerminationDefferdTransition) {
		InternalTerminationDefferdTransition oldInternalTerminationDefferdTransition = internalTerminationDefferdTransition;
		internalTerminationDefferdTransition = newInternalTerminationDefferdTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION, oldInternalTerminationDefferdTransition, internalTerminationDefferdTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalTerminationDefferdTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalTerminationDefferdTransition().getElement().transact("Set Effect", () -> {
			getInternalTerminationDefferdTransition().setEffect(_arg);
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
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION:
				if (resolve) return getInternalTerminationDefferdTransition();
				return basicGetInternalTerminationDefferdTransition();
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
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION:
				setInternalTerminationDefferdTransition((InternalTerminationDefferdTransition)newValue);
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
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION:
				setInternalTerminationDefferdTransition((InternalTerminationDefferdTransition)null);
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
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW__INTERNAL_TERMINATION_DEFFERD_TRANSITION:
				return internalTerminationDefferdTransition != null;
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
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.TERMINATION_DEFFERD_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminationDefferdTransitionViewImpl
