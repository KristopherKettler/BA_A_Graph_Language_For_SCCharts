/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition;

import info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.AbstractTransitionViewImpl#getInternalAbstractTransition <em>Internal Abstract Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTransitionViewImpl extends EObjectImpl implements AbstractTransitionView {
	/**
	 * The cached value of the '{@link #getInternalAbstractTransition() <em>Internal Abstract Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalAbstractTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalAbstractTransition internalAbstractTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ABSTRACT_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAbstractTransition getInternalAbstractTransition() {
		if (internalAbstractTransition != null && internalAbstractTransition.eIsProxy()) {
			InternalEObject oldInternalAbstractTransition = (InternalEObject)internalAbstractTransition;
			internalAbstractTransition = (InternalAbstractTransition)eResolveProxy(oldInternalAbstractTransition);
			if (internalAbstractTransition != oldInternalAbstractTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION, oldInternalAbstractTransition, internalAbstractTransition));
			}
		}
		return internalAbstractTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAbstractTransition basicGetInternalAbstractTransition() {
		return internalAbstractTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalAbstractTransition(InternalAbstractTransition newInternalAbstractTransition) {
		InternalAbstractTransition oldInternalAbstractTransition = internalAbstractTransition;
		internalAbstractTransition = newInternalAbstractTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION, oldInternalAbstractTransition, internalAbstractTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return getInternalAbstractTransition().getPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(final String _arg) {
		getInternalAbstractTransition().getElement().transact("Set Priority", () -> {
			getInternalAbstractTransition().setPriority(_arg);
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
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION:
				if (resolve) return getInternalAbstractTransition();
				return basicGetInternalAbstractTransition();
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
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION:
				setInternalAbstractTransition((InternalAbstractTransition)newValue);
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
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION:
				setInternalAbstractTransition((InternalAbstractTransition)null);
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
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW__INTERNAL_ABSTRACT_TRANSITION:
				return internalAbstractTransition != null;
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
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW___GET_PRIORITY:
				return getPriority();
			case ViewsPackage.ABSTRACT_TRANSITION_VIEW___SET_PRIORITY__STRING:
				setPriority((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractTransitionViewImpl
