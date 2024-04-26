/**
 */
package info.scce.cinco.product.scchart.scchart.impl;

import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.NodeImpl;

import info.scce.cinco.product.scchart.scchart.CircuitConnecter;
import info.scce.cinco.product.scchart.scchart.Connection;
import info.scce.cinco.product.scchart.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.scchart.Input;
import info.scce.cinco.product.scchart.scchart.Operator;
import info.scce.cinco.product.scchart.scchart.Output;
import info.scce.cinco.product.scchart.scchart.RootState;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.scchart.internal.InternalOperator;

import info.scce.cinco.product.scchart.scchart.views.OperatorView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperatorImpl extends NodeImpl implements Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return getInternalOperator().getOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(final String _arg) {
		getInternalOperator().getElement().transact("Set Operator", () -> {
			getInternalOperator().setOperator(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalOperator getInternalOperator() {
		return (info.scce.cinco.product.scchart.scchart.internal.InternalOperator) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyOperator() {
		return true;
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
		return () -> {};
		
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
	public EList<? extends Connection> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (info.scce.cinco.product.scchart.scchart.Connection)me.getElement()).
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
	public EList<? extends Connection> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
			.stream().map(me -> (info.scce.cinco.product.scchart.scchart.Connection)me.getElement()).
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
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoingConnections() {
		return this.getOutgoing(info.scce.cinco.product.scchart.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncomingConnections() {
		return this.getIncoming(info.scce.cinco.product.scchart.scchart.Connection.class);
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
	public EList<Input> getInputPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperatorPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitConnecter> getCircuitConnecterPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.Output.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperatorSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitConnecter> getCircuitConnecterSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConnection(final Operator target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final Operator target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Connection edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnection((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Connection newConnection(final Operator target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Connection edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnection(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConnection(final CircuitConnecter target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final CircuitConnecter target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Connection edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnection((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Connection newConnection(final CircuitConnecter target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Connection edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnection(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConnection(final Output target) {
		return this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class) && target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final Output target) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.scchart.Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.scchart.Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Connection edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnection((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Connection newConnection(final Output target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.scchart.Connection edge = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createConnection(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canMoveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		return dataFlowRegion.canContain(info.scce.cinco.product.scchart.scchart.Operator.class);
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
			s_moveTo(dataFlowRegion, x, y);
			dataFlowRegion.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
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
		return sCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.Operator.class);
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
			s_moveTo(sCChartReferece, x, y);
			sCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
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
		return initialSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.Operator.class);
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
			s_moveTo(initialSCChartReferece, x, y);
			initialSCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
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
		return finalSCChartReferece.canContain(info.scce.cinco.product.scchart.scchart.Operator.class);
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
			s_moveTo(finalSCChartReferece, x, y);
			finalSCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
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
	public OperatorView getOperatorView() {
		OperatorView operatorView = info.scce.cinco.product.scchart.scchart.views.ViewsFactory.eINSTANCE.createOperatorView();
		operatorView.setInternalOperator((info.scce.cinco.product.scchart.scchart.internal.InternalOperator)getInternalElement());
		return operatorView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.OPERATOR___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.OPERATOR___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.OPERATOR___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.OPERATOR___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.OPERATOR___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.OPERATOR___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.OPERATOR___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.OPERATOR___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.OPERATOR___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.OPERATOR___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.OPERATOR___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.OPERATOR___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.OPERATOR___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.OPERATOR___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.OPERATOR___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.OPERATOR___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.OPERATOR___GET_OUTGOING;
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
			case ScchartPackage.OPERATOR___GET_OPERATOR:
				return getOperator();
			case ScchartPackage.OPERATOR___SET_OPERATOR__STRING:
				setOperator((String)arguments.get(0));
				return null;
			case ScchartPackage.OPERATOR___GET_INTERNAL_OPERATOR:
				return getInternalOperator();
			case ScchartPackage.OPERATOR___IS_EXACTLY_OPERATOR:
				return isExactlyOperator();
			case ScchartPackage.OPERATOR___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.OPERATOR___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.OPERATOR___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.OPERATOR___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.OPERATOR___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.OPERATOR___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.OPERATOR___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.OPERATOR___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.OPERATOR___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.OPERATOR___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.OPERATOR___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.OPERATOR___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.OPERATOR___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.OPERATOR___GET_OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case ScchartPackage.OPERATOR___GET_INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case ScchartPackage.OPERATOR___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.OPERATOR___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case ScchartPackage.OPERATOR___GET_OPERATOR_PREDECESSORS:
				return getOperatorPredecessors();
			case ScchartPackage.OPERATOR___GET_CIRCUIT_CONNECTER_PREDECESSORS:
				return getCircuitConnecterPredecessors();
			case ScchartPackage.OPERATOR___GET_OUTPUT_SUCCESSORS:
				return getOutputSuccessors();
			case ScchartPackage.OPERATOR___GET_OPERATOR_SUCCESSORS:
				return getOperatorSuccessors();
			case ScchartPackage.OPERATOR___GET_CIRCUIT_CONNECTER_SUCCESSORS:
				return getCircuitConnecterSuccessors();
			case ScchartPackage.OPERATOR___CAN_NEW_CONNECTION__OPERATOR:
				return canNewConnection((Operator)arguments.get(0));
			case ScchartPackage.OPERATOR___NEW_CONNECTION__OPERATOR:
				return newConnection((Operator)arguments.get(0));
			case ScchartPackage.OPERATOR___NEW_CONNECTION__OPERATOR_STRING:
				return newConnection((Operator)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.OPERATOR___CAN_NEW_CONNECTION__CIRCUITCONNECTER:
				return canNewConnection((CircuitConnecter)arguments.get(0));
			case ScchartPackage.OPERATOR___NEW_CONNECTION__CIRCUITCONNECTER:
				return newConnection((CircuitConnecter)arguments.get(0));
			case ScchartPackage.OPERATOR___NEW_CONNECTION__CIRCUITCONNECTER_STRING:
				return newConnection((CircuitConnecter)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.OPERATOR___CAN_NEW_CONNECTION__OUTPUT:
				return canNewConnection((Output)arguments.get(0));
			case ScchartPackage.OPERATOR___NEW_CONNECTION__OUTPUT:
				return newConnection((Output)arguments.get(0));
			case ScchartPackage.OPERATOR___NEW_CONNECTION__OUTPUT_STRING:
				return newConnection((Output)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.OPERATOR___CAN_MOVE_TO__DATAFLOWREGION_INT_INT:
				return canMoveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.OPERATOR___MOVE_TO__DATAFLOWREGION_INT_INT:
				moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___SMOVE_TO__DATAFLOWREGION_INT_INT:
				s_moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT:
				return canMoveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.OPERATOR___MOVE_TO__SCCHARTREFERECE_INT_INT:
				moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___SMOVE_TO__SCCHARTREFERECE_INT_INT:
				s_moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				return canMoveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.OPERATOR___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				s_moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				return canMoveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.OPERATOR___MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				s_moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.OPERATOR___GET_OPERATOR_VIEW:
				return getOperatorView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorImpl
