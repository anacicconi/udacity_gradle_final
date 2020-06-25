package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.cicconi.jokemaker.JokeMaker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJokeDirectlyFromTheJokeMaker(View view) {
        JokeMaker jokeMaker = new JokeMaker();
        //Toast.makeText(this, jokeMaker.makeAJoke(), Toast.LENGTH_SHORT).show();
        Intent startChildActivityIntent = new Intent(this, com.cicconi.jokeandroidlibrary.MainActivity.class);
        startChildActivityIntent.putExtra(Intent.EXTRA_TEXT, jokeMaker.makeAJoke());
        startActivity(startChildActivityIntent);
    }

    public void tellJokeFromBackend(View view) {
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, ""));
    }
}
