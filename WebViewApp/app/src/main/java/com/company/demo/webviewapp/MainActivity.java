package com.company.demo.webviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webViewId);

        WebSettings webSettings = webView.getSettings();
        //enable javascript
        webSettings.setJavaScriptEnabled(true);
        //enable client
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://nub.ac.bd/");
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
