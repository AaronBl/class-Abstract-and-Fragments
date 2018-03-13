package com.example.dbenitez.abstractproject.activitys;

import android.os.Bundle;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.bases.BaseActivity;
import com.example.dbenitez.abstractproject.fragments.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_base,new MainFragment())
                .commit();

    }
}
