package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Abishek\\eclipse-workspace\\Cucumber_Jan\\src\\test\\java\\com\\app\\"+
"stepdefinition\\testcases-demoqa.feature",glue= {"com.app.stepdefinition"},dryRun=false,monochrome=true,publish=false,tags="@aslist")
public class Runner {
	
	

}
