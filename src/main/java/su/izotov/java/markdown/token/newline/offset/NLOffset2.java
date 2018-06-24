package su.izotov.java.markdown.token.newline.offset;

import su.izotov.java.markdown.token.newline.NLToken;
import su.izotov.java.objectlr.token.Token;

/**
 * the new line with the two space offset
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NLOffset2
    implements NLToken, Token {
  @Override public String toSource() {
    return "\n  ";
  }

  public NLOffset3 concat(Offset1 offset1) {
    return new NLOffset3();
  }
}
