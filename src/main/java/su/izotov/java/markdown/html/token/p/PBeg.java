package su.izotov.java.markdown.html.token.p;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.markdown.html.token.p.re.PreBeg;
import su.izotov.java.markdown.html.token.p.re.Re;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<p";
  }

  public HtmlText concat(PText pText) {
    return new HtmlText(this.toSource() + pText.toSource());
  }

  public PreBeg concat(Re re) {
    return new PreBeg();
  }

  @Override public Tokens tokens() {
    return new TokensOf(new Re(), new PEnd());
  }
}
