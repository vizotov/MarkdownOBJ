package su.izotov.java.markdown.html.token.div;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DivBegText
    implements HtmlToken {
  private final String text;

  public DivBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new DivBeg().toSource() + text;
  }

  public DivBegText concat(HtmlText htmlText) {
    return new DivBegText(this.text + htmlText);
  }

  public HtmlText concat(DivEnd divEnd) {
    return new HtmlText(this.toSource() + divEnd.toSource());
  }
}
