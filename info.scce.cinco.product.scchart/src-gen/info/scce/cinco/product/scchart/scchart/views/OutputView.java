/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalOutput;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.OutputView#getInternalOutput <em>Internal Output</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getOutputView()
 * @model
 * @generated
 */
public interface OutputView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Output</em>' reference.
	 * @see #setInternalOutput(InternalOutput)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getOutputView_InternalOutput()
	 * @model
	 * @generated
	 */
	InternalOutput getInternalOutput();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.OutputView#getInternalOutput <em>Internal Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Output</em>' reference.
	 * @see #getInternalOutput()
	 * @generated
	 */
	void setInternalOutput(InternalOutput value);

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

} // OutputView
