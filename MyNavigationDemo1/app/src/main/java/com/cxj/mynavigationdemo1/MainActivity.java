package com.cxj.mynavigationdemo1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.nav_view);

        //1.获取布局文件中的NavHostFragment实例，该实例用于承载导航图定义的fragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        //2.通过 NavHostFragment 获取 NavController 实例，它用于管理导航操作。
        NavController navController = navHostFragment.getNavController();

        //3.将 BottomNavigationView 与 NavController 关联起来。这样，当用户在底部导航视图中选择不同的菜单项时，NavController 会根据选择执行相应的导航操作。
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }
}