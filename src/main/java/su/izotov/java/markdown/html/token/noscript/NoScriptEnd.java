package su.izotov.java.markdown.html.token.noscript;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NoScriptEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</noscript>";
  }

  @Override public NoScriptText concatTo(final HtmlText htmlText) {
    return new NoScriptText(htmlText.toSource());
  }
}
