package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsText
    implements HtmlToken {
  private final String text;

  public InsText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new InsEnd().toSource();
  }
}
