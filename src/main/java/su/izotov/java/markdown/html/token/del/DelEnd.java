package su.izotov.java.markdown.html.token.del;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DelEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</del>";
  }

  @Override public DelText concatTo(final HtmlText htmlText) {
    return new DelText(htmlText.toSource());
  }
}
