package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= findViewById(R.id.textView2);
    }

    public void gotoFunction(View v)
    {
        String getName = name.getText().toString();
       Intent intent = new Intent(MainActivity.this, MainActivity2.class);
       intent.putExtra("name", getName);
       startActivity(intent);
    }
}