package org.runnerclass;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinitionclass")

public class SampleRunnerClass {
@Test
private void tc1() {
	// TODO Auto-generated method stub
System.out.println("hi");
}
}
