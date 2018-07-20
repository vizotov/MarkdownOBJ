package su.izotov.java.markdown.html.token.iframe;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class IframeBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<iframe";
  }

  public HtmlText concat(IframeText iframeText) {
    return new HtmlText(this.toSource() + iframeText.toSource());
  }

  @Override public Tokens tokens() {
    return new IframeEnd();
  }
}
