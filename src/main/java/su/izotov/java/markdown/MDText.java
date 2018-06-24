package su.izotov.java.markdown;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class MDText
    implements MarkdownLang {
  private final String text;

  public MDText(final String text) {
    this.text = text;
  }
}
