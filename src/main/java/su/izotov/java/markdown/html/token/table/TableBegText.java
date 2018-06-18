package su.izotov.java.markdown.html.token.table;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class TableBegText
    implements HtmlToken {
  private final String text;

  public TableBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new TableBeg().toSource() + text;
  }

  public TableBegText concat(HtmlText htmlText) {
    return new TableBegText(this.text + htmlText);
  }

  public HtmlText concat(TableEnd tableEnd) {
    return new HtmlText(this.toSource() + tableEnd.toSource());
  }
}
