package su.izotov.java.markdown;

import su.izotov.java.objectlr.Lang;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface MarkdownLang extends Lang {
  default Tokens tokens(){
    throw new UnsupportedOperationException("#toSource()");
  }

  default Sense textEnvelope(String text){
    throw new UnsupportedOperationException("#toSource()");
  }

  // TODO Make sure $text ends with a couple of newlines:
  //      text.append("\n\n");
}
