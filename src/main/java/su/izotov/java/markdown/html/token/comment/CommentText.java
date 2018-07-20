package su.izotov.java.markdown.html.token.comment;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class CommentText
    implements HtmlToken {
  private final String text;

  public CommentText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new CommentEnd().toSource();
  }
}
