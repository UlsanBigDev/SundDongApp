
//보관함 스크립트OnCreate에 아래 코드를 추가하고 필요한 부분을 import 해주세요.
//리사이클러 뷰 동작을 위해 임의의 데이터를 넣어뒀습니다.

package net.hananet.bns2.sungdongrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Storage extends AppCompatActivity {

    private RecyclerView recyclerView_StorageItem;
    private StorageItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_storage);


        recyclerView_StorageItem = findViewById(R.id.recyclerView_storage_items);
        //리사이클러뷰에 레이아웃 매니저 설정
        recyclerView_StorageItem.setLayoutManager(new LinearLayoutManager(this));

        // StorageItem 데이터 목록 생성 (앞서 설명한대로)
        List<StorageItem> storageItemList = new ArrayList<>();
        storageItemList.add(new StorageItem("보관함 1", 10, "생성자1", "보관함 내용1", false));
        storageItemList.add(new StorageItem("보관함 2", 5, "생성자2", "보관함 내용2", true));
        // 다른 StorageItem 항목들을 추가

        // 어댑터 초기화
        adapter = new StorageItemAdapter(storageItemList, this);

        recyclerView_StorageItem.setAdapter(adapter);
    }




}
