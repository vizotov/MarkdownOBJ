package su.izotov.java.markdown.token.newline;

import su.izotov.java.markdown.html.HtmlLang;
import su.izotov.java.markdown.link.definition.offset.Offset1;
import su.izotov.java.markdown.token.MarkdownToken;
import su.izotov.java.markdown.token.gap.Space;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * new line token.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface NewLine
    extends MarkdownToken, HtmlLang {
  @Override default Tokens tokens() {
    return new TokensOf(
        MarkdownToken.super.tokens(), // obviously markdown tokens
        HtmlLang.super.tokens() // html tokens
    );
  }

  @Override default Sense textToken(String text) {
    return MarkdownToken.super.textToken(text);
  }

  /**
   * try to recognize new line offset related constructions
   */
  default Sense concat(Space space) {
    return this.concatDD(new Offset1());
  }
}
