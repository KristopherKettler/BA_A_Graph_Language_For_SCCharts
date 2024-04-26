package info.scce.cinco.product.scchart.generator

import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import de.jabc.cinco.meta.runtime.CincoRuntimeBaseClass
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import info.scce.cinco.product.scchart.mglid.scchart.Declaration
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import info.scce.cinco.product.scchart.mglid.scchart.Suspension
import info.scce.cinco.product.scchart.mglid.scchart.Action
import info.scce.cinco.product.scchart.mglid.scchart.Region
import info.scce.cinco.product.scchart.mglid.scchart.InitialState
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState
import org.eclipse.emf.common.util.EList
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition
import info.scce.cinco.product.scchart.mglid.scchart.Transition
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition
import info.scce.cinco.product.scchart.mglid.scchart.FinalState
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState
import info.scce.cinco.product.scchart.mglid.scchart.Connector
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition
import info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition
import org.apache.commons.cli.*;
import java.io.File
import java.io.IOException;
import org.eclipse.core.resources.IFile
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSCChartReferece

class CodeGenerator extends CincoRuntimeBaseClass implements IGenerator<SCChart>{
	
	String fileName
	
	override generate(SCChart scchart, IPath path, IProgressMonitor monitor) {
		val fullFileName = scchart.file.name
		fileName = fullFileName.substring(0, fullFileName.lastIndexOf('.'))
		val targetFile = workspaceRoot.getFileForLocation(path.append(fileName + ".sctx"))
		EclipseFileUtils.writeToFile(targetFile, template(scchart))
		Thread.sleep(100){
			commandLineParser(targetFile,scchart,path)
		}
	}
	
	def template(SCChart scchart) '''
	«FOR sCChartReferece :scchart.find(SCChartReferece)»
	import "«sCChartReferece.reference.file.name.substring(0, sCChartReferece.reference.file.name.lastIndexOf('.'))»"
	«ENDFOR»
	scchart «scchart.rootStates.head.name» {
		«IF scchart.rootStates.head.declarations!==null»
		«FOR declaration : scchart.rootStates.head.declarations»
		«declaration.genDeclaration»
		«ENDFOR»
		«ENDIF»
		«IF scchart.rootStates.head.suspensions!==null»
		«FOR Suspension : scchart.rootStates.head.suspensions»
		«Suspension.genSuspension»
		«ENDFOR»
		«ENDIF»
		«IF scchart.rootStates.head.actions!==null»
		«FOR action : scchart.rootStates.head.actions»
		«action.genAction»
		«ENDFOR»
		«ENDIF»
		«IF scchart.rootStates.head.regions!==null»
		«FOR region : scchart.rootStates.head.regions»
		«region.genRegion»
		«ENDFOR»
		«ENDIF»
	}
	'''
	
	
	
	def genDeclaration(Declaration declaration){
		var string = ''
		if(!declaration.inputOutput.trim.isEmpty){
			string = declaration.inputOutput + " "
		}
		if(declaration.constant){
			string = string + "const "
		}
		if(declaration.signal){
			string = string + "signal "
		}
		if(!declaration.declarationType.trim.isEmpty){
			string = string + declaration.declarationType + " "
		}
		if(declaration.name !== null ){
			string = string + declaration.name
		}
		if(declaration.assignment!==null){
			if(!declaration.assignment.trim.isEmpty){
				string = string + " = " + declaration.assignment
			}
		}
		return string
	}
	
	def genSuspension(Suspension Suspension){
		var string = ''
		if(!Suspension.suspensionType.trim.isEmpty){
			string = Suspension.suspensionType + " "
		}
		if(Suspension.condition!==null ){
			if(!Suspension.condition.trim.isEmpty){
				string = string + "if " + Suspension.condition
			}
		}
		return string
	}
	
	def genAction(Action action){
		var string = ''
		if(!action.actionType.trim.isEmpty){
			string = action.actionType + " "
		}
		if(action.condition!==null ){
			if(!action.condition.trim.isEmpty){
				string = string + "if " + action.condition
			}
		}
		if(action.effect!==null){
			if(!action.effect.trim.isEmpty){
				string = string + "do " + action.effect + " "
			}
		}
		return string
	}
	
