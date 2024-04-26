/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.DeclarationView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeclarationViewImpl#getInternalDeclaration <em>Internal Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationViewImpl extends EObjectImpl implements DeclarationView {
	/**
	 * The cached value of the '{@link #getInternalDeclaration() <em>Internal Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InternalDeclaration internalDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DECLARATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeclaration getInternalDeclaration() {
		if (internalDeclaration != null && internalDeclaration.eIsProxy()) {
			InternalEObject oldInternalDeclaration = (InternalEObject)internalDeclaration;
			internalDeclaration = (InternalDeclaration)eResolveProxy(oldInternalDeclaration);
			if (internalDeclaration != oldInternalDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DECLARATION_VIEW__INTERNAL_DECLARATION, oldInternalDeclaration, internalDeclaration));
			}
		}
		return internalDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDeclaration basicGetInternalDeclaration() {
		return internalDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDeclaration(InternalDeclaration newInternalDeclaration) {
		InternalDeclaration oldInternalDeclaration = internalDeclaration;
		internalDeclaration = newInternalDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DECLARATION_VIEW__INTERNAL_DECLARATION, oldInternalDeclaration, internalDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalDeclaration().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalDeclaration().getElement().transact("Set DeclarationType", () -> {
			getInternalDeclaration().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstant() {
		return getInternalDeclaration().isConstant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(final boolean _arg) {
		getInternalDeclaration().getElement().transact("Set Constant", () -> {
			getInternalDeclaration().setConstant(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalDeclaration().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalDeclaration().getElement().transact("Set InputOutput", () -> {
			getInternalDeclaration().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignment() {
		return getInternalDeclaration().getAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignment(final String _arg) {
		getInternalDeclaration().getElement().transact("Set Assignment", () -> {
			getInternalDeclaration().setAssignment(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalDeclaration().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalDeclaration().getElement().transact("Set Name", () -> {
			getInternalDeclaration().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSignal() {
		return getInternalDeclaration().isSignal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignal(final boolean _arg) {
		getInternalDeclaration().getElement().transact("Set Signal", () -> {
			getInternalDeclaration().setSignal(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return getInternalDeclaration().getUuid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(final String _arg) {
		getInternalDeclaration().getElement().transact("Set Uuid", () -> {
			getInternalDeclaration().setUuid(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.DECLARATION_VIEW__INTERNAL_DECLARATION:
				if (resolve) return getInternalDeclaration();
				return basicGetInternalDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.DECLARATION_VIEW__INTERNAL_DECLARATION:
				setInternalDeclaration((InternalDeclaration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.DECLARATION_VIEW__INTERNAL_DECLARATION:
				setInternalDeclaration((InternalDeclaration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.DECLARATION_VIEW__INTERNAL_DECLARATION:
				return internalDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.DECLARATION_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.DECLARATION_VIEW___IS_CONSTANT:
				return isConstant();
			case ViewsPackage.DECLARATION_VIEW___SET_CONSTANT__BOOLEAN:
				setConstant((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.DECLARATION_VIEW___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ViewsPackage.DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ViewsPackage.DECLARATION_VIEW___GET_ASSIGNMENT:
				return getAssignment();
			case ViewsPackage.DECLARATION_VIEW___SET_ASSIGNMENT__STRING:
				setAssignment((String)arguments.get(0));
				return null;
			case ViewsPackage.DECLARATION_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.DECLARATION_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.DECLARATION_VIEW___IS_SIGNAL:
				return isSignal();
			case ViewsPackage.DECLARATION_VIEW___SET_SIGNAL__BOOLEAN:
				setSignal((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.DECLARATION_VIEW___GET_UUID:
				return getUuid();
			case ViewsPackage.DECLARATION_VIEW___SET_UUID__STRING:
				setUuid((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeclarationViewImpl
