package L08.VisitorPattern;

import L08.VisitorPattern.visitor.Visitor;

public interface Segment {

  void accept(Visitor visitor);
}
