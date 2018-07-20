package su.izotov.java.markdown.html.token.h3;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H3End
    implements HtmlMarker {
  @Override public String toSource() {
    return "</h3>";
  }

  @Override public H3Text concatTo(final HtmlText htmlText) {
    return new H3Text(htmlText.toSource());
  }
}
