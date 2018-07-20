package su.izotov.java.markdown.html;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.blockquote.BQBeg;
import su.izotov.java.markdown.html.token.comment.CommentBeg;
import su.izotov.java.markdown.html.token.del.DelBeg;
import su.izotov.java.markdown.html.token.div.DivBeg;
import su.izotov.java.markdown.html.token.dl.DlBeg;
import su.izotov.java.markdown.html.token.fieldset.FieldSetBeg;
import su.izotov.java.markdown.html.token.form.FormBeg;
import su.izotov.java.markdown.html.token.h1.H1Beg;
import su.izotov.java.markdown.html.token.h2.H2Beg;
import su.izotov.java.markdown.html.token.h3.H3Beg;
import su.izotov.java.markdown.html.token.h4.H4Beg;
import su.izotov.java.markdown.html.token.h5.H5Beg;
import su.izotov.java.markdown.html.token.h6.H6Beg;
import su.izotov.java.markdown.html.token.hr.HrBeg;
import su.izotov.java.markdown.html.token.iframe.IframeBeg;
import su.izotov.java.markdown.html.token.ins.InsBeg;
import su.izotov.java.markdown.html.token.math.MathBeg;
import su.izotov.java.markdown.html.token.noscript.NoScriptBeg;
import su.izotov.java.markdown.html.token.ol.OlBeg;
import su.izotov.java.markdown.html.token.p.PBeg;
import su.izotov.java.markdown.html.token.p.re.PreBeg;
import su.izotov.java.markdown.html.token.script.ScriptBeg;
import su.izotov.java.markdown.html.token.table.TableBeg;
import su.izotov.java.markdown.html.token.ul.UlBeg;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensOf;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface HtmlLang
    extends Sense {
  default Tokens tokens() {
    return new TokensOf(new BQBeg(),
                        new CommentBeg(),
                        new DelBeg(),
                        new DivBeg(),
                        new DlBeg(),
                        new FieldSetBeg(),
                        new FormBeg(),
                        new H1Beg(),
                        new H2Beg(),
                        new H3Beg(),
                        new H4Beg(),
                        new H5Beg(),
                        new H6Beg(),
                        new HrBeg(), new IframeBeg(),
                        new InsBeg(),
                        new MathBeg(),
                        new NoScriptBeg(),
                        new OlBeg(),
                        new PBeg(),
                        new PreBeg(),
                        new ScriptBeg(),
                        new TableBeg(), new UlBeg());
  }

  default Sense textToken(String text) {
    return new HtmlText(text);
  }
}
