package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsBegText
    implements HtmlToken {
  private final String text;

  public InsBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new InsBeg().toSource() + text;
  }

  public InsBegText concat(HtmlText htmlText) {
    return new InsBegText(this.text + htmlText);
  }

  public HtmlText concat(InsEnd insEnd) {
    return new HtmlText(this.toSource() + insEnd.toSource());
  }
}
