package su.izotov.java.commonmark.block.leaf.atxheading.opening;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
class Three
    implements OpeningLine {

  @Override
  public String toSource() {
    return "###";
  }
}
