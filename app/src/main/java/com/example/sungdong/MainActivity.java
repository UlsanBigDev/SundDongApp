package com.example.sungdong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout_main_relativeLayout;
    EditText et_main_text;
    ImageView iv_main_logoMain;
    Button btn_main_notification, btn_main_toLoginPage, btn_main_openCategory, btn_close;
    TextView tv_drawer;
    DrawerLayout drawer;
//    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_main_relativeLayout = findViewById(R.id.layout_main_relativeLayout);
        et_main_text = findViewById(R.id.et_main_text); // 초기화만 한거
        iv_main_logoMain = findViewById(R.id.iv_main_logoMain);
        btn_main_notification = findViewById(R.id.btn_main_notification); // 초기화만 한거
        btn_main_toLoginPage = findViewById(R.id.btn_main_toLoginPage); // 초기화만 한거

        btn_main_openCategory = findViewById(R.id.btn_main_openCategory);
        btn_close = findViewById(R.id.btn_close);

        tv_drawer = findViewById(R.id.tv_drawer);

        drawer = findViewById(R.id.drawer);

        iv_main_logoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "메인 액티비티 화면입니다.", Toast.LENGTH_SHORT).show();
            }
        });
        btn_main_toLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_main_openCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!drawer.isDrawerOpen(Gravity.LEFT)){
                    drawer.openDrawer(Gravity.LEFT);
                    layout_main_relativeLayout.setVisibility(View.GONE);
                }
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawer.isDrawerOpen(Gravity.LEFT)){
                    drawer.closeDrawers();
                    layout_main_relativeLayout.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}