package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<ins";
  }

  public HtmlText concat(InsText insText) {
    return new HtmlText(this.toSource() + insText.toSource());
  }

  @Override public Tokens tokens() {
    return new InsEnd();
  }
}
