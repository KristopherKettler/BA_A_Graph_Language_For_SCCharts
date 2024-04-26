/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalSimpleState;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple State View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getInternalSimpleState <em>Internal Simple State</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSimpleStateView()
 * @model
 * @generated
 */
public interface SimpleStateView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Simple State</em>' reference.
	 * @see #setInternalSimpleState(InternalSimpleState)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSimpleStateView_InternalSimpleState()
	 * @model
	 * @generated
	 */
	InternalSimpleState getInternalSimpleState();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.SimpleStateView#getInternalSimpleState <em>Internal Simple State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Simple State</em>' reference.
	 * @see #getInternalSimpleState()
	 * @generated
	 */
	void setInternalSimpleState(InternalSimpleState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

} // SimpleStateView
