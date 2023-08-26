package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinitionclass")

public class SampleRunnerClass {

	
	public WebDriver driver;
	@AfterClass
	public  void tc1(Scenario d) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] s = ts.getScreenshotAs(OutputType.BYTES);
		d.embed(s, "image/png");

	}
	
	
	
	
	
	
	
}
