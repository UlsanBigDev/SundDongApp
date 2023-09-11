package com.example.sungdong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Private View
    private Button btn_toMainPage;
    private TextView tv_userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_userID = findViewById(R.id.tv_userID);
        btn_toMainPage = findViewById(R.id.btn_toMainPage);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        tv_userID.setText(str);
        btn_toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}