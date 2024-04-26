/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateStrongAbortDeferredTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Strong Abort Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getInternalImmediateStrongAbortDeferredTransition <em>Internal Immediate Strong Abort Deferred Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getImmediateStrongAbortDeferredTransitionView()
 * @model
 * @generated
 */
public interface ImmediateStrongAbortDeferredTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Immediate Strong Abort Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Immediate Strong Abort Deferred Transition</em>' reference.
	 * @see #setInternalImmediateStrongAbortDeferredTransition(InternalImmediateStrongAbortDeferredTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getImmediateStrongAbortDeferredTransitionView_InternalImmediateStrongAbortDeferredTransition()
	 * @model
	 * @generated
	 */
	InternalImmediateStrongAbortDeferredTransition getInternalImmediateStrongAbortDeferredTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateStrongAbortDeferredTransitionView#getInternalImmediateStrongAbortDeferredTransition <em>Internal Immediate Strong Abort Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Immediate Strong Abort Deferred Transition</em>' reference.
	 * @see #getInternalImmediateStrongAbortDeferredTransition()
	 * @generated
	 */
	void setInternalImmediateStrongAbortDeferredTransition(InternalImmediateStrongAbortDeferredTransition value);

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

} // ImmediateStrongAbortDeferredTransitionView
