package L02_E01;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        Component target = component.clone();
        timeline.add(target);
        System.out.println("duplicating "+component);
    }

}
