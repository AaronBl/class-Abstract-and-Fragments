package com.example.dbenitez.abstractproject.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.bases.BaseActivity;
import com.example.dbenitez.abstractproject.fragments.RecibeFragment;

public class RecibeActivity extends BaseActivity {
RecibeFragment recibeFragment;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Fragment getFragment() {
        return recibeFragment = new RecibeFragment();
    }

}
