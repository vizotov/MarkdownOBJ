package su.izotov.java.markdown.html.token.h1;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H1End
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</h1>";
  }
}
