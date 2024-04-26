/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getInternalTerminationDeferredTransition <em>Internal Termination Deferred Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getTerminationDeferredTransitionView()
 * @model
 * @generated
 */
public interface TerminationDeferredTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Termination Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Termination Deferred Transition</em>' reference.
	 * @see #setInternalTerminationDeferredTransition(InternalTerminationDeferredTransition)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getTerminationDeferredTransitionView_InternalTerminationDeferredTransition()
	 * @model
	 * @generated
	 */
	InternalTerminationDeferredTransition getInternalTerminationDeferredTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDeferredTransitionView#getInternalTerminationDeferredTransition <em>Internal Termination Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Termination Deferred Transition</em>' reference.
	 * @see #getInternalTerminationDeferredTransition()
	 * @generated
	 */
	void setInternalTerminationDeferredTransition(InternalTerminationDeferredTransition value);

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
	boolean isImmediate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setImmediate(boolean _arg);

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

} // TerminationDeferredTransitionView
