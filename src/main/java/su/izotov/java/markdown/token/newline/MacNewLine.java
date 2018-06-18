package su.izotov.java.markdown.token.newline;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class MacNewLine
    implements NewLine {
  @Override public String toSource() {
    return "\\r";
  }

  public DosNewLine concat(final UnixNewLine token) {
    return new DosNewLine();
  }
}
