package su.izotov.java.markdown.html.token;

/**
 * constructing 'pre' tag
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class Re
    implements HtmlEndTag {
  @Override public String toSource() {
    return "re";
  }
}
