package su.izotov.java.markdown.html.token.hr;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class HrBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<hr";
  }

  public HtmlText concat(HrText hrText) {
    return new HtmlText(this.toSource() + hrText.toSource());
  }

  @Override public Tokens tokens() {
    return new HrEnd();
  }
}
