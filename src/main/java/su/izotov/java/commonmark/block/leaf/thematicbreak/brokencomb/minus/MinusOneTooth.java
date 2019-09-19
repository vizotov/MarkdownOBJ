package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.minus;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.OneTooth;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public final class MinusOneTooth
    extends OneTooth {

  MinusOneTooth(final String content) {
    super(content);
  }

  public MinusTwoTooth concat(final Minus minus) {
    return new MinusTwoTooth(this.toSource() + minus.toSource());
  }

  public MinusOneTooth concat(final Space space) {
    return new MinusOneTooth(this.toSource() + space.toSource());
  }
}
