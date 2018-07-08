package su.izotov.java.markdown.square;

import su.izotov.java.markdown.Title;
import su.izotov.java.objectlr.token.Failed;
import su.izotov.java.objectlr.token.Token;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class LSqBr
    implements Token {
  @Override public String toSource() {
    return "[";
  }

  @Override public Tokens tokens() {
    return new TokensOf(new RSqBr());
  }

  @Override public SquareText textToken(final String text) {
    return new SquareText(text);
  }

  /**
   * the result
   * @param textRSqBr the text with right square bracket
   * @return title
   */
  public Title concat(TextRSqBr textRSqBr) {
    return new Title(textRSqBr.text());
  }

  /**
   * two brackets is not a title, so they are treated as text
   * @param rSqBr right square bracket
   * @return recognition fail
   */
  public Failed concat(RSqBr rSqBr) {
    return new Failed(this.toSource(), rSqBr.toSource());
  }
}
