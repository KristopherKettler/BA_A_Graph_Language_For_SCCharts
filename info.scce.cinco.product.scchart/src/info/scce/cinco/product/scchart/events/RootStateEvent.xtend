// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.RootState

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "RootState" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends RootState> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(RootState element)
 * - preMove(RootState element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(RootState element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(RootState element, String attribute, Object oldValue)
 * - postCreate(RootState element)
 * - postDelete(RootState element)
 * - postDoubleClick(RootState element)
 * - postMove(RootState element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(RootState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(RootState element)
 */
final class RootStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent {
	
	override postAttributeChange(RootState element, String attribute, Object oldValue) {
		element.getRootElement.name = element.name
	}
	
	override postCreate(RootState element) {
		element.newRegion(10,33,element.width-20,element.height-40)
	}
	
	override postResize(RootState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		var int decCount =0
		if(element.declarations !== null){
			decCount  = decCount +  element.declarations.size
			for(declaration : element.declarations){
				declaration.width = element.width-20
			}
		}
		
		if (element.suspensions!==null){
			decCount  = decCount +  element.suspensions.size
			for(suspension : element.suspensions){
				suspension.width = element.width-20
			}
		}
		
		if (element.actions!==null){
			decCount  = decCount +  element.actions.size
			for(action : element.actions){
				action.width = element.width-20
			}
		}
		
		if(element.regions!==null){
			for(region : element.regions){
				if(oldX!=element.x){
					if(region.x<12){
						region.width = region.width+(oldX-element.x)
					}
					else{
						region.x=region.x+(oldX-element.x)
					}
				}
				if(oldY!=element.y){
					if(region.y<=35+decCount*13){
						region.height = region.height+(oldY-element.y)
					}
					else{
						region.y=region.y+(oldY-element.y)
					}
				}
				if(oldX==element.x&&oldWidth!=element.width){
					if(oldWidth-(region.x+region.width)<12){
						region.width=region.width+(element.width-oldWidth)
					}
				}
				if(oldY==element.y&&oldHeight!=element.height){
					if(oldHeight-(region.y+region.height)<12){
						region.height=region.height+(element.height-oldHeight)
					}
				}
			}
		}
	}
}