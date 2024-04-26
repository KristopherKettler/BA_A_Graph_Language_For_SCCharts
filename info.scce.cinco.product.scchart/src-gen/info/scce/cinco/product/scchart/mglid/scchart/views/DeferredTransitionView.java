/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getInternalDeferredTransition <em>Internal Deferred Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getDeferredTransitionView()
 * @model
 * @generated
 */
public interface DeferredTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Deferred Transition</em>' reference.
	 * @see #setInternalDeferredTransition(InternalDeferredTransition)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getDeferredTransitionView_InternalDeferredTransition()
	 * @model
	 * @generated
	 */
	InternalDeferredTransition getInternalDeferredTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView#getInternalDeferredTransition <em>Internal Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Deferred Transition</em>' reference.
	 * @see #getInternalDeferredTransition()
	 * @generated
	 */
	void setInternalDeferredTransition(InternalDeferredTransition value);

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

} // DeferredTransitionView
