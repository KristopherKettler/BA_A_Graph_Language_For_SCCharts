/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.scchart.scchart.internal.InternalDeclaration;
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#isSignal <em>Signal</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalDeclarationImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalDeclarationImpl extends InternalNodeImpl implements InternalDeclaration {
	/**
	 * The default value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_TYPE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected String declarationType = DECLARATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputOutput() <em>Input Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_OUTPUT_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getInputOutput() <em>Input Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutput()
	 * @generated
	 * @ordered
	 */
	protected String inputOutput = INPUT_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected String assignment = ASSIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected boolean signal = SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return declarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(String newDeclarationType) {
		String oldDeclarationType = declarationType;
		declarationType = newDeclarationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__DECLARATION_TYPE, oldDeclarationType, declarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return inputOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(String newInputOutput) {
		String oldInputOutput = inputOutput;
		inputOutput = newInputOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__INPUT_OUTPUT, oldInputOutput, inputOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignment(String newAssignment) {
		String oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__ASSIGNMENT, oldAssignment, assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignal(boolean newSignal) {
		boolean oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DECLARATION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_DECLARATION__DECLARATION_TYPE:
				return getDeclarationType();
			case InternalPackage.INTERNAL_DECLARATION__CONSTANT:
				return isConstant();
			case InternalPackage.INTERNAL_DECLARATION__INPUT_OUTPUT:
				return getInputOutput();
			case InternalPackage.INTERNAL_DECLARATION__ASSIGNMENT:
				return getAssignment();
			case InternalPackage.INTERNAL_DECLARATION__NAME:
				return getName();
			case InternalPackage.INTERNAL_DECLARATION__SIGNAL:
				return isSignal();
			case InternalPackage.INTERNAL_DECLARATION__UUID:
				return getUuid();
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
			case InternalPackage.INTERNAL_DECLARATION__DECLARATION_TYPE:
				setDeclarationType((String)newValue);
				return;
			case InternalPackage.INTERNAL_DECLARATION__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_DECLARATION__INPUT_OUTPUT:
				setInputOutput((String)newValue);
				return;
			case InternalPackage.INTERNAL_DECLARATION__ASSIGNMENT:
				setAssignment((String)newValue);
				return;
			case InternalPackage.INTERNAL_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_DECLARATION__SIGNAL:
				setSignal((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_DECLARATION__UUID:
				setUuid((String)newValue);
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
			case InternalPackage.INTERNAL_DECLARATION__DECLARATION_TYPE:
				setDeclarationType(DECLARATION_TYPE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DECLARATION__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DECLARATION__INPUT_OUTPUT:
				setInputOutput(INPUT_OUTPUT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DECLARATION__ASSIGNMENT:
				setAssignment(ASSIGNMENT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DECLARATION__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DECLARATION__UUID:
				setUuid(UUID_EDEFAULT);
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
			case InternalPackage.INTERNAL_DECLARATION__DECLARATION_TYPE:
				return DECLARATION_TYPE_EDEFAULT == null ? declarationType != null : !DECLARATION_TYPE_EDEFAULT.equals(declarationType);
			case InternalPackage.INTERNAL_DECLARATION__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case InternalPackage.INTERNAL_DECLARATION__INPUT_OUTPUT:
				return INPUT_OUTPUT_EDEFAULT == null ? inputOutput != null : !INPUT_OUTPUT_EDEFAULT.equals(inputOutput);
			case InternalPackage.INTERNAL_DECLARATION__ASSIGNMENT:
				return ASSIGNMENT_EDEFAULT == null ? assignment != null : !ASSIGNMENT_EDEFAULT.equals(assignment);
			case InternalPackage.INTERNAL_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_DECLARATION__SIGNAL:
				return signal != SIGNAL_EDEFAULT;
			case InternalPackage.INTERNAL_DECLARATION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (declarationType: ");
		result.append(declarationType);
		result.append(", constant: ");
		result.append(constant);
		result.append(", inputOutput: ");
		result.append(inputOutput);
		result.append(", assignment: ");
		result.append(assignment);
		result.append(", name: ");
		result.append(name);
		result.append(", signal: ");
		result.append(signal);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //InternalDeclarationImpl
