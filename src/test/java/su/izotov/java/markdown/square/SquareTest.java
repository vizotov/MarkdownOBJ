package su.izotov.java.markdown.square;

import org.apache.commons.lang3.builder.EqualsBuilder;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.token.Failed;
import su.izotov.java.objectlr.token.Unrecognized;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public class SquareTest
    implements Sense {
  @Test public void test1() {
    Sense result = this.concat(new Unrecognized("[title]"));
    Title expResult = new Title("title");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  @Test public void test2() {
    Sense result = this.concat(new Unrecognized("[]"));
    Failed expResult = new Failed("[", "]");
    assertTrue(EqualsBuilder.reflectionEquals(expResult, result, false, null, true));
  }

  public Title concat(final Title title) {
    return title;
  }

  public Failed concat(final Failed text) {
    return text;
  }


  @Override public Tokens tokens() {
    return new TokensOf(new LSqBr());
  }
}