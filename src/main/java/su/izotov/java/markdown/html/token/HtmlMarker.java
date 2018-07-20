package su.izotov.java.markdown.html.token;

import su.izotov.java.objectlr.token.Marker;

/**
 * Created with IntelliJ IDEA.
 * @author Vladimir Izotov
 * @version $Id$
 * @since 1.0
 */
public interface HtmlMarker
    extends Marker {
  HtmlToken concatTo(HtmlText htmlText);
}
