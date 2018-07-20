package su.izotov.java.markdown.html.token.h1;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H1End
    implements HtmlMarker {
  @Override public String toSource() {
    return "</h1>";
  }

  @Override public H1Text concatTo(final HtmlText htmlText) {
    return new H1Text(htmlText.toSource());
  }
}
