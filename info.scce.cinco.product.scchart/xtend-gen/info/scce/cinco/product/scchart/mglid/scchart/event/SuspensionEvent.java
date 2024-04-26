package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.core.event.hub.Subscriber;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadSubscriber;
import de.jabc.cinco.meta.plugin.event.api.event.NodeEvent;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostDoubleClickPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostSelectPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreCreateNodePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreDoubleClickPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreSelectPayload;
import de.jabc.cinco.meta.plugin.event.api.util.EventApiExtension;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Suspension;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SuspensionEvent implements NodeEvent<Suspension> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SuspensionEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SuspensionEvent() {
  }
  
  public static final SuspensionEvent getInstance() {
    if ((SuspensionEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SuspensionEvent _suspensionEvent = new info.scce.cinco.product.scchart.events.SuspensionEvent();
      SuspensionEvent.eventInstance = _suspensionEvent;
    }
    return SuspensionEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<Suspension>> _function = (PreAttributeChangePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<Suspension>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<Suspension>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function);
    final Procedure1<PreCreateNodePayload<Suspension>> _function_1 = (PreCreateNodePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<Suspension>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<Suspension>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_1);
    final Procedure1<PreDeletePayload<Suspension>> _function_2 = (PreDeletePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<Suspension>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<Suspension>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_2);
    final Procedure1<PreDoubleClickPayload<Suspension>> _function_3 = (PreDoubleClickPayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<Suspension>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<Suspension>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_3);
    final Procedure1<PreMovePayload<Suspension>> _function_4 = (PreMovePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<Suspension>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<Suspension>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_4);
    final Procedure1<PreResizePayload<Suspension>> _function_5 = (PreResizePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<Suspension>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<Suspension>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_5);
    final Procedure1<PreSelectPayload<Suspension>> _function_6 = (PreSelectPayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<Suspension>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<Suspension>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_6);
    final Procedure1<PostAttributeChangePayload<Suspension>> _function_7 = (PostAttributeChangePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<Suspension>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<Suspension>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_7);
    final Procedure1<PostCreatePayload<Suspension>> _function_8 = (PostCreatePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<Suspension>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<Suspension>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_8);
    final Function1<PostDeletePayload<Suspension>, Runnable> _function_9 = (PostDeletePayload<Suspension> payload) -> {
      return SuspensionEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<Suspension>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<Suspension>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_9);
    final Procedure1<PostDoubleClickPayload<Suspension>> _function_10 = (PostDoubleClickPayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<Suspension>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<Suspension>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_10);
    final Procedure1<PostMovePayload<Suspension>> _function_11 = (PostMovePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<Suspension>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<Suspension>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_11);
    final Procedure1<PostResizePayload<Suspension>> _function_12 = (PostResizePayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<Suspension>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<Suspension>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_12);
    final Procedure1<PostSelectPayload<Suspension>> _function_13 = (PostSelectPayload<Suspension> payload) -> {
      SuspensionEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<Suspension>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<Suspension>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Suspension", _function_13);
    this.subscribers = Collections.<Subscriber>unmodifiableList(CollectionLiterals.<Subscriber>newArrayList(_subscribePayloadSubscriber, _subscribePayloadSubscriber_1, _subscribePayloadSubscriber_2, _subscribePayloadSubscriber_3, _subscribePayloadSubscriber_4, _subscribePayloadSubscriber_5, _subscribePayloadSubscriber_6, _subscribePayloadSubscriber_7, _subscribePayloadSubscriber_8, _subscribePayloadSubscriber_9, _subscribePayloadSubscriber_10, _subscribePayloadSubscriber_11, _subscribePayloadSubscriber_12, _subscribePayloadSubscriber_13));
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
  public final void preAttributeChange(final Suspension element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<Suspension> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends Suspension> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<Suspension> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final Suspension element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<Suspension> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final Suspension element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<Suspension> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final Suspension element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<Suspension> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final Suspension element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<Suspension> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final Suspension element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<Suspension> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final Suspension element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<Suspension> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final Suspension element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<Suspension> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final Suspension element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<Suspension> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final Suspension element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<Suspension> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final Suspension element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<Suspension> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final Suspension element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<Suspension> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final Suspension element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<Suspension> it) {
    this.postSelect(it.getElement());
  }
}
