package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.Action
import java.util.Map

class ActionTypeProvider  extends CincoValuesProvider<Action, String>{
	
	override Map<String, String> getPossibleValues(Action type) {
		val String[] arr = #['<set action>','entry','during','immediate during','exit'] 
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
	
}