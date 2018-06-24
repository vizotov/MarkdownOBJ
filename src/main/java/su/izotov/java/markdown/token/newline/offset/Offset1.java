package su.izotov.java.markdown.token.newline.offset;

import su.izotov.java.markdown.token.newline.NLToken;
import su.izotov.java.objectlr.token.Token;

/**
 * the one space offset
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class Offset1
    implements NLToken, Token {
  @Override public String toSource() {
    return " ";
  }
}
