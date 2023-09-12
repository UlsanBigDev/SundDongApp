package com.example.sungdong;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout_main;
    NavigationView navigationView;

    private View view_main_parent;
    private View view_main_search;
    private EditText et_main_text;
    private ImageView iv_main_logoMain;
    private Button btn_main_notification;
    private Button btn_main_toLoginPage;
    private Button btn_main_category;
    private Button btn_main_categoryLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "메인 액티비티입니다.", Toast.LENGTH_SHORT).show();

        view_main_parent = findViewById(R.id.view_main_parent);
        view_main_search = findViewById(R.id.view_main_search);
        et_main_text = findViewById(R.id.et_main_text);
        iv_main_logoMain = findViewById(R.id.iv_main_logoMain);
        btn_main_notification = findViewById(R.id.btn_main_notification);
        btn_main_toLoginPage = findViewById(R.id.btn_main_toLoginPage);
        btn_main_category = findViewById(R.id.btn_main_category);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 이거 왼쪽 상단버튼 만드는거
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_launcher_background);

        drawerLayout_main = findViewById(R.id.drawerLayout_main);
        navigationView = findViewById(R.id.navigation_view);

        iv_main_logoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_main_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout_main != null) {
                    drawerLayout_main.openDrawer(GravityCompat.START);
                }
                Toast.makeText(MainActivity.this, "메인 카테고리 버튼을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_main_toLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:{
                drawerLayout_main.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
        if (drawerLayout_main.isDrawerOpen(GravityCompat.START)){
            drawerLayout_main.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}