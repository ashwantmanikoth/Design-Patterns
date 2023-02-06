package L02_E01;

public class Audio implements Component{

    @Override
    public Component clone() {
        return new Audio();
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
