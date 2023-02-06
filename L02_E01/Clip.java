package L02_E01;

public class Clip implements Component {
    @Override
    public Component clone() {
        return new Clip();
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
