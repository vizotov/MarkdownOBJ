package su.izotov.java.markdown.token.newline;

import su.izotov.java.markdown.html.HtmlLang;
import su.izotov.java.markdown.token.MarkdownToken;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;

/**
 * new line token
 *
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface NewLine extends MarkdownToken, HtmlLang {
  @Override default Tokens tokens() {
    throw new UnsupportedOperationException("#toSource()"); // TODO multi language tokenset
  }

  @Override default Sense textEnvelope(String text) {
    return MarkdownToken.super.textEnvelope(text);
  }
}
