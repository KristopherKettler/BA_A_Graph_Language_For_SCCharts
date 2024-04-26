/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#getInternalTransition <em>Internal Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTransitionView()
 * @model
 * @generated
 */
public interface TransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Transition</em>' reference.
	 * @see #setInternalTransition(InternalTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTransitionView_InternalTransition()
	 * @model
	 * @generated
	 */
	InternalTransition getInternalTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.TransitionView#getInternalTransition <em>Internal Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Transition</em>' reference.
	 * @see #getInternalTransition()
	 * @generated
	 */
	void setInternalTransition(InternalTransition value);

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

} // TransitionView
