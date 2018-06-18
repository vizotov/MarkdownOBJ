package su.izotov.java.markdown.html.token.h4;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H4End
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</h4>";
  }
}
