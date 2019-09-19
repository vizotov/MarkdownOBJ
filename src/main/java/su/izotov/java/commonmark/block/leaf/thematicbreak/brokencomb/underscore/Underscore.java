package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.underscore;

import su.izotov.java.commonmark.whitespace.Space;
import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class Underscore
    implements Token {

  public UnderscoreTwoTooth concat(final Underscore underscore) {
    return new UnderscoreTwoTooth(this.toSource() + underscore.toSource());
  }

  @Override
  public String toSource() {
    return "_";
  }

  public UnderscoreOneTooth concat(final Space space) {
    return new UnderscoreOneTooth(this.toSource() + space.toSource());
  }
}
