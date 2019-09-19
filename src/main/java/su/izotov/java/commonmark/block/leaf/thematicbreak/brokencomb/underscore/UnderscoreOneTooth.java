package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.underscore;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.OneTooth;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public final class UnderscoreOneTooth
    extends OneTooth {

  UnderscoreOneTooth(final String content) {
    super(content);
  }

  public UnderscoreTwoTooth concat(final Underscore underscore) {
    return new UnderscoreTwoTooth(this.toSource() + underscore.toSource());
  }

  public UnderscoreOneTooth concat(final Space space) {
    return new UnderscoreOneTooth(this.toSource() + space.toSource());
  }
}
