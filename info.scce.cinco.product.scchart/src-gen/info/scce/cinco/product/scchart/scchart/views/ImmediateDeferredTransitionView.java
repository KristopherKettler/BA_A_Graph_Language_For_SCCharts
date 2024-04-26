/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalImmediateDeferredTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getInternalImmediateDeferredTransition <em>Internal Immediate Deferred Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getImmediateDeferredTransitionView()
 * @model
 * @generated
 */
public interface ImmediateDeferredTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Immediate Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Immediate Deferred Transition</em>' reference.
	 * @see #setInternalImmediateDeferredTransition(InternalImmediateDeferredTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getImmediateDeferredTransitionView_InternalImmediateDeferredTransition()
	 * @model
	 * @generated
	 */
	InternalImmediateDeferredTransition getInternalImmediateDeferredTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.ImmediateDeferredTransitionView#getInternalImmediateDeferredTransition <em>Internal Immediate Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Immediate Deferred Transition</em>' reference.
	 * @see #getInternalImmediateDeferredTransition()
	 * @generated
	 */
	void setInternalImmediateDeferredTransition(InternalImmediateDeferredTransition value);

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

} // ImmediateDeferredTransitionView
