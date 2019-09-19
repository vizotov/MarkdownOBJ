package su.izotov.java.commonmark.block.indent;

import su.izotov.java.commonmark.whitespace.Space;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class OneIndent
    implements Indent {

  @Override
  public String toSource() {
    return " ";
  }

  public TwoIndent concat(final Space space) {
    return new TwoIndent();
  }
}
