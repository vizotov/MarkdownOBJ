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
interface SharpSequence
    extends Sense {

  default Sense concat(final Sharp sharp) {
    return new Sharps(this.toSource() + sharp.toSource());
  }

  default Sense concat(final Space space) {
    return new SpacedSharps(this.toSource() + space.toSource());
  }

  default Sense concat(final Sense sense) {
    return new InlineText(this.toSource() + sense.toSource());
  }

  default ClosingLine concat(final NewLine newLine) {
    return new SharpsClosingLine(this,
                                 newLine);
  }
}
