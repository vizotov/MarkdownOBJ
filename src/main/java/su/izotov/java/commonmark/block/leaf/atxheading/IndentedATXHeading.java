package su.izotov.java.commonmark.block.leaf.atxheading;

import su.izotov.java.commonmark.block.indent.Indent;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class IndentedATXHeading
    implements ATXHeading {

  private final Indent indent;
  private final UnindentedATXHeading unindentedATXHeading;

  public IndentedATXHeading(final Indent indent,
                            final UnindentedATXHeading unindentedATXHeading) {
    this.indent = indent;
    this.unindentedATXHeading = unindentedATXHeading;
  }

  @Override
  public String toSource() {
    return this.indent.toSource() + this.unindentedATXHeading.toSource();
  }
}
