package su.izotov.java.markdown.html.token.math;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class MathBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<math";
  }

  public HtmlText concat(MathText mathText) {
    return new HtmlText(this.toSource() + mathText.toSource());
  }

  @Override public Tokens tokens() {
    return new MathEnd();
  }
}
