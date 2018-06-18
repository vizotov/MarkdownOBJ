package su.izotov.java.markdown.html.token.math;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class MathBegText
    implements HtmlToken {
  private final String text;

  public MathBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new MathBeg().toSource() + text;
  }

  public MathBegText concat(HtmlText htmlText) {
    return new MathBegText(this.text + htmlText);
  }

  public HtmlText concat(MathEnd mathEnd) {
    return new HtmlText(this.toSource() + mathEnd.toSource());
  }
}
