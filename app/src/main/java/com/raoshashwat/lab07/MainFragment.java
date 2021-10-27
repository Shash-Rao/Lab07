package com.raoshashwat.lab07;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class MainFragment extends Fragment
{
    TextView greeting;
    View view;

    public static MainFragment newInstance(int x, String s)
    {
        MainFragment frag = new MainFragment();
        Bundle args = new Bundle();
        args.putInt("Age", x);
        args.putString("Name", s);
        frag.setArguments(args);
        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        int age = this.getArguments().getInt("Age", 1000);
        String name = this.getArguments().getString("Name", "Guy");
        TextView textView = view.findViewById(R.id.frag_textview);
        textView.setText("Hello " + name);
        Button button = view.findViewById(R.id.frag_button);
        button.setText("I am " + age);
    }
}
