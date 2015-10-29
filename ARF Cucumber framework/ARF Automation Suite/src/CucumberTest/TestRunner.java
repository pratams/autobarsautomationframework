package CucumberTest;

import org.junit.runner.RunWith; /* imports @runwith annotation from Junit class.
It tells JUnit that tests should run using Cucumber class present in �Cucumber.api.junit� package */

import cucumber.api.CucumberOptions;
//This annotation tells Cucumber a lot of things like where to look for feature files, what reporting system etc...

import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"StepDefinition"}
		)

public class TestRunner {

}