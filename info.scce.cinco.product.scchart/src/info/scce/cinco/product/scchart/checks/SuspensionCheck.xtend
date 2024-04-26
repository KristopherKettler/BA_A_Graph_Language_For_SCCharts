package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import static extension java.lang.Character.*
import info.scce.cinco.product.scchart.mglid.scchart.Suspension

class SuspensionCheck extends SCChartCheck {
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		scchart.find(Suspension).forEach[
			if(it.suspensionType == "<set suspension>") {
				it.addError("set suspensiontype")
			}
//			else {
//				var break = false
//				var i = 1
//				while(i<it.condition.length&&!break){
//					if(!((it.condition.charAt(i) >= 'a' && it.condition.charAt(i) <= 'z') || (it.condition.charAt(i) >= 'A' && it.condition.charAt(i) <= 'Z') || it.condition.charAt(i).isDigit || it.condition.charAt(i)=='&' || it.condition.charAt(i)=='|' || it.condition.charAt(i)=='>' || it.condition.charAt(i)=='<'|| it.condition.charAt(i)=='+'|| it.condition.charAt(i)=='*'|| it.condition.charAt(i)=='-'|| it.condition.charAt(i)=='/'|| it.condition.charAt(i)=='=')){
//						it.addError("invalid condition")
//						break = true
//					}
//					i++
//				}
//			}
		]
	}
}
