/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getInternalConditionalTerminationTransition <em>Internal Conditional Termination Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConditionalTerminationTransitionView()
 * @model
 * @generated
 */
public interface ConditionalTerminationTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Conditional Termination Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Conditional Termination Transition</em>' reference.
	 * @see #setInternalConditionalTerminationTransition(InternalConditionalTerminationTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConditionalTerminationTransitionView_InternalConditionalTerminationTransition()
	 * @model
	 * @generated
	 */
	InternalConditionalTerminationTransition getInternalConditionalTerminationTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationTransitionView#getInternalConditionalTerminationTransition <em>Internal Conditional Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Conditional Termination Transition</em>' reference.
	 * @see #getInternalConditionalTerminationTransition()
	 * @generated
	 */
	void setInternalConditionalTerminationTransition(InternalConditionalTerminationTransition value);

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

} // ConditionalTerminationTransitionView
