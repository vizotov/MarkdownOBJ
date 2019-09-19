package su.izotov.java.commonmark.block.leaf.atxheading.closing;

import su.izotov.java.commonmark.whitespace.NewLine;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class EmptyClosingLine
    implements ClosingLine {

  private final NewLine newLine;

  public EmptyClosingLine(final NewLine newLine) {
    this.newLine = newLine;
  }

  @Override
  public String toSource() {
    return this.newLine.toSource();
  }
}
