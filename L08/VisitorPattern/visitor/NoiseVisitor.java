package L08.VisitorPattern.visitor;

public class NoiseVisitor implements Visitor {

  @Override
  public void formatSegment() {
    System.out.println("Noise Visitor for FormatSegment");
  }

  @Override
  public void factSegment() {
    System.out.println("Noise Visitor for FactSegment");

  }
}
