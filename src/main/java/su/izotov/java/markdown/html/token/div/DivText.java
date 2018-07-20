package su.izotov.java.markdown.html.token.div;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DivText
    implements HtmlToken {
  private final String text;

  public DivText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new DivEnd().toSource();
  }
}
