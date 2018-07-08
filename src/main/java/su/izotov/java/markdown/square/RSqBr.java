package su.izotov.java.markdown.square;

import su.izotov.java.objectlr.token.Marker;

/**
 * right square bracket
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class RSqBr
    implements Marker {
  @Override public String toSource() {
    return "]";
  }
}
