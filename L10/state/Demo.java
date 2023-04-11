package L10.state;

public class Demo {

public static void main(String[] args){
      DirectionService directionService = new DirectionService(TravelMode.DRIVING);

      Object eta = directionService.getEta();
      System.out.println("The ETA is : " + eta);

      directionService.setTravelMode(TravelMode.BICYCLING);
      eta = directionService.getEta();
      System.out.println("The ETA is : " + eta);

      directionService.setTravelMode(TravelMode.TRANSIT);
      eta = directionService.getEta();
      System.out.println("The ETA is : " + eta);

      directionService.setTravelMode(TravelMode.WALKING);
      eta = directionService.getEta();
      System.out.println("The ETA is : " + eta);
    }
  }



