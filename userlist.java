package com.technofeild.galaxystore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class userlist extends AppCompatActivity {
    databasehelper databasehelper;
    LinearLayout container;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        databasehelper = new databasehelper(this);
        container = findViewById(R.id.container);
        textView = findViewById(R.id.livemevideo);
        displayApps();
    }

    public void displayApps() {
        ArrayList<userinfo> list = databasehelper.getApplist();

        for (userinfo info : list) {
            View view = LayoutInflater.from(this).inflate(R.layout.item_layout, null);
            TextView liveme = view.findViewById(R.id.chat);
            TextView livevdo = view.findViewById(R.id.livemevideo);
            TextView inpurchase = view.findViewById(R.id.inpurchase);
            ImageView image = view.findViewById(R.id.liveme);

            liveme.setText(info.liveme);
            livevdo.setText(info.livevdo);
            inpurchase.setText(info.inpurchase);
//            image.setImageBitmap();
            container.addView(view);
        }

    }
}
