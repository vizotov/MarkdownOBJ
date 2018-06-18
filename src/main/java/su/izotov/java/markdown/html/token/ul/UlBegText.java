package su.izotov.java.markdown.html.token.ul;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class UlBegText
    implements HtmlToken {
  private final String text;

  public UlBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new UlBeg().toSource() + text;
  }

  public UlBegText concat(HtmlText htmlText) {
    return new UlBegText(this.text + htmlText);
  }

  public HtmlText concat(UlEnd ulEnd) {
    return new HtmlText(this.toSource() + ulEnd.toSource());
  }
}
