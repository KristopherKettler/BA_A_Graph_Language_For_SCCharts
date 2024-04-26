/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalInput;

import info.scce.cinco.product.scchart.scchart.views.InputView;
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
 * An implementation of the model object '<em><b>Input View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.InputViewImpl#getInternalInput <em>Internal Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputViewImpl extends EObjectImpl implements InputView {
	/**
	 * The cached value of the '{@link #getInternalInput() <em>Internal Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInput()
	 * @generated
	 * @ordered
	 */
	protected InternalInput internalInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INPUT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInput getInternalInput() {
		if (internalInput != null && internalInput.eIsProxy()) {
			InternalEObject oldInternalInput = (InternalEObject)internalInput;
			internalInput = (InternalInput)eResolveProxy(oldInternalInput);
			if (internalInput != oldInternalInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INPUT_VIEW__INTERNAL_INPUT, oldInternalInput, internalInput));
			}
		}
		return internalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInput basicGetInternalInput() {
		return internalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInput(InternalInput newInternalInput) {
		InternalInput oldInternalInput = internalInput;
		internalInput = newInternalInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INPUT_VIEW__INTERNAL_INPUT, oldInternalInput, internalInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalInput().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalInput().getElement().transact("Set Label", () -> {
			getInternalInput().setLabel(_arg);
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				if (resolve) return getInternalInput();
				return basicGetInternalInput();
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				setInternalInput((InternalInput)newValue);
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				setInternalInput((InternalInput)null);
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				return internalInput != null;
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
			case ViewsPackage.INPUT_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.INPUT_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InputViewImpl
