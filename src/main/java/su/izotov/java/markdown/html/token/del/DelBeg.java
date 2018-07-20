package su.izotov.java.markdown.html.token.del;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DelBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<del";
  }

  public HtmlText concat(DelText delText) {
    return new HtmlText(this.toSource() + delText.toSource());
  }

  @Override public Tokens tokens() {
    return new DelEnd();
  }
}
