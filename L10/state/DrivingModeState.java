package L10.state;

public class DrivingModeState implements TravelModeState{
  public Object getEta() {
    System.out.println("Calculating ETA (driving)");
    return 1;
  }
}
