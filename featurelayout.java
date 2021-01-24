package com.technofeild.galaxystore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class featurelayout extends AppCompatActivity {

    TextView hotapp,qualityapp,viewall,chat,inpurchase,adobe,reader,adobepurchase,
            forsamsung,workoutpurchase,vscotext,samsung,vscopurchase;
    ImageView liveme,download,adobeicon,download1,download2,vsco,download3,workouticon;

    SharedPreferences SharePreference;
    databasehelper databasehelper;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.featurelayout);
        SharePreference =getSharedPreferences("userinfo",0);
        ContentValues ContentValues=new ContentValues();
databasehelper=new databasehelper (this);
        hotapp=findViewById(R.id.hotapp);
        qualityapp=findViewById(R.id.qualityapp);
        viewall=findViewById(R.id.viewall);
        chat=findViewById(R.id.chat);
        inpurchase=findViewById(R.id.inpurchase);
        adobe=findViewById(R.id.adobe);
        reader=findViewById(R.id.reader);
        adobepurchase=findViewById(R.id.adobepurchase);
        forsamsung=findViewById(R.id.forsamsung);
        workoutpurchase=findViewById(R.id.workoutpurchase);
        vscotext=findViewById(R.id.vscotext);
        samsung=findViewById(R.id.samsung);
        workouticon=findViewById(R.id.workouticon);
        vscopurchase=findViewById(R.id.vscopurchase);
        liveme=findViewById(R.id.liveme);
        download=findViewById(R.id.download);
        download1=findViewById(R.id.download1);
        download2=findViewById(R.id.download2);
        download3=findViewById(R.id.download3);
        vsco=findViewById(R.id.vsco);
        adobeicon=findViewById(R.id.adobeicon);


        liveme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(featurelayout.this,item.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        adobeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        download1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        download2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        vsco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        download3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
        workouticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues ContentValues=new ContentValues();
                Intent intent=new Intent(featurelayout.this,featurelayout.class);
                Toast.makeText(featurelayout.this,"",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

    }
}
