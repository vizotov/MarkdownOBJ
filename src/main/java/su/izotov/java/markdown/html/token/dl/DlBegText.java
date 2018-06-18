package su.izotov.java.markdown.html.token.dl;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DlBegText
    implements HtmlToken {
  private final String text;

  public DlBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new DlBeg().toSource() + text;
  }

  public DlBegText concat(HtmlText htmlText) {
    return new DlBegText(this.text + htmlText);
  }

  public HtmlText concat(DlEnd dlEnd) {
    return new HtmlText(this.toSource() + dlEnd.toSource());
  }
}
