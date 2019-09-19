package su.izotov.java.commonmark;

import su.izotov.java.commonmark.character.Character;

/**
 * For security reasons, the Unicode character U+0000 must be replaced with the {@link ReplacementCharacter} (U+FFFD).
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class InsecureCharacter
    implements Character {

  @Override
  public String toSource() {
    return "\u0000";
  }
}
