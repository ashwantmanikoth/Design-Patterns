package L09.mediator;

import L09.mediator.Mediator;
import L09.mediator.Observer;
import L09.mediator.UIControl;

public class Button extends UIControl implements Observer {
    private boolean isEnabled;

    public Button(Mediator mediator) {
        super(mediator);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void update(boolean enabled) {
        this.isEnabled = enabled;
    }

}
