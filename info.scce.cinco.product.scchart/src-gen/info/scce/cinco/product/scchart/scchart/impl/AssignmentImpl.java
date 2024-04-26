/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.internal.InternalPackage;
import graphmodel.internal.InternalType;

import info.scce.cinco.product.scchart.scchart.Assignment;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.scchart.internal.InternalAssignment;

import info.scce.cinco.product.scchart.scchart.views.AssignmentView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.impl.AssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.scchart.impl.AssignmentImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends EObjectImpl implements Assignment {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected InternalType internalElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.ASSIGNMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalType getInternalElement() {
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalType newInternalElement, NotificationChain msgs) {
		InternalType oldInternalElement = internalElement;
		internalElement = newInternalElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT, oldInternalElement, newInternalElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalType newInternalElement) {
		if (newInternalElement != internalElement) {
			NotificationChain msgs = null;
			if (internalElement != null)
				msgs = ((InternalEObject)internalElement).eInverseRemove(this, InternalPackage.INTERNAL_TYPE__ELEMENT, InternalType.class, msgs);
			if (newInternalElement != null)
				msgs = ((InternalEObject)newInternalElement).eInverseAdd(this, InternalPackage.INTERNAL_TYPE__ELEMENT, InternalType.class, msgs);
			msgs = basicSetInternalElement(newInternalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignment() {
		return getInternalAssignment().getAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignment(final String _arg) {
		getInternalAssignment().getElement().transact("Set Assignment", () -> {
			getInternalAssignment().setAssignment(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAssignment getInternalAssignment() {
		return (info.scce.cinco.product.scchart.scchart
		.internal.InternalAssignment) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyAssignment() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentView getAssignmentView() {
		AssignmentView assignmentView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createAssignmentView();
		assignmentView.setInternalAssignment((info.scce.cinco.product.scchart.scchart.internal.InternalAssignment)getInternalElement());
		return assignmentView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void delete() {
		preDelete();
		org.eclipse.emf.ecore.util.EcoreUtil.delete(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean equals(final Object obj) {
		return (obj != null && (obj == this))
					|| obj instanceof graphmodel.IdentifiableElement
						&& ((graphmodel.IdentifiableElement) obj).getId() != null
						&& ((graphmodel.IdentifiableElement) obj).getId().equals(this.getId())
						&& obj.getClass().getName().equals(this.getClass().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int hashCode() {
		return java.util.Objects.hash(getId(),getClass().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void save() {
		try {
			preSave();
			this.eResource().save(null);
			postSave();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void transact(final String label, final Runnable runnable) {
		org.eclipse.emf.transaction.TransactionalEditingDomain dom;
		org.eclipse.emf.transaction.TransactionalEditingDomain.Factory factory = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE;
		org.eclipse.emf.ecore.resource.Resource res = getInternalElement().eResource();
		if (res == null)
			dom = factory.createEditingDomain();
		else dom = org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(res);
		if (dom == null)	
			if (res.getResourceSet() != null)
				dom = factory.createEditingDomain(res.getResourceSet());
			else
				dom = factory.createEditingDomain();
		if (dom != null) {
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom, label) {
				
				@Override
				protected void doExecute() {
					try {
						runnable.run();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT:
				if (internalElement != null)
					msgs = ((InternalEObject)internalElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT, null, msgs);
				return basicSetInternalElement((InternalType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT:
				return basicSetInternalElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScchartPackage.ASSIGNMENT__ID:
				return getId();
			case ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT:
				return getInternalElement();
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
			case ScchartPackage.ASSIGNMENT__ID:
				setId((String)newValue);
				return;
			case ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT:
				setInternalElement((InternalType)newValue);
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
			case ScchartPackage.ASSIGNMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT:
				setInternalElement((InternalType)null);
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
			case ScchartPackage.ASSIGNMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScchartPackage.ASSIGNMENT__INTERNAL_ELEMENT:
				return internalElement != null;
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
			case ScchartPackage.ASSIGNMENT___GET_ASSIGNMENT:
				return getAssignment();
			case ScchartPackage.ASSIGNMENT___SET_ASSIGNMENT__STRING:
				setAssignment((String)arguments.get(0));
				return null;
			case ScchartPackage.ASSIGNMENT___GET_INTERNAL_ASSIGNMENT:
				return getInternalAssignment();
			case ScchartPackage.ASSIGNMENT___IS_EXACTLY_ASSIGNMENT:
				return isExactlyAssignment();
			case ScchartPackage.ASSIGNMENT___GET_ASSIGNMENT_VIEW:
				return getAssignmentView();
			case ScchartPackage.ASSIGNMENT___DELETE:
				delete();
				return null;
			case ScchartPackage.ASSIGNMENT___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.ASSIGNMENT___EQUALS__OBJECT:
				return equals(arguments.get(0));
			case ScchartPackage.ASSIGNMENT___HASH_CODE:
				return hashCode();
			case ScchartPackage.ASSIGNMENT___SAVE:
				save();
				return null;
			case ScchartPackage.ASSIGNMENT___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.ASSIGNMENT___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.ASSIGNMENT___TRANSACT__STRING_RUNNABLE:
				transact((String)arguments.get(0), (Runnable)arguments.get(1));
				return null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
