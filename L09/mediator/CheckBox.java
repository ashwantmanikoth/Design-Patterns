package L09.mediator;

public class CheckBox extends UIControl {
    private boolean isChecked;

    public CheckBox(Mediator mediator) {
        super(mediator);
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        mediator.changeNow(this);
    }
}
