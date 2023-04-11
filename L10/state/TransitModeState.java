package L10.state;

public class TransitModeState implements TravelModeState{

  @Override
  public Object getEta() {
    System.out.println("Calculating ETA (transit)");
    return 3;
  }
}
