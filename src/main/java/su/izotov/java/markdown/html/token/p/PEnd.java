package su.izotov.java.markdown.html.token.p;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</p>";
  }

  @Override public PText concatTo(final HtmlText htmlText) {
    return new PText(htmlText.toSource());
  }
}
