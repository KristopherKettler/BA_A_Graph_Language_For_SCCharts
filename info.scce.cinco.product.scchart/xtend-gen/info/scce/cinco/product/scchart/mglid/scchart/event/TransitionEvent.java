package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.core.event.hub.Subscriber;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadSubscriber;
import de.jabc.cinco.meta.plugin.event.api.event.EdgeEvent;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostDoubleClickPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostReconnectPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostSelectPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreCreateEdgePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreDoubleClickPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreReconnectPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreSelectPayload;
import de.jabc.cinco.meta.plugin.event.api.util.EventApiExtension;
import graphmodel.Node;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class TransitionEvent implements EdgeEvent<Transition> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static TransitionEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected TransitionEvent() {
  }
  
  public static final TransitionEvent getInstance() {
    if ((TransitionEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.TransitionEvent _transitionEvent = new info.scce.cinco.product.scchart.events.TransitionEvent();
      TransitionEvent.eventInstance = _transitionEvent;
    }
    return TransitionEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<Transition>> _function = (PreAttributeChangePayload<Transition> payload) -> {
      TransitionEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<Transition>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<Transition>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function);
    final Procedure1<PreCreateEdgePayload<Transition>> _function_1 = (PreCreateEdgePayload<Transition> payload) -> {
      TransitionEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateEdgePayload<Transition>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateEdgePayload<Transition>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_1);
    final Procedure1<PreDeletePayload<Transition>> _function_2 = (PreDeletePayload<Transition> payload) -> {
      TransitionEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<Transition>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<Transition>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_2);
    final Procedure1<PreDoubleClickPayload<Transition>> _function_3 = (PreDoubleClickPayload<Transition> payload) -> {
      TransitionEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<Transition>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<Transition>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_3);
    final Procedure1<PreReconnectPayload<Transition>> _function_4 = (PreReconnectPayload<Transition> payload) -> {
      TransitionEvent.getInstance().preReconnect(payload);
    };
    PayloadSubscriber<PreReconnectPayload<Transition>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreReconnectPayload<Transition>>subscribePayloadSubscriber("event.pre.reconnect.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_4);
    final Procedure1<PreSelectPayload<Transition>> _function_5 = (PreSelectPayload<Transition> payload) -> {
      TransitionEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<Transition>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreSelectPayload<Transition>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_5);
    final Procedure1<PostAttributeChangePayload<Transition>> _function_6 = (PostAttributeChangePayload<Transition> payload) -> {
      TransitionEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<Transition>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PostAttributeChangePayload<Transition>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_6);
    final Procedure1<PostCreatePayload<Transition>> _function_7 = (PostCreatePayload<Transition> payload) -> {
      TransitionEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<Transition>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostCreatePayload<Transition>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_7);
    final Function1<PostDeletePayload<Transition>, Runnable> _function_8 = (PostDeletePayload<Transition> payload) -> {
      return TransitionEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<Transition>, Runnable> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostDeletePayload<Transition>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_8);
    final Procedure1<PostDoubleClickPayload<Transition>> _function_9 = (PostDoubleClickPayload<Transition> payload) -> {
      TransitionEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<Transition>, Void> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDoubleClickPayload<Transition>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_9);
    final Procedure1<PostReconnectPayload<Transition>> _function_10 = (PostReconnectPayload<Transition> payload) -> {
      TransitionEvent.getInstance().postReconnect(payload);
    };
    PayloadSubscriber<PostReconnectPayload<Transition>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostReconnectPayload<Transition>>subscribePayloadSubscriber("event.post.reconnect.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_10);
    final Procedure1<PostSelectPayload<Transition>> _function_11 = (PostSelectPayload<Transition> payload) -> {
      TransitionEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<Transition>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostSelectPayload<Transition>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Transition", _function_11);
    this.subscribers = Collections.<Subscriber>unmodifiableList(CollectionLiterals.<Subscriber>newArrayList(_subscribePayloadSubscriber, _subscribePayloadSubscriber_1, _subscribePayloadSubscriber_2, _subscribePayloadSubscriber_3, _subscribePayloadSubscriber_4, _subscribePayloadSubscriber_5, _subscribePayloadSubscriber_6, _subscribePayloadSubscriber_7, _subscribePayloadSubscriber_8, _subscribePayloadSubscriber_9, _subscribePayloadSubscriber_10, _subscribePayloadSubscriber_11));
  }
  
  @Override
  public final void unsubscribe() {
    if (this.subscribers!=null) {
      final Consumer<Subscriber> _function = (Subscriber it) -> {
        it.unsubscribe();
      };
      this.subscribers.forEach(_function);
    }
    this.subscribers = null;
  }
  
  @Override
  public final void preAttributeChange(final Transition element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<Transition> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends Transition> elementClass, final Node sourceNode, final Node targetNode) {
  }
  
  @Override
  public final void preCreate(final PreCreateEdgePayload<Transition> it) {
    this.preCreate(it.getElementClass(), it.getSourceNode(), it.getTargetNode());
  }
  
  @Override
  public void preDelete(final Transition element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<Transition> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final Transition element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<Transition> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preReconnect(final Transition element, final Node newSourceNode, final Node newTargetNode) {
  }
  
  @Override
  public final void preReconnect(final PreReconnectPayload<Transition> it) {
    this.preReconnect(it.getElement(), it.getNewSourceNode(), it.getNewTargetNode());
  }
  
  @Override
  public final void preSelect(final Transition element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<Transition> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final Transition element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<Transition> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final Transition element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<Transition> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final Transition element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<Transition> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final Transition element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<Transition> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postReconnect(final Transition element, final Node oldSourceNode, final Node oldTargetNode) {
  }
  
  @Override
  public final void postReconnect(final PostReconnectPayload<Transition> it) {
    this.postReconnect(it.getElement(), it.getOldSourceNode(), it.getOldTargetNode());
  }
  
  @Override
  public void postSelect(final Transition element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<Transition> it) {
    this.postSelect(it.getElement());
  }
}
