/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#getInternalTerminationTransition <em>Internal Termination Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTerminationTransitionView()
 * @model
 * @generated
 */
public interface TerminationTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Termination Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Termination Transition</em>' reference.
	 * @see #setInternalTerminationTransition(InternalTerminationTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTerminationTransitionView_InternalTerminationTransition()
	 * @model
	 * @generated
	 */
	InternalTerminationTransition getInternalTerminationTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationTransitionView#getInternalTerminationTransition <em>Internal Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Termination Transition</em>' reference.
	 * @see #getInternalTerminationTransition()
	 * @generated
	 */
	void setInternalTerminationTransition(InternalTerminationTransition value);

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

} // TerminationTransitionView
