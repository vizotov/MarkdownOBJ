package su.izotov.java.markdown.token.gap;

import su.izotov.java.markdown.token.MarkdownToken;
import su.izotov.java.markdown.token.newline.NewLine;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface Gap
    extends MarkdownToken {
  default NewLine concat(NewLine newLine) {
    return newLine;
  }
}
