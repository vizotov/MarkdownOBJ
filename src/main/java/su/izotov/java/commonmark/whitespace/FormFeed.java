package su.izotov.java.commonmark.whitespace;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class FormFeed
    implements WhitespaceCharacter {

  @Override
  public String toSource() {
    return "\u000C";
  }
}
