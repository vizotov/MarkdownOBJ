package su.izotov.java.commonmark.block.leaf.atxheading.closing;

import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class Sharp
    implements Token {

  @Override
  public String toSource() {
    return "#";
  }
}
