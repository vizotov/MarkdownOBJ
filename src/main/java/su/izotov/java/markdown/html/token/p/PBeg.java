package su.izotov.java.markdown.html.token.p;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.markdown.html.token.p.re.PreBeg;
import su.izotov.java.markdown.html.token.p.re.Re;
import su.izotov.java.objectlr.tokens.Tokens;

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

  public PBegText concat(HtmlText htmlText) {
    return new PBegText(htmlText.toSource());
  }

  public HtmlText concat(PEnd pEnd) {
    return new HtmlText(this.toSource() + pEnd.toSource());
  }

  public PreBeg concat(Re re) {
    return new PreBeg();
  }

  @Override public Tokens tokens() {
    throw new UnsupportedOperationException("#tokens()"); // TODO add token Re to tokenset
  }
}
