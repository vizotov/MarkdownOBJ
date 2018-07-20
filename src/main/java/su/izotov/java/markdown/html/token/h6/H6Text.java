package su.izotov.java.markdown.html.token.h6;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H6Text
    implements HtmlToken {
  private final String text;

  public H6Text(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new H6End().toSource();
  }
}
