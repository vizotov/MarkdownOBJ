package su.izotov.java.markdown.html.token.dl;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DlBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<dl";
  }

  public DlBegText concat(HtmlText htmlText) {
    return new DlBegText(htmlText.toSource());
  }

  public HtmlText concat(DlEnd dlEnd) {
    return new HtmlText(this.toSource() + dlEnd.toSource());
  }
}
