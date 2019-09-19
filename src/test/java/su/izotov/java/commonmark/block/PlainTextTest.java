package su.izotov.java.commonmark.block;

import junit.framework.TestCase;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Test;
import su.izotov.java.commonmark.CMSentence;
import su.izotov.java.commonmark.document.OneBlockDocument;
import su.izotov.java.objectlr.RecognitionException;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class PlainTextTest {

  /**
   * Example 647
   */
  @Test
  public void testPlainText() throws
                              RecognitionException {
    final String text = "hello $.;'there";
    TestCase.assertTrue(PlainTextTest.senseEquals(new CMSentence(text).toObject(),
                                                  new OneBlockDocument(new PlainText(text))));
  }

  public static boolean senseEquals(final Sense sense1,
                                    final Sense sense2) {
    return EqualsBuilder.reflectionEquals(sense1,
                                          sense2,
                                          false,
                                          null,
                                          true);
  }

  /**
   * Example 648
   */
  @Test
  public void testPlainText2() throws
                               RecognitionException {
    final String text = "Foo χρῆν";
    TestCase.assertTrue(PlainTextTest.senseEquals(new CMSentence(text).toObject(),
                                                  new OneBlockDocument(new PlainText(text))));
  }

  /**
   * Example 649
   */
  @Test
  public void testPlainText3() throws
                               RecognitionException {
    final String text = "Multiple     spaces";
    TestCase.assertTrue(PlainTextTest.senseEquals(new CMSentence(text).toObject(),
                                                  new OneBlockDocument(new PlainText(text))));
  }
}