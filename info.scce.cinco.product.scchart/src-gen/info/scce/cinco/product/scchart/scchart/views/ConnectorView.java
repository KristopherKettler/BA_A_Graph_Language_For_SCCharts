/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalConnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ConnectorView#getInternalConnector <em>Internal Connector</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConnectorView()
 * @model
 * @generated
 */
public interface ConnectorView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Connector</em>' reference.
	 * @see #setInternalConnector(InternalConnector)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConnectorView_InternalConnector()
	 * @model
	 * @generated
	 */
	InternalConnector getInternalConnector();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ConnectorView#getInternalConnector <em>Internal Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Connector</em>' reference.
	 * @see #getInternalConnector()
	 * @generated
	 */
	void setInternalConnector(InternalConnector value);

} // ConnectorView
