package su.izotov.java.markdown.html.token.comment;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class CommentEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "-->";
  }

  @Override public CommentText concatTo(final HtmlText htmlText) {
    return new CommentText(htmlText.toSource());
  }
}
