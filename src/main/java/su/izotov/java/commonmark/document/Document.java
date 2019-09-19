package su.izotov.java.commonmark.document;

import su.izotov.java.commonmark.whitespace.Tab;
import su.izotov.java.objectlr.Sense;

/**
 * We can think of a document as a sequence of blocks—structural elements like paragraphs, block quotations, lists, headings, rules, and code blocks.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public interface Document
    extends Sense {

  /**
   * Tabs in lines are not expanded to spaces. However, in contexts where whitespace helps to define block structure, tabs behave as if they were replaced by spaces with a tab stop of 4 characters.
   * <p>
   * Thus, for example, a tab can be used instead of four spaces in an indented code block. (Note, however, that internal tabs are passed through as literal tabs, not expanded to spaces.)
   */
  default Sense concat(final Tab tab) {
    throw new UnsupportedOperationException("#concat()");
  }
}
