package com.cicconi.jokeandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke_android_library);

        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView tvJoke = findViewById(R.id.tv_joke_from_java_library);
            tvJoke.setText(joke);
        }
    }
}
