package su.izotov.java.markdown.html.token.div;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DivBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<div";
  }

  public HtmlText concat(DivText divText) {
    return new HtmlText(this.toSource() + divText.toSource());
  }

  @Override public Tokens tokens() {
    return new DivEnd();
  }
}
