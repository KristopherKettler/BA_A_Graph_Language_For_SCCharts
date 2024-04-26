/**
 */
package info.scce.cinco.product.scchart.scchart.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getActionType <em>Action Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getEffect <em>Effect</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalAction()
 * @model
 * @generated
 */
public interface InternalAction extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The default value is <code>"<set action>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see #setActionType(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalAction_ActionType()
	 * @model default="&lt;set action&gt;"
	 * @generated
	 */
	String getActionType();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalAction_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalAction_Effect()
	 * @model
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalAction_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalAction#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // InternalAction
