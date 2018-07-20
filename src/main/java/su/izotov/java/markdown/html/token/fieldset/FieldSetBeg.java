package su.izotov.java.markdown.html.token.fieldset;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FieldSetBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<fieldset";
  }

  public HtmlText concat(FieldSetText fieldSetText) {
    return new HtmlText(this.toSource() + fieldSetText.toSource());
  }

  @Override public Tokens tokens() {
    return new FieldSetEnd();
  }
}
