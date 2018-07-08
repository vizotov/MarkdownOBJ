package su.izotov.java.markdown.square;

import su.izotov.java.objectlr.token.Token;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * the text between square brackets
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class SquareText
    implements Token {
  private final String text;

  public SquareText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text;
  }

  @Override public Tokens tokens() {
    return new TokensOf(new RSqBr());
  }

  @Override public SquareText textToken(final String text) {
    return new SquareText(text);
  }

  public TextRSqBr concat(final RSqBr rsqBr) {
    return new TextRSqBr(text);
  }

  public TextRSqBr concat(final TextRSqBr textRSqBr) {
    return new TextRSqBr(text + textRSqBr.toSource());
  }

  public SquareText concat(final SquareText squareText) {
    return new SquareText(text + squareText.toSource());
  }
}
