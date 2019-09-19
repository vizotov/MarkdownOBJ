package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.minus;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.TwoTooth;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class MinusTwoTooth
    extends TwoTooth {

  private final String content;

  MinusTwoTooth(final String content) {
    this.content = content;
  }

  public MinusBrokenComb concat(final Minus minus) {
    return new MinusBrokenComb(this.toSource() + minus.toSource());
  }

  @Override
  public String toSource() {
    return this.content;
  }

  public MinusTwoTooth concat(final Space space) {
    return new MinusTwoTooth(this.toSource() + space.toSource());
  }
}
