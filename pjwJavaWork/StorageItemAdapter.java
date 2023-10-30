package net.hananet.bns2.sungdongrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StorageItemAdapter extends RecyclerView.Adapter<StorageItemAdapter.StorageItemViewHolder> {
    private List<StorageItem> storageItems; // 데이터 목록을 저장하는 리스트
    private Context context;

    // 생성자: 데이터 목록과 컨텍스트를 어댑터에 전달
    public StorageItemAdapter(List<StorageItem> storageItems, Context context) {
        this.storageItems = storageItems; // 데이터 목록 초기화
        this.context = context; // 컨텍스트 초기화
    }

    @NonNull
    @Override
    public StorageItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 레이아웃을 인플레이트하여 ViewHolder를 생성
        View view = LayoutInflater.from(context).inflate(R.layout.storage_item, parent, false);
        return new StorageItemViewHolder(view); // 새로운 ViewHolder 반환
    }

    @Override
    public void onBindViewHolder(@NonNull StorageItemViewHolder holder, int position) {
        StorageItem storageItem = storageItems.get(position); // 현재 위치에 해당하는 데이터 아이템 가져옴

        // ViewHolder의 뷰에 데이터를 바인딩
        holder.tvTitle.setText(storageItem.getTitle());
        holder.tvNum.setText("물품 개수: " + storageItem.getNum());
        holder.tvCreator.setText("생성자: " + storageItem.getCreator());
        holder.tvDetail.setText(storageItem.getDetail());
        holder.cbCheckBox.setChecked(storageItem.isChecked());
    }

    @Override
    public int getItemCount() {
        return storageItems.size();
        // 데이터 목록의 크기를 반환하면 RecyclerView는 몇 개의 아이템이 있는지 알 수 있음
    }

    public class StorageItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle, tvNum, tvCreator, tvDetail; // 레이아웃 내부의 TextView들
        public CheckBox cbCheckBox; // 레이아웃 내부의 CheckBox

        public StorageItemViewHolder(@NonNull View itemView) {
            super(itemView);

            // ViewHolder의 뷰들을 레이아웃에서 찾아서 초기화
            tvTitle = itemView.findViewById(R.id.tv_storage_itemTitle);
            tvNum = itemView.findViewById(R.id.tv_storage_itemNum);
            tvCreator = itemView.findViewById(R.id.tv_storage_itemCreator);
            tvDetail = itemView.findViewById(R.id.tv_storage_itemDetail);
            cbCheckBox = itemView.findViewById(R.id.cb_storate_itemcheckBox);
        }
    }
}
