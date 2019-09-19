package su.izotov.java.commonmark.whitespace;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class MultiSpace
    implements Whitespace {

  private final Whitespace first;
  private final Whitespace second;

  public MultiSpace(final Whitespace first,
                    final Whitespace second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public String toSource() {
    return this.first.toSource() + this.second.toSource();
  }
}
