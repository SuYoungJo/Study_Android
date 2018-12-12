package com.example.student.day02_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnMove, btnPre;
    private EditText edtURL;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();
    }

    public void makeUi() {
        edtURL = findViewById(R.id.edtURL);
        btnMove = findViewById(R.id.btnMove);
        btnPre = findViewById(R.id.btnPre);
        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        WebSettings webSet = webView.getSettings(); // WebView의 setting을 담당.
        webSet.setBuiltInZoomControls(true); //줌 허용
        webSet.setJavaScriptEnabled(true); //자바스크립트 허용 필수!!

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://" + edtURL.getText().toString();
                webView.loadUrl(url);
            }
        });

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.goBack();
            }
        });
    }
}
