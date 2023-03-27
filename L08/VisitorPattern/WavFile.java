package L08.VisitorPattern;

import L08.VisitorPattern.visitor.NoiseVisitor;
import L08.VisitorPattern.visitor.NormaliseVisitor;
import L08.VisitorPattern.visitor.ReverbVisitor;
import java.util.ArrayList;
import java.util.List;

public class WavFile {

  private final List<Segment> segments = new ArrayList<>();

  public static void read(String fileName) {
    ReverbVisitor reverb = new ReverbVisitor();
    NormaliseVisitor normaliseVisitor = new NormaliseVisitor();
    NoiseVisitor noiseVisitor = new NoiseVisitor();
    FactSegment factSegment = new FactSegment();
    FormatSegment formatSegment = new FormatSegment();

    factSegment.accept(reverb);
    factSegment.accept(normaliseVisitor);
    factSegment.accept(noiseVisitor);

    formatSegment.accept(reverb);

  }


}
