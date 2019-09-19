package su.izotov.java.commonmark.inline;

import su.izotov.java.objectlr.Sense;

/**
 * inline content—text, links, emphasized text, images, code spans, and so on.
 * Inlines are parsed sequentially from the beginning of the character stream to the end (left to right, in left-to-right languages).
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface Inline
    extends Sense {
  // 3.1 Precedence TODO
}
