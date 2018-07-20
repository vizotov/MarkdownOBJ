package su.izotov.java.markdown.html.token.table;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class TableText
    implements HtmlToken {
  private final String text;

  public TableText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new TableEnd().toSource();
  }
}
