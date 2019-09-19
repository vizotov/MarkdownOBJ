package su.izotov.java.commonmark.block.leaf.atxheading.inline;

import su.izotov.java.commonmark.block.leaf.atxheading.closing.ClosingLine;
import su.izotov.java.commonmark.inline.Inline;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class ClosedText
    implements Sense {

  private final Inline inline;
  private final ClosingLine closingLine;

  public ClosedText(final Inline inline,
                    final ClosingLine closingLine) {
    this.inline = inline;
    this.closingLine = closingLine;
  }

  @Override
  public String toSource() {
    return this.inline + this.closingLine.toSource();
  }
}
