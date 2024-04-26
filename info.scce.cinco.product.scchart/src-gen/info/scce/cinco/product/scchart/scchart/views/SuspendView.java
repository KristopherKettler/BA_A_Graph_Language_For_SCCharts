/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalSuspend;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#getInternalSuspend <em>Internal Suspend</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSuspendView()
 * @model
 * @generated
 */
public interface SuspendView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Suspend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Suspend</em>' reference.
	 * @see #setInternalSuspend(InternalSuspend)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSuspendView_InternalSuspend()
	 * @model
	 * @generated
	 */
	InternalSuspend getInternalSuspend();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.SuspendView#getInternalSuspend <em>Internal Suspend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Suspend</em>' reference.
	 * @see #getInternalSuspend()
	 * @generated
	 */
	void setInternalSuspend(InternalSuspend value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCondition(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSuspendType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSuspendType(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUuid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setUuid(String _arg);

} // SuspendView
