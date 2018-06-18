package su.izotov.java.markdown.html.token.math;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class MathBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<math";
  }

  public MathBegText concat(HtmlText htmlText) {
    return new MathBegText(htmlText.toSource());
  }

  public HtmlText concat(MathEnd mathEnd) {
    return new HtmlText(this.toSource() + mathEnd.toSource());
  }
}
