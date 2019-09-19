package su.izotov.java.commonmark.block.leaf.thematicbreak;

import su.izotov.java.commonmark.block.indent.Indent;

/**
 * TODO
 * If a line of dashes that meets the above conditions for being a thematic break could also be interpreted as the underline of a setext heading, the interpretation as a setext heading takes precedence.
 * Created with IntelliJ IDEA.
 * TODO
 * When both a thematic break and a list item are possible interpretations of a line, the thematic break takes precedence
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class IndentedThematicBreak
    implements ThematicBreak {

  private final Indent indent;
  private final UnindentedThematicBreak unindentedThematicBreak;

  public IndentedThematicBreak(final Indent indent,
                               final UnindentedThematicBreak unindentedThematicBreak) {
    this.indent = indent;
    this.unindentedThematicBreak = unindentedThematicBreak;
  }

  @Override
  public String toSource() {
    return this.indent.toSource() + this.unindentedThematicBreak.toSource();
  }
}
