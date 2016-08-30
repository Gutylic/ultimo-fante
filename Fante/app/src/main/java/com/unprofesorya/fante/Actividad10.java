package com.unprofesorya.fante;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Actividad10 extends AppCompatActivity {

    WebView webView;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad10);

        pref = getSharedPreferences("Datos", Context.MODE_PRIVATE);

        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.xelados.net/mercapago.aspx?usuario=" + pref.getString("dato4",""));

        //habilitamos javascript y el zoom
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }
        });
    }
}
