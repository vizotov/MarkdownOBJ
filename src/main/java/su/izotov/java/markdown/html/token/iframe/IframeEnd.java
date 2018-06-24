package su.izotov.java.markdown.html.token.iframe;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class IframeEnd
    implements HtmlToken {
  @Override public String toSource() {
    return "</iframe>";
  }
}
