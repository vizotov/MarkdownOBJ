package su.izotov.java.commonmark.document;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class OneBlockDocument
    implements Document {

  private final Block block;

  public OneBlockDocument(final Block block) {
    this.block = block;
  }

  public Document concat(final Block block) {
    return new MultiBlockDocument(this,
                                  block);
  }

  @Override
  public String toSource() {
    return this.block.toSource();
  }
}
