package com.example.student.day02_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSoju, btnMakuly, btnBeer, btnWhiskey, btnVodka, btnWine;
    private ImageButton iBtnHome, iBtnCart, iBtnBill, iBtnCal;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();
    }

    public void makeUi() {
        btnSoju = findViewById(R.id.btnSoju);
        btnMakuly = findViewById(R.id.btnMakuly);
        btnBeer = findViewById(R.id.btnBeer);
        btnWhiskey = findViewById(R.id.btnWhiskey);
        btnVodka = findViewById(R.id.btnVodka);
        btnWine = findViewById(R.id.btnWine);
        iBtnHome = findViewById(R.id.iBtnHome);
        iBtnCart = findViewById(R.id.iBtnCart);
        iBtnBill = findViewById(R.id.iBtnBill);
        iBtnCal = findViewById(R.id.iBtnCal);
        webView = findViewById(R.id.webView);

        btnSoju.setOnClickListener(this);
        btnMakuly.setOnClickListener(this);
        btnBeer.setOnClickListener(this);
        btnWhiskey.setOnClickListener(this);
        btnVodka.setOnClickListener(this);
        btnWine.setOnClickListener(this);
        iBtnHome.setOnClickListener(this);
        iBtnCart.setOnClickListener(this);
        iBtnBill.setOnClickListener(this);
        iBtnCal.setOnClickListener(this);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSet = webView.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String url = "http://";
        String ip = "70.12.240.64/";
        url += ip;

        if (v.getId() == R.id.btnSoju){
            url += "alcohol/shop.alc?sec=bg_soju";
        }else if(v.getId() == R.id.btnMakuly){
            url += "alcohol/shop.alc?sec=bg_makuly";
        }else if(v.getId() == R.id.btnBeer){
            url += "alcohol/shop.alc?sec=bg_beer";
        }else if(v.getId() == R.id.btnWhiskey){
            url += "alcohol/shop.alc?sec=bg_whiskey";
        }else if(v.getId() == R.id.btnVodka){
            url += "alcohol/shop.alc?sec=bg_vodka";
        }else if(v.getId() == R.id.btnWine){
            url += "alcohol/shop.alc?sec=bg_wine";
        }else if(v.getId() == R.id.iBtnHome){
            url += "alcohol/main.alc";
        }else if(v.getId() == R.id.iBtnCart){
            url += "alcohol/view/order.jsp";
        }else if(v.getId() == R.id.iBtnBill){
            url += "alcohol/view/checkout.jsp";
        }else if(v.getId() == R.id.iBtnCal){
            url += "alcohol/view/payment.jsp";
        }

        webView.loadUrl(url);

    }
}
