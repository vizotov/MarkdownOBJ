package su.izotov.java.commonmark.inline;

import su.izotov.java.objectlr.Sentence;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class InlineLang
    extends Sentence<Inline, Inline> {

  public InlineLang(final String text,
                    final Inline master) {
    super(text,
          master);
  }
}
