package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefile\\Facebooklogin.feature", 
glue="org.stepdef", monochrome=true)
public class TestRunnerFB {

}
