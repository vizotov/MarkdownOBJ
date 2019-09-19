package su.izotov.java.commonmark.document;

/**
 * We can divide blocks into two types: container blocks, which can contain other blocks, and leaf blocks, which cannot.
 * others (like headings and paragraphs) contain inline content—text, links, emphasized text, images, code spans, and so on.
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface LeafBlock
    extends Block {

}
