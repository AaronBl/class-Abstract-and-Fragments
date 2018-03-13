package com.example.dbenitez.abstractproject.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.bases.BaseFragment;

/**
 * Created by abautista on 3/13/2018.
 */

public class MainFragment extends BaseFragment {


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String name2 = name;
    }

    @Override
    public int getLayou() {
        return R.layout.fragment_main;
    }
}
