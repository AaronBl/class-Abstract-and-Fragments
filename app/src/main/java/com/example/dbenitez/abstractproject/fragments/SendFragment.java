package com.example.dbenitez.abstractproject.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.activitys.RecibeActivity;
import com.example.dbenitez.abstractproject.bases.BaseFragment;

/**
 * Created by abautista on 3/13/2018.
 */

public class SendFragment extends BaseFragment {
EditText editText;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.btn_send);
        editText = view.findViewById(R.id.etName);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RecibeActivity.class);
                intent.putExtra("name",editText.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    public int getLayou() {
        return R.layout.activity_send;
    }
}
