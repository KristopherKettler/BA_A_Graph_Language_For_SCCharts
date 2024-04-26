/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationDeferredTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Termination Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getInternalConditionalTerminationDeferredTransition <em>Internal Conditional Termination Deferred Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConditionalTerminationDeferredTransitionView()
 * @model
 * @generated
 */
public interface ConditionalTerminationDeferredTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Conditional Termination Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Conditional Termination Deferred Transition</em>' reference.
	 * @see #setInternalConditionalTerminationDeferredTransition(InternalConditionalTerminationDeferredTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConditionalTerminationDeferredTransitionView_InternalConditionalTerminationDeferredTransition()
	 * @model
	 * @generated
	 */
	InternalConditionalTerminationDeferredTransition getInternalConditionalTerminationDeferredTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationDeferredTransitionView#getInternalConditionalTerminationDeferredTransition <em>Internal Conditional Termination Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Conditional Termination Deferred Transition</em>' reference.
	 * @see #getInternalConditionalTerminationDeferredTransition()
	 * @generated
	 */
	void setInternalConditionalTerminationDeferredTransition(InternalConditionalTerminationDeferredTransition value);

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

} // ConditionalTerminationDeferredTransitionView
