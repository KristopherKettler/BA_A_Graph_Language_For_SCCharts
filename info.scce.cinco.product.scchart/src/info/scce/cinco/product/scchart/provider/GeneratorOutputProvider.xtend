package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import java.util.Map

class GeneratorOutputProvider extends CincoValuesProvider<RootState, String>{
	
	override Map<String, String> getPossibleValues(RootState type) {
		val String[] arr = #['Identity Diagram','Netlist-based Compilation (C)','Netlist-based Compilation (Java)','Netlist-based Deployment (NXJ)','Priority-based Compilation (C)','Priority-based Compilation (Java)','State-based Compilation (C) lean-mode (Template)'] 
		
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
}