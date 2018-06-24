package su.izotov.java.markdown.html;

import su.izotov.java.markdown.html.token.HtmlText;
import su.izotov.java.markdown.html.token.blockquote.BlockQuoteBeg;
import su.izotov.java.markdown.html.token.blockquote.BlockQuoteEnd;
import su.izotov.java.markdown.html.token.comment.CommentBeg;
import su.izotov.java.markdown.html.token.comment.CommentEnd;
import su.izotov.java.markdown.html.token.del.DelBeg;
import su.izotov.java.markdown.html.token.del.DelEnd;
import su.izotov.java.markdown.html.token.div.DivBeg;
import su.izotov.java.markdown.html.token.div.DivEnd;
import su.izotov.java.markdown.html.token.dl.DlBeg;
import su.izotov.java.markdown.html.token.dl.DlEnd;
import su.izotov.java.markdown.html.token.fieldset.FieldSetBeg;
import su.izotov.java.markdown.html.token.fieldset.FieldSetEnd;
import su.izotov.java.markdown.html.token.form.FormBeg;
import su.izotov.java.markdown.html.token.form.FormEnd;
import su.izotov.java.markdown.html.token.h1.H1Beg;
import su.izotov.java.markdown.html.token.h1.H1End;
import su.izotov.java.markdown.html.token.h2.H2Beg;
import su.izotov.java.markdown.html.token.h2.H2End;
import su.izotov.java.markdown.html.token.h3.H3Beg;
import su.izotov.java.markdown.html.token.h3.H3End;
import su.izotov.java.markdown.html.token.h4.H4Beg;
import su.izotov.java.markdown.html.token.h4.H4End;
import su.izotov.java.markdown.html.token.h5.H5Beg;
import su.izotov.java.markdown.html.token.h5.H5End;
import su.izotov.java.markdown.html.token.h6.H6Beg;
import su.izotov.java.markdown.html.token.hr.HrBeg;
import su.izotov.java.markdown.html.token.hr.HrEnd;
import su.izotov.java.markdown.html.token.iframe.IFrameBeg;
import su.izotov.java.markdown.html.token.iframe.IframeEnd;
import su.izotov.java.markdown.html.token.ins.InsBeg;
import su.izotov.java.markdown.html.token.ins.InsEnd;
import su.izotov.java.markdown.html.token.math.MathBeg;
import su.izotov.java.markdown.html.token.math.MathEnd;
import su.izotov.java.markdown.html.token.noscript.NoScriptBeg;
import su.izotov.java.markdown.html.token.noscript.NoScriptEnd;
import su.izotov.java.markdown.html.token.ol.OlBeg;
import su.izotov.java.markdown.html.token.ol.OlEnd;
import su.izotov.java.markdown.html.token.p.PBeg;
import su.izotov.java.markdown.html.token.p.PEnd;
import su.izotov.java.markdown.html.token.p.re.PreBeg;
import su.izotov.java.markdown.html.token.p.re.PreEnd;
import su.izotov.java.markdown.html.token.p.re.Re;
import su.izotov.java.markdown.html.token.script.ScriptBeg;
import su.izotov.java.markdown.html.token.script.ScriptEnd;
import su.izotov.java.markdown.html.token.table.TableBeg;
import su.izotov.java.markdown.html.token.table.TableEnd;
import su.izotov.java.markdown.html.token.ul.UlBeg;
import su.izotov.java.markdown.html.token.ul.UlEnd;
import su.izotov.java.objectlr.Sense;
import su.izotov.java.objectlr.tokens.Tokens;
import su.izotov.java.objectlr.tokens.TokensSet;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface HtmlLang
    extends Sense {
  default Tokens tokens() {
    return new TokensSet(new BlockQuoteBeg(),
                         new BlockQuoteEnd(),
                         new CommentBeg(),
                         new CommentEnd(),
                         new DelBeg(),
                         new DelEnd(),
                         new DivBeg(),
                         new DivEnd(),
                         new DlBeg(),
                         new DlEnd(),
                         new FieldSetBeg(),
                         new FieldSetEnd(),
                         new FormBeg(),
                         new FormEnd(),
                         new H1Beg(),
                         new H1End(),
                         new H2Beg(),
                         new H2End(),
                         new H3Beg(),
                         new H3End(),
                         new H4Beg(),
                         new H4End(),
                         new H5Beg(),
                         new H5End(),
                         new H6Beg(),
                         new HrBeg(),
                         new HrEnd(),
                         new IFrameBeg(),
                         new IframeEnd(),
                         new InsBeg(),
                         new InsEnd(),
                         new MathBeg(),
                         new MathEnd(),
                         new NoScriptBeg(),
                         new NoScriptEnd(),
                         new OlBeg(),
                         new OlEnd(),
                         new PBeg(),
                         new PEnd(),
                         new PreBeg(),
                         new PreEnd(),
                         new Re(),
                         new ScriptBeg(),
                         new ScriptEnd(),
                         new TableBeg(),
                         new TableEnd(),
                         new UlBeg(),
                         new UlEnd());
  }

  default Sense textToken(String text) {
    return new HtmlText(text);
  }
}
