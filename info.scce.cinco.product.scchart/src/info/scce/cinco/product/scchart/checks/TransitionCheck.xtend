package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece

class TransitionCheck extends SCChartCheck {

	override check(SCChart scchart) {
		checkTransitionorder(scchart)
		checkTransitionInRegion(scchart)
		checkStrongAbort(scchart)

	}

	def checkTransitionorder(SCChart scchart) {

		scchart.find(SimpleState).filter[getOutgoing.size > 1].forEach [
			var notValidTrans = false
			for (firstEdge : it.getOutgoing) {
				for (secondEdge : it.getOutgoing) {
					if (firstEdge.priority == secondEdge.priority && firstEdge != secondEdge) {
						notValidTrans = true
					}
				}
			}
			if(notValidTrans) it.addError("order of transitions not valid")
		]

		scchart.find(SuperState).filter[getOutgoing.size > 1].forEach [
			var notValidTrans = false
			for (firstEdge : it.getOutgoing) {
				for (secondEdge : it.getOutgoing) {
					if (firstEdge.priority == secondEdge.priority && firstEdge != secondEdge) {
						notValidTrans = true
					}
				}
			}
			if(notValidTrans) it.addError("order of transitions not valid")
		]

		scchart.find(SCChartReferece).filter[getOutgoing.size > 1].forEach [
			var notValidTrans = false
			for (firstEdge : it.getOutgoing) {
				for (secondEdge : it.getOutgoing) {
					if (firstEdge.priority == secondEdge.priority && firstEdge != secondEdge) {
						notValidTrans = true
					}
				}
			}
			if(notValidTrans) it.addError("order of transitions not valid")
		]
	}

	def checkTransitionInRegion(SCChart scchart) {
		scchart.find(AbstractTransition).forEach [
			if (it.getSourceElement.getContainer != it.getTargetElement.getContainer) {
				it.addError("source and target element of transition must have the same region")
			}
		]
	}

	def checkStrongAbort(SCChart scchart) {
		scchart.find(StrongAbortTransition).forEach [
			it.getSourceElement.getOutgoing.forEach [ outgoing |
				if (outgoing instanceof AbstractTransition) {
					if (it.priority > outgoing.priority &&
						!(outgoing instanceof StrongAbortTransition ||
							outgoing instanceof StrongAbortDeferredTransition ||
							outgoing instanceof StrongAbortHistoryTransition ||
							outgoing instanceof StrongAbortDeferredHistoryTransition)) {
						it.getSourceElement.addError(
							"strong abort transitions must have a higher priority than weak abort or termination transitions")
					}
				}
			]
		]

		scchart.find(StrongAbortDeferredTransition).forEach [
			it.getSourceElement.getOutgoing.forEach [ outgoing |
				if (outgoing instanceof AbstractTransition) {
					if (it.priority > outgoing.priority &&
						!(outgoing instanceof StrongAbortTransition ||
							outgoing instanceof StrongAbortDeferredTransition ||
							outgoing instanceof StrongAbortHistoryTransition ||
							outgoing instanceof StrongAbortDeferredHistoryTransition)) {
						it.getSourceElement.addError(
							"strong abort transitions must have a higher priority than weak abort or termination transitions")
					}
				}
			]
		]

		scchart.find(StrongAbortHistoryTransition).forEach [
			it.getSourceElement.getOutgoing.forEach [ outgoing |
				if (outgoing instanceof AbstractTransition) {
					if (it.priority > outgoing.priority &&
						!(outgoing instanceof StrongAbortTransition ||
							outgoing instanceof StrongAbortDeferredTransition ||
							outgoing instanceof StrongAbortHistoryTransition ||
							outgoing instanceof StrongAbortDeferredHistoryTransition)) {
						it.getSourceElement.addError(
							"strong abort transitions must have a higher priority than weak abort or termination transitions")
					}
				}
			]
		]

		scchart.find(StrongAbortDeferredHistoryTransition).forEach [
			it.getSourceElement.getOutgoing.forEach [ outgoing |
				if (outgoing instanceof AbstractTransition) {
					if (it.priority > outgoing.priority &&
						!(outgoing instanceof StrongAbortTransition ||
							outgoing instanceof StrongAbortDeferredTransition ||
							outgoing instanceof StrongAbortHistoryTransition ||
							outgoing instanceof StrongAbortDeferredHistoryTransition)) {
						it.getSourceElement.addError(
							"strong abort transitions must have a higher priority than weak abort or termination transitions")
					}
				}
			]
		]
	}
}
