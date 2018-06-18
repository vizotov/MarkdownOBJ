package su.izotov.java.markdown.html.token.p.re;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<pre";
  }

  public PreBegText concat(HtmlText htmlText) {
    return new PreBegText(htmlText.toSource());
  }

  public HtmlText concat(PreEnd preEnd) {
    return new HtmlText(this.toSource() + preEnd.toSource());
  }
}
