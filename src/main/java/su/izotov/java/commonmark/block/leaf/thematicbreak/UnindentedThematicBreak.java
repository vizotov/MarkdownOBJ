package su.izotov.java.commonmark.block.leaf.thematicbreak;

import su.izotov.java.commonmark.block.leaf.thematicbreak.brokencomb.BrokenComb;
import su.izotov.java.commonmark.whitespace.NewLine;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class UnindentedThematicBreak
    implements ThematicBreak {

  private final BrokenComb brokenComb;

  public UnindentedThematicBreak(final BrokenComb brokenComb) {
    this.brokenComb = brokenComb;
  }

  @Override
  public String toSource() {
    return this.brokenComb.toSource() + new NewLine().toSource();
  }
}
