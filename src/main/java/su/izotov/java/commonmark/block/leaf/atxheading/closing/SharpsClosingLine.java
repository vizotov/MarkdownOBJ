package su.izotov.java.commonmark.block.leaf.atxheading.closing;

import su.izotov.java.commonmark.whitespace.NewLine;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class SharpsClosingLine
    implements ClosingLine {

  private final SharpSequence sharpSequence;
  private final NewLine newLine;

  public SharpsClosingLine(final SharpSequence sharpSequence,
                           final NewLine newLine) {
    this.sharpSequence = sharpSequence;
    this.newLine = newLine;
  }

  @Override
  public String toSource() {
    return this.sharpSequence.toSource() + this.newLine.toSource();
  }
}
