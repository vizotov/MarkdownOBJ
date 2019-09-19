package su.izotov.java.commonmark.block.leaf;

import su.izotov.java.commonmark.Line;

/**
 * A setext heading underline is a sequence of = characters or a sequence of - characters, with no more than 3 spaces indentation and any number of trailing spaces. If a line containing a single - can be interpreted as an empty list items, it should be interpreted this way and not as a setext heading underline.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface SetexHeadingUnderline
    extends Line {

}
