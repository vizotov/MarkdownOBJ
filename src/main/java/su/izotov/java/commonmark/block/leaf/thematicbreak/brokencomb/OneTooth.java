package su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb;

import su.izotov.java.objectlr.Sense;

/**
 * a selected character, followed by spaces
 * * selected characters can be: minus, underscore and star
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public abstract class OneTooth
    implements Sense {

  private final String content;

  protected OneTooth(final String content) {
    this.content = content;
  }

  @Override
  public String toSource() {
    return this.content;
  }
}
