package su.izotov.java.markdown.html.token.blockquote;

import su.izotov.java.objectlr.token.Marker;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BlockQuoteEnd
    implements Marker {
  @Override public String toSource() {
    return "</blockquote>";
  }
}
