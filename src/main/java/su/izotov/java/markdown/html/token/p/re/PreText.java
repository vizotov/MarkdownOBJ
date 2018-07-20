package su.izotov.java.markdown.html.token.p.re;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreText
    implements HtmlToken {
  private final String text;

  public PreText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new PreEnd().toSource();
  }
}
