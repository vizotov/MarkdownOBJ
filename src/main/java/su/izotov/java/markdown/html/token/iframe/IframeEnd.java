package su.izotov.java.markdown.html.token.iframe;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class IframeEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</iframe>";
  }

  @Override public IframeText concatTo(final HtmlText htmlText) {
    return new IframeText(htmlText.toSource());
  }
}
