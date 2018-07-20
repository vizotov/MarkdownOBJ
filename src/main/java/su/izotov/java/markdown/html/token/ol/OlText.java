package su.izotov.java.markdown.html.token.ol;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class OlText
    implements HtmlToken {
  private final String text;

  public OlText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new OlEnd().toSource();
  }
}
