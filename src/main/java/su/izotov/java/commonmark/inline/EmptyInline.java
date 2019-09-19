package su.izotov.java.commonmark.inline;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class EmptyInline
    implements Inline {

  @Override
  public String toSource() {
    return "";
  }
}
