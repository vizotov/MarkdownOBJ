package su.izotov.java.markdown.html.token.ol;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class OlBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<ol";
  }

  public HtmlText concat(OlText olText) {
    return new HtmlText(this.toSource() + olText.toSource());
  }

  @Override public Tokens tokens() {
    return new OlEnd();
  }
}
