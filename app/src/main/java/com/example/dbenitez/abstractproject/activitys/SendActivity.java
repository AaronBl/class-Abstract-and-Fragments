package com.example.dbenitez.abstractproject.activitys;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dbenitez.abstractproject.R;
import com.example.dbenitez.abstractproject.bases.BaseActivity;
import com.example.dbenitez.abstractproject.fragments.SendFragment;

public class SendActivity extends BaseActivity {
SendFragment sendFragment;

    @Override
    public Fragment getFragment() {
        return sendFragment = new SendFragment();
    }

}
