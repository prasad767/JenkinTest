package com.prasad.jenkinstest.suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.prasad.jenkinstest.ApplicationTest;

// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({ApplicationTest.class
      })
public class UnitTestSuite {
}
