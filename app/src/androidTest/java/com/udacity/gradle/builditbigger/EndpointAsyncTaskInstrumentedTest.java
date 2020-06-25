package com.udacity.gradle.builditbigger;

import android.util.Pair;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4ClassRunner.class) public class EndpointAsyncTaskInstrumentedTest {

    @Test
    public void asyncTaskShouldReturnAJoke() {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String result = task.doInBackground(Pair.create(InstrumentationRegistry.getInstrumentation().getTargetContext(), ""));

        assertEquals("bla", result);
    }
}
