
//인기 상품의 프래그먼트입니다 . 

package net.hananet.bns2.sungdongapplayouttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class home_popularItem extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View home_popularItemView = inflater.inflate(R.layout.fragment_home_popular_item,container,false);
        return home_popularItemView ;

    }
}