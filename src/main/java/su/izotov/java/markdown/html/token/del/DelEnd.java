package su.izotov.java.markdown.html.token.del;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DelEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</del>";
  }
}
