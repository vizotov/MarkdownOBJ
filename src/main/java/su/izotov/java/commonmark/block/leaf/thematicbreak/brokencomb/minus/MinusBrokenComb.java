package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.minus;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.BrokenComb;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public final class MinusBrokenComb
    extends BrokenComb {

  MinusBrokenComb(final String content) {
    super(content);
  }

  public MinusBrokenComb concat(final Minus minus) {
    return new MinusBrokenComb(this.toSource() + minus.toSource());
  }

  public MinusBrokenComb concat(final Space space) {
    return new MinusBrokenComb(this.toSource() + space.toSource());
  }
}
