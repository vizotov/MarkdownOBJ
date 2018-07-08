package su.izotov.java.markdown.html.token.comment;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

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

  public CommentBegText concat(HtmlText htmlText) {
    return new CommentBegText(htmlText.toSource());
  }

  public HtmlText concat(CommentEnd commentEnd) {
    return new HtmlText(this.toSource() + commentEnd.toSource());
  }
}