	def genRegion(Region region)'''
		region «IF(region.name!==null)»«region.name»«ENDIF»«IF(region.label!==null)»"«region.label»"«ENDIF» {
			«IF region.superStates!==null»
			«FOR superState : region.superStates»
			«superState.genSuperState»
			«superState.getOutgoingAbstractTransitions().genEdgesOrder»
			«ENDFOR»
			«ENDIF»
			«IF region.simpleStates!==null»
			«FOR state : region.simpleStates»
			«state.genState»
			«state.getOutgoingAbstractTransitions().genEdgesOrder»
			«ENDFOR»
			«ENDIF»
			«FOR reference : region.SCChartRefereces»
			«reference.genReference»
			«reference.getOutgoingAbstractTransitions().genEdgesOrder»
			«ENDFOR»
		}
	'''
	
	def genSuperState(SuperState superState)'''
		«superState.superState» {
			«IF superState.declarations!==null»
			«FOR declaration : superState.declarations»
			«declaration.genDeclaration»
			«ENDFOR»
			«ENDIF»
			«IF superState.suspensions!==null»
			«FOR Suspension : superState.suspensions»
			«Suspension.genSuspension»
			«ENDFOR»
			«ENDIF»
			«IF superState.actions!==null»
			«FOR action : superState.actions»
			«action.genAction»
			«ENDFOR»
			«ENDIF»
			«IF superState.regions!==null»
			«FOR region : superState.regions»
			«region.genRegion»
			«ENDFOR»
			«ENDIF»
		}
	'''
		
	def superState(SuperState superState){
		var string = "state "
		string = string + superState.name
		if(superState.label!==null){
			string = string + " " + '"' + superState.label + '"'
		}
		switch superState {
			case superState instanceof InitialSuperState : return "initial " + string
			case superState instanceof FinalSuperState : return "final " + string
			case superState instanceof InitialFinalSuperState : return "initial final " + string
			default : return string
		}
	}
	
	def genState(SimpleState simpleState){
		var string = "state "
		string = string + simpleState.name
		if(simpleState.label!==null){
			string = string + " " + '"' + simpleState.label + '"'
		}
		switch simpleState {
			case simpleState instanceof InitialState : return "initial " + string
			case simpleState instanceof FinalState : return "final " + string
			case simpleState instanceof InitialFinalState : return "initial final " + string
			case simpleState instanceof Connector : return "connector " + string
			default : return string
		}
		
	}
	
	def genReference(SCChartReferece sCChartReferece){
		var string = "state "
		string = string + sCChartReferece.name
		if(sCChartReferece.label!==null){
			string = string + " " + '"' + sCChartReferece.label + '"'
		}
		var tmp1 = sCChartReferece.assignments
		var tmp2 = sCChartReferece.inputsOutputsOfRef
		var assignTo = "("
		//var cont = true
		while(tmp1.indexOf(",")!=-1){
			assignTo = assignTo + tmp1.substring(0,tmp1.indexOf(",")) + " to " + tmp2.substring(tmp2.substring(0,tmp2.indexOf(",")).lastIndexOf(" ")+1,tmp2.indexOf(",")+1)
			tmp1 = tmp1.substring(tmp1.indexOf(",")+1,tmp1.length)
			tmp2 = tmp2.substring(tmp2.indexOf(",")+1,tmp2.length)
			
		}
		assignTo = assignTo + tmp1+ " to " + tmp2.substring(tmp2.trim.lastIndexOf(" ")+1,tmp2.length) + ")"
		string = string + " is " + sCChartReferece.reference.name+assignTo
		switch sCChartReferece {
			case sCChartReferece instanceof InitialSCChartReferece : return "initial " + string
			case sCChartReferece instanceof FinalSCChartReferece : return "final " + string
			case sCChartReferece instanceof InitialFinalSCChartReferece : return "initial final " + string
			default : return string
		}
	}
	
