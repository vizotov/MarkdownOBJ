package su.izotov.java.markdown.html.token.math;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class MathEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</math>";
  }

  @Override public MathText concatTo(final HtmlText htmlText) {
    return new MathText(htmlText.toSource());
  }
}
