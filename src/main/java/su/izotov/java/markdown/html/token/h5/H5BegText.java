package su.izotov.java.markdown.html.token.h5;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H5BegText
    implements HtmlToken {
  private final String text;

  public H5BegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new H5Beg().toSource() + text;
  }

  public H5BegText concat(HtmlText htmlText) {
    return new H5BegText(this.text + htmlText);
  }

  public HtmlText concat(H5End h5End) {
    return new HtmlText(this.toSource() + h5End.toSource());
  }
}
