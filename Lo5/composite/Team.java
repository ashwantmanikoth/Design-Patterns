package Lo5.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements IncidentManager {
  private List<Object> resources = new ArrayList<>();

  public void add(Object resource) {
    resources.add(resource);
  }

  public void deploy() {
    for (Object resource : resources) {
      IncidentManager resource1 = (IncidentManager) resource;
      resource1.deploy();
    }
  }
}
