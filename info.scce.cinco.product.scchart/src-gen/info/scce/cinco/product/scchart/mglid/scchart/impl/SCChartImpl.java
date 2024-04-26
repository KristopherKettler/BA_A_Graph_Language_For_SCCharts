/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.GraphModelImpl;

import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart;

import info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SCChartImpl extends GraphModelImpl implements SCChart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getSCChart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSCChart().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSCChart().getElement().transact("Set Name", () -> {
			getInternalSCChart().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSCChart getInternalSCChart() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlySCChart() {
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
		// event.pre.save.info_scce_cinco_product_scchart_mglid_scchart_SCChart
		de.jabc.cinco.meta.plugin.event.api.payload.PreSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>(this.getRootElement());
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>, java.lang.Void>("event.pre.save.info_scce_cinco_product_scchart_mglid_scchart_SCChart", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		// event.post.save.info_scce_cinco_product_scchart_mglid_scchart_SCChart
		de.jabc.cinco.meta.plugin.event.api.payload.PostSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>(this.getRootElement());
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostSavePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>, java.lang.Void>("event.post.save.info_scce_cinco_product_scchart_mglid_scchart_SCChart", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart getRootElement() {
		return this;
		
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
	public EList<RootState> getRootStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewRootState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
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
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.RootState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRootState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.RootState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.RootState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRootState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.RootState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart newSCChart(final String path, final String fileName, final boolean postCreateHook) {
		org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("scchart");
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		org.eclipse.core.resources.IFile file = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		info.scce.cinco.product.scchart.mglid.scchart.SCChart graph = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSCChart();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		
		res.getContents().add(graph.getInternalElement());
		
		if (postCreateHook)
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates((info.scce.cinco.product.scchart.mglid.scchart.SCChart) graph);
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
		return graph;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartView getSCChartView() {
		SCChartView sCChartView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createSCChartView();
		sCChartView.setInternalSCChart((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart)getInternalElement());
		return sCChartView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.SC_CHART___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.SC_CHART___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.SC_CHART___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.SC_CHART___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.SC_CHART___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == GraphModel.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.GRAPH_MODEL___GET_ROOT_ELEMENT: return ScchartPackage.SC_CHART___GET_ROOT_ELEMENT;
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
			case ScchartPackage.SC_CHART___GET_NAME:
				return getName();
			case ScchartPackage.SC_CHART___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ScchartPackage.SC_CHART___GET_INTERNAL_SC_CHART:
				return getInternalSCChart();
			case ScchartPackage.SC_CHART___IS_EXACTLY_SC_CHART:
				return isExactlySCChart();
			case ScchartPackage.SC_CHART___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.SC_CHART___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.SC_CHART___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.SC_CHART___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.SC_CHART___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.SC_CHART___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.SC_CHART___GET_NODES:
				return getNodes();
			case ScchartPackage.SC_CHART___GET_ROOT_STATES:
				return getRootStates();
			case ScchartPackage.SC_CHART___CAN_NEW_ROOT_STATE:
				return canNewRootState();
			case ScchartPackage.SC_CHART___NEW_ROOT_STATE__INT_INT:
				return newRootState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SC_CHART___NEW_ROOT_STATE__STRING_INT_INT:
				return newRootState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SC_CHART___NEW_ROOT_STATE__INT_INT_INT_INT:
				return newRootState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SC_CHART___NEW_ROOT_STATE__STRING_INT_INT_INT_INT:
				return newRootState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SC_CHART___NEW_SC_CHART__STRING_STRING_BOOLEAN:
				return newSCChart((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case ScchartPackage.SC_CHART___GET_SC_CHART_VIEW:
				return getSCChartView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SCChartImpl
