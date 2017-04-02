package com.example.saraegli.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the "Compass"-button */
    public void openCompass(View view) {
        Log.d("Intent to start compass", ".");
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);
    }

    /** Called when the user taps the "Values"-button */
    public void openValues(View view) {
        Log.d("Intent to start values", ".");
        Intent intent = new Intent(this, Values.class);
        startActivity(intent);
    }
}
