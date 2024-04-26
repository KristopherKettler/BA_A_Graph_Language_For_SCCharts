/**
 */
package info.scce.cinco.product.scchart.scchart.internal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalTerminationTransition()
 * @model
 * @generated
 */
public interface InternalTerminationTransition extends InternalAbstractTransition {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The default value is <code>"<No effect>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see info.scce.cinco.product.scchart.scchart.internal.InternalPackage#getInternalTerminationTransition_Effect()
	 * @model default="&lt;No effect&gt;"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.internal.InternalTerminationTransition#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

} // InternalTerminationTransition
