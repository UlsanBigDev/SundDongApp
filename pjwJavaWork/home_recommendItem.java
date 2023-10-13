
//추천 상품의 fragment입니다.

package net.hananet.bns2.sungdongapplayouttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class home_recommendItem extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View home_recommendItemView = inflater.inflate(R.layout.fragment_home_recommenditem,container,false);
        return home_recommendItemView;
    }
}