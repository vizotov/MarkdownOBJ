package su.izotov.java.markdown.html.token.h6;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H6Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h6";
  }

  public HtmlText concat(H6Text h6Text) {
    return new HtmlText(this.toSource() + h6Text.toSource());
  }

  @Override public Tokens tokens() {
    return new H6End();
  }
}
