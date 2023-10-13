package com.example.sungdong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        reset();

        Toast.makeText(LoginActivity.this, "로그인 페이지 입니다.", Toast.LENGTH_SHORT).show();

        // 로그인 창에서 다시 메인페이지로 넘어가는 버튼
        btn_login_toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "로그인 화면 -> 메인화면", Toast.LENGTH_SHORT).show();
            }
        });

        // 로그인
        btn_login_selectLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 입력된 아이디와 비밀번호 가져오기
                String inputID = et_login_inputID.getText().toString();
                String inputPW = et_login_inputPW.getText().toString();

                // 아이디 1234 비밀번호 1234 - 나중에 로그인 구현 해야함.
                if (inputID.equals("1234") && inputPW.equals("1234")) {
                    // 로그인 성공 시 HomeActivity로 이동
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "(주)성동물산 님 환영합니다.", Toast.LENGTH_SHORT).show();
                } else if (inputID.equals("1234") && !inputPW.equals("1234")) {
                    et_login_inputPW.setText("");
                    Toast.makeText(LoginActivity.this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                } else if (!inputID.equals("1234")) {
                    et_login_inputID.setText("");
                    et_login_inputPW.setText("");
                    Toast.makeText(LoginActivity.this, "등록된 아이디가 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    et_login_inputID.setText("");
                    et_login_inputPW.setText("");
                    Toast.makeText(LoginActivity.this, "회원정보를 다시 확인해 주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void reset() {
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
    }
}