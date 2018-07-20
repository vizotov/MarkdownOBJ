package su.izotov.java.markdown.html.token.blockquote;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BQBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<blockquote";
  }

  public HtmlText concat(BQText bqText) {
    return new HtmlText(this.toSource() + bqText.toSource());
  }

  @Override public Tokens tokens() {
    return new BQEnd();
  }
}
