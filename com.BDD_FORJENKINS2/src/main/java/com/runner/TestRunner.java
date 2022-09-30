package com.runner;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)//run class with cucumber
@CucumberOptions(						//This is cumber option.
		features="src/main/java/com/features",
		glue="com.stepdefs",
		dryRun=false,//It is used to compile feature file.
		monochrome=true,//for readable output
		plugin="html:target",//for report genration.
		tags="@jbk"// tags are use to run specific scenario.	And also for whole features file.	
		)
public class TestRunner {
	
	
}
