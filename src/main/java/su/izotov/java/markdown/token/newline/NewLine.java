package su.izotov.java.markdown.token.newline;

import su.izotov.java.markdown.html.HtmlLang;
import su.izotov.java.markdown.token.MarkdownToken;
import su.izotov.java.markdown.token.newline.offset.NLOffset1;
import su.izotov.java.markdown.token.newline.offset.Offset1;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensSet;

/**
 * new line token.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface NewLine
    extends MarkdownToken, HtmlLang, NLToken {
  @Override default Tokens tokens() {
    return new TokensSet(
        MarkdownToken.super.tokens(), // obviously markdown tokens
        NLToken.super.tokens() // after new line tokens
    );
  }

  @Override default Sense textToken(String text) {
    return MarkdownToken.super.textToken(text);
  }

  default NLOffset1 concat(Offset1 offset1) {
    return new NLOffset1();
  }
}
