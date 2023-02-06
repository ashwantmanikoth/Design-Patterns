package L02_E01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Timeline{
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
public void showAll(){
    System.out.println(components);
}

    @Override
    public String toString() {
        return super.toString();
    }
}
