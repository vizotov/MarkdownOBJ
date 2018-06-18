package su.izotov.java.markdown.html.token.ol;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class OlBegText
    implements HtmlToken {
  private final String text;

  public OlBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new OlBeg().toSource() + text;
  }

  public OlBegText concat(HtmlText htmlText) {
    return new OlBegText(this.text + htmlText);
  }

  public HtmlText concat(OlEnd olEnd) {
    return new HtmlText(this.toSource() + olEnd.toSource());
  }
}
