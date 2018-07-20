package su.izotov.java.markdown.html.token.h2;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H2Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h2";
  }

  public HtmlText concat(H2Text h2Text) {
    return new HtmlText(this.toSource() + h2Text.toSource());
  }

  @Override public Tokens tokens() {
    return new H2End();
  }
}
