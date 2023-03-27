package L08.VisitorPattern.visitor;

public class ReverbVisitor implements Visitor {

  @Override
  public void formatSegment() {
    System.out.println("Reverb added for FormatSegment");
  }

  @Override
  public void factSegment() {
    System.out.println("Reverb added for FactSegment");

  }
}
