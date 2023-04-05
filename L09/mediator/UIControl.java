package L09.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl  {
  protected Mediator mediator;

  public UIControl(Mediator mediator) {
    this.mediator = mediator;
  }
}
