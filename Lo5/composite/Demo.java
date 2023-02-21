package Lo5.composite;

public class Demo {
  public static void show() {
   Team subTeam1 = new Team();
    subTeam1.add(new Truck());
    subTeam1.add(new HumanIncidentManager());
    subTeam1.add(new HumanIncidentManager());

    Team subTeam2 = new Team();
    subTeam2.add(new Truck());
    subTeam2.add(new HumanIncidentManager());

    Team team = new Team();
    team.add(subTeam1);
    team.add(subTeam2);

    team.deploy();
  }
  public static void main(String[] args){
    show();
  }
}
