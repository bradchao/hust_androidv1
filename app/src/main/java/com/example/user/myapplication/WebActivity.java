package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    private WebView webView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        url = intent.getStringExtra("url");

        webView = (WebView)findViewById(R.id.webView);
        initWebView();

    }

    private void initWebView(){
        webView.setWebViewClient(new WebViewClient());
        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);

        webView.loadUrl(url);
    }


}
