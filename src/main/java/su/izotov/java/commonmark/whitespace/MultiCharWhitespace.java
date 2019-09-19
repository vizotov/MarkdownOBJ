package su.izotov.java.commonmark.whitespace;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class MultiCharWhitespace
    implements Whitespace {

  private final Whitespace[] whitespaces;

  public MultiCharWhitespace(final Whitespace... whitespaces) {
    this.whitespaces = whitespaces;
  }

  @Override
  public String toSource() {
    String ret = "";
    for (final Whitespace whitespace : this.whitespaces) {
      ret += whitespace.toSource();
    }
    return ret;
  }
}
