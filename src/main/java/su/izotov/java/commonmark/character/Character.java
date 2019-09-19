package su.izotov.java.commonmark.character;

import su.izotov.java.commonmark.InsecureCharacter;
import su.izotov.java.commonmark.ReplacementCharacter;
import su.izotov.java.objectlr.Sense;

/**
 * A character is a Unicode code point
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface Character
    extends Sense {

  default Sense concat(final InsecureCharacter insecureCharacter) {
    return this.concatDD(new ReplacementCharacter());
  }
}
