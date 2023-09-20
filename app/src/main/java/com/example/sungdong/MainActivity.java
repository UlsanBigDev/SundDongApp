package com.example.sungdong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et_main_text;
    ImageView iv_main_logoMain;
    Button btn_main_notification, btn_main_toLoginPage, btn_main_openCategory;
    Button btn_main_recommend, btn_main_popular, btn_main_saleItem;
    Button btn_main_toHome, btn_main_basket;
    ScrollView scroll_main_items;
    ImageButton imbtn_main_recommendItem01, imbtn_main_recommendItem02,
                imbtn_main_recommendItem03, imbtn_main_recommendItem04,
                imbtn_main_recommendItem05, imbtn_main_recommendItem06,
                imbtn_main_recommendItem07;
    LinearLayout layout_main_bottom_btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset();
        Toast.makeText(MainActivity.this, "앱을 시작했습니다.", Toast.LENGTH_SHORT).show();

        iv_main_logoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
                Toast.makeText(MainActivity.this, "(로고)메인 액티비티 화면입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_main_toLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_main_toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                Toast.makeText(MainActivity.this, "(처음으로)메인 액티비티 화면입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void reset(){
        et_main_text = findViewById(R.id.et_main_text);
        iv_main_logoMain = findViewById(R.id.iv_main_logoMain);
        btn_main_notification = findViewById(R.id.btn_main_notification);
        btn_main_toLoginPage = findViewById(R.id.btn_main_toLoginPage);
        btn_main_openCategory = findViewById(R.id.btn_main_openCategory);
        btn_main_recommend = findViewById(R.id.btn_main_recommend);
        btn_main_popular = findViewById(R.id.btn_main_popular);
        btn_main_saleItem = findViewById(R.id.btn_main_saleItem);
        btn_main_toHome = findViewById(R.id.btn_main_tohome);
        btn_main_basket = findViewById(R.id.btn_main_basket);
        scroll_main_items = findViewById(R.id.scroll_main_items);
        imbtn_main_recommendItem01 = findViewById(R.id.imbtn_main_recommendItem01);
        imbtn_main_recommendItem02 = findViewById(R.id.imbtn_main_recommendItem02);
        imbtn_main_recommendItem03 = findViewById(R.id.imbtn_main_recommendItem03);
        imbtn_main_recommendItem04 = findViewById(R.id.imbtn_main_recommendItem04);
        imbtn_main_recommendItem05 = findViewById(R.id.imbtn_main_recommendItem05);
        imbtn_main_recommendItem06 = findViewById(R.id.imbtn_main_recommendItem06);
        imbtn_main_recommendItem07 = findViewById(R.id.imbtn_main_recommendItem07);
        layout_main_bottom_btns = findViewById(R.id.layout_main_bottom_btns);
    }
}