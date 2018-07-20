package su.izotov.java.markdown.html.token.h5;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H5Beg
    implements HtmlToken {
  @Override public String toSource() {
    return "<h5";
  }

  public HtmlText concat(H5Text h5Text) {
    return new HtmlText(this.toSource() + h5Text.toSource());
  }

  @Override public Tokens tokens() {
    return new H5End();
  }
}
