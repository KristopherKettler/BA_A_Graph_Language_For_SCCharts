package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.Declaration
import static extension java.lang.Character.*

class DeclarationCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
		checkAssignmentConvention(scchart)
		checkSignalInputOutput(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		scchart.find(Declaration).forEach[
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
	
	def checkAssignmentConvention(SCChart scchart){
//		scchart.find(Declaration).forEach[
//			if(it.assignment!==null){
//				if(!it.assignment.isEmpty){
//					if(!((it.assignment.charAt(0) >= 'a' && it.assignment.charAt(0) <= 'z') || (it.assignment.charAt(0) >= 'A' && it.assignment.charAt(0) <= 'Z'))) {
//						it.addError("name should start a with letter")
//					}
//					else {
//						var break = false
//						var i = 1
//						while(i<it.assignment.length&&!break){
//							if(!((it.assignment.charAt(i) >= 'a' && it.assignment.charAt(i) <= 'z') || (it.assignment.charAt(i) >= 'A' && it.assignment.charAt(i) <= 'Z') || it.assignment.charAt(i).isDigit)){
//								it.addError("assignment should only contain letters and numbers")
//								break = true
//							}
//							i++
//						}
//					}
//				}
//
//			}
//		]
	}
	
	def checkSignalInputOutput(SCChart scchart){
		scchart.find(Declaration).forEach[
			if(it.declarationType==" "&&it.inputOutput!=" "&&!it.signal&&it.name!="<set name>"){
				it.addError("set declaration type")
			}
		]
	}
}