package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import static extension java.lang.Character.*
import info.scce.cinco.product.scchart.mglid.scchart.Region
import info.scce.cinco.product.scchart.mglid.scchart.RootState

class RegionCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
		checkForInitialState(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		scchart.find(Region).forEach[
			if(it.name!==null&&!it.name.isEmpty){
				if(!((it.name.charAt(0) >= 'a' && it.name.charAt(0) <= 'z') || (it.name.charAt(0) >= 'A' && it.name.charAt(0) <= 'Z'))) {
					it.addError("name should start a with letter")
				}
				else {
					var break = false
					var i = 1
					while(i<it.name.length&&!break){
						if(!((it.name.charAt(i) >= 'a' && it.name.charAt(i) <= 'z') || (it.name.charAt(i) >= 'A' && it.name.charAt(i) <= 'Z') || it.name.charAt(i).isDigit)){
							it.addError("name should only contain letters and numbers")
							break = true
						}
						i++
					}
				}
			}
		]
	}
	
	def checkForInitialState(SCChart scchart){
		scchart.find(Region).forEach[
			var count = 0
			if(it.getInitialStates!==null){
				count = count + it.getInitialStates.size 
			}
			if(it.getInitialFinalStates!==null){
				count = count + it.getInitialFinalStates.size 
			}
			if(it.getInitialSuperStates!==null){
				count = count + it.getInitialSuperStates.size 
			}
			if(it.getInitialFinalSuperStates!==null){
				count = count + it.getInitialFinalSuperStates.size 
			}
			if(count!=1){
				it.addError("region may only have one initial state")
			}
		]
	}
}