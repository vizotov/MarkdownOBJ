package su.izotov.java.markdown.html.token.script;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class ScriptBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<script";
  }

  public ScriptBegText concat(HtmlText htmlText) {
    return new ScriptBegText(htmlText.toSource());
  }

  public HtmlText concat(ScriptEnd scriptEnd) {
    return new HtmlText(this.toSource() + scriptEnd.toSource());
  }
}
