package su.izotov.java.markdown.token.newline.offset;

import su.izotov.java.markdown.token.newline.NLToken;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Token;

/**
 * the new line with the three space offset
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NLOffset3
    implements NLToken, Token {
  @Override public String toSource() {
    return "\n   ";
  }

  public Sense concat(Offset1 offset1) {
    return NLToken.super.textToken(toSource() + offset1.toSource());
  }
}
