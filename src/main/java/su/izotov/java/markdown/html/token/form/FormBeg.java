package su.izotov.java.markdown.html.token.form;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

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

  public FormBegText concat(HtmlText htmlText) {
    return new FormBegText(htmlText.toSource());
  }

  public HtmlText concat(FormEnd formEnd) {
    return new HtmlText(this.toSource() + formEnd.toSource());
  }
}
