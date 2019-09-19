package su.izotov.java.commonmark.block.leaf.atxheading.opening;

import su.izotov.java.commonmark.block.leaf.atxheading.ATXHeading;
import su.izotov.java.commonmark.block.leaf.atxheading.ATXHeadingOpening;
import su.izotov.java.commonmark.block.leaf.atxheading.EmptyATXHeading;
import su.izotov.java.commonmark.block.leaf.atxheading.UnindentedATXHeading;
import su.izotov.java.commonmark.block.leaf.atxheading.inline.ClosedText;
import su.izotov.java.commonmark.whitespace.NewLine;
import su.izotov.java.commonmark.whitespace.Space;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.text.Source;
import su.izotov.java.objectlr.token.Failed;
import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public interface OpeningLine
    extends Token {

  default ATXHeadingOpening concat(final Space space) {
    return new ATXHeadingOpening(this,
                                 space);
  }

  default ATXHeading concat(final NewLine newLine) {
    return new EmptyATXHeading(this,
                               newLine);
  }

  default ATXHeading concat(final ClosedText closedText) {
    return new UnindentedATXHeading(this,
                                    closedText);
  }

  default Failed concat(final Sense sense) {
    return new Failed(this,
                      new Source(sense.toSource()));
  }
}
