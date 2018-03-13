package com.example.dbenitez.abstractproject.activitys;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.bases.BaseActivity;
import com.example.dbenitez.abstractproject.fragments.MainFragment;

public class MainActivity extends BaseActivity {
MainFragment mainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public Fragment getFragment() {
        mainFragment = new MainFragment();
        return mainFragment;
    }
}
