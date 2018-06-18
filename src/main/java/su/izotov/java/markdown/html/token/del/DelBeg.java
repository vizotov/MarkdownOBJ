package su.izotov.java.markdown.html.token.del;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class DelBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<del";
  }

  public DelBegText concat(HtmlText htmlText) {
    return new DelBegText(htmlText.toSource());
  }

  public HtmlText concat(DelEnd delEnd) {
    return new HtmlText(this.toSource() + delEnd.toSource());
  }
}
