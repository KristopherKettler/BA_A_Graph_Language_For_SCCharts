package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.Action
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import static extension java.lang.Character.*

class ActionCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		scchart.find(Action).forEach[
			if(it.actionType == "<set action>") {
				it.addError("set actiontype")
			}
//			else if(it.condition!==null){
//				var break = false
//				var i = 1
//				while(i<it.condition.length&&!break){
//					if(!((it.condition.charAt(i) >= 'a' && it.condition.charAt(i) <= 'z') || (it.condition.charAt(i) >= 'A' && it.condition.charAt(i) <= 'Z') || it.condition.charAt(i).isDigit)||!( it.effect.charAt(i)=='=')){
//						it.addError("invalid condition")
//						break = true
//					}
//					i++
//				}
//			}
//			else if(it.effect!==null){
//				var break = false
//				var i = 1
//				while(i<it.effect.length&&!break){
//					if(!((it.effect.charAt(i) >= 'a' && it.effect.charAt(i) <= 'z') || (it.effect.charAt(i) >= 'A' && it.effect.charAt(i) <= 'Z') || it.effect.charAt(i).isDigit || it.effect.charAt(i)=='+'|| it.effect.charAt(i)=='*'|| it.effect.charAt(i)=='-'|| it.effect.charAt(i)=='/'|| it.effect.charAt(i)=='=')){
//						it.addError("invalid effect")
//						break = true
//					}
//					i++
//				}
//			}
		]
	}
}
