/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
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
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector;

import info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectorImpl extends SimpleStateImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnector getInternalConnector() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyConnector() {
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
		return (info.scce.cinco.product.scchart.mglid.scchart.SCChart) this.getInternalElement().getRootElement().getElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends AbstractTransition> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
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
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
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
	public EList<Transition> getOutgoingTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
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
	public EList<DeferredHistoryTransition> getOutgoingDeferredHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition.class);
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
	public EList<TerminationTransition> getIncomingTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
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
	public EList<AbstractTransition> getIncomingAbstractTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition.class);
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
		return region.canContain(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
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
			s_moveTo(region, x, y);
			region.getInternalContainerElement().getModelElements().add(ime);
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
	public ConnectorView getConnectorView() {
		ConnectorView connectorView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createConnectorView();
		connectorView.setInternalConnector((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector)getInternalElement());
		return connectorView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.CONNECTOR___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.CONNECTOR___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.CONNECTOR___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.CONNECTOR___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.CONNECTOR___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.CONNECTOR___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.CONNECTOR___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.CONNECTOR___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.CONNECTOR___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.CONNECTOR___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.CONNECTOR___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.CONNECTOR___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.CONNECTOR___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.CONNECTOR___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.CONNECTOR___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.CONNECTOR___GET_OUTGOING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SimpleState.class) {
			switch (baseOperationID) {
				case ScchartPackage.SIMPLE_STATE___PRE_DELETE: return ScchartPackage.CONNECTOR___PRE_DELETE;
				case ScchartPackage.SIMPLE_STATE___GET_POST_DELETE_FUNCTION: return ScchartPackage.CONNECTOR___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.SIMPLE_STATE___GET_POST_DELETE_EVENT: return ScchartPackage.CONNECTOR___GET_POST_DELETE_EVENT;
				case ScchartPackage.SIMPLE_STATE___PRE_SAVE: return ScchartPackage.CONNECTOR___PRE_SAVE;
				case ScchartPackage.SIMPLE_STATE___POST_SAVE: return ScchartPackage.CONNECTOR___POST_SAVE;
				case ScchartPackage.SIMPLE_STATE___GET_ROOT_ELEMENT: return ScchartPackage.CONNECTOR___GET_ROOT_ELEMENT;
				case ScchartPackage.SIMPLE_STATE___GET_OUTGOING: return ScchartPackage.CONNECTOR___GET_OUTGOING;
				case ScchartPackage.SIMPLE_STATE___GET_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INCOMING: return ScchartPackage.CONNECTOR___GET_INCOMING;
				case ScchartPackage.SIMPLE_STATE___GET_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.CONNECTOR___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SIMPLE_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.CONNECTOR___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SIMPLE_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.CONNECTOR___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case ScchartPackage.SIMPLE_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.CONNECTOR___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SIMPLE_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.CONNECTOR___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SIMPLE_STATE___GET_OUTGOING_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_OUTGOING_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_OUTGOING_DEFERRED_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_OUTGOING_DEFERRED_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_OUTGOING_DEFERRED_HISTORY_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_OUTGOING_DEFERRED_HISTORY_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_OUTGOING_ABSTRACT_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_OUTGOING_ABSTRACT_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_OUTGOING_HISTORY_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_OUTGOING_HISTORY_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_INCOMING_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_INCOMING_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_INCOMING_TERMINATION_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_INCOMING_TERMINATION_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_INCOMING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_INCOMING_ABSTRACT_TRANSITIONS: return ScchartPackage.CONNECTOR___GET_INCOMING_ABSTRACT_TRANSITIONS;
				case ScchartPackage.SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_ROOT_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_SUPER_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_FINAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_FINAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_FINAL_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_FINAL_STATE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_STATE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_CONNECTOR_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_FINAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_FINAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_FINAL_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_FINAL_STATE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_STATE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_CONNECTOR_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__FINALSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__FINALSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__FINALSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__INITIALSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__INITIALFINALSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALFINALSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALFINALSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALFINALSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALFINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__CONNECTOR: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__CONNECTOR: return ScchartPackage.CONNECTOR___NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__CONNECTOR_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SIMPLE_STATE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SIMPLE_STATE___CAN_MOVE_TO__REGION_INT_INT: return ScchartPackage.CONNECTOR___CAN_MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SIMPLE_STATE___MOVE_TO__REGION_INT_INT: return ScchartPackage.CONNECTOR___MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SIMPLE_STATE___SMOVE_TO__REGION_INT_INT: return ScchartPackage.CONNECTOR___SMOVE_TO__REGION_INT_INT;
				case ScchartPackage.SIMPLE_STATE___GET_CONTAINER: return ScchartPackage.CONNECTOR___GET_CONTAINER;
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
			case ScchartPackage.CONNECTOR___GET_INTERNAL_CONNECTOR:
				return getInternalConnector();
			case ScchartPackage.CONNECTOR___IS_EXACTLY_CONNECTOR:
				return isExactlyConnector();
			case ScchartPackage.CONNECTOR___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.CONNECTOR___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.CONNECTOR___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.CONNECTOR___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.CONNECTOR___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.CONNECTOR___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.CONNECTOR___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.CONNECTOR___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.CONNECTOR___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.CONNECTOR___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.CONNECTOR___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CONNECTOR___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CONNECTOR___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.CONNECTOR___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.CONNECTOR___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.CONNECTOR___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.CONNECTOR___GET_OUTGOING_DEFERRED_TRANSITIONS:
				return getOutgoingDeferredTransitions();
			case ScchartPackage.CONNECTOR___GET_OUTGOING_DEFERRED_HISTORY_TRANSITIONS:
				return getOutgoingDeferredHistoryTransitions();
			case ScchartPackage.CONNECTOR___GET_OUTGOING_ABSTRACT_TRANSITIONS:
				return getOutgoingAbstractTransitions();
			case ScchartPackage.CONNECTOR___GET_OUTGOING_HISTORY_TRANSITIONS:
				return getOutgoingHistoryTransitions();
			case ScchartPackage.CONNECTOR___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ScchartPackage.CONNECTOR___GET_INCOMING_TERMINATION_TRANSITIONS:
				return getIncomingTerminationTransitions();
			case ScchartPackage.CONNECTOR___GET_INCOMING_STRONG_ABORT_TRANSITIONS:
				return getIncomingStrongAbortTransitions();
			case ScchartPackage.CONNECTOR___GET_INCOMING_ABSTRACT_TRANSITIONS:
				return getIncomingAbstractTransitions();
			case ScchartPackage.CONNECTOR___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_SUPER_STATE_PREDECESSORS:
				return getInitialSuperStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SUPER_STATE_PREDECESSORS:
				return getInitialFinalSuperStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_STATE_PREDECESSORS:
				return getInitialFinalStatePredecessors();
			case ScchartPackage.CONNECTOR___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case ScchartPackage.CONNECTOR___GET_SC_CHART_REFERECE_PREDECESSORS:
				return getSCChartReferecePredecessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialSCChartReferecePredecessors();
			case ScchartPackage.CONNECTOR___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getFinalSCChartReferecePredecessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialFinalSCChartReferecePredecessors();
			case ScchartPackage.CONNECTOR___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_SUPER_STATE_SUCCESSORS:
				return getInitialSuperStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SUPER_STATE_SUCCESSORS:
				return getInitialFinalSuperStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_STATE_SUCCESSORS:
				return getInitialFinalStateSuccessors();
			case ScchartPackage.CONNECTOR___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.CONNECTOR___GET_SC_CHART_REFERECE_SUCCESSORS:
				return getSCChartRefereceSuccessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialSCChartRefereceSuccessors();
			case ScchartPackage.CONNECTOR___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getFinalSCChartRefereceSuccessors();
			case ScchartPackage.CONNECTOR___GET_INITIAL_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialFinalSCChartRefereceSuccessors();
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSCCHARTREFERECE:
				return newTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__FINALSUPERSTATE:
				return canNewTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSUPERSTATE:
				return newTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSUPERSTATE_STRING:
				return newTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALFINALSTATE:
				return canNewTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSTATE:
				return newTransition((InitialFinalState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSTATE_STRING:
				return newTransition((InitialFinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSUPERSTATE:
				return newTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALSUPERSTATE:
				return canNewTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSUPERSTATE:
				return newTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSUPERSTATE_STRING:
				return newTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSCCHARTREFERECE:
				return newTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__SUPERSTATE:
				return canNewTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__SUPERSTATE:
				return newTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__SUPERSTATE_STRING:
				return newTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_TRANSITION__SCCHARTREFERECE:
				return canNewTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__SCCHARTREFERECE:
				return newTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_TRANSITION__SCCHARTREFERECE_STRING:
				return newTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return newDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE:
				return newDeferredTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newDeferredTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return canNewDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE:
				return newDeferredTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSUPERSTATE_STRING:
				return newDeferredTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newDeferredTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newDeferredTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return canNewDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE:
				return newDeferredHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newDeferredHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newDeferredHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newDeferredHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newDeferredHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newDeferredHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newDeferredHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newDeferredHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_DEFERRED_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newDeferredHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE:
				return canNewHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SUPERSTATE:
				return newHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return canNewHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE:
				return newHistoryTransition((InitialFinalSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSUPERSTATE_STRING:
				return newHistoryTransition((InitialFinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return canNewHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE:
				return newHistoryTransition((InitialSuperState)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSUPERSTATE_STRING:
				return newHistoryTransition((InitialSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return canNewHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE:
				return newHistoryTransition((InitialFinalSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALFINALSCCHARTREFERECE_STRING:
				return newHistoryTransition((InitialFinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.CONNECTOR___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CONNECTOR___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.CONNECTOR___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CONNECTOR___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CONNECTOR___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.CONNECTOR___GET_CONNECTOR_VIEW:
				return getConnectorView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectorImpl
