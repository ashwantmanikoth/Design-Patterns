package Lo4_E02;

public class Truck extends Vehicle{
    protected Truck(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override public void manufacture()
    {
        System.out.print("Truck ");
        w1.work();
        w2.work();
    }
}
