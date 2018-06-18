package su.izotov.java.markdown.html.token.div;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DivBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<div";
  }

  public DivBegText concat(HtmlText htmlText) {
    return new DivBegText(htmlText.toSource());
  }

  public HtmlText concat(DivEnd divEnd) {
    return new HtmlText(this.toSource() + divEnd.toSource());
  }
}
