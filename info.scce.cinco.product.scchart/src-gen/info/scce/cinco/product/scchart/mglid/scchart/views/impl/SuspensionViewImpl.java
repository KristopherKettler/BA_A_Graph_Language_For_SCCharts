/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspension;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuspensionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspension View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuspensionViewImpl#getInternalSuspension <em>Internal Suspension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspensionViewImpl extends EObjectImpl implements SuspensionView {
	/**
	 * The cached value of the '{@link #getInternalSuspension() <em>Internal Suspension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuspension()
	 * @generated
	 * @ordered
	 */
	protected InternalSuspension internalSuspension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspensionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUSPENSION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuspension getInternalSuspension() {
		if (internalSuspension != null && internalSuspension.eIsProxy()) {
			InternalEObject oldInternalSuspension = (InternalEObject)internalSuspension;
			internalSuspension = (InternalSuspension)eResolveProxy(oldInternalSuspension);
			if (internalSuspension != oldInternalSuspension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUSPENSION_VIEW__INTERNAL_SUSPENSION, oldInternalSuspension, internalSuspension));
			}
		}
		return internalSuspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuspension basicGetInternalSuspension() {
		return internalSuspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuspension(InternalSuspension newInternalSuspension) {
		InternalSuspension oldInternalSuspension = internalSuspension;
		internalSuspension = newInternalSuspension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUSPENSION_VIEW__INTERNAL_SUSPENSION, oldInternalSuspension, internalSuspension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuspensionType() {
		return getInternalSuspension().getSuspensionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspensionType(final String _arg) {
		getInternalSuspension().getElement().transact("Set SuspensionType", () -> {
			getInternalSuspension().setSuspensionType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalSuspension().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalSuspension().getElement().transact("Set Condition", () -> {
			getInternalSuspension().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return getInternalSuspension().getUuid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(final String _arg) {
		getInternalSuspension().getElement().transact("Set Uuid", () -> {
			getInternalSuspension().setUuid(_arg);
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
			case ViewsPackage.SUSPENSION_VIEW__INTERNAL_SUSPENSION:
				if (resolve) return getInternalSuspension();
				return basicGetInternalSuspension();
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
			case ViewsPackage.SUSPENSION_VIEW__INTERNAL_SUSPENSION:
				setInternalSuspension((InternalSuspension)newValue);
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
			case ViewsPackage.SUSPENSION_VIEW__INTERNAL_SUSPENSION:
				setInternalSuspension((InternalSuspension)null);
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
			case ViewsPackage.SUSPENSION_VIEW__INTERNAL_SUSPENSION:
				return internalSuspension != null;
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
			case ViewsPackage.SUSPENSION_VIEW___GET_SUSPENSION_TYPE:
				return getSuspensionType();
			case ViewsPackage.SUSPENSION_VIEW___SET_SUSPENSION_TYPE__STRING:
				setSuspensionType((String)arguments.get(0));
				return null;
			case ViewsPackage.SUSPENSION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.SUSPENSION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.SUSPENSION_VIEW___GET_UUID:
				return getUuid();
			case ViewsPackage.SUSPENSION_VIEW___SET_UUID__STRING:
				setUuid((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuspensionViewImpl
