package su.izotov.java.markdown.html.token.h1;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H1Text
    implements HtmlToken {
  private final String text;

  public H1Text(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new H1End().toSource();
  }
}
