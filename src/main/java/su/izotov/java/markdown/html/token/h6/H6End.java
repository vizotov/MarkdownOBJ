package su.izotov.java.markdown.html.token.h6;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H6End
    implements HtmlMarker {
  @Override public String toSource() {
    return "</h6>";
  }

  @Override public H6Text concatTo(final HtmlText htmlText) {
    return new H6Text(htmlText.toSource());
  }
}
