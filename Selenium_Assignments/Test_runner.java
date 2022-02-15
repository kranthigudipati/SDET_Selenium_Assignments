package sdet.assignment.selenium;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = false,	
features = "FeatureFiles\\1617And18.feature",
tags={"@Regression"},
monochrome = true ,
glue={"com.stepDefination"}) 



public class Test_runner extends AbstractTestNGCucumberTests {


}
