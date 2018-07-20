package su.izotov.java.markdown.html.token.noscript;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NoScriptText
    implements HtmlToken {
  private final String text;

  public NoScriptText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new NoScriptEnd().toSource();
  }
}
