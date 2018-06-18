package su.izotov.java.markdown.html.token.blockquote;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BlockQuoteBeg
    implements HtmlToken {
  @Override public String toSource() {
    return "<blockquote";
  }

  public BlockQuoteText concat(HtmlText htmlText) {
    return new BlockQuoteText(htmlText.toSource());
  }

  public HtmlText concat(BlockQuoteEnd blockQuoteEnd) {
    return new HtmlText(this.toSource() + blockQuoteEnd.toSource());
  }
}
