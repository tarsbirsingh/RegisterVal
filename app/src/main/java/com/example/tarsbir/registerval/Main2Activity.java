package com.example.tarsbir.registerval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        if (i.hasExtra("Name")) {
            EditText t1 = findViewById(R.id.name_view);
            t1.setText(i.getStringExtra("Name"));
        }
    }
}
