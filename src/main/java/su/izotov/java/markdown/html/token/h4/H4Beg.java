package su.izotov.java.markdown.html.token.h4;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H4Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h4";
  }

  public H4BegText concat(HtmlText htmlText) {
    return new H4BegText(htmlText.toSource());
  }

  public HtmlText concat(H4End h4End) {
    return new HtmlText(this.toSource() + h4End.toSource());
  }
}
