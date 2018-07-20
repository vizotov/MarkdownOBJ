package su.izotov.java.markdown.html.token.noscript;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

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

  public HtmlText concat(NoScriptText noScriptText) {
    return new HtmlText(this.toSource() + noScriptText.toSource());
  }

  @Override public Tokens tokens() {
    return new NoScriptEnd();
  }
}
