package su.izotov.java.markdown.html.token.comment;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class CommentBegText
    implements HtmlToken {
  private final String text;

  public CommentBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new CommentBeg().toSource() + text;
  }

  public CommentBegText concat(HtmlText htmlText) {
    return new CommentBegText(this.text + htmlText);
  }

  public HtmlText concat(CommentEnd commentEnd) {
    return new HtmlText(this.toSource() + commentEnd.toSource());
  }

  @Override public Tokens tokens() {
    // TODO must be only HtmlText and CommentEnd
    throw new UnsupportedOperationException("#tokens()");
  }
}
