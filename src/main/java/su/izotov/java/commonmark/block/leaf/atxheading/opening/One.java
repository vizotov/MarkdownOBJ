package su.izotov.java.commonmark.block.leaf.atxheading.opening;

import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class One
    implements OpeningLine {

  @Override
  public String toSource() {
    return "#";
  }

  public Sense concat(final One one) {
    return new Two();
  }
}
