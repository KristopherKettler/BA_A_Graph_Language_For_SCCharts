/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalTerminationDefferdTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination Defferd Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#getInternalTerminationDefferdTransition <em>Internal Termination Defferd Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTerminationDefferdTransitionView()
 * @model
 * @generated
 */
public interface TerminationDefferdTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Termination Defferd Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Termination Defferd Transition</em>' reference.
	 * @see #setInternalTerminationDefferdTransition(InternalTerminationDefferdTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getTerminationDefferdTransitionView_InternalTerminationDefferdTransition()
	 * @model
	 * @generated
	 */
	InternalTerminationDefferdTransition getInternalTerminationDefferdTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.TerminationDefferdTransitionView#getInternalTerminationDefferdTransition <em>Internal Termination Defferd Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Termination Defferd Transition</em>' reference.
	 * @see #getInternalTerminationDefferdTransition()
	 * @generated
	 */
	void setInternalTerminationDefferdTransition(InternalTerminationDefferdTransition value);

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

} // TerminationDefferdTransitionView
