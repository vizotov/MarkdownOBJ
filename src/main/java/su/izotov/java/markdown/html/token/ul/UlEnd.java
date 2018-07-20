package su.izotov.java.markdown.html.token.ul;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class UlEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</ul>";
  }

  @Override public UlText concatTo(final HtmlText htmlText) {
    return new UlText(htmlText.toSource());
  }
}
