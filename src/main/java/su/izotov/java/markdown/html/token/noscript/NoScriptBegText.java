package su.izotov.java.markdown.html.token.noscript;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NoScriptBegText
    implements HtmlToken {
  private final String text;

  public NoScriptBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new NoScriptBeg().toSource() + text;
  }

  public NoScriptBegText concat(HtmlText htmlText) {
    return new NoScriptBegText(this.text + htmlText);
  }

  public HtmlText concat(NoScriptEnd noScriptEnd) {
    return new HtmlText(this.toSource() + noScriptEnd.toSource());
  }
}
