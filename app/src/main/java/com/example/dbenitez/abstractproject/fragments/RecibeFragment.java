package com.example.dbenitez.abstractproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.bases.BaseFragment;

/**
 * Created by abautista on 3/13/2018.
 */

public class RecibeFragment  extends BaseFragment{
    TextView textView;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.recide);
        textView.setText(getActivity().getIntent().getExtras().getString("name"));

    }

    @Override
    public int getLayou() {
        return R.layout.activity_recibe;
    }
}
