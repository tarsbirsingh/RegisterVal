package com.example.tarsbir.registerval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, phNumber, password;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name_id);
        email = findViewById(R.id.email_id);

        phNumber = findViewById(R.id.phone_id);
        password = findViewById(R.id.pass_id);
        B1 = findViewById(R.id.register_button);
       B1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (name.getText().toString().isEmpty() || email.getText().toString().isEmpty() || phNumber.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                   Toast.makeText(MainActivity.this, "Fill blank", Toast.LENGTH_SHORT).show();
               } else {
                   String nameStr = name.getText().toString();
                  // String eMailStr = email.getText().toString();
                   //String phnStr = phNumber.getText().toString();
                   Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                   i.putExtra("Name", nameStr);
                  /** i.putExtra("Email", eMailStr);
                   i.putExtra("PhoneNumber", phnStr);**/
                   startActivity(i);
               }
           }

        });
    }
}