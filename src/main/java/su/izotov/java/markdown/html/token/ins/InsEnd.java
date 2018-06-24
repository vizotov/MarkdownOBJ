package su.izotov.java.markdown.html.token.ins;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsEnd
    implements HtmlToken {
  @Override public String toSource() {
    return "</ins>";
  }
}
