package com.example.sungdong;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeMypageActivity extends AppCompatActivity {

    TextView tv_homeMypage_toolbarText, tv_homeMypage_toolbarText2, tv_homeMypage_toolbarText3, tv_homeMypage_toolbarText4;
    Button btn_homeMypage_toHome, button2, button3, btn_homeMypage_orderInquery,
            btn_homeMypage_deliveryInquery, btn_homeMypage_historyInquery,
            btn_homeMypage_ledgerInquery, btn_homeMypage_returnRequest,
            btn_homeMypage_returnInquery, btn_homeMypage_exchangeInquery,
            btn_homeMypage_asRequest, btn_homeMypage_asInquery,
            btn_homeMypage_settingAlert, btn_homeMypage_modifyInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_mypage);

        btn_homeMypage_toHome = findViewById(R.id.btn_homeMypage_toHome);

        btn_homeMypage_toHome.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(HomeMypageActivity.this, HomeActivity.class);
            startActivity(intent);
        });


    }
}