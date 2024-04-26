/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalOperator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.OperatorView#getInternalOperator <em>Internal Operator</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getOperatorView()
 * @model
 * @generated
 */
public interface OperatorView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Operator</em>' reference.
	 * @see #setInternalOperator(InternalOperator)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getOperatorView_InternalOperator()
	 * @model
	 * @generated
	 */
	InternalOperator getInternalOperator();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.OperatorView#getInternalOperator <em>Internal Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Operator</em>' reference.
	 * @see #getInternalOperator()
	 * @generated
	 */
	void setInternalOperator(InternalOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getOperator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setOperator(String _arg);

} // OperatorView
