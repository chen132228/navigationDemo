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

        String origin = Page1FragmentArgs.fromBundle(getArguments()).getOrigin();
        Log.d("TAG", "Page1Fragment接受到的数据: "+origin);

        Button btn_page1=view.findViewById(R.id.btn_page1);
        btn_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 *  Page1FragmentDirections :是根据当前所操作的类Page1Fragment，然后在源目的地的名称后面加上“Directions”。
                 *  actionPage1FragmentToPage2Fragment :是navigation文件对应的action的id
                  */
                Page1FragmentDirections.ActionPage1FragmentToPage2Fragment action = Page1FragmentDirections.actionPage1FragmentToPage2Fragment();
                action.setOrigin("从Page1页面传递过来的");

                //navigate 方法会处理从当前 Fragment 到目标 Fragment 的过渡，包括任何定义的过渡动画，并且会携带 action 对象中设置的参数。
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}