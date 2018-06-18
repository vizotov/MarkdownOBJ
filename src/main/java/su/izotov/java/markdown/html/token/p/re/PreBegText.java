package su.izotov.java.markdown.html.token.p.re;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreBegText
    implements HtmlToken {
  private final String text;

  public PreBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new PreBeg().toSource() + text;
  }

  public PreBegText concat(HtmlText htmlText) {
    return new PreBegText(this.text + htmlText);
  }

  public HtmlText concat(PreEnd preEnd) {
    return new HtmlText(this.toSource() + preEnd.toSource());
  }
}
