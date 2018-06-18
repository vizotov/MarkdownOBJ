package su.izotov.java.markdown.html.token.hr;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.HtmlToken;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class HrBegText
    implements HtmlToken {
  private final String text;

  public HrBegText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return new HrBeg().toSource() + text;
  }

  public HrBegText concat(HtmlText htmlText) {
    return new HrBegText(this.text + htmlText);
  }

  public HtmlText concat(HrEnd hrEnd) {
    return new HtmlText(this.toSource() + hrEnd.toSource());
  }

  @Override public Tokens tokens() {
    throw new UnsupportedOperationException("#tokens()"); // TODO add token HrEnd to tokenset
  }
}
