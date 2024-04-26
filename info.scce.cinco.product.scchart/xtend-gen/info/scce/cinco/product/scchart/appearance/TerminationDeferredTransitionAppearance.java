package info.scce.cinco.product.scchart.appearance;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import style.Appearance;
import style.LineStyle;
import style.StyleFactory;

@SuppressWarnings("all")
public class TerminationDeferredTransitionAppearance implements StyleAppearanceProvider<TerminationDeferredTransition> {
  @Override
  public Appearance getAppearance(final TerminationDeferredTransition transition, final String arg1) {
    Appearance _xifexpression = null;
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      Appearance _createAppearance = StyleFactory.eINSTANCE.createAppearance();
      final Procedure1<Appearance> _function = (Appearance it) -> {
        it.setLineStyle(LineStyle.DASH);
      };
      _xifexpression = ObjectExtensions.<Appearance>operator_doubleArrow(_createAppearance, _function);
    } else {
      Appearance _xifexpression_1 = null;
      if ((transition.getCondition().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>"))) {
        Appearance _createAppearance_1 = StyleFactory.eINSTANCE.createAppearance();
        final Procedure1<Appearance> _function_1 = (Appearance it) -> {
          it.setLineStyle(LineStyle.DASH);
        };
        _xifexpression_1 = ObjectExtensions.<Appearance>operator_doubleArrow(_createAppearance_1, _function_1);
      } else {
        Appearance _createAppearance_2 = StyleFactory.eINSTANCE.createAppearance();
        final Procedure1<Appearance> _function_2 = (Appearance it) -> {
          it.setLineStyle(LineStyle.SOLID);
        };
        _xifexpression_1 = ObjectExtensions.<Appearance>operator_doubleArrow(_createAppearance_2, _function_2);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
