package su.izotov.java.markdown.html.token.table;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class TableEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</table>";
  }
}
