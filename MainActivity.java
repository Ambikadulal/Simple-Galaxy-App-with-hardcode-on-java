 package com.technofeild.galaxystore;

 import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

   public class MainActivity extends AppCompatActivity implements Runnable {
    ImageView menu, search;
    Button feature, top;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        menu = findViewById(R.id.menu);
        search = findViewById(R.id.search);
        feature = findViewById(R.id.feature);
        top = findViewById(R.id.top);

        feature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddAppActivity.class);
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, userlist.class);
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    @Override
    public void run() {

    }
}

//                    layout.setBackgroundResource(image[i]);










