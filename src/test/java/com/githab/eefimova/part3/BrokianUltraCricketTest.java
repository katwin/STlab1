package com.githab.eefimova.part3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrokianUltraCricketTest {
    private BrokianUltraCricket game;

    @BeforeEach
    void setUp() {
        game = new BrokianUltraCricket();
    }

    @Test
    void hits() {
        int currentHits = game.getHits();
        game.hit();
        int newHits = game.getHits();
        Assertions.assertEquals(currentHits+1, newHits);
    }

    @Test
    void runAway() {
        int currentEscapes = game.getEscapes();
        game.runAway();
        int newEscapes = game.getEscapes();
        Assertions.assertEquals(currentEscapes+1, newEscapes);
    }

}