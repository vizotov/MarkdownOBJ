package su.izotov.java.markdown.html.token.del;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DelBegText
    implements HtmlToken {
  private final String text;

  public DelBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new DelBeg().toSource() + text;
  }

  public DelBegText concat(HtmlText htmlText) {
    return new DelBegText(this.text + htmlText);
  }

  public HtmlText concat(DelEnd delEnd) {
    return new HtmlText(this.toSource() + delEnd.toSource());
  }
}
