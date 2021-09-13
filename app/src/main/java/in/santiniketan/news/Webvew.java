package in.santiniketan.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webvew extends AppCompatActivity {
  Toolbar toolbar;
  WebView webvew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webvew);

        toolbar = findViewById(R.id.toolbar);
        webvew = findViewById(R.id.webview);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webvew.setWebViewClient(new WebViewClient());
        webvew.loadUrl(url);

    }
}