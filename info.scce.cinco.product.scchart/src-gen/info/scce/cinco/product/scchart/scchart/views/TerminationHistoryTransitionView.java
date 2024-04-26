/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination History Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#getInternalTerminationHistoryTransition <em>Internal Termination History Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTerminationHistoryTransitionView()
 * @model
 * @generated
 */
public interface TerminationHistoryTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Termination History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Termination History Transition</em>' reference.
	 * @see #setInternalTerminationHistoryTransition(InternalTerminationHistoryTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTerminationHistoryTransitionView_InternalTerminationHistoryTransition()
	 * @model
	 * @generated
	 */
	InternalTerminationHistoryTransition getInternalTerminationHistoryTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationHistoryTransitionView#getInternalTerminationHistoryTransition <em>Internal Termination History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Termination History Transition</em>' reference.
	 * @see #getInternalTerminationHistoryTransition()
	 * @generated
	 */
	void setInternalTerminationHistoryTransition(InternalTerminationHistoryTransition value);

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

} // TerminationHistoryTransitionView
