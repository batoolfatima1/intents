package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView heading = findViewById(R.id.textView);
        Intent i = getIntent();
        heading.setText("WELCOME "+i.getStringExtra("name"));

    }

    public void gotoWebsite(View v)
    {
        Uri url = Uri.parse("https://developer.android.com/courses");
        Intent intent2 = new Intent(Intent.ACTION_VIEW, url);
        startActivity(intent2);
    }
    public void dialFunction(View v)
    {
        Intent intent3 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+921345678097"));
        startActivity(intent3);
    }
}