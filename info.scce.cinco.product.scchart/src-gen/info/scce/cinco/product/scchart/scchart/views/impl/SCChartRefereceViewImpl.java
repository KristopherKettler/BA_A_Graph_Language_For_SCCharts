/**
 */
package info.scce.cinco.product.scchart.scchart.views.impl;

import info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece;

import info.scce.cinco.product.scchart.scchart.views.SCChartRefereceView;
import info.scce.cinco.product.scchart.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Chart Referece View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.views.impl.SCChartRefereceViewImpl#getInternalSCChartReferece <em>Internal SC Chart Referece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCChartRefereceViewImpl extends EObjectImpl implements SCChartRefereceView {
	/**
	 * The cached value of the '{@link #getInternalSCChartReferece() <em>Internal SC Chart Referece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSCChartReferece()
	 * @generated
	 * @ordered
	 */
	protected InternalSCChartReferece internalSCChartReferece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCChartRefereceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SC_CHART_REFERECE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSCChartReferece getInternalSCChartReferece() {
		if (internalSCChartReferece != null && internalSCChartReferece.eIsProxy()) {
			InternalEObject oldInternalSCChartReferece = (InternalEObject)internalSCChartReferece;
			internalSCChartReferece = (InternalSCChartReferece)eResolveProxy(oldInternalSCChartReferece);
			if (internalSCChartReferece != oldInternalSCChartReferece) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE, oldInternalSCChartReferece, internalSCChartReferece));
			}
		}
		return internalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSCChartReferece basicGetInternalSCChartReferece() {
		return internalSCChartReferece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSCChartReferece(InternalSCChartReferece newInternalSCChartReferece) {
		InternalSCChartReferece oldInternalSCChartReferece = internalSCChartReferece;
		internalSCChartReferece = newInternalSCChartReferece;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE, oldInternalSCChartReferece, internalSCChartReferece));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAssignments() {
		return getInternalSCChartReferece().getAssignments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignments(final EList<String> _arg) {
		getInternalSCChartReferece().getElement().transact("Set Assignments", () -> {
			getInternalSCChartReferece().getAssignments().clear();
			getInternalSCChartReferece().getAssignments().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addAssignments(final String _arg) {
		getInternalSCChartReferece().getElement().transact("Set Assignments", () -> {
			getInternalSCChartReferece().getAssignments().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeAssignments(final String assignments) {
		getInternalSCChartReferece().getElement().transact("Set Assignments", () -> {
			getInternalSCChartReferece().getAssignments().remove(assignments);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSCChartReferece().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSCChartReferece().getElement().transact("Set Name", () -> {
			getInternalSCChartReferece().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSCChartReferece().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSCChartReferece().getElement().transact("Set Label", () -> {
			getInternalSCChartReferece().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputsOutputs() {
		return getInternalSCChartReferece().getInputsOutputs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputsOutputs(final String _arg) {
		getInternalSCChartReferece().getElement().transact("Set InputsOutputs", () -> {
			getInternalSCChartReferece().setInputsOutputs(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return getInternalSCChartReferece().getUuid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(final String _arg) {
		getInternalSCChartReferece().getElement().transact("Set Uuid", () -> {
			getInternalSCChartReferece().setUuid(_arg);
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
			case ViewsPackage.SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE:
				if (resolve) return getInternalSCChartReferece();
				return basicGetInternalSCChartReferece();
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
			case ViewsPackage.SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE:
				setInternalSCChartReferece((InternalSCChartReferece)newValue);
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
			case ViewsPackage.SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE:
				setInternalSCChartReferece((InternalSCChartReferece)null);
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
			case ViewsPackage.SC_CHART_REFERECE_VIEW__INTERNAL_SC_CHART_REFERECE:
				return internalSCChartReferece != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.SC_CHART_REFERECE_VIEW___GET_ASSIGNMENTS:
				return getAssignments();
			case ViewsPackage.SC_CHART_REFERECE_VIEW___SET_ASSIGNMENTS__ELIST:
				setAssignments((EList<String>)arguments.get(0));
				return null;
			case ViewsPackage.SC_CHART_REFERECE_VIEW___ADD_ASSIGNMENTS__STRING:
				addAssignments((String)arguments.get(0));
				return null;
			case ViewsPackage.SC_CHART_REFERECE_VIEW___REMOVE_ASSIGNMENTS__STRING:
				removeAssignments((String)arguments.get(0));
				return null;
			case ViewsPackage.SC_CHART_REFERECE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SC_CHART_REFERECE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.SC_CHART_REFERECE_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.SC_CHART_REFERECE_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ViewsPackage.SC_CHART_REFERECE_VIEW___GET_INPUTS_OUTPUTS:
				return getInputsOutputs();
			case ViewsPackage.SC_CHART_REFERECE_VIEW___SET_INPUTS_OUTPUTS__STRING:
				setInputsOutputs((String)arguments.get(0));
				return null;
			case ViewsPackage.SC_CHART_REFERECE_VIEW___GET_UUID:
				return getUuid();
			case ViewsPackage.SC_CHART_REFERECE_VIEW___SET_UUID__STRING:
				setUuid((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SCChartRefereceViewImpl
