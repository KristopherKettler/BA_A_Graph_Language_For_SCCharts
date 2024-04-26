/**
 */
package info.scce.cinco.product.scchart.scchart.views;

import info.scce.cinco.product.scchart.scchart.internal.InternalAbstractTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#getInternalAbstractTransition <em>Internal Abstract Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getAbstractTransitionView()
 * @model
 * @generated
 */
public interface AbstractTransitionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Abstract Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Abstract Transition</em>' reference.
	 * @see #setInternalAbstractTransition(InternalAbstractTransition)
	 * @see info.scce.cinco.product.scchart.scchart.views.ViewsPackage#getAbstractTransitionView_InternalAbstractTransition()
	 * @model
	 * @generated
	 */
	InternalAbstractTransition getInternalAbstractTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.scchart.views.AbstractTransitionView#getInternalAbstractTransition <em>Internal Abstract Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Abstract Transition</em>' reference.
	 * @see #getInternalAbstractTransition()
	 * @generated
	 */
	void setInternalAbstractTransition(InternalAbstractTransition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPriority(String _arg);

} // AbstractTransitionView
