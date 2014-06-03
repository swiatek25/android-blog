package pl.swiatowy.blog;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created: 2014-05-1914:13
 *
 * @author swiatek25
 */
public class MyWebViewClient extends WebViewClient {

    private final String blogHost;

    public MyWebViewClient(String blogHost) {
        this.blogHost = blogHost;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return !blogHost.equals(Uri.parse(url).getHost());
    }
}
