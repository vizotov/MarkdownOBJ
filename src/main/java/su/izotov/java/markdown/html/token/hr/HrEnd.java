package su.izotov.java.markdown.html.token.hr;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class HrEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return ">";
  }

  @Override public HrText concatTo(final HtmlText htmlText) {
    return new HrText(htmlText.toSource());
  }
}
