/**
 */
package info.scce.cinco.product.scchart.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.scchart.scchart.RootState;

import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl#getInputsOutputs <em>Inputs Outputs</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.internal.impl.InternalSCChartRefereceImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalSCChartRefereceImpl extends InternalContainerImpl implements InternalSCChartReferece {
	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> assignments;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<insert name>";

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputsOutputs() <em>Inputs Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUTS_OUTPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputsOutputs() <em>Inputs Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsOutputs()
	 * @generated
	 * @ordered
	 */
	protected String inputsOutputs = INPUTS_OUTPUTS_EDEFAULT;

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
	 * The default value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_COMPONENT_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected String libraryComponentUID = LIBRARY_COMPONENT_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSCChartRefereceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_SC_CHART_REFERECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAssignments() {
		if (assignments == null) {
			assignments = new EDataTypeUniqueEList<String>(String.class, this, InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS);
		}
		return assignments;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputsOutputs() {
		return inputsOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputsOutputs(String newInputsOutputs) {
		String oldInputsOutputs = inputsOutputs;
		inputsOutputs = newInputsOutputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS, oldInputsOutputs, inputsOutputs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return libraryComponentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(String newLibraryComponentUID) {
		String oldLibraryComponentUID = libraryComponentUID;
		libraryComponentUID = newLibraryComponentUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.scchart.RootState.class,info.scce.cinco.product.scchart.scchart.Region.class,info.scce.cinco.product.scchart.scchart.DataFlowRegion.class,info.scce.cinco.product.scchart.scchart.SuperState.class,info.scce.cinco.product.scchart.scchart.InitilalSuperState.class,info.scce.cinco.product.scchart.scchart.FinalSuperState.class,info.scce.cinco.product.scchart.scchart.Declaration.class,info.scce.cinco.product.scchart.scchart.Suspend.class,info.scce.cinco.product.scchart.scchart.Action.class,info.scce.cinco.product.scchart.scchart.SimpleState.class,info.scce.cinco.product.scchart.scchart.InitialState.class,info.scce.cinco.product.scchart.scchart.FinalState.class,info.scce.cinco.product.scchart.scchart.Connector.class,info.scce.cinco.product.scchart.scchart.Input.class,info.scce.cinco.product.scchart.scchart.Output.class,info.scce.cinco.product.scchart.scchart.Operator.class,info.scce.cinco.product.scchart.scchart.CircuitConnecter.class,info.scce.cinco.product.scchart.scchart.SCChartReferece.class,info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class,info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState getReference() {
		String uid = getLibraryComponentUID();
		return (info.scce.cinco.product.scchart.scchart.RootState) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				return getAssignments();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				return getName();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				return getLabel();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS:
				return getInputsOutputs();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__UUID:
				return getUuid();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends String>)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				setLabel((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS:
				setInputsOutputs((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__UUID:
				setUuid((String)newValue);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID((String)newValue);
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
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS:
				setInputsOutputs(INPUTS_OUTPUTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID(LIBRARY_COMPONENT_UID_EDEFAULT);
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
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__INPUTS_OUTPUTS:
				return INPUTS_OUTPUTS_EDEFAULT == null ? inputsOutputs != null : !INPUTS_OUTPUTS_EDEFAULT.equals(inputsOutputs);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case InternalPackage.INTERNAL_SC_CHART_REFERECE__LIBRARY_COMPONENT_UID:
				return LIBRARY_COMPONENT_UID_EDEFAULT == null ? libraryComponentUID != null : !LIBRARY_COMPONENT_UID_EDEFAULT.equals(libraryComponentUID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_REFERENCE:
				return getReference();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (assignments: ");
		result.append(assignments);
		result.append(", name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", inputsOutputs: ");
		result.append(inputsOutputs);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalSCChartRefereceImpl
