package info.scce.cinco.product.scchart.adapter

class SCChartEContentAdapter extends org.eclipse.emf.ecore.util.EContentAdapter implements de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter{

	override notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
		super.notifyChanged(notification)
		val o = notification.notifier
		val feature = notification.feature
		if (o instanceof info.scce.cinco.product.scchart.scchart.internal.InternalSCChart) {
			if (o.eContainer == null && !(o instanceof graphmodel.internal.InternalGraphModel)) return;
			switch feature {
				org.eclipse.emf.ecore.EStructuralFeature case feature.isRelevant: {
					// event.post.attributeChange.info_scce_cinco_product_scchart_scchart_SCChart
					val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload<info.scce.cinco.product.scchart.scchart.SCChart>(o.element as info.scce.cinco.product.scchart.scchart.SCChart, feature.name, notification.oldValue)
					val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload<info.scce.cinco.product.scchart.scchart.SCChart>, java.lang.Void>('event.post.attributeChange.info_scce_cinco_product_scchart_scchart_SCChart', eventPayload)
					de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
				}
			}
		}
	}
	
	private def isRelevant(org.eclipse.emf.ecore.EStructuralFeature ftr) {
		ftr.eDeliver 
			&& info.scce.cinco.product.scchart.scchart.internal.InternalPackage.eINSTANCE.EClassifiers.contains(ftr?.eContainer)
			&& ftr.name != "libraryComponentUID"
	}
}
