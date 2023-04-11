package L10.state;

public class BicyclingModeState implements TravelModeState{

  public Object getEta() {
    System.out.println("Calculating ETA (bicycling)");
    return 2;
  }
}
