package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</ins>";
  }
}
