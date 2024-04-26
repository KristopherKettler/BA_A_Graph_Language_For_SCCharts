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

import info.scce.cinco.product.scchart.scchart.CircuitConnecter;
import info.scce.cinco.product.scchart.scchart.Connector;
import info.scce.cinco.product.scchart.scchart.DataFlowRegion;
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

import info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion;

import info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DataFlowRegionImpl extends RegionImpl implements DataFlowRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getDataFlowRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDataFlowRegion getInternalDataFlowRegion() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyDataFlowRegion() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_scchart_DataFlowRegion
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_scchart_DataFlowRegion", eventPayload);
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
		// event.post.delete.info_scce_cinco_product_scchart_scchart_DataFlowRegion
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_scchart_DataFlowRegion", eventPayload);
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
		// event.pre.move.info_scce_cinco_product_scchart_scchart_DataFlowRegion
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_scchart_DataFlowRegion", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_scchart_DataFlowRegion
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_scchart_DataFlowRegion", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_scchart_DataFlowRegion
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_scchart_DataFlowRegion", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_scchart_DataFlowRegion
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_scchart_DataFlowRegion", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final RootState rootState, final int x, final int y) {
		return rootState.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final RootState rootState, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(rootState, x, y);
			s_moveTo(rootState, x, y);
			rootState.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, rootState, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final RootState rootState, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final SuperState superState, final int x, final int y) {
		return superState.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final SuperState superState, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(superState, x, y);
			s_moveTo(superState, x, y);
			superState.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, superState, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final SuperState superState, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final InitilalSuperState initilalSuperState, final int x, final int y) {
		return initilalSuperState.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final InitilalSuperState initilalSuperState, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(initilalSuperState, x, y);
			s_moveTo(initilalSuperState, x, y);
			initilalSuperState.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, initilalSuperState, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final InitilalSuperState initilalSuperState, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final FinalSuperState finalSuperState, final int x, final int y) {
		return finalSuperState.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final FinalSuperState finalSuperState, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(finalSuperState, x, y);
			s_moveTo(finalSuperState, x, y);
			finalSuperState.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, finalSuperState, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final FinalSuperState finalSuperState, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		return sCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
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
		return initialSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
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
		return finalSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.DataFlowRegion.class);
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
	public DataFlowRegionView getDataFlowRegionView() {
		DataFlowRegionView dataFlowRegionView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createDataFlowRegionView();
		dataFlowRegionView.setInternalDataFlowRegion((info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion)getInternalElement());
		return dataFlowRegionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.DATA_FLOW_REGION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.DATA_FLOW_REGION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.DATA_FLOW_REGION___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.DATA_FLOW_REGION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.DATA_FLOW_REGION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.DATA_FLOW_REGION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.DATA_FLOW_REGION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.DATA_FLOW_REGION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.DATA_FLOW_REGION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.DATA_FLOW_REGION___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.DATA_FLOW_REGION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.DATA_FLOW_REGION___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Container.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.DATA_FLOW_REGION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_FUNCTION: return ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_EVENT: return ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.CONTAINER___PRE_DELETE: return ScchartPackage.DATA_FLOW_REGION___PRE_DELETE;
				case GraphmodelPackage.CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.DATA_FLOW_REGION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.DATA_FLOW_REGION___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_ROOT_ELEMENT: return ScchartPackage.DATA_FLOW_REGION___GET_ROOT_ELEMENT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Region.class) {
			switch (baseOperationID) {
				case ScchartPackage.REGION___PRE_DELETE: return ScchartPackage.DATA_FLOW_REGION___PRE_DELETE;
				case ScchartPackage.REGION___GET_POST_DELETE_FUNCTION: return ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.REGION___GET_POST_DELETE_EVENT: return ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_EVENT;
				case ScchartPackage.REGION___PRE_SAVE: return ScchartPackage.DATA_FLOW_REGION___PRE_SAVE;
				case ScchartPackage.REGION___POST_SAVE: return ScchartPackage.DATA_FLOW_REGION___POST_SAVE;
				case ScchartPackage.REGION___GET_ROOT_ELEMENT: return ScchartPackage.DATA_FLOW_REGION___GET_ROOT_ELEMENT;
				case ScchartPackage.REGION___GET_NODES: return ScchartPackage.DATA_FLOW_REGION___GET_NODES;
				case ScchartPackage.REGION___GET_INITILAL_SUPER_STATES: return ScchartPackage.DATA_FLOW_REGION___GET_INITILAL_SUPER_STATES;
				case ScchartPackage.REGION___CAN_NEW_INITILAL_SUPER_STATE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INITILAL_SUPER_STATE;
				case ScchartPackage.REGION___NEW_INITILAL_SUPER_STATE__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__INT_INT;
				case ScchartPackage.REGION___NEW_INITILAL_SUPER_STATE__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_CONNECTORS: return ScchartPackage.DATA_FLOW_REGION___GET_CONNECTORS;
				case ScchartPackage.REGION___CAN_NEW_CONNECTOR: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_CONNECTOR;
				case ScchartPackage.REGION___NEW_CONNECTOR__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__INT_INT;
				case ScchartPackage.REGION___NEW_CONNECTOR__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_CONNECTOR__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_CONNECTOR__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_SUPER_STATES: return ScchartPackage.DATA_FLOW_REGION___GET_SUPER_STATES;
				case ScchartPackage.REGION___CAN_NEW_SUPER_STATE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_SUPER_STATE;
				case ScchartPackage.REGION___NEW_SUPER_STATE__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__INT_INT;
				case ScchartPackage.REGION___NEW_SUPER_STATE__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_SIMPLE_STATES: return ScchartPackage.DATA_FLOW_REGION___GET_SIMPLE_STATES;
				case ScchartPackage.REGION___CAN_NEW_SIMPLE_STATE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_SIMPLE_STATE;
				case ScchartPackage.REGION___NEW_SIMPLE_STATE__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__INT_INT;
				case ScchartPackage.REGION___NEW_SIMPLE_STATE__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_SIMPLE_STATE__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_INITIAL_STATES: return ScchartPackage.DATA_FLOW_REGION___GET_INITIAL_STATES;
				case ScchartPackage.REGION___CAN_NEW_INITIAL_STATE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INITIAL_STATE;
				case ScchartPackage.REGION___NEW_INITIAL_STATE__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__INT_INT;
				case ScchartPackage.REGION___NEW_INITIAL_STATE__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_INITIAL_STATE__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_INITIAL_SC_CHART_REFERECES: return ScchartPackage.DATA_FLOW_REGION___GET_INITIAL_SC_CHART_REFERECES;
				case ScchartPackage.REGION___CAN_NEW_INITIAL_SC_CHART_REFERECE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INITIAL_SC_CHART_REFERECE;
				case ScchartPackage.REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_FINAL_SC_CHART_REFERECES: return ScchartPackage.DATA_FLOW_REGION___GET_FINAL_SC_CHART_REFERECES;
				case ScchartPackage.REGION___CAN_NEW_FINAL_SC_CHART_REFERECE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_FINAL_SC_CHART_REFERECE;
				case ScchartPackage.REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_SC_CHART_REFERECES: return ScchartPackage.DATA_FLOW_REGION___GET_SC_CHART_REFERECES;
				case ScchartPackage.REGION___CAN_NEW_SC_CHART_REFERECE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_SC_CHART_REFERECE;
				case ScchartPackage.REGION___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.REGION___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.REGION___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_FINAL_SUPER_STATES: return ScchartPackage.DATA_FLOW_REGION___GET_FINAL_SUPER_STATES;
				case ScchartPackage.REGION___CAN_NEW_FINAL_SUPER_STATE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_FINAL_SUPER_STATE;
				case ScchartPackage.REGION___NEW_FINAL_SUPER_STATE__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_SUPER_STATE__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___GET_FINAL_STATES: return ScchartPackage.DATA_FLOW_REGION___GET_FINAL_STATES;
				case ScchartPackage.REGION___CAN_NEW_FINAL_STATE: return ScchartPackage.DATA_FLOW_REGION___CAN_NEW_FINAL_STATE;
				case ScchartPackage.REGION___NEW_FINAL_STATE__INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_STATE__STRING_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__STRING_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_STATE__INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__INT_INT_INT_INT;
				case ScchartPackage.REGION___NEW_FINAL_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.REGION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.DATA_FLOW_REGION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.REGION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.DATA_FLOW_REGION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case ScchartPackage.REGION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.DATA_FLOW_REGION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.REGION___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.DATA_FLOW_REGION___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.REGION___CAN_MOVE_TO__ROOTSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__ROOTSTATE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__ROOTSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__ROOTSTATE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__ROOTSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__ROOTSTATE_INT_INT;
				case ScchartPackage.REGION___CAN_MOVE_TO__SUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__SUPERSTATE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__SUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__SUPERSTATE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__SUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__SUPERSTATE_INT_INT;
				case ScchartPackage.REGION___CAN_MOVE_TO__INITILALSUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__INITILALSUPERSTATE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__INITILALSUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__INITILALSUPERSTATE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__INITILALSUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__INITILALSUPERSTATE_INT_INT;
				case ScchartPackage.REGION___CAN_MOVE_TO__FINALSUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__FINALSUPERSTATE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__FINALSUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__FINALSUPERSTATE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__FINALSUPERSTATE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__FINALSUPERSTATE_INT_INT;
				case ScchartPackage.REGION___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.REGION___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT;
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
			case ScchartPackage.DATA_FLOW_REGION___GET_INTERNAL_DATA_FLOW_REGION:
				return getInternalDataFlowRegion();
			case ScchartPackage.DATA_FLOW_REGION___IS_EXACTLY_DATA_FLOW_REGION:
				return isExactlyDataFlowRegion();
			case ScchartPackage.DATA_FLOW_REGION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.DATA_FLOW_REGION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.DATA_FLOW_REGION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.DATA_FLOW_REGION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.DATA_FLOW_REGION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.DATA_FLOW_REGION___GET_NODES:
				return getNodes();
			case ScchartPackage.DATA_FLOW_REGION___GET_OPERATORS:
				return getOperators();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_OPERATOR:
				return canNewOperator();
			case ScchartPackage.DATA_FLOW_REGION___NEW_OPERATOR__INT_INT:
				return newOperator((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_OPERATOR__STRING_INT_INT:
				return newOperator((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_OPERATOR__INT_INT_INT_INT:
				return newOperator((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_OPERATOR__STRING_INT_INT_INT_INT:
				return newOperator((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_INPUTS:
				return getInputs();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INPUT:
				return canNewInput();
			case ScchartPackage.DATA_FLOW_REGION___NEW_INPUT__INT_INT:
				return newInput((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INPUT__STRING_INT_INT:
				return newInput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INPUT__INT_INT_INT_INT:
				return newInput((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INPUT__STRING_INT_INT_INT_INT:
				return newInput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_CONNECTORS:
				return getConnectors();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_CONNECTOR:
				return canNewConnector();
			case ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__INT_INT:
				return newConnector((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__STRING_INT_INT:
				return newConnector((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__INT_INT_INT_INT:
				return newConnector((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_CONNECTOR__STRING_INT_INT_INT_INT:
				return newConnector((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_INITIAL_STATES:
				return getInitialStates();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INITIAL_STATE:
				return canNewInitialState();
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__INT_INT:
				return newInitialState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__STRING_INT_INT:
				return newInitialState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__INT_INT_INT_INT:
				return newInitialState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT:
				return newInitialState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_SC_CHART_REFERECES:
				return getSCChartRefereces();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_SC_CHART_REFERECE:
				return canNewSCChartReferece();
			case ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.DATA_FLOW_REGION___GET_CIRCUIT_CONNECTERS:
				return getCircuitConnecters();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_CIRCUIT_CONNECTER:
				return canNewCircuitConnecter();
			case ScchartPackage.DATA_FLOW_REGION___NEW_CIRCUIT_CONNECTER__INT_INT:
				return newCircuitConnecter((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_CIRCUIT_CONNECTER__STRING_INT_INT:
				return newCircuitConnecter((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_CIRCUIT_CONNECTER__INT_INT_INT_INT:
				return newCircuitConnecter((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_CIRCUIT_CONNECTER__STRING_INT_INT_INT_INT:
				return newCircuitConnecter((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_OUTPUTS:
				return getOutputs();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_OUTPUT:
				return canNewOutput();
			case ScchartPackage.DATA_FLOW_REGION___NEW_OUTPUT__INT_INT:
				return newOutput((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_OUTPUT__STRING_INT_INT:
				return newOutput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_OUTPUT__INT_INT_INT_INT:
				return newOutput((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_OUTPUT__STRING_INT_INT_INT_INT:
				return newOutput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_INITILAL_SUPER_STATES:
				return getInitilalSuperStates();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INITILAL_SUPER_STATE:
				return canNewInitilalSuperState();
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__INT_INT:
				return newInitilalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__STRING_INT_INT:
				return newInitilalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT:
				return newInitilalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newInitilalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_SUPER_STATES:
				return getSuperStates();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_SUPER_STATE:
				return canNewSuperState();
			case ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__INT_INT:
				return newSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__STRING_INT_INT:
				return newSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__INT_INT_INT_INT:
				return newSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_SIMPLE_STATES:
				return getSimpleStates();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_SIMPLE_STATE:
				return canNewSimpleState();
			case ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__INT_INT:
				return newSimpleState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__STRING_INT_INT:
				return newSimpleState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__INT_INT_INT_INT:
				return newSimpleState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT:
				return newSimpleState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_INITIAL_SC_CHART_REFERECES:
				return getInitialSCChartRefereces();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_INITIAL_SC_CHART_REFERECE:
				return canNewInitialSCChartReferece();
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.DATA_FLOW_REGION___GET_FINAL_SC_CHART_REFERECES:
				return getFinalSCChartRefereces();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_FINAL_SC_CHART_REFERECE:
				return canNewFinalSCChartReferece();
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.DATA_FLOW_REGION___GET_FINAL_SUPER_STATES:
				return getFinalSuperStates();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_FINAL_SUPER_STATE:
				return canNewFinalSuperState();
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__INT_INT:
				return newFinalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__STRING_INT_INT:
				return newFinalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT:
				return newFinalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newFinalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___GET_FINAL_STATES:
				return getFinalStates();
			case ScchartPackage.DATA_FLOW_REGION___CAN_NEW_FINAL_STATE:
				return canNewFinalState();
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__INT_INT:
				return newFinalState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__STRING_INT_INT:
				return newFinalState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__INT_INT_INT_INT:
				return newFinalState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.DATA_FLOW_REGION___NEW_FINAL_STATE__STRING_INT_INT_INT_INT:
				return newFinalState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__ROOTSTATE_INT_INT:
				return canMoveTo((RootState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__ROOTSTATE_INT_INT:
				moveTo((RootState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__ROOTSTATE_INT_INT:
				s_moveTo((RootState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__SUPERSTATE_INT_INT:
				return canMoveTo((SuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__SUPERSTATE_INT_INT:
				moveTo((SuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__SUPERSTATE_INT_INT:
				s_moveTo((SuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__INITILALSUPERSTATE_INT_INT:
				return canMoveTo((InitilalSuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__INITILALSUPERSTATE_INT_INT:
				moveTo((InitilalSuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__INITILALSUPERSTATE_INT_INT:
				s_moveTo((InitilalSuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__FINALSUPERSTATE_INT_INT:
				return canMoveTo((FinalSuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__FINALSUPERSTATE_INT_INT:
				moveTo((FinalSuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__FINALSUPERSTATE_INT_INT:
				s_moveTo((FinalSuperState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT:
				return canMoveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__SCCHARTREFERECE_INT_INT:
				moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__SCCHARTREFERECE_INT_INT:
				s_moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				return canMoveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				s_moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				return canMoveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.DATA_FLOW_REGION___MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				s_moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.DATA_FLOW_REGION___GET_DATA_FLOW_REGION_VIEW:
				return getDataFlowRegionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataFlowRegionImpl
