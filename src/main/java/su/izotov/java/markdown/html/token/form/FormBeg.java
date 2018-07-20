package su.izotov.java.markdown.html.token.form;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FormBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<form";
  }

  public HtmlText concat(FormText formText) {
    return new HtmlText(this.toSource() + formText.toSource());
  }

  @Override public Tokens tokens() {
    return new FormEnd();
  }
}
