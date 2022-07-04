package com.otumian.androidtraininghelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // private final String LOG_TAG = this.getClass().getSimpleName();
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Log.d("MainActivity", "We are in the main activity");
        // Log.w->warning, Log.i -> info, Log.d -> debugging
        // Log.i(LOG_TAG, "This is an informational logging...");

        // Coding challenge: Change the text from "Hello world" to "Happy birthday <someName>"
        Log.d(LOG_TAG,
                "Coding challenge: Change the text from \"Hello world\" to \"Happy birthday <someName>\"");
    }
}