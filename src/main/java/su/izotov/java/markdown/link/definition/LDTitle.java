package su.izotov.java.markdown.link.definition;

import su.izotov.java.markdown.square.Title;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;

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
    return new Colon();
  }

  @Override public Sense textToken(final String text) {
    return new LDText(text);
  }
}
