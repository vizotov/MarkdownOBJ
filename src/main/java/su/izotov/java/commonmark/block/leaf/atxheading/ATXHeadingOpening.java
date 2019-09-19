package su.izotov.java.commonmark.block.leaf.atxheading;

import su.izotov.java.commonmark.block.leaf.atxheading.inline.InlineText;
import su.izotov.java.commonmark.block.leaf.atxheading.opening.OpeningLine;
import su.izotov.java.commonmark.whitespace.NewLine;
import su.izotov.java.commonmark.whitespace.WhitespaceCharacter;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class ATXHeadingOpening
    implements Sense {

  private final OpeningLine openingLine;
  private final WhitespaceCharacter whitespaceCharacter;

  public ATXHeadingOpening(final OpeningLine openingLine,
                           final WhitespaceCharacter whitespaceCharacter) {
    this.openingLine = openingLine;
    this.whitespaceCharacter = whitespaceCharacter;
  }

  public ATXHeading concat(final NewLine newLine) {
    return new EmptyATXHeading(this.openingLine,
                               this.whitespaceCharacter,
                               newLine);
  }

  @Override
  public Sense textToken(final String text) {
    return new InlineText(text);
  }

  @Override
  public String toSource() {
    return this.openingLine.toSource() + this.whitespaceCharacter.toSource();
  }
}
