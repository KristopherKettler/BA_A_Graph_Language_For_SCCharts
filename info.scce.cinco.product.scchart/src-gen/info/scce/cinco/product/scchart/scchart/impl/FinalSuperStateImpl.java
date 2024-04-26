/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.scchart.Action;
import info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition;
import info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition;
import info.scce.cinco.product.scchart.scchart.Connector;
import info.scce.cinco.product.scchart.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.scchart.Declaration;
import info.scce.cinco.product.scchart.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.scchart.FinalState;
import info.scce.cinco.product.scchart.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition;
import info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition;
import info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition;
import info.scce.cinco.product.scchart.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.scchart.InitialState;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.Region;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.scchart.SimpleState;
import info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.scchart.SuperState;
import info.scce.cinco.product.scchart.scchart.Suspend;
import info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition;
import info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition;
import info.scce.cinco.product.scchart.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.scchart.Transition;

import info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState;

import info.scce.cinco.product.scchart.scchart.views.FinalSuperStateView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Super State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FinalSuperStateImpl extends SuperStateImpl implements FinalSuperState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalSuperStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getFinalSuperState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSuperState getInternalFinalSuperState() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyFinalSuperState() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_scchart_FinalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_scchart_FinalSuperState", eventPayload);
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
		// event.post.delete.info_scce_cinco_product_scchart_scchart_FinalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_scchart_FinalSuperState", eventPayload);
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
		return (info.scce.cinco.product.scchart.scchart.SCChart) this.getInternalElement().getRootElement().getElement();
		
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
	public EList<Suspend> getSuspends() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Suspend.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuspend() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Suspend.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final int x, final int y) {
		return newSuspend(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final String id, final int x, final int y) {
		return newSuspend(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Suspend.class)) {
			info.scce.cinco.product.scchart.scchart.Suspend node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSuspend((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Suspend.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Suspend.class)) {
			info.scce.cinco.product.scchart.scchart.Suspend node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSuspend((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Suspend.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataFlowRegion> getDataFlowRegions() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDataFlowRegion() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final int x, final int y) {
		return newDataFlowRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final String id, final int x, final int y) {
		return newDataFlowRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class)) {
			info.scce.cinco.product.scchart.scchart.DataFlowRegion node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDataFlowRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.DataFlowRegion.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class)) {
			info.scce.cinco.product.scchart.scchart.DataFlowRegion node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDataFlowRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.DataFlowRegion.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Action.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewAction() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Action.class);
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
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Action.class)) {
			info.scce.cinco.product.scchart.scchart.Action node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createAction((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Action.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Action.class)) {
			info.scce.cinco.product.scchart.scchart.Action node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createAction((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Action.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getRegions() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Region.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewRegion() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Region.class);
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
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Region.class)) {
			info.scce.cinco.product.scchart.scchart.Region node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Region.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Region.class)) {
			info.scce.cinco.product.scchart.scchart.Region node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Region.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Declaration> getDeclarations() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Declaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeclaration() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Declaration.class);
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
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Declaration.class)) {
			info.scce.cinco.product.scchart.scchart.Declaration node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Declaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Declaration.class)) {
			info.scce.cinco.product.scchart.scchart.Declaration node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Declaration.class, this.getClass()));
		
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
			.stream().map(me -> (info.scce.cinco.product.scchart.scchart.AbstractTransition)me.getElement()).
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
			.stream().map(me -> (info.scce.cinco.product.scchart.scchart.AbstractTransition)me.getElement()).
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
		// event.pre.move.info_scce_cinco_product_scchart_scchart_FinalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_scchart_FinalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_scchart_FinalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_scchart_FinalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_scchart_FinalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_scchart_FinalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_scchart_FinalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_scchart_FinalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationTransition> getOutgoingConditionalTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortTransition> getOutgoingStrongAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTransition> getOutgoingImmediateTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateHistoryTransition> getOutgoingImmediateHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTransition> getOutgoingAbstractTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.AbstractTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateDeferredTransition> getOutgoingImmediateDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationTransition> getOutgoingTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredTransition> getOutgoingDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationHistoryTransition> getOutgoingConditionalTerminationHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoryTransition> getOutgoingHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDefferdTransition> getOutgoingTerminationDefferdTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortDeferredTransition> getOutgoingImmediateStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortHistoryTransition> getOutgoingImmediateStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortTransition> getOutgoingImmediateStrongAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationDeferredTransition> getOutgoingConditionalTerminationDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationTransition> getIncomingConditionalTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortTransition> getIncomingStrongAbortTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTransition> getIncomingImmediateTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateHistoryTransition> getIncomingImmediateHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTransition> getIncomingAbstractTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.AbstractTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateDeferredTransition> getIncomingImmediateDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationHistoryTransition> getIncomingTerminationHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationTransition> getIncomingTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredTransition> getIncomingDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationHistoryTransition> getIncomingConditionalTerminationHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncomingTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredTransition> getIncomingStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortHistoryTransition> getIncomingStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoryTransition> getIncomingHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDefferdTransition> getIncomingTerminationDefferdTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortDeferredTransition> getIncomingImmediateStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortHistoryTransition> getIncomingImmediateStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortTransition> getIncomingImmediateStrongAbortTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationDeferredTransition> getIncomingConditionalTerminationDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSuperState> getFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConditionalTerminationTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DeferredTransition newDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Transition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public HistoryTransition newHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationDefferdTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationDefferdTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationDefferdTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final FinalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final FinalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return region.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
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
	public boolean canMoveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		return dataFlowRegion.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(dataFlowRegion, x, y);
			s_moveTo(dataFlowRegion, x, y);
			dataFlowRegion.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, dataFlowRegion, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		return sCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(sCChartReferece, x, y);
			s_moveTo(sCChartReferece, x, y);
			sCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, sCChartReferece, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final InitialSCChartReferece initialSCChartReferece, final int x, final int y) {
		return initialSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final InitialSCChartReferece initialSCChartReferece, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(initialSCChartReferece, x, y);
			s_moveTo(initialSCChartReferece, x, y);
			initialSCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, initialSCChartReferece, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final InitialSCChartReferece initialSCChartReferece, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final FinalSCChartReferece finalSCChartReferece, final int x, final int y) {
		return finalSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final FinalSCChartReferece finalSCChartReferece, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(finalSCChartReferece, x, y);
			s_moveTo(finalSCChartReferece, x, y);
			finalSCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, finalSCChartReferece, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final FinalSCChartReferece finalSCChartReferece, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperStateView getFinalSuperStateView() {
		FinalSuperStateView finalSuperStateView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createFinalSuperStateView();
		finalSuperStateView.setInternalFinalSuperState((info.scce.cinco.product.scchart.scchart.internal.InternalFinalSuperState)getInternalElement());
		return finalSuperStateView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.FINAL_SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.FINAL_SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.FINAL_SUPER_STATE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.FINAL_SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.FINAL_SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SUPER_STATE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.FINAL_SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.FINAL_SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.FINAL_SUPER_STATE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Container.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.CONTAINER___GET_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.CONTAINER___GET_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.CONTAINER___PRE_DELETE: return ScchartPackage.FINAL_SUPER_STATE___PRE_DELETE;
				case GraphmodelPackage.CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_INCOMING: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING;
				case GraphmodelPackage.CONTAINER___GET_OUTGOING: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING;
				case GraphmodelPackage.CONTAINER___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SUPER_STATE___GET_ROOT_ELEMENT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SuperState.class) {
			switch (baseOperationID) {
				case ScchartPackage.SUPER_STATE___PRE_DELETE: return ScchartPackage.FINAL_SUPER_STATE___PRE_DELETE;
				case ScchartPackage.SUPER_STATE___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.SUPER_STATE___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_EVENT;
				case ScchartPackage.SUPER_STATE___PRE_SAVE: return ScchartPackage.FINAL_SUPER_STATE___PRE_SAVE;
				case ScchartPackage.SUPER_STATE___POST_SAVE: return ScchartPackage.FINAL_SUPER_STATE___POST_SAVE;
				case ScchartPackage.SUPER_STATE___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SUPER_STATE___GET_ROOT_ELEMENT;
				case ScchartPackage.SUPER_STATE___GET_NODES: return ScchartPackage.FINAL_SUPER_STATE___GET_NODES;
				case ScchartPackage.SUPER_STATE___GET_SUSPENDS: return ScchartPackage.FINAL_SUPER_STATE___GET_SUSPENDS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_SUSPEND: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_SUSPEND;
				case ScchartPackage.SUPER_STATE___NEW_SUSPEND__INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_SUSPEND__STRING_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_SUSPEND__INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_SUSPEND__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_DATA_FLOW_REGIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_DATA_FLOW_REGIONS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DATA_FLOW_REGION: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DATA_FLOW_REGION;
				case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_ACTIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_ACTIONS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_ACTION: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_ACTION;
				case ScchartPackage.SUPER_STATE___NEW_ACTION__INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_ACTION__STRING_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_ACTION__INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_ACTION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_REGIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_REGIONS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_REGION: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_REGION;
				case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_DECLARATIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_DECLARATIONS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DECLARATION: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DECLARATION;
				case ScchartPackage.SUPER_STATE___NEW_DECLARATION__INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_DECLARATION__STRING_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_DECLARATION__INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_DECLARATION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING;
				case ScchartPackage.SUPER_STATE___GET_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING;
				case ScchartPackage.SUPER_STATE___GET_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_ABSTRACT_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_ABSTRACT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_ABSTRACT_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_ABSTRACT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_ROOT_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_CONNECTOR_PREDECESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_CONNECTOR_SUCCESSORS: return ScchartPackage.FINAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SUPER_STATE___MOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__REGION_INT_INT;
				case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT;
				case ScchartPackage.SUPER_STATE___MOVE_TO__DATAFLOWREGION_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__DATAFLOWREGION_INT_INT;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__DATAFLOWREGION_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__DATAFLOWREGION_INT_INT;
				case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT;
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
			case ScchartPackage.FINAL_SUPER_STATE___GET_INTERNAL_FINAL_SUPER_STATE:
				return getInternalFinalSuperState();
			case ScchartPackage.FINAL_SUPER_STATE___IS_EXACTLY_FINAL_SUPER_STATE:
				return isExactlyFinalSuperState();
			case ScchartPackage.FINAL_SUPER_STATE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.FINAL_SUPER_STATE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.FINAL_SUPER_STATE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.FINAL_SUPER_STATE___GET_NODES:
				return getNodes();
			case ScchartPackage.FINAL_SUPER_STATE___GET_SUSPENDS:
				return getSuspends();
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_SUSPEND:
				return canNewSuspend();
			case ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__STRING_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__INT_INT_INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_SUSPEND__STRING_INT_INT_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SUPER_STATE___GET_DATA_FLOW_REGIONS:
				return getDataFlowRegions();
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DATA_FLOW_REGION:
				return canNewDataFlowRegion();
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT:
				return newDataFlowRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT:
				return newDataFlowRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT:
				return newDataFlowRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT:
				return newDataFlowRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SUPER_STATE___GET_ACTIONS:
				return getActions();
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_ACTION:
				return canNewAction();
			case ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__STRING_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__INT_INT_INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_ACTION__STRING_INT_INT_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SUPER_STATE___GET_REGIONS:
				return getRegions();
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_REGION:
				return canNewRegion();
			case ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__STRING_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__INT_INT_INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SUPER_STATE___GET_DECLARATIONS:
				return getDeclarations();
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DECLARATION:
				return canNewDeclaration();
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__STRING_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__INT_INT_INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DECLARATION__STRING_INT_INT_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.FINAL_SUPER_STATE___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.FINAL_SUPER_STATE___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS:
				return getOutgoingConditionalTerminationTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS:
				return getOutgoingStrongAbortTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS:
				return getOutgoingImmediateTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS:
				return getOutgoingImmediateHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_ABSTRACT_TRANSITIONS:
				return getOutgoingAbstractTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS:
				return getOutgoingImmediateDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TERMINATION_TRANSITIONS:
				return getOutgoingTerminationTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_DEFERRED_TRANSITIONS:
				return getOutgoingDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingConditionalTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_HISTORY_TRANSITIONS:
				return getOutgoingHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS:
				return getOutgoingTerminationDefferdTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingImmediateStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingImmediateStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS:
				return getOutgoingImmediateStrongAbortTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS:
				return getOutgoingConditionalTerminationDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS:
				return getIncomingConditionalTerminationTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS:
				return getIncomingStrongAbortTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS:
				return getIncomingImmediateTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS:
				return getIncomingImmediateHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_ABSTRACT_TRANSITIONS:
				return getIncomingAbstractTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS:
				return getIncomingImmediateDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TERMINATION_TRANSITIONS:
				return getIncomingTerminationTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_DEFERRED_TRANSITIONS:
				return getIncomingDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingConditionalTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_HISTORY_TRANSITIONS:
				return getIncomingHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS:
				return getIncomingTerminationDefferdTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingImmediateStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingImmediateStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS:
				return getIncomingImmediateStrongAbortTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS:
				return getIncomingConditionalTerminationDeferredTransitions();
			case ScchartPackage.FINAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR:
				return canNewConditionalTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR:
				return newConditionalTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newConditionalTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE:
				return newConditionalTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewConditionalTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE:
				return newConditionalTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newConditionalTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewConditionalTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE:
				return newConditionalTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newConditionalTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return canNewConditionalTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return newConditionalTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING:
				return newConditionalTerminationTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE:
				return canNewConditionalTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE:
				return newConditionalTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newConditionalTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return newImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return canNewImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return newImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING:
				return newImmediateTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return canNewImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return newImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING:
				return newImmediateTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return canNewImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return newImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return canNewImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return newImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE:
				return newImmediateTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return canNewImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return newImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING:
				return newImmediateTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newImmediateHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE:
				return canNewImmediateHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE:
				return newImmediateHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newImmediateHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newImmediateHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newImmediateDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewImmediateDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE:
				return newImmediateDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newImmediateDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newImmediateDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR:
				return canNewTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR:
				return newTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return newTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return newTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return newTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return newTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE:
				return canNewTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE:
				return newTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return newDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newConditionalTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newConditionalTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE:
				return canNewTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE:
				return newTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE:
				return canNewTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE:
				return newTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING:
				return newTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__FINALSUPERSTATE:
				return canNewTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE:
				return newTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSUPERSTATE_STRING:
				return newTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE:
				return canNewHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE:
				return newHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationDefferdTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE:
				return newTerminationDefferdTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationDefferdTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE:
				return canNewTerminationDefferdTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE:
				return newTerminationDefferdTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING:
				return newTerminationDefferdTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationDefferdTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE:
				return newTerminationDefferdTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationDefferdTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewImmediateStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newImmediateStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newImmediateStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewImmediateStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newImmediateStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewImmediateStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newImmediateStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newImmediateStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return newImmediateStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewImmediateStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newImmediateStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newImmediateStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return newConditionalTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newConditionalTerminationDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT:
				return canMoveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__DATAFLOWREGION_INT_INT:
				moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__DATAFLOWREGION_INT_INT:
				s_moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT:
				return canMoveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__SCCHARTREFERECE_INT_INT:
				moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__SCCHARTREFERECE_INT_INT:
				s_moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				return canMoveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				s_moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				return canMoveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SUPER_STATE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				s_moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SUPER_STATE___GET_FINAL_SUPER_STATE_VIEW:
				return getFinalSuperStateView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FinalSuperStateImpl
