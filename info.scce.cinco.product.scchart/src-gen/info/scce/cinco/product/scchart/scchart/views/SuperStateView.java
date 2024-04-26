/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalSuperState;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSuperStateView()
 * @model
 * @generated
 */
public interface SuperStateView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Super State</em>' reference.
	 * @see #setInternalSuperState(InternalSuperState)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getSuperStateView_InternalSuperState()
	 * @model
	 * @generated
	 */
	InternalSuperState getInternalSuperState();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Super State</em>' reference.
	 * @see #getInternalSuperState()
	 * @generated
	 */
	void setInternalSuperState(InternalSuperState value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getInputsOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _argMany="true"
	 * @generated
	 */
	void setInputsOutputs(EList<String> _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addInputsOutputs(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeInputsOutputs(String inputsOutputs);

} // SuperStateView
