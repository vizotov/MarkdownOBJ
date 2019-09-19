package su.izotov.java.commonmark.document;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class MultiBlockDocument
    implements Document {

  private final Document document;
  private final Block block;

  public MultiBlockDocument(final Document document,
                            final Block block) {
    this.document = document;
    this.block = block;
  }

  @Override
  public String toSource() {
    return this.document.toSource() + this.block.toSource();
  }
}
