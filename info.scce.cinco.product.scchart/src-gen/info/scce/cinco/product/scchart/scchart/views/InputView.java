/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalInput;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.InputView#getInternalInput <em>Internal Input</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getInputView()
 * @model
 * @generated
 */
public interface InputView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Input</em>' reference.
	 * @see #setInternalInput(InternalInput)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getInputView_InternalInput()
	 * @model
	 * @generated
	 */
	InternalInput getInternalInput();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.InputView#getInternalInput <em>Internal Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Input</em>' reference.
	 * @see #getInternalInput()
	 * @generated
	 */
	void setInternalInput(InternalInput value);

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

} // InputView
