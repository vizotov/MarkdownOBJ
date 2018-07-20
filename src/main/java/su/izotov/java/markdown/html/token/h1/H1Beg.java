package su.izotov.java.markdown.html.token.h1;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H1Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h1";
  }

  public HtmlText concat(H1Text h1Text) {
    return new HtmlText(this.toSource() + h1Text.toSource());
  }

  @Override public Tokens tokens() {
    return new H1End();
  }
}
