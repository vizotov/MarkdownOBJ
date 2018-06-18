package su.izotov.java.markdown.html.token.form;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FormBegText
    implements HtmlToken {
  private final String text;

  public FormBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new FormBeg().toSource() + text;
  }

  public FormBegText concat(HtmlText htmlText) {
    return new FormBegText(this.text + htmlText);
  }

  public HtmlText concat(FormEnd formEnd) {
    return new HtmlText(this.toSource() + formEnd.toSource());
  }
}
