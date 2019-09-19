package su.izotov.java.commonmark.block.indent;

import su.izotov.java.commonmark.whitespace.Space;
import su.izotov.java.commonmark.whitespace.WhiteSpaces;
import su.izotov.java.commonmark.whitespace.Whitespace;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class ThreeIndent
    implements Indent {

  @Override
  public String toSource() {
    return "   ";
  }

  public Whitespace concat(final Space space) {
    return new WhiteSpaces(4);
  }
}
