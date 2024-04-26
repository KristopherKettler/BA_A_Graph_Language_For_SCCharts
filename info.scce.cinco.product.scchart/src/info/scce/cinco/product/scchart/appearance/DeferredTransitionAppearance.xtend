package info.scce.cinco.product.scchart.appearance

import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition
import style.StyleFactory

class DeferredTransitionAppearance implements  StyleAppearanceProvider<DeferredTransition> {
	
	override getAppearance(DeferredTransition transition, String arg1) {
		if(transition.immediate){
			StyleFactory.eINSTANCE.createAppearance => [
          		setLineStyle = style.LineStyle.DASH
        	]
		}
		else{
			StyleFactory.eINSTANCE.createAppearance => [
            	setLineStyle = style.LineStyle.SOLID
        	]
		}
	}
}