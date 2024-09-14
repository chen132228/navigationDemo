package com.cxj.mynavigationdemo1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Page2Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /**
         * Page2FragmentArgs：是由目标类Page2Fragment，后面加上“Args”来的，跟navigation文件设置的那样
         */
        String origin = Page2FragmentArgs.fromBundle(getArguments()).getOrigin();
        Log.d("TAG", "Page2Fragment接受到的数据: "+origin);

        Button btn1_page2=view.findViewById(R.id.btn1_page2);
        btn1_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Page2FragmentDirections.ActionPage2FragmentToPage3Fragment action = Page2FragmentDirections.actionPage2FragmentToPage3Fragment();
                action.setOrigin("从Page2页面传递过来的");

                Navigation.findNavController(view).navigate(action);
            }
        });

        Button btn2_page1=view.findViewById(R.id.btn2_page1);
        btn2_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Page2FragmentDirections.ActionPage2FragmentToPage1Fragment action = Page2FragmentDirections.actionPage2FragmentToPage1Fragment();
                action.setOrigin("从Page2页面传递过来的");
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}