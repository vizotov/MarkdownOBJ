package su.izotov.java.commonmark.block.leaf.atxheading;

import su.izotov.java.commonmark.block.leaf.atxheading.inline.ClosedText;
import su.izotov.java.commonmark.block.leaf.atxheading.opening.OpeningLine;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class UnindentedATXHeading
    implements ATXHeading {

  private final OpeningLine openingLine;
  private final ClosedText closedText;

  public UnindentedATXHeading(final OpeningLine openingLine,
                              final ClosedText closedText) {
    this.openingLine = openingLine;
    this.closedText = closedText;
  }

  @Override
  public String toSource() {
    return this.openingLine.toSource() + this.closedText.toSource();
  }
}
