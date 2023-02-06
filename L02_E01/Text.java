package L02_E01;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        return new Text(this.getContent());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
