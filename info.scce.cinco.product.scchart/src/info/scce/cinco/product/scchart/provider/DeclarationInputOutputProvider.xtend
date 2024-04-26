package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map
import info.scce.cinco.product.scchart.mglid.scchart.Declaration

class DeclarationInputOutputProvider extends CincoValuesProvider<Declaration, String> {

	override Map<String, String> getPossibleValues(Declaration inputOutput) {
		
		val String[] arr = #[' ','input','output','input output'] 
		
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
}
