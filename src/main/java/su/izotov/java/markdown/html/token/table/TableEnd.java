package su.izotov.java.markdown.html.token.table;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class TableEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</table>";
  }

  @Override public TableText concatTo(final HtmlText htmlText) {
    return new TableText(htmlText.toSource());
  }
}
