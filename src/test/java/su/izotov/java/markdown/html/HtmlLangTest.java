package su.izotov.java.markdown.html;

import org.apache.commons.lang3.builder.EqualsBuilder;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Unrecognized;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class HtmlLangTest
    implements HtmlLang {
  @Test public void testBQ() {
    Sense result = this.concat(new Unrecognized("<blockquote some text </blockquote>"));
    HtmlText expResult = new HtmlText("<blockquote some text </blockquote>");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void testP() {
    Sense result = this.concat(new Unrecognized("<p some text </p>"));
    HtmlText expResult = new HtmlText("<p some text </p>");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void testPre() {
    Sense result = this.concat(new Unrecognized("<pre some text </pre>"));
    HtmlText expResult = new HtmlText("<pre some text </pre>");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void testComment() {
    Sense result = this.concat(new Unrecognized("<!--<del sss </del> qqq <blockquote some text "
                                                + "</blockquote> -->"));
    HtmlText expResult = new HtmlText(
        "<!--<del sss </del> qqq <blockquote some text </blockquote> -->");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void testDel() {
    Sense result = this.concat(new Unrecognized(
        "<!--<del sss </del> qqq <blockquote some text </blockquote> -->"));
    HtmlText expResult = new HtmlText(
        "<!--<del sss </del> qqq <blockquote some text </blockquote> -->");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void testDiv() {
    Sense result = this.concat(new Unrecognized("<!--<div sss </div> qqq <blockquote some text "
                                                + "</blockquote> -->"));
    HtmlText expResult = new HtmlText("<!--<div sss </div> qqq <blockquote some text </blockquote>"
                                      + " -->");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void testDl() {
    Sense result = this.concat(new Unrecognized("<!--<div sss </div> qqq <dl some text "
                                                + "</dl> -->"));
    HtmlText expResult = new HtmlText("<!--<div sss </div> qqq <dl some text </dl>" + " -->");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  public HtmlText concat(HtmlText htmlText) {
    return htmlText;
  }
}