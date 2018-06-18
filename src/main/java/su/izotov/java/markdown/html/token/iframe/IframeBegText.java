package su.izotov.java.markdown.html.token.iframe;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class IframeBegText
    implements HtmlToken {
  private final String text;

  public IframeBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new IFrameBeg().toSource() + text;
  }

  public IframeBegText concat(HtmlText htmlText) {
    return new IframeBegText(this.text + htmlText);
  }

  public HtmlText concat(IframeEnd iframeEnd) {
    return new HtmlText(this.toSource() + iframeEnd.toSource());
  }
}
