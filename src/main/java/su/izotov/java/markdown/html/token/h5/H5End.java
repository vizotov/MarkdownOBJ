package su.izotov.java.markdown.html.token.h5;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class H5End
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</h5>";
  }
}
