package su.izotov.java.markdown.html.token.dl;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DlEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</dl>";
  }

  @Override public DlText concatTo(final HtmlText htmlText) {
    return new DlText(htmlText.toSource());
  }
}
