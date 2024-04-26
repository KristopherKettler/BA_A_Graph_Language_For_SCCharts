/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Termination History Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getInternalConditionalTerminationHistoryTransition <em>Internal Conditional Termination History Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConditionalTerminationHistoryTransitionView()
 * @model
 * @generated
 */
public interface ConditionalTerminationHistoryTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Conditional Termination History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Conditional Termination History Transition</em>' reference.
	 * @see #setInternalConditionalTerminationHistoryTransition(InternalConditionalTerminationHistoryTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getConditionalTerminationHistoryTransitionView_InternalConditionalTerminationHistoryTransition()
	 * @model
	 * @generated
	 */
	InternalConditionalTerminationHistoryTransition getInternalConditionalTerminationHistoryTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ConditionalTerminationHistoryTransitionView#getInternalConditionalTerminationHistoryTransition <em>Internal Conditional Termination History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Conditional Termination History Transition</em>' reference.
	 * @see #getInternalConditionalTerminationHistoryTransition()
	 * @generated
	 */
	void setInternalConditionalTerminationHistoryTransition(InternalConditionalTerminationHistoryTransition value);

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
	boolean isDeepHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDeepHistory(boolean _arg);

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

} // ConditionalTerminationHistoryTransitionView
