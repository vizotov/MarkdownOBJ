package su.izotov.java.commonmark.document;

import su.izotov.java.commonmark.block.PlainText;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class NoBlockDocument
    implements Document {

  public Document concat(final Block block) {
    return new OneBlockDocument(block);
  }

  @Override
  public Sense textToken(final String text) {
    return new PlainText(text);
  }

  @Override
  public String toSource() {
    return "";
  }
}
