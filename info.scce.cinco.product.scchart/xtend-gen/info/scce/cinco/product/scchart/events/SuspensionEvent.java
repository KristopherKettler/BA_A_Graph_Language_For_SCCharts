package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspension;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
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
@SuppressWarnings("all")
public final class SuspensionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuspensionEvent {
  @Override
  public void postCreate(final Suspension element) {
    element.setUuid(UUID.randomUUID().toString());
    boolean continue_ = false;
    EList<Suspension> _suspensions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions();
    boolean _tripleNotEquals = (_suspensions != null);
    if (_tripleNotEquals) {
      EList<Suspension> _suspensions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions();
      for (final Suspension Suspension : _suspensions_1) {
        String _uuid = Suspension.getUuid();
        String _uuid_1 = element.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          }
          for (int i = 0; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().size()); i++) {
            {
              info.scce.cinco.product.scchart.mglid.scchart.Suspension _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(i);
              _get.setX(10);
              info.scce.cinco.product.scchart.mglid.scchart.Suspension _get_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(i);
              _get_1.setY(((30 + (13 * declarationCount)) + (13 * i)));
              info.scce.cinco.product.scchart.mglid.scchart.Suspension _get_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(i);
              int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              info.scce.cinco.product.scchart.mglid.scchart.Suspension _get_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(i);
              _get_3.setHeight(13);
            }
          }
          EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
            for (final Action action : _actions_1) {
              int _y = action.getY();
              int _plus = (_y + 13);
              action.setY(_plus);
            }
            int _declarationCount = declarationCount;
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
            declarationCount = (_declarationCount + _size);
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region : _regions_1) {
              int _y_1 = region.getY();
              boolean _lessThan = (_y_1 < (30 + (declarationCount * 13)));
              if (_lessThan) {
                int _y_2 = region.getY();
                int _plus_1 = (_y_2 + 13);
                region.setY(_plus_1);
                int _height = region.getHeight();
                int _minus = (_height - 13);
                region.setHeight(_minus);
              }
            }
          }
          continue_ = true;
        }
      }
    }
    if ((!continue_)) {
      EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region_1 : _regions_2) {
        EList<SuperState> _superStates = region_1.getSuperStates();
        boolean _tripleNotEquals_4 = (_superStates != null);
        if (_tripleNotEquals_4) {
          EList<SuperState> _superStates_1 = region_1.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            this.postCreateSuspension(superState, element);
          }
        }
      }
    }
  }
  
  public void postCreateSuspension(final SuperState superState, final Suspension suspension) {
    boolean continue_ = false;
    EList<Suspension> _suspensions = superState.getSuspensions();
    boolean _tripleNotEquals = (_suspensions != null);
    if (_tripleNotEquals) {
      EList<Suspension> _suspensions_1 = superState.getSuspensions();
      for (final Suspension SuspensionList : _suspensions_1) {
        String _uuid = SuspensionList.getUuid();
        String _uuid_1 = suspension.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = superState.getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = superState.getDeclarations().size();
          }
          for (int i = 0; (i < superState.getSuspensions().size()); i++) {
            {
              Suspension _get = superState.getSuspensions().get(i);
              _get.setX(10);
              Suspension _get_1 = superState.getSuspensions().get(i);
              _get_1.setY(((30 + (13 * declarationCount)) + (13 * i)));
              Suspension _get_2 = superState.getSuspensions().get(i);
              int _width = superState.getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              Suspension _get_3 = superState.getSuspensions().get(i);
              _get_3.setHeight(13);
            }
          }
          EList<Action> _actions = superState.getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = superState.getActions();
            for (final Action action : _actions_1) {
              int _y = action.getY();
              int _plus = (_y + 13);
              action.setY(_plus);
            }
            int _declarationCount = declarationCount;
            int _size = superState.getActions().size();
            declarationCount = (_declarationCount + _size);
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = superState.getSuspensions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y_1 = region.getY();
              boolean _lessThan = (_y_1 < (30 + (declarationCount * 13)));
              if (_lessThan) {
                int _y_2 = region.getY();
                int _plus_1 = (_y_2 + 13);
                region.setY(_plus_1);
                int _height = region.getHeight();
                int _minus = (_height - 13);
                region.setHeight(_minus);
              }
            }
          }
          continue_ = true;
        }
      }
    }
    if (((!continue_) && (superState.getRegions() != null))) {
      EList<Region> _regions_2 = superState.getRegions();
      for (final Region region_1 : _regions_2) {
        EList<SuperState> _superStates = region_1.getSuperStates();
        boolean _tripleNotEquals_4 = (_superStates != null);
        if (_tripleNotEquals_4) {
          EList<SuperState> _superStates_1 = region_1.getSuperStates();
          for (final SuperState superStateList : _superStates_1) {
            this.postCreateSuspension(superStateList, suspension);
          }
        }
      }
    }
  }
  
  @Override
  public Runnable postDelete(final Suspension element) {
    boolean continue_ = false;
    EList<Suspension> _suspensions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions();
    boolean _tripleNotEquals = (_suspensions != null);
    if (_tripleNotEquals) {
      for (int j = 0; (j < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().size()); j++) {
        String _uuid = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(j).getUuid();
        String _uuid_1 = element.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          }
          for (int i = j; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().size()); i++) {
            Suspension _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(i);
            int _y = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().get(i).getY();
            int _minus = (_y - 13);
            _get.setY(_minus);
          }
          EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
            for (final Action action : _actions_1) {
              int _y = action.getY();
              int _minus = (_y - 13);
              action.setY(_minus);
            }
            int _declarationCount = declarationCount;
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
            declarationCount = (_declarationCount + _size);
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspensions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region : _regions_1) {
              int _y_1 = region.getY();
              boolean _equals_1 = (_y_1 == (33 + (declarationCount * 13)));
              if (_equals_1) {
                int _y_2 = region.getY();
                int _minus_1 = (_y_2 - 13);
                region.setY(_minus_1);
                int _height = region.getHeight();
                int _plus = (_height + 13);
                region.setHeight(_plus);
              }
            }
          }
          continue_ = true;
        }
      }
    }
    if ((!continue_)) {
      EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region : _regions) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals_1 = (_superStates != null);
        if (_tripleNotEquals_1) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            this.postDeleteSuspension(superState, element);
          }
        }
      }
    }
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  public void postDeleteSuspension(final SuperState superState, final Suspension suspension) {
    boolean continue_ = false;
    EList<Suspension> _suspensions = superState.getSuspensions();
    boolean _tripleNotEquals = (_suspensions != null);
    if (_tripleNotEquals) {
      for (int j = 0; (j < superState.getSuspensions().size()); j++) {
        String _uuid = superState.getSuspensions().get(j).getUuid();
        String _uuid_1 = suspension.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = superState.getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = superState.getDeclarations().size();
          }
          for (int i = j; (i < superState.getSuspensions().size()); i++) {
            Suspension _get = superState.getSuspensions().get(i);
            int _y = superState.getSuspensions().get(i).getY();
            int _minus = (_y - 13);
            _get.setY(_minus);
          }
          EList<Action> _actions = superState.getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = superState.getActions();
            for (final Action action : _actions_1) {
              int _y = action.getY();
              int _minus = (_y - 13);
              action.setY(_minus);
            }
            int _declarationCount = declarationCount;
            int _size = superState.getActions().size();
            declarationCount = (_declarationCount + _size);
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = superState.getSuspensions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y_1 = region.getY();
              boolean _equals_1 = (_y_1 == (33 + (declarationCount * 13)));
              if (_equals_1) {
                int _y_2 = region.getY();
                int _minus_1 = (_y_2 - 13);
                region.setY(_minus_1);
                int _height = region.getHeight();
                int _plus = (_height + 13);
                region.setHeight(_plus);
              }
            }
          }
          continue_ = true;
        }
      }
    }
    if (((!continue_) && (superState.getRegions() != null))) {
      EList<Region> _regions = superState.getRegions();
      for (final Region region : _regions) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals_1 = (_superStates != null);
        if (_tripleNotEquals_1) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState superStateList : _superStates_1) {
            this.postDeleteSuspension(superStateList, suspension);
          }
        }
      }
    }
  }
}
