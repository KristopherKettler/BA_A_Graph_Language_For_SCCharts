/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalSuspend;

import info.scce.cinco.product.scchart.scchart.views.SuspendView;
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
 * An implementation of the model object '<em><b>Suspend View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.SuspendViewImpl#getInternalSuspend <em>Internal Suspend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspendViewImpl extends EObjectImpl implements SuspendView {
	/**
	 * The cached value of the '{@link #getInternalSuspend() <em>Internal Suspend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuspend()
	 * @generated
	 * @ordered
	 */
	protected InternalSuspend internalSuspend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspendViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUSPEND_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuspend getInternalSuspend() {
		if (internalSuspend != null && internalSuspend.eIsProxy()) {
			InternalEObject oldInternalSuspend = (InternalEObject)internalSuspend;
			internalSuspend = (InternalSuspend)eResolveProxy(oldInternalSuspend);
			if (internalSuspend != oldInternalSuspend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUSPEND_VIEW__INTERNAL_SUSPEND, oldInternalSuspend, internalSuspend));
			}
		}
		return internalSuspend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuspend basicGetInternalSuspend() {
		return internalSuspend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuspend(InternalSuspend newInternalSuspend) {
		InternalSuspend oldInternalSuspend = internalSuspend;
		internalSuspend = newInternalSuspend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUSPEND_VIEW__INTERNAL_SUSPEND, oldInternalSuspend, internalSuspend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalSuspend().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalSuspend().getElement().transact("Set Condition", () -> {
			getInternalSuspend().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuspendType() {
		return getInternalSuspend().getSuspendType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspendType(final String _arg) {
		getInternalSuspend().getElement().transact("Set SuspendType", () -> {
			getInternalSuspend().setSuspendType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return getInternalSuspend().getUuid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(final String _arg) {
		getInternalSuspend().getElement().transact("Set Uuid", () -> {
			getInternalSuspend().setUuid(_arg);
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
			case ViewsPackage.SUSPEND_VIEW__INTERNAL_SUSPEND:
				if (resolve) return getInternalSuspend();
				return basicGetInternalSuspend();
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
			case ViewsPackage.SUSPEND_VIEW__INTERNAL_SUSPEND:
				setInternalSuspend((InternalSuspend)newValue);
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
			case ViewsPackage.SUSPEND_VIEW__INTERNAL_SUSPEND:
				setInternalSuspend((InternalSuspend)null);
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
			case ViewsPackage.SUSPEND_VIEW__INTERNAL_SUSPEND:
				return internalSuspend != null;
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
			case ViewsPackage.SUSPEND_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.SUSPEND_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.SUSPEND_VIEW___GET_SUSPEND_TYPE:
				return getSuspendType();
			case ViewsPackage.SUSPEND_VIEW___SET_SUSPEND_TYPE__STRING:
				setSuspendType((String)arguments.get(0));
				return null;
			case ViewsPackage.SUSPEND_VIEW___GET_UUID:
				return getUuid();
			case ViewsPackage.SUSPEND_VIEW___SET_UUID__STRING:
				setUuid((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuspendViewImpl
