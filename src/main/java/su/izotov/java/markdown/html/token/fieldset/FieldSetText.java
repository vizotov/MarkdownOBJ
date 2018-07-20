package su.izotov.java.markdown.html.token.fieldset;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FieldSetText
    implements HtmlToken {
  private final String text;

  public FieldSetText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new FieldSetEnd().toSource();
  }
}
