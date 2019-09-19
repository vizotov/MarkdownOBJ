package su.izotov.java.commonmark.whitespace;

import su.izotov.java.objectlr.Sense;

/**
 * Whitespace is a sequence of one or more {@link WhitespaceCharacter}.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface Whitespace
    extends Sense {

  default Whitespace concat(final Whitespace whitespace) {
    return new MultiCharWhitespace(this,
                                   whitespace);
  }

  default Whitespace concat(final Space space) {
    return new MultiSpace(this,
                          space);
  }
}
