package su.izotov.java.markdown.token.newline.offset;

import su.izotov.java.markdown.token.newline.NLToken;
import su.izotov.java.objectlr.token.Token;

/**
 * the new line with the one space offset
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NLOffset1
    implements NLToken, Token {
  @Override public String toSource() {
    return "\n ";
  }

  public NLOffset2 concat(Offset1 offset1) {
    return new NLOffset2();
  }
}
