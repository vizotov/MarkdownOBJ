package su.izotov.java.commonmark.block.leaf.atxheading.inline;

import su.izotov.java.commonmark.block.leaf.atxheading.closing.ClosingLine;
import su.izotov.java.commonmark.block.leaf.atxheading.closing.EmptyClosingLine;
import su.izotov.java.commonmark.inline.EmptyInline;
import su.izotov.java.commonmark.inline.InlineLang;
import su.izotov.java.commonmark.whitespace.NewLine;
import su.izotov.java.objectlr.RecognitionException;
import su.izotov.java.objectlr.Sense;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $
 * @since 1.0
 */
public class InlineText
    implements Sense {

  private final String text;

  public InlineText(final String text) {
    this.text = text;
  }

  public Sense concat(final InlineText inlineText) {
    return new InlineText(this.toSource() + inlineText.toSource());
  }

  @Override
  public String toSource() {
    return this.text;
  }

  public Sense concat(final NewLine newLine) throws
                                             RecognitionException {
    return new ClosedText(new InlineLang(this.text,
                                         new EmptyInline()).toObject(),
                          new EmptyClosingLine(newLine));
  }

  public Sense concat(final ClosingLine closingLine) throws
                                                     RecognitionException {
    return new ClosedText(new InlineLang(this.text,
                                         new EmptyInline()).toObject(),
                          closingLine);
  }
}
