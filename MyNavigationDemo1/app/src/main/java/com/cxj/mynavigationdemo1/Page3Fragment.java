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


public class Page3Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String origin = Page3FragmentArgs.fromBundle(getArguments()).getOrigin();
        Log.d("TAG", "Page3Fragment接受到的数据: "+origin);

        Button btn_page3=view.findViewById(R.id.btn_page3);
        btn_page3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Page3FragmentDirections.ActionPage3FragmentToPage2Fragment action = Page3FragmentDirections.actionPage3FragmentToPage2Fragment();
                action.setOrigin("从Page3页面传递过来的");
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}