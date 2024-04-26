package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition

class AbstractTransitionPriorityProvider extends CincoValuesProvider<AbstractTransition, String>{
	
	override getPossibleValues(AbstractTransition abstractTransition) {
		var map = newLinkedHashMap
		for(var i = 1 ; i <= abstractTransition.getSourceElement.getOutgoing.size;i++){
			map.put(i.toString,i.toString)
		}
		return map
	}
}