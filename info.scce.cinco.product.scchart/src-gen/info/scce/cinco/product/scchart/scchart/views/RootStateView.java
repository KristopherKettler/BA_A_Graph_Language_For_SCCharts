/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalRootState;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root State View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#getInternalRootState <em>Internal Root State</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getRootStateView()
 * @model
 * @generated
 */
public interface RootStateView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Root State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Root State</em>' reference.
	 * @see #setInternalRootState(InternalRootState)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getRootStateView_InternalRootState()
	 * @model
	 * @generated
	 */
	InternalRootState getInternalRootState();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.RootStateView#getInternalRootState <em>Internal Root State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Root State</em>' reference.
	 * @see #getInternalRootState()
	 * @generated
	 */
	void setInternalRootState(InternalRootState value);

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

} // RootStateView
