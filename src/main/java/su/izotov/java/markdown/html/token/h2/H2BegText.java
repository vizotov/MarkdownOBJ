package su.izotov.java.markdown.html.token.h2;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H2BegText
    implements HtmlToken {
  private final String text;

  public H2BegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new H2Beg().toSource() + text;
  }

  public H2BegText concat(HtmlText htmlText) {
    return new H2BegText(this.text + htmlText);
  }

  public HtmlText concat(H2End h2End) {
    return new HtmlText(this.toSource() + h2End.toSource());
  }
}
