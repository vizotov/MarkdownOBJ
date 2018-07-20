package su.izotov.java.markdown.html.token.blockquote;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BQEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</blockquote>";
  }

  @Override public BQText concatTo(final HtmlText htmlText) {
    return new BQText(htmlText.toSource());
  }
}
