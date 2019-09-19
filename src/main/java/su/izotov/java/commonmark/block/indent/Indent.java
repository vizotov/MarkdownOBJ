package su.izotov.java.commonmark.block.indent;

import su.izotov.java.commonmark.block.leaf.atxheading.IndentedATXHeading;
import su.izotov.java.commonmark.block.leaf.atxheading.UnindentedATXHeading;
import su.izotov.java.commonmark.block.leaf.thematicbreak.IndentedThematicBreak;
import su.izotov.java.commonmark.block.leaf.thematicbreak.UnindentedThematicBreak;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public interface Indent
    extends Token {

  default Sense concat(final UnindentedThematicBreak unindentedThematicBreak) {
    return new IndentedThematicBreak(this,
                                     unindentedThematicBreak);
  }

  default Sense concat(final UnindentedATXHeading unindentedATXHeading) {
    return new IndentedATXHeading(this,
                                  unindentedATXHeading);
  }
}
