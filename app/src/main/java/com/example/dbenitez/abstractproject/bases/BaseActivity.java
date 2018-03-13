package com.example.dbenitez.abstractproject.bases;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dbenitez.abstractproject.R;

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_base, getFragment()).commit();
    }

    public abstract Fragment getFragment();

}
