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

import info.scce.cinco.product.scchart.scchart.Action;
import info.scce.cinco.product.scchart.scchart.CircuitConnecter;
import info.scce.cinco.product.scchart.scchart.Connector;
import info.scce.cinco.product.scchart.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.scchart.Declaration;
import info.scce.cinco.product.scchart.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.scchart.FinalState;
import info.scce.cinco.product.scchart.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.scchart.InitialState;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.Input;
import info.scce.cinco.product.scchart.scchart.Operator;
import info.scce.cinco.product.scchart.scchart.Output;
import info.scce.cinco.product.scchart.scchart.Region;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.scchart.SimpleState;
import info.scce.cinco.product.scchart.scchart.SuperState;
import info.scce.cinco.product.scchart.scchart.Suspend;

import info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece;

import info.scce.cinco.product.scchart.scchart.views.FinalSCChartRefereceView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FinalSCChartRefereceImpl extends SCChartRefereceImpl implements FinalSCChartReferece {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalSCChartRefereceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getFinalSCChartReferece();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSCChartReferece getInternalFinalSCChartReferece() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyFinalSCChartReferece() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece", eventPayload);
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
		// event.post.delete.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece", eventPayload);
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
	public EList<Operator> getOperators() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewOperator() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator newOperator(final int x, final int y) {
		return newOperator(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator newOperator(final String id, final int x, final int y) {
		return newOperator(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator newOperator(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Operator.class)) {
			info.scce.cinco.product.scchart.scchart.Operator node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createOperator((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Operator.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator newOperator(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Operator.class)) {
			info.scce.cinco.product.scchart.scchart.Operator node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createOperator((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Operator.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewRootState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final int x, final int y) {
		return newRootState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final String id, final int x, final int y) {
		return newRootState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.RootState.class)) {
			info.scce.cinco.product.scchart.scchart.RootState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createRootState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.RootState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.RootState.class)) {
			info.scce.cinco.product.scchart.scchart.RootState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createRootState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.RootState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInput() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final int x, final int y) {
		return newInput(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final String id, final int x, final int y) {
		return newInput(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Input.class)) {
			info.scce.cinco.product.scchart.scchart.Input node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInput((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Input.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Input.class)) {
			info.scce.cinco.product.scchart.scchart.Input node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInput((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Input.class, this.getClass()));
		
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
	public EList<Connector> getConnectors() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConnector() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final int x, final int y) {
		return newConnector(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final String id, final int x, final int y) {
		return newConnector(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Connector.class)) {
			info.scce.cinco.product.scchart.scchart.Connector node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnector((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Connector.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Connector.class)) {
			info.scce.cinco.product.scchart.scchart.Connector node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnector((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Connector.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInitialState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final int x, final int y) {
		return newInitialState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final String id, final int x, final int y) {
		return newInitialState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.InitialState.class)) {
			info.scce.cinco.product.scchart.scchart.InitialState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInitialState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.InitialState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.InitialState.class)) {
			info.scce.cinco.product.scchart.scchart.InitialState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInitialState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.InitialState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCChartReferece> getSCChartRefereces() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSCChartReferece() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final int x, final int y) {
		return newSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final String id, final int x, final int y) {
		return newSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.SCChartReferece.class)) {
			info.scce.cinco.product.scchart.scchart.SCChartReferece node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", SCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.SCChartReferece.class)) {
			info.scce.cinco.product.scchart.scchart.SCChartReferece node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.scchart.internal.InternalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", SCChartReferece.class, this.getClass()));
		
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
	public EList<CircuitConnecter> getCircuitConnecters() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewCircuitConnecter() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecter newCircuitConnecter(final int x, final int y) {
		return newCircuitConnecter(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecter newCircuitConnecter(final String id, final int x, final int y) {
		return newCircuitConnecter(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecter newCircuitConnecter(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.CircuitConnecter.class)) {
			info.scce.cinco.product.scchart.scchart.CircuitConnecter node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createCircuitConnecter((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.CircuitConnecter.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecter newCircuitConnecter(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.CircuitConnecter.class)) {
			info.scce.cinco.product.scchart.scchart.CircuitConnecter node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createCircuitConnecter((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.CircuitConnecter.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.Output.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewOutput() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.Output.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output newOutput(final int x, final int y) {
		return newOutput(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output newOutput(final String id, final int x, final int y) {
		return newOutput(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output newOutput(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Output.class)) {
			info.scce.cinco.product.scchart.scchart.Output node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createOutput((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Output.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output newOutput(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.Output.class)) {
			info.scce.cinco.product.scchart.scchart.Output node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createOutput((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.Output.class, this.getClass()));
		
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
	public EList<InitilalSuperState> getInitilalSuperStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInitilalSuperState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final int x, final int y) {
		return newInitilalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final String id, final int x, final int y) {
		return newInitilalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class)) {
			info.scce.cinco.product.scchart.scchart.InitilalSuperState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInitilalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.InitilalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.InitilalSuperState.class)) {
			info.scce.cinco.product.scchart.scchart.InitilalSuperState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInitilalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.InitilalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuperState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final int x, final int y) {
		return newSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final String id, final int x, final int y) {
		return newSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.SuperState.class)) {
			info.scce.cinco.product.scchart.scchart.SuperState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.SuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.SuperState.class)) {
			info.scce.cinco.product.scchart.scchart.SuperState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.SuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSimpleState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final int x, final int y) {
		return newSimpleState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final String id, final int x, final int y) {
		return newSimpleState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.SimpleState.class)) {
			info.scce.cinco.product.scchart.scchart.SimpleState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSimpleState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.SimpleState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.SimpleState.class)) {
			info.scce.cinco.product.scchart.scchart.SimpleState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSimpleState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.SimpleState.class, this.getClass()));
		
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
	public EList<InitialSCChartReferece> getInitialSCChartRefereces() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInitialSCChartReferece() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final int x, final int y) {
		return newInitialSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final String id, final int x, final int y) {
		return newInitialSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class)) {
			info.scce.cinco.product.scchart.scchart.InitialSCChartReferece node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInitialSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", InitialSCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.InitialSCChartReferece.class)) {
			info.scce.cinco.product.scchart.scchart.InitialSCChartReferece node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createInitialSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.scchart.internal.InternalInitialSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", InitialSCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartRefereces() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFinalSCChartReferece() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final int x, final int y) {
		return newFinalSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final String id, final int x, final int y) {
		return newFinalSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class)) {
			info.scce.cinco.product.scchart.scchart.FinalSCChartReferece node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createFinalSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", FinalSCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class)) {
			info.scce.cinco.product.scchart.scchart.FinalSCChartReferece node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createFinalSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", FinalSCChartReferece.class, this.getClass()));
		
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
	public EList<FinalSuperState> getFinalSuperStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFinalSuperState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final int x, final int y) {
		return newFinalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final String id, final int x, final int y) {
		return newFinalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class)) {
			info.scce.cinco.product.scchart.scchart.FinalSuperState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createFinalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.FinalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.FinalSuperState.class)) {
			info.scce.cinco.product.scchart.scchart.FinalSuperState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createFinalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.FinalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStates() {
		return getModelElements(info.scce.cinco.product.scchart.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFinalState() {
		return this.canContain(info.scce.cinco.product.scchart.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final int x, final int y) {
		return newFinalState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final String id, final int x, final int y) {
		return newFinalState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.FinalState.class)) {
			info.scce.cinco.product.scchart.scchart.FinalState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createFinalState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.FinalState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.scchart.FinalState.class)) {
			info.scce.cinco.product.scchart.scchart.FinalState node = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createFinalState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.scchart.FinalState.class, this.getClass()));
		
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
		// event.pre.move.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final Region region, final int x, final int y) {
		return region.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
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
		return dataFlowRegion.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
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
		return sCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
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
		return initialSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
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
		return finalSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece.class);
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
	public RootState getReference() {
		String uid = ((info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece)getInternalElement()).getLibraryComponentUID();
		return (info.scce.cinco.product.scchart.scchart.RootState) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartRefereceView getFinalSCChartRefereceView() {
		FinalSCChartRefereceView finalSCChartRefereceView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createFinalSCChartRefereceView();
		finalSCChartRefereceView.setInternalFinalSCChartReferece((info.scce.cinco.product.scchart.scchart.internal.InternalFinalSCChartReferece)getInternalElement());
		return finalSCChartRefereceView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Container.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.CONTAINER___PRE_DELETE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE;
				case GraphmodelPackage.CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SCChartReferece.class) {
			switch (baseOperationID) {
				case ScchartPackage.SC_CHART_REFERECE___PRE_DELETE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE;
				case ScchartPackage.SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.SC_CHART_REFERECE___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT;
				case ScchartPackage.SC_CHART_REFERECE___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case ScchartPackage.SC_CHART_REFERECE___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				case ScchartPackage.SC_CHART_REFERECE___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;
				case ScchartPackage.SC_CHART_REFERECE___GET_NODES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_NODES;
				case ScchartPackage.SC_CHART_REFERECE___GET_OPERATORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OPERATORS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_OPERATOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_OPERATOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OPERATOR__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OPERATOR__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OPERATOR__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OPERATOR__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_ROOT_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_ROOT_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ROOT_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_INPUTS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INPUTS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INPUT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INPUT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INPUT__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INPUT__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INPUT__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INPUT__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUSPENDS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUSPENDS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SUSPEND: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUSPEND;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_CONNECTORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTORS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INITIAL_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SC_CHART_REFERECES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SC_CHART_REFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SC_CHART_REFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_DECLARATIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_DECLARATIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DECLARATION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DECLARATION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_CIRCUIT_CONNECTERS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CIRCUIT_CONNECTERS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CIRCUIT_CONNECTER: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CIRCUIT_CONNECTER;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTPUTS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTPUTS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_OUTPUT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_OUTPUT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OUTPUT__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OUTPUT__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OUTPUT__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_OUTPUT__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_DATA_FLOW_REGIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_DATA_FLOW_REGIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DATA_FLOW_REGION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DATA_FLOW_REGION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITILAL_SUPER_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INITILAL_SUPER_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITILAL_SUPER_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUPER_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SUPER_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUPER_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SIMPLE_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SIMPLE_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SIMPLE_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_ACTIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ACTIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_ACTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ACTION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INITIAL_SC_CHART_REFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_SC_CHART_REFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_FINAL_SC_CHART_REFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SC_CHART_REFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_REGIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REGIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_REGION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_REGION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SUPER_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_FINAL_SUPER_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SUPER_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_FINAL_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__REGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__DATAFLOWREGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__DATAFLOWREGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__DATAFLOWREGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__DATAFLOWREGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_REFERENCE: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REFERENCE;
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
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INTERNAL_FINAL_SC_CHART_REFERECE:
				return getInternalFinalSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___IS_EXACTLY_FINAL_SC_CHART_REFERECE:
				return isExactlyFinalSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_NODES:
				return getNodes();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OPERATORS:
				return getOperators();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_OPERATOR:
				return canNewOperator();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__INT_INT:
				return newOperator((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__STRING_INT_INT:
				return newOperator((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__INT_INT_INT_INT:
				return newOperator((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OPERATOR__STRING_INT_INT_INT_INT:
				return newOperator((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_STATES:
				return getRootStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ROOT_STATE:
				return canNewRootState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT:
				return newRootState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT:
				return newRootState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT_INT_INT:
				return newRootState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT_INT_INT:
				return newRootState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INPUTS:
				return getInputs();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INPUT:
				return canNewInput();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__INT_INT:
				return newInput((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__STRING_INT_INT:
				return newInput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__INT_INT_INT_INT:
				return newInput((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INPUT__STRING_INT_INT_INT_INT:
				return newInput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUSPENDS:
				return getSuspends();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUSPEND:
				return canNewSuspend();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT_INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTORS:
				return getConnectors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONNECTOR:
				return canNewConnector();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT:
				return newConnector((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT:
				return newConnector((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT_INT_INT:
				return newConnector((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT_INT_INT:
				return newConnector((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATES:
				return getInitialStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_STATE:
				return canNewInitialState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT:
				return newInitialState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT:
				return newInitialState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT_INT_INT:
				return newInitialState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT:
				return newInitialState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECES:
				return getSCChartRefereces();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SC_CHART_REFERECE:
				return canNewSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_DECLARATIONS:
				return getDeclarations();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DECLARATION:
				return canNewDeclaration();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT_INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CIRCUIT_CONNECTERS:
				return getCircuitConnecters();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CIRCUIT_CONNECTER:
				return canNewCircuitConnecter();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__INT_INT:
				return newCircuitConnecter((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__STRING_INT_INT:
				return newCircuitConnecter((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__INT_INT_INT_INT:
				return newCircuitConnecter((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CIRCUIT_CONNECTER__STRING_INT_INT_INT_INT:
				return newCircuitConnecter((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTPUTS:
				return getOutputs();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_OUTPUT:
				return canNewOutput();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__INT_INT:
				return newOutput((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__STRING_INT_INT:
				return newOutput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__INT_INT_INT_INT:
				return newOutput((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_OUTPUT__STRING_INT_INT_INT_INT:
				return newOutput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_DATA_FLOW_REGIONS:
				return getDataFlowRegions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DATA_FLOW_REGION:
				return canNewDataFlowRegion();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__INT_INT:
				return newDataFlowRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__STRING_INT_INT:
				return newDataFlowRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT:
				return newDataFlowRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT:
				return newDataFlowRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATES:
				return getInitilalSuperStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITILAL_SUPER_STATE:
				return canNewInitilalSuperState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT:
				return newInitilalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT:
				return newInitilalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT:
				return newInitilalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newInitilalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATES:
				return getSuperStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUPER_STATE:
				return canNewSuperState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT:
				return newSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT:
				return newSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT_INT_INT:
				return newSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATES:
				return getSimpleStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SIMPLE_STATE:
				return canNewSimpleState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT:
				return newSimpleState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT:
				return newSimpleState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT_INT_INT:
				return newSimpleState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT:
				return newSimpleState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ACTIONS:
				return getActions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ACTION:
				return canNewAction();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT_INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECES:
				return getInitialSCChartRefereces();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_SC_CHART_REFERECE:
				return canNewInitialSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECES:
				return getFinalSCChartRefereces();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SC_CHART_REFERECE:
				return canNewFinalSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REGIONS:
				return getRegions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_REGION:
				return canNewRegion();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT_INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATES:
				return getFinalSuperStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SUPER_STATE:
				return canNewFinalSuperState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT:
				return newFinalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT:
				return newFinalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT:
				return newFinalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newFinalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATES:
				return getFinalStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_STATE:
				return canNewFinalState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT:
				return newFinalState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT:
				return newFinalState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT_INT_INT:
				return newFinalState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT_INT_INT:
				return newFinalState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT:
				return canMoveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__DATAFLOWREGION_INT_INT:
				moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__DATAFLOWREGION_INT_INT:
				s_moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT:
				return canMoveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__SCCHARTREFERECE_INT_INT:
				moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__SCCHARTREFERECE_INT_INT:
				s_moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				return canMoveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				s_moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				return canMoveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				s_moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REFERENCE:
				return getReference();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_VIEW:
				return getFinalSCChartRefereceView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FinalSCChartRefereceImpl
