package su.izotov.java.markdown.html;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.objectlr.Lang;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface HtmlLang
    extends Lang {
  default Tokens tokens(){
    throw new UnsupportedOperationException("#toSource()");
  }

  default Sense textEnvelope(String text){
    return new HtmlText(text);
  }
}
