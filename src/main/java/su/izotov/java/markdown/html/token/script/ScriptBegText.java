package su.izotov.java.markdown.html.token.script;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class ScriptBegText
    implements HtmlToken {
  private final String text;

  public ScriptBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new ScriptBeg().toSource() + text;
  }

  public ScriptBegText concat(HtmlText htmlText) {
    return new ScriptBegText(this.text + htmlText);
  }

  public HtmlText concat(ScriptEnd scriptEnd) {
    return new HtmlText(this.toSource() + scriptEnd.toSource());
  }
}
