package su.izotov.java.markdown.html.token.h6;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H6Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h6";
  }

  public H6BegText concat(HtmlText htmlText) {
    return new H6BegText(htmlText.toSource());
  }

  public HtmlText concat(H6End h6End) {
    return new HtmlText(this.toSource() + h6End.toSource());
  }
}
