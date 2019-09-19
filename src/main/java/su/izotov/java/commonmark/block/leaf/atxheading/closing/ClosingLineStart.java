package su.izotov.java.commonmark.block.leaf.atxheading.closing;

import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class ClosingLineStart
    implements Token,
               SharpSequence {

  @Override
  public Sense concat(final Sharp sharp) {
    return new Sharps(this.toSource() + sharp.toSource());
  }

  @Override
  public String toSource() {
    return " #";
  }
}
