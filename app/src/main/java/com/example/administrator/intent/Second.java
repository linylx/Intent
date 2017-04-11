package com.example.administrator.intent;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Second extends Activity {
    WebView webView;
    String second_url;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Bundle bundle = this.getIntent().getExtras();
        second_url =bundle.getString("URL");
        init();
    }
    private void init(){
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(second_url);
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }
}
