package su.izotov.java.commonmark.block.leaf.atxheading.closing;

import su.izotov.java.commonmark.block.leaf.atxheading.inline.InlineText;
import su.izotov.java.commonmark.whitespace.NewLine;
import su.izotov.java.commonmark.whitespace.Space;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class SpacedSharps
    implements Sense {

  private final String content;

  public SpacedSharps(final String content) {
    this.content = content;
  }

  public Sense concat(final Space space) {
    return new SpacedSharps(this.toSource() + space.toSource());
  }

  @Override
  public String toSource() {
    return this.content;
  }

  public Sense concat(final Sense sense) {
    return new InlineText(this.toSource() + sense.toSource());
  }

  public ClosingLine concat(final NewLine newLine) {
    return new SpacedClosingLine(this,
                                 newLine);
  }
}
