package su.izotov.java.markdown.square;

import su.izotov.java.objectlr.token.Marker;

/**
 * the text with right square bracket
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class TextRSqBr
    implements Marker {
  private final String text;

  public TextRSqBr(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new RSqBr().toSource();
  }

  public String text() {
    return text;
  }

  public TextRSqBr concatTo(final String text) {
    return new TextRSqBr(text + this.text);
  }
}
