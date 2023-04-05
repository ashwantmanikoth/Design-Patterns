package L09.mediator;

public class TextBox extends UIControl {
    private String content = "";

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        mediator.changeNow(this);
    }
}
