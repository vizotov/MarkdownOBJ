package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb;

import su.izotov.java.objectlr.Sense;

/**
 * a sequence of characters, a space and a selected character, repeated in random order an arbitrary number of times. the selected character must be repeated at least 3 times.
 * selected characters can be: minus, underscore and star
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public abstract class BrokenComb
    implements Sense {

  private final String content;

  protected BrokenComb(final String content) {
    this.content = content;
  }

  @Override
  public String toSource() {
    return this.content;
  }
}
