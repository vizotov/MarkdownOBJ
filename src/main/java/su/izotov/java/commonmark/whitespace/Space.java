package su.izotov.java.commonmark.whitespace;

/**
 * A space is U+0020.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class Space
    implements WhitespaceCharacter {

  @Override
  public String toSource() {
    return "\u0020";
  }

  @Override
  public Whitespace concat(final Space space) {
    return new WhiteSpaces(2);
  }
}
