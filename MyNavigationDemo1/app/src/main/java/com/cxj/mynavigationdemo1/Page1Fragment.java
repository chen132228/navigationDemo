package com.cxj.mynavigationdemo1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Page1Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn_page1=view.findViewById(R.id.btn_page1);
        btn_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //调用 Navigation.findNavController(view) 获取与当前视图关联的 NavController 实例。
                // R.id.action_page1Fragment_to_page2Fragment 是导航图中定义的从一个 Fragment1 到Fragment2 的的 ID。
                Navigation.findNavController(view).navigate(R.id.action_page1Fragment_to_page2Fragment);
            }
        });
    }
}