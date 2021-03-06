package com.technofeild.galaxystore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class item extends AppCompatActivity {
    EditText chat, inpurchase, livevdo;
    ImageView image;
    databasehelper databasehelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);
        chat = findViewById(R.id.chat);
        inpurchase = findViewById(R.id.inpurchase);
        livevdo = findViewById(R.id.livevdo);
        databasehelper = new databasehelper(this);
        image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 7);
            }
        });

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chat", chat.getText().toString());
                contentValues.put("livevdo", livevdo.getText().toString());
                contentValues.put("inpurchase", inpurchase.getText().toString());

                databasehelper.insertuser(contentValues);
                Toast.makeText(item.this, "item added", Toast.LENGTH_SHORT).show();
            }
        });

    }

}