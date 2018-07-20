package su.izotov.java.markdown.html.token.table;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

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

  public HtmlText concat(TableText tableText) {
    return new HtmlText(this.toSource() + tableText.toSource());
  }

  @Override public Tokens tokens() {
    return new TableEnd();
  }
}
