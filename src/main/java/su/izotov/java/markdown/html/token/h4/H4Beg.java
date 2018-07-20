package su.izotov.java.markdown.html.token.h4;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H4Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h4";
  }

  public HtmlText concat(H4Text h4Text) {
    return new HtmlText(this.toSource() + h4Text.toSource());
  }

  @Override public Tokens tokens() {
    return new H4End();
  }
}