	def genEdgesOrder(EList<AbstractTransition> transitions)'''
		«FOR i : 1..transitions.size»
		«FOR transition : transitions»
		«IF(transition.priority==i.toString)»
		«transition.genEdge»
		«ENDIF»
		«ENDFOR»
		«ENDFOR»
	'''

	
	def genEdge(AbstractTransition transition){
			switch transition {
				case transition instanceof Transition : return genTransition(transition as Transition)
				case transition instanceof TerminationTransition : return genTerminationTransition(transition as TerminationTransition)
				case transition instanceof StrongAbortTransition : return genStrongAbortTransition(transition as StrongAbortTransition)
				case transition instanceof DeferredTransition : return genDeferredTransition(transition as DeferredTransition)
				case transition instanceof HistoryTransition : return genHistoryTransition(transition as HistoryTransition)
				case transition instanceof TerminationDeferredTransition : return genTerminationDeferredTransition(transition as TerminationDeferredTransition)
				case transition instanceof StrongAbortDeferredTransition : return genStrongAbortDeferredTransition(transition as StrongAbortDeferredTransition)
				case transition instanceof TerminationHistoryTransition : return genTerminationHistoryTransition(transition as TerminationHistoryTransition)
				case transition instanceof StrongAbortHistoryTransition : return genStrongAbortHistoryTransition(transition as StrongAbortHistoryTransition)
				case transition instanceof DeferredHistoryTransition : return genDeferredHistoryTransition(transition as DeferredHistoryTransition)
				case transition instanceof StrongAbortDeferredHistoryTransition : return genStrongAbortDeferredHistoryTransition(transition as StrongAbortDeferredHistoryTransition)
				case transition instanceof TerminationDeferredHistoryTransition : return genTerminationDeferredHistoryTransition(transition as TerminationDeferredHistoryTransition)
			}
	}
	
