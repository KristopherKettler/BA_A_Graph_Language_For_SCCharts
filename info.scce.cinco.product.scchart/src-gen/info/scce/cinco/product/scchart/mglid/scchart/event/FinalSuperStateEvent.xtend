// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventGeneratedClassTemplate

package info.scce.cinco.product.scchart.mglid.scchart.event

import de.jabc.cinco.meta.core.event.hub.Subscriber
import de.jabc.cinco.meta.plugin.event.api.event.ContainerEvent
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostDoubleClickPayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostSelectPayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreAttributeChangePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreCreateNodePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreDoubleClickPayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreSelectPayload
import de.jabc.cinco.meta.plugin.event.api.util.EventApiExtension
import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState
import java.util.List

final class FinalSuperStateEvent implements ContainerEvent<FinalSuperState> {
	
	protected extension EventApiExtension = new EventApiExtension
	
	var static FinalSuperStateEvent eventInstance
	
	var List<Subscriber> subscribers
	
	protected new () {
		// Intentionally left blank
	}
	
	def final static FinalSuperStateEvent getInstance() {
		if (eventInstance === null) {
			eventInstance = new FinalSuperStateEvent
		}
		return eventInstance
	}
	
	override final subscribe() {
		subscribers = #[
			subscribePayloadSubscriber('event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreAttributeChangePayload<FinalSuperState> payload |
					instance.preAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreCreateNodePayload<FinalSuperState> payload |
					instance.preCreate(payload)
			],
			subscribePayloadSubscriber('event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreDeletePayload<FinalSuperState> payload |
					instance.preDelete(payload)
			],
			subscribePayloadSubscriber('event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreDoubleClickPayload<FinalSuperState> payload |
					instance.preDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreMovePayload<FinalSuperState> payload |
					instance.preMove(payload)
			],
			subscribePayloadSubscriber('event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreResizePayload<FinalSuperState> payload |
					instance.preResize(payload)
			],
			subscribePayloadSubscriber('event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PreSelectPayload<FinalSuperState> payload |
					instance.preSelect(payload)
			],
			subscribePayloadSubscriber('event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostAttributeChangePayload<FinalSuperState> payload |
					instance.postAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostCreatePayload<FinalSuperState> payload |
					instance.postCreate(payload)
			],
			subscribePayloadSubscriber('event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostDeletePayload<FinalSuperState> payload |
					instance.postDelete(payload)
			],
			subscribePayloadSubscriber('event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostDoubleClickPayload<FinalSuperState> payload |
					instance.postDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.post.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostMovePayload<FinalSuperState> payload |
					instance.postMove(payload)
			],
			subscribePayloadSubscriber('event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostResizePayload<FinalSuperState> payload |
					instance.postResize(payload)
			],
			subscribePayloadSubscriber('event.post.select.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState') [
				PostSelectPayload<FinalSuperState> payload |
					instance.postSelect(payload)
			]
		]
	}
	
	override final unsubscribe() {
		subscribers?.forEach [ unsubscribe ]
		subscribers = null
	}
	
	override final preAttributeChange(FinalSuperState element, String attribute, Object newValue) {
		SuperStateEvent.instance.preAttributeChange(element, attribute, newValue)
	}
	
	override final preAttributeChange(PreAttributeChangePayload<FinalSuperState> it) {
		preAttributeChange(element, attribute, newValue)
	}
	
	override preCreate(Class<? extends FinalSuperState> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		SuperStateEvent.instance.preCreate(elementClass, container, x, y, width, height)
	}
	
	override final preCreate(PreCreateNodePayload<FinalSuperState> it) {
		preCreate(elementClass, container, x, y, width, height)
	}
	
	override preDelete(FinalSuperState element) {
		SuperStateEvent.instance.preDelete(element)
	}
	
	override final preDelete(PreDeletePayload<FinalSuperState> it) {
		preDelete(element)
	}
	
	override final preDoubleClick(FinalSuperState element) {
		SuperStateEvent.instance.preDoubleClick(element)
	}
	
	override final preDoubleClick(PreDoubleClickPayload<FinalSuperState> it) {
		preDoubleClick(element)
	}
	
	override preMove(FinalSuperState element, ModelElementContainer newContainer, int newX, int newY) {
		SuperStateEvent.instance.preMove(element, newContainer, newX, newY)
	}
	
	override final preMove(PreMovePayload<FinalSuperState> it) {
		preMove(element, newContainer, newX, newY)
	}
	
	override preResize(FinalSuperState element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		SuperStateEvent.instance.preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preResize(PreResizePayload<FinalSuperState> it) {
		preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preSelect(FinalSuperState element) {
		SuperStateEvent.instance.preSelect(element)
	}
	
	override final preSelect(PreSelectPayload<FinalSuperState> it) {
		preSelect(element)
	}
	
	override postAttributeChange(FinalSuperState element, String attribute, Object oldValue) {
		SuperStateEvent.instance.postAttributeChange(element, attribute, oldValue)
	}
	
	override final postAttributeChange(PostAttributeChangePayload<FinalSuperState> it) {
		postAttributeChange(element, attribute, oldValue)
	}
	
	override postCreate(FinalSuperState element) {
		SuperStateEvent.instance.postCreate(element)
	}
	
	override final postCreate(PostCreatePayload<FinalSuperState> it) {
		postCreate(element)
	}
	
	override postDelete(FinalSuperState element) {
		SuperStateEvent.instance.postDelete(element)
	}
	
	override final postDelete(PostDeletePayload<FinalSuperState> it) {
		postDelete(element)
	}
	
	override postDoubleClick(FinalSuperState element) {
		SuperStateEvent.instance.postDoubleClick(element)
	}
	
	override final postDoubleClick(PostDoubleClickPayload<FinalSuperState> it) {
		postDoubleClick(element)
	}
	
	override postMove(FinalSuperState element, ModelElementContainer oldContainer, int oldX, int oldY) {
		SuperStateEvent.instance.postMove(element, oldContainer, oldX, oldY)
	}
	
	override final postMove(PostMovePayload<FinalSuperState> it) {
		postMove(element, oldContainer, oldX, oldY)
	}
	
	override postResize(FinalSuperState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		SuperStateEvent.instance.postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override final postResize(PostResizePayload<FinalSuperState> it) {
		postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override postSelect(FinalSuperState element) {
		SuperStateEvent.instance.postSelect(element)
	}
	
	override final postSelect(PostSelectPayload<FinalSuperState> it) {
		postSelect(element)
	}
	
}