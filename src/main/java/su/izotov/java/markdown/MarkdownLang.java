package su.izotov.java.markdown;

import su.izotov.java.markdown.html.HtmlLang;
import su.izotov.java.markdown.token.gap.Space;
import su.izotov.java.markdown.token.gap.Tab;
import su.izotov.java.markdown.token.newline.DosNewLine;
import su.izotov.java.markdown.token.newline.MacNewLine;
import su.izotov.java.markdown.token.newline.UnixNewLine;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensSet;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface MarkdownLang
    extends Sense, HtmlLang {
  default Tokens tokens() {
    return new TokensSet(HtmlLang.super.tokens() // html tokens
        , new Space(), new Tab(), new DosNewLine(), new MacNewLine(), new UnixNewLine());
  }

  default Sense textToken(String text) {
    return new MDText(text);
  }
  // TODO Make sure $text ends with a couple of newlines:
  //      text.append("\n\n");
}
