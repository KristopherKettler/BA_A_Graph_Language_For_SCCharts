/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strong Abort Deferred History Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getInternalStrongAbortDeferredHistoryTransition <em>Internal Strong Abort Deferred History Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getStrongAbortDeferredHistoryTransitionView()
 * @model
 * @generated
 */
public interface StrongAbortDeferredHistoryTransitionView extends AbstractTransitionView {
	/**
	 * Returns the value of the '<em><b>Internal Strong Abort Deferred History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Strong Abort Deferred History Transition</em>' reference.
	 * @see #setInternalStrongAbortDeferredHistoryTransition(InternalStrongAbortDeferredHistoryTransition)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getStrongAbortDeferredHistoryTransitionView_InternalStrongAbortDeferredHistoryTransition()
	 * @model
	 * @generated
	 */
	InternalStrongAbortDeferredHistoryTransition getInternalStrongAbortDeferredHistoryTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredHistoryTransitionView#getInternalStrongAbortDeferredHistoryTransition <em>Internal Strong Abort Deferred History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Strong Abort Deferred History Transition</em>' reference.
	 * @see #getInternalStrongAbortDeferredHistoryTransition()
	 * @generated
	 */
	void setInternalStrongAbortDeferredHistoryTransition(InternalStrongAbortDeferredHistoryTransition value);

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

} // StrongAbortDeferredHistoryTransitionView
