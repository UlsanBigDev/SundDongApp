package com.example.sungdong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private View view_main_parent;
    private View view_main_search;
    private EditText et_main_text;
    private ImageView iv_main_logoMain;
    private Button btn_main_notification;
    private Button btn_main_toLoginPage;
    private Button btn_main_category;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_main_parent = findViewById(R.id.view_main_parent);
        view_main_search = findViewById(R.id.view_main_search);
        et_main_text = findViewById(R.id.et_main_text);
        iv_main_logoMain = findViewById(R.id.iv_main_logoMain);
        btn_main_notification= findViewById(R.id.btn_main_notification);
        btn_main_toLoginPage = findViewById(R.id.btn_main_toLoginPage);
        btn_main_category= findViewById(R.id.btn_main_category);

        iv_main_logoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_main_toLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_main_text.getText().toString();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });
    }
}