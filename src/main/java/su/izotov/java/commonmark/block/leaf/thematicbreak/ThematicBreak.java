package su.izotov.java.commonmark.block.leaf.thematicbreak;

import su.izotov.java.commonmark.block.leaf.setexheading.SetexHeading;
import su.izotov.java.commonmark.document.LeafBlock;
import su.izotov.java.commonmark.whitespace.Whitespace;

/**
 * A line consisting of 0-3 spaces of indentation, followed by a sequence of three or more matching -, _, or * characters, each followed optionally by any number of spaces or tabs, forms a thematic break.
 * {@link Whitespace} are allowed between the characters.
 * Thematic breaks can interrupt a paragraph.
 * If a line of dashes that meets the above conditions for being a thematic break could also be interpreted as the underline of a {@link SetexHeading}, the interpretation as a {@link SetexHeading} takes precedence.
 * When both a thematic break and a list item are possible interpretations of a line, the thematic break takes precedence.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface ThematicBreak
    extends LeafBlock {

}
