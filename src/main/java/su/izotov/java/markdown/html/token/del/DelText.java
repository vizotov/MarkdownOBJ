package su.izotov.java.markdown.html.token.del;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DelText
    implements HtmlToken {
  private final String text;

  public DelText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new DelEnd().toSource();
  }
}
