/**
 */
package info.scce.cinco.product.scchart.scchart.internal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination History Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalTerminationHistoryTransition()
 * @model
 * @generated
 */
public interface InternalTerminationHistoryTransition extends InternalAbstractTransition {
	/**
	 * Returns the value of the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deep History</em>' attribute.
	 * @see #setDeepHistory(boolean)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalTerminationHistoryTransition_DeepHistory()
	 * @model
	 * @generated
	 */
	boolean isDeepHistory();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deep History</em>' attribute.
	 * @see #isDeepHistory()
	 * @generated
	 */
	void setDeepHistory(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The default value is <code>"<No effect>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalTerminationHistoryTransition_Effect()
	 * @model default="&lt;No effect&gt;"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationHistoryTransition#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

} // InternalTerminationHistoryTransition