	def genTransition(Transition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "go to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : return string + "go to " + (transition.getTargetElement as SimpleState).name
		}
	}
	
	def genTerminationTransition(TerminationTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : return string + "join to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : return string + "join to " + (transition.getTargetElement as SimpleState).name
		}
	}
	
	def genStrongAbortTransition(StrongAbortTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "abort to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : return string + "abort to " + (transition.getTargetElement as SimpleState).name
		}
	}
	
	def genDeferredTransition(DeferredTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "go to " + (transition.getTargetElement as SuperState).name + " deferred"
			case transition.getTargetElement instanceof SimpleState : return string + "go to " + (transition.getTargetElement as SimpleState).name + " deferred"
		}
	}
	
	def genHistoryTransition(HistoryTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		var history = "history"
		if(!transition.deepHistory){
			history =  "shallow " + history 
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "go to " + (transition.getTargetElement as SuperState).name + " " + history
			case transition.getTargetElement instanceof SimpleState : return string + "go to " + (transition.getTargetElement as SimpleState).name + " " + history
		}
	}
	
	def genTerminationDeferredTransition(TerminationDeferredTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : return string + "join to " + (transition.getTargetElement as SuperState).name + " deferred"
			case transition.getTargetElement instanceof SimpleState : return string + "join to " + (transition.getTargetElement as SimpleState).name + " deferred"
		}
	}
	
	def genStrongAbortDeferredTransition(StrongAbortDeferredTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "abort to " + (transition.getTargetElement as SuperState).name + " deferred"
			case transition.getTargetElement instanceof SimpleState : return string + "abort to " + (transition.getTargetElement as SimpleState).name + " deferred"
		}
	}
	
	def genTerminationHistoryTransition(TerminationHistoryTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		var history = "history"
		if(!transition.deepHistory){
			history =  "shallow " + history 
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : return string + "join to " + (transition.getTargetElement as SuperState).name + " " + history
			case transition.getTargetElement instanceof SimpleState : return string + "join to " + (transition.getTargetElement as SimpleState).name + " " + history
		}
	}
	
	def genStrongAbortHistoryTransition(StrongAbortHistoryTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		var history = "history"
		if(!transition.deepHistory){
			history =  "shallow " + history 
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "abort to " + (transition.getTargetElement as SuperState).name + " " + history
			case transition.getTargetElement instanceof SimpleState : return string + "abort to " + (transition.getTargetElement as SimpleState).name + " " + history
		}
	}
	
	def genDeferredHistoryTransition(DeferredHistoryTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		var history = "history"
		if(!transition.deepHistory){
			history =  "shallow " + history 
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "go to " + (transition.getTargetElement as SuperState).name + " deferred" + " " + history
			case transition.getTargetElement instanceof SimpleState : return string + "go to " + (transition.getTargetElement as SimpleState).name + " deferred" + " " + history
		}
	}
	
	
	def genStrongAbortDeferredHistoryTransition(StrongAbortDeferredHistoryTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		var history = "history"
		if(!transition.deepHistory){
			history =  "shallow " + history 
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "abort to " + (transition.getTargetElement as SuperState).name + " deferred" + " " + history
			case transition.getTargetElement instanceof SimpleState : return string + "abort to " + (transition.getTargetElement as SimpleState).name + " deferred" + " " + history
		}
	}
	
	def genTerminationDeferredHistoryTransition(TerminationDeferredHistoryTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!(transition.condition.trim.isEmpty||transition.condition=="<No condition>")){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.immediate){
			string = "immediate " + string
		}
		if(transition.effect!==null){
			if(!(transition.effect.trim.isEmpty || transition.effect=="<No effect>")){
				string = string + "do " + transition.effect + " "
			}
		}
		var history = "history"
		if(!transition.deepHistory){
			history =  "shallow " + history 
		}
		switch transition {
			case transition.getTargetElement instanceof SuperState : return string + "join to " + (transition.getTargetElement as SuperState).name + " deferred" + " " + history
			case transition.getTargetElement instanceof SimpleState : return string + "join to " + (transition.getTargetElement as SimpleState).name + " deferred" + " " + history
		}
	}
	
	def commandLineParser(IFile file, SCChart scchart, IPath path)throws ParseException{
		
		try {
			var File f = new File("KIELER_CLI/kicodia-win.bat")
			var String absolute = f.getAbsolutePath()
			val targetFile = file.getLocation().removeLastSegments(1).toFile().getAbsolutePath();
			val scchartSLTX =  file.getLocation().toFile().getAbsolutePath();
			var generatorOutput = ""
			switch scchart {
				case scchart.rootStates.head.generatorOutput=="Identity Diagram" : generatorOutput ="-s de.cau.cs.kieler.kicool.identity -d"
				case scchart.rootStates.head.generatorOutput=="Netlist-based Compilation (C)" : generatorOutput ="-s de.cau.cs.kieler.sccharts.netlist"
				case scchart.rootStates.head.generatorOutput=="Netlist-based Compilation (Java)" : generatorOutput ="-s de.cau.cs.kieler.sccharts.netlist.java"
				case scchart.rootStates.head.generatorOutput=="Netlist-based Deployment (NXJ)" : generatorOutput ="-s de.cau.cs.kieler.sccharts.netlist.nxj.deploy"
				case scchart.rootStates.head.generatorOutput=="Priority-based Compilation (C)" : generatorOutput ="-s de.cau.cs.kieler.sccharts.priority"
				case scchart.rootStates.head.generatorOutput=="Priority-based Compilation (Java)" : generatorOutput ="-s de.cau.cs.kieler.sccharts.priority.java"
				case scchart.rootStates.head.generatorOutput=="State-based Compilation (C) lean-mode (Template)" : generatorOutput ="-s  de.cau.cs.kieler.sccharts.statebased.lean.c.template"
			}
			System.out.println("generateSCChart: "
                               + targetFile)
            System.out.println("Original path: "
                               + f.getPath());
            System.out.println("Absolute path: "
                               + absolute);
			System.out.println("Absolute path: "
                               + "start " + absolute + " " + scchartSLTX + " -o " + targetFile + " " + generatorOutput)
			var Process process = Runtime.getRuntime().exec("cmd.exe /c start " + absolute + " " + scchartSLTX + " -o " + targetFile + " " + generatorOutput)
			
			var int exitVal = process.waitFor();
			if (exitVal == 0) {
				System.out.println("Success!");
				Runtime.getRuntime().exec("taskkill /f /im cmd.exe")
			} 
			else {
				System.out.println("Fail!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
