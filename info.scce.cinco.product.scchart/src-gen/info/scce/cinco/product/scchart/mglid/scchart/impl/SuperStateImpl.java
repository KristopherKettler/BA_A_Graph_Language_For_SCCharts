/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.ModelElementContainerImpl;

import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalPackage;

import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspension;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.impl.SuperStateImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateImpl extends ModelElementContainerImpl implements SuperState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getSuperState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT && newInternalElement != null)) {
			if (EcoreUtil.isAncestor(this, newInternalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInternalElement != null)
				msgs = ((InternalEObject)newInternalElement).eInverseAdd(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
			msgs = basicSetInternalElement(newInternalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSuperState().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSuperState().getElement().transact("Set Name", () -> {
			getInternalSuperState().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSuperState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSuperState().getElement().transact("Set Label", () -> {
			getInternalSuperState().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperState getInternalSuperState() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlySuperState() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteFunction() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteEvent() {
		// event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		java.lang.Runnable eventResult = eventContext.getFirstResult();
		return eventResult;
		
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
	public SCChart getRootElement() {
		return (info.scce.cinco.product.scchart.mglid.scchart.SCChart) this.getInternalElement().getRootElement().getElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getNodes() {
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(getInternalContainerElement().getModelElements()
				.stream().filter(me -> me instanceof graphmodel.internal.InternalNode).map(me -> (graphmodel.Node)me.getElement()).
					collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Declaration> getDeclarations() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeclaration() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final int x, final int y) {
		return newDeclaration(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final String id, final int x, final int y) {
		return newDeclaration(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Declaration node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Declaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Declaration node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Declaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Action.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewAction() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Action.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final int x, final int y) {
		return newAction(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final String id, final int x, final int y) {
		return newAction(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Action.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Action node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createAction((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Action.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Action.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Action node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createAction((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Action.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getRegions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Region.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewRegion() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Region.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final int x, final int y) {
		return newRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final String id, final int x, final int y) {
		return newRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Region.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Region node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Region.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Region.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Region node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Region.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Suspension> getSuspensions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Suspension.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuspension() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Suspension.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspension newSuspension(final int x, final int y) {
		return newSuspension(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspension newSuspension(final String id, final int x, final int y) {
		return newSuspension(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspension newSuspension(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Suspension.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Suspension node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuspension((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Suspension.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspension newSuspension(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Suspension.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Suspension node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuspension((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Suspension.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends AbstractTransition> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalContainer)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition)me.getElement()).
				collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(graphmodel.Node.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends AbstractTransition> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalContainer)getInternalElement()).getIncoming();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
			.stream().map(me -> (info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition)me.getElement()).
				collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(graphmodel.Node.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final ModelElementContainer container, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preMove(final ModelElementContainer newContainer, final int newX, final int newY) {
		// event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDeferredTransition> getOutgoingTerminationDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredTransition> getOutgoingDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationTransition> getOutgoingTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTransition> getOutgoingAbstractTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDeferredHistoryTransition> getOutgoingTerminationDeferredHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredHistoryTransition> getOutgoingStrongAbortDeferredHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredHistoryTransition> getOutgoingDeferredHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortTransition> getOutgoingStrongAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoryTransition> getOutgoingHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncomingTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDeferredTransition> getIncomingTerminationDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationHistoryTransition> getIncomingTerminationHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredTransition> getIncomingDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationTransition> getIncomingTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTransition> getIncomingAbstractTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDeferredHistoryTransition> getIncomingTerminationDeferredHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredTransition> getIncomingStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredHistoryTransition> getIncomingStrongAbortDeferredHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortHistoryTransition> getIncomingStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredHistoryTransition> getIncomingDeferredHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortTransition> getIncomingStrongAbortTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoryTransition> getIncomingHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSuperState> getInitialSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSuperState> getInitialFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalState> getInitialFinalStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCChartReferece> getSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSCChartReferece> getInitialFinalSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSuperState> getInitialSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSuperState> getInitialFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalState> getInitialFinalStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCChartReferece> getSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialFinalSCChartReferece> getInitialFinalSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final InitialFinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialFinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialFinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortDeferredHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDeferredTransition newTerminationDeferredTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final InitialFinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialFinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialFinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTerminationTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeferredHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredHistoryTransition newDeferredHistoryTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialFinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialFinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialFinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final InitialFinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialFinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialFinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final InitialSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final InitialFinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialFinalSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialFinalSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialSCChartReferece target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialSCChartReferece target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final Region region, final int x, final int y) {
		return region.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final Region region, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(region, x, y);
			s_moveTo(region, x, y);
			region.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, region, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final Region region, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region getContainer() {
		return (info.scce.cinco.product.scchart.mglid.scchart.Region)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateView getSuperStateView() {
		SuperStateView superStateView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createSuperStateView();
		superStateView.setInternalSuperState((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState)getInternalElement());
		return superStateView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElementContainer getInternalContainerElement() {
		return (InternalModelElementContainer)getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void delete() {
		preDelete();
		Runnable postDeleteFunction = getPostDeleteFunction();
		Runnable postDeleteEvent = getPostDeleteEvent();
		for (graphmodel.Node child : getAllNodes())
			child.delete();
		if (getInternalElement() == null) return; //deleting children might have hook-deleted myself
		java.util.HashSet<graphmodel.Edge> allEdges = new java.util.HashSet<>();
		allEdges.addAll(getIncoming());
		allEdges.addAll(getOutgoing());
		for (graphmodel.Edge edge : allEdges)
			edge.delete();
		if (getInternalElement() == null) return; //deleting edges might have hook-deleted myself
		transact("Delete", () -> {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this.getInternalElement());
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
		});
		postDeleteFunction.run();
		postDeleteEvent.run();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getSuccessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getSuccessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getPredecessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getPredecessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getIncoming(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getIncoming().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getOutgoing(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getOutgoing().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canConnect(final Edge with, final Node to) {
		return canStart(with.getClass())&& to.canEnd(with.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getIncomingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canStart(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canStart(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canEnd(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canEnd(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void move(final int x, final int y) {
		transact("Move", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			if (deltaX != 0 || deltaY != 0)
				preMove(getContainer(), x, y);
			if (deltaX != 0)
				ime.setX(x);
			if (deltaY != 0)
				ime.setY(y);
			if (deltaX != 0 || deltaY != 0)
				postMove(getContainer(), getContainer(), x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height) {
		resize(width,  height, getX(), getY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height, final int x, final int y) {
		transact("Resize", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) getInternalElement();
			int oldWidth  = ime.getWidth();
			int oldHeight = ime.getHeight();
			int oldX      = ime.getX();
			int oldY      = ime.getY();
			boolean widthChanged  = width  != oldWidth;
			boolean heightChanged = height != oldHeight;
			boolean xChanged      = x != oldX;
			boolean yChanged      = y != oldY;
			graphmodel.Direction direction = graphmodel.Direction.UNSPECIFIED;
			if (widthChanged || heightChanged || xChanged || yChanged) {
				boolean north = heightChanged &&  yChanged;
				boolean south = heightChanged && !yChanged;
				boolean west  = widthChanged  &&  xChanged;
				boolean east  = widthChanged  && !xChanged;
				direction =
					( north && !south && !west && !east) ? graphmodel.Direction.NORTH      :
					( north && !south && !west &&  east) ? graphmodel.Direction.NORTH_EAST :
					(!north && !south && !west &&  east) ? graphmodel.Direction.EAST       :
					(!north &&  south && !west &&  east) ? graphmodel.Direction.SOUTH_EAST :
					(!north &&  south && !west && !east) ? graphmodel.Direction.SOUTH      :
					(!north &&  south &&  west && !east) ? graphmodel.Direction.SOUTH_WEST :
					(!north && !south &&  west && !east) ? graphmodel.Direction.WEST       :
					( north && !south &&  west && !east) ? graphmodel.Direction.NORTH_WEST :
					                                       graphmodel.Direction.UNSPECIFIED;
				this.preResize(width, height, x, y, direction);
			}
			if (widthChanged)  ime.setWidth(width);
			if (heightChanged) ime.setHeight(height);
			if (xChanged)      ime.setX(x);
			if (yChanged)      ime.setY(y);
			if (widthChanged || heightChanged || xChanged || yChanged) {
				this.postResize(oldWidth, oldHeight, oldX, oldY, direction);
				this.update();
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final ModelElementContainer targetContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(targetContainer, x, y);
			s_moveTo(targetContainer, x, y);
			targetContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, targetContainer, x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canClone(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T clone(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, getInternalElement().getId());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy.getElement(), getId());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getX();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getY();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getWidth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getHeight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T copy(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(final int x) {
		transact("Set x", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setX(x);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(final int y) {
		transact("Set Y", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setY(y);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(final int width) {
		transact("Set width", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setWidth(width);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(final int height) {
		transact("Set height", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setHeight(height);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayer() {
		return getContainer().getModelElements().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getUntypedIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
					.stream().map(me -> (graphmodel.Edge)me.getElement()).
						collect(java.util.stream.Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getUntypedOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
					.stream().map(me -> (graphmodel.Edge)me.getElement()).
						collect(java.util.stream.Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void highlight() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void update() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void updateGraphModel() {
		this.getRootElement().updateModelElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInternalElement((InternalModelElement)otherEnd, msgs);
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)newValue);
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)null);
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
				return getInternalElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return ScchartPackage.SUPER_STATE___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.SUPER_STATE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.SUPER_STATE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.SUPER_STATE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return ScchartPackage.SUPER_STATE___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return ScchartPackage.SUPER_STATE___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return ScchartPackage.SUPER_STATE___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.SUPER_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return ScchartPackage.SUPER_STATE___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.SUPER_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return ScchartPackage.SUPER_STATE___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return ScchartPackage.SUPER_STATE___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return ScchartPackage.SUPER_STATE___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return ScchartPackage.SUPER_STATE___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return ScchartPackage.SUPER_STATE___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return ScchartPackage.SUPER_STATE___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return ScchartPackage.SUPER_STATE___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return ScchartPackage.SUPER_STATE___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return ScchartPackage.SUPER_STATE___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return ScchartPackage.SUPER_STATE___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return ScchartPackage.SUPER_STATE___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return ScchartPackage.SUPER_STATE___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.SUPER_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.SUPER_STATE___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.SUPER_STATE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return ScchartPackage.SUPER_STATE___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return ScchartPackage.SUPER_STATE___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return ScchartPackage.SUPER_STATE___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return ScchartPackage.SUPER_STATE___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return ScchartPackage.SUPER_STATE___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return ScchartPackage.SUPER_STATE___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return ScchartPackage.SUPER_STATE___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return ScchartPackage.SUPER_STATE___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return ScchartPackage.SUPER_STATE___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.SUPER_STATE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.SUPER_STATE___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return ScchartPackage.SUPER_STATE___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return ScchartPackage.SUPER_STATE___GET_UNTYPED_OUTGOING;
				default: return -1;
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScchartPackage.SUPER_STATE___GET_NAME:
				return getName();
			case ScchartPackage.SUPER_STATE___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___GET_LABEL:
				return getLabel();
			case ScchartPackage.SUPER_STATE___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___GET_INTERNAL_SUPER_STATE:
				return getInternalSuperState();
			case ScchartPackage.SUPER_STATE___IS_EXACTLY_SUPER_STATE:
				return isExactlySuperState();
			case ScchartPackage.SUPER_STATE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.SUPER_STATE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.SUPER_STATE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.SUPER_STATE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.SUPER_STATE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.SUPER_STATE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.SUPER_STATE___GET_NODES:
				return getNodes();
			case ScchartPackage.SUPER_STATE___GET_DECLARATIONS:
				return getDeclarations();
			case ScchartPackage.SUPER_STATE___CAN_NEW_DECLARATION:
				return canNewDeclaration();
			case ScchartPackage.SUPER_STATE___NEW_DECLARATION__INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_DECLARATION__STRING_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_DECLARATION__INT_INT_INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_DECLARATION__STRING_INT_INT_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_ACTIONS:
				return getActions();
			case ScchartPackage.SUPER_STATE___CAN_NEW_ACTION:
				return canNewAction();
			case ScchartPackage.SUPER_STATE___NEW_ACTION__INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_ACTION__STRING_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_ACTION__INT_INT_INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_ACTION__STRING_INT_INT_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_REGIONS:
				return getRegions();
			case ScchartPackage.SUPER_STATE___CAN_NEW_REGION:
				return canNewRegion();
			case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT_INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_SUSPENSIONS:
				return getSuspensions();
			case ScchartPackage.SUPER_STATE___CAN_NEW_SUSPENSION:
				return canNewSuspension();
			case ScchartPackage.SUPER_STATE___NEW_SUSPENSION__INT_INT:
				return newSuspension((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_SUSPENSION__STRING_INT_INT:
				return newSuspension((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_SUSPENSION__INT_INT_INT_INT:
				return newSuspension((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_SUSPENSION__STRING_INT_INT_INT_INT:
				return newSuspension((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.SUPER_STATE___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.SUPER_STATE___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_DEFERRED_TRANSITIONS:
				return getOutgoingTerminationDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingTerminationHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_DEFERRED_TRANSITIONS:
				return getOutgoingDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_TRANSITIONS:
				return getOutgoingTerminationTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_ABSTRACT_TRANSITIONS:
				return getOutgoingAbstractTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_DEFERRED_HISTORY_TRANSITIONS:
				return getOutgoingTerminationDeferredHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingStrongAbortDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_DEFERRED_HISTORY_TRANSITIONS:
				return getOutgoingStrongAbortDeferredHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingStrongAbortHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_DEFERRED_HISTORY_TRANSITIONS:
				return getOutgoingDeferredHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS:
				return getOutgoingStrongAbortTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_HISTORY_TRANSITIONS:
				return getOutgoingHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_DEFERRED_TRANSITIONS:
				return getIncomingTerminationDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingTerminationHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_DEFERRED_TRANSITIONS:
				return getIncomingDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_TRANSITIONS:
				return getIncomingTerminationTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_ABSTRACT_TRANSITIONS:
				return getIncomingAbstractTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_DEFERRED_HISTORY_TRANSITIONS:
				return getIncomingTerminationDeferredHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingStrongAbortDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_DEFERRED_HISTORY_TRANSITIONS:
				return getIncomingStrongAbortDeferredHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingStrongAbortHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_DEFERRED_HISTORY_TRANSITIONS:
				return getIncomingDeferredHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS:
				return getIncomingStrongAbortTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_HISTORY_TRANSITIONS:
				return getIncomingHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS:
				return getInitialSuperStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS:
				return getInitialFinalSuperStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS:
				return getInitialFinalStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case ScchartPackage.SUPER_STATE___GET_SC_CHART_REFERECE_PREDECESSORS:
				return getSCChartReferecePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialSCChartReferecePredecessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getFinalSCChartReferecePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialFinalSCChartReferecePredecessors();
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS:
				return getInitialSuperStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS:
				return getInitialFinalSuperStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS:
				return getInitialFinalStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.SUPER_STATE___GET_SC_CHART_REFERECE_SUCCESSORS:
				return getSCChartRefereceSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialSCChartRefereceSuccessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getFinalSCChartRefereceSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialFinalSCChartRefereceSuccessors();
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return canNewTerminationDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return newTerminationDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newTerminationDeferredHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newTerminationDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationDeferredHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewTerminationDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newTerminationDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newTerminationDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewTerminationDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newTerminationDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newTerminationDeferredHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newTerminationDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationDeferredHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewTerminationDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newTerminationDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newTerminationDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSCCHARTREFERECE:
				return newTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSUPERSTATE:
				return canNewTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE:
				return newTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE_STRING:
				return newTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALFINALSTATE:
				return canNewTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALFINALSTATE:
				return newTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALFINALSTATE_STRING:
				return newTransition((InitialFinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALFINALSUPERSTATE:
				return newTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALSUPERSTATE:
				return canNewTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSUPERSTATE:
				return newTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSUPERSTATE_STRING:
				return newTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSCCHARTREFERECE:
				return newTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE:
				return canNewTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE:
				return newTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING:
				return newTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SCCHARTREFERECE:
				return canNewTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SCCHARTREFERECE:
				return newTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SCCHARTREFERECE_STRING:
				return newTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return newStrongAbortDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return newStrongAbortDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newStrongAbortDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return canNewStrongAbortDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return newStrongAbortDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortDeferredHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortDeferredHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewStrongAbortDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newStrongAbortDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newStrongAbortDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewStrongAbortDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newStrongAbortDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newStrongAbortDeferredHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortDeferredHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewStrongAbortDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newStrongAbortDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return newTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newTerminationDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newTerminationDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewTerminationDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return newTerminationDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newTerminationDeferredTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return canNewTerminationDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return newTerminationDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALSUPERSTATE_STRING:
				return newTerminationDeferredTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newTerminationDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewTerminationDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newTerminationDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newTerminationDeferredTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newStrongAbortHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newStrongAbortHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newStrongAbortHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewTerminationHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newTerminationHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewTerminationHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newTerminationHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newTerminationHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewTerminationHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newTerminationHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return newDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return newDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newDeferredTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return canNewDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return newDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE_STRING:
				return newDeferredTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newDeferredTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return newTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE:
				return canNewTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE:
				return newTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return newTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALFINALSTATE:
				return canNewTerminationTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALFINALSTATE:
				return newTerminationTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALFINALSTATE_STRING:
				return newTerminationTransition((InitialFinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewTerminationTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALFINALSUPERSTATE:
				return newTerminationTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newTerminationTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSUPERSTATE:
				return canNewTerminationTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSUPERSTATE:
				return newTerminationTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSUPERSTATE_STRING:
				return newTerminationTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewTerminationTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newTerminationTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newTerminationTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return newTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR:
				return canNewTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR:
				return newTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return newTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE:
				return newTerminationTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return canNewDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return newDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newDeferredHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newDeferredHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newDeferredHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALFINALSTATE:
				return canNewStrongAbortTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALFINALSTATE:
				return newStrongAbortTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALFINALSTATE_STRING:
				return newStrongAbortTransition((InitialFinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewStrongAbortTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALFINALSUPERSTATE:
				return newStrongAbortTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newStrongAbortTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSUPERSTATE:
				return canNewStrongAbortTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSUPERSTATE:
				return newStrongAbortTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSUPERSTATE_STRING:
				return newStrongAbortTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewStrongAbortTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newStrongAbortTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newStrongAbortTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE:
				return canNewHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE:
				return newHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_VIEW:
				return getSuperStateView();
			case ScchartPackage.SUPER_STATE___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case ScchartPackage.SUPER_STATE___DELETE:
				delete();
				return null;
			case ScchartPackage.SUPER_STATE___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case ScchartPackage.SUPER_STATE___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case ScchartPackage.SUPER_STATE___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case ScchartPackage.SUPER_STATE___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ScchartPackage.SUPER_STATE___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ScchartPackage.SUPER_STATE___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_X:
				return getX();
			case ScchartPackage.SUPER_STATE___GET_Y:
				return getY();
			case ScchartPackage.SUPER_STATE___GET_WIDTH:
				return getWidth();
			case ScchartPackage.SUPER_STATE___GET_HEIGHT:
				return getHeight();
			case ScchartPackage.SUPER_STATE___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___GET_LAYER:
				return getLayer();
			case ScchartPackage.SUPER_STATE___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case ScchartPackage.SUPER_STATE___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case ScchartPackage.SUPER_STATE___HIGHLIGHT:
				highlight();
				return null;
			case ScchartPackage.SUPER_STATE___UPDATE:
				update();
				return null;
			case ScchartPackage.SUPER_STATE___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperStateImpl
