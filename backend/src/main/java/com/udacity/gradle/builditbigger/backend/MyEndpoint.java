package com.udacity.gradle.builditbigger.backend;

import com.cicconi.jokemaker.JokeMaker;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that tells a joke got from the joke java library */
    @ApiMethod(name = "tellAJoke")
    public MyBean tellAJoke() {
        MyBean response = new MyBean();
        JokeMaker jokeMaker = new JokeMaker();
        response.setData("The joke maker said: " + jokeMaker.makeAJoke());

        return response;
    }

}
