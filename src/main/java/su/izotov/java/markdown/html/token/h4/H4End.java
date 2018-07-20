package su.izotov.java.markdown.html.token.h4;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H4End
    implements HtmlMarker {
  @Override public String toSource() {
    return "</h4>";
  }

  @Override public H4Text concatTo(final HtmlText htmlText) {
    return new H4Text(htmlText.toSource());
  }
}
