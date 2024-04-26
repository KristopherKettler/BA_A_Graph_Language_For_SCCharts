package info.scce.cinco.product.scchart.provider

import info.scce.cinco.product.scchart.mglid.scchart.Suspension
import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map

class SuspensionTypeProvider extends CincoValuesProvider<Suspension, String> {
	
	override Map<String, String> getPossibleValues(Suspension type) {
		val String[] arr = #['<set suspension>','suspend','immediate suspend','weak suspend','immediate weak suspend'] 
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
}