package su.izotov.java.markdown.html.token.h4;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H4BegText
    implements HtmlToken {
  private final String text;

  public H4BegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new H4Beg().toSource() + text;
  }

  public H4BegText concat(HtmlText htmlText) {
    return new H4BegText(this.text + htmlText);
  }

  public HtmlText concat(H4End h4End) {
    return new HtmlText(this.toSource() + h4End.toSource());
  }
}
