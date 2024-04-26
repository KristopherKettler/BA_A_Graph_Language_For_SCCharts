/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState;

import info.scce.cinco.product.scchart.scchart.views.SimpleStateView;
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
 * An implementation of the model object '<em><b>Simple State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.SimpleStateViewImpl#getInternalSimpleState <em>Internal Simple State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleStateViewImpl extends EObjectImpl implements SimpleStateView {
	/**
	 * The cached value of the '{@link #getInternalSimpleState() <em>Internal Simple State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSimpleState()
	 * @generated
	 * @ordered
	 */
	protected InternalSimpleState internalSimpleState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SIMPLE_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSimpleState getInternalSimpleState() {
		if (internalSimpleState != null && internalSimpleState.eIsProxy()) {
			InternalEObject oldInternalSimpleState = (InternalEObject)internalSimpleState;
			internalSimpleState = (InternalSimpleState)eResolveProxy(oldInternalSimpleState);
			if (internalSimpleState != oldInternalSimpleState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE, oldInternalSimpleState, internalSimpleState));
			}
		}
		return internalSimpleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSimpleState basicGetInternalSimpleState() {
		return internalSimpleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSimpleState(InternalSimpleState newInternalSimpleState) {
		InternalSimpleState oldInternalSimpleState = internalSimpleState;
		internalSimpleState = newInternalSimpleState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE, oldInternalSimpleState, internalSimpleState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSimpleState().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSimpleState().getElement().transact("Set Name", () -> {
			getInternalSimpleState().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSimpleState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSimpleState().getElement().transact("Set Label", () -> {
			getInternalSimpleState().setLabel(_arg);
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
			case ViewsPackage.SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE:
				if (resolve) return getInternalSimpleState();
				return basicGetInternalSimpleState();
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
			case ViewsPackage.SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE:
				setInternalSimpleState((InternalSimpleState)newValue);
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
			case ViewsPackage.SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE:
				setInternalSimpleState((InternalSimpleState)null);
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
			case ViewsPackage.SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE:
				return internalSimpleState != null;
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
			case ViewsPackage.SIMPLE_STATE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SIMPLE_STATE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.SIMPLE_STATE_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.SIMPLE_STATE_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SimpleStateViewImpl
