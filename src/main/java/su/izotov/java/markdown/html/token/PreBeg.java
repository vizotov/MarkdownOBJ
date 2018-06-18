package su.izotov.java.markdown.html.token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class PreBeg
    implements HtmlToken {
  private final String text;

  public PreBeg(final String text) {
    this.text = text;
  }

  public PreBeg() {
    this("");
  }

  @Override public String toSource() {
    return "<pre" + text;
  }

  public PreBeg concat(HtmlText htmlText) {
    return new PreBeg(this.text + htmlText);
  }

  public HtmlText concat(PreEnd preEnd) {
    return new HtmlText(this.toSource() + preEnd.toSource());
  }
}
