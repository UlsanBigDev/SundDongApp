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
import androidx.appcompat.widget.Toolbar; // toolbar import 이걸로 해야댐 자동설정하면 오류 뜸
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    private View view_home_parent;
    private View view_home_search;
    private EditText et_home_text;
    private ImageView iv_home_logoMain;
    private Button btn_home_notification;
    private Button btn_home_toLoginPage;
    private Button btn_home_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        view_home_parent = findViewById(R.id.view_home_parent);
        view_home_search = findViewById(R.id.view_home_search);
        et_home_text = findViewById(R.id.et_home_text);
        iv_home_logoMain = findViewById(R.id.iv_home_logoMain);
        btn_home_notification= findViewById(R.id.btn_home_notification);
        btn_home_toLoginPage = findViewById(R.id.btn_home_toLoginPage);
        btn_home_category= findViewById(R.id.btn_home_category);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 이거 왼쪽 상단버튼 만드는거
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_launcher_background);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        iv_home_logoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btn_home_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout != null) {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
                Toast.makeText(HomeActivity.this, "카테고리 버튼을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_home_toLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        //
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:{
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}