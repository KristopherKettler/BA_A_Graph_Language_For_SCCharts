/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalOperator;

import info.scce.cinco.product.scchart.scchart.views.OperatorView;
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
 * An implementation of the model object '<em><b>Operator View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.OperatorViewImpl#getInternalOperator <em>Internal Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorViewImpl extends EObjectImpl implements OperatorView {
	/**
	 * The cached value of the '{@link #getInternalOperator() <em>Internal Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalOperator()
	 * @generated
	 * @ordered
	 */
	protected InternalOperator internalOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.OPERATOR_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalOperator getInternalOperator() {
		if (internalOperator != null && internalOperator.eIsProxy()) {
			InternalEObject oldInternalOperator = (InternalEObject)internalOperator;
			internalOperator = (InternalOperator)eResolveProxy(oldInternalOperator);
			if (internalOperator != oldInternalOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.OPERATOR_VIEW__INTERNAL_OPERATOR, oldInternalOperator, internalOperator));
			}
		}
		return internalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOperator basicGetInternalOperator() {
		return internalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalOperator(InternalOperator newInternalOperator) {
		InternalOperator oldInternalOperator = internalOperator;
		internalOperator = newInternalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.OPERATOR_VIEW__INTERNAL_OPERATOR, oldInternalOperator, internalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return getInternalOperator().getOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(final String _arg) {
		getInternalOperator().getElement().transact("Set Operator", () -> {
			getInternalOperator().setOperator(_arg);
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
			case ViewsPackage.OPERATOR_VIEW__INTERNAL_OPERATOR:
				if (resolve) return getInternalOperator();
				return basicGetInternalOperator();
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
			case ViewsPackage.OPERATOR_VIEW__INTERNAL_OPERATOR:
				setInternalOperator((InternalOperator)newValue);
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
			case ViewsPackage.OPERATOR_VIEW__INTERNAL_OPERATOR:
				setInternalOperator((InternalOperator)null);
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
			case ViewsPackage.OPERATOR_VIEW__INTERNAL_OPERATOR:
				return internalOperator != null;
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
			case ViewsPackage.OPERATOR_VIEW___GET_OPERATOR:
				return getOperator();
			case ViewsPackage.OPERATOR_VIEW___SET_OPERATOR__STRING:
				setOperator((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorViewImpl
