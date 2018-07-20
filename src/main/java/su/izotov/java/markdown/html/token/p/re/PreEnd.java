package su.izotov.java.markdown.html.token.p.re;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</pre>";
  }

  @Override public PreText concatTo(final HtmlText htmlText) {
    return new PreText(htmlText.toSource());
  }
}
