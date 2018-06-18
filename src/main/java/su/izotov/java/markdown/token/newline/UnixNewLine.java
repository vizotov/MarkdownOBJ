package su.izotov.java.markdown.token.newline;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class UnixNewLine
    implements NewLine {
  @Override public String toSource() {
    return "\n";
  }
}
