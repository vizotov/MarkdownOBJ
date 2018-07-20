package su.izotov.java.markdown.html.token.p.re;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<pre";
  }

  public HtmlText concat(PreText preText) {
    return new HtmlText(this.toSource() + preText.toSource());
  }

  @Override public Tokens tokens() {
    return new PreEnd();
  }
}
