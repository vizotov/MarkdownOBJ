package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.underscore;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.BrokenComb;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public final class UnderscoreBrokenComb
    extends BrokenComb {

  UnderscoreBrokenComb(final String content) {
    super(content);
  }

  public UnderscoreBrokenComb concat(final Underscore underscore) {
    return new UnderscoreBrokenComb(this.toSource() + underscore.toSource());
  }

  public UnderscoreBrokenComb concat(final Space space) {
    return new UnderscoreBrokenComb(this.toSource() + space.toSource());
  }
}
