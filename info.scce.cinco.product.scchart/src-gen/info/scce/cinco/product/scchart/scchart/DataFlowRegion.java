/**
 */
package info.scce.cinco.product.scchart.scchart;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.scchart.internal.InternalDataFlowRegion;

import info.scce.cinco.product.scchart.scchart.views.DataFlowRegionView;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Region</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.scchart.ScchartPackage#getDataFlowRegion()
 * @model
 * @generated
 */
public interface DataFlowRegion extends Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalDataFlowRegion getInternalDataFlowRegion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyDataFlowRegion();

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
	EList<Operator> getOperators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewOperator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Operator newOperator(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Operator newOperator(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Operator newOperator(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Operator newOperator(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Input newInput(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Input newInput(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Input newInput(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Input newInput(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewConnector();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Connector newConnector(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Connector newConnector(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Connector newConnector(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Connector newConnector(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialState> getInitialStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewInitialState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	InitialState newInitialState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	InitialState newInitialState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	InitialState newInitialState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	InitialState newInitialState(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SCChartReferece> getSCChartRefereces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSCChartReferece();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SCChartReferece newSCChartReferece(EObject reference, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SCChartReferece newSCChartReferece(EObject reference, String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SCChartReferece newSCChartReferece(EObject reference, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SCChartReferece newSCChartReferece(EObject reference, String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<CircuitConnecter> getCircuitConnecters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewCircuitConnecter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	CircuitConnecter newCircuitConnecter(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	CircuitConnecter newCircuitConnecter(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	CircuitConnecter newCircuitConnecter(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	CircuitConnecter newCircuitConnecter(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Output newOutput(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Output newOutput(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Output newOutput(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Output newOutput(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitilalSuperState> getInitilalSuperStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewInitilalSuperState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	InitilalSuperState newInitilalSuperState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	InitilalSuperState newInitilalSuperState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	InitilalSuperState newInitilalSuperState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	InitilalSuperState newInitilalSuperState(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SuperState> getSuperStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSuperState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SuperState newSuperState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SuperState newSuperState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SuperState newSuperState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SuperState newSuperState(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SimpleState> getSimpleStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSimpleState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SimpleState newSimpleState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SimpleState newSimpleState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SimpleState newSimpleState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SimpleState newSimpleState(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSCChartReferece> getInitialSCChartRefereces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewInitialSCChartReferece();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	InitialSCChartReferece newInitialSCChartReferece(EObject reference, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	InitialSCChartReferece newInitialSCChartReferece(EObject reference, String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	InitialSCChartReferece newInitialSCChartReferece(EObject reference, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	InitialSCChartReferece newInitialSCChartReferece(EObject reference, String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSCChartReferece> getFinalSCChartRefereces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewFinalSCChartReferece();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FinalSCChartReferece newFinalSCChartReferece(EObject reference, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FinalSCChartReferece newFinalSCChartReferece(EObject reference, String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FinalSCChartReferece newFinalSCChartReferece(EObject reference, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" referenceRequired="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FinalSCChartReferece newFinalSCChartReferece(EObject reference, String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSuperState> getFinalSuperStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewFinalSuperState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FinalSuperState newFinalSuperState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FinalSuperState newFinalSuperState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FinalSuperState newFinalSuperState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FinalSuperState newFinalSuperState(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalState> getFinalStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewFinalState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FinalState newFinalState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FinalState newFinalState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FinalState newFinalState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FinalState newFinalState(String id, int x, int y, int width, int height);

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
	 * @model required="true" rootStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(RootState rootState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(RootState rootState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(RootState rootState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" superStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(SuperState superState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model superStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(SuperState superState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model superStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(SuperState superState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initilalSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(InitilalSuperState initilalSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initilalSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(InitilalSuperState initilalSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initilalSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(InitilalSuperState initilalSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" finalSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(FinalSuperState finalSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model finalSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(FinalSuperState finalSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model finalSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(FinalSuperState finalSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(SCChartReferece sCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(SCChartReferece sCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(SCChartReferece sCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initialSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(InitialSCChartReferece initialSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(InitialSCChartReferece initialSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(InitialSCChartReferece initialSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" finalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(FinalSCChartReferece finalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model finalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(FinalSCChartReferece finalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model finalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(FinalSCChartReferece finalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DataFlowRegionView getDataFlowRegionView();

} // DataFlowRegion
