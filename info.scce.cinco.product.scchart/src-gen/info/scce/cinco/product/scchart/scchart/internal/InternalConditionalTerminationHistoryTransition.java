/**
 */
package info.scce.cinco.product.scchart.scchart.internal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Termination History Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCount_delay <em>Count delay</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalConditionalTerminationHistoryTransition()
 * @model
 * @generated
 */
public interface InternalConditionalTerminationHistoryTransition extends InternalAbstractTransition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"<No condition>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalConditionalTerminationHistoryTransition_Condition()
	 * @model default="&lt;No condition&gt;"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Count delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count delay</em>' attribute.
	 * @see #setCount_delay(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalConditionalTerminationHistoryTransition_Count_delay()
	 * @model
	 * @generated
	 */
	String getCount_delay();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getCount_delay <em>Count delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count delay</em>' attribute.
	 * @see #getCount_delay()
	 * @generated
	 */
	void setCount_delay(String value);

	/**
	 * Returns the value of the '<em><b>Deep History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deep History</em>' attribute.
	 * @see #setDeepHistory(boolean)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalConditionalTerminationHistoryTransition_DeepHistory()
	 * @model
	 * @generated
	 */
	boolean isDeepHistory();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#isDeepHistory <em>Deep History</em>}' attribute.
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
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalConditionalTerminationHistoryTransition_Effect()
	 * @model default="&lt;No effect&gt;"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalConditionalTerminationHistoryTransition#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

} // InternalConditionalTerminationHistoryTransition
