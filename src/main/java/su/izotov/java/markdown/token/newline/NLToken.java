package su.izotov.java.markdown.token.newline;

import su.izotov.java.markdown.MDText;
import su.izotov.java.markdown.token.newline.offset.Offset1;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Token;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensSet;

/**
 * the sublanguage, used after new line
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface NLToken
    extends Token {
  default Tokens tokens() {
    return new TokensSet(new Offset1());
  }

  default Sense textToken(String text) {
    return new MDText(text);
  }

  default Sense concat(MDText text) {
    return textToken(toSource() + text);
  }
}
