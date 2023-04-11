package L10.state;

public class WalkingModeState implements TravelModeState{

  @Override
  public Object getEta() {
    System.out.println("Calculating ETA (walking)");
    return 4;
  }
}
