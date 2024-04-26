package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import static extension java.lang.Character.*

class RootStateCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		for(rootState : scchart.rootStates){
			if(rootState.name=="<set name>" || rootState.name.isEmpty){
				rootState.addError("set name")
			}
			else if(!((rootState.name.charAt(0) >= 'a' && rootState.name.charAt(0) <= 'z') || (rootState.name.charAt(0) >= 'A' && rootState.name.charAt(0) <= 'Z'))) {
				rootState.addError("name should start a with letter")
			}
			else {
				var break = false
				var i = 1
				while(i<rootState.name.length&&!break){
					if(!((rootState.name.charAt(i) >= 'a' && rootState.name.charAt(i) <= 'z') || (rootState.name.charAt(i) >= 'A' && rootState.name.charAt(i) <= 'Z') || rootState.name.charAt(i).isDigit)){
						rootState.addError("name should only contain letters and numbers")
						break = true
					}
					i++
				}
			}
		}
	}
}