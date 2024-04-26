/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalConnection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ConnectionView#getInternalConnection <em>Internal Connection</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConnectionView()
 * @model
 * @generated
 */
public interface ConnectionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Connection</em>' reference.
	 * @see #setInternalConnection(InternalConnection)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConnectionView_InternalConnection()
	 * @model
	 * @generated
	 */
	InternalConnection getInternalConnection();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ConnectionView#getInternalConnection <em>Internal Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Connection</em>' reference.
	 * @see #getInternalConnection()
	 * @generated
	 */
	void setInternalConnection(InternalConnection value);

} // ConnectionView
