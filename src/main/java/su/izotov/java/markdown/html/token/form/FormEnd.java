package su.izotov.java.markdown.html.token.form;

import su.izotov.java.markdown.html.token.HtmlEndTag;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class FormEnd
    implements HtmlEndTag {
  @Override public String toSource() {
    return "</form>";
  }
}
