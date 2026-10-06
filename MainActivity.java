package com.facialtier.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.content.pm.ActivityInfo;

public class MainActivity extends Activity {
    private WebView web;
    @Override public void onCreate(Bundle b){ super.onCreate(b); setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        web = new WebView(this); setContentView(web);
        WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true); s.setMediaPlaybackRequiresUserGesture(false);
        web.setWebViewClient(new WebViewClient()); web.setWebChromeClient(new WebChromeClient());
        web.loadUrl("file:///android_asset/facialtier/index.html");
    }
    @Override public void onBackPressed(){ if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
