package su.izotov.java.markdown.html.token.fieldset;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FieldSetBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<fieldset";
  }

  public FiledSetBegText concat(HtmlText htmlText) {
    return new FiledSetBegText(htmlText.toSource());
  }

  public HtmlText concat(FieldSetEnd fieldSetEnd) {
    return new HtmlText(this.toSource() + fieldSetEnd.toSource());
  }
}
