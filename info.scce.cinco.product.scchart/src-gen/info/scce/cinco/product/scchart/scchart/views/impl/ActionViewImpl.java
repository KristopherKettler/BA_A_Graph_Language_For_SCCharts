/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalAction;

import info.scce.cinco.product.scchart.scchart.views.ActionView;
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
 * An implementation of the model object '<em><b>Action View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.ActionViewImpl#getInternalAction <em>Internal Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionViewImpl extends EObjectImpl implements ActionView {
	/**
	 * The cached value of the '{@link #getInternalAction() <em>Internal Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalAction()
	 * @generated
	 * @ordered
	 */
	protected InternalAction internalAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ACTION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAction getInternalAction() {
		if (internalAction != null && internalAction.eIsProxy()) {
			InternalEObject oldInternalAction = (InternalEObject)internalAction;
			internalAction = (InternalAction)eResolveProxy(oldInternalAction);
			if (internalAction != oldInternalAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ACTION_VIEW__INTERNAL_ACTION, oldInternalAction, internalAction));
			}
		}
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAction basicGetInternalAction() {
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalAction(InternalAction newInternalAction) {
		InternalAction oldInternalAction = internalAction;
		internalAction = newInternalAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ACTION_VIEW__INTERNAL_ACTION, oldInternalAction, internalAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionType() {
		return getInternalAction().getActionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionType(final String _arg) {
		getInternalAction().getElement().transact("Set ActionType", () -> {
			getInternalAction().setActionType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalAction().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalAction().getElement().transact("Set Condition", () -> {
			getInternalAction().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalAction().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalAction().getElement().transact("Set Effect", () -> {
			getInternalAction().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return getInternalAction().getUuid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(final String _arg) {
		getInternalAction().getElement().transact("Set Uuid", () -> {
			getInternalAction().setUuid(_arg);
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
			case ViewsPackage.ACTION_VIEW__INTERNAL_ACTION:
				if (resolve) return getInternalAction();
				return basicGetInternalAction();
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
			case ViewsPackage.ACTION_VIEW__INTERNAL_ACTION:
				setInternalAction((InternalAction)newValue);
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
			case ViewsPackage.ACTION_VIEW__INTERNAL_ACTION:
				setInternalAction((InternalAction)null);
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
			case ViewsPackage.ACTION_VIEW__INTERNAL_ACTION:
				return internalAction != null;
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
			case ViewsPackage.ACTION_VIEW___GET_ACTION_TYPE:
				return getActionType();
			case ViewsPackage.ACTION_VIEW___SET_ACTION_TYPE__STRING:
				setActionType((String)arguments.get(0));
				return null;
			case ViewsPackage.ACTION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.ACTION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.ACTION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.ACTION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ViewsPackage.ACTION_VIEW___GET_UUID:
				return getUuid();
			case ViewsPackage.ACTION_VIEW___SET_UUID__STRING:
				setUuid((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionViewImpl
