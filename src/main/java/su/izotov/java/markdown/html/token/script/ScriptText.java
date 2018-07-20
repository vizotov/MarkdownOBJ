package su.izotov.java.markdown.html.token.script;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class ScriptText
    implements HtmlToken {
  private final String text;

  public ScriptText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new ScriptEnd().toSource();
  }
}
