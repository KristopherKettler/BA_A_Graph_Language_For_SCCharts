/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalAction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getInternalAction <em>Internal Action</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getActionView()
 * @model
 * @generated
 */
public interface ActionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Action</em>' reference.
	 * @see #setInternalAction(InternalAction)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getActionView_InternalAction()
	 * @model
	 * @generated
	 */
	InternalAction getInternalAction();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ActionView#getInternalAction <em>Internal Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Action</em>' reference.
	 * @see #getInternalAction()
	 * @generated
	 */
	void setInternalAction(InternalAction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getActionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setActionType(String _arg);

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
	String getEffect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEffect(String _arg);

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

} // ActionView
