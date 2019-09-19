package su.izotov.java.commonmark.block.leaf.atxheading.closing;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class Sharps
    implements SharpSequence {

  private final String content;

  public Sharps(final String content) {
    this.content = content;
  }

  @Override
  public String toSource() {
    return this.content;
  }
}
