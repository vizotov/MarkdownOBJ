package su.izotov.java.markdown.html.token.ul;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class UlBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<ul";
  }

  public UlBegText concat(HtmlText htmlText) {
    return new UlBegText(htmlText.toSource());
  }

  public HtmlText concat(UlEnd ulEnd) {
    return new HtmlText(this.toSource() + ulEnd.toSource());
  }
}
