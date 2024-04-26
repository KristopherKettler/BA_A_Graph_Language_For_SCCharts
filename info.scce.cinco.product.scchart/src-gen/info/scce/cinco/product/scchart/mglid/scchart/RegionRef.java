/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegionRef;

import info.scce.cinco.product.scchart.mglid.scchart.views.RegionRefView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getRegionRef()
 * @model
 * @generated
 */
public interface RegionRef extends Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalRegionRef getInternalRegionRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyRegionRef();

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
	EList<RootState> getRootStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewRootState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	RootState newRootState(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	RootState newRootState(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	RootState newRootState(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	RootState newRootState(String id, int x, int y, int width, int height);

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
	 * @model required="true" initialFinalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(InitialFinalSCChartReferece initialFinalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialFinalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(InitialFinalSCChartReferece initialFinalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialFinalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(InitialFinalSCChartReferece initialFinalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SCChartReferece getContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RegionRefView getRegionRefView();

} // RegionRef
