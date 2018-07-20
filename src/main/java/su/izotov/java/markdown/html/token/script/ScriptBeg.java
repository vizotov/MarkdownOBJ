package su.izotov.java.markdown.html.token.script;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

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

  public HtmlText concat(ScriptText scriptText) {
    return new HtmlText(this.toSource() + scriptText.toSource());
  }

  @Override public Tokens tokens() {
    return new ScriptEnd();
  }
}
