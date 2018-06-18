package su.izotov.java.markdown.html.token.h2;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H2Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h2";
  }

  public H2BegText concat(HtmlText htmlText) {
    return new H2BegText(htmlText.toSource());
  }

  public HtmlText concat(H2End h2End) {
    return new HtmlText(this.toSource() + h2End.toSource());
  }
}
