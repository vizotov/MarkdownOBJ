package su.izotov.java.markdown.html.token.fieldset;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FiledSetBegText
    implements HtmlToken {
  private final String text;

  public FiledSetBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new FieldSetBeg().toSource() + text;
  }

  public FiledSetBegText concat(HtmlText htmlText) {
    return new FiledSetBegText(this.text + htmlText);
  }

  public HtmlText concat(FieldSetEnd fieldSetEnd) {
    return new HtmlText(this.toSource() + fieldSetEnd.toSource());
  }
}
