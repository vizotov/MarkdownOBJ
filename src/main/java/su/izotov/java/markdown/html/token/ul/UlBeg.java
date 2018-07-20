package su.izotov.java.markdown.html.token.ul;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class UlBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<ul";
  }

  public HtmlText concat(UlText ulText) {
    return new HtmlText(this.toSource() + ulText.toSource());
  }

  @Override public Tokens tokens() {
    return new UlEnd();
  }
}
