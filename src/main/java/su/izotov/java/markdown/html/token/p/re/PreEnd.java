package su.izotov.java.markdown.html.token.p.re;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</pre>";
  }
}