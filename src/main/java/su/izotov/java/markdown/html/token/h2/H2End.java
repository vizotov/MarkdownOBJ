package su.izotov.java.markdown.html.token.h2;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H2End
    implements HtmlMarker {
  @Override public String toSource() {
    return "</h2>";
  }

  @Override public H2Text concatTo(final HtmlText htmlText) {
    return new H2Text(htmlText.toSource());
  }
}
