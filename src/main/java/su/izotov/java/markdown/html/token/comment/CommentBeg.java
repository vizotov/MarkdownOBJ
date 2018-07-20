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
public class CommentBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<!--";
  }

  public HtmlText concat(CommentText commentText) {
    return new HtmlText(this.toSource() + commentText.toSource());
  }

  @Override public Tokens tokens() {
    return new CommentEnd();
  }
}
