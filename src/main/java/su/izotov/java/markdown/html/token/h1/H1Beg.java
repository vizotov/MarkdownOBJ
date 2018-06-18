package su.izotov.java.markdown.html.token.h1;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H1Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h1";
  }

  public H1BegText concat(HtmlText htmlText) {
    return new H1BegText(htmlText.toSource());
  }

  public HtmlText concat(H1End h1End) {
    return new HtmlText(this.toSource() + h1End.toSource());
  }
}
