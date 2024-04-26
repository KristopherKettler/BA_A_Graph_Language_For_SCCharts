/**
 */
package info.scce.cinco.product.scchart.scchart.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isConstant <em>Constant</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isSignal <em>Signal</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration()
 * @model
 * @generated
 */
public interface InternalDeclaration extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Declaration Type</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Type</em>' attribute.
	 * @see #setDeclarationType(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_DeclarationType()
	 * @model default=" "
	 * @generated
	 */
	String getDeclarationType();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getDeclarationType <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Type</em>' attribute.
	 * @see #getDeclarationType()
	 * @generated
	 */
	void setDeclarationType(String value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Output</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Output</em>' attribute.
	 * @see #setInputOutput(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_InputOutput()
	 * @model default=" "
	 * @generated
	 */
	String getInputOutput();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getInputOutput <em>Input Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Output</em>' attribute.
	 * @see #getInputOutput()
	 * @generated
	 */
	void setInputOutput(String value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' attribute.
	 * @see #setAssignment(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_Assignment()
	 * @model
	 * @generated
	 */
	String getAssignment();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getAssignment <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' attribute.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see #setSignal(boolean)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_Signal()
	 * @model
	 * @generated
	 */
	boolean isSignal();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#isSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #isSignal()
	 * @generated
	 */
	void setSignal(boolean value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalDeclaration_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // InternalDeclaration
