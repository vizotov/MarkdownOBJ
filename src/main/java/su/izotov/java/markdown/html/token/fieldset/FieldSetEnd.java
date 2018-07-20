package su.izotov.java.markdown.html.token.fieldset;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FieldSetEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</fieldset>";
  }

  @Override public FieldSetText concatTo(final HtmlText htmlText) {
    return new FieldSetText(htmlText.toSource());
  }
}
