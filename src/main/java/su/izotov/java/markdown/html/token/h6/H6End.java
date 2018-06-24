package su.izotov.java.markdown.html.token.h6;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H6End
    implements HtmlToken {
  @Override public String toSource() {
    return "</h6>";
  }
}
