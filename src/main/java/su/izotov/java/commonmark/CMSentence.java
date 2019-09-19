package su.izotov.java.commonmark;

import su.izotov.java.commonmark.document.Document;
import su.izotov.java.commonmark.document.NoBlockDocument;
import su.izotov.java.objectlr.Sentence;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class CMSentence
    extends Sentence<NoBlockDocument, Document> {

  public CMSentence(final String text) {
    super(text,
          new NoBlockDocument());
  }
}
