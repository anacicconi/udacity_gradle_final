package com.udacity.gradle.builditbigger;

import android.util.Pair;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

@RunWith(AndroidJUnit4ClassRunner.class) public class EndpointAsyncTaskInstrumentedTest {

    @Test
    public void asyncTaskShouldReturnAJoke() {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String result = task.doInBackground(Pair.create(InstrumentationRegistry.getInstrumentation().getTargetContext(), ""));

        List<String> jokes = Arrays.asList(
            "The joke maker said: Why don’t scientists trust atoms? Because they make up everything.",
            "The joke maker said: Hear about the new restaurant called Karma? There’s no menu: You get what you deserve.",
            "The joke maker said: Did you hear about the claustrophobic astronaut? He just needed a little space.");

        assertThat(jokes, hasItem(result));
    }
}
