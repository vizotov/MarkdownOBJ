package su.izotov.java.markdown.html.token.comment;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class CommentEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "-->";
  }
}
