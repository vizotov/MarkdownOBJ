package su.izotov.java.commonmark;

import su.izotov.java.commonmark.character.Character;

/**
 * 6.1 Backslash escapes
 * Any ASCII punctuation character may be backslash-escaped.
 * Backslashes before other characters are treated as literal backslashes.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class BackslashEscape
    implements Character {

  @Override
  public String toSource() {
    throw new UnsupportedOperationException("#toSource()");
  }
  // TODO Appendix: A parsing strategy here
}
