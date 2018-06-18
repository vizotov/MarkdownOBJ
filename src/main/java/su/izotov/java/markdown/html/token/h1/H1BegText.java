package su.izotov.java.markdown.html.token.h1;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H1BegText
    implements HtmlToken {
  private final String text;

  public H1BegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new H1Beg().toSource() + text;
  }

  public H1BegText concat(HtmlText htmlText) {
    return new H1BegText(this.text + htmlText);
  }

  public HtmlText concat(H1End h1End) {
    return new HtmlText(this.toSource() + h1End.toSource());
  }
}
