package info.scce.cinco.product.scchart.adapter

class AssignmentEContentAdapter extends org.eclipse.emf.ecore.util.EContentAdapter {

	extension de.jabc.cinco.meta.runtime.xapi.GraphModelExtension = new de.jabc.cinco.meta.runtime.xapi.GraphModelExtension

	override notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
		super.notifyChanged(notification)
		
		val o = notification.notifier
		val feature = notification.feature
		if (o instanceof info.scce.cinco.product.scchart.scchart
		.internal.InternalAssignment) {
			if (o.eContainer == null) return;
				switch feature {
					org.eclipse.emf.ecore.EStructuralFeature case feature.isRelevant: {
						o.element?.rootElement?.updateModelElements
					}
				}
		}
	}
	
	private def isRelevant(org.eclipse.emf.ecore.EStructuralFeature ftr) {
		ftr.eDeliver && info.scce.cinco.product.scchart.scchart
		.internal.InternalPackage.eINSTANCE.EClassifiers.contains(ftr?.eContainer)
	}

}
