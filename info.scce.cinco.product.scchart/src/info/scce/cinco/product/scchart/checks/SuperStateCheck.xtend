package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import static extension java.lang.Character.*

class SuperStateCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		scchart.find(SuperState).forEach[
			if(it.name=="<set name>" || it.name.isEmpty){
				it.addError("set name")
			}
			else if(!((it.name.charAt(0) >= 'a' && it.name.charAt(0) <= 'z') || (it.name.charAt(0) >= 'A' && it.name.charAt(0) <= 'Z'))) {
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
		]
	}
}
