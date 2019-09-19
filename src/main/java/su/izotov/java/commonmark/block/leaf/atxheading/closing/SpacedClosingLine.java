package su.izotov.java.commonmark.block.leaf.atxheading.closing;

import su.izotov.java.commonmark.whitespace.NewLine;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class SpacedClosingLine
    implements ClosingLine {

  private final SpacedSharps spacedSharps;
  private final NewLine newLine;

  public SpacedClosingLine(final SpacedSharps spacedSharps,
                           final NewLine newLine) {
    this.spacedSharps = spacedSharps;
    this.newLine = newLine;
  }

  @Override
  public String toSource() {
    return this.spacedSharps.toSource() + this.newLine.toSource();
  }
}
