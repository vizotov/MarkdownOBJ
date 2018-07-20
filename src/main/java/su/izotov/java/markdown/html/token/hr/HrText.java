package su.izotov.java.markdown.html.token.hr;

import su.izotov.java.markdown.html.token.HtmlToken;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class HrText
    implements HtmlToken {
  private final String text;

  public HrText(final String text) {
    this.text = text;
  }

  @Override public String toSource() {
    return text + new HrEnd().toSource();
  }
}