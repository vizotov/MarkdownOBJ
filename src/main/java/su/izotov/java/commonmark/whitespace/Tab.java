package su.izotov.java.commonmark.whitespace;

/**
 * 2.2 Tabs TODO
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class Tab
    implements WhitespaceCharacter {

  @Override
  public String toSource() {
    return "\u0009";
  }
}
