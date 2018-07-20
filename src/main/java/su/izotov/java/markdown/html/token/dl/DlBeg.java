package su.izotov.java.markdown.html.token.dl;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DlBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<dl";
  }

  public HtmlText concat(DlText dlText) {
    return new HtmlText(this.toSource() + dlText.toSource());
  }

  @Override public Tokens tokens() {
    return new DlEnd();
  }
}
