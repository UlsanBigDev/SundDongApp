package com.example.sungdong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private View view_login_parent;
    private Button btn_login_toMainPage;
    private TextView tv_login_text;
    private ImageView iv_sub_logoMain;
    private EditText et_login_inputID;
    private EditText et_login_inputPW;
    private CheckBox cb_login_autoLogin;
    private CheckBox cb_login_saveID;
    private Button btn_login_selectLogin;
    private Button btn_login_findID;
    private Button btn_login_findPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login_toMainPage = findViewById(R.id.btn_login_toMainPage);
        tv_login_text = findViewById(R.id.tv_login_text);
        iv_sub_logoMain = findViewById(R.id.iv_sub_logoMain);
        et_login_inputID = findViewById(R.id.et_login_inputID);
        et_login_inputPW = findViewById(R.id.et_login_inputPW);
        cb_login_autoLogin = findViewById(R.id.cb_login_autoLogin);
        cb_login_saveID = findViewById(R.id.cb_login_saveID);
        btn_login_selectLogin = findViewById(R.id.btn_login_selectLogin);
        btn_login_findID = findViewById(R.id.btn_login_findID);
        btn_login_findPW = findViewById(R.id.btn_login_findPW);

        btn_login_toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}