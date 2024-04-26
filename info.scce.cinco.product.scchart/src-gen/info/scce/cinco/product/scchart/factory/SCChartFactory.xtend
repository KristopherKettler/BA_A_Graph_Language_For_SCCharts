package info.scce.cinco.product.scchart.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.scchart.scchart.ScchartPackage
import info.scce.cinco.product.scchart.scchart.impl.ScchartFactoryImpl
import info.scce.cinco.product.scchart.scchart.internal.InternalFactory
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage

import info.scce.cinco.product.scchart.scchart.adapter.*

import graphmodel.internal.InternalModelElement
import graphmodel.internal.InternalModelElementContainer
import graphmodel.internal.InternalGraphModel
import graphmodel.internal.InternalContainer
import graphmodel.internal.InternalNode
import graphmodel.internal.InternalEdge
import graphmodel.internal.InternalType
import graphmodel.internal.InternalIdentifiableElement
import graphmodel.ModelElement
import graphmodel.IdentifiableElement
import graphmodel.GraphModel
import graphmodel.Type

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin

class SCChartFactory extends ScchartFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static SCChartFactory eINSTANCE = SCChartFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def SCChartFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(ScchartPackage.eNS_URI) as SCChartFactory
			if (fct != null)
				return fct as SCChartFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new SCChartFactory
	}
	
	/**
	 * This method creates an SCChart with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSCChart(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSCChart => [ 
			setID(ID)
			internal = ime ?: createInternalSCChart => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.SCChartEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook won't be triggered.
	 */
	def createSCChart(String ID){
		createSCChart(ID,null,null,false)
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook will be triggered.
	 */
	def createSCChart(InternalModelElementContainer parent){
		createSCChart(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook will be triggered.
	 */
	def createSCChart(String ID, InternalModelElementContainer parent){
		createSCChart(ID,null,parent,true)
	}
	
	def createSCChart(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSCChart(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook won't be triggered.
	 */
	def createSCChart(InternalModelElement ime) {
		createSCChart(generateUUID,ime,null,false)
	}
	
	override createSCChart() {
		createSCChart(generateUUID)
	}
	/**
	 * This method creates an Action with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createAction(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createAction => [
			setID(ID)
			internal = ime ?: createInternalAction => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ActionEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an Action with the given id. Post create hook won't be triggered.
	 */
	def createAction(String ID){
		createAction(ID,null,null,false)
	}
	
	/**
	 * This method creates an Action with the given id. Post create hook will be triggered.
	 */
	def createAction(InternalModelElementContainer parent){
		createAction(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Action with the given id. Post create hook will be triggered.
	 */
	def createAction(String ID, InternalModelElementContainer parent){
		createAction(ID,null,parent,true)
	}
	
	def createAction(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createAction(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Action with the given id. Post create hook won't be triggered.
	 */
	def createAction(InternalModelElement ime) {
		createAction(generateUUID,ime,null,false)
	}
	
	override createAction() {
		createAction(generateUUID)
	}
	/**
	 * This method creates an FinalState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createFinalState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createFinalState => [
			setID(ID)
			internal = ime ?: createInternalFinalState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.FinalStateEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook won't be triggered.
	 */
	def createFinalState(String ID){
		createFinalState(ID,null,null,false)
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook will be triggered.
	 */
	def createFinalState(InternalModelElementContainer parent){
		createFinalState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook will be triggered.
	 */
	def createFinalState(String ID, InternalModelElementContainer parent){
		createFinalState(ID,null,parent,true)
	}
	
	def createFinalState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createFinalState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook won't be triggered.
	 */
	def createFinalState(InternalModelElement ime) {
		createFinalState(generateUUID,ime,null,false)
	}
	
	override createFinalState() {
		createFinalState(generateUUID)
	}
	/**
	 * This method creates an FinalSuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createFinalSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createFinalSuperState => [
			setID(ID)
			internal = ime ?: createInternalFinalSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.FinalSuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an FinalSuperState with the given id. Post create hook won't be triggered.
	 */
	def createFinalSuperState(String ID){
		createFinalSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an FinalSuperState with the given id. Post create hook will be triggered.
	 */
	def createFinalSuperState(InternalModelElementContainer parent){
		createFinalSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an FinalSuperState with the given id. Post create hook will be triggered.
	 */
	def createFinalSuperState(String ID, InternalModelElementContainer parent){
		createFinalSuperState(ID,null,parent,true)
	}
	
	def createFinalSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createFinalSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an FinalSuperState with the given id. Post create hook won't be triggered.
	 */
	def createFinalSuperState(InternalModelElement ime) {
		createFinalSuperState(generateUUID,ime,null,false)
	}
	
	override createFinalSuperState() {
		createFinalSuperState(generateUUID)
	}
	/**
	 * This method creates an SimpleState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSimpleState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSimpleState => [
			setID(ID)
			internal = ime ?: createInternalSimpleState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.SimpleStateEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook won't be triggered.
	 */
	def createSimpleState(String ID){
		createSimpleState(ID,null,null,false)
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook will be triggered.
	 */
	def createSimpleState(InternalModelElementContainer parent){
		createSimpleState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook will be triggered.
	 */
	def createSimpleState(String ID, InternalModelElementContainer parent){
		createSimpleState(ID,null,parent,true)
	}
	
	def createSimpleState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSimpleState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook won't be triggered.
	 */
	def createSimpleState(InternalModelElement ime) {
		createSimpleState(generateUUID,ime,null,false)
	}
	
	override createSimpleState() {
		createSimpleState(generateUUID)
	}
	/**
	 * This method creates an RootState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRootState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRootState => [
			setID(ID)
			internal = ime ?: createInternalRootState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.RootStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook won't be triggered.
	 */
	def createRootState(String ID){
		createRootState(ID,null,null,false)
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook will be triggered.
	 */
	def createRootState(InternalModelElementContainer parent){
		createRootState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook will be triggered.
	 */
	def createRootState(String ID, InternalModelElementContainer parent){
		createRootState(ID,null,parent,true)
	}
	
	def createRootState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRootState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook won't be triggered.
	 */
	def createRootState(InternalModelElement ime) {
		createRootState(generateUUID,ime,null,false)
	}
	
	override createRootState() {
		createRootState(generateUUID)
	}
	/**
	 * This method creates an Suspend with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuspend(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSuspend => [
			setID(ID)
			internal = ime ?: createInternalSuspend => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.SuspendEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an Suspend with the given id. Post create hook won't be triggered.
	 */
	def createSuspend(String ID){
		createSuspend(ID,null,null,false)
	}
	
	/**
	 * This method creates an Suspend with the given id. Post create hook will be triggered.
	 */
	def createSuspend(InternalModelElementContainer parent){
		createSuspend(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Suspend with the given id. Post create hook will be triggered.
	 */
	def createSuspend(String ID, InternalModelElementContainer parent){
		createSuspend(ID,null,parent,true)
	}
	
	def createSuspend(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSuspend(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Suspend with the given id. Post create hook won't be triggered.
	 */
	def createSuspend(InternalModelElement ime) {
		createSuspend(generateUUID,ime,null,false)
	}
	
	override createSuspend() {
		createSuspend(generateUUID)
	}
	/**
	 * This method creates an SuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSuperState => [
			setID(ID)
			internal = ime ?: createInternalSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.SuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook won't be triggered.
	 */
	def createSuperState(String ID){
		createSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook will be triggered.
	 */
	def createSuperState(InternalModelElementContainer parent){
		createSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook will be triggered.
	 */
	def createSuperState(String ID, InternalModelElementContainer parent){
		createSuperState(ID,null,parent,true)
	}
	
	def createSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook won't be triggered.
	 */
	def createSuperState(InternalModelElement ime) {
		createSuperState(generateUUID,ime,null,false)
	}
	
	override createSuperState() {
		createSuperState(generateUUID)
	}
	/**
	 * This method creates an DataFlowRegion with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDataFlowRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDataFlowRegion => [
			setID(ID)
			internal = ime ?: createInternalDataFlowRegion => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.DataFlowRegionEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook won't be triggered.
	 */
	def createDataFlowRegion(String ID){
		createDataFlowRegion(ID,null,null,false)
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook will be triggered.
	 */
	def createDataFlowRegion(InternalModelElementContainer parent){
		createDataFlowRegion(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook will be triggered.
	 */
	def createDataFlowRegion(String ID, InternalModelElementContainer parent){
		createDataFlowRegion(ID,null,parent,true)
	}
	
	def createDataFlowRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDataFlowRegion(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook won't be triggered.
	 */
	def createDataFlowRegion(InternalModelElement ime) {
		createDataFlowRegion(generateUUID,ime,null,false)
	}
	
	override createDataFlowRegion() {
		createDataFlowRegion(generateUUID)
	}
	/**
	 * This method creates an InitialState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInitialState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInitialState => [
			setID(ID)
			internal = ime ?: createInternalInitialState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.InitialStateEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook won't be triggered.
	 */
	def createInitialState(String ID){
		createInitialState(ID,null,null,false)
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook will be triggered.
	 */
	def createInitialState(InternalModelElementContainer parent){
		createInitialState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook will be triggered.
	 */
	def createInitialState(String ID, InternalModelElementContainer parent){
		createInitialState(ID,null,parent,true)
	}
	
	def createInitialState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInitialState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook won't be triggered.
	 */
	def createInitialState(InternalModelElement ime) {
		createInitialState(generateUUID,ime,null,false)
	}
	
	override createInitialState() {
		createInitialState(generateUUID)
	}
	/**
	 * This method creates an InitilalSuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInitilalSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInitilalSuperState => [
			setID(ID)
			internal = ime ?: createInternalInitilalSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.InitilalSuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook won't be triggered.
	 */
	def createInitilalSuperState(String ID){
		createInitilalSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook will be triggered.
	 */
	def createInitilalSuperState(InternalModelElementContainer parent){
		createInitilalSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook will be triggered.
	 */
	def createInitilalSuperState(String ID, InternalModelElementContainer parent){
		createInitilalSuperState(ID,null,parent,true)
	}
	
	def createInitilalSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInitilalSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook won't be triggered.
	 */
	def createInitilalSuperState(InternalModelElement ime) {
		createInitilalSuperState(generateUUID,ime,null,false)
	}
	
	override createInitilalSuperState() {
		createInitilalSuperState(generateUUID)
	}
	/**
	 * This method creates an FinalSCChartReferece with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createFinalSCChartReferece(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createFinalSCChartReferece => [
			setID(ID)
			internal = ime ?: createInternalFinalSCChartReferece => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.FinalSCChartRefereceEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an FinalSCChartReferece with the given id. Post create hook won't be triggered.
	 */
	def createFinalSCChartReferece(String ID){
		createFinalSCChartReferece(ID,null,null,false)
	}
	
	/**
	 * This method creates an FinalSCChartReferece with the given id. Post create hook will be triggered.
	 */
	def createFinalSCChartReferece(InternalModelElementContainer parent){
		createFinalSCChartReferece(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an FinalSCChartReferece with the given id. Post create hook will be triggered.
	 */
	def createFinalSCChartReferece(String ID, InternalModelElementContainer parent){
		createFinalSCChartReferece(ID,null,parent,true)
	}
	
	def createFinalSCChartReferece(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createFinalSCChartReferece(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an FinalSCChartReferece with the given id. Post create hook won't be triggered.
	 */
	def createFinalSCChartReferece(InternalModelElement ime) {
		createFinalSCChartReferece(generateUUID,ime,null,false)
	}
	
	override createFinalSCChartReferece() {
		createFinalSCChartReferece(generateUUID)
	}
	/**
	 * This method creates an Input with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInput(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInput => [
			setID(ID)
			internal = ime ?: createInternalInput => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.InputEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook won't be triggered.
	 */
	def createInput(String ID){
		createInput(ID,null,null,false)
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook will be triggered.
	 */
	def createInput(InternalModelElementContainer parent){
		createInput(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook will be triggered.
	 */
	def createInput(String ID, InternalModelElementContainer parent){
		createInput(ID,null,parent,true)
	}
	
	def createInput(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInput(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook won't be triggered.
	 */
	def createInput(InternalModelElement ime) {
		createInput(generateUUID,ime,null,false)
	}
	
	override createInput() {
		createInput(generateUUID)
	}
	/**
	 * This method creates an Region with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRegion => [
			setID(ID)
			internal = ime ?: createInternalRegion => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.RegionEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook won't be triggered.
	 */
	def createRegion(String ID){
		createRegion(ID,null,null,false)
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook will be triggered.
	 */
	def createRegion(InternalModelElementContainer parent){
		createRegion(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook will be triggered.
	 */
	def createRegion(String ID, InternalModelElementContainer parent){
		createRegion(ID,null,parent,true)
	}
	
	def createRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRegion(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook won't be triggered.
	 */
	def createRegion(InternalModelElement ime) {
		createRegion(generateUUID,ime,null,false)
	}
	
	override createRegion() {
		createRegion(generateUUID)
	}
	/**
	 * This method creates an Operator with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createOperator(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createOperator => [
			setID(ID)
			internal = ime ?: createInternalOperator => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.OperatorEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Operator with the given id. Post create hook won't be triggered.
	 */
	def createOperator(String ID){
		createOperator(ID,null,null,false)
	}
	
	/**
	 * This method creates an Operator with the given id. Post create hook will be triggered.
	 */
	def createOperator(InternalModelElementContainer parent){
		createOperator(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Operator with the given id. Post create hook will be triggered.
	 */
	def createOperator(String ID, InternalModelElementContainer parent){
		createOperator(ID,null,parent,true)
	}
	
	def createOperator(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createOperator(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Operator with the given id. Post create hook won't be triggered.
	 */
	def createOperator(InternalModelElement ime) {
		createOperator(generateUUID,ime,null,false)
	}
	
	override createOperator() {
		createOperator(generateUUID)
	}
	/**
	 * This method creates an CircuitConnecter with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createCircuitConnecter(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createCircuitConnecter => [
			setID(ID)
			internal = ime ?: createInternalCircuitConnecter => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.CircuitConnecterEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an CircuitConnecter with the given id. Post create hook won't be triggered.
	 */
	def createCircuitConnecter(String ID){
		createCircuitConnecter(ID,null,null,false)
	}
	
	/**
	 * This method creates an CircuitConnecter with the given id. Post create hook will be triggered.
	 */
	def createCircuitConnecter(InternalModelElementContainer parent){
		createCircuitConnecter(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an CircuitConnecter with the given id. Post create hook will be triggered.
	 */
	def createCircuitConnecter(String ID, InternalModelElementContainer parent){
		createCircuitConnecter(ID,null,parent,true)
	}
	
	def createCircuitConnecter(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createCircuitConnecter(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an CircuitConnecter with the given id. Post create hook won't be triggered.
	 */
	def createCircuitConnecter(InternalModelElement ime) {
		createCircuitConnecter(generateUUID,ime,null,false)
	}
	
	override createCircuitConnecter() {
		createCircuitConnecter(generateUUID)
	}
	/**
	 * This method creates an Connector with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createConnector(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createConnector => [
			setID(ID)
			internal = ime ?: createInternalConnector => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ConnectorEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook won't be triggered.
	 */
	def createConnector(String ID){
		createConnector(ID,null,null,false)
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook will be triggered.
	 */
	def createConnector(InternalModelElementContainer parent){
		createConnector(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook will be triggered.
	 */
	def createConnector(String ID, InternalModelElementContainer parent){
		createConnector(ID,null,parent,true)
	}
	
	def createConnector(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createConnector(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook won't be triggered.
	 */
	def createConnector(InternalModelElement ime) {
		createConnector(generateUUID,ime,null,false)
	}
	
	override createConnector() {
		createConnector(generateUUID)
	}
	/**
	 * This method creates an Output with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createOutput(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createOutput => [
			setID(ID)
			internal = ime ?: createInternalOutput => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.OutputEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Output with the given id. Post create hook won't be triggered.
	 */
	def createOutput(String ID){
		createOutput(ID,null,null,false)
	}
	
	/**
	 * This method creates an Output with the given id. Post create hook will be triggered.
	 */
	def createOutput(InternalModelElementContainer parent){
		createOutput(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Output with the given id. Post create hook will be triggered.
	 */
	def createOutput(String ID, InternalModelElementContainer parent){
		createOutput(ID,null,parent,true)
	}
	
	def createOutput(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createOutput(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Output with the given id. Post create hook won't be triggered.
	 */
	def createOutput(InternalModelElement ime) {
		createOutput(generateUUID,ime,null,false)
	}
	
	override createOutput() {
		createOutput(generateUUID)
	}
	/**
	 * This method creates an InitialSCChartReferece with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInitialSCChartReferece(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInitialSCChartReferece => [
			setID(ID)
			internal = ime ?: createInternalInitialSCChartReferece => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.InitialSCChartRefereceEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an InitialSCChartReferece with the given id. Post create hook won't be triggered.
	 */
	def createInitialSCChartReferece(String ID){
		createInitialSCChartReferece(ID,null,null,false)
	}
	
	/**
	 * This method creates an InitialSCChartReferece with the given id. Post create hook will be triggered.
	 */
	def createInitialSCChartReferece(InternalModelElementContainer parent){
		createInitialSCChartReferece(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an InitialSCChartReferece with the given id. Post create hook will be triggered.
	 */
	def createInitialSCChartReferece(String ID, InternalModelElementContainer parent){
		createInitialSCChartReferece(ID,null,parent,true)
	}
	
	def createInitialSCChartReferece(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInitialSCChartReferece(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an InitialSCChartReferece with the given id. Post create hook won't be triggered.
	 */
	def createInitialSCChartReferece(InternalModelElement ime) {
		createInitialSCChartReferece(generateUUID,ime,null,false)
	}
	
	override createInitialSCChartReferece() {
		createInitialSCChartReferece(generateUUID)
	}
	/**
	 * This method creates an Declaration with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDeclaration(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDeclaration => [
			setID(ID)
			internal = ime ?: createInternalDeclaration => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.DeclarationEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an Declaration with the given id. Post create hook won't be triggered.
	 */
	def createDeclaration(String ID){
		createDeclaration(ID,null,null,false)
	}
	
	/**
	 * This method creates an Declaration with the given id. Post create hook will be triggered.
	 */
	def createDeclaration(InternalModelElementContainer parent){
		createDeclaration(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Declaration with the given id. Post create hook will be triggered.
	 */
	def createDeclaration(String ID, InternalModelElementContainer parent){
		createDeclaration(ID,null,parent,true)
	}
	
	def createDeclaration(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDeclaration(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Declaration with the given id. Post create hook won't be triggered.
	 */
	def createDeclaration(InternalModelElement ime) {
		createDeclaration(generateUUID,ime,null,false)
	}
	
	override createDeclaration() {
		createDeclaration(generateUUID)
	}
	/**
	 * This method creates an SCChartReferece with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSCChartReferece(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSCChartReferece => [
			setID(ID)
			internal = ime ?: createInternalSCChartReferece => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.SCChartRefereceEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SCChartReferece with the given id. Post create hook won't be triggered.
	 */
	def createSCChartReferece(String ID){
		createSCChartReferece(ID,null,null,false)
	}
	
	/**
	 * This method creates an SCChartReferece with the given id. Post create hook will be triggered.
	 */
	def createSCChartReferece(InternalModelElementContainer parent){
		createSCChartReferece(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SCChartReferece with the given id. Post create hook will be triggered.
	 */
	def createSCChartReferece(String ID, InternalModelElementContainer parent){
		createSCChartReferece(ID,null,parent,true)
	}
	
	def createSCChartReferece(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSCChartReferece(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SCChartReferece with the given id. Post create hook won't be triggered.
	 */
	def createSCChartReferece(InternalModelElement ime) {
		createSCChartReferece(generateUUID,ime,null,false)
	}
	
	override createSCChartReferece() {
		createSCChartReferece(generateUUID)
	}
	def createDeferredTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createDeferredTransition => [
			setID(ID)
			internal = ime ?: createInternalDeferredTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.DeferredTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an DeferredTransition with the given id. Post create hook will be triggered.
	 */
	def createDeferredTransition(String ID, InternalNode source, InternalNode target){
		createDeferredTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an DeferredTransition with generated id. Post create hook will be triggered.
	 */
	def createDeferredTransition(InternalNode source, InternalNode target){
		createDeferredTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an DeferredTransition with the given id. Post create hook won't be triggered.
	 */
	def createDeferredTransition(String ID){
		createDeferredTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an DeferredTransition with a generated id. Post create hook won't be triggered.
	 */
	override createDeferredTransition() {
		createDeferredTransition(generateUUID)
	}
	def createTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTransition => [
			setID(ID)
			internal = ime ?: createInternalTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.TransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an Transition with the given id. Post create hook will be triggered.
	 */
	def createTransition(String ID, InternalNode source, InternalNode target){
		createTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an Transition with generated id. Post create hook will be triggered.
	 */
	def createTransition(InternalNode source, InternalNode target){
		createTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an Transition with the given id. Post create hook won't be triggered.
	 */
	def createTransition(String ID){
		createTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an Transition with a generated id. Post create hook won't be triggered.
	 */
	override createTransition() {
		createTransition(generateUUID)
	}
	def createTerminationHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTerminationHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalTerminationHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.TerminationHistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an TerminationHistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createTerminationHistoryTransition(String ID, InternalNode source, InternalNode target){
		createTerminationHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationHistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createTerminationHistoryTransition(InternalNode source, InternalNode target){
		createTerminationHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationHistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createTerminationHistoryTransition(String ID){
		createTerminationHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an TerminationHistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createTerminationHistoryTransition() {
		createTerminationHistoryTransition(generateUUID)
	}
	def createConditionalTerminationHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createConditionalTerminationHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalConditionalTerminationHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ConditionalTerminationHistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ConditionalTerminationHistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createConditionalTerminationHistoryTransition(String ID, InternalNode source, InternalNode target){
		createConditionalTerminationHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationHistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createConditionalTerminationHistoryTransition(InternalNode source, InternalNode target){
		createConditionalTerminationHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationHistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createConditionalTerminationHistoryTransition(String ID){
		createConditionalTerminationHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ConditionalTerminationHistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createConditionalTerminationHistoryTransition() {
		createConditionalTerminationHistoryTransition(generateUUID)
	}
	def createImmediateStrongAbortHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateStrongAbortHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateStrongAbortHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ImmediateStrongAbortHistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateStrongAbortHistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateStrongAbortHistoryTransition(String ID, InternalNode source, InternalNode target){
		createImmediateStrongAbortHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortHistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateStrongAbortHistoryTransition(InternalNode source, InternalNode target){
		createImmediateStrongAbortHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortHistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateStrongAbortHistoryTransition(String ID){
		createImmediateStrongAbortHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortHistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateStrongAbortHistoryTransition() {
		createImmediateStrongAbortHistoryTransition(generateUUID)
	}
	def createConditionalTerminationDeferredTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createConditionalTerminationDeferredTransition => [
			setID(ID)
			internal = ime ?: createInternalConditionalTerminationDeferredTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ConditionalTerminationDeferredTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ConditionalTerminationDeferredTransition with the given id. Post create hook will be triggered.
	 */
	def createConditionalTerminationDeferredTransition(String ID, InternalNode source, InternalNode target){
		createConditionalTerminationDeferredTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationDeferredTransition with generated id. Post create hook will be triggered.
	 */
	def createConditionalTerminationDeferredTransition(InternalNode source, InternalNode target){
		createConditionalTerminationDeferredTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationDeferredTransition with the given id. Post create hook won't be triggered.
	 */
	def createConditionalTerminationDeferredTransition(String ID){
		createConditionalTerminationDeferredTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ConditionalTerminationDeferredTransition with a generated id. Post create hook won't be triggered.
	 */
	override createConditionalTerminationDeferredTransition() {
		createConditionalTerminationDeferredTransition(generateUUID)
	}
	def createConnection(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createConnection => [
			setID(ID)
			internal = ime ?: createInternalConnection => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ConnectionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an Connection with the given id. Post create hook will be triggered.
	 */
	def createConnection(String ID, InternalNode source, InternalNode target){
		createConnection(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an Connection with generated id. Post create hook will be triggered.
	 */
	def createConnection(InternalNode source, InternalNode target){
		createConnection(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an Connection with the given id. Post create hook won't be triggered.
	 */
	def createConnection(String ID){
		createConnection(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an Connection with a generated id. Post create hook won't be triggered.
	 */
	override createConnection() {
		createConnection(generateUUID)
	}
	def createTerminationTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTerminationTransition => [
			setID(ID)
			internal = ime ?: createInternalTerminationTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.TerminationTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an TerminationTransition with the given id. Post create hook will be triggered.
	 */
	def createTerminationTransition(String ID, InternalNode source, InternalNode target){
		createTerminationTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationTransition with generated id. Post create hook will be triggered.
	 */
	def createTerminationTransition(InternalNode source, InternalNode target){
		createTerminationTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationTransition with the given id. Post create hook won't be triggered.
	 */
	def createTerminationTransition(String ID){
		createTerminationTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an TerminationTransition with a generated id. Post create hook won't be triggered.
	 */
	override createTerminationTransition() {
		createTerminationTransition(generateUUID)
	}
	def createImmediateDeferredTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateDeferredTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateDeferredTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ImmediateDeferredTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateDeferredTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateDeferredTransition(String ID, InternalNode source, InternalNode target){
		createImmediateDeferredTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateDeferredTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateDeferredTransition(InternalNode source, InternalNode target){
		createImmediateDeferredTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateDeferredTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateDeferredTransition(String ID){
		createImmediateDeferredTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateDeferredTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateDeferredTransition() {
		createImmediateDeferredTransition(generateUUID)
	}
	def createConditionalTerminationTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createConditionalTerminationTransition => [
			setID(ID)
			internal = ime ?: createInternalConditionalTerminationTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ConditionalTerminationTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with the given id. Post create hook will be triggered.
	 */
	def createConditionalTerminationTransition(String ID, InternalNode source, InternalNode target){
		createConditionalTerminationTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with generated id. Post create hook will be triggered.
	 */
	def createConditionalTerminationTransition(InternalNode source, InternalNode target){
		createConditionalTerminationTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with the given id. Post create hook won't be triggered.
	 */
	def createConditionalTerminationTransition(String ID){
		createConditionalTerminationTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with a generated id. Post create hook won't be triggered.
	 */
	override createConditionalTerminationTransition() {
		createConditionalTerminationTransition(generateUUID)
	}
	def createImmediateStrongAbortDeferredTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateStrongAbortDeferredTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateStrongAbortDeferredTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ImmediateStrongAbortDeferredTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateStrongAbortDeferredTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateStrongAbortDeferredTransition(String ID, InternalNode source, InternalNode target){
		createImmediateStrongAbortDeferredTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortDeferredTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateStrongAbortDeferredTransition(InternalNode source, InternalNode target){
		createImmediateStrongAbortDeferredTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortDeferredTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateStrongAbortDeferredTransition(String ID){
		createImmediateStrongAbortDeferredTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortDeferredTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateStrongAbortDeferredTransition() {
		createImmediateStrongAbortDeferredTransition(generateUUID)
	}
	def createStrongAbortTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createStrongAbortTransition => [
			setID(ID)
			internal = ime ?: createInternalStrongAbortTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.StrongAbortTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an StrongAbortTransition with the given id. Post create hook will be triggered.
	 */
	def createStrongAbortTransition(String ID, InternalNode source, InternalNode target){
		createStrongAbortTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortTransition with generated id. Post create hook will be triggered.
	 */
	def createStrongAbortTransition(InternalNode source, InternalNode target){
		createStrongAbortTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortTransition with the given id. Post create hook won't be triggered.
	 */
	def createStrongAbortTransition(String ID){
		createStrongAbortTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an StrongAbortTransition with a generated id. Post create hook won't be triggered.
	 */
	override createStrongAbortTransition() {
		createStrongAbortTransition(generateUUID)
	}
	def createHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.HistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an HistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createHistoryTransition(String ID, InternalNode source, InternalNode target){
		createHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an HistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createHistoryTransition(InternalNode source, InternalNode target){
		createHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an HistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createHistoryTransition(String ID){
		createHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an HistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createHistoryTransition() {
		createHistoryTransition(generateUUID)
	}
	def createImmediateHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ImmediateHistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateHistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateHistoryTransition(String ID, InternalNode source, InternalNode target){
		createImmediateHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateHistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateHistoryTransition(InternalNode source, InternalNode target){
		createImmediateHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateHistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateHistoryTransition(String ID){
		createImmediateHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateHistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateHistoryTransition() {
		createImmediateHistoryTransition(generateUUID)
	}
	def createAbstractTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createAbstractTransition => [
			setID(ID)
			internal = ime ?: createInternalAbstractTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.AbstractTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an AbstractTransition with the given id. Post create hook will be triggered.
	 */
	def createAbstractTransition(String ID, InternalNode source, InternalNode target){
		createAbstractTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an AbstractTransition with generated id. Post create hook will be triggered.
	 */
	def createAbstractTransition(InternalNode source, InternalNode target){
		createAbstractTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an AbstractTransition with the given id. Post create hook won't be triggered.
	 */
	def createAbstractTransition(String ID){
		createAbstractTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an AbstractTransition with a generated id. Post create hook won't be triggered.
	 */
	override createAbstractTransition() {
		createAbstractTransition(generateUUID)
	}
	def createStrongAbortHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createStrongAbortHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalStrongAbortHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.StrongAbortHistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an StrongAbortHistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createStrongAbortHistoryTransition(String ID, InternalNode source, InternalNode target){
		createStrongAbortHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortHistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createStrongAbortHistoryTransition(InternalNode source, InternalNode target){
		createStrongAbortHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortHistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createStrongAbortHistoryTransition(String ID){
		createStrongAbortHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an StrongAbortHistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createStrongAbortHistoryTransition() {
		createStrongAbortHistoryTransition(generateUUID)
	}
	def createImmediateTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ImmediateTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateTransition(String ID, InternalNode source, InternalNode target){
		createImmediateTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateTransition(InternalNode source, InternalNode target){
		createImmediateTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateTransition(String ID){
		createImmediateTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateTransition() {
		createImmediateTransition(generateUUID)
	}
	def createImmediateStrongAbortTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateStrongAbortTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateStrongAbortTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.ImmediateStrongAbortTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateStrongAbortTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateStrongAbortTransition(String ID, InternalNode source, InternalNode target){
		createImmediateStrongAbortTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateStrongAbortTransition(InternalNode source, InternalNode target){
		createImmediateStrongAbortTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateStrongAbortTransition(String ID){
		createImmediateStrongAbortTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateStrongAbortTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateStrongAbortTransition() {
		createImmediateStrongAbortTransition(generateUUID)
	}
	def createTerminationDefferdTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTerminationDefferdTransition => [
			setID(ID)
			internal = ime ?: createInternalTerminationDefferdTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.TerminationDefferdTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an TerminationDefferdTransition with the given id. Post create hook will be triggered.
	 */
	def createTerminationDefferdTransition(String ID, InternalNode source, InternalNode target){
		createTerminationDefferdTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationDefferdTransition with generated id. Post create hook will be triggered.
	 */
	def createTerminationDefferdTransition(InternalNode source, InternalNode target){
		createTerminationDefferdTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationDefferdTransition with the given id. Post create hook won't be triggered.
	 */
	def createTerminationDefferdTransition(String ID){
		createTerminationDefferdTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an TerminationDefferdTransition with a generated id. Post create hook won't be triggered.
	 */
	override createTerminationDefferdTransition() {
		createTerminationDefferdTransition(generateUUID)
	}
	def createStrongAbortDeferredTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createStrongAbortDeferredTransition => [
			setID(ID)
			internal = ime ?: createInternalStrongAbortDeferredTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.StrongAbortDeferredTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an StrongAbortDeferredTransition with the given id. Post create hook will be triggered.
	 */
	def createStrongAbortDeferredTransition(String ID, InternalNode source, InternalNode target){
		createStrongAbortDeferredTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortDeferredTransition with generated id. Post create hook will be triggered.
	 */
	def createStrongAbortDeferredTransition(InternalNode source, InternalNode target){
		createStrongAbortDeferredTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortDeferredTransition with the given id. Post create hook won't be triggered.
	 */
	def createStrongAbortDeferredTransition(String ID){
		createStrongAbortDeferredTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an StrongAbortDeferredTransition with a generated id. Post create hook won't be triggered.
	 */
	override createStrongAbortDeferredTransition() {
		createStrongAbortDeferredTransition(generateUUID)
	}
	/**
	 * This method creates an Assignment with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createAssignment(String ID, InternalModelElement ime, boolean hook){
		super.createAssignment => [ 
			setID(ID)
			internal = ime ?: createInternalAssignment => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.adapter.AssignmentEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Assignment with the given id. Post create hook won't be triggered.
	 */
	def createAssignment(String ID){
		createAssignment(ID,null,false)
	}
	
	/**
	 * This method creates an Assignment with the given id. Post create hook won't be triggered.
	 */
	def createAssignment(InternalModelElement ime) {
		createAssignment(generateUUID,ime,false)
	}
	
	override createAssignment() {
		createAssignment(generateUUID)
	}
	
	private def <T extends IdentifiableElement> setInternal(T elm, InternalIdentifiableElement internal) {
		elm => [
			if (id.isNullOrEmpty)
				ID = generateUUID
			switch elm {
				GraphModel: elm.internalElement = internal as InternalGraphModel
				ModelElement: elm.internalElement = internal as InternalModelElement
				Type: elm.internalElement = internal as InternalType
			}
		]
	}
	
	/**
	* This method creates a new SCChart object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the SCChart's save method to save your changes.
	*/
	def info.scce.cinco.product.scchart.scchart.SCChart createSCChart(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("scchart");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.scchart.factory.SCChartFactory.eINSTANCE.createSCChart();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(graph.internalElement);
		
		postCreates(graph);
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return graph;
	}
	
	
	def postCreates(info.scce.cinco.product.scchart.scchart.RootState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_RootState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.RootState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.RootState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_RootState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.Region me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_Region
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Region>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Region>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_Region', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.DataFlowRegion me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_DataFlowRegion
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.DataFlowRegion>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_DataFlowRegion', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.SuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_SuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.SuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.SuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_SuperState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.InitilalSuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_InitilalSuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.InitilalSuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.InitilalSuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_InitilalSuperState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.FinalSuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_FinalSuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.FinalSuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_FinalSuperState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.Declaration me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_Declaration
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Declaration>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Declaration>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_Declaration', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.Suspend me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_Suspend
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Suspend>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Suspend>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_Suspend', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.Action me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_Action
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Action>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.Action>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_Action', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.SCChartReferece me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_SCChartReferece
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.SCChartReferece>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.SCChartReferece>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_SCChartReferece', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.InitialSCChartReferece me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_InitialSCChartReferece
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.InitialSCChartReferece>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.InitialSCChartReferece>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_InitialSCChartReferece', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.FinalSCChartReferece me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.FinalSCChartReferece>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_FinalSCChartReferece', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.scchart.SCChart me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_scchart_SCChart
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.SCChart>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.scchart.SCChart>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_scchart_SCChart', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
}
