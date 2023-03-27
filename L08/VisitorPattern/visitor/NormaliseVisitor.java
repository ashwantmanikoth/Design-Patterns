package L08.VisitorPattern.visitor;

public class NormaliseVisitor implements Visitor {

  @Override
  public void formatSegment() {
    System.out.println("Normalised for FormatSegment");
  }

  @Override
  public void factSegment() {
    System.out.println("Normalised for FactSegment");
  }
}
