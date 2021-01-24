package com.technofeild.galaxystore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {
ImageView menu,search;
Button feature,top;
    SharedPreferences SharePreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharePreference =getSharedPreferences("userinfo",0);
        setContentView(R.layout.dashboard);


    }
}
