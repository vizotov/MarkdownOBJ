package su.izotov.java.markdown.html.token.form;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FormText
    implements HtmlToken {
  private final String text;

  public FormText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new FormEnd().toSource();
  }
}
