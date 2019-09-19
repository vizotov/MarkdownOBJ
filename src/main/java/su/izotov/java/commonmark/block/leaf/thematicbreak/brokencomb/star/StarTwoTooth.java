package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.star;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.TwoTooth;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class StarTwoTooth
    extends TwoTooth {

  private final String content;

  StarTwoTooth(final String content) {
    this.content = content;
  }

  public StarBrokenComb concat(final Star star) {
    return new StarBrokenComb(this.toSource() + star.toSource());
  }

  @Override
  public String toSource() {
    return this.content;
  }

  public StarTwoTooth concat(final Space space) {
    return new StarTwoTooth(this.toSource() + space.toSource());
  }
}
