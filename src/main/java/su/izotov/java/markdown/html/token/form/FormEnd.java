package su.izotov.java.markdown.html.token.form;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FormEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</form>";
  }

  @Override public FormText concatTo(final HtmlText htmlText) {
    return new FormText(htmlText.toSource());
  }
}
