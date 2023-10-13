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

public class HomeActivity extends AppCompatActivity {

    EditText et_home_text;
    ImageView iv_home_logoHome;
    Button btn_home_notification, btn_home_toMyPage, btn_home_openCategory;
    Button btn_home_recommend, btn_home_popular, btn_home_saleItem;
    Button btn_home_toHome, btn_home_basket;
    ScrollView scroll_home_items;
    ImageButton imbtn_home_recommendItem01, imbtn_home_recommendItem02,
            imbtn_home_recommendItem03, imbtn_home_recommendItem04,
            imbtn_home_recommendItem05, imbtn_home_recommendItem06,
            imbtn_home_recommendItem07;
    LinearLayout layout_home_bottom_btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        reset();
        Toast.makeText(HomeActivity.this, "홈 액티비티 입니다.", Toast.LENGTH_SHORT).show();

        iv_home_logoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
                Toast.makeText(HomeActivity.this, "홈액티비티 화면입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_home_toMyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeMypageActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "마이페이지 기능 추가해야함", Toast.LENGTH_SHORT).show();
            }
        });

        btn_home_toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                Toast.makeText(HomeActivity.this, "홈액티비티 화면입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_home_basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "장바구니 기능 추가해야함", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void reset(){
        et_home_text = findViewById(R.id.et_home_text);
        iv_home_logoHome = findViewById(R.id.iv_home_logoHome);
        btn_home_notification = findViewById(R.id.btn_home_notification);
        btn_home_toMyPage = findViewById(R.id.btn_home_toMyPage);
        btn_home_openCategory = findViewById(R.id.btn_home_openCategory);
        btn_home_recommend = findViewById(R.id.btn_home_recommend);
        btn_home_popular = findViewById(R.id.btn_home_popular);
        btn_home_saleItem = findViewById(R.id.btn_home_saleItem);
        btn_home_toHome = findViewById(R.id.btn_home_toHome);
        btn_home_basket = findViewById(R.id.btn_home_basket);
        scroll_home_items = findViewById(R.id.scroll_home_items);
        imbtn_home_recommendItem01 = findViewById(R.id.imbtn_home_recommendItem01);
        imbtn_home_recommendItem02 = findViewById(R.id.imbtn_home_recommendItem02);
        imbtn_home_recommendItem03 = findViewById(R.id.imbtn_home_recommendItem03);
        imbtn_home_recommendItem04 = findViewById(R.id.imbtn_home_recommendItem04);
        imbtn_home_recommendItem05 = findViewById(R.id.imbtn_home_recommendItem05);
        imbtn_home_recommendItem06 = findViewById(R.id.imbtn_home_recommendItem06);
        imbtn_home_recommendItem07 = findViewById(R.id.imbtn_home_recommendItem07);
        layout_home_bottom_btns = findViewById(R.id.layout_home_bottom_btns);
    }
}