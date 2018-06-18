package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<ins";
  }

  public InsBegText concat(HtmlText htmlText) {
    return new InsBegText(htmlText.toSource());
  }

  public HtmlText concat(InsEnd insEnd) {
    return new HtmlText(this.toSource() + insEnd.toSource());
  }
}
