package su.izotov.java.markdown.html.token.noscript;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class NoScriptEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</noscript>";
  }
}
