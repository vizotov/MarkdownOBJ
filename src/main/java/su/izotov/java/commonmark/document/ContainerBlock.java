package su.izotov.java.commonmark.document;

/**
 * We can divide blocks into two types: container blocks, which can contain other blocks, and leaf blocks, which cannot.
 * Some blocks (like block quotes and list items) contain other blocks;
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface ContainerBlock
    extends Block {

}
