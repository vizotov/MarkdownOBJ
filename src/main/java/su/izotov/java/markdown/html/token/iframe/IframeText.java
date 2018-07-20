package su.izotov.java.markdown.html.token.iframe;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class IframeText
    implements HtmlToken {
  private final String text;

  public IframeText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new IframeEnd().toSource();
  }
}
