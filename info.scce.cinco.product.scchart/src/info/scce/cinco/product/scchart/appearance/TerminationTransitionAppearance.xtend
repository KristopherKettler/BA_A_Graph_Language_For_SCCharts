package info.scce.cinco.product.scchart.appearance

import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition
import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider
import style.StyleFactory

class TerminationTransitionAppearance implements StyleAppearanceProvider<TerminationTransition> {
	
	override getAppearance(TerminationTransition transition, String arg1) {
		if(transition.immediate){
			StyleFactory.eINSTANCE.createAppearance => [
          		setLineStyle = style.LineStyle.DASH
        	]
		}
		else if(transition.condition.isEmpty||transition.condition=="<No condition>"){
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