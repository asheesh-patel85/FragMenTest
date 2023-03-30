package com.example.fragmentest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 f=new Fragment1();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.frameLayout,f);
        ft.commit();
    }
            private void loadFragment(Fragment fragment) {

               /* FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.frameLayout,fragment);
                ft.commit();*/

            }

    }
