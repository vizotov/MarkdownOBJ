package su.izotov.java.markdown.link.definition;

import su.izotov.java.markdown.Title;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class LDTitle
    implements Sense {
  private final Title title;

  public LDTitle(final Title title) {
    this.title = title;
  }

  @Override public Tokens tokens() {
    return new TokensOf(new Colon());
  }

  @Override public Sense textToken(final String text) {
    return new LDText(text);
  }
}
