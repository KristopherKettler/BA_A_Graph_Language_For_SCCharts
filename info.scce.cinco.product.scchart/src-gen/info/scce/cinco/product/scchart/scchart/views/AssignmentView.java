/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalAssignment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView#getInternalAssignment <em>Internal Assignment</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getAssignmentView()
 * @model
 * @generated
 */
public interface AssignmentView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Assignment</em>' reference.
	 * @see #setInternalAssignment(InternalAssignment)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getAssignmentView_InternalAssignment()
	 * @model
	 * @generated
	 */
	InternalAssignment getInternalAssignment();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.AssignmentView#getInternalAssignment <em>Internal Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Assignment</em>' reference.
	 * @see #getInternalAssignment()
	 * @generated
	 */
	void setInternalAssignment(InternalAssignment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getAssignment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setAssignment(String _arg);

} // AssignmentView
