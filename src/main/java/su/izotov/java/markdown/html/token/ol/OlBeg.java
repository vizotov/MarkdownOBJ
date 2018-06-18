package su.izotov.java.markdown.html.token.ol;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class OlBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<ol";
  }

  public OlBegText concat(HtmlText htmlText) {
    return new OlBegText(htmlText.toSource());
  }

  public HtmlText concat(OlEnd olEnd) {
    return new HtmlText(this.toSource() + olEnd.toSource());
  }
}
