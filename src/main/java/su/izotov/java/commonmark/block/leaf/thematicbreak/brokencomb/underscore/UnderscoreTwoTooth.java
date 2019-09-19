package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.underscore;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.TwoTooth;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class UnderscoreTwoTooth
    extends TwoTooth {

  private final String content;

  UnderscoreTwoTooth(final String content) {
    this.content = content;
  }

  public UnderscoreBrokenComb concat(final Underscore underscore) {
    return new UnderscoreBrokenComb(this.toSource() + underscore.toSource());
  }

  @Override
  public String toSource() {
    return this.content;
  }

  public UnderscoreTwoTooth concat(final Space space) {
    return new UnderscoreTwoTooth(this.toSource() + space.toSource());
  }
}
