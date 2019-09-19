package su.izotov.java.commonmark.whitespace;

import su.izotov.java.objectlr.print.Spaces;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class WhiteSpaces
    implements Whitespace {

  private final int cnt;

  public WhiteSpaces(final int cnt) {
    this.cnt = cnt;
  }

  @Override
  public String toSource() {
    return new Spaces(this.cnt).toSource();
  }
}
