package su.izotov.java.markdown.html.token.iframe;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class IFrameBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<iframe";
  }

  public IframeBegText concat(HtmlText htmlText) {
    return new IframeBegText(htmlText.toSource());
  }

  public HtmlText concat(IframeEnd iframeEnd) {
    return new HtmlText(this.toSource() + iframeEnd.toSource());
  }
}
