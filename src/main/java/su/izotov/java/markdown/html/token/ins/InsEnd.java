package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</ins>";
  }

  @Override public InsText concatTo(final HtmlText htmlText) {
    return new InsText(htmlText.toSource());
  }
}
