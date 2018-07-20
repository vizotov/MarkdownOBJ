package su.izotov.java.markdown.html.token.script;

import su.izotov.java.markdown.html.token.HtmlMarker;
import su.izotov.java.markdown.html.token.HtmlText;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class ScriptEnd
    implements HtmlMarker {
  @Override public String toSource() {
    return "</script>";
  }

  @Override public ScriptText concatTo(final HtmlText htmlText) {
    return new ScriptText(htmlText.toSource());
  }
}
