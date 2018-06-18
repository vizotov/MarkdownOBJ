package su.izotov.java.markdown.html.token;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class HtmlText
    implements HtmlToken {
  private final String text;

  public HtmlText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text;
  }
}
