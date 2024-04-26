/**
 */
package info.scce.cinco.product.scchart.scchart.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getCondition <em>Condition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getSuspendType <em>Suspend Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSuspend()
 * @model
 * @generated
 */
public interface InternalSuspend extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSuspend_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Suspend Type</b></em>' attribute.
	 * The default value is <code>"<set suspend>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend Type</em>' attribute.
	 * @see #setSuspendType(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSuspend_SuspendType()
	 * @model default="&lt;set suspend&gt;"
	 * @generated
	 */
	String getSuspendType();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getSuspendType <em>Suspend Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend Type</em>' attribute.
	 * @see #getSuspendType()
	 * @generated
	 */
	void setSuspendType(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSuspend_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSuspend#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // InternalSuspend
