package su.izotov.java.markdown.html.token.p;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PBegText
    implements HtmlToken {
  private final String text;

  public PBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new PBeg().toSource() + text;
  }

  public PBegText concat(HtmlText htmlText) {
    return new PBegText(this.text + htmlText);
  }

  public HtmlText concat(PEnd pEnd) {
    return new HtmlText(this.toSource() + pEnd.toSource());
  }
}
