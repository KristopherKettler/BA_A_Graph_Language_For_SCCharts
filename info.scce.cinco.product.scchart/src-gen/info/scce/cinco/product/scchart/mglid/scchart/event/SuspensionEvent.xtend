// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventGeneratedClassTemplate

package info.scce.cinco.product.scchart.mglid.scchart.event

import de.jabc.cinco.meta.core.event.hub.Subscriber
import de.jabc.cinco.meta.plugin.event.api.event.NodeEvent
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
import info.scce.cinco.product.scchart.mglid.scchart.Suspension
import java.util.List

abstract class SuspensionEvent implements NodeEvent<Suspension> {
	
	protected extension EventApiExtension = new EventApiExtension
	
	var static SuspensionEvent eventInstance
	
	var List<Subscriber> subscribers
	
	protected new () {
		// Intentionally left blank
	}
	
	def final static SuspensionEvent getInstance() {
		if (eventInstance === null) {
			eventInstance = new info.scce.cinco.product.scchart.events.SuspensionEvent
		}
		return eventInstance
	}
	
	override final subscribe() {
		subscribers = #[
			subscribePayloadSubscriber('event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreAttributeChangePayload<Suspension> payload |
					instance.preAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreCreateNodePayload<Suspension> payload |
					instance.preCreate(payload)
			],
			subscribePayloadSubscriber('event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreDeletePayload<Suspension> payload |
					instance.preDelete(payload)
			],
			subscribePayloadSubscriber('event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreDoubleClickPayload<Suspension> payload |
					instance.preDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreMovePayload<Suspension> payload |
					instance.preMove(payload)
			],
			subscribePayloadSubscriber('event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreResizePayload<Suspension> payload |
					instance.preResize(payload)
			],
			subscribePayloadSubscriber('event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PreSelectPayload<Suspension> payload |
					instance.preSelect(payload)
			],
			subscribePayloadSubscriber('event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostAttributeChangePayload<Suspension> payload |
					instance.postAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostCreatePayload<Suspension> payload |
					instance.postCreate(payload)
			],
			subscribePayloadSubscriber('event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostDeletePayload<Suspension> payload |
					instance.postDelete(payload)
			],
			subscribePayloadSubscriber('event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostDoubleClickPayload<Suspension> payload |
					instance.postDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostMovePayload<Suspension> payload |
					instance.postMove(payload)
			],
			subscribePayloadSubscriber('event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostResizePayload<Suspension> payload |
					instance.postResize(payload)
			],
			subscribePayloadSubscriber('event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Suspension') [
				PostSelectPayload<Suspension> payload |
					instance.postSelect(payload)
			]
		]
	}
	
	override final unsubscribe() {
		subscribers?.forEach [ unsubscribe ]
		subscribers = null
	}
	
	override final preAttributeChange(Suspension element, String attribute, Object newValue) {
		// Intentionally left blank
	}
	
	override final preAttributeChange(PreAttributeChangePayload<Suspension> it) {
		preAttributeChange(element, attribute, newValue)
	}
	
	override preCreate(Class<? extends Suspension> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// Intentionally left blank
	}
	
	override final preCreate(PreCreateNodePayload<Suspension> it) {
		preCreate(elementClass, container, x, y, width, height)
	}
	
	override preDelete(Suspension element) {
		// Intentionally left blank
	}
	
	override final preDelete(PreDeletePayload<Suspension> it) {
		preDelete(element)
	}
	
	override final preDoubleClick(Suspension element) {
		// Intentionally left blank
	}
	
	override final preDoubleClick(PreDoubleClickPayload<Suspension> it) {
		preDoubleClick(element)
	}
	
	override preMove(Suspension element, ModelElementContainer newContainer, int newX, int newY) {
		// Intentionally left blank
	}
	
	override final preMove(PreMovePayload<Suspension> it) {
		preMove(element, newContainer, newX, newY)
	}
	
	override preResize(Suspension element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// Intentionally left blank
	}
	
	override final preResize(PreResizePayload<Suspension> it) {
		preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preSelect(Suspension element) {
		// Intentionally left blank
	}
	
	override final preSelect(PreSelectPayload<Suspension> it) {
		preSelect(element)
	}
	
	override postAttributeChange(Suspension element, String attribute, Object oldValue) {
		// Intentionally left blank
	}
	
	override final postAttributeChange(PostAttributeChangePayload<Suspension> it) {
		postAttributeChange(element, attribute, oldValue)
	}
	
	override postCreate(Suspension element) {
		// Intentionally left blank
	}
	
	override final postCreate(PostCreatePayload<Suspension> it) {
		postCreate(element)
	}
	
	override postDelete(Suspension element) {
		[ /* Intentionally left blank */ ]
	}
	
	override final postDelete(PostDeletePayload<Suspension> it) {
		postDelete(element)
	}
	
	override postDoubleClick(Suspension element) {
		// Intentionally left blank
	}
	
	override final postDoubleClick(PostDoubleClickPayload<Suspension> it) {
		postDoubleClick(element)
	}
	
	override postMove(Suspension element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// Intentionally left blank
	}
	
	override final postMove(PostMovePayload<Suspension> it) {
		postMove(element, oldContainer, oldX, oldY)
	}
	
	override postResize(Suspension element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// Intentionally left blank
	}
	
	override final postResize(PostResizePayload<Suspension> it) {
		postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override postSelect(Suspension element) {
		// Intentionally left blank
	}
	
	override final postSelect(PostSelectPayload<Suspension> it) {
		postSelect(element)
	}
	
}
