package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.star;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.BrokenComb;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public final class StarBrokenComb
    extends BrokenComb {

  StarBrokenComb(final String content) {
    super(content);
  }

  public StarBrokenComb concat(final Star star) {
    return new StarBrokenComb(this.toSource() + star.toSource());
  }

  public StarBrokenComb concat(final Space space) {
    return new StarBrokenComb(this.toSource() + space.toSource());
  }
}
