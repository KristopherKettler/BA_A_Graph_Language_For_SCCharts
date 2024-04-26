package info.scce.cinco.product.scchart.appearance;

import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import style.Appearance;
import style.LineStyle;
import style.StyleFactory;

@SuppressWarnings("all")
public class DeferredHistoryTransitionAppearance implements StyleAppearanceProvider<DeferredHistoryTransition> {
  @Override
  public Appearance getAppearance(final DeferredHistoryTransition transition, final String arg1) {
    Appearance _xifexpression = null;
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      Appearance _createAppearance = StyleFactory.eINSTANCE.createAppearance();
      final Procedure1<Appearance> _function = (Appearance it) -> {
        it.setLineStyle(LineStyle.DASH);
      };
      _xifexpression = ObjectExtensions.<Appearance>operator_doubleArrow(_createAppearance, _function);
    } else {
      Appearance _createAppearance_1 = StyleFactory.eINSTANCE.createAppearance();
      final Procedure1<Appearance> _function_1 = (Appearance it) -> {
        it.setLineStyle(LineStyle.SOLID);
      };
      _xifexpression = ObjectExtensions.<Appearance>operator_doubleArrow(_createAppearance_1, _function_1);
    }
    return _xifexpression;
  }
}
