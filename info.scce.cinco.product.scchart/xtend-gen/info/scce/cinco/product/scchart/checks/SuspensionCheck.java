package info.scce.cinco.product.scchart.checks;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.Suspension;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class SuspensionCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public void checkNameConvention(final SCChart scchart) {
    final Consumer<Suspension> _function = (Suspension it) -> {
      String _suspensionType = it.getSuspensionType();
      boolean _equals = Objects.equal(_suspensionType, "<set suspension>");
      if (_equals) {
        this.addError(it, "set suspensiontype");
      }
    };
    this._graphModelExtension.<Suspension>find(scchart, Suspension.class).forEach(_function);
  }
}
