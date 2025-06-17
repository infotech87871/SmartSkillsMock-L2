package org.testrunnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "C:\\Users\\UsEr\\eclipse-workspace_01\\SmartSkillsMockL2\\src\\test\\resources\\Feature File\\FeatureFile.feature",
				 glue = "org.stepdefinitionfile"
		        )
public class TestRunnerClass {

	
	
}
