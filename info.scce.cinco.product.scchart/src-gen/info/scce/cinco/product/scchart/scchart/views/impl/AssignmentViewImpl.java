/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalAssignment;

import info.scce.cinco.product.scchart.scchart.views.AssignmentView;
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
 * An implementation of the model object '<em><b>Assignment View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.AssignmentViewImpl#getInternalAssignment <em>Internal Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentViewImpl extends EObjectImpl implements AssignmentView {
	/**
	 * The cached value of the '{@link #getInternalAssignment() <em>Internal Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalAssignment()
	 * @generated
	 * @ordered
	 */
	protected InternalAssignment internalAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ASSIGNMENT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAssignment getInternalAssignment() {
		if (internalAssignment != null && internalAssignment.eIsProxy()) {
			InternalEObject oldInternalAssignment = (InternalEObject)internalAssignment;
			internalAssignment = (InternalAssignment)eResolveProxy(oldInternalAssignment);
			if (internalAssignment != oldInternalAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT, oldInternalAssignment, internalAssignment));
			}
		}
		return internalAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAssignment basicGetInternalAssignment() {
		return internalAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalAssignment(InternalAssignment newInternalAssignment) {
		InternalAssignment oldInternalAssignment = internalAssignment;
		internalAssignment = newInternalAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT, oldInternalAssignment, internalAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignment() {
		return getInternalAssignment().getAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignment(final String _arg) {
		getInternalAssignment().getElement().transact("Set Assignment", () -> {
			getInternalAssignment().setAssignment(_arg);
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
			case ViewsPackage.ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT:
				if (resolve) return getInternalAssignment();
				return basicGetInternalAssignment();
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
			case ViewsPackage.ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT:
				setInternalAssignment((InternalAssignment)newValue);
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
			case ViewsPackage.ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT:
				setInternalAssignment((InternalAssignment)null);
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
			case ViewsPackage.ASSIGNMENT_VIEW__INTERNAL_ASSIGNMENT:
				return internalAssignment != null;
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
			case ViewsPackage.ASSIGNMENT_VIEW___GET_ASSIGNMENT:
				return getAssignment();
			case ViewsPackage.ASSIGNMENT_VIEW___SET_ASSIGNMENT__STRING:
				setAssignment((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssignmentViewImpl
