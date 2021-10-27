package com.raoshashwat.lab07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, MainFragment.newInstance(50, "Mr. Guy"), "MainFragment");
        ft.commit();
    }

    public void update_greeting(View view)
    {
        MainFragment frag = (MainFragment)getSupportFragmentManager().findFragmentByTag("MainFragment");
        //((TextView)frag.view.findViewById(R.id.frag_textview)).setText("How are you?");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, MainFragment.newInstance(20, "How are you?"), "OtherFragment");
        ft.commit();
    }
}