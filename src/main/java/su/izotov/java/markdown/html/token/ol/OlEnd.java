package su.izotov.java.markdown.html.token.ol;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class OlEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</ol>";
  }

  @Override public OlText concatTo(final HtmlText htmlText) {
    return new OlText(htmlText.toSource());
  }
}
