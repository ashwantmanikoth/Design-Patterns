package L08.VisitorPattern;

import L08.VisitorPattern.visitor.Visitor;

public class FactSegment implements Segment {

  @Override
  public void accept(Visitor visitor) {
    visitor.factSegment();
  }
}
