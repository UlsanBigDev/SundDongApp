package com.example.sungdong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    private EditText et_main_text; // 나중에 구현
    private ImageView iv_main_logoMain;
    private Button btn_main_notification, btn_main_toLoginPage, btn_main_category, btn_category_closeCategory;
    DrawerLayout category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "메인 액티비티입니다.", Toast.LENGTH_SHORT).show();

        et_main_text = findViewById(R.id.et_main_text);
        iv_main_logoMain = findViewById(R.id.iv_main_logoMain);
        btn_main_notification = findViewById(R.id.btn_main_notification);
        btn_main_toLoginPage = findViewById(R.id.btn_main_toLoginPage);
        category = findViewById(R.id.category);
        btn_main_category = findViewById(R.id.btn_main_category);
        btn_category_closeCategory = findViewById(R.id.btn_category_closeCategory);

        iv_main_logoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_main_toLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_main_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!category.isDrawerOpen(Gravity.LEFT)){
                    category.openDrawer(Gravity.LEFT);
                }
            }
        });
        btn_category_closeCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (category.isDrawerOpen(Gravity.LEFT)){
                    category.closeDrawers();
                }
            }
        });
    }
}