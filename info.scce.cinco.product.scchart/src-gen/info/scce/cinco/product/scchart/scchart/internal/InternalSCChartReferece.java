/**
 */
package info.scce.cinco.product.scchart.scchart.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import info.scce.cinco.product.scchart.scchart.RootState;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getInputsOutputs <em>Inputs Outputs</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getUuid <em>Uuid</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece()
 * @model
 * @generated
 */
public interface InternalSCChartReferece extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' attribute list.
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece_Assignments()
	 * @model
	 * @generated
	 */
	EList<String> getAssignments();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<insert name>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece_Name()
	 * @model default="&lt;insert name&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Inputs Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs Outputs</em>' attribute.
	 * @see #setInputsOutputs(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece_InputsOutputs()
	 * @model
	 * @generated
	 */
	String getInputsOutputs();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getInputsOutputs <em>Inputs Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs Outputs</em>' attribute.
	 * @see #getInputsOutputs()
	 * @generated
	 */
	void setInputsOutputs(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Component UID</em>' attribute.
	 * @see #setLibraryComponentUID(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalSCChartReferece_LibraryComponentUID()
	 * @model
	 * @generated
	 */
	String getLibraryComponentUID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece#getLibraryComponentUID <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Component UID</em>' attribute.
	 * @see #getLibraryComponentUID()
	 * @generated
	 */
	void setLibraryComponentUID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RootState getReference();

} // InternalSCChartReferece
