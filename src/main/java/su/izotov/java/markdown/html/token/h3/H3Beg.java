package su.izotov.java.markdown.html.token.h3;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H3Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h3";
  }

  public H3BegText concat(HtmlText htmlText) {
    return new H3BegText(htmlText.toSource());
  }

  public HtmlText concat(H3End h3End) {
    return new HtmlText(this.toSource() + h3End.toSource());
  }
}
