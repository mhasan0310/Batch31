package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./FeatureFiles/GreenKart.feature",
		glue = {"com.steps"},
		//tags = "@greenKart", 
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome= true
		)
public class GreenKartRunnerFile {

}

