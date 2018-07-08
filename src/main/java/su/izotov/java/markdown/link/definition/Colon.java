package su.izotov.java.markdown.link.definition;

import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Token;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class Colon
    implements Token {
  @Override public String toSource() {
    return ":";
  }

  @Override public Tokens tokens() {
    throw new UnsupportedOperationException("#tokens()");
  }

  @Override public Sense textToken(final String text) {
    return new LDText(text);
  }
}
