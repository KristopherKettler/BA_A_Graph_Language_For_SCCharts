/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getSuperState()
 * @model
 * @generated
 */
public interface SuperState extends Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalSuperState getInternalSuperState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlySuperState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SCChart getRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Action newAction(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Action newAction(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Action newAction(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Action newAction(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewRegion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Region newRegion(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Region newRegion(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Region newRegion(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Region newRegion(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Suspension> getSuspensions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSuspension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Suspension newSuspension(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Suspension newSuspension(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Suspension newSuspension(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Suspension newSuspension(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends AbstractTransition> getOutgoing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends AbstractTransition> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(ModelElementContainer container, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newContainerRequired="true" newXRequired="true" newYRequired="true"
	 * @generated
	 */
	void preMove(ModelElementContainer newContainer, int newX, int newY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" targetRequired="true" xRequired="true" yRequired="true" deltaXRequired="true" deltaYRequired="true"
	 * @generated
	 */
	void postMove(ModelElementContainer source, ModelElementContainer target, int x, int y, int deltaX, int deltaY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newWidthRequired="true" newHeightRequired="true" newXRequired="true" newYRequired="true" directionRequired="true"
	 * @generated
	 */
	void preResize(int newWidth, int newHeight, int newX, int newY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldWidthRequired="true" oldHeightRequired="true" oldXRequired="true" oldYRequired="true" directionRequired="true"
	 * @generated
	 */
	void postResize(int oldWidth, int oldHeight, int oldX, int oldY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationDeferredTransition> getOutgoingTerminationDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DeferredTransition> getOutgoingDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationTransition> getOutgoingTerminationTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractTransition> getOutgoingAbstractTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationDeferredHistoryTransition> getOutgoingTerminationDeferredHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortDeferredHistoryTransition> getOutgoingStrongAbortDeferredHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DeferredHistoryTransition> getOutgoingDeferredHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortTransition> getOutgoingStrongAbortTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<HistoryTransition> getOutgoingHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationDeferredTransition> getIncomingTerminationDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationHistoryTransition> getIncomingTerminationHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DeferredTransition> getIncomingDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationTransition> getIncomingTerminationTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractTransition> getIncomingAbstractTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationDeferredHistoryTransition> getIncomingTerminationDeferredHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortDeferredTransition> getIncomingStrongAbortDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortDeferredHistoryTransition> getIncomingStrongAbortDeferredHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortHistoryTransition> getIncomingStrongAbortHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DeferredHistoryTransition> getIncomingDeferredHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortTransition> getIncomingStrongAbortTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<HistoryTransition> getIncomingHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<RootState> getRootStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SuperState> getSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSuperState> getInitialSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSuperState> getFinalSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialFinalSuperState> getInitialFinalSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SimpleState> getSimpleStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialState> getInitialStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalState> getFinalStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialFinalState> getInitialFinalStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getConnectorPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SCChartReferece> getSCChartReferecePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSCChartReferece> getInitialSCChartReferecePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSCChartReferece> getFinalSCChartReferecePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialFinalSCChartReferece> getInitialFinalSCChartReferecePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SuperState> getSuperStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSuperState> getInitialSuperStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSuperState> getFinalSuperStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialFinalSuperState> getInitialFinalSuperStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SimpleState> getSimpleStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialState> getInitialStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalState> getFinalStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialFinalState> getInitialFinalStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getConnectorSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SCChartReferece> getSCChartRefereceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSCChartReferece> getInitialSCChartRefereceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSCChartReferece> getFinalSCChartRefereceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialFinalSCChartReferece> getInitialFinalSCChartRefereceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredHistoryTransition newTerminationDeferredHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialFinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialFinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialFinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition newStrongAbortDeferredHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDeferredTransition newTerminationDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialFinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialFinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialFinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredHistoryTransition newDeferredHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialFinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialFinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialFinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialFinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialFinalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialFinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialFinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" regionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(Region region, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model regionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(Region region, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model regionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(Region region, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Region getContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SuperStateView getSuperStateView();

} // SuperState
