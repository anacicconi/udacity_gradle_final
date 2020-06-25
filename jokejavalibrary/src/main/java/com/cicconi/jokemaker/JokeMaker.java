package com.cicconi.jokemaker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JokeMaker {
    private List<String> jokes = Arrays.asList(
        "Why don’t scientists trust atoms? Because they make up everything.",
        "Hear about the new restaurant called Karma? There’s no menu: You get what you deserve.",
        "Did you hear about the claustrophobic astronaut? He just needed a little space.");

    public String makeAJoke() {
        Collections.shuffle(jokes);
        return jokes.get(0);
    }
}
