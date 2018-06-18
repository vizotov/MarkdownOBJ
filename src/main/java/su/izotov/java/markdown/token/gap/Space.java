package su.izotov.java.markdown.token.gap;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class Space implements Gap {
  @Override public String toSource() {
    return " ";
  }
}
