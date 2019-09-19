package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.minus;

import su.izotov.java.commonmark.whitespace.Space;
import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class Minus
    implements Token {

  public MinusTwoTooth concat(final Minus minus) {
    return new MinusTwoTooth(this.toSource() + minus.toSource());
  }

  @Override
  public String toSource() {
    return "-";
  }

  public MinusOneTooth concat(final Space space) {
    return new MinusOneTooth(this.toSource() + space.toSource());
  }
}
