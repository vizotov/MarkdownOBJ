package su.izotov.java.markdown.html.token.h3;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H3BegText
    implements HtmlToken {
  private final String text;

  public H3BegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new H3Beg().toSource() + text;
  }

  public H3BegText concat(HtmlText htmlText) {
    return new H3BegText(this.text + htmlText);
  }

  public HtmlText concat(H3End h3End) {
    return new HtmlText(this.toSource() + h3End.toSource());
  }
}
