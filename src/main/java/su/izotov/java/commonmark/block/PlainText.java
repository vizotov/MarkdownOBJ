package su.izotov.java.commonmark.block;

import su.izotov.java.commonmark.document.Block;

/**
 * 6.11Textual content
 * Any characters not given an interpretation by the above rules will be parsed as plain textual content.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class PlainText
    implements Block {

  private final String text;

  public PlainText(final String text) {
    this.text = text;
  }

  @Override
  public String toSource() {
    return this.text;
  }
}
