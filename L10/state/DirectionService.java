package L10.state;

public class DirectionService {
  private TravelModeState travelModeState;

  public DirectionService(TravelMode mode) {
    setTravelMode(mode);
  }

  public void setTravelMode(TravelMode mode) {
    switch (mode) {
      case DRIVING:
        travelModeState = new DrivingModeState();
        break;
      case BICYCLING:
        travelModeState = new BicyclingModeState();
        break;
      case TRANSIT:
        travelModeState = new TransitModeState();
        break;
      case WALKING:
        travelModeState = new WalkingModeState();
        break;
      default:
        throw new IllegalArgumentException("Invalid travel mode: " + mode);
    }
  }

  public Object getEta() {
    return travelModeState.getEta();
  }
}
