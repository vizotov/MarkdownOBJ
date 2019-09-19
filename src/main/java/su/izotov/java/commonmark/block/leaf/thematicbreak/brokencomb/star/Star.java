package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.star;

import su.izotov.java.commonmark.whitespace.Space;
import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class Star
    implements Token {

  public StarTwoTooth concat(final Star star) {
    return new StarTwoTooth(this.toSource() + star.toSource());
  }

  @Override
  public String toSource() {
    return "*";
  }

  public StarOneTooth concat(final Space space) {
    return new StarOneTooth(this.toSource() + space.toSource());
  }
}
