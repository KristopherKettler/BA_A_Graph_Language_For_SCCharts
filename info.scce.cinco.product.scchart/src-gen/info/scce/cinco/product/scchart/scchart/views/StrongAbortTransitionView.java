/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalStrongAbortTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strong Abort Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getStrongAbortTransitionView()
 * @model
 * @generated
 */
public interface StrongAbortTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Strong Abort Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Strong Abort Transition</em>' reference.
	 * @see #setInternalStrongAbortTransition(InternalStrongAbortTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getStrongAbortTransitionView_InternalStrongAbortTransition()
	 * @model
	 * @generated
	 */
	InternalStrongAbortTransition getInternalStrongAbortTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Strong Abort Transition</em>' reference.
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 */
	void setInternalStrongAbortTransition(InternalStrongAbortTransition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCondition(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCount_delay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCount_delay(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEffect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEffect(String _arg);

} // StrongAbortTransitionView
