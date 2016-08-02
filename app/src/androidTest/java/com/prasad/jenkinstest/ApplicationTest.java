package com.prasad.jenkinstest;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/** 
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest  {

    public ApplicationTest(){

    }

    LoginRequest request;
    @Before
    public void createLogHistory() {
        request = new LoginRequest();
    }

    @Test
    public void logHistory_ParcelableWriteRead() {
        request.setUserName("Prasad");
        // Verify that the received data is correct.
        assertThat(request.getUserName(), is("Prasad"));

    }
}