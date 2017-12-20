package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String hostname =
            "https://shop.wangzhengyao.idv.tw/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoAccount(View view){
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", hostname +
                "my-account/edit-account/");
        startActivity(intent);
    }
    public void gotoProduct(View view){
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", hostname +
                "shop/");
        startActivity(intent);
    }

}
