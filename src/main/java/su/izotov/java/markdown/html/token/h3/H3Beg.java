package su.izotov.java.markdown.html.token.h3;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H3Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h3";
  }

  public HtmlText concat(H3Text h3Text) {
    return new HtmlText(this.toSource() + h3Text.toSource());
  }

  @Override public Tokens tokens() {
    return new H3End();
  }
}
