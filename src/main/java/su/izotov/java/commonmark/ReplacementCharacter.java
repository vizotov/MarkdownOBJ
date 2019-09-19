package su.izotov.java.commonmark;

import su.izotov.java.commonmark.character.Character;

/**
 * (U+FFFD).
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class ReplacementCharacter
    implements Character {

  @Override
  public String toSource() {
    throw new UnsupportedOperationException("#toSource()");
  }
}
