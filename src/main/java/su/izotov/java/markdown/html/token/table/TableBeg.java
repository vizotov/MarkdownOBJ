package su.izotov.java.markdown.html.token.table;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class TableBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<table";
  }

  public TableBegText concat(HtmlText htmlText) {
    return new TableBegText(htmlText.toSource());
  }

  public HtmlText concat(TableEnd tableEnd) {
    return new HtmlText(this.toSource() + tableEnd.toSource());
  }
}
