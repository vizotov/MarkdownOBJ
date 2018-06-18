package su.izotov.java.markdown.html.token.noscript;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NoScriptBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<noscript";
  }

  public NoScriptBegText concat(HtmlText htmlText) {
    return new NoScriptBegText(htmlText.toSource());
  }

  public HtmlText concat(NoScriptEnd noScriptEnd) {
    return new HtmlText(this.toSource() + noScriptEnd.toSource());
  }
}
