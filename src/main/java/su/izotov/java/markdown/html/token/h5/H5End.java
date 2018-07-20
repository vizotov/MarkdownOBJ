package su.izotov.java.markdown.html.token.h5;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H5End
    implements HtmlMarker {
  @Override public String toSource() {
    return "</h5>";
  }

  @Override public H5Text concatTo(final HtmlText htmlText) {
    return new H5Text(htmlText.toSource());
  }
}
