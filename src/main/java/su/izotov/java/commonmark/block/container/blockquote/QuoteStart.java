package su.izotov.java.commonmark.block.container.blockquote;

import su.izotov.java.commonmark.character.Character;
import su.izotov.java.commonmark.whitespace.Tab;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class QuoteStart
    implements Character {

  /**
   * Normally the > that begins a block quote may be followed optionally by a space, which is not considered part of the content. In the following case > is followed by a tab, which is treated as if it were expanded into three spaces. Since one of these spaces is considered part of the delimiter, foo is considered to be indented six spaces inside the block quote context, so we get an indented code block starting with two spaces.
   */
  public Sense concat(final Tab tab) {
    throw new UnsupportedOperationException("#concat()");
  }

  @Override
  public String toSource() {
    return ">";
  }
}
