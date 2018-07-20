package su.izotov.java.markdown.html.token.div;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DivEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</div>";
  }

  @Override public DivText concatTo(final HtmlText htmlText) {
    return new DivText(htmlText.toSource());
  }
}
