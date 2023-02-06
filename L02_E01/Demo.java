package L02_E01;

public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello");
        timeline.add(text);
        Clip clip = new Clip();
        timeline.add(clip);
        Audio audio = new Audio();

        ContextMenu menu = new ContextMenu(timeline);

        menu.duplicate(text);
        menu.duplicate(clip);
        menu.duplicate(audio);

        timeline.showAll();

    }
}
