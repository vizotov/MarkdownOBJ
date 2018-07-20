package su.izotov.java.markdown.html.token.blockquote;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BQText
    implements HtmlToken {
  private final String text;

  public BQText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new BQEnd().toSource();
  }
}
