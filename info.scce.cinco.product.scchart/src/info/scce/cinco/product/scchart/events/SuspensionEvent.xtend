// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import info.scce.cinco.product.scchart.mglid.scchart.Suspension
import java.util.UUID

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuspensionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Suspension" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Suspension> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Suspension element)
 * - preMove(Suspension element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Suspension element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Suspension element, String attribute, Object oldValue)
 * - postCreate(Suspension element)
 * - postDelete(Suspension element)
 * - postDoubleClick(Suspension element)
 * - postMove(Suspension element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Suspension element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Suspension element)
 */
final class SuspensionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuspensionEvent {
	
	override postCreate(Suspension element) {
		element.uuid=UUID.randomUUID.toString
		var boolean continue= false
		if(element.rootElement.rootStates.head.suspensions!==null){
			for(Suspension : element.rootElement.rootStates.head.suspensions){
				if(Suspension.uuid==element.uuid){
					var int declarationCount = 0
					if(element.rootElement.rootStates.head.declarations !== null){
						declarationCount=element.rootElement.getRootStates.head.declarations.size
					}
					for(var i = 0; i<element.rootElement.rootStates.head.suspensions.size;i++){
						element.rootElement.rootStates.head.suspensions.get(i).x=10
						element.rootElement.rootStates.head.suspensions.get(i).y=30+13*declarationCount+13*i
						element.rootElement.rootStates.head.suspensions.get(i).width=element.rootElement.rootStates.head.width-20
						element.rootElement.rootStates.head.suspensions.get(i).height=13
					}
					if(element.rootElement.rootStates.head.actions !== null){
						for(action : element.rootElement.rootStates.head.actions){
							action.y = action.y + 13
						}
						declarationCount+=element.rootElement.getRootStates.head.actions.size
					}
					declarationCount+=element.rootElement.getRootStates.head.suspensions.size
					if(element.rootElement.rootStates.head.regions!==null){
						for(region : element.rootElement.rootStates.head.regions){
							if(region.y<30+declarationCount*13){
								region.y = region.y + 13
								region.height = region.height - 13
							}
						}
					}
					continue = true
				}
			}
		}
		if(!continue){
			for(region : element.rootElement.rootStates.head.regions){
				if(region.superStates !== null){
					for(superState : region.superStates){
						postCreateSuspension(superState,element)
					}
				}
			}
		}
	}
	
	def postCreateSuspension(SuperState superState, Suspension suspension){
		var boolean continue = false
		if(superState.suspensions !== null){
			for(SuspensionList : superState.suspensions){
				if(SuspensionList.uuid==suspension.uuid){
					var int declarationCount = 0
					if(superState.declarations !== null){
						declarationCount=superState.declarations.size
					}
					for(var i = 0; i<superState.suspensions.size;i++){
						superState.suspensions.get(i).x=10
						superState.suspensions.get(i).y=30+13*declarationCount+13*i
						superState.suspensions.get(i).width=superState.width-20
						superState.suspensions.get(i).height=13
					}
					if(superState.actions !== null){
						for(action : superState.actions){
							action.y = action.y + 13
						}
						declarationCount+=superState.actions.size
					}	
					declarationCount+=superState.suspensions.size
					if(superState.regions!==null){
						for(region : superState.regions){
							if(region.y<30+declarationCount*13){
								region.y = region.y + 13
								region.height = region.height - 13
							}
						}
					}
					continue = true
				}
			}
		}
		if(!continue && superState.regions!==null){
			for(region : superState.regions){
				if(region.superStates !== null){
					for(superStateList: region.superStates){
						postCreateSuspension(superStateList,suspension)
					}
				}
			}
		}
	}
	
	override postDelete(Suspension element) {
		var boolean continue= false
		if(element.rootElement.rootStates.head.suspensions!==null){
			for(var j = 0; j<element.rootElement.rootStates.head.suspensions.size;j++){
				if(element.rootElement.rootStates.head.suspensions.get(j).uuid==element.uuid){
					var int declarationCount = 0
					if(element.rootElement.rootStates.head.declarations !== null){
						declarationCount=element.rootElement.getRootStates.head.declarations.size
					}
					for(var i = j; i<element.rootElement.rootStates.head.suspensions.size;i++){
						element.rootElement.rootStates.head.suspensions.get(i).y=element.rootElement.rootStates.head.suspensions.get(i).y-13
					}
					if(element.rootElement.rootStates.head.actions !== null){
						for(action : element.rootElement.rootStates.head.actions){
							action.y = action.y - 13
						}
						declarationCount+=element.rootElement.getRootStates.head.actions.size
					}
					declarationCount+=element.rootElement.getRootStates.head.suspensions.size
					if(element.rootElement.rootStates.head.regions!==null){
						for(region : element.rootElement.rootStates.head.regions){
							if(region.y==33+declarationCount*13){
								region.y = region.y - 13
								region.height= region.height+13
							}
						}
					}
					continue = true
				}
			}
		}
		if(!continue){
			for(region : element.rootElement.rootStates.head.regions){
				if(region.superStates !== null){
					for(superState : region.superStates){
						postDeleteSuspension(superState,element)
					}
				}
			}
		}
		// Set up your post delete Runnable here.
		// This will be executed pre delete.
		return [
			// This is your post delete Runnable.
			// This will be executed post delete.
		]
	}
	
	def postDeleteSuspension(SuperState superState, Suspension suspension){
		var boolean continue = false
		if(superState.suspensions !== null){
			for(var j = 0; j<superState.suspensions.size;j++){
				if(superState.suspensions.get(j).uuid==suspension.uuid){
					var int declarationCount = 0
					if(superState.declarations !== null){
						declarationCount=superState.declarations.size
					}
					for(var i = j; i<superState.suspensions.size;i++){
						superState.suspensions.get(i).y=superState.suspensions.get(i).y-13
					}
					if(superState.actions !== null){
						for(action : superState.actions){
							action.y = action.y - 13
						}
						declarationCount+=superState.actions.size
					}	
					declarationCount+=superState.suspensions.size
					if(superState.regions!==null){
						for(region : superState.regions){
							if(region.y==33+declarationCount*13){
								region.y = region.y - 13
								region.height= region.height+13
							}
						}
					}
					continue = true
				}
			}
		}
		if(!continue && superState.regions!==null){
			for(region : superState.regions){
				if(region.superStates !== null){
					for(superStateList: region.superStates){
						postDeleteSuspension(superStateList,suspension)
					}
				}
			}
		}
	}
}
