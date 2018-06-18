package su.izotov.java.markdown.html.token.h2;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H2End
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</h2>";
  }
}
