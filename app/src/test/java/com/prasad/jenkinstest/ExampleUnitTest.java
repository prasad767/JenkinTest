package com.prasad.jenkinstest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void add() throws Exception {
        assertEquals(4, Utils.addNumber(2,2));
    }

    @Test
    public void sub() throws Exception {
        assertEquals(0, Utils.subNumber(2,2));
    }
}