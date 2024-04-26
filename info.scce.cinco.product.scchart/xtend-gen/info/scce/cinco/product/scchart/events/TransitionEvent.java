package info.scce.cinco.product.scchart.events;

import graphmodel.Node;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.TransitionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Edge "Transition" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Edit this class:
 * - If you wish Transition to react the same way as its super class AbstractTransition,
 *   you may delete the method or leave it as is (with only the super call).
 * - If you wish to only add functionality, leave the super call in the
 *   corresponding method and add your code to it.
 * - If you wish to break the inheritance chain, remove the super call, but do
 *   not delete the corresponding method. You may leave it empty or write new
 *   code.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Transition> elementClass, Node sourceNode, Node targetNode)
 * - preDelete(Transition element)
 * - preReconnect(Transition element, Node newSourceNode, Node newTargetNode)
 * - postAttributeChange(Transition element, String attribute, Object oldValue)
 * - postCreate(Transition element)
 * - postDelete(Transition element)
 * - postDoubleClick(Transition element)
 * - postReconnect(Transition element, Node oldSourceNode, Node oldTargetNode)
 * - postSelect(Transition element)
 */
@SuppressWarnings("all")
public final class TransitionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.TransitionEvent {
  @Override
  public void preCreate(final Class<? extends Transition> elementClass, final Node sourceNode, final Node targetNode) {
    super.preCreate(elementClass, sourceNode, targetNode);
  }
  
  @Override
  public void preDelete(final Transition element) {
    super.preDelete(element);
  }
  
  @Override
  public void preReconnect(final Transition element, final Node newSourceNode, final Node newTargetNode) {
    super.preReconnect(element, newSourceNode, newTargetNode);
  }
  
  @Override
  public void postAttributeChange(final Transition element, final String attribute, final Object oldValue) {
    super.postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public void postCreate(final Transition element) {
    super.postCreate(element);
  }
  
  @Override
  public Runnable postDelete(final Transition element) {
    final Runnable superPostDelete = super.postDelete(element);
    final Runnable _function = () -> {
      superPostDelete.run();
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Transition element) {
    super.postDoubleClick(element);
  }
  
  @Override
  public void postReconnect(final Transition element, final Node oldSourceNode, final Node oldTargetNode) {
    super.postReconnect(element, oldSourceNode, oldTargetNode);
  }
  
  @Override
  public void postSelect(final Transition element) {
    super.postSelect(element);
  }
}
