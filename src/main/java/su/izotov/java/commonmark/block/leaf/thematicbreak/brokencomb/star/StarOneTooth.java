package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.star;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.OneTooth;
import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public final class StarOneTooth
    extends OneTooth {

  StarOneTooth(final String content) {
    super(content);
  }

  public StarTwoTooth concat(final Star star) {
    return new StarTwoTooth(this.toSource() + star.toSource());
  }

  public StarOneTooth concat(final Space space) {
    return new StarOneTooth(this.toSource() + space.toSource());
  }
}
