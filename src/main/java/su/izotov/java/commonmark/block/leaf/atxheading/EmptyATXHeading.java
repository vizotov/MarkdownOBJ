package su.izotov.java.commonmark.block.leaf.atxheading;

import su.izotov.java.commonmark.block.leaf.atxheading.opening.OpeningLine;
import su.izotov.java.commonmark.whitespace.EmptyCharacter;
import su.izotov.java.commonmark.whitespace.NewLine;
import su.izotov.java.commonmark.whitespace.WhitespaceCharacter;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class EmptyATXHeading
    implements ATXHeading {

  private final OpeningLine openingLine;
  private final WhitespaceCharacter whitespaceCharacter;
  private final NewLine newLine;

  public EmptyATXHeading(final OpeningLine openingLine,
                         final NewLine newLine) {
    this(openingLine,
         new EmptyCharacter(),
         newLine);
  }

  public EmptyATXHeading(final OpeningLine openingLine,
                         final WhitespaceCharacter whitespaceCharacter,
                         final NewLine newLine) {
    this.openingLine = openingLine;
    this.whitespaceCharacter = whitespaceCharacter;
    this.newLine = newLine;
  }

  @Override
  public String toSource() {
    return this.openingLine.toSource() + this.newLine.toSource();
  }
}
