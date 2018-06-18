package su.izotov.java.markdown.html.token.blockquote;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BlockQuoteText
    implements HtmlToken {
  private final String text;

  public BlockQuoteText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new BlockQuoteBeg().toSource() + text;
  }

  public BlockQuoteText concat(HtmlText htmlText) {
    return new BlockQuoteText(this.text + htmlText);
  }

  public HtmlText concat(BlockQuoteEnd blockQuoteEnd) {
    return new HtmlText(this.toSource() + blockQuoteEnd.toSource());
  }
}
